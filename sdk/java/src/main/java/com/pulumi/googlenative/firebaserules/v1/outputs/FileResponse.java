// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FileResponse {
    /**
     * @return Textual Content.
     * 
     */
    private String content;
    /**
     * @return Fingerprint (e.g. github sha) associated with the `File`.
     * 
     */
    private String fingerprint;
    /**
     * @return File name.
     * 
     */
    private String name;

    private FileResponse() {}
    /**
     * @return Textual Content.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return Fingerprint (e.g. github sha) associated with the `File`.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return File name.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String content;
        private String fingerprint;
        private String name;
        public Builder() {}
        public Builder(FileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.fingerprint = defaults.fingerprint;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        @CustomType.Setter
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public FileResponse build() {
            final var o = new FileResponse();
            o.content = content;
            o.fingerprint = fingerprint;
            o.name = name;
            return o;
        }
    }
}