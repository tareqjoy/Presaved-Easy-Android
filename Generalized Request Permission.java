    
    
    if(isPermissionGranted(Manifest.permission.READ_EXTERNAL_STORAGE, REQ_IMG_READ)){
      //already granted, do stuff
    }
    
    
    
    public boolean isPermissionGranted(String permission, final int REQ_CODE) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (getActivity().checkSelfPermission(permission)
                    == PackageManager.PERMISSION_GRANTED) {
                // Log.v(TAG,"Permission is granted1");
                return true;
            } else {

                //  Log.v(TAG,"Permission is revoked1");
                ActivityCompat.requestPermissions(getActivity(), new String[]{permission}, REQ_CODE);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            // Log.v(TAG,"Permission is granted1");
            return true;
        }
    }
    
    
    
    
    
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQ_IMG_READ:

                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //yay! granted

                } else {
                    //     not granted, oops
                }
                break;


        }
    }
    
