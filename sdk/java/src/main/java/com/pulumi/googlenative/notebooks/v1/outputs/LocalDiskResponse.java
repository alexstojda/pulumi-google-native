// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.notebooks.v1.outputs.LocalDiskInitializeParamsResponse;
import com.pulumi.googlenative.notebooks.v1.outputs.RuntimeGuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LocalDiskResponse {
    /**
     * @return Optional. Output only. Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    private Boolean autoDelete;
    /**
     * @return Optional. Output only. Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    private Boolean boot;
    /**
     * @return Optional. Output only. Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    private String deviceName;
    /**
     * @return Indicates a list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    private List<RuntimeGuestOsFeatureResponse> guestOsFeatures;
    /**
     * @return A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
     */
    private Integer index;
    /**
     * @return Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    private LocalDiskInitializeParamsResponse initializeParams;
    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance. Valid values: * NVME * SCSI
     * 
     */
    private String interface_;
    /**
     * @return Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    private String kind;
    /**
     * @return Any valid publicly visible licenses.
     * 
     */
    private List<String> licenses;
    /**
     * @return The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode. Valid values: * READ_ONLY * READ_WRITE
     * 
     */
    private String mode;
    /**
     * @return Specifies a valid partial or full URL to an existing Persistent Disk resource.
     * 
     */
    private String source;
    /**
     * @return Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT. Valid values: * PERSISTENT * SCRATCH
     * 
     */
    private String type;

    private LocalDiskResponse() {}
    /**
     * @return Optional. Output only. Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    public Boolean autoDelete() {
        return this.autoDelete;
    }
    /**
     * @return Optional. Output only. Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    public Boolean boot() {
        return this.boot;
    }
    /**
     * @return Optional. Output only. Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Indicates a list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    public List<RuntimeGuestOsFeatureResponse> guestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * @return A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
     */
    public Integer index() {
        return this.index;
    }
    /**
     * @return Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    public LocalDiskInitializeParamsResponse initializeParams() {
        return this.initializeParams;
    }
    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance. Valid values: * NVME * SCSI
     * 
     */
    public String interface_() {
        return this.interface_;
    }
    /**
     * @return Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Any valid publicly visible licenses.
     * 
     */
    public List<String> licenses() {
        return this.licenses;
    }
    /**
     * @return The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode. Valid values: * READ_ONLY * READ_WRITE
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Specifies a valid partial or full URL to an existing Persistent Disk resource.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT. Valid values: * PERSISTENT * SCRATCH
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalDiskResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private List<RuntimeGuestOsFeatureResponse> guestOsFeatures;
        private Integer index;
        private LocalDiskInitializeParamsResponse initializeParams;
        private String interface_;
        private String kind;
        private List<String> licenses;
        private String mode;
        private String source;
        private String type;
        public Builder() {}
        public Builder(LocalDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.initializeParams = defaults.initializeParams;
    	      this.interface_ = defaults.interface_;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }
        @CustomType.Setter
        public Builder boot(Boolean boot) {
            this.boot = Objects.requireNonNull(boot);
            return this;
        }
        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        @CustomType.Setter
        public Builder guestOsFeatures(List<RuntimeGuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }
        public Builder guestOsFeatures(RuntimeGuestOsFeatureResponse... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        @CustomType.Setter
        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        @CustomType.Setter
        public Builder initializeParams(LocalDiskInitializeParamsResponse initializeParams) {
            this.initializeParams = Objects.requireNonNull(initializeParams);
            return this;
        }
        @CustomType.Setter("interface")
        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public LocalDiskResponse build() {
            final var o = new LocalDiskResponse();
            o.autoDelete = autoDelete;
            o.boot = boot;
            o.deviceName = deviceName;
            o.guestOsFeatures = guestOsFeatures;
            o.index = index;
            o.initializeParams = initializeParams;
            o.interface_ = interface_;
            o.kind = kind;
            o.licenses = licenses;
            o.mode = mode;
            o.source = source;
            o.type = type;
            return o;
        }
    }
}