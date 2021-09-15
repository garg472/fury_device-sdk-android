package com.mercadolibre.android.device.sdk.domain;


import java.io.Serializable;
import java.util.ArrayList;

/**
 * Fingerprint represents the inner object of Device.
 *
 */
@SuppressWarnings({
        "unused",
        "PMD.SingularField"
})
public class Fingerprint implements Serializable {

    private static final long serialVersionUID = 1L;

    public ArrayList<VendorId> vendorIds = new ArrayList<>();
    public String model;
    public String os;
    public String systemVersion;
    public String resolution;
    public Long ram;
    public long diskSpace;
    public long freeDiskSpace;
    public VendorSpecificAttributes vendorSpecificAttributes = new VendorSpecificAttributes();

    public ArrayList<VendorId> getVendorIds() {
        return vendorIds;
    }

    public void setVendorIds(ArrayList<VendorId> vendorIds) {
        this.vendorIds = vendorIds;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Long getRam() {
        return ram;
    }

    public void setRam(Long ram) {
        this.ram = ram;
    }

    public long getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(long diskSpace) {
        this.diskSpace = diskSpace;
    }

    public long getFreeDiskSpace() {
        return freeDiskSpace;
    }

    public void setFreeDiskSpace(long freeDiskSpace) {
        this.freeDiskSpace = freeDiskSpace;
    }

    public VendorSpecificAttributes getVendorSpecificAttributes() {
        return vendorSpecificAttributes;
    }

    public void setVendorSpecificAttributes(VendorSpecificAttributes vendorSpecificAttributes) {
        this.vendorSpecificAttributes = vendorSpecificAttributes;
    }

}
