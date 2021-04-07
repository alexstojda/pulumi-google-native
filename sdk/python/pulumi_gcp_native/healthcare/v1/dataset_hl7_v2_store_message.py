# coding=utf-8
# *** WARNING: this file was generated by the Pulumi SDK Generator. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from ... import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['DatasetHl7V2StoreMessage']


class DatasetHl7V2StoreMessage(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data: Optional[pulumi.Input[str]] = None,
                 datasets_id: Optional[pulumi.Input[str]] = None,
                 hl7_v2_stores_id: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 locations_id: Optional[pulumi.Input[str]] = None,
                 message_type: Optional[pulumi.Input[str]] = None,
                 messages_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 patient_ids: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PatientIdArgs']]]]] = None,
                 projects_id: Optional[pulumi.Input[str]] = None,
                 schematized_data: Optional[pulumi.Input[pulumi.InputType['SchematizedDataArgs']]] = None,
                 send_facility: Optional[pulumi.Input[str]] = None,
                 send_time: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Parses and stores an HL7v2 message. This method triggers an asynchronous notification to any Pub/Sub topic configured in Hl7V2Store.Hl7V2NotificationConfig, if the filtering matches the message. If an MLLP adapter is configured to listen to a Pub/Sub topic, the adapter transmits the message when a notification is received.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] data: Raw message bytes.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
        :param pulumi.Input[str] message_type: The message type for this message. MSH-9.1.
        :param pulumi.Input[str] name: Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PatientIdArgs']]]] patient_ids: All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
        :param pulumi.Input[pulumi.InputType['SchematizedDataArgs']] schematized_data: The parsed version of the raw message data schematized according to this store's schemas and type definitions.
        :param pulumi.Input[str] send_facility: The hospital that this message came from. MSH-4.
        :param pulumi.Input[str] send_time: The datetime the sending application sent this message. MSH-7.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['data'] = data
            if datasets_id is None and not opts.urn:
                raise TypeError("Missing required property 'datasets_id'")
            __props__['datasets_id'] = datasets_id
            if hl7_v2_stores_id is None and not opts.urn:
                raise TypeError("Missing required property 'hl7_v2_stores_id'")
            __props__['hl7_v2_stores_id'] = hl7_v2_stores_id
            __props__['labels'] = labels
            if locations_id is None and not opts.urn:
                raise TypeError("Missing required property 'locations_id'")
            __props__['locations_id'] = locations_id
            __props__['message_type'] = message_type
            if messages_id is None and not opts.urn:
                raise TypeError("Missing required property 'messages_id'")
            __props__['messages_id'] = messages_id
            __props__['name'] = name
            __props__['patient_ids'] = patient_ids
            if projects_id is None and not opts.urn:
                raise TypeError("Missing required property 'projects_id'")
            __props__['projects_id'] = projects_id
            __props__['schematized_data'] = schematized_data
            __props__['send_facility'] = send_facility
            __props__['send_time'] = send_time
            __props__['create_time'] = None
            __props__['parsed_data'] = None
        super(DatasetHl7V2StoreMessage, __self__).__init__(
            'gcp-native:healthcare/v1:DatasetHl7V2StoreMessage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'DatasetHl7V2StoreMessage':
        """
        Get an existing DatasetHl7V2StoreMessage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["create_time"] = None
        __props__["data"] = None
        __props__["labels"] = None
        __props__["message_type"] = None
        __props__["name"] = None
        __props__["parsed_data"] = None
        __props__["patient_ids"] = None
        __props__["schematized_data"] = None
        __props__["send_facility"] = None
        __props__["send_time"] = None
        return DatasetHl7V2StoreMessage(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The datetime when the message was created. Set by the server.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def data(self) -> pulumi.Output[str]:
        """
        Raw message bytes.
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, str]]:
        """
        User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="messageType")
    def message_type(self) -> pulumi.Output[str]:
        """
        The message type for this message. MSH-9.1.
        """
        return pulumi.get(self, "message_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="parsedData")
    def parsed_data(self) -> pulumi.Output['outputs.ParsedDataResponse']:
        """
        The parsed version of the raw message data.
        """
        return pulumi.get(self, "parsed_data")

    @property
    @pulumi.getter(name="patientIds")
    def patient_ids(self) -> pulumi.Output[Sequence['outputs.PatientIdResponse']]:
        """
        All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
        """
        return pulumi.get(self, "patient_ids")

    @property
    @pulumi.getter(name="schematizedData")
    def schematized_data(self) -> pulumi.Output['outputs.SchematizedDataResponse']:
        """
        The parsed version of the raw message data schematized according to this store's schemas and type definitions.
        """
        return pulumi.get(self, "schematized_data")

    @property
    @pulumi.getter(name="sendFacility")
    def send_facility(self) -> pulumi.Output[str]:
        """
        The hospital that this message came from. MSH-4.
        """
        return pulumi.get(self, "send_facility")

    @property
    @pulumi.getter(name="sendTime")
    def send_time(self) -> pulumi.Output[str]:
        """
        The datetime the sending application sent this message. MSH-7.
        """
        return pulumi.get(self, "send_time")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
