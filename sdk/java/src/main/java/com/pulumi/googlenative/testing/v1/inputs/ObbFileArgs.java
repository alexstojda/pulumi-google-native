// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing.v1.inputs.FileReferenceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * An opaque binary blob file to install on the device before the test starts.
 * 
 */
public final class ObbFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObbFileArgs Empty = new ObbFileArgs();

    /**
     * Opaque Binary Blob (OBB) file(s) to install on the device.
     * 
     */
    @Import(name="obb", required=true)
    private Output<FileReferenceArgs> obb;

    /**
     * @return Opaque Binary Blob (OBB) file(s) to install on the device.
     * 
     */
    public Output<FileReferenceArgs> obb() {
        return this.obb;
    }

    /**
     * OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on the device.
     * 
     */
    @Import(name="obbFileName", required=true)
    private Output<String> obbFileName;

    /**
     * @return OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on the device.
     * 
     */
    public Output<String> obbFileName() {
        return this.obbFileName;
    }

    private ObbFileArgs() {}

    private ObbFileArgs(ObbFileArgs $) {
        this.obb = $.obb;
        this.obbFileName = $.obbFileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObbFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObbFileArgs $;

        public Builder() {
            $ = new ObbFileArgs();
        }

        public Builder(ObbFileArgs defaults) {
            $ = new ObbFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param obb Opaque Binary Blob (OBB) file(s) to install on the device.
         * 
         * @return builder
         * 
         */
        public Builder obb(Output<FileReferenceArgs> obb) {
            $.obb = obb;
            return this;
        }

        /**
         * @param obb Opaque Binary Blob (OBB) file(s) to install on the device.
         * 
         * @return builder
         * 
         */
        public Builder obb(FileReferenceArgs obb) {
            return obb(Output.of(obb));
        }

        /**
         * @param obbFileName OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on the device.
         * 
         * @return builder
         * 
         */
        public Builder obbFileName(Output<String> obbFileName) {
            $.obbFileName = obbFileName;
            return this;
        }

        /**
         * @param obbFileName OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on the device.
         * 
         * @return builder
         * 
         */
        public Builder obbFileName(String obbFileName) {
            return obbFileName(Output.of(obbFileName));
        }

        public ObbFileArgs build() {
            $.obb = Objects.requireNonNull($.obb, "expected parameter 'obb' to be non-null");
            $.obbFileName = Objects.requireNonNull($.obbFileName, "expected parameter 'obbFileName' to be non-null");
            return $;
        }
    }

}