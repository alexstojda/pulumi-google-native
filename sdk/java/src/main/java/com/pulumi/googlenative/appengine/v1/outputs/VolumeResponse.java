// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VolumeResponse {
    /**
     * @return Unique name for the volume.
     * 
     */
    private String name;
    /**
     * @return Volume size in gigabytes.
     * 
     */
    private Double sizeGb;
    /**
     * @return Underlying volume type, e.g. &#39;tmpfs&#39;.
     * 
     */
    private String volumeType;

    private VolumeResponse() {}
    /**
     * @return Unique name for the volume.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Volume size in gigabytes.
     * 
     */
    public Double sizeGb() {
        return this.sizeGb;
    }
    /**
     * @return Underlying volume type, e.g. &#39;tmpfs&#39;.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private Double sizeGb;
        private String volumeType;
        public Builder() {}
        public Builder(VolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sizeGb = defaults.sizeGb;
    	      this.volumeType = defaults.volumeType;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder sizeGb(Double sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public VolumeResponse build() {
            final var o = new VolumeResponse();
            o.name = name;
            o.sizeGb = sizeGb;
            o.volumeType = volumeType;
            return o;
        }
    }
}