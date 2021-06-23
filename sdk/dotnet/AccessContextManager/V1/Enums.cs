// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.ComponentModel;
using Pulumi;

namespace Pulumi.GoogleNative.AccessContextManager.V1
{
    /// <summary>
    /// How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
    /// </summary>
    [EnumType]
    public readonly struct BasicLevelCombiningFunction : IEquatable<BasicLevelCombiningFunction>
    {
        private readonly string _value;

        private BasicLevelCombiningFunction(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// All `Conditions` must be true for the `BasicLevel` to be true.
        /// </summary>
        public static BasicLevelCombiningFunction And { get; } = new BasicLevelCombiningFunction("AND");
        /// <summary>
        /// If at least one `Condition` is true, then the `BasicLevel` is true.
        /// </summary>
        public static BasicLevelCombiningFunction Or { get; } = new BasicLevelCombiningFunction("OR");

        public static bool operator ==(BasicLevelCombiningFunction left, BasicLevelCombiningFunction right) => left.Equals(right);
        public static bool operator !=(BasicLevelCombiningFunction left, BasicLevelCombiningFunction right) => !left.Equals(right);

        public static explicit operator string(BasicLevelCombiningFunction value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is BasicLevelCombiningFunction other && Equals(other);
        public bool Equals(BasicLevelCombiningFunction other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct DevicePolicyAllowedDeviceManagementLevelsItem : IEquatable<DevicePolicyAllowedDeviceManagementLevelsItem>
    {
        private readonly string _value;

        private DevicePolicyAllowedDeviceManagementLevelsItem(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// The device's management level is not specified or not known.
        /// </summary>
        public static DevicePolicyAllowedDeviceManagementLevelsItem ManagementUnspecified { get; } = new DevicePolicyAllowedDeviceManagementLevelsItem("MANAGEMENT_UNSPECIFIED");
        /// <summary>
        /// The device is not managed.
        /// </summary>
        public static DevicePolicyAllowedDeviceManagementLevelsItem None { get; } = new DevicePolicyAllowedDeviceManagementLevelsItem("NONE");
        /// <summary>
        /// Basic management is enabled, which is generally limited to monitoring and wiping the corporate account.
        /// </summary>
        public static DevicePolicyAllowedDeviceManagementLevelsItem Basic { get; } = new DevicePolicyAllowedDeviceManagementLevelsItem("BASIC");
        /// <summary>
        /// Complete device management. This includes more thorough monitoring and the ability to directly manage the device (such as remote wiping). This can be enabled through the Android Enterprise Platform.
        /// </summary>
        public static DevicePolicyAllowedDeviceManagementLevelsItem Complete { get; } = new DevicePolicyAllowedDeviceManagementLevelsItem("COMPLETE");

        public static bool operator ==(DevicePolicyAllowedDeviceManagementLevelsItem left, DevicePolicyAllowedDeviceManagementLevelsItem right) => left.Equals(right);
        public static bool operator !=(DevicePolicyAllowedDeviceManagementLevelsItem left, DevicePolicyAllowedDeviceManagementLevelsItem right) => !left.Equals(right);

        public static explicit operator string(DevicePolicyAllowedDeviceManagementLevelsItem value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is DevicePolicyAllowedDeviceManagementLevelsItem other && Equals(other);
        public bool Equals(DevicePolicyAllowedDeviceManagementLevelsItem other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    [EnumType]
    public readonly struct DevicePolicyAllowedEncryptionStatusesItem : IEquatable<DevicePolicyAllowedEncryptionStatusesItem>
    {
        private readonly string _value;

        private DevicePolicyAllowedEncryptionStatusesItem(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// The encryption status of the device is not specified or not known.
        /// </summary>
        public static DevicePolicyAllowedEncryptionStatusesItem EncryptionUnspecified { get; } = new DevicePolicyAllowedEncryptionStatusesItem("ENCRYPTION_UNSPECIFIED");
        /// <summary>
        /// The device does not support encryption.
        /// </summary>
        public static DevicePolicyAllowedEncryptionStatusesItem EncryptionUnsupported { get; } = new DevicePolicyAllowedEncryptionStatusesItem("ENCRYPTION_UNSUPPORTED");
        /// <summary>
        /// The device supports encryption, but is currently unencrypted.
        /// </summary>
        public static DevicePolicyAllowedEncryptionStatusesItem Unencrypted { get; } = new DevicePolicyAllowedEncryptionStatusesItem("UNENCRYPTED");
        /// <summary>
        /// The device is encrypted.
        /// </summary>
        public static DevicePolicyAllowedEncryptionStatusesItem Encrypted { get; } = new DevicePolicyAllowedEncryptionStatusesItem("ENCRYPTED");

        public static bool operator ==(DevicePolicyAllowedEncryptionStatusesItem left, DevicePolicyAllowedEncryptionStatusesItem right) => left.Equals(right);
        public static bool operator !=(DevicePolicyAllowedEncryptionStatusesItem left, DevicePolicyAllowedEncryptionStatusesItem right) => !left.Equals(right);

        public static explicit operator string(DevicePolicyAllowedEncryptionStatusesItem value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is DevicePolicyAllowedEncryptionStatusesItem other && Equals(other);
        public bool Equals(DevicePolicyAllowedEncryptionStatusesItem other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    /// <summary>
    /// Specifies the type of identities that are allowed access to outside the perimeter. If left unspecified, then members of `identities` field will be allowed access.
    /// </summary>
    [EnumType]
    public readonly struct EgressFromIdentityType : IEquatable<EgressFromIdentityType>
    {
        private readonly string _value;

        private EgressFromIdentityType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// No blanket identity group specified.
        /// </summary>
        public static EgressFromIdentityType IdentityTypeUnspecified { get; } = new EgressFromIdentityType("IDENTITY_TYPE_UNSPECIFIED");
        /// <summary>
        /// Authorize access from all identities outside the perimeter.
        /// </summary>
        public static EgressFromIdentityType AnyIdentity { get; } = new EgressFromIdentityType("ANY_IDENTITY");
        /// <summary>
        /// Authorize access from all human users outside the perimeter.
        /// </summary>
        public static EgressFromIdentityType AnyUserAccount { get; } = new EgressFromIdentityType("ANY_USER_ACCOUNT");
        /// <summary>
        /// Authorize access from all service accounts outside the perimeter.
        /// </summary>
        public static EgressFromIdentityType AnyServiceAccount { get; } = new EgressFromIdentityType("ANY_SERVICE_ACCOUNT");

        public static bool operator ==(EgressFromIdentityType left, EgressFromIdentityType right) => left.Equals(right);
        public static bool operator !=(EgressFromIdentityType left, EgressFromIdentityType right) => !left.Equals(right);

        public static explicit operator string(EgressFromIdentityType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is EgressFromIdentityType other && Equals(other);
        public bool Equals(EgressFromIdentityType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    /// <summary>
    /// Specifies the type of identities that are allowed access from outside the perimeter. If left unspecified, then members of `identities` field will be allowed access.
    /// </summary>
    [EnumType]
    public readonly struct IngressFromIdentityType : IEquatable<IngressFromIdentityType>
    {
        private readonly string _value;

        private IngressFromIdentityType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// No blanket identity group specified.
        /// </summary>
        public static IngressFromIdentityType IdentityTypeUnspecified { get; } = new IngressFromIdentityType("IDENTITY_TYPE_UNSPECIFIED");
        /// <summary>
        /// Authorize access from all identities outside the perimeter.
        /// </summary>
        public static IngressFromIdentityType AnyIdentity { get; } = new IngressFromIdentityType("ANY_IDENTITY");
        /// <summary>
        /// Authorize access from all human users outside the perimeter.
        /// </summary>
        public static IngressFromIdentityType AnyUserAccount { get; } = new IngressFromIdentityType("ANY_USER_ACCOUNT");
        /// <summary>
        /// Authorize access from all service accounts outside the perimeter.
        /// </summary>
        public static IngressFromIdentityType AnyServiceAccount { get; } = new IngressFromIdentityType("ANY_SERVICE_ACCOUNT");

        public static bool operator ==(IngressFromIdentityType left, IngressFromIdentityType right) => left.Equals(right);
        public static bool operator !=(IngressFromIdentityType left, IngressFromIdentityType right) => !left.Equals(right);

        public static explicit operator string(IngressFromIdentityType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is IngressFromIdentityType other && Equals(other);
        public bool Equals(IngressFromIdentityType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    /// <summary>
    /// Required. The allowed OS type.
    /// </summary>
    [EnumType]
    public readonly struct OsConstraintOsType : IEquatable<OsConstraintOsType>
    {
        private readonly string _value;

        private OsConstraintOsType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// The operating system of the device is not specified or not known.
        /// </summary>
        public static OsConstraintOsType OsUnspecified { get; } = new OsConstraintOsType("OS_UNSPECIFIED");
        /// <summary>
        /// A desktop Mac operating system.
        /// </summary>
        public static OsConstraintOsType DesktopMac { get; } = new OsConstraintOsType("DESKTOP_MAC");
        /// <summary>
        /// A desktop Windows operating system.
        /// </summary>
        public static OsConstraintOsType DesktopWindows { get; } = new OsConstraintOsType("DESKTOP_WINDOWS");
        /// <summary>
        /// A desktop Linux operating system.
        /// </summary>
        public static OsConstraintOsType DesktopLinux { get; } = new OsConstraintOsType("DESKTOP_LINUX");
        /// <summary>
        /// A desktop ChromeOS operating system.
        /// </summary>
        public static OsConstraintOsType DesktopChromeOs { get; } = new OsConstraintOsType("DESKTOP_CHROME_OS");
        /// <summary>
        /// An Android operating system.
        /// </summary>
        public static OsConstraintOsType Android { get; } = new OsConstraintOsType("ANDROID");
        /// <summary>
        /// An iOS operating system.
        /// </summary>
        public static OsConstraintOsType Ios { get; } = new OsConstraintOsType("IOS");

        public static bool operator ==(OsConstraintOsType left, OsConstraintOsType right) => left.Equals(right);
        public static bool operator !=(OsConstraintOsType left, OsConstraintOsType right) => !left.Equals(right);

        public static explicit operator string(OsConstraintOsType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is OsConstraintOsType other && Equals(other);
        public bool Equals(OsConstraintOsType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }

    /// <summary>
    /// Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
    /// </summary>
    [EnumType]
    public readonly struct ServicePerimeterPerimeterType : IEquatable<ServicePerimeterPerimeterType>
    {
        private readonly string _value;

        private ServicePerimeterPerimeterType(string value)
        {
            _value = value ?? throw new ArgumentNullException(nameof(value));
        }

        /// <summary>
        /// Regular Perimeter.
        /// </summary>
        public static ServicePerimeterPerimeterType PerimeterTypeRegular { get; } = new ServicePerimeterPerimeterType("PERIMETER_TYPE_REGULAR");
        /// <summary>
        /// Perimeter Bridge.
        /// </summary>
        public static ServicePerimeterPerimeterType PerimeterTypeBridge { get; } = new ServicePerimeterPerimeterType("PERIMETER_TYPE_BRIDGE");

        public static bool operator ==(ServicePerimeterPerimeterType left, ServicePerimeterPerimeterType right) => left.Equals(right);
        public static bool operator !=(ServicePerimeterPerimeterType left, ServicePerimeterPerimeterType right) => !left.Equals(right);

        public static explicit operator string(ServicePerimeterPerimeterType value) => value._value;

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object? obj) => obj is ServicePerimeterPerimeterType other && Equals(other);
        public bool Equals(ServicePerimeterPerimeterType other) => string.Equals(_value, other._value, StringComparison.Ordinal);

        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value?.GetHashCode() ?? 0;

        public override string ToString() => _value;
    }
}