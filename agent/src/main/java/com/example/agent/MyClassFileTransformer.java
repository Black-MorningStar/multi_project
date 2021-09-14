package com.example.agent;

import javassist.ClassPool;
import javassist.CtClass;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class MyClassFileTransformer implements ClassFileTransformer {

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        if (className.contains("TestUser")) {
            ClassReader classReader = new ClassReader(classfileBuffer);
            ClassWriter classWriter = new ClassWriter(0);
            ClassVisitor classVisitor = new ClassVisitor(Opcodes.ASM5) {
                @Override
                public void visitEnd() {
                    super.visitEnd();
                    //cv.visitMethod()

                }
            };
        }

        return null;
    }
}
