// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing.v1.outputs.FileReferenceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RegularFileResponse {
    /**
     * @return The source file.
     * 
     */
    private FileReferenceResponse content;
    /**
     * @return Where to put the content on the device. Must be an absolute, allowlisted path. If the file exists, it will be replaced. The following device-side directories and any of their subdirectories are allowlisted: ${EXTERNAL_STORAGE}, /sdcard, or /storage ${ANDROID_DATA}/local/tmp, or /data/local/tmp Specifying a path outside of these directory trees is invalid. The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device and copy the file there. It is strongly advised to use the Environment API in app and test code to access files on the device in a portable way.
     * 
     */
    private String devicePath;

    private RegularFileResponse() {}
    /**
     * @return The source file.
     * 
     */
    public FileReferenceResponse content() {
        return this.content;
    }
    /**
     * @return Where to put the content on the device. Must be an absolute, allowlisted path. If the file exists, it will be replaced. The following device-side directories and any of their subdirectories are allowlisted: ${EXTERNAL_STORAGE}, /sdcard, or /storage ${ANDROID_DATA}/local/tmp, or /data/local/tmp Specifying a path outside of these directory trees is invalid. The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device and copy the file there. It is strongly advised to use the Environment API in app and test code to access files on the device in a portable way.
     * 
     */
    public String devicePath() {
        return this.devicePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegularFileResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private FileReferenceResponse content;
        private String devicePath;
        public Builder() {}
        public Builder(RegularFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.devicePath = defaults.devicePath;
        }

        @CustomType.Setter
        public Builder content(FileReferenceResponse content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        @CustomType.Setter
        public Builder devicePath(String devicePath) {
            this.devicePath = Objects.requireNonNull(devicePath);
            return this;
        }
        public RegularFileResponse build() {
            final var o = new RegularFileResponse();
            o.content = content;
            o.devicePath = devicePath;
            return o;
        }
    }
}