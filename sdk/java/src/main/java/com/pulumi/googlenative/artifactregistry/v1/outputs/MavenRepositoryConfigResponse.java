// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MavenRepositoryConfigResponse {
    /**
     * @return The repository with this flag will allow publishing the same snapshot versions.
     * 
     */
    private Boolean allowSnapshotOverwrites;
    /**
     * @return Version policy defines the versions that the registry will accept.
     * 
     */
    private String versionPolicy;

    private MavenRepositoryConfigResponse() {}
    /**
     * @return The repository with this flag will allow publishing the same snapshot versions.
     * 
     */
    public Boolean allowSnapshotOverwrites() {
        return this.allowSnapshotOverwrites;
    }
    /**
     * @return Version policy defines the versions that the registry will accept.
     * 
     */
    public String versionPolicy() {
        return this.versionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MavenRepositoryConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowSnapshotOverwrites;
        private String versionPolicy;
        public Builder() {}
        public Builder(MavenRepositoryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSnapshotOverwrites = defaults.allowSnapshotOverwrites;
    	      this.versionPolicy = defaults.versionPolicy;
        }

        @CustomType.Setter
        public Builder allowSnapshotOverwrites(Boolean allowSnapshotOverwrites) {
            this.allowSnapshotOverwrites = Objects.requireNonNull(allowSnapshotOverwrites);
            return this;
        }
        @CustomType.Setter
        public Builder versionPolicy(String versionPolicy) {
            this.versionPolicy = Objects.requireNonNull(versionPolicy);
            return this;
        }
        public MavenRepositoryConfigResponse build() {
            final var o = new MavenRepositoryConfigResponse();
            o.allowSnapshotOverwrites = allowSnapshotOverwrites;
            o.versionPolicy = versionPolicy;
            return o;
        }
    }
}