// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetTagKeyResult {
    /**
     * @return Creation time.
     * 
     */
    private String createTime;
    /**
     * @return Optional. User-assigned description of the TagKey. Must not exceed 256 characters. Read-write.
     * 
     */
    private String description;
    /**
     * @return Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagKeyRequest for details.
     * 
     */
    private String etag;
    /**
     * @return Immutable. The resource name for a TagKey. Must be in the format `tagKeys/{tag_key_id}`, where `tag_key_id` is the generated numeric id for the TagKey.
     * 
     */
    private String name;
    /**
     * @return Immutable. Namespaced name of the TagKey.
     * 
     */
    private String namespacedName;
    /**
     * @return Immutable. The resource name of the new TagKey&#39;s parent. Must be of the form `organizations/{org_id}`.
     * 
     */
    private String parent;
    /**
     * @return Optional. A purpose denotes that this Tag is intended for use in policies of a specific policy engine, and will involve that policy engine in management operations involving this Tag. A purpose does not grant a policy engine exclusive rights to the Tag, and it may be referenced by other policy engines. A purpose cannot be changed once set.
     * 
     */
    private String purpose;
    /**
     * @return Optional. Purpose data corresponds to the policy system that the tag is intended for. See documentation for `Purpose` for formatting of this field. Purpose data cannot be changed once set.
     * 
     */
    private Map<String,String> purposeData;
    /**
     * @return Immutable. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace. The short name must be 1-63 characters, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    private String shortName;
    /**
     * @return Update time.
     * 
     */
    private String updateTime;

    private GetTagKeyResult() {}
    /**
     * @return Creation time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. User-assigned description of the TagKey. Must not exceed 256 characters. Read-write.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagKeyRequest for details.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Immutable. The resource name for a TagKey. Must be in the format `tagKeys/{tag_key_id}`, where `tag_key_id` is the generated numeric id for the TagKey.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Immutable. Namespaced name of the TagKey.
     * 
     */
    public String namespacedName() {
        return this.namespacedName;
    }
    /**
     * @return Immutable. The resource name of the new TagKey&#39;s parent. Must be of the form `organizations/{org_id}`.
     * 
     */
    public String parent() {
        return this.parent;
    }
    /**
     * @return Optional. A purpose denotes that this Tag is intended for use in policies of a specific policy engine, and will involve that policy engine in management operations involving this Tag. A purpose does not grant a policy engine exclusive rights to the Tag, and it may be referenced by other policy engines. A purpose cannot be changed once set.
     * 
     */
    public String purpose() {
        return this.purpose;
    }
    /**
     * @return Optional. Purpose data corresponds to the policy system that the tag is intended for. See documentation for `Purpose` for formatting of this field. Purpose data cannot be changed once set.
     * 
     */
    public Map<String,String> purposeData() {
        return this.purposeData;
    }
    /**
     * @return Immutable. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace. The short name must be 1-63 characters, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    public String shortName() {
        return this.shortName;
    }
    /**
     * @return Update time.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagKeyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private String etag;
        private String name;
        private String namespacedName;
        private String parent;
        private String purpose;
        private Map<String,String> purposeData;
        private String shortName;
        private String updateTime;
        public Builder() {}
        public Builder(GetTagKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.namespacedName = defaults.namespacedName;
    	      this.parent = defaults.parent;
    	      this.purpose = defaults.purpose;
    	      this.purposeData = defaults.purposeData;
    	      this.shortName = defaults.shortName;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespacedName(String namespacedName) {
            this.namespacedName = Objects.requireNonNull(namespacedName);
            return this;
        }
        @CustomType.Setter
        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        @CustomType.Setter
        public Builder purpose(String purpose) {
            this.purpose = Objects.requireNonNull(purpose);
            return this;
        }
        @CustomType.Setter
        public Builder purposeData(Map<String,String> purposeData) {
            this.purposeData = Objects.requireNonNull(purposeData);
            return this;
        }
        @CustomType.Setter
        public Builder shortName(String shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetTagKeyResult build() {
            final var o = new GetTagKeyResult();
            o.createTime = createTime;
            o.description = description;
            o.etag = etag;
            o.name = name;
            o.namespacedName = namespacedName;
            o.parent = parent;
            o.purpose = purpose;
            o.purposeData = purposeData;
            o.shortName = shortName;
            o.updateTime = updateTime;
            return o;
        }
    }
}