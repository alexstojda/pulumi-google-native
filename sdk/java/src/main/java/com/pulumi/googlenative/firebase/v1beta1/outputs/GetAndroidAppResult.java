// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebase.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAndroidAppResult {
    /**
     * @return The key_id of the GCP ApiKey associated with this App. If set must have no restrictions, or only have restrictions that are valid for the associated Firebase App. Cannot be set in create requests, instead an existing valid API Key will be chosen, or if no valid API Keys exist, one will be provisioned for you. Cannot be set to an empty value in update requests.
     * 
     */
    private String apiKeyId;
    /**
     * @return Immutable. The globally unique, Firebase-assigned identifier for the `AndroidApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    private String appId;
    /**
     * @return The user-assigned display name for the `AndroidApp`.
     * 
     */
    private String displayName;
    /**
     * @return The resource name of the AndroidApp, in the format: projects/ PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project&#39;s [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google&#39;s [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
     * 
     */
    private String name;
    /**
     * @return Immutable. The canonical package name of the Android app as would appear in the Google Play Developer Console.
     * 
     */
    private String packageName;
    /**
     * @return Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `AndroidApp`.
     * 
     */
    private String project;
    /**
     * @return The lifecycle state of the App.
     * 
     */
    private String state;

    private GetAndroidAppResult() {}
    /**
     * @return The key_id of the GCP ApiKey associated with this App. If set must have no restrictions, or only have restrictions that are valid for the associated Firebase App. Cannot be set in create requests, instead an existing valid API Key will be chosen, or if no valid API Keys exist, one will be provisioned for you. Cannot be set to an empty value in update requests.
     * 
     */
    public String apiKeyId() {
        return this.apiKeyId;
    }
    /**
     * @return Immutable. The globally unique, Firebase-assigned identifier for the `AndroidApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The user-assigned display name for the `AndroidApp`.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The resource name of the AndroidApp, in the format: projects/ PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project&#39;s [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google&#39;s [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Immutable. The canonical package name of the Android app as would appear in the Google Play Developer Console.
     * 
     */
    public String packageName() {
        return this.packageName;
    }
    /**
     * @return Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `AndroidApp`.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return The lifecycle state of the App.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAndroidAppResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String apiKeyId;
        private String appId;
        private String displayName;
        private String name;
        private String packageName;
        private String project;
        private String state;
        public Builder() {}
        public Builder(GetAndroidAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyId = defaults.apiKeyId;
    	      this.appId = defaults.appId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.packageName = defaults.packageName;
    	      this.project = defaults.project;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder apiKeyId(String apiKeyId) {
            this.apiKeyId = Objects.requireNonNull(apiKeyId);
            return this;
        }
        @CustomType.Setter
        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder packageName(String packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetAndroidAppResult build() {
            final var o = new GetAndroidAppResult();
            o.apiKeyId = apiKeyId;
            o.appId = appId;
            o.displayName = displayName;
            o.name = name;
            o.packageName = packageName;
            o.project = project;
            o.state = state;
            return o;
        }
    }
}