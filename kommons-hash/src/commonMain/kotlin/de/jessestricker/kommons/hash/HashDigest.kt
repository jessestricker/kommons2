package de.jessestricker.kommons.hash

public interface HashAlgorithm {
    public val name: String
    public val digestSize: Int
}

public interface Hash

public interface HashDigest {
    public val algorithm: HashAlgorithm
    public fun toByteArray(): ByteArray
}

public object Md5 : HashAlgorithm {
    override val name: String = "MD5"
    override val digestSize: Int = 128 / 8
}

public class Md5Digest : HashDigest
