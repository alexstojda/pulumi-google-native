// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dns.v2.outputs.RRSetRoutingPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ResourceRecordSetResponse {
    private String kind;
    /**
     * @return For example, www.example.com.
     * 
     */
    private String name;
    /**
     * @return Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    private RRSetRoutingPolicyResponse routingPolicy;
    /**
     * @return As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    private List<String> rrdatas;
    /**
     * @return As defined in RFC 4034 (section 3.2).
     * 
     */
    private List<String> signatureRrdatas;
    /**
     * @return Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    private Integer ttl;
    /**
     * @return The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    private String type;

    private ResourceRecordSetResponse() {}
    public String kind() {
        return this.kind;
    }
    /**
     * @return For example, www.example.com.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    public RRSetRoutingPolicyResponse routingPolicy() {
        return this.routingPolicy;
    }
    /**
     * @return As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    public List<String> rrdatas() {
        return this.rrdatas;
    }
    /**
     * @return As defined in RFC 4034 (section 3.2).
     * 
     */
    public List<String> signatureRrdatas() {
        return this.signatureRrdatas;
    }
    /**
     * @return Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    public Integer ttl() {
        return this.ttl;
    }
    /**
     * @return The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRecordSetResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kind;
        private String name;
        private RRSetRoutingPolicyResponse routingPolicy;
        private List<String> rrdatas;
        private List<String> signatureRrdatas;
        private Integer ttl;
        private String type;
        public Builder() {}
        public Builder(ResourceRecordSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.routingPolicy = defaults.routingPolicy;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder routingPolicy(RRSetRoutingPolicyResponse routingPolicy) {
            this.routingPolicy = Objects.requireNonNull(routingPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder rrdatas(List<String> rrdatas) {
            this.rrdatas = Objects.requireNonNull(rrdatas);
            return this;
        }
        public Builder rrdatas(String... rrdatas) {
            return rrdatas(List.of(rrdatas));
        }
        @CustomType.Setter
        public Builder signatureRrdatas(List<String> signatureRrdatas) {
            this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas);
            return this;
        }
        public Builder signatureRrdatas(String... signatureRrdatas) {
            return signatureRrdatas(List.of(signatureRrdatas));
        }
        @CustomType.Setter
        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ResourceRecordSetResponse build() {
            final var o = new ResourceRecordSetResponse();
            o.kind = kind;
            o.name = name;
            o.routingPolicy = routingPolicy;
            o.rrdatas = rrdatas;
            o.signatureRrdatas = signatureRrdatas;
            o.ttl = ttl;
            o.type = type;
            return o;
        }
    }
}