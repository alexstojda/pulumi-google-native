// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.firebasehosting.v1beta1.outputs.ReleaseResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetChannelResult {
    /**
     * @return The time at which the channel was created.
     * 
     */
    private String createTime;
    /**
     * @return The time at which the channel will be automatically deleted. If null, the channel will not be automatically deleted. This field is present in the output whether it&#39;s set directly or via the `ttl` field.
     * 
     */
    private String expireTime;
    /**
     * @return Text labels used for extra metadata and/or filtering.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return The fully-qualified resource name for the channel, in the format: sites/ SITE_ID/channels/CHANNEL_ID
     * 
     */
    private String name;
    /**
     * @return The current release for the channel, if any.
     * 
     */
    private ReleaseResponse release;
    /**
     * @return The number of previous releases to retain on the channel for rollback or other purposes. Must be a number between 1-100. Defaults to 10 for new channels.
     * 
     */
    private Integer retainedReleaseCount;
    /**
     * @return Input only. A time-to-live for this channel. Sets `expire_time` to the provided duration past the time of the request.
     * 
     */
    private String ttl;
    /**
     * @return The time at which the channel was last updated.
     * 
     */
    private String updateTime;
    /**
     * @return The URL at which the content of this channel&#39;s current release can be viewed. This URL is a Firebase-provided subdomain of `web.app`. The content of this channel&#39;s current release can also be viewed at the Firebase-provided subdomain of `firebaseapp.com`. If this channel is the `live` channel for the Hosting site, then the content of this channel&#39;s current release can also be viewed at any connected custom domains.
     * 
     */
    private String url;

    private GetChannelResult() {}
    /**
     * @return The time at which the channel was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The time at which the channel will be automatically deleted. If null, the channel will not be automatically deleted. This field is present in the output whether it&#39;s set directly or via the `ttl` field.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return Text labels used for extra metadata and/or filtering.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The fully-qualified resource name for the channel, in the format: sites/ SITE_ID/channels/CHANNEL_ID
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current release for the channel, if any.
     * 
     */
    public ReleaseResponse release() {
        return this.release;
    }
    /**
     * @return The number of previous releases to retain on the channel for rollback or other purposes. Must be a number between 1-100. Defaults to 10 for new channels.
     * 
     */
    public Integer retainedReleaseCount() {
        return this.retainedReleaseCount;
    }
    /**
     * @return Input only. A time-to-live for this channel. Sets `expire_time` to the provided duration past the time of the request.
     * 
     */
    public String ttl() {
        return this.ttl;
    }
    /**
     * @return The time at which the channel was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return The URL at which the content of this channel&#39;s current release can be viewed. This URL is a Firebase-provided subdomain of `web.app`. The content of this channel&#39;s current release can also be viewed at the Firebase-provided subdomain of `firebaseapp.com`. If this channel is the `live` channel for the Hosting site, then the content of this channel&#39;s current release can also be viewed at any connected custom domains.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String expireTime;
        private Map<String,String> labels;
        private String name;
        private ReleaseResponse release;
        private Integer retainedReleaseCount;
        private String ttl;
        private String updateTime;
        private String url;
        public Builder() {}
        public Builder(GetChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.release = defaults.release;
    	      this.retainedReleaseCount = defaults.retainedReleaseCount;
    	      this.ttl = defaults.ttl;
    	      this.updateTime = defaults.updateTime;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder release(ReleaseResponse release) {
            this.release = Objects.requireNonNull(release);
            return this;
        }
        @CustomType.Setter
        public Builder retainedReleaseCount(Integer retainedReleaseCount) {
            this.retainedReleaseCount = Objects.requireNonNull(retainedReleaseCount);
            return this;
        }
        @CustomType.Setter
        public Builder ttl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetChannelResult build() {
            final var o = new GetChannelResult();
            o.createTime = createTime;
            o.expireTime = expireTime;
            o.labels = labels;
            o.name = name;
            o.release = release;
            o.retainedReleaseCount = retainedReleaseCount;
            o.ttl = ttl;
            o.updateTime = updateTime;
            o.url = url;
            return o;
        }
    }
}