// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.analyticshub.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataExchangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataExchangeArgs Empty = new DataExchangeArgs();

    /**
     * Required. The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Max length: 100 bytes.
     * 
     */
    @Import(name="dataExchangeId", required=true)
    private Output<String> dataExchangeId;

    /**
     * @return Required. The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Max length: 100 bytes.
     * 
     */
    public Output<String> dataExchangeId() {
        return this.dataExchangeId;
    }

    /**
     * Optional. Description of the data exchange. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). Default value is an empty string. Max length: 2000 bytes.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of the data exchange. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). Default value is an empty string. Max length: 2000 bytes.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Human-readable display name of the data exchange. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), ampersands (&amp;) and must not start or end with spaces. Default value is an empty string. Max length: 63 bytes.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Human-readable display name of the data exchange. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), ampersands (&amp;) and must not start or end with spaces. Default value is an empty string. Max length: 63 bytes.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Optional. Documentation describing the data exchange.
     * 
     */
    @Import(name="documentation")
    private @Nullable Output<String> documentation;

    /**
     * @return Optional. Documentation describing the data exchange.
     * 
     */
    public Optional<Output<String>> documentation() {
        return Optional.ofNullable(this.documentation);
    }

    /**
     * Optional. Base64 encoded image representing the data exchange. Max Size: 3.0MiB Expected image dimensions are 512x512 pixels, however the API only performs validation on size of the encoded data. Note: For byte fields, the content of the fields are base64-encoded (which increases the size of the data by 33-36%) when using JSON on the wire.
     * 
     */
    @Import(name="icon")
    private @Nullable Output<String> icon;

    /**
     * @return Optional. Base64 encoded image representing the data exchange. Max Size: 3.0MiB Expected image dimensions are 512x512 pixels, however the API only performs validation on size of the encoded data. Note: For byte fields, the content of the fields are base64-encoded (which increases the size of the data by 33-36%) when using JSON on the wire.
     * 
     */
    public Optional<Output<String>> icon() {
        return Optional.ofNullable(this.icon);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optional. Email or URL of the primary point of contact of the data exchange. Max Length: 1000 bytes.
     * 
     */
    @Import(name="primaryContact")
    private @Nullable Output<String> primaryContact;

    /**
     * @return Optional. Email or URL of the primary point of contact of the data exchange. Max Length: 1000 bytes.
     * 
     */
    public Optional<Output<String>> primaryContact() {
        return Optional.ofNullable(this.primaryContact);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private DataExchangeArgs() {}

    private DataExchangeArgs(DataExchangeArgs $) {
        this.dataExchangeId = $.dataExchangeId;
        this.description = $.description;
        this.displayName = $.displayName;
        this.documentation = $.documentation;
        this.icon = $.icon;
        this.location = $.location;
        this.primaryContact = $.primaryContact;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataExchangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataExchangeArgs $;

        public Builder() {
            $ = new DataExchangeArgs();
        }

        public Builder(DataExchangeArgs defaults) {
            $ = new DataExchangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataExchangeId Required. The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Max length: 100 bytes.
         * 
         * @return builder
         * 
         */
        public Builder dataExchangeId(Output<String> dataExchangeId) {
            $.dataExchangeId = dataExchangeId;
            return this;
        }

        /**
         * @param dataExchangeId Required. The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces. Max length: 100 bytes.
         * 
         * @return builder
         * 
         */
        public Builder dataExchangeId(String dataExchangeId) {
            return dataExchangeId(Output.of(dataExchangeId));
        }

        /**
         * @param description Optional. Description of the data exchange. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). Default value is an empty string. Max length: 2000 bytes.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of the data exchange. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). Default value is an empty string. Max length: 2000 bytes.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Human-readable display name of the data exchange. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), ampersands (&amp;) and must not start or end with spaces. Default value is an empty string. Max length: 63 bytes.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Human-readable display name of the data exchange. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), ampersands (&amp;) and must not start or end with spaces. Default value is an empty string. Max length: 63 bytes.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param documentation Optional. Documentation describing the data exchange.
         * 
         * @return builder
         * 
         */
        public Builder documentation(@Nullable Output<String> documentation) {
            $.documentation = documentation;
            return this;
        }

        /**
         * @param documentation Optional. Documentation describing the data exchange.
         * 
         * @return builder
         * 
         */
        public Builder documentation(String documentation) {
            return documentation(Output.of(documentation));
        }

        /**
         * @param icon Optional. Base64 encoded image representing the data exchange. Max Size: 3.0MiB Expected image dimensions are 512x512 pixels, however the API only performs validation on size of the encoded data. Note: For byte fields, the content of the fields are base64-encoded (which increases the size of the data by 33-36%) when using JSON on the wire.
         * 
         * @return builder
         * 
         */
        public Builder icon(@Nullable Output<String> icon) {
            $.icon = icon;
            return this;
        }

        /**
         * @param icon Optional. Base64 encoded image representing the data exchange. Max Size: 3.0MiB Expected image dimensions are 512x512 pixels, however the API only performs validation on size of the encoded data. Note: For byte fields, the content of the fields are base64-encoded (which increases the size of the data by 33-36%) when using JSON on the wire.
         * 
         * @return builder
         * 
         */
        public Builder icon(String icon) {
            return icon(Output.of(icon));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param primaryContact Optional. Email or URL of the primary point of contact of the data exchange. Max Length: 1000 bytes.
         * 
         * @return builder
         * 
         */
        public Builder primaryContact(@Nullable Output<String> primaryContact) {
            $.primaryContact = primaryContact;
            return this;
        }

        /**
         * @param primaryContact Optional. Email or URL of the primary point of contact of the data exchange. Max Length: 1000 bytes.
         * 
         * @return builder
         * 
         */
        public Builder primaryContact(String primaryContact) {
            return primaryContact(Output.of(primaryContact));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public DataExchangeArgs build() {
            $.dataExchangeId = Objects.requireNonNull($.dataExchangeId, "expected parameter 'dataExchangeId' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}