// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.InstancePropertiesResponse;
import com.pulumi.googlenative.compute.alpha.outputs.InstanceResponse;
import com.pulumi.googlenative.compute.alpha.outputs.LocationPolicyResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class BulkInsertInstanceResourceResponse {
    /**
     * @return The maximum number of instances to create.
     * 
     */
    private String count;
    /**
     * @return DEPRECATED: Please use instance_properties instead.
     * 
     * @deprecated
     * DEPRECATED: Please use instance_properties instead.
     * 
     */
    @Deprecated /* DEPRECATED: Please use instance_properties instead. */
    private InstanceResponse instance;
    /**
     * @return The instance properties defining the VM instances to be created. Required if sourceInstanceTemplate is not provided.
     * 
     */
    private InstancePropertiesResponse instanceProperties;
    /**
     * @return Policy for chosing target zone. For more information, see Create VMs in bulk .
     * 
     */
    private LocationPolicyResponse locationPolicy;
    /**
     * @return The minimum number of instances to create. If no min_count is specified then count is used as the default value. If min_count instances cannot be created, then no instances will be created and instances already created will be deleted.
     * 
     */
    private String minCount;
    /**
     * @return The string pattern used for the names of the VMs. Either name_pattern or per_instance_properties must be set. The pattern must contain one continuous sequence of placeholder hash characters (#) with each character corresponding to one digit of the generated instance name. Example: a name_pattern of inst-#### generates instance names such as inst-0001 and inst-0002. If existing instances in the same project and zone have names that match the name pattern then the generated instance numbers start after the biggest existing number. For example, if there exists an instance with name inst-0050, then instance names generated using the pattern inst-#### begin with inst-0051. The name pattern placeholder #...# can contain up to 18 characters.
     * 
     */
    private String namePattern;
    /**
     * @return Per-instance properties to be set on individual instances. Keys of this map specify requested instance names. Can be empty if name_pattern is used.
     * 
     */
    private Map<String,String> perInstanceProperties;
    /**
     * @return Specifies the instance template from which to create instances. You may combine sourceInstanceTemplate with instanceProperties to override specific values from an existing instance template. Bulk API follows the semantics of JSON Merge Patch described by RFC 7396. It can be a full or partial URL. For example, the following are all valid URLs to an instance template: - https://www.googleapis.com/compute/v1/projects/project /global/instanceTemplates/instanceTemplate - projects/project/global/instanceTemplates/instanceTemplate - global/instanceTemplates/instanceTemplate This field is optional.
     * 
     */
    private String sourceInstanceTemplate;

    private BulkInsertInstanceResourceResponse() {}
    /**
     * @return The maximum number of instances to create.
     * 
     */
    public String count() {
        return this.count;
    }
    /**
     * @return DEPRECATED: Please use instance_properties instead.
     * 
     * @deprecated
     * DEPRECATED: Please use instance_properties instead.
     * 
     */
    @Deprecated /* DEPRECATED: Please use instance_properties instead. */
    public InstanceResponse instance() {
        return this.instance;
    }
    /**
     * @return The instance properties defining the VM instances to be created. Required if sourceInstanceTemplate is not provided.
     * 
     */
    public InstancePropertiesResponse instanceProperties() {
        return this.instanceProperties;
    }
    /**
     * @return Policy for chosing target zone. For more information, see Create VMs in bulk .
     * 
     */
    public LocationPolicyResponse locationPolicy() {
        return this.locationPolicy;
    }
    /**
     * @return The minimum number of instances to create. If no min_count is specified then count is used as the default value. If min_count instances cannot be created, then no instances will be created and instances already created will be deleted.
     * 
     */
    public String minCount() {
        return this.minCount;
    }
    /**
     * @return The string pattern used for the names of the VMs. Either name_pattern or per_instance_properties must be set. The pattern must contain one continuous sequence of placeholder hash characters (#) with each character corresponding to one digit of the generated instance name. Example: a name_pattern of inst-#### generates instance names such as inst-0001 and inst-0002. If existing instances in the same project and zone have names that match the name pattern then the generated instance numbers start after the biggest existing number. For example, if there exists an instance with name inst-0050, then instance names generated using the pattern inst-#### begin with inst-0051. The name pattern placeholder #...# can contain up to 18 characters.
     * 
     */
    public String namePattern() {
        return this.namePattern;
    }
    /**
     * @return Per-instance properties to be set on individual instances. Keys of this map specify requested instance names. Can be empty if name_pattern is used.
     * 
     */
    public Map<String,String> perInstanceProperties() {
        return this.perInstanceProperties;
    }
    /**
     * @return Specifies the instance template from which to create instances. You may combine sourceInstanceTemplate with instanceProperties to override specific values from an existing instance template. Bulk API follows the semantics of JSON Merge Patch described by RFC 7396. It can be a full or partial URL. For example, the following are all valid URLs to an instance template: - https://www.googleapis.com/compute/v1/projects/project /global/instanceTemplates/instanceTemplate - projects/project/global/instanceTemplates/instanceTemplate - global/instanceTemplates/instanceTemplate This field is optional.
     * 
     */
    public String sourceInstanceTemplate() {
        return this.sourceInstanceTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BulkInsertInstanceResourceResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String count;
        private InstanceResponse instance;
        private InstancePropertiesResponse instanceProperties;
        private LocationPolicyResponse locationPolicy;
        private String minCount;
        private String namePattern;
        private Map<String,String> perInstanceProperties;
        private String sourceInstanceTemplate;
        public Builder() {}
        public Builder(BulkInsertInstanceResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.instance = defaults.instance;
    	      this.instanceProperties = defaults.instanceProperties;
    	      this.locationPolicy = defaults.locationPolicy;
    	      this.minCount = defaults.minCount;
    	      this.namePattern = defaults.namePattern;
    	      this.perInstanceProperties = defaults.perInstanceProperties;
    	      this.sourceInstanceTemplate = defaults.sourceInstanceTemplate;
        }

        @CustomType.Setter
        public Builder count(String count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        @CustomType.Setter
        public Builder instance(InstanceResponse instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }
        @CustomType.Setter
        public Builder instanceProperties(InstancePropertiesResponse instanceProperties) {
            this.instanceProperties = Objects.requireNonNull(instanceProperties);
            return this;
        }
        @CustomType.Setter
        public Builder locationPolicy(LocationPolicyResponse locationPolicy) {
            this.locationPolicy = Objects.requireNonNull(locationPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder minCount(String minCount) {
            this.minCount = Objects.requireNonNull(minCount);
            return this;
        }
        @CustomType.Setter
        public Builder namePattern(String namePattern) {
            this.namePattern = Objects.requireNonNull(namePattern);
            return this;
        }
        @CustomType.Setter
        public Builder perInstanceProperties(Map<String,String> perInstanceProperties) {
            this.perInstanceProperties = Objects.requireNonNull(perInstanceProperties);
            return this;
        }
        @CustomType.Setter
        public Builder sourceInstanceTemplate(String sourceInstanceTemplate) {
            this.sourceInstanceTemplate = Objects.requireNonNull(sourceInstanceTemplate);
            return this;
        }
        public BulkInsertInstanceResourceResponse build() {
            final var o = new BulkInsertInstanceResourceResponse();
            o.count = count;
            o.instance = instance;
            o.instanceProperties = instanceProperties;
            o.locationPolicy = locationPolicy;
            o.minCount = minCount;
            o.namePattern = namePattern;
            o.perInstanceProperties = perInstanceProperties;
            o.sourceInstanceTemplate = sourceInstanceTemplate;
            return o;
        }
    }
}