// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute.beta.InterconnectArgs;
import com.pulumi.googlenative.compute.beta.outputs.InterconnectCircuitInfoResponse;
import com.pulumi.googlenative.compute.beta.outputs.InterconnectOutageNotificationResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a Interconnect in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:Interconnect")
public class Interconnect extends com.pulumi.resources.CustomResource {
    /**
     * Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    @Export(name="adminEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> adminEnabled;

    /**
     * @return Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    public Output<Boolean> adminEnabled() {
        return this.adminEnabled;
    }
    /**
     * A list of CircuitInfo objects, that describe the individual circuits in this LAG.
     * 
     */
    @Export(name="circuitInfos", type=List.class, parameters={InterconnectCircuitInfoResponse.class})
    private Output<List<InterconnectCircuitInfoResponse>> circuitInfos;

    /**
     * @return A list of CircuitInfo objects, that describe the individual circuits in this LAG.
     * 
     */
    public Output<List<InterconnectCircuitInfoResponse>> circuitInfos() {
        return this.circuitInfos;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    @Export(name="customerName", type=String.class, parameters={})
    private Output<String> customerName;

    /**
     * @return Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    public Output<String> customerName() {
        return this.customerName;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * A list of outages expected for this Interconnect.
     * 
     */
    @Export(name="expectedOutages", type=List.class, parameters={InterconnectOutageNotificationResponse.class})
    private Output<List<InterconnectOutageNotificationResponse>> expectedOutages;

    /**
     * @return A list of outages expected for this Interconnect.
     * 
     */
    public Output<List<InterconnectOutageNotificationResponse>> expectedOutages() {
        return this.expectedOutages;
    }
    /**
     * IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
     * 
     */
    @Export(name="googleIpAddress", type=String.class, parameters={})
    private Output<String> googleIpAddress;

    /**
     * @return IP address configured on the Google side of the Interconnect link. This can be used only for ping tests.
     * 
     */
    public Output<String> googleIpAddress() {
        return this.googleIpAddress;
    }
    /**
     * Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
     * 
     */
    @Export(name="googleReferenceId", type=String.class, parameters={})
    private Output<String> googleReferenceId;

    /**
     * @return Google reference ID to be used when raising support tickets with Google or otherwise to debug backend connectivity issues.
     * 
     */
    public Output<String> googleReferenceId() {
        return this.googleReferenceId;
    }
    /**
     * A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
     * 
     */
    @Export(name="interconnectAttachments", type=List.class, parameters={String.class})
    private Output<List<String>> interconnectAttachments;

    /**
     * @return A list of the URLs of all InterconnectAttachments configured to use this Interconnect.
     * 
     */
    public Output<List<String>> interconnectAttachments() {
        return this.interconnectAttachments;
    }
    /**
     * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    @Export(name="interconnectType", type=String.class, parameters={})
    private Output<String> interconnectType;

    /**
     * @return Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    public Output<String> interconnectType() {
        return this.interconnectType;
    }
    /**
     * Type of the resource. Always compute#interconnect for interconnects.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#interconnect for interconnects.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this Interconnect, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an Interconnect.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this Interconnect, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an Interconnect.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    @Export(name="linkType", type=String.class, parameters={})
    private Output<String> linkType;

    /**
     * @return Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    public Output<String> linkType() {
        return this.linkType;
    }
    /**
     * URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    @Export(name="nocContactEmail", type=String.class, parameters={})
    private Output<String> nocContactEmail;

    /**
     * @return Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    public Output<String> nocContactEmail() {
        return this.nocContactEmail;
    }
    /**
     * The current status of this Interconnect&#39;s functionality, which can take one of the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect. - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    @Export(name="operationalStatus", type=String.class, parameters={})
    private Output<String> operationalStatus;

    /**
     * @return The current status of this Interconnect&#39;s functionality, which can take one of the following values: - OS_ACTIVE: A valid Interconnect, which is turned up and is ready to use. Attachments may be provisioned on this Interconnect. - OS_UNPROVISIONED: An Interconnect that has not completed turnup. No attachments may be provisioned on this Interconnect. - OS_UNDER_MAINTENANCE: An Interconnect that is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    public Output<String> operationalStatus() {
        return this.operationalStatus;
    }
    /**
     * IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
     * 
     */
    @Export(name="peerIpAddress", type=String.class, parameters={})
    private Output<String> peerIpAddress;

    /**
     * @return IP address configured on the customer side of the Interconnect link. The customer should configure this IP address during turnup when prompted by Google NOC. This can be used only for ping tests.
     * 
     */
    public Output<String> peerIpAddress() {
        return this.peerIpAddress;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * Number of links actually provisioned in this interconnect.
     * 
     */
    @Export(name="provisionedLinkCount", type=Integer.class, parameters={})
    private Output<Integer> provisionedLinkCount;

    /**
     * @return Number of links actually provisioned in this interconnect.
     * 
     */
    public Output<Integer> provisionedLinkCount() {
        return this.provisionedLinkCount;
    }
    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Export(name="requestId", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Output<Optional<String>> requestId() {
        return Codegen.optional(this.requestId);
    }
    /**
     * Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    @Export(name="requestedLinkCount", type=Integer.class, parameters={})
    private Output<Integer> requestedLinkCount;

    /**
     * @return Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    public Output<Integer> requestedLinkCount() {
        return this.requestedLinkCount;
    }
    /**
     * Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
     * 
     */
    @Export(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Set to true if the resource satisfies the zone separation organization policy constraints and false otherwise. Defaults to false if the field is not present.
     * 
     */
    public Output<Boolean> satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The current state of Interconnect functionality, which can take one of the following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect. - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of Interconnect functionality, which can take one of the following values: - ACTIVE: The Interconnect is valid, turned up and ready to use. Attachments may be provisioned on this Interconnect. - UNPROVISIONED: The Interconnect has not completed turnup. No attachments may be provisioned on this Interconnect. - UNDER_MAINTENANCE: The Interconnect is undergoing internal maintenance. No attachments may be provisioned or updated on this Interconnect.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Interconnect(String name) {
        this(name, InterconnectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Interconnect(String name, @Nullable InterconnectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Interconnect(String name, @Nullable InterconnectArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Interconnect", name, args == null ? InterconnectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Interconnect(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Interconnect", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Interconnect get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Interconnect(name, id, options);
    }
}