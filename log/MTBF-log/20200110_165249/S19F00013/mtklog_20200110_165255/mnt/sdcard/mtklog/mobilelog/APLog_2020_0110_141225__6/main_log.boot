----- timezone:GMT
01-10 14:12:01.623385   347   347 W auditd  : type=2000 audit(0.0:1): initialized
01-10 14:12:04.378000   347   347 I auditd  : type=1403 audit(0.0:2): policy loaded auid=4294967295 ses=4294967295
01-10 14:12:04.382000   347   347 W auditd  : type=1404 audit(0.0:3): enforcing=1 old_enforcing=0 auid=4294967295 ses=4294967295
01-10 14:12:05.762000   341   341 W e2fsck  : type=1400 audit(0.0:4): avc: denied { read } for name="mmcblk0p7" dev="tmpfs" ino=2134 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
01-10 14:12:05.762000   341   341 W e2fsck  : type=1400 audit(0.0:5): avc: denied { read write } for name="mmcblk0p7" dev="tmpfs" ino=2134 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
01-10 14:12:06.060586   348   348 I SELinux : SELinux: Loaded service_contexts from:
01-10 14:12:06.066549   348   348 I SELinux :     /system/etc/selinux/plat_service_contexts
01-10 14:12:06.138590   350   350 I SELinux : SELinux: Loaded service_contexts from:
01-10 14:12:06.139871   350   350 I SELinux :     /vendor/etc/selinux/vndservice_contexts
01-10 14:12:06.175767   358   358 I AEE_AED : Built Mar 23 2018 13:42:39
01-10 14:12:06.181885   358   358 I AEE_AED : socket server: android:aee_aed
01-10 14:12:06.187961   358   358 D AEE_AED : aed_get_force_config: -100000
01-10 14:12:06.216974   360   360 I AEE_AEDV: Built Mar 23 2018 13:42:46
01-10 14:12:06.217962   360   360 I AEE_AEDV: socket server: android:aee_aedv
01-10 14:12:06.223977   360   360 D AEE_AEDV: aed_get_force_config: -100000
01-10 14:12:06.226000   361   361 W teed    : type=1400 audit(0.0:6): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.226000   361   361 I chatty  : uid=1000(system) /vendor/bin/teed identical 2 lines
01-10 14:12:06.226000   361   361 W teed    : type=1400 audit(0.0:9): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.226000   361   361 W teed    : type=1400 audit(0.0:10): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.226000   361   361 W teed    : type=1400 audit(0.0:11): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.229754   361   361 D tkcore-teec: teed-version: 2.1p19
01-10 14:12:06.229754   361   361 D tkcore-teec: 
01-10 14:12:06.229754   361   361 D tkcore-teec: 
01-10 14:12:06.229977   361   361 D tkcore-teec: tz dev path: /dev/tkcoredrv
01-10 14:12:06.230015   361   361 D tkcore-teec: sdrpmb dev path: /dev/block/platform/bootdevice/by-name/sdrpmb
01-10 14:12:06.230051   361   361 D tkcore-teec: system ta path: /vendor/app/t6
01-10 14:12:06.230080   361   361 D tkcore-teec: sp ta path: /data/tee/t6
01-10 14:12:06.230110   361   361 D tkcore-teec: prot path: /vendor/protect_f/tee
01-10 14:12:06.247308   360   360 I AEE_AEDV: aed_update_coredump_mode: persist.aee.core.dump disable
01-10 14:12:06.248817   358   358 I AEE_AED : aed_update_coredump_mode: persist.aee.core.dump disable
01-10 14:12:06.249494   349   349 E hwservicemanager: BINDER_SET_INHERIT_FIFO_PRIO failed with error -1
01-10 14:12:06.251154   360   360 I AEE_AEDV: aed_update_coredump_mode: persist.aee.core.direct disable
01-10 14:12:06.252461   358   358 I AEE_AED : aed_update_coredump_mode: persist.aee.core.direct disable
01-10 14:12:06.257607   360   360 I AEE_AEDV: AED config
01-10 14:12:06.257607   360   360 I AEE_AEDV:   mode '4'
01-10 14:12:06.257607   360   360 I AEE_AEDV:   exp level '0
01-10 14:12:06.257607   360   360 I AEE_AEDV:   dal enable '0'
01-10 14:12:06.257607   360   360 I AEE_AEDV:   db count '4'
01-10 14:12:06.257607   360   360 I AEE_AEDV:   fatal db count '4'
01-10 14:12:06.257607   360   360 I AEE_AEDV:  db storage '2'
01-10 14:12:06.257607   360   360 I AEE_AEDV:   SMP Info => 1
01-10 14:12:06.257694   360   360 E AEE_AEDV: fail to open prebuild packages list: No such file or directory
01-10 14:12:06.258714   358   358 I AEE_AED : AED config
01-10 14:12:06.258714   358   358 I AEE_AED :   mode '4'
01-10 14:12:06.258714   358   358 I AEE_AED :   exp level '0
01-10 14:12:06.258714   358   358 I AEE_AED :   dal enable '0'
01-10 14:12:06.258714   358   358 I AEE_AED :   db count '4'
01-10 14:12:06.258714   358   358 I AEE_AED :   fatal db count '4'
01-10 14:12:06.258714   358   358 I AEE_AED :  db storage '2'
01-10 14:12:06.258714   358   358 I AEE_AED :   SMP Info => 1
01-10 14:12:06.258779   358   358 E AEE_AED : fail to open prebuild packages list: No such file or directory
01-10 14:12:06.262000   361   361 W tkearlyinit: type=1400 audit(0.0:12): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.265285   362   362 D vndksupport: Loading /vendor/lib64/hw/android.hardware.keymaster@3.0-impl.so from current namespace instead of sphal namespace.
01-10 14:12:06.266310   361   361 D tkcore-teec: SDRPMB: switching active to 0
01-10 14:12:06.282000   361   361 W tkearlyinit: type=1400 audit(0.0:13): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.282000   361   361 W teed    : type=1400 audit(0.0:14): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.282000   361   361 I chatty  : uid=1000(system) /vendor/bin/teed identical 2 lines
01-10 14:12:06.282000   361   361 W teed    : type=1400 audit(0.0:17): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.282000   361   361 W tkuinit : type=1400 audit(0.0:18): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.284638   361   361 D tkcore-teec: SDRPMB: ready active_id=0 start_sect=8225 nr_sects=32768
01-10 14:12:06.286000   361   361 W tkuinit : type=1400 audit(0.0:19): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.286000   361   361 W teed    : type=1400 audit(0.0:20): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.286000   361   361 W teed    : type=1400 audit(0.0:21): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.286096   361   361 D tkcore-teec: TEED-sub: created with PID<368>
01-10 14:12:06.286096   361   361 D tkcore-teec: 
01-10 14:12:06.286235   361   361 D tkcore-teec: tee_supp_fs_init bad statfs(/data/tee/) = -1
01-10 14:12:06.286235   361   361 D tkcore-teec: 
01-10 14:12:06.286281   361   361 D tkcore-teec: error tee_supp_fs_init. Delay it.
01-10 14:12:06.286717   361   361 D tkcore-teec: teed listening on /dev/tkcoredrv
01-10 14:12:06.287301   361   366 D tkcore-teec: tee_userinit enter
01-10 14:12:06.287542   361   366 D tkcore-teec: DEVICE BRAND Datalogic MODEL MEMOR 10 PLATFORM mt6763
01-10 14:12:06.287542   361   366 D tkcore-teec: 
01-10 14:12:06.288280   361   367 D tkcore-teec: <log_teeos> thread started
01-10 14:12:06.288824   361   367 D tkcore-teec: Wait for /data to be mounted.
01-10 14:12:06.306762   362   362 I android.hardware.keymaster@3.0-impl: Fetching keymaster device name default
01-10 14:12:06.307084   362   362 D vndksupport: Loading /vendor/lib64/hw/keystore.mt6763.so from current namespace instead of sphal namespace.
01-10 14:12:06.319803   362   362 I android.hardware.keymaster@3.0-impl: Found keymaster2 module Keymaster TrustKernel HAL, version 200
01-10 14:12:06.326000   361   361 W teed    : type=1400 audit(0.0:22): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.330000   361   361 W teed    : type=1400 audit(0.0:23): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.331182   361   361 D tkcore-teec: load_ta: loading...
01-10 14:12:06.331182   361   361 D tkcore-teec: 
01-10 14:12:06.332257   361   361 D tkcore-teec: error writing to device (18446744073709551615)
01-10 14:12:06.334000   362   362 W android.hardwar: type=1400 audit(0.0:24): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:hal_keymaster_default:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.338681   362   362 D tkcore-teec: open session to TA UUID 9ef77781 7bd5 4e39 failed
01-10 14:12:06.338681   362   362 D tkcore-teec: 
01-10 14:12:06.338797   362   362 E KeymasterHAL: module.cpp:2124:  OpenSession failed with 0xffff0000
01-10 14:12:06.363153   356   356 I AEE_AED : Built Mar 23 2018 13:42:19
01-10 14:12:06.363558   359   359 I AEE_AEDV: Built Mar 23 2018 13:42:26
01-10 14:12:06.364445   356   356 I AEE_AED : socket server: android:aee_aed32
01-10 14:12:06.364445   359   359 I AEE_AEDV: socket server: android:aee_aedv32
01-10 14:12:06.364790   356   356 D AEE_AED : aed_get_force_config: -100000
01-10 14:12:06.365359   356   356 I AEE_AED : AED config
01-10 14:12:06.365359   356   356 I AEE_AED :   mode '4'
01-10 14:12:06.365359   356   356 I AEE_AED :   exp level '0
01-10 14:12:06.365359   356   356 I AEE_AED :   dal enable '0'
01-10 14:12:06.365359   356   356 I AEE_AED :   db count '4'
01-10 14:12:06.365359   356   356 I AEE_AED :   fatal db count '4'
01-10 14:12:06.365359   356   356 I AEE_AED :  db storage '2'
01-10 14:12:06.365359   356   356 I AEE_AED :   SMP Info => 1
01-10 14:12:06.365477   356   356 E AEE_AED : fail to get prebuild packages: No such file or directory
01-10 14:12:06.365511   356   356 E AEE_AED : init_aed_setting: fail to open db history file 
01-10 14:12:06.365532   356   356 D AEE_AED : aee_exception_running_64: send req to debuggerd64
01-10 14:12:06.365700   356   356 D AEE_AED : aee:rttd_64Rtt waiting 64_daemon finish the job...
01-10 14:12:06.365945   359   359 D AEE_AEDV: aed_get_force_config: -100000
01-10 14:12:06.366506   359   359 I AEE_AEDV: AED config
01-10 14:12:06.366506   359   359 I AEE_AEDV:   mode '4'
01-10 14:12:06.366506   359   359 I AEE_AEDV:   exp level '0
01-10 14:12:06.366506   359   359 I AEE_AEDV:   dal enable '0'
01-10 14:12:06.366506   359   359 I AEE_AEDV:   db count '4'
01-10 14:12:06.366506   359   359 I AEE_AEDV:   fatal db count '4'
01-10 14:12:06.366506   359   359 I AEE_AEDV:  db storage '2'
01-10 14:12:06.366506   359   359 I AEE_AEDV:   SMP Info => 1
01-10 14:12:06.366567   359   359 E AEE_AEDV: fail to open prebuild packages list: No such file or directory
01-10 14:12:06.366620   359   359 E AEE_AEDV: init_aed_setting: fail to open db history file 
01-10 14:12:06.366647   359   359 D AEE_AEDV: aee_exception_running_64: send req to debuggerd64
01-10 14:12:06.366788   359   359 D AEE_AEDV: aee:vrttd_64Rtt waiting 64_daemon finish the job...
01-10 14:12:06.375426   358   358 D AEE_AED : $===AEE===AEE===AEE===$
01-10 14:12:06.375500   358   358 D AEE_AED : p 0 poll events 1 revents 1
01-10 14:12:06.375563   358   358 D AEE_AED : requesting from: pid=356 cmd=9
01-10 14:12:06.375575   358   358 D AEE_AED : Go RTT_AEE_GET_EXCEPTION_RUNNING
01-10 14:12:06.375709   356   356 D AEE_AED : Rtt send 64 req done
01-10 14:12:06.375821   356   356 E AEE_AED : Can't remove file /data/aee_exp/temp: No such file or directory
01-10 14:12:06.377524   360   360 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 14:12:06.377622   360   360 D AEE_AEDV: p 0 poll events 1 revents 1
01-10 14:12:06.377669   360   360 D AEE_AEDV: requesting from: pid=359 cmd=9
01-10 14:12:06.377681   360   360 D AEE_AEDV: Go RTT_AEE_GET_EXCEPTION_RUNNING
01-10 14:12:06.377787   359   359 D AEE_AEDV: Rtt send 64 req done
01-10 14:12:06.377886   359   359 E AEE_AEDV: Can't remove file /data/vendor/mtklog/aee_exp/temp: No such file or directory
01-10 14:12:06.378018   359   359 E AEE_AEDV: Can't remove file /sdcard/mtklog/aee_exp/temp: No such file or directory
01-10 14:12:06.378053   359   359 E AEE_AEDV: Can't remove file /storage/ext_sd/mtklog/aee_exp/temp: No such file or directory
01-10 14:12:06.379007   359   359 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 14:12:06.379073   359   359 D AEE_AEDV: p 5 poll events 1 revents 1
01-10 14:12:06.379314   359   359 D AEE_AEDV: PPM cpu cores:8, online:8
01-10 14:12:06.379846   359   359 D AEE_AEDV: aed_main_fork_worker: generator 0xe86155f0, worker 0xffa73448, recv_fd 0
01-10 14:12:06.380715   373   373 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 14:12:06.380789   373   373 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 14:12:06.380819   373   373 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 14:12:06.381610   373   373 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 14:12:06.381761   373   373 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 14:12:06.382594   373   373 W AEE_AEDV: ipanic heahder: magic:0, version:0, size:0, datas:0
01-10 14:12:06.382625   373   373 W AEE_AEDV: ipanic heahder: dhblk:0, blksize:0, partsize:0, bufsize:0
01-10 14:12:06.382704   373   373 W AEE_AEDV: aed_reboot_session, no valid ipanic header, ignored
01-10 14:12:06.382784   373   373 V ETM     : open etb_get_nr fail! , default etb_nr is 1 , (2, No such file or directory)
01-10 14:12:06.382875   373   373 V ETM     : open etb_length fail! (2, No such file or directory)
01-10 14:12:06.382908   373   373 V ETM     : open etb_length fail! (2, No such file or directory)
01-10 14:12:06.383630   373   373 I AEE_AEDV: wdt_status = 2, fiq_step=0, exception_type:0 
01-10 14:12:06.383770   373   373 I AEE_AEDV: powerup reason:wdt_by_pass_pwk
01-10 14:12:06.383770   373   373 I AEE_AEDV: 
01-10 14:12:06.383795   373   373 I AEE_AEDV: reboot_reason = 0
01-10 14:12:06.384029   373   373 E         : mrdump_support_user_load: null mrdump lk version
01-10 14:12:06.384088   373   373 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 14:12:06.384126   373   373 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 14:12:06.384150   373   373 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 14:12:06.384674   373   373 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 14:12:06.384739   373   373 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 14:12:06.385406   373   373 D AEE_AEDV: version(aabbccdd)
01-10 14:12:06.386422   359   359 D AEE_AEDV: clear ppm settings
01-10 14:12:06.387093   359   359 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 14:12:06.391562   372   372 I /system/bin/tzdatacheck: timezone distro dir /data/misc/zoneinfo/current does not exist. No action required.
01-10 14:12:06.538960   375   375 I ServiceManagement: Removing namespace from process name android.hidl.allocator@1.0-service to allocator@1.0-s.
01-10 14:12:06.558593   381   381 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[381]: allowing syscall: connect
01-10 14:12:06.558753   381   381 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[381]: allowing syscall: fcntl
01-10 14:12:06.558811   381   381 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[381]: allowing syscall: sendto
01-10 14:12:06.558852   381   381 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[381]: allowing syscall: socket
01-10 14:12:06.558890   381   381 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[381]: allowing syscall: writev
01-10 14:12:06.572545   381   381 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[381]: logging seccomp filter failures
01-10 14:12:06.573245   381   381 I ServiceManagement: Removing namespace from process name android.hardware.configstore@1.0-service to configstore@1.0.
01-10 14:12:06.621392   388   388 I ServiceManagement: Removing namespace from process name android.hardware.memtrack@1.0-service to memtrack@1.0-se.
01-10 14:12:06.623181   388   388 I android.hardware.memtrack@1.0-service: Registration complete for android.hardware.memtrack@1.0::IMemtrack/default.
01-10 14:12:06.623374   387   387 E         : light_open lights bluetooth failed: -22
01-10 14:12:06.623527   387   387 E         : Light passthrough failed to load legacy HAL.
01-10 14:12:06.624070   387   387 E         : light_open lights wifi failed: -22
01-10 14:12:06.624123   387   387 E         : Light passthrough failed to load legacy HAL.
01-10 14:12:06.624899   387   387 I ServiceManagement: Removing namespace from process name android.hardware.light@2.0-service-mediatek to light@2.0-servi.
01-10 14:12:06.634150   387   387 I android.hardware.light@2.0-service-mediatek: Registration complete for android.hardware.light@2.0::ILight/default.
01-10 14:12:06.636548   408   408 I wmt_launcher: get property(service.wcn.driver.ready) is no
01-10 14:12:06.636748   378   378 I ServiceManagement: Removing namespace from process name android.hardware.bluetooth@1.0-service-mediatek to bluetooth@1.0-s.
01-10 14:12:06.636954   389   389 I ServiceManagement: Removing namespace from process name android.hardware.thermal@1.0-service to thermal@1.0-ser.
01-10 14:12:06.643826   378   378 I android.hardware.bluetooth@1.0-service-mediatek: Registration complete for android.hardware.bluetooth@1.0::IBluetoothHci/default.
01-10 14:12:06.645281   389   389 I android.hardware.thermal@1.0-service: Registration complete for android.hardware.thermal@1.0::IThermal/default.
01-10 14:12:06.655881   376   376 I         : [VT][SRV]before VTService_HiDL_instantiate
01-10 14:12:06.660602   407   407 I wmt_loader: Can't open device node(/dev/wmtdetect) count(1)
01-10 14:12:06.672678   376   376 I         : Registration complete for vendor.mediatek.hardware.videotelephony@1.0::IVideoTelephony/default.
01-10 14:12:06.673635   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.health@1.0::IHealth/default in either framework or device manifest.
01-10 14:12:06.675527   397   397 I lowmemorykiller: running re-execed
01-10 14:12:06.675923   397   397 I lowmemorykiller: Using in-kernel low memory killer interface
01-10 14:12:06.677879   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.thermal@1.1::IThermal/default in either framework or device manifest.
01-10 14:12:06.678805   399   399 W thermalserviced: Unable to get Thermal HAL V1.1, vendor thermal event notification not available
01-10 14:12:06.692248   394   414 I vendor.mediatek.hardware.power@1.1-service: mtkPowerService - data:0x0
01-10 14:12:06.696372   379   379 I ServiceManagement: Removing namespace from process name android.hardware.broadcastradio@1.1-service to broadcastradio@.
01-10 14:12:06.696516   384   384 I GatekeeperHAL: Init device
01-10 14:12:06.698000   361   361 W teed    : type=1400 audit(0.0:25): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.698000   361   361 W teed    : type=1400 audit(0.0:26): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.702000   361   361 W teed    : type=1400 audit(0.0:27): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.702000   361   361 W teed    : type=1400 audit(0.0:28): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:06.703087   401   401 E ccci_fsd(0): md_fsd Ver:v2.2, CCCI Ver:6
01-10 14:12:06.703773   402   402 E ccci_fsd(0): md_fsd Ver:v2.2, CCCI Ver:6
01-10 14:12:06.704279   395   395 I vendor.nxp.nxpnfc@1.0-service: Registration complete for android.hardware.nfc@1.0::INfc/default.
01-10 14:12:06.712009   380   380 I ServiceManagement: Removing namespace from process name android.hardware.cas@1.0-service to cas@1.0-service.
01-10 14:12:06.713906   403   403 I ccci_mdinit: (1):md_init ver:2.20, sub:0
01-10 14:12:06.728475   392   392 I DynamicFpsPolicy: try to new 1 refresh ranges
01-10 14:12:06.729683   392   392 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.dfps@1.0-service to dfps@1.0-servic.
01-10 14:12:06.733197   393   393 E MtkCodecService: MtkCodecService service create
01-10 14:12:06.737039   392   392 I vendor.mediatek.hardware.dfps@1.0-service: Registration complete for vendor.mediatek.hardware.dfps@1.0::IFpsPolicyService/default.
01-10 14:12:06.737671   393   393 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.mtkcodecservice@1.1-service to mtkcodecservice.
01-10 14:12:06.742622   393   393 I vendor.mediatek.hardware.mtkcodecservice@1.0-service: Registration complete for vendor.mediatek.hardware.mtkcodecservice@1.1::IMtkCodecService/default.
01-10 14:12:06.744528   403   403 I ccci_mdinit: (1):[init.svc.gsm0710muxd][init.svc.ril-daemon-mtk][init.svc.emdlogger1][init.svc.ccci_fsd]
01-10 14:12:06.744543   394   413 I libPerfService: perfservice ver:V7.0
01-10 14:12:06.746515   392   417 I DynamicFpsPolicy: oldRequest: fps[0] mode[0] --> newRequest: fps[-1] mode[0] num[r:0|rs:0]
01-10 14:12:06.746545   394   413 I libPerfService: checkDrvSupport hps failed: No such file or directory
01-10 14:12:06.746607   392   417 I DynamicFpsPolicy: oldRequest: fps[-1] mode[0] --> newRequest: fps[-1] mode[0] num[r:0|rs:0]
01-10 14:12:06.746653   394   413 I libPerfService: checkDrvSupport cpufreq failed: No such file or directory
01-10 14:12:06.747507   394   413 I libPerfService: checkDrvSupport - perfmgr:1, ppm:1, ppmAll:1, acao:1, hmp:1, hps:0, hevc:0, fliper:0, sysfs:1, dvfs:1, turbo:1, fstb:1
01-10 14:12:06.747677   394   413 I libPerfService: getCputopoInfo - cpuNum:8, cluster:2, cputopoCluster:2
01-10 14:12:06.747934   394   413 I libPerfService: [cluster 0]: cpu:4, first:0, freq count:16, max_freq:1508000
01-10 14:12:06.747997   394   413 I libPerfService:   0: 338000
01-10 14:12:06.748041   394   413 I libPerfService:   1: 481000
01-10 14:12:06.748059   394   413 I libPerfService:   2: 624000
01-10 14:12:06.748069   394   413 I libPerfService:   3: 715000
01-10 14:12:06.748081   394   413 I libPerfService:   4: 793000
01-10 14:12:06.748088   394   413 I libPerfService:   5: 884000
01-10 14:12:06.748096   394   413 I libPerfService:   6: 1001000
01-10 14:12:06.748104   394   413 I libPerfService:   7: 1105000
01-10 14:12:06.748111   394   413 I libPerfService:   8: 1183000
01-10 14:12:06.748121   394   413 I libPerfService:   9: 1235000
01-10 14:12:06.748129   394   413 I libPerfService:   10: 1300000
01-10 14:12:06.748137   394   413 I libPerfService:   11: 1365000
01-10 14:12:06.748145   394   413 I libPerfService:   12: 1404000
01-10 14:12:06.748153   394   413 I libPerfService:   13: 1430000
01-10 14:12:06.748160   394   413 I libPerfService:   14: 1482000
01-10 14:12:06.748167   394   413 I libPerfService:   15: 1508000
01-10 14:12:06.748326   394   413 I libPerfService: [cluster 1]: cpu:4, first:4, freq count:16, max_freq:2002000
01-10 14:12:06.748345   394   413 I libPerfService:   0: 520000
01-10 14:12:06.748355   394   413 I libPerfService:   1: 715000
01-10 14:12:06.748363   394   413 I libPerfService:   2: 910000
01-10 14:12:06.748370   394   413 I libPerfService:   3: 1040000
01-10 14:12:06.748378   394   413 I libPerfService:   4: 1170000
01-10 14:12:06.748385   394   413 I libPerfService:   5: 1287000
01-10 14:12:06.748394   394   413 I libPerfService:   6: 1456000
01-10 14:12:06.748402   394   413 I libPerfService:   7: 1586000
01-10 14:12:06.748410   394   413 I libPerfService:   8: 1690000
01-10 14:12:06.748417   394   413 I libPerfService:   9: 1742000
01-10 14:12:06.748424   394   413 I libPerfService:   10: 1807000
01-10 14:12:06.748435   394   413 I libPerfService:   11: 1859000
01-10 14:12:06.748443   394   413 I libPerfService:   12: 1911000
01-10 14:12:06.748450   394   413 I libPerfService:   13: 1937000
01-10 14:12:06.748457   394   413 I libPerfService:   14: 1976000
01-10 14:12:06.748465   394   413 I libPerfService:   15: 2002000
01-10 14:12:06.748523   394   413 E libPerfService: Could not open '/sys/kernel/debug/fpsgo/fstb/fstb_soft_level'
01-10 14:12:06.748545   394   413 E libPerfService: error : 2, No such file or directory
01-10 14:12:06.748554   394   413 I libPerfService: pFstbDefaultFps:1 60-26 
01-10 14:12:06.748750   394   413 I libPerfService: nGpuFreqCount:2
01-10 14:12:06.749674   385   385 I ServiceManagement: Removing namespace from process name android.hardware.graphics.allocator@2.0-service to allocator@2.0-s.
01-10 14:12:06.751198   385   385 I android.hardware.graphics.allocator@2.0-service: Registration complete for android.hardware.graphics.allocator@2.0::IAllocator/default.
01-10 14:12:06.752052   394   413 E libPerfService: No GiFT Tags
01-10 14:12:06.752124   394   413 I libPerfService: [init] nXmlPackNum:12 nXmlActivityNum:12 nXmlCmdNum:15 nXmlGiftTagNum:0 nXmlGiftAttrNum:0
01-10 14:12:06.752321   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:0 cmd:CMD_SET_CLUSTER_CPU_CORE_MIN pack:com.imangi.templerun2, activity:Common0 p1:0 p2:3 p3:0 p4:0
01-10 14:12:06.752366   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:1 cmd:CMD_SET_SPORTS_MODE pack:com.andromeda.androbench2, activity:Common1 p1:1 p2:0 p3:0 p4:0
01-10 14:12:06.752410   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:2 cmd:CMD_SET_SPORTS_MODE pack:com.futuremark.pcmark.android.benchmark, activity:Common2 p1:1 p2:0 p3:0 p4:0
01-10 14:12:06.752446   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:3 cmd:CMD_SET_SPORTS_MODE pack:com.antutu.ABenchMark, activity:Common3 p1:1 p2:0 p3:0 p4:0
01-10 14:12:06.752481   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:4 cmd:CMD_SET_SPORTS_MODE pack:com.antutu.benchmark.full, activity:Common4 p1:1 p2:0 p3:0 p4:0
01-10 14:12:06.752522   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:5 cmd:CMD_SET_SPORTS_MODE pack:com.primatelabs.geekbench, activity:Common5 p1:1 p2:0 p3:0 p4:0
01-10 14:12:06.752557   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:6 cmd:CMD_SET_SPORTS_MODE pack:com.aurorasoftworks.quadrant.ui.professional, activity:Common6 p1:1 p2:0 p3:0 p4:0
01-10 14:12:06.752599   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:7 cmd:CMD_SET_SPORTS_MODE pack:com.aurorasoftworks.quadrant.ui.advanced, activity:Common7 p1:1 p2:0 p3:0 p4:0
01-10 14:12:06.752636   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:8 cmd:CMD_SET_PACK_BOOST_TIMEOUT pack:com.tencent.tmgp.sgame, activity:Common8 p1:25 p2:0 p3:0 p4:0
01-10 14:12:06.752665   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:9 cmd:CMD_SET_FSTB_FPS pack:com.tencent.tmgp.sgame, activity:Common8 p1:60 p2:30 p3:0 p4:0
01-10 14:12:06.752694   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:10 cmd:CMD_SET_FBT_FLOOR_BOUND pack:com.tencent.tmgp.sgame, activity:Common8 p1:1 p2:0 p3:0 p4:0
01-10 14:12:06.752722   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:11 cmd:CMD_SET_FBT_KMIN pack:com.tencent.tmgp.sgame, activity:Common8 p1:10 p2:0 p3:0 p4:0
01-10 14:12:06.752763   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:12 cmd:CMD_SET_FSTB_FPS pack:com.gameloft.android.ANMP.GloftA8HM, activity:Common9 p1:30 p2:30 p3:0 p4:0
01-10 14:12:06.752800   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:13 cmd:CMD_SET_FSTB_FPS pack:com.happyelements.AndroidAnimal.qq, activity:Common10 p1:50 p2:26 p3:0 p4:0
01-10 14:12:06.752835   394   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:14 cmd:CMD_SET_FSTB_FPS pack:com.happyelements.AndroidAnimal, activity:Common11 p1:50 p2:26 p3:0 p4:0
01-10 14:12:06.752907   394   413 I libPerfService: [get_activity_totalnum]  total ture activity num :12
01-10 14:12:06.752931   394   413 I libPerfService: [init] nPackNum:12
01-10 14:12:06.757590   383   383 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service.widevine to drm@1.0-service.
01-10 14:12:06.759909   394   413 I libPerfService: CMD_SET_PPM_ROOT_CLUSTER doesn't have write permission!!!!
01-10 14:12:06.760000   394   413 I libPerfService: write of /proc/ppm/root_cluster failed: No such file or directory
01-10 14:12:06.760066   394   413 E libPerfService: Could not open '/proc/ppm/root_cluster'
01-10 14:12:06.760080   394   413 E libPerfService: error : 2, No such file or directory
01-10 14:12:06.760111   394   413 I libPerfService: CMD_SET_HPS_UP_THRESHOLD doesn't have write permission!!!!
01-10 14:12:06.760122   394   413 I libPerfService: write of /proc/hps/up_threshold failed: No such file or directory
01-10 14:12:06.760145   394   413 I libPerfService: CMD_SET_HPS_DOWN_THRESHOLD doesn't have write permission!!!!
01-10 14:12:06.760178   394   413 I libPerfService: write of /proc/hps/down_threshold failed: No such file or directory
01-10 14:12:06.760182   383   383 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service.widevine to drm@1.0-service.
01-10 14:12:06.760231   394   413 I libPerfService: CMD_SET_VCORE_BW_THRES doesn't have write permission!!!!
01-10 14:12:06.760242   394   413 I libPerfService: write of /proc/fliperfs/cg_threshold failed: No such file or directory
01-10 14:12:06.760284   394   413 I libPerfService: CMD_SET_VCORE_BW_ENABLED doesn't have write permission!!!!
01-10 14:12:06.760305   394   413 I libPerfService: write of /proc/fliperfs/cg_enable failed: No such file or directory
01-10 14:12:06.760682   394   413 I libPerfService: CMD_SET_HPS_RBOOST_THRESH doesn't have write permission!!!!
01-10 14:12:06.760720   394   413 I libPerfService: write of /proc/hps/rush_boost_threshold failed: No such file or directory
01-10 14:12:06.760818   394   413 I libPerfService: CMD_SET_PPM_HOLD_TIME_LL_ONLY doesn't have write permission!!!!
01-10 14:12:06.760866   394   413 I libPerfService: write of /proc/ppm/policy/hica_settings/LL_ONLY_to_ALL/capacity_hold_time failed: No such file or directory
01-10 14:12:06.760970   409   409 I STATUSD : 2606:main(): ignore
01-10 14:12:06.762007   394   413 E libPerfService: Could not open '/proc/perfmgr/smart/native_is_running'
01-10 14:12:06.762064   394   413 E libPerfService: error : 2, No such file or directory
01-10 14:12:06.762107   394   413 E libPerfService: Could not open '/proc/perfmgr/smart/hps_check_duration'
01-10 14:12:06.762118   394   413 E libPerfService: error : 2, No such file or directory
01-10 14:12:06.762186   394   413 I libPerfService: [updateScnListfromXML] new activity from perf_app, num:0
01-10 14:12:06.762803   394   413 I libPerfService: [updateScnListfromXML] new activity from perf_app and whiteList, num:12
01-10 14:12:06.767757   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:12, param_1:0, param_2:4
01-10 14:12:06.767830   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:12, param_1:0, param_2:3000000
01-10 14:12:06.767851   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:12, param_1:1, param_2:4
01-10 14:12:06.767868   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:12, param_1:1, param_2:3000000
01-10 14:12:06.767883   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:12, param_1:1100, param_2:3000000
01-10 14:12:06.767919   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:11, param_1:0, param_2:4
01-10 14:12:06.767934   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:11, param_1:0, param_2:3000000
01-10 14:12:06.767951   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:11, param_1:1, param_2:4
01-10 14:12:06.767967   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:11, param_1:1, param_2:3000000
01-10 14:12:06.767982   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:11, param_1:1, param_2:3000000
01-10 14:12:06.768000   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:11, param_1:0, param_2:3000000
01-10 14:12:06.768019   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:11, param_1:1100, param_2:3000000
01-10 14:12:06.768050   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:8, param_1:0, param_2:4
01-10 14:12:06.768066   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:8, param_1:0, param_2:3000000
01-10 14:12:06.768081   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:8, param_1:1, param_2:4
01-10 14:12:06.768096   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:8, param_1:1, param_2:3000000
01-10 14:12:06.768110   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:8, param_1:1, param_2:3000000
01-10 14:12:06.768127   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:8, param_1:0, param_2:3000000
01-10 14:12:06.768143   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:8, param_1:1100, param_2:3000000
01-10 14:12:06.768168   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_FPSGO_ENABLE, scn:8, param_1:0, param_2:3000000
01-10 14:12:06.768187   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:10, param_1:0, param_2:4
01-10 14:12:06.768213   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:10, param_1:0, param_2:3000000
01-10 14:12:06.768228   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:10, param_1:1, param_2:4
01-10 14:12:06.768251   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:10, param_1:1, param_2:3000000
01-10 14:12:06.768266   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:10, param_1:1, param_2:3000000
01-10 14:12:06.768290   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:10, param_1:0, param_2:3000000
01-10 14:12:06.768316   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:10, param_1:1100, param_2:3000000
01-10 14:12:06.768342   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:14, param_1:0, param_2:4
01-10 14:12:06.768366   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:14, param_1:0, param_2:3000000
01-10 14:12:06.768391   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:14, param_1:1, param_2:4
01-10 14:12:06.768407   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:14, param_1:1, param_2:3000000
01-10 14:12:06.768428   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:14, param_1:1, param_2:3000000
01-10 14:12:06.768446   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:14, param_1:0, param_2:3000000
01-10 14:12:06.768471   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:14, param_1:1100, param_2:3000000
01-10 14:12:06.768499   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:13, param_1:0, param_2:4
01-10 14:12:06.768515   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:13, param_1:0, param_2:3000000
01-10 14:12:06.768542   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:13, param_1:1, param_2:4
01-10 14:12:06.768558   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:13, param_1:1, param_2:3000000
01-10 14:12:06.768572   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:13, param_1:1, param_2:3000000
01-10 14:12:06.768601   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:13, param_1:0, param_2:3000000
01-10 14:12:06.768621   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:13, param_1:1100, param_2:3000000
01-10 14:12:06.768650   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_FPSGO_ENABLE, scn:13, param_1:0, param_2:3000000
01-10 14:12:06.768682   394   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CPU_PERF_MODE, scn:18, param_1:1, param_2:3000000
01-10 14:12:06.769428   390   390 I ServiceManagement: Removing namespace from process name android.hardware.vibrator@1.0-service to vibrator@1.0-se.
01-10 14:12:06.771329   390   390 I android.hardware.vibrator@1.0-service: Registration complete for android.hardware.vibrator@1.0::IVibrator/default.
01-10 14:12:06.779872   395   395 E         : HIDL_FETCH_INxpNfc
01-10 14:12:06.782153   395   395 I ServiceManagement: Removing namespace from process name vendor.nxp.nxpnfc@1.0-service to nxpnfc@1.0-serv.
01-10 14:12:06.783371   395   395 I vendor.nxp.nxpnfc@1.0-service: Registration complete for vendor.nxp.nxpnfc@1.0::INxpNfc/default.
01-10 14:12:06.809354   394   413 I libPerfService: [init] nFbcSupport:1
01-10 14:12:06.809440   394   413 I libPerfService: [init] nThmSupport:1
01-10 14:12:06.809540   394   413 I powerd  : [powerd_core_pre_init] gtCusHintTbl[0]:36
01-10 14:12:06.809634   394   413 I powerd  : [powerd_core_pre_init] gtCusHintTbl[1]:37
01-10 14:12:06.809645   394   413 I powerd  : [powerd_core_pre_init] gtCusHintTbl[2]:38
01-10 14:12:06.809659   394   413 I powerd  : [powerd_core_pre_init] i:12, j:0, walt scn:-1, t:-1, ud:0
01-10 14:12:06.809670   394   413 I powerd  : [powerd_core_pre_init] i:14, j:0, walt scn:-1, t:-1, ud:0
01-10 14:12:06.809681   394   413 I powerd  : [powerd_core_pre_init] i:16, j:0, walt scn:-1, t:-1, ud:0
01-10 14:12:06.809689   394   413 I powerd  : [powerd_core_pre_init] pboost_timeout: 0
01-10 14:12:06.809719   394   413 I vendor.mediatek.hardware.power@1.1-impl: mtkPowerManager - data:0x0
01-10 14:12:06.819808   394   414 I MTKPowerHAL: power_open: enter; name=power
01-10 14:12:06.819969   394   414 I MTKPowerHAL: power_init
01-10 14:12:06.820879   394   414 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.power@1.1-service to power@1.1-servi.
01-10 14:12:06.822491   394   414 I vendor.mediatek.hardware.power@1.1-service: Registration complete for vendor.mediatek.hardware.power@1.1::IPower/default.
01-10 14:12:06.837996   382   382 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service to drm@1.0-service.
01-10 14:12:06.839192   382   382 I android.hardware.drm@1.0-service: Registration complete for android.hardware.drm@1.0::IDrmFactory/default.
01-10 14:12:06.841575   382   382 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service to drm@1.0-service.
01-10 14:12:06.842515   382   382 I android.hardware.drm@1.0-service: Registration complete for android.hardware.drm@1.0::ICryptoFactory/default.
01-10 14:12:06.866562   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::maxFrameBufferAcquiredBuffers retrieved: 3
01-10 14:12:06.869522   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::startGraphicsAllocatorService retrieved: 0
01-10 14:12:06.873831   398   398 I SurfaceFlinger: SurfaceFlinger is starting
01-10 14:12:06.874270   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::vsyncEventPhaseOffsetNs retrieved: 8300000
01-10 14:12:06.874529   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::vsyncSfEventPhaseOffsetNs retrieved: 8300000
01-10 14:12:06.874658   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasSyncFramework retrieved: 1
01-10 14:12:06.874806   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::useContextPriority retrieved: 0 (default)
01-10 14:12:06.874922   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::presentTimeOffsetFromVSyncNs retrieved: 0
01-10 14:12:06.875026   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::useHwcForRGBtoYUV retrieved: 1
01-10 14:12:06.875161   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::maxVirtualDisplaySize retrieved: 0 (default)
01-10 14:12:06.875280   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::useVrFlinger retrieved: 0 (default)
01-10 14:12:06.875311   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::maxFrameBufferAcquiredBuffers retrieved: 3
01-10 14:12:06.875446   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 14:12:06.891299   377   377 I ServiceManagement: Removing namespace from process name android.hardware.audio@2.0-service-mediatek to audio@2.0-servi.
01-10 14:12:06.892417   377   377 I mtkaudiohalservice: Registration complete for android.hardware.audio@2.0::IDevicesFactory/default.
01-10 14:12:06.894006   398   398 E DynamicFpsPolicy: FpsVsync link done
01-10 14:12:06.894701   392   392 I DynamicFpsPolicy: registerCallback: registerrr cb:1  target:1
01-10 14:12:06.894998   398   398 I SurfaceFlinger: FD resource: cur[4096]  max[4096]
01-10 14:12:06.895094   398   398 I SurfaceFlinger: Disabling backpressure propagation
01-10 14:12:06.895113   398   398 I SurfaceFlinger: Disabling Triple Buffering
01-10 14:12:06.924092   398   398 I SurfaceFlinger: SurfaceFlinger's main thread ready to run. Initializing graphics H/W...
01-10 14:12:06.924190   398   398 I SurfaceFlinger: Phase offest NS: 8300000
01-10 14:12:06.936870   408   408 I wmt_launcher: get property(service.wcn.driver.ready) is no
01-10 14:12:06.961188   407   407 I wmt_loader: chip id from property:-1
01-10 14:12:07.043983   384   384 I GatekeeperHAL: Open session successfully
01-10 14:12:07.045169   384   384 I ServiceManagement: Removing namespace from process name android.hardware.gatekeeper@1.0-service to gatekeeper@1.0-.
01-10 14:12:07.047486   384   384 I android.hardware.gatekeeper@1.0-service: Registration complete for android.hardware.gatekeeper@1.0::IGatekeeper/default.
01-10 14:12:07.057322   377   377 I mtkaudiohalservice: Registration complete for android.hardware.audio.effect@2.0::IEffectsFactory/default.
01-10 14:12:07.058030   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.soundtrigger@2.0::ISoundTriggerHw/default in either framework or device manifest.
01-10 14:12:07.061994   377   377 E mtkaudiohalservice: Could not get passthrough implementation for android.hardware.soundtrigger@2.0::ISoundTriggerHw/default.
01-10 14:12:07.062100   377   377 E mtkaudiohalservice: Error while registering soundtrigger service: 1
01-10 14:12:07.095795   386   386 I hwcomposer: [HWC] FD resource: cur[4096]  max[4096]
01-10 14:12:07.095795   386   386 I hwcomposer:   
01-10 14:12:07.097239   386   386 I ServiceManagement: Removing namespace from process name android.hardware.graphics.composer@2.1-service to composer@2.1-se.
01-10 14:12:07.098810   386   386 I android.hardware.graphics.composer@2.1-service: Registration complete for android.hardware.graphics.composer@2.1::IComposer/default.
01-10 14:12:07.237151   408   408 I wmt_launcher: get property(service.wcn.driver.ready) is no
01-10 14:12:07.320490   398   398 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 14:12:07.321536   398   398 I SurfaceFlinger: EventThread Client Pid (398) created
01-10 14:12:07.324510   398   398 I SurfaceFlinger: EGL information:
01-10 14:12:07.324572   398   398 I SurfaceFlinger: vendor    : Android
01-10 14:12:07.324580   398   398 I SurfaceFlinger: version   : 1.4 Android META-EGL
01-10 14:12:07.324589   398   398 I SurfaceFlinger: extensions: EGL_KHR_get_all_proc_addresses EGL_ANDROID_presentation_time EGL_KHR_swap_buffers_with_damage EGL_ANDROID_get_native_client_buffer EGL_ANDROID_front_buffer_auto_refresh EGL_ANDROID_get_frame_timestamps EGL_KHR_image EGL_KHR_image_base EGL_KHR_gl_colorspace EGL_KHR_gl_texture_2D_image EGL_KHR_gl_texture_cubemap_image EGL_KHR_gl_renderbuffer_image EGL_KHR_fence_sync EGL_KHR_create_context EGL_KHR_config_attribs EGL_KHR_surfaceless_context EGL_EXT_create_context_robustness EGL_ANDROID_image_native_buffer EGL_KHR_wait_sync EGL_ANDROID_recordable EGL_KHR_partial_update EGL_KHR_mutable_render_buffer EGL_IMG_context_priority EGL_KHR_no_config_context 
01-10 14:12:07.324599   398   398 I SurfaceFlinger: Client API: OpenGL_ES
01-10 14:12:07.324608   398   398 I SurfaceFlinger: EGLSurface: 8-8-8-8, config=0x7f7b7c3008
01-10 14:12:07.325860   398   398 I SurfaceFlinger: OpenGL ES informations:
01-10 14:12:07.325893   398   398 I SurfaceFlinger: vendor    : ARM
01-10 14:12:07.325900   398   398 I SurfaceFlinger: renderer  : Mali-G71
01-10 14:12:07.325907   398   398 I SurfaceFlinger: version   : OpenGL ES 3.2 v1.r9p0-01rel0.83a3bc72fddd1868f17b698165c9be5c
01-10 14:12:07.325915   398   398 I SurfaceFlinger: extensions: GL_EXT_debug_marker GL_ARM_rgba8 GL_ARM_mali_shader_binary GL_OES_depth24 GL_OES_depth_texture GL_OES_depth_texture_cube_map GL_OES_packed_depth_stencil GL_OES_rgb8_rgba8 GL_EXT_read_format_bgra GL_OES_compressed_paletted_texture GL_OES_compressed_ETC1_RGB8_texture GL_OES_standard_derivatives GL_OES_EGL_image GL_OES_EGL_image_external GL_OES_EGL_image_external_essl3 GL_OES_EGL_sync GL_OES_texture_npot GL_OES_vertex_half_float GL_OES_required_internalformat GL_OES_vertex_array_object GL_OES_mapbuffer GL_EXT_texture_format_BGRA8888 GL_EXT_texture_rg GL_EXT_texture_type_2_10_10_10_REV GL_OES_fbo_render_mipmap GL_OES_element_index_uint GL_EXT_shadow_samplers GL_OES_texture_compression_astc GL_KHR_texture_compression_astc_ldr GL_KHR_texture_compression_astc_hdr GL_KHR_texture_compression_astc_sliced_3d GL_KHR_debug GL_EXT_occlusion_query_boolean GL_EXT_disjoint_timer_query GL_EXT_blend_minmax GL_EXT_discard_framebuffer GL_OES_get_program_binary GL_OES_texture_3D GL_EXT_texture_storage GL_EXT_multisamp
01-10 14:12:07.325924   398   398 I SurfaceFlinger: GL_MAX_TEXTURE_SIZE = 16384
01-10 14:12:07.325931   398   398 I SurfaceFlinger: GL_MAX_VIEWPORT_DIMS = 16384
01-10 14:12:07.334000   361   361 W teed    : type=1400 audit(0.0:29): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:07.336103   386   386 W hwcomposer: [EVENT] Start to listen uevent, addr.nl_pid(386)  
01-10 14:12:07.336211   386   386 W hwcomposer: [HWC] Register hotplug callback  
01-10 14:12:07.336232   386   386 W hwcomposer: [HWC] Register refresh callback  
01-10 14:12:07.336250   386   386 W hwcomposer: [HWC] Register vsync callback  
01-10 14:12:07.336293   386   386 I hwcomposer: [JOB] ui_mm_combined? 1  
01-10 14:12:07.336710   386   386 I hwcomposer: [DPY] get 0 density from drv, density calculated by physical dpi  
01-10 14:12:07.338000   361   361 W teed    : type=1400 audit(0.0:30): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:07.338788   386   386 W libc    : Unable to set property "ro.sf.lcd_density" to "300": error code: 0xb
01-10 14:12:07.338875   386   386 I hwcomposer: [DPY] setprop lcd_density 300  
01-10 14:12:07.338916   386   386 I hwcomposer: [DPY] fail to set ro.sf.lcd_density  
01-10 14:12:07.340544   386   386 E MDP     : DpAsyncBlitStream: unrecognizable user 0
01-10 14:12:07.340763   386   386 I hwcomposer: [DPY] Display Information:  
01-10 14:12:07.340813   386   386 I hwcomposer: [DPY] # fo current devices : 1  
01-10 14:12:07.340837   386   386 I hwcomposer: [DPY] ------------------------------------  
01-10 14:12:07.340866   386   386 I hwcomposer: [DPY] Device id   : 0  
01-10 14:12:07.340895   386   386 I hwcomposer: [DPY] Width       : 720  
01-10 14:12:07.340923   386   386 I hwcomposer: [DPY] Height      : 1280  
01-10 14:12:07.340964   386   386 I hwcomposer: [DPY] xdpi        : 294967.750000  
01-10 14:12:07.340994   386   386 I hwcomposer: [DPY] ydpi        : 295563.625000  
01-10 14:12:07.341022   386   386 I hwcomposer: [DPY] vsync       : 1  
01-10 14:12:07.341051   386   386 I hwcomposer: [DPY] refresh     : 18832392  
01-10 14:12:07.341078   386   386 I hwcomposer: [DPY] connected   : 1  
01-10 14:12:07.341106   386   386 I hwcomposer: [DPY] hwrotation  : 0  
01-10 14:12:07.341133   386   386 I hwcomposer: [DPY] subtype     : 0  
01-10 14:12:07.341176   386   386 I hwcomposer: [DPY] aspect      : 0.562, 1.778  
01-10 14:12:07.341207   386   386 I hwcomposer: [DPY] protrait    : [   0,   0, 720,1280]  
01-10 14:12:07.341236   386   386 I hwcomposer: [DPY] landscape   : [   0,   0, 720,1280]  
01-10 14:12:07.341265   386   386 I hwcomposer: [DPY] trigger_by_vsync: 0  
01-10 14:12:07.341292   386   386 I hwcomposer: [DPY] supportS3D  : 0  
01-10 14:12:07.341320   386   386 I hwcomposer: [DPY] density     : 320  
01-10 14:12:07.341359   386   386 I hwcomposer: [DPY] ro.sf.lcd_density : 320  
01-10 14:12:07.342000   361   361 W teed    : type=1400 audit(0.0:31): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:07.342000   361   361 W teed    : type=1400 audit(0.0:32): avc: denied { write } for name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:07.342315   398   398 I BufferQueue: [unnamed-398-0](this:0x7f76bfd000,id:0,api:0,p:-1,c:-1) BufferQueue core=(398:/system/bin/surfaceflinger)
01-10 14:12:07.355549   398   398 W GuiExt  : Cannot find GuiExtService
01-10 14:12:07.355748   398   398 E GED     : ged_gpu_timestamp: GED_ERROR_FAIL eErr = 0, 7
01-10 14:12:07.357415   398   398 I BufferQueueConsumer: [unnamed-398-0](this:0x7f76bfd000,id:0,api:0,p:-1,c:398) connect(C): consumer=(398:/system/bin/surfaceflinger) controlledByApp=false
01-10 14:12:07.357483   398   398 I BufferQueueConsumer: [unnamed-398-0](this:0x7f76bfd000,id:0,api:0,p:-1,c:398) setConsumerName: unnamed-398-0
01-10 14:12:07.357513   398   398 I BufferQueueConsumer: [FrameBufferSurface_0](this:0x7f76bfd000,id:0,api:0,p:-1,c:398) setConsumerName: FrameBufferSurface_0
01-10 14:12:07.357701   398   398 I BufferQueueConsumer: [FrameBufferSurface_0](this:0x7f76bfd000,id:0,api:0,p:-1,c:398) setDefaultBufferSize: width=720 height=1280
01-10 14:12:07.358041   398   398 I BufferQueueProducer: [FrameBufferSurface_0](this:0x7f76bfd000,id:0,api:1,p:398,c:398) connect(P): api=1 producer=(398:/system/bin/surfaceflinger) producerControlledByApp=false
01-10 14:12:07.387120   362   362 I KeymasterHAL: module.cpp:2130: Open session successfully
01-10 14:12:07.395696   385   454 W gralloc : Failed to find GPU block configuration in libGLES_mali.so. Using static build configuration.
01-10 14:12:07.397554   362   362 I ServiceManagement: Removing namespace from process name android.hardware.keymaster@3.0-service to keymaster@3.0-s.
01-10 14:12:07.398803   362   362 I android.hardware.keymaster@3.0-service: Registration complete for android.hardware.keymaster@3.0::IKeymasterDevice/default.
01-10 14:12:07.536083   407   407 I wmt_loader: external combo chip detected
01-10 14:12:07.537436   408   408 I wmt_launcher: get property(service.wcn.driver.ready) is no
01-10 14:12:07.538210   407   407 I wmt_loader: chipid (0x6630) detected
01-10 14:12:07.540915   407   407 I wmt_loader: set property(persist.mtk.wcn.combo.chipid) to 0x6630 succeed.
01-10 14:12:07.543355   407   407 I wmt_loader: do SDIO3.0 autok succeed
01-10 14:12:07.564321   407   407 I wmt_loader: external combo chip power off succeed
01-10 14:12:07.584505   407   407 I wmt_loader: do kernel module init succeed: 0
01-10 14:12:07.588176   407   407 I wmt_loader: set property(service.wcn.driver.ready) to yes succeed
01-10 14:12:07.802058   386   386 I hwcomposer: [HWC] Display(0) SetPowerMode(2)  
01-10 14:12:07.804012   398   481 I SurfaceFlinger: [checkEnableBootAnim] boot reason = ''
01-10 14:12:07.804312   398   481 I boot    : mBootAnimationEnabled = 1
01-10 14:12:07.808792   398   481 I boot    : BOOTPROF:BootAnimation:Start:6949
01-10 14:12:07.828595   386   386 W hwcomposer: [JOB] (0) SET/bypass/no_visible_layers  
01-10 14:12:07.837674   408   408 I wmt_launcher: get property(service.wcn.driver.ready) is yes
01-10 14:12:07.839656   408   408 I wmt_launcher: open device node succeed.(Node:/dev/stpwmt, fd:5) 
01-10 14:12:07.839699   408   408 I wmt_launcher: key:(persist.mtk.wcn.combo.chipid)-value:(0x6630),chip_id:0x6630
01-10 14:12:07.839710   408   408 I wmt_launcher: chip_id:0x6630
01-10 14:12:07.839728   408   408 I wmt_launcher: patch path:/vendor/firmware/
01-10 14:12:07.840963   408   408 I wmt_launcher: set chip_id(0x6630) to driver
01-10 14:12:07.844163   408   408 I wmt_launcher: Info:key:mt6620.defAnt value:mt6620_ant_m3.cfg
01-10 14:12:07.844244   408   408 I wmt_launcher: Info:key:mt6628.defAnt value:mt6628_ant_m1.cfg
01-10 14:12:07.844258   408   408 I wmt_launcher: Info:key:mt6630.defAnt value:mt6630_ant_m1.cfg
01-10 14:12:07.844271   408   408 I wmt_launcher: Info:key:mt6632.defAnt value:mt6632_ant_m1.cfg
01-10 14:12:07.844287   408   408 I wmt_launcher: NULL is returned, eighter EOF or error maybe found
01-10 14:12:07.844326   408   408 I wmt_launcher: close /system/vendor/firmware/WMT.cfg succeed
01-10 14:12:07.844342   408   408 I wmt_launcher: index:2, chip_id:0x6630
01-10 14:12:07.844358   408   408 I wmt_launcher: chip_id(0x6630), default Mode(4), strlen(g_wmt_cfg_name)(17), g_wmt_cfg_name(mt6630_ant_m1.cfg)
01-10 14:12:07.844857   398   485 E GED     : SF restart
01-10 14:12:07.850554   408   408 I wmt_launcher: create pwr on thread ok
01-10 14:12:07.850567   408   486 I wmt_launcher: enter power on connsys flow
01-10 14:12:07.850698   408   408 I wmt_launcher: get property(service.wcn.formeta.ready) failed iRet:0 or property is 
01-10 14:12:07.852787   408   408 I wmt_launcher: set property(service.wcn.formeta.ready) to yes succeed
01-10 14:12:08.596689   398   421 I SurfaceFlinger: [SF client] NEW(0x7f7b228000) for (484:/system/bin/bootanimation)
01-10 14:12:08.602089   398   398 I BufferQueue: [unnamed-398-1](this:0x7f74423000,id:1,api:0,p:-1,c:-1) BufferQueue core=(398:/system/bin/surfaceflinger)
01-10 14:12:08.602404   398   398 W GuiExt  : Cannot find GuiExtService
01-10 14:12:08.602520   398   398 I BufferQueueConsumer: [unnamed-398-1](this:0x7f74423000,id:1,api:0,p:-1,c:398) connect(C): consumer=(398:/system/bin/surfaceflinger) controlledByApp=false
01-10 14:12:08.602567   398   398 I BufferQueueConsumer: [unnamed-398-1](this:0x7f74423000,id:1,api:0,p:-1,c:398) setConsumerName: unnamed-398-1
01-10 14:12:08.602615   398   398 I BufferQueueConsumer: [BootAnimation#0](this:0x7f74423000,id:1,api:0,p:-1,c:398) setConsumerName: BootAnimation#0
01-10 14:12:08.602664   398   398 I BufferQueueConsumer: [BootAnimation#0](this:0x7f74423000,id:1,api:0,p:-1,c:398) setDefaultBufferSize: width=720 height=1280
01-10 14:12:08.609391   386   386 W hwcomposer: [JOB] (0) SET/bypass/no_visible_layers  
01-10 14:12:08.618850   502   502 I /system/bin/tzdatacheck: timezone distro dir /data/misc/zoneinfo/current does not exist. No action required.
01-10 14:12:08.720079   484   501 I /system/bin/bootanimation: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 14:12:08.720843   398   421 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) connect(P): api=1 producer=(484:/system/bin/bootanimation) producerControlledByApp=false
01-10 14:12:08.732077   503   503 I bootstat: Service started: /system/bin/bootstat -r post_decrypt_time_elapsed 
01-10 14:12:09.017831   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:1.681545,dur:1189.38,max:780.79,min:408.59
01-10 14:12:09.282908   529   529 I thermald: START+++++++++ 529
01-10 14:12:09.283074   529   529 I thermald: Success to write 529 to /proc/driver/thermal/clsd_pid
01-10 14:12:09.283113   529   529 I thermald: Success to write 529 to /proc/driver/thermal/clmutt_tmd_pid
01-10 14:12:09.283133   529   529 I thermald: Enter infinite loop
01-10 14:12:09.330313   539   539 I MobileLogD: =====MOBILELOG START=======
01-10 14:12:09.343498   551   551 I thermal_mgr: main argc 1.
01-10 14:12:09.352763   550   550 I thermal_repeater: START+++++++++ 550
01-10 14:12:09.352949   550   550 I thermal_repeater: Success to write 550 to /proc/driver/thermal/clwmt_pid
01-10 14:12:09.353117   550   550 I thermal_repeater: Success to write 550 to /proc/driver/thermal/clmutt_tm_pid
01-10 14:12:09.353171   550   550 I thermal_repeater: RilRPC_init 
01-10 14:12:09.353307   551   551 I thermal_mgr: argv[0] /vendor/bin/thermal_manager.
01-10 14:12:09.353484   550   550 I thermal_repeater: RilRPC_init dlopen fail: dlopen failed: library "librpcril.so" not found 
01-10 14:12:09.355035   552   552 I thermal_src: ta_main
01-10 14:12:09.361847   523   562 E AALCust : Invalid LCM index -1, LCM count 1
01-10 14:12:09.362025   523   562 I AALCust : LCM index: 0/1
01-10 14:12:09.366191   542   542 I Netdiag : network_dignose_daemon doing
01-10 14:12:09.374018   542   568 I Netdiag : commandlistening threadStart doing
01-10 14:12:09.384346   552   552 I thermal_src1: libthermal_algo_setup
01-10 14:12:09.384901   552   552 I thermal_src1: ta_daemon_init
01-10 14:12:09.385033   552   552 I thermal_src1: spa_init
01-10 14:12:09.385356   551   551 I thermal_mgr: loadmtc thermal.conf
01-10 14:12:09.385466   551   551 I libMtcLoader: loadmtc
01-10 14:12:09.385782   552   552 I thermal_src: spa_processMsg, ARGS[0]:Tpolicy,/vendor/etc/.tp/thermal.conf
01-10 14:12:09.385929   551   551 I libMtcLoader: spa socket send done!
01-10 14:12:09.401735   555   555 E agps    : [agps] ERR: [MAIN] mtk_agpsd is running ver=4.309.0
01-10 14:12:09.402114   555   555 E agps    : [agps] ERR: [MAIN] mtk_agpsd is for Android
01-10 14:12:09.409137   559   559 E         : [SYSENV]get_env_info():321 , env_buffer[0] : f4d2a000
01-10 14:12:09.423176   547   547 E android.hardware.sensors@1.0-service-mediatek: sensor hidl defaultPassthroughServiceImplementation start.
01-10 14:12:09.430786   551   551 I libMtcLoader: .tp.settings is opened.
01-10 14:12:09.445316   538   538 I         : [MET_LOG_D: drop_privs 2394]prctl success
01-10 14:12:09.445485   538   538 I         : [MET_LOG_D: drop_privs 2400]setgroups success
01-10 14:12:09.445520   538   538 I         : [MET_LOG_D: drop_privs 2406]setgid 2000 success
01-10 14:12:09.445549   538   538 I         : [MET_LOG_D: drop_privs 2412]setuid 2000 success
01-10 14:12:09.456584   539   539 I MobileLogD: boot mode is 0
01-10 14:12:09.465475   551   551 I libMtcLoader: readPolicy_formatV2
01-10 14:12:09.466273   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktscpu-sysrst!
01-10 14:12:09.466690   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktspmic-sysrst!
01-10 14:12:09.466776   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktsbattery-sysrst!
01-10 14:12:09.466827   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-shutdown01!
01-10 14:12:09.466871   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktscharger-sysrst!
01-10 14:12:09.466918   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktswmt-sysrst!
01-10 14:12:09.466969   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktsAP-sysrst!
01-10 14:12:09.467012   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-shutdown00!
01-10 14:12:09.467193   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-shutdown02!
01-10 14:12:09.467344   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown00!
01-10 14:12:09.469493   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown01!
01-10 14:12:09.469906   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown02!
01-10 14:12:09.470105   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown03!
01-10 14:12:09.470207   551   551 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown04!
01-10 14:12:09.504192   552   552 I thermal_src: ta_catm_init_flow
01-10 14:12:09.504308   552   552 I thermal_src: u_CATM_ON == -1, get catm init val
01-10 14:12:09.504397   552   552 I thermal_src: TTJ_D 13500,TT_H 500,TT_L 500,TT 4000,MAX_TT 800000,MIN_TT -800000,MIN_TTJ 65000,CATM_ON 2,TTJ 59000,MAX_TARGET_TJ 85000,TRIP_TPCB 43000,STEADY_TARGET_TPCB 46000
01-10 14:12:09.504413   552   552 I thermal_src: update param 4608,59000,71500,27648,-25600
01-10 14:12:09.516009   563   563 W libutils.threads: Thread (this=0x7c3766c648): getTid() is undefined before run()
01-10 14:12:09.524876   563   563 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.pq@2.0-service to pq@2.0-service.
01-10 14:12:09.535147   567   567 I gatekeeperd: Starting gatekeeperd...
01-10 14:12:09.537250   563   563 I vendor.mediatek.hardware.pq@2.0-service: Registration complete for vendor.mediatek.hardware.pq@2.0::IPictureQuality/default.
01-10 14:12:09.545216   555   580 I MtkAgpsNative: Enter mtk_agps_up_init
01-10 14:12:09.545445   555   580 I MtkAgpsNative: [????] kal_create_mutex: name(tls_global) 
01-10 14:12:09.545482   572   572 I /system/bin/tombstoned: tombstoned successfully initialized
01-10 14:12:09.564260   543   543 I PPL/PPLAgent: PPLAgent created start
01-10 14:12:09.565732   543   543 E PPL/PPLAgent: failed to get entry for /ppl
01-10 14:12:09.565803   543   543 I PPL/PPLAgent: PPLAgent created end
01-10 14:12:09.568408   543   543 I PPL/PPLAgent: Registered to Service Manager. writeOnProtect=1, rawDataPart=0
01-10 14:12:09.568627   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(149504) returning hidl_memory(0x705b02b5f0, 149504)
01-10 14:12:09.568698   543   543 I PPL/PPLAgent: PPLAgent Service is now ready
01-10 14:12:09.572192   536   536 I mediametrics: ServiceManager: 0x7ef6e316c0
01-10 14:12:09.577360   555   580 E agps    : [agps] ERR: [Default] mtk_expat_xml_load() failed reason=[fopen() failed reason=[No such file or directory]]
01-10 14:12:09.577513   555   580 E agps    : [agps] ERR: [Default] mtk_expat_xml_load() failed reason=[fopen() failed reason=[No such file or directory]]
01-10 14:12:09.587049   569   569 I ProgramBinary/Server: Get disable program binary service property (0)
01-10 14:12:09.587243   569   569 I ProgramBinary/Server: Program binary server is starting...
01-10 14:12:09.587735   569   569 I ProgramBinary/Service: ProgramBinaryService created.
01-10 14:12:09.590464   548   548 I camerahalserver: Camera HAL Server is starting..., ADV_CAM_SUPPORT(1)
01-10 14:12:09.591733   569   569 I ProgramBinary/Service: ProgramBinaryService init...
01-10 14:12:09.591819   569   569 I ProgramBinary/Service: ProgramBinaryService disable debugging.
01-10 14:12:09.591872   569   569 I ProgramBinary/Service: ProgramBinaryService disable binary content debugging.
01-10 14:12:09.592929   569   569 I ProgramBinary/Server: Program binary service is added to service manager.
01-10 14:12:09.593104   569   569 I ProgramBinary/Server: Execute program_binary_builder.
01-10 14:12:09.599964   569   569 I ProgramBinary/Server: Parent process for handling binder: Pid of child is 621.
01-10 14:12:09.607894   555   580 E agps    : [agps] ERR: [MNL] sendto dest=[/data/agps_supl/agps_to_mnl] len=8 reason=[Connection refused]
01-10 14:12:09.608135   555   580 E agps    : [agps] ERR: [MNL] sendto dest=[/data/agps_supl/agps_to_mnl] len=48 reason=[Connection refused]
01-10 14:12:09.608712   621   621 I ProgramBinary/Server: Child process for building program: Pid is 621.
01-10 14:12:09.611915   541   541 I Netd    : Netd 1.0 starting
01-10 14:12:09.613377   555   580 E MtkAgpsNative: safe_write reason=[No such device]19
01-10 14:12:09.613701   555   580 E agps    : [agps] ERR: [CP] get_ccci_uart  open failed node=[/dev/ccci2_tty2] reason=[No such file or directory]
01-10 14:12:09.613786   555   580 E agps    : [agps] ERR: [CP] ccci_uart_2  open failed
01-10 14:12:09.615956   533   533 I mediaserver: ServiceManager: 0xf6898f20
01-10 14:12:09.629285   561   561 E         : safe_sendto: safe_sendto() sendto() failed path=[mtk_hal2mnl] ret=-1 reason=[Connection refused]111
01-10 14:12:09.630203   561   561 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.gnss@1.1-service to gnss@1.1-servic.
01-10 14:12:09.637302   561   561 I vendor.mediatek.hardware.gnss@1.1-service: Registration complete for vendor.mediatek.hardware.gnss@1.1::IMtkGnss/default.
01-10 14:12:09.650000   544   544 W storaged: type=1400 audit(0.0:33): avc: denied { read } for path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=96 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
01-10 14:12:09.675790   520   520 E mnl_linux: mnl_utl_load_property: Config is not set yet, ignore
01-10 14:12:09.676323   547   547 I Accelerometer: read div buf(/sys/class/sensor/m_acc_misc/accactive), mdiv 1000
01-10 14:12:09.687528   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 14:12:09.687710   547   547 E Accelerometer: read bias: [0.000000, 0.000000, 0.000000]
01-10 14:12:09.687788   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 14:12:09.687815   547   547 E Accelerometer: read cali: [0, 0, 0]
01-10 14:12:09.690087   547   547 I Magnetic: misc path =/sys/class/sensor/m_mag_misc/
01-10 14:12:09.690399   547   547 I Magnetic: read div buf(/sys/class/sensor/m_mag_misc/magactive), mdiv_M 1024000
01-10 14:12:09.690462   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 14:12:09.690523   547   547 I Magnetic: read bias: [0.000000, 0.000000, 0.000000]
01-10 14:12:09.706660   547   547 I Proximity: misc path =/sys/class/sensor/m_ps_misc/
01-10 14:12:09.706850   547   547 I Proximity: read div buf(/sys/class/sensor/m_ps_misc/psactive), mdiv 100
01-10 14:12:09.706914   547   547 I Light   : misc path =/sys/class/sensor/m_als_misc/
01-10 14:12:09.706977   547   547 I Light   : read div buf(/sys/class/sensor/m_als_misc/alsactive),mdiv 100
01-10 14:12:09.707026   547   547 I Gyroscope: misc path =/sys/class/sensor/m_gyro_misc/
01-10 14:12:09.707085   547   547 I Gyroscope: read div buf(/sys/class/sensor/m_gyro_misc/gyroactive), mdiv 7506
01-10 14:12:09.707155   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 14:12:09.707216   547   547 I Gyroscope: read bias: [0.000000, 0.000000, 0.000000]
01-10 14:12:09.707242   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 14:12:09.707257   547   547 I Gyroscope: read cali: [0, 0, 0]
01-10 14:12:09.707280   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 14:12:09.707307   547   547 I Gyroscope: read temp: [0, 0, 0, 0, 0, 0]
01-10 14:12:09.710069   547   547 E Pressure: couldn't find sensor device , 0.1
01-10 14:12:09.710270   547   547 E Pressure: couldn't find input device ,0.1
01-10 14:12:09.710325   547   547 E HUMIDITY: couldn't find sensor device
01-10 14:12:09.710365   547   547 E HUMIDITY: couldn't find input device 
01-10 14:12:09.710390   547   547 E StepRecognize: couldn't find input device
01-10 14:12:09.710418   547   547 I StepRecognize: misc path =
01-10 14:12:09.710454   547   547 E StepRecognize: open misc path /sys/class/sensor/m_step_c_misc/step_cactive fail 
01-10 14:12:09.710482   547   547 E Pedometer: couldn't find input device
01-10 14:12:09.710526   547   547 I Pedometer: misc path =
01-10 14:12:09.710545   547   547 E Pedometer: open misc path /sys/class/sensor/m_pedo_misc/pedoactive fail
01-10 14:12:09.710588   547   547 E Activity: couldn't find input device
01-10 14:12:09.710608   547   547 E Activity: couldn't find input device 
01-10 14:12:09.710639   547   547 E Situation: couldn't find input device
01-10 14:12:09.710658   547   547 I Situation: misc path =
01-10 14:12:09.710694   547   547 E Fusion  : open fusion misc path /sys/class/sensor/m_fusion_misc/fusionactive fail 
01-10 14:12:09.710742   547   547 I android.hardware.sensors@1.0-service-mediatek: sensor hidl load sensor module success.
01-10 14:12:09.711699   556   556 I NVRAM   : Registration complete for vendor.mediatek.hardware.nvram@1.0::INvram/default.
01-10 14:12:09.713902   547   547 I ServiceManagement: Removing namespace from process name android.hardware.sensors@1.0-service-mediatek to sensors@1.0-ser.
01-10 14:12:09.720915   547   547 I android.hardware.sensors@1.0-service-mediatek: Registration complete for android.hardware.sensors@1.0::ISensors/default.
01-10 14:12:09.741069   541   541 I Netd    : Creating child chains: 67.5ms
01-10 14:12:09.741511   541   541 I Netd    : Setting up OEM hooks: 0.4ms
01-10 14:12:09.763300   541   541 I Netd    : Setting up FirewallController hooks: 21.8ms
01-10 14:12:09.768338   541   541 I Netd    : Setting up NatController hooks: 5.0ms
01-10 14:12:09.781434   541   541 I Netd    : Setting up BandwidthController hooks: 5.3ms
01-10 14:12:09.781574   541   541 I Netd    : Setting up IdletimerController hooks: 8.0ms
01-10 14:12:09.795892   541   541 I Netd    : Disabling bandwidth control: 14.3ms
01-10 14:12:09.798694   636   636 I recovery: Recovery image already installed
01-10 14:12:09.804438   541   541 E Netd    : cannot find interface dummy0
01-10 14:12:09.805141   541   541 I Netd    : Initializing RouteController: 9.3ms
01-10 14:12:09.808184   540   540 I advcamserver: ServiceManager: 0xf1918ec0
01-10 14:12:09.808332   540   540 I advcam/AdvCamService: AdvCamService started (pid=540)
01-10 14:12:09.811837   541   541 I Netd    : Registering NetdNativeService: 4.9ms
01-10 14:12:09.812209   540   540 I mmsdk/MMSdkService: MMSdkService started (pid=540)
01-10 14:12:09.812242   541   541 I Netd    : Starting CommandListener: 0.4ms
01-10 14:12:09.824053   541   541 I Netd    : Registering NetdHwService: 11.8ms
01-10 14:12:09.824191   541   541 I Netd    : Netd started in 212ms
01-10 14:12:09.847699   546   546 I /vendor/bin/hw/android.hardware.media.omx@1.0-service: mediacodecservice starting
01-10 14:12:09.857776   548   548 I mtkcam-devicemgr: [CameraDeviceManagerBase] "internal" this:0xf0e63004 persist.mtkcam.aosp_hal_version: persist.mtkcam.aosp_hal_legacy:1 persist.mtkcam.aosp_hal_legacy:0
01-10 14:12:09.862093   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: allowing syscall: clock_gettime
01-10 14:12:09.862229   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: allowing syscall: connect
01-10 14:12:09.862310   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: allowing syscall: fcntl64
01-10 14:12:09.862382   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: allowing syscall: socket
01-10 14:12:09.862456   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: allowing syscall: writev
01-10 14:12:09.863709   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: logging seccomp filter failures
01-10 14:12:09.888406   546   546 W MediaCodecsXmlParser: unable to open media codecs configuration xml file: /data/misc/media/media_codecs_profiling_results.xml
01-10 14:12:09.888604   546   546 W MediaCodecsXmlParser: parseTopLevelXMLFile(/data/misc/media/media_codecs_profiling_results.xml) failed
01-10 14:12:09.888810   546   546 E MediaCodecsXmlParser: Cannot find the role for a decoder of type audio/x-ms-wma
01-10 14:12:09.890892   546   546 I ServiceManagement: Removing namespace from process name android.hardware.media.omx@1.0-service to omx@1.0-service.
01-10 14:12:09.900343   544   637 I ServiceManager: Waiting for service package_native...
01-10 14:12:09.926979   546   546 W MediaCodecsXmlParser: unable to open media codecs configuration xml file: /data/misc/media/media_codecs_profiling_results.xml
01-10 14:12:09.927130   546   546 W MediaCodecsXmlParser: parseTopLevelXMLFile(/data/misc/media/media_codecs_profiling_results.xml) failed
01-10 14:12:09.927328   546   546 I ServiceManagement: Removing namespace from process name android.hardware.media.omx@1.0-service to omx@1.0-service.
01-10 14:12:09.936843   546   546 I /vendor/bin/hw/android.hardware.media.omx@1.0-service: Treble OMX service created.
01-10 14:12:09.972054   521   521 I zygote64: option[0]=-Xzygote
01-10 14:12:09.972158   521   521 I zygote64: option[1]=-Xusetombstonedtraces
01-10 14:12:09.972173   521   521 I zygote64: option[2]=exit
01-10 14:12:09.972183   521   521 I zygote64: option[3]=vfprintf
01-10 14:12:09.972194   521   521 I zygote64: option[4]=sensitiveThread
01-10 14:12:09.972204   521   521 I zygote64: option[5]=-verbose:gc
01-10 14:12:09.972214   521   521 I zygote64: option[6]=-Xms4m
01-10 14:12:09.972222   521   521 I zygote64: option[7]=-Xmx256m
01-10 14:12:09.972233   521   521 I zygote64: option[8]=-XX:HeapGrowthLimit=128m
01-10 14:12:09.972245   521   521 I zygote64: option[9]=-Xusejit:true
01-10 14:12:09.972256   521   521 I zygote64: option[10]=-Xjitsaveprofilinginfo
01-10 14:12:09.972267   521   521 I zygote64: option[11]=-agentlib:jdwp=transport=dt_android_adb,suspend=n,server=y
01-10 14:12:09.972283   521   521 I zygote64: option[12]=-Ximage-compiler-option
01-10 14:12:09.972295   521   521 I zygote64: option[13]=--runtime-arg
01-10 14:12:09.972307   521   521 I zygote64: option[14]=-Ximage-compiler-option
01-10 14:12:09.972319   521   521 I zygote64: option[15]=-Xms64m
01-10 14:12:09.972330   521   521 I zygote64: option[16]=-Ximage-compiler-option
01-10 14:12:09.972340   521   521 I zygote64: option[17]=--runtime-arg
01-10 14:12:09.972351   521   521 I zygote64: option[18]=-Ximage-compiler-option
01-10 14:12:09.972362   521   521 I zygote64: option[19]=-Xmx64m
01-10 14:12:09.972373   521   521 I zygote64: option[20]=-Ximage-compiler-option
01-10 14:12:09.972385   521   521 I zygote64: option[21]=--image-classes=/system/etc/preloaded-classes
01-10 14:12:09.972396   521   521 I zygote64: option[22]=-Ximage-compiler-option
01-10 14:12:09.972407   521   521 I zygote64: option[23]=--compiled-classes=/system/etc/compiled-classes
01-10 14:12:09.972419   521   521 I zygote64: option[24]=-Ximage-compiler-option
01-10 14:12:09.972432   521   521 I zygote64: option[25]=--dirty-image-objects=/system/etc/dirty-image-objects
01-10 14:12:09.972444   521   521 I zygote64: option[26]=-Xcompiler-option
01-10 14:12:09.972455   521   521 I zygote64: option[27]=--runtime-arg
01-10 14:12:09.972465   521   521 I zygote64: option[28]=-Xcompiler-option
01-10 14:12:09.972475   521   521 I zygote64: option[29]=-Xms64m
01-10 14:12:09.972486   521   521 I zygote64: option[30]=-Xcompiler-option
01-10 14:12:09.972497   521   521 I zygote64: option[31]=--runtime-arg
01-10 14:12:09.972509   521   521 I zygote64: option[32]=-Xcompiler-option
01-10 14:12:09.972520   521   521 I zygote64: option[33]=-Xmx512m
01-10 14:12:09.972530   521   521 I zygote64: option[34]=-Ximage-compiler-option
01-10 14:12:09.972541   521   521 I zygote64: option[35]=--instruction-set-variant=cortex-a53
01-10 14:12:09.972552   521   521 I zygote64: option[36]=-Xcompiler-option
01-10 14:12:09.972564   521   521 I zygote64: option[37]=--instruction-set-variant=cortex-a53
01-10 14:12:09.972578   521   521 I zygote64: option[38]=-Ximage-compiler-option
01-10 14:12:09.972590   521   521 I zygote64: option[39]=--instruction-set-features=default
01-10 14:12:09.972601   521   521 I zygote64: option[40]=-Xcompiler-option
01-10 14:12:09.972612   521   521 I zygote64: option[41]=--instruction-set-features=default
01-10 14:12:09.972623   521   521 I zygote64: option[42]=-Duser.locale=zh-Hans-CN
01-10 14:12:09.972633   521   521 I zygote64: option[43]=--cpu-abilist=arm64-v8a
01-10 14:12:09.972648   521   521 I zygote64: option[44]=-Xfingerprint:Datalogic/dl35cn/dl35:8.1.0/1.07.15.20191227/1577435794:user/release-keys
01-10 14:12:10.003695   398   640 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=15.87 dur=1008.40 max=129.59 min=33.64
01-10 14:12:10.031196   535   535 W /system/bin/mediaextractor: libminijail[535]: allowing syscall: connect
01-10 14:12:10.031459   535   535 W /system/bin/mediaextractor: libminijail[535]: allowing syscall: fcntl
01-10 14:12:10.031559   535   535 W /system/bin/mediaextractor: libminijail[535]: allowing syscall: sendto
01-10 14:12:10.031617   535   535 W /system/bin/mediaextractor: libminijail[535]: allowing syscall: socket
01-10 14:12:10.031669   535   535 W /system/bin/mediaextractor: libminijail[535]: allowing syscall: writev
01-10 14:12:10.032282   535   535 W /system/bin/mediaextractor: libminijail[535]: logging seccomp filter failures
01-10 14:12:10.063974   539   539 I MobileLogD: set cur path: /data/log_temp/boot/
01-10 14:12:10.064715   539   539 I MobileLogD: ld_p type: 0, id: 0, log_name: main_log, rotate_size: 15728640
01-10 14:12:10.064861   539   539 I MobileLogD: ld_p type: 0, id: 1, log_name: radio_log, rotate_size: 5242880
01-10 14:12:10.064962   539   539 I MobileLogD: ld_p type: 0, id: 2, log_name: events_log, rotate_size: 5242880
01-10 14:12:10.065061   539   539 I MobileLogD: ld_p type: 0, id: 3, log_name: sys_log, rotate_size: 5242880
01-10 14:12:10.065163   539   539 I MobileLogD: ld_p type: 0, id: 4, log_name: crash_log, rotate_size: 3145728
01-10 14:12:10.065246   539   539 I MobileLogD: Read kernel log from kmsg
01-10 14:12:10.065352   539   539 I MobileLogD: ld_p type: 1, id: 6, log_name: kernel_log, rotate_size: 10485760
01-10 14:12:10.065521   539   539 I MobileLogD: ld_p type: 1, id: 7, log_name: atf_log, rotate_size: 10485760
01-10 14:12:10.065729   539   539 I MobileLogD: ld_p type: 1, id: 8, log_name: gz_log, rotate_size: 3145728
01-10 14:12:10.065831   539   539 E MobileLogD: open /proc/gz_log fail(No such file or directory)
01-10 14:12:10.071895   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:16.128290,dur:1054.05,max:132.28,min:36.44
01-10 14:12:10.112101   539   539 I MobileLogD: ld_p type: 1, id: 9, log_name: bsp_log, rotate_size: 5242880
01-10 14:12:10.123307   557   669 E HWMLIB  : alsps_set_cali: set_cali err: -1
01-10 14:12:10.123319   557   668 E HWMLIB  : gyroscope_set_cali: set_cali err: -1
01-10 14:12:10.123331   557   667 E HWMLIB  : gsensor_set_cali: set_cali err: -1
01-10 14:12:10.178397   527   527 I cameraserver: ServiceManager: 0xec998f40
01-10 14:12:10.178584   527   527 I CameraService: CameraService started (pid=527)
01-10 14:12:10.181985   520   520 E mnld_uti: read_NVRAM: not 3332 UART port
01-10 14:12:10.182299   520   520 E gps_controlller: hasAlmanac: open file(/nvcfg/almanac.dat) fail
01-10 14:12:10.185942   673   673 I MobileLogD: bsp ftrace buffer initializing...
01-10 14:12:10.193145   524   524 I FastMixerState: sMaxFastTracks = 8
01-10 14:12:10.201078   524   524 W BatteryNotifier: batterystats service unavailable!
01-10 14:12:10.202286   539   539 I MobileLogD: ld_p type: 1, id: 11, log_name: scp_log, rotate_size: 3145728
01-10 14:12:10.202601   539   539 E MobileLogD: open /dev/scp fail(No such file or directory)
01-10 14:12:10.206076   520   520 E mtk_lbs_utility: safe_sendto: safe_sendto() sendto() failed path=[mtk_mnl2hal] ret=-1 reason=[Connection refused]111
01-10 14:12:10.216544   555   580 E MtkAgpsNative: safe_write reason=[No such device]19
01-10 14:12:10.249411   524   524 I AudioFlinger: Using default 3000 mSec as standby time.
01-10 14:12:10.249648   403   403 I ccci_mdinit: (1):Gotten ret=0,nvram_init=Ready!
01-10 14:12:10.254411   403   403 I ccci_mdinit: (1):md_img_exist 0 0 0 0
01-10 14:12:10.254906   524   524 E APM::Serializer: deserialize: Could not parse /odm/etc/audio_policy_configuration.xml document.
01-10 14:12:10.261118   539   539 I MobileLogD: ld_p type: 1, id: 12, log_name: scp_b_log, rotate_size: 3145728
01-10 14:12:10.261420   539   539 E MobileLogD: open /dev/scp_B fail(No such file or directory)
01-10 14:12:10.271559   537   537 I mediaserver: ServiceManager: 0xe9ad8740
01-10 14:12:10.279580   537   537 W BatteryNotifier: batterystats service unavailable!
01-10 14:12:10.286007   539   539 I MobileLogD: ld_p type: 1, id: 13, log_name: sspm_log, rotate_size: 3145728
01-10 14:12:10.289086   539   539 E MobileLogD: open tagmap done
01-10 14:12:10.289693   539   539 I MobileLogD: current folder size limited is 300 MB, factor is 1
01-10 14:12:10.290048   539   539 I MobileLogD: main_log, rotation size 15728640
01-10 14:12:10.290232   539   539 I MobileLogD: radio_log, rotation size 5242880
01-10 14:12:10.295985   403   703 I ccci_mdinit: (1):Update time to md by ipc port fail(25)
01-10 14:12:10.298588   539   539 I MobileLogD: events_log, rotation size 5242880
01-10 14:12:10.299187   539   539 I MobileLogD: sys_log, rotation size 5242880
01-10 14:12:10.304889   539   539 I MobileLogD: crash_log, rotation size 3145728
01-10 14:12:10.305205   539   539 I MobileLogD: kernel_log, rotation size 10485760
01-10 14:12:10.305450   539   539 I MobileLogD: atf_log, rotation size 10485760
01-10 14:12:10.305721   539   539 I MobileLogD: bsp_log, rotation size 5242880
01-10 14:12:10.305937   539   539 I MobileLogD: sspm_log, rotation size 3145728
01-10 14:12:10.305988   539   539 I MobileLogD: create dir /data/log_temp/boot/
01-10 14:12:10.324478   401   401 E ccci_fsd(1): FS_OTP_init:otp_open failed, errno=2!
01-10 14:12:10.324626   401   401 E ccci_fsd(1): can't catch SIGKILL
01-10 14:12:10.332346   403   403 I ccci_mdinit: (1):Gotten ret=0,nvram_init=Ready!
01-10 14:12:10.336815   403   403 I ccci_mdinit: (1):USP_SBP:persist.mtk_usp_md_sbp_code not exist
01-10 14:12:10.336966   403   403 I ccci_mdinit: (1):get_cip_sbp_setting, file /custom/etc/firmware/CIP_MD_SBP NOT exists!
01-10 14:12:10.337019   403   403 I ccci_mdinit: (1):PRJ_SBP_ID:ro.mtk_md_sbp_custom_value not exist, using default value
01-10 14:12:10.349328   403   403 I ccci_mdinit: (1):SBP_SUB_ID:persist.operator.subid not exist
01-10 14:12:10.349452   403   403 I ccci_mdinit: (1):set md boot data:mdl=2 sbp=0 dbg_dump=-1 sbp_sub=0
01-10 14:12:10.349535   403   403 I ccci_mdinit: (1):start_service init.svc.ccci_fsd, current state:running, returned:7
01-10 14:12:10.355235   621   621 I ProgramBinary/Builder: Program binary builder is starting...
01-10 14:12:10.360320   621   621 I ProgramBinary/Builder: Build program consctruct.
01-10 14:12:10.360337   621   621 I ProgramBinary/Builder: Build program is running...
01-10 14:12:10.411102   573   573 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 14:12:10.413267   573   573 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 14:12:10.413456   573   573 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -F oem_mobile 
01-10 14:12:10.471696   573   573 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 14:12:10.472552   573   573 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 14:12:10.472764   573   573 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -F oem_mobile 
01-10 14:12:10.520917   573   573 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 14:12:10.521773   573   573 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 14:12:10.522245   573   573 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -X oem_mobile 
01-10 14:12:10.524253   673   673 I MobileLogD: bsp ftrace buffer initialize done
01-10 14:12:10.539026   403   403 I ccci_mdinit: (1):wait_for_property:success(init.svc.ccci_fsd=running), loop:600
01-10 14:12:10.560277   349   349 E SELinux : avc:  denied  { find } for interface=android.hardware.configstore::ISurfaceFlingerConfigs sid=u:r:program_binary:s0 pid=621 scontext=u:r:program_binary:s0 tcontext=u:object_r:hal_configstore_ISurfaceFlingerConfigs:s0 tclass=hwservice_manager permissive=0
01-10 14:12:10.563985   621   621 I /system/bin/program_binary_builder: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0 (default)
01-10 14:12:10.564264   621   621 I ProgramBinary/Builder: EGL version 1.4
01-10 14:12:10.573601   527   527 I CameraService: CameraService process starting
01-10 14:12:10.573977   522   522 I zygote  : option[0]=-Xzygote
01-10 14:12:10.574116   522   522 I zygote  : option[1]=-Xusetombstonedtraces
01-10 14:12:10.574140   522   522 I zygote  : option[2]=exit
01-10 14:12:10.574160   522   522 I zygote  : option[3]=vfprintf
01-10 14:12:10.574182   522   522 I zygote  : option[4]=sensitiveThread
01-10 14:12:10.574201   522   522 I zygote  : option[5]=-verbose:gc
01-10 14:12:10.574214   527   527 W BatteryNotifier: batterystats service unavailable!
01-10 14:12:10.574223   522   522 I zygote  : option[6]=-Xms4m
01-10 14:12:10.574244   522   522 I zygote  : option[7]=-Xmx256m
01-10 14:12:10.574267   522   522 I zygote  : option[8]=-XX:HeapGrowthLimit=128m
01-10 14:12:10.574304   522   522 I zygote  : option[9]=-Xusejit:true
01-10 14:12:10.574332   522   522 I zygote  : option[10]=-Xjitsaveprofilinginfo
01-10 14:12:10.574354   522   522 I zygote  : option[11]=-agentlib:jdwp=transport=dt_android_adb,suspend=n,server=y
01-10 14:12:10.574376   522   522 I zygote  : option[12]=-Ximage-compiler-option
01-10 14:12:10.574395   522   522 I zygote  : option[13]=--runtime-arg
01-10 14:12:10.574416   522   522 I zygote  : option[14]=-Ximage-compiler-option
01-10 14:12:10.574434   522   522 I zygote  : option[15]=-Xms64m
01-10 14:12:10.574470   522   522 I zygote  : option[16]=-Ximage-compiler-option
01-10 14:12:10.574497   522   522 I zygote  : option[17]=--runtime-arg
01-10 14:12:10.574525   522   522 I zygote  : option[18]=-Ximage-compiler-option
01-10 14:12:10.574552   522   522 I zygote  : option[19]=-Xmx64m
01-10 14:12:10.574581   522   522 I zygote  : option[20]=-Ximage-compiler-option
01-10 14:12:10.574613   522   522 I zygote  : option[21]=--image-classes=/system/etc/preloaded-classes
01-10 14:12:10.574642   522   522 I zygote  : option[22]=-Ximage-compiler-option
01-10 14:12:10.574687   522   522 I zygote  : option[23]=--compiled-classes=/system/etc/compiled-classes
01-10 14:12:10.574723   522   522 I zygote  : option[24]=-Ximage-compiler-option
01-10 14:12:10.574760   522   522 I zygote  : option[25]=--dirty-image-objects=/system/etc/dirty-image-objects
01-10 14:12:10.574790   522   522 I zygote  : option[26]=-Xcompiler-option
01-10 14:12:10.574820   522   522 I zygote  : option[27]=--runtime-arg
01-10 14:12:10.574840   522   522 I zygote  : option[28]=-Xcompiler-option
01-10 14:12:10.574868   522   522 I zygote  : option[29]=-Xms64m
01-10 14:12:10.574896   522   522 I zygote  : option[30]=-Xcompiler-option
01-10 14:12:10.574923   522   522 I zygote  : option[31]=--runtime-arg
01-10 14:12:10.574951   522   522 I zygote  : option[32]=-Xcompiler-option
01-10 14:12:10.574979   522   522 I zygote  : option[33]=-Xmx512m
01-10 14:12:10.575017   522   522 I zygote  : option[34]=-Ximage-compiler-option
01-10 14:12:10.575039   522   522 I zygote  : option[35]=--instruction-set-variant=cortex-a53
01-10 14:12:10.575058   522   522 I zygote  : option[36]=-Xcompiler-option
01-10 14:12:10.575078   522   522 I zygote  : option[37]=--instruction-set-variant=cortex-a53
01-10 14:12:10.575098   522   522 I zygote  : option[38]=-Ximage-compiler-option
01-10 14:12:10.575119   522   522 I zygote  : option[39]=--instruction-set-features=default
01-10 14:12:10.575152   522   522 I zygote  : option[40]=-Xcompiler-option
01-10 14:12:10.575173   522   522 I zygote  : option[41]=--instruction-set-features=default
01-10 14:12:10.575193   522   522 I zygote  : option[42]=-Duser.locale=zh-Hans-CN
01-10 14:12:10.575214   522   522 I zygote  : option[43]=--cpu-abilist=armeabi-v7a,armeabi
01-10 14:12:10.575236   522   522 I zygote  : option[44]=-Xfingerprint:Datalogic/dl35cn/dl35:8.1.0/1.07.15.20191227/1577435794:user/release-keys
01-10 14:12:10.579570   527   527 W BatteryNotifier: batterystats service unavailable!
01-10 14:12:10.583848   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.camera.provider@2.4::ICameraProvider/legacy/0 in either framework or device manifest.
01-10 14:12:10.592070   573   573 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 14:12:10.592318   573   573 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 14:12:10.592465   573   573 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -X oem_mobile 
01-10 14:12:10.749401   573   573 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 14:12:10.749612   573   573 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 14:12:10.749764   573   573 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -F oem_wifi 
01-10 14:12:10.794876   573   573 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 14:12:10.795087   573   573 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 14:12:10.795238   573   573 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -F oem_wifi 
01-10 14:12:10.844038   573   573 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 14:12:10.844355   573   573 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 14:12:10.844528   573   573 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -X oem_wifi 
01-10 14:12:10.870162   539   539 I MobileLogD: logd_sock: 19
01-10 14:12:10.872326   539   539 I MobileLogD: init debug
01-10 14:12:10.874610   539   761 I MobileLogD: write thread 761
01-10 14:12:10.876530   539   760 I MobileLogD: read thread 760
01-10 14:12:10.876750   539   760 E MobileLogD: /sys/kernel/debug/tracing/instances/bsp/trace_pipe is ready now, and open it.
01-10 14:12:10.891025   563   578 D PQ      : ccorr table index=0
01-10 14:12:10.891230   563   578 D PQTransition: onTransition: TRS: Mode2 (13)
01-10 14:12:10.891276   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:10.891468   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:10.892392   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:10.903703   573   573 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 14:12:10.905152   544   637 I ServiceManager: Waiting for service package_native...
01-10 14:12:10.908153   573   573 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 14:12:10.908689   573   573 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -X oem_wifi 
01-10 14:12:10.909834   563   578 D PQ      : ccorr table index=0
01-10 14:12:10.909962   563   578 D PQTransition: onTransition: TRS: Mode2 (14)
01-10 14:12:10.910087   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:10.910221   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:10.921865   621   621 D HWUIExtension: 7 Program id 10, key 0x0002000800000003, offset 33708, binaryLength 5140 within 51114ns
01-10 14:12:10.925162   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:10.928609   563   578 D PQ      : ccorr table index=0
01-10 14:12:10.928690   563   578 D PQTransition: onTransition: TRS: Mode2 (15)
01-10 14:12:10.928779   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:10.928839   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:10.928849   523   562 D AAL     : 01-10 02:12:10.854 BL= 942,ESS= 256, 01-10 02:12:10.872 BL= 941,ESS= 256, 01-10 02:12:10.892 BL= 940,ESS= 256, 01-10 02:12:10.910 BL= 939,ESS= 256, 01-10 02:12:10.928 BL= 938,ESS= 256, 
01-10 14:12:10.942136   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:10.947521   563   578 D PQ      : ccorr table index=0
01-10 14:12:10.947655   563   578 D PQTransition: onTransition: TRS: Mode2 (16)
01-10 14:12:10.947745   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:10.947806   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:10.954000   763   763 W aee     : type=1400 audit(0.0:34): avc: denied { getattr } for path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=5378 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
01-10 14:12:10.956569   763   763 D AEE_AED : Rtt command(type:0, file_path:3 arg0:539)
01-10 14:12:10.956799   763   763 E AEE_AED : aee:rttdRtt command connect socket fail: Connection refused
01-10 14:12:10.956856   763   763 E AEE_AED : aee:rttd_64Rtt command connect 64_socket fail: Connection refused
01-10 14:12:10.956871   763   763 D AEE_AED : switch AEE mode fail
01-10 14:12:10.967051   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:10.967213   563   578 D PQ      : ccorr table index=0
01-10 14:12:10.967269   563   578 D PQTransition: onTransition: TRS: Mode2 (17)
01-10 14:12:10.967351   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:10.967552   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:10.984301   621   621 D HWUIExtension: 8 Program id 11, key 0x0000010000000008, offset 38848, binaryLength 9412 within 62143ns
01-10 14:12:10.985507   563   578 D PQ      : ccorr table index=0
01-10 14:12:10.985595   563   578 D PQTransition: onTransition: TRS: Mode2 (18)
01-10 14:12:10.985661   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:10.985725   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:10.987883   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.004725   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.004922   563   578 D PQTransition: onTransition: TRS: Mode2 (19)
01-10 14:12:11.005094   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.005313   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.006538   398   421 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=20.93 dur=1003.23 max=67.86 min=33.82
01-10 14:12:11.008798   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.013433   377   696 E AudioParamParser-vnd: audioTypeLoadParamUnitHash(), No paramUnit element found!
01-10 14:12:11.017294   621   621 D HWUIExtension: 9 Program id 12, key 0x0002000800000001, offset 48260, binaryLength 5140 within 32872ns
01-10 14:12:11.018117   621   621 D HWUIExtension: 10 Program id 13, key 0x0000001800000000, offset 53400, binaryLength 4648 within 705ns
01-10 14:12:11.023152   523   562 D AAL     : 01-10 02:12:10.947 BL= 937,ESS= 256, 01-10 02:12:10.968 BL= 936,ESS= 256, 01-10 02:12:10.985 BL= 935,ESS= 256, 01-10 02:12:11.004 BL= 934,ESS= 256, 01-10 02:12:11.023 BL= 933,ESS= 256, 
01-10 14:12:11.023277   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.023314   563   578 D PQTransition: onTransition: TRS: Mode2 (20)
01-10 14:12:11.023383   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.023521   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.026000   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.041715   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.041791   563   578 D PQTransition: onTransition: TRS: Mode2 (21)
01-10 14:12:11.041863   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.041958   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.046015   377   696 D AudioSmartPaController: initSmartPaAttribute(), spkType: int_lo_buf, isSmartPAUsed: 0, SmartPA dynamic detect: 0
01-10 14:12:11.046129   377   696 D AudioALSAHardwareResourceManager: AudioALSAHardwareResourceManager()
01-10 14:12:11.050775   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.051755   377   696 D AudioALSACodecDeviceBase: AudioALSACodecDeviceBase()
01-10 14:12:11.051927   377   696 D AudioALSACodecDeviceOutEarphonePMIC: AudioALSACodecDeviceOutEarphonePMIC()
01-10 14:12:11.052028   377   696 D AudioALSACodecDeviceOutEarphonePMIC: DeviceDoDcCalibrate(), ctl Dctrim_Control_Switch = 2
01-10 14:12:11.052045   377   696 D AudioALSACodecDeviceOutEarphonePMIC: DeviceDoDcCalibrate(), dc trimmed
01-10 14:12:11.052094   377   696 D AudioALSACodecDeviceBase: AudioALSACodecDeviceBase()
01-10 14:12:11.052129   377   696 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: AudioALSACodecDeviceOutSpeakerEarphonePMIC()
01-10 14:12:11.052162   377   696 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: DeviceDoDcCalibrate()
01-10 14:12:11.052195   377   696 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: DeviceDoDcCalibrate(), can't get mixer control(Audio HPL_SPK Offset)
01-10 14:12:11.052235   377   696 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: DeviceDoDcCalibrate(), can't get mixer control(Audio HPR_SPK Offset)
01-10 14:12:11.060584   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.060672   563   578 D PQTransition: onTransition: TRS: Mode2 (22)
01-10 14:12:11.060743   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.060842   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.065536   377   696 D AudioALSADeviceConfigManager: TiXmlDeclaration version = 1.0, Encoding = UTF-8, Standalone = 
01-10 14:12:11.065631   377   696 D AudioALSADeviceConfigManager: GetVersion = 1.01
01-10 14:12:11.065645   377   696 D AudioALSADeviceConfigManager: +ParseInitSequence()
01-10 14:12:11.065661   377   696 D AudioALSADeviceConfigManager: valname = Audio_Speaker_class_Switch  valvalue = CLASSAB  
01-10 14:12:11.065697   377   696 D AudioALSADeviceConfigManager: -ParseInitSequence()
01-10 14:12:11.065713   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphone_output action = turnon
01-10 14:12:11.065741   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphone_output action = turnoff
01-10 14:12:11.065763   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = receiver_output action = turnon
01-10 14:12:11.065795   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = receiver_output action = turnoff
01-10 14:12:11.065815   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = two_in_one_speaker_output action = turnon
01-10 14:12:11.065838   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = two_in_one_speaker_output action = turnoff
01-10 14:12:11.065861   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = speaker_output action = turnon
01-10 14:12:11.065881   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = speaker_output action = turnoff
01-10 14:12:11.065900   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphoneSpeaker_output action = turnon
01-10 14:12:11.065924   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphoneSpeaker_output action = turnoff
01-10 14:12:11.065942   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_speaker_output action = turnon
01-10 14:12:11.065963   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_speaker_output action = turnoff
01-10 14:12:11.065982   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_headphoneSpeaker_output action = turnon
01-10 14:12:11.066020   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_headphoneSpeaker_output action = turnoff
01-10 14:12:11.066047   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = ext_speaker_output action = turnon
01-10 14:12:11.066067   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = ext_speaker_output action = turnoff
01-10 14:12:11.066087   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1 action = turnon
01-10 14:12:11.066125   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1 action = turnoff
01-10 14:12:11.066153   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1_Inverse action = turnon
01-10 14:12:11.066186   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1_Inverse action = turnoff
01-10 14:12:11.066223   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2 action = turnon
01-10 14:12:11.066255   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2 action = turnoff
01-10 14:12:11.066291   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2_Inverse action = turnon
01-10 14:12:11.066323   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2_Inverse action = turnoff
01-10 14:12:11.066350   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_SingleMic action = turnon
01-10 14:12:11.066379   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_SingleMic action = turnoff
01-10 14:12:11.066406   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_DualMic action = turnon
01-10 14:12:11.066438   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_DualMic action = turnoff
01-10 14:12:11.066470   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic action = turnon
01-10 14:12:11.066504   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic action = turnoff
01-10 14:12:11.066532   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic_Inverse action = turnon
01-10 14:12:11.066565   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic_Inverse action = turnoff
01-10 14:12:11.066593   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headset_mic_input action = turnon
01-10 14:12:11.066624   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headset_mic_input action = turnoff
01-10 14:12:11.066652   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = sidetone_switch action = turnon
01-10 14:12:11.066673   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = sidetone_switch action = turnoff
01-10 14:12:11.066692   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeACCMode action = setting
01-10 14:12:11.066713   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDCCMode action = setting
01-10 14:12:11.066734   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDMICMode action = setting
01-10 14:12:11.066755   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDCCECMDIFFMode action = setting
01-10 14:12:11.066784   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDCCECMSINGLEMode action = setting
01-10 14:12:11.066814   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeACCMode action = setting
01-10 14:12:11.066844   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDCCMode action = setting
01-10 14:12:11.066873   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDMICMode action = setting
01-10 14:12:11.066900   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDCCECMDIFFMode action = setting
01-10 14:12:11.066923   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDCCECMSINGLEMode action = setting
01-10 14:12:11.066950   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeACCMode action = setting
01-10 14:12:11.066973   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDCCMode action = setting
01-10 14:12:11.066999   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDMICMode action = setting
01-10 14:12:11.067027   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDCCECMDIFFMode action = setting
01-10 14:12:11.067055   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDCCECMSINGLEMode action = setting
01-10 14:12:11.067085   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeACCMode action = setting
01-10 14:12:11.067113   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDCCMode action = setting
01-10 14:12:11.067146   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDMICMode action = setting
01-10 14:12:11.067175   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDCCECMDIFFMode action = setting
01-10 14:12:11.067203   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDCCECMSINGLEMode action = setting
01-10 14:12:11.067234   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic_Setting_Inverse action = setting
01-10 14:12:11.067265   377   696 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic_Setting_NoInverse action = setting
01-10 14:12:11.068283   377   696 D AudioCustParamClient: AudioCustParamClient()
01-10 14:12:11.068394   377   696 D AudioCustParamClient: Init(), acpOpsInited(0)
01-10 14:12:11.068408   377   696 D AudioCustParamClient: Init(), init AcpOps struct
01-10 14:12:11.068765   377   696 D AudioCustParam: appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 14:12:11.069674   377   696 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 14:12:11.069782   377   696 D AudioUtility: PHONE_MIC_MODE defined!, mPhoneMicMode = 1
01-10 14:12:11.069842   377   696 D AudioUtility: HEADSET_MIC_MODE defined!, mHeadsetMicMode = 2
01-10 14:12:11.069890   377   696 D AudioALSADeviceConfigManager: ApplyDeviceSettingByName() DeviceName = Mic1TypeACCMode descriptor->DeviceStatusCounter = 0
01-10 14:12:11.069975   377   696 D AudioALSADeviceConfigManager: ApplyDeviceSettingByName() DeviceName = Mic2TypeACCMode descriptor->DeviceStatusCounter = 0
01-10 14:12:11.070146   377   696 D AudioMTKGainController: AudioMTKGainController contructor
01-10 14:12:11.070237   377   696 D AudioSpeechEnhanceInfo: getInstance()
01-10 14:12:11.070299   377   696 D AudioSpeechEnhanceInfo: AudioSpeechEnhanceInfo()
01-10 14:12:11.070476   377   696 D AudioSpeechEnhanceInfo: AudioSpeechEnhanceInfo(), mAudioCustParamClient(0xead892e0)
01-10 14:12:11.070512   377   696 D AudioSpeechEnhanceInfo: PreLoadBesRecordParams+
01-10 14:12:11.070530   377   696 D NVRAM   : GetHdRecordSceneTableFromNV()
01-10 14:12:11.071282   377   696 D NVRAM   : length of g_NVRAM_BACKUP_DEVICE=44
01-10 14:12:11.071468   377   696 D NVRAM   : failed to get entry for /nvdata 
01-10 14:12:11.071501   377   696 D NVRAM   : failed to get nvdata path /nvdata 
01-10 14:12:11.071584   377   696 D NVRAM   : nvram_layout_callback will run!!!
01-10 14:12:11.071617   377   696 D NVRAM   : nvram_platform_log_block: 2
01-10 14:12:11.071631   377   696 D NVRAM   : nvram_platform_resv_block: 2
01-10 14:12:11.071643   377   696 D NVRAM   : nvram_platform_DM_block: 1
01-10 14:12:11.071656   377   696 D NVRAM   : nvram_platform_layout_version: 0
01-10 14:12:11.071669   377   696 D NVRAM   : nvram_platform_header_offset: 0
01-10 14:12:11.071684   377   696 D NVRAM   : g_i4CFG_File_Count: 51
01-10 14:12:11.071695   377   696 D NVRAM   : NVM_Init Max Lid: 78
01-10 14:12:11.071709   377   696 D NVRAM   : [NVRAM]: info nvram_gpt_flag =1
01-10 14:12:11.071721   377   696 D NVRAM   : [NVRAM]: info NVRAM Init Completed!
01-10 14:12:11.071911   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_Hd_Record_Scene_Table,LID:66
01-10 14:12:11.073049   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.076804   377   696 D NVRAM   : NVM_CmpFileVerNo 66  
01-10 14:12:11.076949   377   696 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 14:12:11.076967   377   696 D NVRAM   : NVM_ProtectDataFile : 66 ++
01-10 14:12:11.076980   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.077009   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:137,size in table:135
01-10 14:12:11.079491   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.079608   563   578 D PQTransition: onTransition: TRS: Mode2 (23)
01-10 14:12:11.079694   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.079759   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.083690   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.083749   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.083764   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.083794   377   696 D NVRAM   : GetHdRecordSceneTableFromNV rec_size = 135 rec_num = 1
01-10 14:12:11.085840   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.085933   377   696 D NVRAM   : GetHdRecordSceneTableFromNV result = 135
01-10 14:12:11.085947   377   696 D NVRAM   : GetHdRecordParamFromNV()
01-10 14:12:11.086070   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_Hd_Record_Param,LID:65
01-10 14:12:11.086412   377   696 D NVRAM   : NVM_CmpFileVerNo 65  
01-10 14:12:11.086492   377   696 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 14:12:11.086507   377   696 D NVRAM   : NVM_ProtectDataFile : 65 ++
01-10 14:12:11.086518   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.086546   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:4056,size in table:4054
01-10 14:12:11.090858   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.090930   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.090944   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.090974   377   696 D NVRAM   : GetHdRecordParamFromNV rec_size = 4054 rec_num = 1
01-10 14:12:11.092760   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.096648   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.096775   377   696 D NVRAM   : GetHdRecordParamFromNV result = 4054
01-10 14:12:11.096901   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_VOIP_Param,LID:17
01-10 14:12:11.097123   377   696 D NVRAM   : NVM_CmpFileVerNo 17  
01-10 14:12:11.097183   377   696 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 14:12:11.097198   377   696 D NVRAM   : NVM_ProtectDataFile : 17 ++
01-10 14:12:11.097212   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.097235   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:1594,size in table:1592
01-10 14:12:11.098357   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.098442   563   578 D PQTransition: onTransition: TRS: Mode2 (24)
01-10 14:12:11.098475   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.098596   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.103974   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.104043   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.104062   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.104095   377   696 D NVRAM   : GetAudioVoIPParamFromNV rec_size = 1592 rec_num = 1
01-10 14:12:11.104456   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.104494   377   696 D NVRAM   : GetAudioVoIPParamFromNV result = 1592
01-10 14:12:11.104527   377   696 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 14:12:11.104543   377   696 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 14:12:11.104698   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Sph_Dual_Mic,LID:59
01-10 14:12:11.104818   377   696 D NVRAM   : NVM_CmpFileVerNo 59  
01-10 14:12:11.104887   377   696 D NVRAM   : Load File Version: 002, NvRam File Version: 002
01-10 14:12:11.104919   377   696 D NVRAM   : NVM_ProtectDataFile : 59 ++
01-10 14:12:11.104930   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.104955   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:938,size in table:936
01-10 14:12:11.106257   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.106329   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.106344   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.106382   377   696 D NVRAM   : +GetDualMicSpeechParamFromNVRam audio_nvram_fd.lid = 59, rec_size=936, rec_num=1
01-10 14:12:11.106764   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.106811   377   696 D AudioSpeechEnhanceInfo: PreLoadBesRecordParams-
01-10 14:12:11.106967   377   696 D GainTableParamParser: getInstance()
01-10 14:12:11.107027   377   696 D GainTableParamParser: GainTableParamParser()
01-10 14:12:11.107048   377   696 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 14:12:11.107596   377   696 D GainTableParamParser: loadGainTableSpec()
01-10 14:12:11.107743   377   696 D GainTableParamParser: mSpec.audioBufferGainPreferMaxIdx = 18
01-10 14:12:11.107773   377   696 D GainTableParamParser: mSpec.audioBufLMixerName = Headset_PGAL_GAIN
01-10 14:12:11.107787   377   696 D GainTableParamParser: mSpec.audioBufRMixerName = Headset_PGAR_GAIN
01-10 14:12:11.107810   377   696 D GainTableParamParser: mSpec.voiceBufferGainPreferMaxIdx = 18
01-10 14:12:11.107823   377   696 D GainTableParamParser: mSpec.voiceBufMixerName = Handset_PGA_GAIN
01-10 14:12:11.107850   377   696 D GainTableParamParser: mSpec.lineoutBufferGainPreferMaxIdx = 18
01-10 14:12:11.107883   377   696 D GainTableParamParser: mSpec.spkAnaType = 3
01-10 14:12:11.107903   377   696 D GainTableParamParser: mSpec.spkLMixerName = Lineout_PGAL_GAIN
01-10 14:12:11.107946   377   696 D GainTableParamParser: mSpec.spkRMixerName = Lineout_PGAR_GAIN
01-10 14:12:11.107965   377   696 D GainTableParamParser: spk, db = -64, idx = 0
01-10 14:12:11.107976   377   696 D GainTableParamParser: spk, db = 0, idx = 1
01-10 14:12:11.107986   377   696 D GainTableParamParser: spk, db = 4, idx = 2
01-10 14:12:11.107995   377   696 D GainTableParamParser: spk, db = 5, idx = 3
01-10 14:12:11.108004   377   696 D GainTableParamParser: spk, db = 6, idx = 4
01-10 14:12:11.108014   377   696 D GainTableParamParser: spk, db = 7, idx = 5
01-10 14:12:11.108023   377   696 D GainTableParamParser: spk, db = 8, idx = 6
01-10 14:12:11.108033   377   696 D GainTableParamParser: spk, db = 9, idx = 7
01-10 14:12:11.108043   377   696 D GainTableParamParser: spk, db = 10, idx = 8
01-10 14:12:11.108053   377   696 D GainTableParamParser: spk, db = 11, idx = 9
01-10 14:12:11.108062   377   696 D GainTableParamParser: spk, db = 12, idx = 10
01-10 14:12:11.108073   377   696 D GainTableParamParser: spk, db = 13, idx = 11
01-10 14:12:11.108082   377   696 D GainTableParamParser: spk, db = 14, idx = 12
01-10 14:12:11.108092   377   696 D GainTableParamParser: spk, db = 15, idx = 13
01-10 14:12:11.108101   377   696 D GainTableParamParser: spk, db = 16, idx = 14
01-10 14:12:11.108111   377   696 D GainTableParamParser: spk, db = 17, idx = 15
01-10 14:12:11.108134   377   696 D GainTableParamParser: mSpec.ulPgaLMixerName = Audio_PGA1_Setting
01-10 14:12:11.108147   377   696 D GainTableParamParser: mSpec.ulPgaRMixerName = Audio_PGA2_Setting
01-10 14:12:11.108161   377   696 D GainTableParamParser: loadGainTableMapDl()
01-10 14:12:11.108252   377   696 W GainTableParamParser: error: get paramUnit fail, paramPath = Profile,HSSPK
01-10 14:12:11.108622   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:21.219767,dur:1036.77,max:76.31,min:20.48
01-10 14:12:11.108683   377   696 D GainTableParamParser: loadGainTableMapUl()
01-10 14:12:11.108923   377   696 D GainTableParamParser: loadGainTableHpImpedance()
01-10 14:12:11.108963   377   696 D GainTableParamParser: mSpec.hpImpEnable = 1
01-10 14:12:11.108976   377   696 D GainTableParamParser: mSpec.hpImpDefaultIdx = 1
01-10 14:12:11.108990   377   696 D GainTableParamParser: getSceneList()
01-10 14:12:11.109015   377   696 D AudioMTKGainController: allocateGainTable()
01-10 14:12:11.109073   377   696 D GainTableParamParser: getGainTableParam()
01-10 14:12:11.109113   377   696 D GainTableParamParser: updatePlaybackDigitalGain()
01-10 14:12:11.112347   377   696 D GainTableParamParser: updatePlaybackAnalogGain()
01-10 14:12:11.116876   621   621 D HWUIExtension: 11 Program id 14, key 0x0002001800500044, offset 58048, binaryLength 10924 within 98601ns
01-10 14:12:11.117166   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.117246   563   578 D PQTransition: onTransition: TRS: Mode2 (25)
01-10 14:12:11.117325   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.117422   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.117489   523   562 D AAL     : 01-10 02:12:11.042 BL= 932,ESS= 256, 01-10 02:12:11.061 BL= 931,ESS= 256, 01-10 02:12:11.079 BL= 930,ESS= 256, 01-10 02:12:11.099 BL= 929,ESS= 256, 01-10 02:12:11.117 BL= 928,ESS= 256, 
01-10 14:12:11.121609   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.123799   377   696 D GainTableParamParser: updateSpeechVol()
01-10 14:12:11.124301   377   696 W GainTableParamParser: 	continue, paramPath = Band,NB,Profile,USB,Network,GSM, mMapDlAnalogType[13] = -1
01-10 14:12:11.124824   377   696 W GainTableParamParser: 	continue, paramPath = Band,WB,Profile,USB,Network,GSM, mMapDlAnalogType[13] = -1
01-10 14:12:11.125250   377   696 W GainTableParamParser: 	continue, paramPath = Band,SWB,Profile,USB,Network,GSM, mMapDlAnalogType[13] = -1
01-10 14:12:11.132072   377   696 W GainTableParamParser: 	continue, paramPath = Band,NB,Profile,USB,Network,WCDMA, mMapDlAnalogType[13] = -1
01-10 14:12:11.132636   377   696 W GainTableParamParser: 	continue, paramPath = Band,WB,Profile,USB,Network,WCDMA, mMapDlAnalogType[13] = -1
01-10 14:12:11.133006   377   696 W GainTableParamParser: 	continue, paramPath = Band,SWB,Profile,USB,Network,WCDMA, mMapDlAnalogType[13] = -1
01-10 14:12:11.133365   377   696 W GainTableParamParser: 	continue, paramPath = Band,NB,Profile,USB,Network,VoLTE, mMapDlAnalogType[13] = -1
01-10 14:12:11.133793   377   696 W GainTableParamParser: 	continue, paramPath = Band,WB,Profile,USB,Network,VoLTE, mMapDlAnalogType[13] = -1
01-10 14:12:11.134170   377   696 W GainTableParamParser: 	continue, paramPath = Band,SWB,Profile,USB,Network,VoLTE, mMapDlAnalogType[13] = -1
01-10 14:12:11.134289   377   696 D GainTableParamParser: updateRecordVol()
01-10 14:12:11.135169   401   401 E ccci_fsd(1): FS_IsReadOnly: [error]fail on file: /vendor/nvdata/md/FAT9BC6FD43.log, error=2
01-10 14:12:11.135192   773   773 I AEE_AED : Built Mar 23 2018 13:42:39
01-10 14:12:11.136058   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.136171   563   578 D PQTransition: onTransition: TRS: Mode2 (26)
01-10 14:12:11.136287   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.136356   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.137627   377   696 D GainTableParamParser: updateVoIPVol()
01-10 14:12:11.137787   773   773 I AEE_AED : socket server: android:aee_aed
01-10 14:12:11.137876   377   696 W GainTableParamParser: 	continue, paramPath = Scene,Default,Profile,USB, mMapDlAnalogType[13] = -1
01-10 14:12:11.137919   377   696 D GainTableParamParser: updateRingbackVol()
01-10 14:12:11.138075   773   773 D AEE_AED : aed_get_force_config: -100000
01-10 14:12:11.138144   377   696 D AudioMTKGainController: mMixer = 0xeaddc000
01-10 14:12:11.138206   377   696 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 14:12:11.138570   773   773 I AEE_AED : AED config
01-10 14:12:11.138570   773   773 I AEE_AED :   mode '4'
01-10 14:12:11.138570   773   773 I AEE_AED :   exp level '0
01-10 14:12:11.138570   773   773 I AEE_AED :   dal enable '0'
01-10 14:12:11.138570   773   773 I AEE_AED :   db count '4'
01-10 14:12:11.138570   773   773 I AEE_AED :   fatal db count '4'
01-10 14:12:11.138570   773   773 I AEE_AED :  db storage '2'
01-10 14:12:11.138570   773   773 I AEE_AED :   SMP Info => 1
01-10 14:12:11.138791   377   696 D SpeechDriverFactory: SpeechDriverFactory(), isMD1Supported = 11
01-10 14:12:11.138795   530   530 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 14:12:11.139157   377   696 D SpeechDriverFactory: Create SpeechDriverNormal for MODEM_1
01-10 14:12:11.139238   377   696 D         : CleanGainValueAndMuteStatus(), mUplinkMuteOn 0
01-10 14:12:11.140914   377   696 D SpeechMessengerNormal: openCcciDriver(), ccci_md: 0, dev_name: "/dev/ccci_aud", mCcciDeviceHandler: 18
01-10 14:12:11.142120   772   772 I AEE_AED : Built Mar 23 2018 13:42:19
01-10 14:12:11.142933   772   772 I AEE_AED : socket server: android:aee_aed32
01-10 14:12:11.143161   772   772 D AEE_AED : aed_get_force_config: -100000
01-10 14:12:11.143557   772   772 I AEE_AED : AED config
01-10 14:12:11.143557   772   772 I AEE_AED :   mode '4'
01-10 14:12:11.143557   772   772 I AEE_AED :   exp level '0
01-10 14:12:11.143557   772   772 I AEE_AED :   dal enable '0'
01-10 14:12:11.143557   772   772 I AEE_AED :   db count '4'
01-10 14:12:11.143557   772   772 I AEE_AED :   fatal db count '4'
01-10 14:12:11.143557   772   772 I AEE_AED :  db storage '2'
01-10 14:12:11.143557   772   772 I AEE_AED :   SMP Info => 1
01-10 14:12:11.144748   776   776 I AEE_AEDV: Built Mar 23 2018 13:42:46
01-10 14:12:11.144940   377   696 D ccci_lib: mmap on /dev/ccci_raw_audio(19) for addr=0x8001b000, len=53248
01-10 14:12:11.145859   772   772 D AEE_AED : aee_exception_running_64: send req to debuggerd64
01-10 14:12:11.146081   772   772 D AEE_AED : aee:rttd_64Rtt waiting 64_daemon finish the job...
01-10 14:12:11.146104   776   776 I AEE_AEDV: socket server: android:aee_aedv
01-10 14:12:11.146198   377   696 W SpeechMessengerNormal: checkModemReady(), modem_status 1 != MODEM_STATUS_READY
01-10 14:12:11.146513   776   776 D AEE_AEDV: aed_get_force_config: -100000
01-10 14:12:11.146942   776   776 I AEE_AEDV: AED config
01-10 14:12:11.146942   776   776 I AEE_AEDV:   mode '4'
01-10 14:12:11.146942   776   776 I AEE_AEDV:   exp level '0
01-10 14:12:11.146942   776   776 I AEE_AEDV:   dal enable '0'
01-10 14:12:11.146942   776   776 I AEE_AEDV:   db count '4'
01-10 14:12:11.146942   776   776 I AEE_AEDV:   fatal db count '4'
01-10 14:12:11.146942   776   776 I AEE_AEDV:  db storage '2'
01-10 14:12:11.146942   776   776 I AEE_AEDV:   SMP Info => 1
01-10 14:12:11.147742   773   773 D AEE_AED : $===AEE===AEE===AEE===$
01-10 14:12:11.147798   773   773 D AEE_AED : p 0 poll events 1 revents 1
01-10 14:12:11.147862   773   773 D AEE_AED : requesting from: pid=772 cmd=9
01-10 14:12:11.147874   773   773 D AEE_AED : Go RTT_AEE_GET_EXCEPTION_RUNNING
01-10 14:12:11.148023   772   772 D AEE_AED : Rtt send 64 req done
01-10 14:12:11.148179   772   772 E AEE_AED : Can't remove file /data/aee_exp/temp: No such file or directory
01-10 14:12:11.150583   530   530 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base_mtk.so absent, libpq_cust_mtk.so absent
01-10 14:12:11.151049   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.151236   530   530 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 14:12:11.151823   530   530 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 14:12:11.151949   530   530 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 14:12:11.152334   530   530 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 14:12:11.152941   377   779 W SpeechMessengerNormal: formatShareMemoryThread(), #0 checkModemReady fail...
01-10 14:12:11.153046   377   696 D SpeechEnhancementController: mSpeechEnhancementMask: main_func = 0xffff, sub_func = 0xffffff9f
01-10 14:12:11.153118   377   696 D SpeechEnhancementController: GetBtHeadsetNrecOn(), mBtHeadsetNrecOn = 1
01-10 14:12:11.153638   377   696 W SpeechDriverFactory: Create SpeechDriverDummy for MODEM_2
01-10 14:12:11.153696   377   696 D         : CleanGainValueAndMuteStatus(), mUplinkMuteOn 0
01-10 14:12:11.153710   377   696 W SpeechDriverDummy: SpeechDriverDummy(), modem_index = 1
01-10 14:12:11.153737   377   696 W SpeechDriverFactory: Create SpeechDriverDummy for MODEM_EXTERNAL
01-10 14:12:11.153760   377   696 D         : CleanGainValueAndMuteStatus(), mUplinkMuteOn 0
01-10 14:12:11.153770   377   696 W SpeechDriverDummy: SpeechDriverDummy(), modem_index = 2
01-10 14:12:11.153801   377   696 D SpeechDriverFactory: -SpeechDriverFactory(), mActiveModemIndex = 0
01-10 14:12:11.153926   377   696 D AudioALSAFMController: AudioALSAFMController()
01-10 14:12:11.154029   377   696 D         : AudioALSAVoiceWakeUpController()
01-10 14:12:11.154052   377   696 D         : AudioALSAVoiceWakeUpController() , stream_attribute_target->BesRecord_Info.besrecord_enable 0
01-10 14:12:11.154254   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Voice_Recognize_Param,LID:15
01-10 14:12:11.154731   377   696 D NVRAM   : NVM_CmpFileVerNo 15  
01-10 14:12:11.154868   377   696 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 14:12:11.154894   377   696 D NVRAM   : NVM_ProtectDataFile : 15 ++
01-10 14:12:11.154906   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.154932   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:1548,size in table:1546
01-10 14:12:11.154941   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.155054   563   578 D PQTransition: onTransition: TRS: Mode2 (27)
01-10 14:12:11.155099   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.155206   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.157206   530   530 I         : [VT][SRV]ServiceManager: 0xf0d1f8c0
01-10 14:12:11.157266   530   530 I         : [VT][SRV]before VTService_instantiate
01-10 14:12:11.157278   530   530 E VT      : [VTS] before addService
01-10 14:12:11.162762   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.162858   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.162875   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.162912   377   696 D NVRAM   : GetVoiceRecogCustParamFromNV rec_size = 1546 rec_num = 1
01-10 14:12:11.166653   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.166748   377   696 D         : updateParamToKernel(), mVOW_CFG4 load = 0xffffffea
01-10 14:12:11.166764   377   696 D         : updateParamToKernel(), mVOW_CFG4 set = 0xffef, mVOW_CFG2=0x2323, mVOW_CFG3=0xa768
01-10 14:12:11.166780   377   696 E         : Error: Audio VOWCFG2 Data invalid value
01-10 14:12:11.166795   377   696 E         : Error: Audio VOWCFG3 Data invalid value
01-10 14:12:11.166810   377   696 E         : Error: Audio VOWCFG4 Data invalid value
01-10 14:12:11.166826   377   696 E         : Error: Audio VOW Periodic On Off Data invalid value
01-10 14:12:11.166843   377   696 D AudioALSAStreamManager: AudioALSAStreamManager()
01-10 14:12:11.167059   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_AudEnh_Control_Opt,LID:16
01-10 14:12:11.167164   377   696 D NVRAM   : NVM_CmpFileVerNo 16  
01-10 14:12:11.167222   377   696 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 14:12:11.167236   377   696 D NVRAM   : NVM_ProtectDataFile : 16 ++
01-10 14:12:11.167247   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.167270   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:6,size in table:4
01-10 14:12:11.170167   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.171186   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.171276   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.171292   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.171345   377   696 D NVRAM   : GetBesLoudnessControlOptionParamFromNV rec_size = 4 rec_num = 1
01-10 14:12:11.172372   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.172518   377   696 D AudioALSAStreamManager: AudioALSAStreamManager(), mBesLoudnessStatus [1] (From NvRam) 
01-10 14:12:11.172619   377   696 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 14:12:11.173251   377   696 D AudioALSAStreamManager: AudioALSAStreamManager() appHandleGetInstance
01-10 14:12:11.173325   377   696 D AudioALSAStreamManager: AudioALSAStreamManager() appHandleRegXmlChangedCb
01-10 14:12:11.173368   377   696 D AudioUtility: getPowerHal(), get PowerHal Service
01-10 14:12:11.173846   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.173969   563   578 D PQTransition: onTransition: TRS: Mode2 (28)
01-10 14:12:11.174007   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.174525   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.176955   377   696 D AudioUtility: getPowerHal(), Link to death notification successfully
01-10 14:12:11.177037   377   696 D AudioALSAParamTuner: getInstance(), create AudioALSAParamTuner instance --
01-10 14:12:11.177084   377   696 D AudioALSAParamTuner: +AudioALSAParamTuner()
01-10 14:12:11.177111   377   696 D NVRAM   : GetVolumeVer1ParamFromNV 
01-10 14:12:11.177269   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_ver1_Vol_custom,LID:64
01-10 14:12:11.177414   377   696 D NVRAM   : NVM_CmpFileVerNo 64  
01-10 14:12:11.177482   377   696 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 14:12:11.177505   377   696 D NVRAM   : NVM_ProtectDataFile : 64 ++
01-10 14:12:11.177515   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.177540   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:583,size in table:581
01-10 14:12:11.180823   774   774 I AEE_AEDV: Built Mar 23 2018 13:42:26
01-10 14:12:11.182036   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.182106   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.182123   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.182151   377   696 D NVRAM   : GetVolumeVer1ParamFromNV rec_size = 581 rec_num = 1
01-10 14:12:11.182308   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.182350   377   696 D AudioMTKGainController: getMicGainDecimal(), micMode 1, gainDevice 0, micGainDecimal 152
01-10 14:12:11.182413   377   696 D AudioMTKGainController: getMicGainDecimal(), micMode 1, gainDevice 2, micGainDecimal 168
01-10 14:12:11.182444   377   696 D AudioALSAParamTuner: AudioALSAParamTuner(), AudioALSAParamTuner: default mic gain-mormal:168;handsfree:252, receiver gain:112, headset Gain:76
01-10 14:12:11.182473   377   696 D AudioALSAParamTuner: getInstance(), create AudioALSAParamTuner instance ++
01-10 14:12:11.182494   377   696 D AudioALSAHardware: AudioALSAHardware()
01-10 14:12:11.182578   377   696 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 14:12:11.182819   774   774 I AEE_AEDV: socket server: android:aee_aedv32
01-10 14:12:11.183096   377   696 D AudioALSAHardware: AudioALSAHardware(), mAudioHalBtscoWB = 0
01-10 14:12:11.183116   774   774 D AEE_AEDV: aed_get_force_config: -100000
01-10 14:12:11.183161   377   696 D WCNChipController: WCNChipController()
01-10 14:12:11.183198   377   696 D WCNChipController: SetBTCurrentSamplingRateNumber(), mBTCurrentSamplingRateNumber: 8000 => 8000
01-10 14:12:11.183219   377   696 D AudioBTCVSDControl: +AudioBTCVSDControl
01-10 14:12:11.183253   377   696 D AudioBTCVSDControl: AudioBTCVSDControl constructor
01-10 14:12:11.183573   774   774 I AEE_AEDV: AED config
01-10 14:12:11.183573   774   774 I AEE_AEDV:   mode '4'
01-10 14:12:11.183573   774   774 I AEE_AEDV:   exp level '0
01-10 14:12:11.183573   774   774 I AEE_AEDV:   dal enable '0'
01-10 14:12:11.183573   774   774 I AEE_AEDV:   db count '4'
01-10 14:12:11.183573   774   774 I AEE_AEDV:   fatal db count '4'
01-10 14:12:11.183573   774   774 I AEE_AEDV:  db storage '2'
01-10 14:12:11.183573   774   774 I AEE_AEDV:   SMP Info => 1
01-10 14:12:11.188456   774   774 D AEE_AEDV: aee_exception_running_64: send req to debuggerd64
01-10 14:12:11.188770   774   774 D AEE_AEDV: aee:vrttd_64Rtt waiting 64_daemon finish the job...
01-10 14:12:11.191200   776   776 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 14:12:11.191264   776   776 D AEE_AEDV: p 0 poll events 1 revents 1
01-10 14:12:11.191328   776   776 D AEE_AEDV: requesting from: pid=774 cmd=9
01-10 14:12:11.191341   776   776 D AEE_AEDV: Go RTT_AEE_GET_EXCEPTION_RUNNING
01-10 14:12:11.191527   774   774 D AEE_AEDV: Rtt send 64 req done
01-10 14:12:11.191673   774   774 E AEE_AEDV: Can't remove file /data/vendor/mtklog/aee_exp/temp: No such file or directory
01-10 14:12:11.191801   774   774 E AEE_AEDV: Can't remove file /sdcard/mtklog/aee_exp/temp: No such file or directory
01-10 14:12:11.191838   774   774 E AEE_AEDV: Can't remove file /storage/ext_sd/mtklog/aee_exp/temp: No such file or directory
01-10 14:12:11.192636   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.192718   563   578 D PQTransition: onTransition: TRS: Mode2 (29)
01-10 14:12:11.192752   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.192830   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.192962   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.194531   621   621 D HWUIExtension: 12 Program id 15, key 0x0000001000000008, offset 68972, binaryLength 11256 within 77470ns
01-10 14:12:11.197135   774   774 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 14:12:11.197255   774   774 D AEE_AEDV: p 5 poll events 1 revents 1
01-10 14:12:11.197480   774   774 D AEE_AEDV: PPM cpu cores:8, online:8
01-10 14:12:11.200560   774   774 D AEE_AEDV: aed_main_fork_worker: generator 0xef3955f0, worker 0xffb28088, recv_fd 0
01-10 14:12:11.201579   788   788 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 14:12:11.201702   788   788 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 14:12:11.201722   788   788 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 14:12:11.203522   788   788 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 14:12:11.203677   788   788 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 14:12:11.204731   788   788 W AEE_AEDV: ipanic heahder: magic:0, version:0, size:0, datas:0
01-10 14:12:11.204808   788   788 W AEE_AEDV: ipanic heahder: dhblk:0, blksize:0, partsize:0, bufsize:0
01-10 14:12:11.204901   788   788 W AEE_AEDV: aed_reboot_session, no valid ipanic header, ignored
01-10 14:12:11.204994   788   788 V ETM     : open etb_get_nr fail! , default etb_nr is 1 , (2, No such file or directory)
01-10 14:12:11.205117   788   788 V ETM     : open etb_length fail! (2, No such file or directory)
01-10 14:12:11.205144   788   788 V ETM     : open etb_length fail! (2, No such file or directory)
01-10 14:12:11.205688   788   788 I AEE_AEDV: wdt_status = 2, fiq_step=0, exception_type:0 
01-10 14:12:11.205838   788   788 I AEE_AEDV: powerup reason:wdt_by_pass_pwk
01-10 14:12:11.205838   788   788 I AEE_AEDV: 
01-10 14:12:11.205852   788   788 I AEE_AEDV: reboot_reason = 0
01-10 14:12:11.206067   788   788 E         : mrdump_support_user_load: null mrdump lk version
01-10 14:12:11.206121   788   788 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 14:12:11.206159   788   788 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 14:12:11.206180   788   788 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 14:12:11.206939   377   696 D AudioBTCVSDControl: BT_SCO_SET_TXState state=0x0
01-10 14:12:11.207005   377   696 D AudioBTCVSDControl: BT_SCO_SET_RXState state=0x10
01-10 14:12:11.207022   377   696 D AudioBTCVSDControl: BT_SCO_CVSD_Init() allocate mBTSCOCVSDContext
01-10 14:12:11.207035   377   696 D AudioBTCVSDControl: -AudioBTCVSDControl
01-10 14:12:11.207048   377   696 D AudioBTCVSDControl: AudioBTCVSDControl getInstance()
01-10 14:12:11.207063   377   696 D AudioBTCVSDControl: BT_SCO_SetMode, mode=0, BTmode=0
01-10 14:12:11.207077   377   696 D AudioALSASpeechPhoneCallController: setBTMode(), mBTMode: 0 => 0
01-10 14:12:11.207117   377   696 D AudioALSAHardware: -mAudioALSAHardware
01-10 14:12:11.207157   377   696 D mtk_audio_hw_hal: gAudioHALRefCountByClient + 1
01-10 14:12:11.207787   788   788 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 14:12:11.207913   788   788 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 14:12:11.207915   377   696 D AudioALSAHardware: initCheck()
01-10 14:12:11.208280   377   696 D AudioALSAStreamManager: setMasterVolume(), volume = 1.000000
01-10 14:12:11.208368   377   696 D AudioMTKGainController: setNormalVolume(), mSceneIndex = 0, stream -1, devices 0x0, index -1, mode 0x0
01-10 14:12:11.208461   377   696 D SpeechParamParser: SpeechParamParser()
01-10 14:12:11.208506   377   696 D SpeechParamParser: Init()
01-10 14:12:11.208518   377   696 D SpeechParamParser: +InitAppParser()
01-10 14:12:11.208531   377   696 D SpeechParamParser: InitAppParser() appHandleGetInstance
01-10 14:12:11.208545   377   696 D SpeechParamParser: appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 14:12:11.209051   788   788 D AEE_AEDV: version(aabbccdd)
01-10 14:12:11.209070   377   696 D SpeechParamParser: InitAppParser() appHandleRegXmlChangedCb
01-10 14:12:11.209191   377   696 D SpeechParamParser: InitSpeechNetwork(), i=0, sizeByteFromApp=2, supportBit=0xfff
01-10 14:12:11.209218   377   696 D SpeechParamParser: -InitSpeechNetwork(), total size byte=2
01-10 14:12:11.209237   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[0].name = GSM
01-10 14:12:11.209254   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[1].name = GSM
01-10 14:12:11.209270   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[2].name = GSM
01-10 14:12:11.209285   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[3].name = GSM
01-10 14:12:11.209301   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[4].name = GSM
01-10 14:12:11.209328   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[5].name = GSM
01-10 14:12:11.209344   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[6].name = GSM
01-10 14:12:11.209368   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[7].name = GSM
01-10 14:12:11.209384   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[8].name = GSM
01-10 14:12:11.209407   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[9].name = GSM
01-10 14:12:11.209425   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[10].name = GSM
01-10 14:12:11.209448   377   696 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[11].name = GSM
01-10 14:12:11.209494   377   696 E AudioMTKGainController: getGainDevice(), error, devices (0) not support, return GAIN_DEVICE_SPEAKER
01-10 14:12:11.209549   377   696 W AudioMTKGainController: error, stream -1 is invalid, use 3 instead
01-10 14:12:11.209567   377   696 W AudioMTKGainController: error, index -1 is invalid, use max 15 instead
01-10 14:12:11.209589   377   696 D AudioMTKGainController: setSpeakerGain(), gain = 9, spkAnaType = 3, spkLMixerName = Lineout_PGAL_GAIN, spkRMixerName = Lineout_PGAR_GAIN
01-10 14:12:11.210040   524   524 I AudioFlinger: loadHwModule() Loaded primary audio interface, handle 10
01-10 14:12:11.210203   524   524 I AudioFlinger: openOutput() this 0xea63e000, module 10 Device 2, SamplingRate 48000, Format 0x000003, Channels 3, flags 6
01-10 14:12:11.210271   774   774 D AEE_AEDV: clear ppm settings
01-10 14:12:11.210388   377   696 D AudioALSAStreamManager: +openOutputStream()
01-10 14:12:11.210481   377   696 D AudioALSAStreamManager: openOutputStream(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, status = 0xd
01-10 14:12:11.210553   377   696 D AudioALSAStreamOut: AudioALSAStreamOut()
01-10 14:12:11.210617   377   696 D AudioALSAStreamOut: set(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, flags = 0x6
01-10 14:12:11.210686   377   696 D AudioALSASampleRateController: AudioALSASampleRateController()
01-10 14:12:11.210730   377   696 D AudioALSASampleRateController: +setPrimaryStreamOutSampleRate(), mPrimaryStreamOutSampleRate: 44100 => 48000
01-10 14:12:11.210747   377   696 D AudioALSASampleRateController: -setPrimaryStreamOutSampleRate(), mPrimaryStreamOutSampleRate: 48000
01-10 14:12:11.210793   377   696 D AudioALSAStreamOut: set(), mStreamAttributeSource.latency 10, mStreamAttributeSource.buffer_size =2048, channels 2.
01-10 14:12:11.211545   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.211607   563   578 D PQTransition: onTransition: TRS: Mode2 (30)
01-10 14:12:11.211637   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.211731   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.212055   774   774 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 14:12:11.212282   523   562 D AAL     : 01-10 02:12:11.136 BL= 927,ESS= 256, 01-10 02:12:11.155 BL= 926,ESS= 256, 01-10 02:12:11.174 BL= 925,ESS= 256, 01-10 02:12:11.192 BL= 924,ESS= 256, 01-10 02:12:11.212 BL= 923,ESS= 256, 
01-10 14:12:11.214172   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.225927   621   621 D HWUIExtension: 13 Program id 16, key 0x0002000000900041, offset 80228, binaryLength 5204 within 31171ns
01-10 14:12:11.230381   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.230573   563   578 D PQTransition: onTransition: TRS: Mode2 (31)
01-10 14:12:11.230765   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.230951   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.234675   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.249147   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.249263   563   578 D PQTransition: onTransition: TRS: Mode2 (32)
01-10 14:12:11.249362   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.249432   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.251942   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.253211   377   779 W SpeechMessengerNormal: formatShareMemoryThread(), #1 checkModemReady fail...
01-10 14:12:11.262758   377   696 D NVRAM   : audioComFltCustParamInit Do nothing
01-10 14:12:11.262932   377   696 D NVRAM   : getPlaybackPostProcessParameterFromXML Type/Name [0]/[PlaybackACF]
01-10 14:12:11.262955   377   696 D NVRAM   : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 14:12:11.263601   377   696 D NVRAM   : bes_loudness_L_hpf_fc = 300
01-10 14:12:11.263661   377   696 D NVRAM   : bes_loudness_L_hpf_order = 2
01-10 14:12:11.263676   377   696 D NVRAM   : bes_loudness_L_lpf_fc = 10000
01-10 14:12:11.263687   377   696 D NVRAM   : bes_loudness_L_lpf_order = 1
01-10 14:12:11.263701   377   696 D NVRAM   : bes_loudness_R_hpf_fc = 0
01-10 14:12:11.263716   377   696 D NVRAM   : bes_loudness_R_hpf_order = 0
01-10 14:12:11.263726   377   696 D NVRAM   : bes_loudness_R_lpf_fc = 0
01-10 14:12:11.263736   377   696 D NVRAM   : bes_loudness_R_lpf_order = 0
01-10 14:12:11.263750   377   696 D NVRAM   : bes_loudness_Sep_LR_Filter = 0
01-10 14:12:11.263760   377   696 D NVRAM   : bes_loudness_WS_Gain_Max = 0
01-10 14:12:11.263771   377   696 D NVRAM   : bes_loudness_WS_Gain_Min = 0
01-10 14:12:11.263781   377   696 D NVRAM   : bes_loudness_Filter_First = 0
01-10 14:12:11.263791   377   696 D NVRAM   : bes_loudness_Num_Bands = 0
01-10 14:12:11.263802   377   696 D NVRAM   : bes_loudness_Flt_Bank_Order = 0
01-10 14:12:11.263816   377   696 D NVRAM   : DRC_Delay = 0
01-10 14:12:11.263827   377   696 D NVRAM   : Lim_Th = 0
01-10 14:12:11.263837   377   696 D NVRAM   : Lim_Gn = 0
01-10 14:12:11.263846   377   696 D NVRAM   : Lim_Const = 0
01-10 14:12:11.263854   377   696 D NVRAM   : Lim_Delay = 0
01-10 14:12:11.263863   377   696 D NVRAM   : SWIPRev = 0x520
01-10 14:12:11.263875   377   696 D NVRAM   : getPlaybackPostProcessParameterFromXML Parameter 0 returnValue 0
01-10 14:12:11.263917   377   696 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 0
01-10 14:12:11.263986   377   696 D AudioMTKFilterManager: +Init AudioMTKFilter_VibSpkAddTone
01-10 14:12:11.264058   377   696 D AudioMTKFilterManager: sampleRate [48000] channel [2] format [0x3] bufferSize [2048]
01-10 14:12:11.264077   377   696 D AudioMTKFilterManager: -Init AudioMTKFilter_VibSpkAddTone
01-10 14:12:11.264089   377   696 D AudioVIBSPKControl: +UniqueAudioVIBSPKControl
01-10 14:12:11.264124   377   696 D AudioVIBSPKControl: +UniqueAudioVIBSPKVsgGen
01-10 14:12:11.264143   377   696 D AudioVIBSPKControl: VsgGen constructor
01-10 14:12:11.264153   377   696 D AudioVIBSPKControl: -UniqueAudioVIBSPKVsgGen
01-10 14:12:11.264163   377   696 D AudioVIBSPKControl: VsgGen getInstance()
01-10 14:12:11.264171   377   696 D AudioVIBSPKControl: constructor
01-10 14:12:11.264182   377   696 D AudioVIBSPKControl: -UniqueAudioVIBSPKControl
01-10 14:12:11.264225   377   696 D AudioVIBSPKControl: getInstance()
01-10 14:12:11.264337   377   696 D AudioFtmBase: AudioFtmBase()
01-10 14:12:11.264441   377   696 D LoopbackManager: LoopbackManager(), isMD1Supported = 11
01-10 14:12:11.264469   377   696 D LoopbackManager: LoopbackManager(), mWorkingModemIndex = 0
01-10 14:12:11.264484   377   696 D AudioFtm: AudioFtm()
01-10 14:12:11.264523   377   696 D AudioFtm: mMixer = 0xeaddc000
01-10 14:12:11.264536   377   696 D AudioFtm: GetVibSpkCalibrationStatus()
01-10 14:12:11.265704   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 14:12:11.266169   377   696 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 14:12:11.266259   377   696 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 14:12:11.266281   377   696 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 14:12:11.266292   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.266315   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 14:12:11.267969   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.268065   563   578 D PQTransition: onTransition: TRS: Mode2 (33)
01-10 14:12:11.268158   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.268241   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.270551   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.270609   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.270627   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.272116   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.272164   377   696 D AudioMTKFilterManager: VibSpkReadFrequency:9c
01-10 14:12:11.272244   377   696 D AudioVIBSPKControl: setParameters:bb80 9c f 5
01-10 14:12:11.272303   377   696 D AudioVIBSPKControl: VsgGenInit
01-10 14:12:11.272366   377   696 D MtkAudioBitConverter: +open(), format 0, CH 2, SR 48000
01-10 14:12:11.272541   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 14:12:11.272603   377   696 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 14:12:11.272665   377   696 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 14:12:11.272681   377   696 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 14:12:11.272694   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.272723   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 14:12:11.274184   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.274213   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.274230   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.276401   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.282215   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.282300   377   696 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 3
01-10 14:12:11.282377   377   696 D AudioMTKFilterManager: mFixedParam 0
01-10 14:12:11.282420   377   696 D AudioALSAStreamManager: -openOutputStream(), out = 0xeadfe400, status = 0x0, mStreamOutVector.size() = 1
01-10 14:12:11.283735   524   524 D AudioFlinger_Threads: readOutputParameters_l, mNormalFrameCount 1024
01-10 14:12:11.283830   524   524 I AudioFlinger_Threads: HAL output buffer size 256 frames, normal sink buffer size 1024 frames
01-10 14:12:11.285870   377   696 E EffectsConfig: Failed to parse /vendor/etc/audio_effects.xml: Tinyxml2 error (3): /vendor/etc/audio_effects.xml (null)
01-10 14:12:11.285975   377   696 E EffectsFactoryConfigLoader: Failed to parse XML configuration file
01-10 14:12:11.286015   377   696 W EffectsFactory: Failed to load XML effect configuration, fallback to .conf
01-10 14:12:11.286850   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.286935   563   578 D PQTransition: onTransition: TRS: Mode2 (34)
01-10 14:12:11.287016   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.287086   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.287459   621   621 D HWUIExtension: 14 Program id 17, key 0x0000081000000000, offset 85432, binaryLength 12020 within 61374ns
01-10 14:12:11.293713   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.305702   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.305800   563   578 D PQTransition: onTransition: TRS: Mode2 (35)
01-10 14:12:11.305882   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.305924   523   562 D AAL     : 01-10 02:12:11.230 BL= 922,ESS= 256, 01-10 02:12:11.249 BL= 921,ESS= 256, 01-10 02:12:11.268 BL= 920,ESS= 256, 01-10 02:12:11.287 BL= 919,ESS= 256, 01-10 02:12:11.305 BL= 918,ESS= 256, 
01-10 14:12:11.305948   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.318557   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.321251   548   795 I DJobMgr : [watch_dogs_job] start WatchDog@DJobMgr
01-10 14:12:11.323265   548   548 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 14:12:11.324562   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.324665   563   578 D PQTransition: onTransition: TRS: Mode2 (36)
01-10 14:12:11.324763   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.324830   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.336543   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.343793   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.343905   563   578 D PQTransition: onTransition: TRS: Mode2 (37)
01-10 14:12:11.343991   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.344069   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.347803   524   524 I BufferProvider: found effect "Multichannel Downmix To Stereo" from The Android Open Source Project
01-10 14:12:11.349713   524   798 I AudioFlinger_Threads: AudioFlinger's thread 0xe9c03980 tid=798 ready to run
01-10 14:12:11.350978   524   798 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 14:12:11.351021   621   621 D HWUIExtension: 15 Program id 18, key 0x0002080800000001, offset 97452, binaryLength 12588 within 63460ns
01-10 14:12:11.351074   524   798 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()+
01-10 14:12:11.351089   524   798 D NVRAM   : audioComFltCustParamInit + 
01-10 14:12:11.351144   524   798 D NVRAM   : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-sys.so
01-10 14:12:11.351259   524   524 I AudioFlinger: Using module 10 as the primary audio interface
01-10 14:12:11.351652   377   377 W AudioALSAStreamManager: setMode(), mAudioMode: 0 == 0, return
01-10 14:12:11.352087   377   696 D AudioALSAHardware: +getParameters(), key = GetBesLoudnessStatus
01-10 14:12:11.352263   377   696 D AudioALSAHardware: -getParameters(), return "GetBesLoudnessStatus=1"
01-10 14:12:11.352684   377   696 D AudioALSAHardware: +getParameters(), key = GetGainTableSceneCount
01-10 14:12:11.352792   377   696 D AudioALSAHardware: getParameters(), GetGainTableSceneCount, sceneCount = 1
01-10 14:12:11.352868   377   696 D AudioALSAHardware: -getParameters(), return "GetGainTableSceneCount=1"
01-10 14:12:11.353181   377   696 D AudioALSAHardware: +getParameters(), key = GetGainTableSceneTable
01-10 14:12:11.353312   377   696 D AudioALSAHardware: GetAudioData(), par1 = 0x103, len = 14240
01-10 14:12:11.353341   377   696 D AudioALSAHardware: GetAudioCommonData(), par1=0x103, len=14240
01-10 14:12:11.353399   377   696 D AudioALSAHardware: GetAudioEncodedBuffer(), before encode (), sz_in(14244), sz_out(18992)
01-10 14:12:11.353550   377   696 D AudioALSAHardware: GetAudioEncodedBuffer(), after encode (AAAAAP8SAAAAEBIAAAAEEgAAAAAQAAAAAA0AAAAACgAAAAAHAAAAAAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVgAAAAJTAAAAAlAAAAACTQAAAAJKAAAAAkcAAAACRAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAQEgAAAAQSAAAAABAAAAAADQAAAAAKAAAAAAcAAAAABAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
01-10 14:12:11.353403   377   779 W SpeechMessengerNormal: formatShareMemoryThread(), #2 checkModemReady fail...
01-10 14:12:11.353711   377   696 D AudioALSAHardware: -getParameters(), return "GetGainTableSceneTable=AAAAAP8SAAAAEBIAAAAEEgAAAAAQAAAAAA0AAAAACgAAAAAHAAAAAAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVgAAAAJTAAAAAlAAAAACTQAAAAJKAAAAAkcAAAACRAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAQEgAAAAQSAAAAABAAAAAADQAAAAAKAAAAAAcAAAAABAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
01-10 14:12:11.354479   377   696 D AudioALSAHardware: +getParameters(), key = GetGainTableNonSceneTable
01-10 14:12:11.354620   377   696 D AudioALSAHardware: GetAudioData(), par1 = 0x104, len = 12064
01-10 14:12:11.354651   377   696 D AudioALSAHardware: GetAudioCommonData(), par1=0x104, len=12064
01-10 14:12:11.354695   377   696 D AudioALSAHardware: GetAudioEncodedBuffer(), before encode (), sz_in(12068), sz_out(16092)
01-10 14:12:11.354843   377   696 D AudioALSAHardware: GetAudioEncodedBuffer(), after encode (AAAAAP8SAAAAKBIAAAAcEgAAABASAAAABBIAAAAAEAAAAAAMAAAAAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVwAAAAJTAAAAAk8AAAACSwAAAAJHAAAAAkMAAAACQAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAoEgAAABwSAAAAEBIAAAAEEgAAAAAQAAAAAAwAAAAABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAXAAGAABMAAYA
01-10 14:12:11.354958   377   696 D AudioALSAHardware: -getParameters(), return "GetGainTableNonSceneTable=AAAAAP8SAAAAKBIAAAAcEgAAABASAAAABBIAAAAAEAAAAAAMAAAAAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVwAAAAJTAAAAAk8AAAACSwAAAAJHAAAAAkMAAAACQAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAoEgAAABwSAAAAEBIAAAAEEgAAAAAQAAAAAAwAAAAABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgA
01-10 14:12:11.355643   524   524 D AudioPolicyManagerCustomImpl: getGainTable, mGainTableSceneCount 1
01-10 14:12:11.356149   377   696 D AudioALSAHardware: +getParameters(), key = GetGainTableCurrentSceneIndex
01-10 14:12:11.356256   377   696 D AudioMTKGainController: getCurrentSceneIndex(), mSceneIndex = 0
01-10 14:12:11.356339   377   696 D AudioALSAHardware: getParameters(), GetGainTableCurrentSceneIndex, currentSceneIndex = 0
01-10 14:12:11.356404   377   696 D AudioALSAHardware: -getParameters(), return "GetGainTableCurrentSceneIndex=0"
01-10 14:12:11.356628   524   524 D AudioPolicyManagerCustomImpl: Using scene [0]/[1]
01-10 14:12:11.356785   524   700 D AudioSystem: +setParameters(): mono_output=0 
01-10 14:12:11.357000   524   524 W AudioFlinger: moveEffects() bad srcOutput 0
01-10 14:12:11.360405   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.362275   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.362357   563   578 D PQTransition: onTransition: TRS: Mode2 (38)
01-10 14:12:11.362489   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.362558   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.370330   524   798 D AudioParamParser-sys: getDebugLevel(), debug level = -1
01-10 14:12:11.374891   548   548 I mtkcam-devicemgr: [initialize] +
01-10 14:12:11.380464   548   548 I mtkcam-module: [ModuleStore] ctor
01-10 14:12:11.380611   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x1 module_factory:0xedd6c2cd register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/drv/register_HalSensor.cpp
01-10 14:12:11.380629   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x2 module_factory:0xedd6e565 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/drv/register_HwSyncDrv.cpp
01-10 14:12:11.380645   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x3 module_factory:0xed53a8b1 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/drv/register_iopipe_CamIO_NormalPipe.cpp
01-10 14:12:11.380659   548   548 I mtkcam-module: [ShowLoading] loading (MODULE_GROUP_ID:0 MODULE_GROUP_COUNT:4 ...
01-10 14:12:11.380866   548   548 I mtkcam-module: [load] MtkCam_getModuleFactory_drv(0xec630e89) @ libmtkcam_modulefactory_drv.so
01-10 14:12:11.380954   548   548 D SeninfDrvImp: [SeninfDrvImp][SeninfDrvImp] 
01-10 14:12:11.381021   548   548 D SeninfDrvImp: [init][init]: Entry count 0 
01-10 14:12:11.381147   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.381215   563   578 D PQTransition: onTransition: TRS: Mode2 (39)
01-10 14:12:11.381294   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.381375   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.381416   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.387304   548   548 D SeninfDrvImp: [init]Efuse Data:0x11f1018c= 0x8c631940, 0x11f10190= 0x7c208364, 0x11f101bc= 0x80000000
01-10 14:12:11.387479   548   548 D SeninfDrvImp: [init][init]: Exit count 1 
01-10 14:12:11.387586   548   548 D SeninfDrvImp: [setMclk1IODrivingCurrent]DrivingIdx(3), Reg(0x30000000)
01-10 14:12:11.387615   548   548 D SeninfDrvImp: [setMclk2IODrivingCurrent]DrivingIdx(3), Reg(0x00000003)
01-10 14:12:11.387707   548   548 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(0)
01-10 14:12:11.387759   548   548 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(0), SENINF_TG1_PH_CNT(0x80000001)
01-10 14:12:11.395542   548   548 D SeninfDrvImp: [setMclk2][setTg2Phase]pcEn(1), clkPol(0), mMclk2User(1), TimestampClk(0), SENINF_TG2_PH_CNT(0x0)
01-10 14:12:11.395836   548   548 D ImgSensorDrv: [init][init] imgsensor_drv 1
01-10 14:12:11.395927   548   548 D ImgSensorDrv: [searchSensor]SENSOR search start 
01-10 14:12:11.400218   523   562 D AAL     : 01-10 02:12:11.324 BL= 917,ESS= 256, 01-10 02:12:11.343 BL= 916,ESS= 256, 01-10 02:12:11.362 BL= 915,ESS= 256, 01-10 02:12:11.381 BL= 916,ESS= 256, 01-10 02:12:11.400 BL= 917,ESS= 256, 
01-10 14:12:11.400463   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.400521   563   578 D PQTransition: onTransition: TRS: Mode2 (40)
01-10 14:12:11.400605   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.400677   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.402368   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.414105   621   621 D HWUIExtension: 16 Program id 19, key 0x0002080000d00041, offset 110040, binaryLength 12592 within 63005ns
01-10 14:12:11.419204   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.419301   563   578 D PQTransition: onTransition: TRS: Mode2 (41)
01-10 14:12:11.419372   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.419493   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.422325   548   548 D ImgSensorDrv: [searchSensor]set sensor driver id =1
01-10 14:12:11.422407   548   548 D ImgSensorDrv: [searchSensor]found <0x30c8/s5k3l8_mipi_raw/SENSOR_DRVNAME_S5K3L8_MIPI_RAW>
01-10 14:12:11.422553   548   548 D ImgSensorDrv: [getInfo2]prv w=0x838,h=0x618
01-10 14:12:11.422581   548   548 D ImgSensorDrv: [getInfo2]cap w=0x1070,h=0xc30
01-10 14:12:11.422592   548   548 D ImgSensorDrv: [getInfo2]vd  w=0x1070,h=0xc30
01-10 14:12:11.422603   548   548 D ImgSensorDrv: [getInfo2]pre GrapX=0x0,GrapY=0x0
01-10 14:12:11.428441   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.430564   377   781 D SpeechDriverNormal: processModemControlMessage(), MD Alive, id: 0xafa0, param16: 0x0, param32: 0x0
01-10 14:12:11.430720   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.431435   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_COMMON not found
01-10 14:12:11.432132   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.432835   521   521 D Zygote  : begin preload
01-10 14:12:11.432899   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_COMMON not found
01-10 14:12:11.433094   521   521 I Zygote  : Installing ICU cache reference pinning...
01-10 14:12:11.433139   521   521 I Zygote  : Preloading ICU data...
01-10 14:12:11.434221   403   403 D ccci_mdinit: (1):set md status:mtk.md1.status=ready 
01-10 14:12:11.435092   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.435676   377   781 D SpeechDriverNormal: sendSpeechMessageToModem(), send msg done, id: 0x2fa0, param16: 0x0, param32: 0x0
01-10 14:12:11.435827   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_COMMON not found
01-10 14:12:11.436437   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.437083   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_COMMON not found
01-10 14:12:11.437705   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.437789   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.437862   563   578 D PQTransition: onTransition: TRS: Mode2 (42)
01-10 14:12:11.437937   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.438007   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.438321   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_COMMON not found
01-10 14:12:11.438446   403   403 D ccci_mdinit: (1):start all ccci up layer services
01-10 14:12:11.438547   403   403 I ccci_mdinit: (1):start_service init.svc.emdlogger1, but returned 0, maybe has no this property
01-10 14:12:11.438814   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.439306   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_COMMON not found
01-10 14:12:11.440010   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.440575   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_COMMON not found
01-10 14:12:11.441074   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.441680   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_COMMON not found
01-10 14:12:11.442214   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.442780   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_COMMON not found
01-10 14:12:11.443485   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.444264   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_COMMON not found
01-10 14:12:11.444975   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 14:12:11.446319   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_COMMON not found
01-10 14:12:11.446765   548   548 D ImgSensorDrv: [searchSensor]SENSOR search start 
01-10 14:12:11.449146   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.456667   403   403 I ccci_mdinit: (1):wait_for_property:success(init.svc.emdlogger1=running), loop:0
01-10 14:12:11.456789   403   403 D ccci_mdinit: (1):Current muxd: gsm0710muxd, rild:ril-daemon-mtk
01-10 14:12:11.456920   403   403 D ccci_mdinit: (1):system boot Mode: 48
01-10 14:12:11.456988   403   403 I ccci_mdinit: (1):start_service init.svc.gsm0710muxd, but returned 0, maybe has no this property
01-10 14:12:11.457177   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.457251   563   578 D PQTransition: onTransition: TRS: Mode2 (43)
01-10 14:12:11.457284   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.457398   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.458381   524   798 E AudioParamParser-sys: audioTypeLoadParamUnitHash(), No paramUnit element found!
01-10 14:12:11.469334   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.471854   377   779 D SpeechMessengerNormal: formatShareMemory(), mShareMemory: 0xec2fe000, ap_flag: 0x1, md_flag: 0x1, struct_checksum: 124
01-10 14:12:11.471976   377   779 D SpeechMessengerNormal: formatShareMemory(), [sph_param] offset: 128, size: 12288, [ap_data] offset: 12416, size: 8192, [md_data] offset: 20608, size: 32608
01-10 14:12:11.471997   377   779 D SpeechMessengerNormal: formatShareMemoryThread(), terminated
01-10 14:12:11.475615   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.475765   563   578 D PQTransition: onTransition: TRS: Mode2 (44)
01-10 14:12:11.475821   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.475992   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.481055   403   403 I ccci_mdinit: (1):wait_for_property:success(init.svc.gsm0710muxd=running), loop:600
01-10 14:12:11.481144   403   403 D ccci_mdinit: (1):modem boot ready and deamon begin to run!
01-10 14:12:11.481176   403   403 D ccci_mdinit: (1):MD is release version
01-10 14:12:11.490499   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.493623   377   696 D vndksupport: Loading /vendor/lib/hw/audio.primary.mt6763.so from current namespace instead of sphal namespace.
01-10 14:12:11.494326   377   696 D mtk_audio_hw_hal: gAudioHALRefCountByClient + 2
01-10 14:12:11.494416   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.494509   563   578 D PQTransition: onTransition: TRS: Mode2 (45)
01-10 14:12:11.494546   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.494622   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.494639   523   562 D AAL     : 01-10 02:12:11.419 BL= 918,ESS= 256, 01-10 02:12:11.437 BL= 919,ESS= 256, 01-10 02:12:11.457 BL= 920,ESS= 256, 01-10 02:12:11.475 BL= 921,ESS= 256, 01-10 02:12:11.494 BL= 922,ESS= 256, 
01-10 14:12:11.495569   377   696 D AudioALSAHardware: setAudioParameterChangedCallback(), add callback = 0x0xeb4a71c9, cookie = 0x0xead91230, callback size = 0->1
01-10 14:12:11.495992   524   798 D NVRAM   : audioComFltCustParamInit - callbackAudioCompFltCustParamXmlChanged
01-10 14:12:11.496066   524   798 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()-
01-10 14:12:11.496448   377   696 D AudioALSAHardware: +routing createAudioPatch Mixer->2
01-10 14:12:11.496532   377   696 D AudioALSAStreamManager: +setParameters(), IOport = 13, keyValuePairs = routing=2
01-10 14:12:11.496688   377   696 D         : -updateDeviceInfoForVoiceWakeUp(), mIsUseHeadsetMic = 0, bIsUseHeadsetMic = 0
01-10 14:12:11.496728   377   696 W AudioALSAStreamManager: routingOutputDevice(), flag: 6, mPhoneCallSpeechOpen = 0, output_devices == current_output_devices(0x2), return
01-10 14:12:11.497382   377   696 D AudioALSAStreamOut: standby(), flag 6
01-10 14:12:11.497493   377   696 D AudioALSAStreamOut: standbyStreamOut(), flag 6
01-10 14:12:11.497978   524   798 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 14:12:11.499633   377   696 D AudioALSAHardware: +getParameters(), key = GetSpeakerProtection
01-10 14:12:11.499833   377   696 D AudioALSAHardware: -getParameters(), return "GetSpeakerProtection=0"
01-10 14:12:11.500117   524   524 D AudioPolicyManagerCustomImpl: Not support GetSpeakerProtection
01-10 14:12:11.500264   524   524 I AudioFlinger: openOutput() this 0xea63e000, module 10 Device 2, SamplingRate 48000, Format 0x000003, Channels 3, flags 8
01-10 14:12:11.500472   377   696 D AudioALSAStreamManager: +openOutputStream()
01-10 14:12:11.500581   377   696 D AudioALSAStreamManager: openOutputStream(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, status = 0x15
01-10 14:12:11.500610   377   696 D AudioALSAStreamOut: AudioALSAStreamOut()
01-10 14:12:11.500673   377   696 D AudioALSAStreamOut: set(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, flags = 0x8
01-10 14:12:11.500704   377   696 D AudioALSASampleRateController: +setPrimaryStreamOutSampleRate(), mPrimaryStreamOutSampleRate: 48000 => 48000
01-10 14:12:11.500754   377   696 W AudioALSASampleRateController: -setPrimaryStreamOutSampleRate(), sample_rate == mPrimaryStreamOutSampleRate, return
01-10 14:12:11.500796   377   696 D AudioALSAStreamOut: reduce hal buffer size 40960 -> 16384
01-10 14:12:11.500840   377   696 D AudioALSAStreamOut: set(), mStreamAttributeSource.latency 128, mStreamAttributeSource.buffer_size =16384, channels 2.
01-10 14:12:11.500879   377   696 D NVRAM   : getPlaybackPostProcessParameterFromXML Type/Name [0]/[PlaybackACF]
01-10 14:12:11.500961   377   696 D NVRAM   : bes_loudness_L_hpf_fc = 300
01-10 14:12:11.500978   377   696 D NVRAM   : bes_loudness_L_hpf_order = 2
01-10 14:12:11.501003   377   696 D NVRAM   : bes_loudness_L_lpf_fc = 10000
01-10 14:12:11.501031   377   696 D NVRAM   : bes_loudness_L_lpf_order = 1
01-10 14:12:11.501051   377   696 D NVRAM   : bes_loudness_R_hpf_fc = 0
01-10 14:12:11.501065   377   696 D NVRAM   : bes_loudness_R_hpf_order = 0
01-10 14:12:11.501078   377   696 D NVRAM   : bes_loudness_R_lpf_fc = 0
01-10 14:12:11.501092   377   696 D NVRAM   : bes_loudness_R_lpf_order = 0
01-10 14:12:11.501109   377   696 D NVRAM   : bes_loudness_Sep_LR_Filter = 0
01-10 14:12:11.501123   377   696 D NVRAM   : bes_loudness_WS_Gain_Max = 0
01-10 14:12:11.501142   377   696 D NVRAM   : bes_loudness_WS_Gain_Min = 0
01-10 14:12:11.501156   377   696 D NVRAM   : bes_loudness_Filter_First = 0
01-10 14:12:11.501170   377   696 D NVRAM   : bes_loudness_Num_Bands = 0
01-10 14:12:11.501183   377   696 D NVRAM   : bes_loudness_Flt_Bank_Order = 0
01-10 14:12:11.501202   377   696 D NVRAM   : DRC_Delay = 0
01-10 14:12:11.501218   377   696 D NVRAM   : Lim_Th = 0
01-10 14:12:11.501228   377   696 D NVRAM   : Lim_Gn = 0
01-10 14:12:11.501239   377   696 D NVRAM   : Lim_Const = 0
01-10 14:12:11.501250   377   696 D NVRAM   : Lim_Delay = 0
01-10 14:12:11.501261   377   696 D NVRAM   : SWIPRev = 0x520
01-10 14:12:11.501277   377   696 D NVRAM   : getPlaybackPostProcessParameterFromXML Parameter 0 returnValue 0
01-10 14:12:11.501319   377   696 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 0
01-10 14:12:11.501389   377   696 D AudioMTKFilterManager: +Init AudioMTKFilter_VibSpkAddTone
01-10 14:12:11.501442   377   696 D AudioMTKFilterManager: sampleRate [48000] channel [2] format [0x3] bufferSize [16384]
01-10 14:12:11.501466   377   696 D AudioMTKFilterManager: -Init AudioMTKFilter_VibSpkAddTone
01-10 14:12:11.501480   377   696 D AudioVIBSPKControl: getInstance()
01-10 14:12:11.501529   377   696 D AudioFtm: GetVibSpkCalibrationStatus()
01-10 14:12:11.501691   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 14:12:11.501774   377   696 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 14:12:11.501849   377   696 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 14:12:11.501878   377   696 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 14:12:11.501893   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.501925   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 14:12:11.505527   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.505608   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.505629   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.506948   805   805 I [BIP]   :  [BIP TASK] Init start (0)
01-10 14:12:11.507171   805   805 I [BIP]   :  [BIP KAL TIMER] timer init
01-10 14:12:11.507210   805   805 I [BIP]   :  [BIP KAL MSG] msg init, int_num = (20), ext_num = (20), name = (BIP)
01-10 14:12:11.507268   805   805 I [BIP]   :  [BIP TASK] Init end (0)
01-10 14:12:11.507282   805   805 I [BIP]   :  [BIP TASK] Init start (1)
01-10 14:12:11.508512   805   805 I [BIP]   :  [BIP AGENT] can open port, FD = (5)
01-10 14:12:11.508586   805   805 I [BIP]   :  [BIP AGENT] request INFO: ap_seq = 0, address is (0xb4c97100)
01-10 14:12:11.508608   805   805 I [BIP]   :  [BIP AGENT] add header data in current buffer queue: ap_seq = (0), pkt_type = (0xffff0000), data_len = (0)
01-10 14:12:11.508630   805   805 I [BIP]   :  [BIP AGENT] the enqueue info. : need_to_write = (1), num_push = (1), num_pop = (0)
01-10 14:12:11.508646   805   805 I [BIP]   :  [BIP AGENT] start handshake!
01-10 14:12:11.508696   805   805 I [BIP]   :  [BIP AGENT] can write data now, FD = (5), write length = (12)
01-10 14:12:11.508724   805   805 I [BIP]   :  [BIP AGENT] the dequeue info. : ap_seq = (0), push_time = (27027337), pop_time = (27027424), num_push = (1), num_pop = (1)
01-10 14:12:11.509057   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.509119   805   805 I [BIP]   :  [BIP AGENT] can read data now, FD = (5), read length = (26)
01-10 14:12:11.509150   805   805 I [BIP]   :  [BIP AGENT]  1  0 ff ff     4B:pkt_type
01-10 14:12:11.509162   805   805 I [BIP]   :  [BIP AGENT]  0  0  0  0     4B:pkt_num
01-10 14:12:11.509173   805   805 I [BIP]   :  [BIP AGENT]  e  0  0  0     4B:pkt_data_len
01-10 14:12:11.509114   377   696 D AudioMTKFilterManager: VibSpkReadFrequency:9c
01-10 14:12:11.509185   805   805 I [BIP]   :  [BIP AGENT]  0  0  0  0   2B2B:(src_mod, dest_mod)
01-10 14:12:11.509197   805   805 I [BIP]   :  [BIP AGENT]  0  0  0  0   2B2B:(sap_id, msg_id)
01-10 14:12:11.509209   805   805 I [BIP]   :  [BIP AGENT] dc  5  c  0 1B1B2B:(ref_count, lp_reserved, msg_len)
01-10 14:12:11.509192   377   696 D AudioVIBSPKControl: setParameters:bb80 9c f 5
01-10 14:12:11.509221   805   805 I [BIP]   :  [BIP AGENT] 8e  5 3a 73   1B1B:(sim_id, bip_channel_id)
01-10 14:12:11.509239   805   805 I [BIP]   :  [BIP AGENT] 30  0  0  0     4B:bip_info pointer
01-10 14:12:11.509255   805   805 I [BIP]   :  [BIP AGENT] MD W/R buffer size = (1500)
01-10 14:12:11.509246   377   696 D MtkAudioBitConverter: +open(), format 0, CH 2, SR 48000
01-10 14:12:11.509268   805   805 I [BIP]   :  [BIP AGENT] end handshake!
01-10 14:12:11.509425   377   696 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 14:12:11.509489   377   696 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 14:12:11.509518   805   805 I [BIP]   :  [BIP TASK] Init end (1)
01-10 14:12:11.509534   805   805 I [BIP]   :  [BIP TASK] Init start (2)
01-10 14:12:11.509564   805   805 I [BIP]   :  [BIP KAL TIMER] create timer info, timer[(0)] = (0xb4cc215c), timer id = (0xb4cc215c), inuse = (0), name = (BIP_NET_DATA)
01-10 14:12:11.509564   377   696 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 14:12:11.509583   377   696 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 14:12:11.509597   377   696 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:11.509627   377   696 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 14:12:11.509772   805   805 I [BIP]   :  [BIP WIFI] Init end
01-10 14:12:11.509796   805   805 I [BIP]   :  [BIP TASK] Init end (2)
01-10 14:12:11.509808   805   805 I [BIP]   :  [BIP TASK] Init start (3)
01-10 14:12:11.509831   805   805 I [BIP]   :  [BIP KAL TIMER] create timer info, timer[(1)] = (0xb4cc21ac), timer id = (0xb4cc21ac), inuse = (0), name = (BIP_UICC_SERVER_DATA)
01-10 14:12:11.510000   805   805 I [BIP]   :  [BIP UICC SERVER] init done
01-10 14:12:11.510020   805   805 I [BIP]   :  [BIP TASK] Init end (3)
01-10 14:12:11.510031   805   805 I [BIP]   :  [BIP TASK] Init start (4)
01-10 14:12:11.510184   805   805 I [BIP]   :  [BIP NL] init the link status of interface wlan0
01-10 14:12:11.510210   805   805 I [BIP]   :  [BIP NL] construct nl msg address ec495560
01-10 14:12:11.510693   805   805 I [BIP]   :  [BIP NL] destroy nl msg address ec495560
01-10 14:12:11.510736   805   805 I [BIP]   :  [BIP NL] init the addr status of interface wlan0
01-10 14:12:11.510752   805   805 I [BIP]   :  [BIP NL] construct nl msg address ec495560
01-10 14:12:11.510844   805   805 I [BIP]   :  [BIP NL] destroy nl msg address ec495560
01-10 14:12:11.510870   805   805 I [BIP]   :  [BIP NL] init the route status of interface wlan0
01-10 14:12:11.510882   805   805 I [BIP]   :  [BIP NL] construct nl msg address ec495560
01-10 14:12:11.510943   805   805 I [BIP]   :  [BIP NL] IPv4: *.*.*.*
01-10 14:12:11.510968   805   805 I chatty  : uid=0(root) /vendor/bin/bip identical 2 lines
01-10 14:12:11.510982   805   805 I [BIP]   :  [BIP NL] IPv4: *.*.*.*
01-10 14:12:11.511015   805   805 I [BIP]   :  [BIP NL] IPv6: *:*:*:*:*:*:*:*
01-10 14:12:11.511030   805   805 I [BIP]   :  [BIP NL] destroy nl msg address ec495560
01-10 14:12:11.511043   805   805 I [BIP]   :  [BIP NL] init the DNS status of interface wlan0
01-10 14:12:11.511170   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.511299   805   805 E libc    : Access denied finding property "net.dns1"
01-10 14:12:11.511360   805   805 I [BIP]   :  [BIP NL] dns_server: dns type: 0, ipv4=*.*.*.*, ipv6=*:*:*:*:*:*:*:*
01-10 14:12:11.511673   805   805 E libc    : Access denied finding property "net.dns2"
01-10 14:12:11.511774   805   805 I [BIP]   :  [BIP NL] dns_server: dns type: 0, ipv4=*.*.*.*, ipv6=*:*:*:*:*:*:*:*
01-10 14:12:11.512035   805   805 I [BIP]   :  [BIP TASK] Init end (4)
01-10 14:12:11.512090   805   805 I [BIP]   :  [BIP KAL MSG] msg deq, type = (1)
01-10 14:12:11.512105   805   805 I [BIP]   :  [BIP KAL MSG] msg deq, type = (0)
01-10 14:12:11.512115   805   805 I [BIP]   :  [BIP KAL] BIP task suspend
01-10 14:12:11.513267   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.513373   563   578 D PQTransition: onTransition: TRS: Mode2 (46)
01-10 14:12:11.513425   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.513568   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.514325   377   696 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:11.514392   377   696 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:11.514412   377   696 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:11.516382   377   696 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:11.516460   377   696 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 3
01-10 14:12:11.516555   377   696 D AudioMTKFilterManager: mFixedParam 0
01-10 14:12:11.517084   377   696 D AudioALSAStreamManager: -openOutputStream(), out = 0xeadfe800, status = 0x0, mStreamOutVector.size() = 2
01-10 14:12:11.520474   524   524 I AudioFlinger_Threads: HAL output buffer size 2048 frames, normal sink buffer size 2048 frames
01-10 14:12:11.522132   524   700 D AudioSystem: +setParameters(): mono_output=0 
01-10 14:12:11.523582   805   813 I [BIP]   :  [BIP AGENT] start read() now, FD = (5)
01-10 14:12:11.523815   805   817 I [BIP]   :  [BIP NL] thread start
01-10 14:12:11.525444   621   621 D HWUIExtension: 17 Program id 20, key 0x0002080000900041, offset 122632, binaryLength 12848 within 111133ns
01-10 14:12:11.527204   806   806 I EMDLOGGER1: 2018-03-13 previous mask value is 077
01-10 14:12:11.527383   806   806 D EMDLOGGER1: customized_mode = 0
01-10 14:12:11.527801   806   806 I EMDLOGGER1: PROP_ENABLE_DEBUG_LOG persist.logmuch.detect.mdlogger = 0 mEnableLogPrintTooMuch = 0
01-10 14:12:11.527807   524   818 I AudioFlinger_Threads: AudioFlinger's thread 0xe9691b40 tid=818 ready to run
01-10 14:12:11.528027   524   818 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 14:12:11.528094   524   818 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()+
01-10 14:12:11.528117   524   818 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()-
01-10 14:12:11.528491   377   696 D AudioALSAHardware: +routing createAudioPatch Mixer->2
01-10 14:12:11.528624   377   696 D AudioALSAStreamManager: +setParameters(), IOport = 21, keyValuePairs = routing=2
01-10 14:12:11.528724   377   696 D         : -updateDeviceInfoForVoiceWakeUp(), mIsUseHeadsetMic = 0, bIsUseHeadsetMic = 0
01-10 14:12:11.528755   377   696 W AudioALSAStreamManager: routingOutputDevice(), flag: 8, mPhoneCallSpeechOpen = 0, output_devices == current_output_devices(0x2), return
01-10 14:12:11.529342   807   807 D VoLTE IMSM: vold.decrypt = trigger_restart_framework (module/mdagent/volte_imsm_93/src/volte_imsm.c:348)
01-10 14:12:11.529526   807   807 D VoLTE IMSM: ro.vendor.md_prop_ver = 0 version = 0
01-10 14:12:11.529526   807   807 D VoLTE IMSM:  (module/mdagent/volte_imsm_93/src/volte_imsm.c:268)
01-10 14:12:11.529755   377   800 D AudioALSAStreamOut: standby(), flag 8
01-10 14:12:11.529836   377   800 D AudioALSAStreamOut: standbyStreamOut(), flag 8
01-10 14:12:11.529863   807   807 D VoLTE IMSM: service.nvram_init = Ready (module/mdagent/volte_imsm_93/src/volte_imsm.c:277)
01-10 14:12:11.529958   807   807 D VoLTE IMSM: check_user_load, is user (module/mdagent/volte_imsm_93/src/volte_imsm.c:383)
01-10 14:12:11.529974   807   807 D VoLTE IMSM: volte_imsm (module/mdagent/volte_imsm_93/src/volte_imsm.c:97)
01-10 14:12:11.530141   807   807 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xef91a000 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 14:12:11.530212   524   818 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 14:12:11.530295   807   807 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xef91a5a0 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 14:12:11.530374   807   807 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xef91a5c8 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 14:12:11.530438   807   807 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xef91a5f0 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 14:12:11.530723   807   807 E VoLTE IMSM: socket (volte_imsa1) error : Connection refused (111) (module/mdagent/volte_imsm_93/src/os_socket.c:280)
01-10 14:12:11.530808   807   819 D VoLTE IMSM: monitor_wifi_tech: enter (module/mdagent/volte_imsm_93/src/wireless.c:453)
01-10 14:12:11.530907   807   819 D VoLTE IMSM: send CTRL_CMD_GETFAMILY (module/mdagent/volte_imsm_93/src/wireless.c:472)
01-10 14:12:11.531133   807   820 D VoLTE IMSM: sim_id = 0, local sim_id = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 14:12:11.531161   807   820 D VoLTE IMSM: sim_id = 0 event queue = 0xef91a000 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 14:12:11.531174   807   820 D VoLTE IMSM: INIT [0][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531190   807   820 D VoLTE IMSM: INIT [0][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531202   807   820 D VoLTE IMSM: INIT [0][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531213   807   820 D VoLTE IMSM: INIT [0][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531225   807   820 D VoLTE IMSM: INIT [0][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531235   807   820 D VoLTE IMSM: INIT [0][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531245   807   820 D VoLTE IMSM: INIT [0][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531256   807   820 D VoLTE IMSM: INIT [0][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531267   807   820 D VoLTE IMSM: INIT [0][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531278   807   820 D VoLTE IMSM: INIT [0][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531289   807   820 D VoLTE IMSM: INIT [0][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.531301   807   820 D VoLTE IMSM: INIT [0] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 14:12:11.531988   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.532190   563   578 D PQTransition: onTransition: TRS: Mode2 (47)
01-10 14:12:11.532379   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.532620   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.535592   807   821 D VoLTE IMSM: sim_id = 1, local sim_id = 1 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 14:12:11.535670   807   821 D VoLTE IMSM: sim_id = 1 event queue = 0xef91a5a0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 14:12:11.535682   807   821 D VoLTE IMSM: INIT [1][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535695   807   821 D VoLTE IMSM: INIT [1][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535707   807   821 D VoLTE IMSM: INIT [1][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535718   807   821 D VoLTE IMSM: INIT [1][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535728   807   821 D VoLTE IMSM: INIT [1][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535739   807   821 D VoLTE IMSM: INIT [1][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535750   807   821 D VoLTE IMSM: INIT [1][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535768   807   821 D VoLTE IMSM: INIT [1][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535779   807   821 D VoLTE IMSM: INIT [1][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535790   807   821 D VoLTE IMSM: INIT [1][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535801   807   821 D VoLTE IMSM: INIT [1][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535815   807   821 D VoLTE IMSM: INIT [1] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 14:12:11.535906   807   822 D VoLTE IMSM: sim_id = 2, local sim_id = 2 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 14:12:11.535923   807   822 D VoLTE IMSM: sim_id = 2 event queue = 0xef91a5c8 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 14:12:11.535934   807   822 D VoLTE IMSM: INIT [2][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535945   807   822 D VoLTE IMSM: INIT [2][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535956   807   822 D VoLTE IMSM: INIT [2][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535967   807   822 D VoLTE IMSM: INIT [2][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535976   807   822 D VoLTE IMSM: INIT [2][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535986   807   822 D VoLTE IMSM: INIT [2][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.535998   807   822 D VoLTE IMSM: INIT [2][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536009   807   822 D VoLTE IMSM: INIT [2][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536020   807   822 D VoLTE IMSM: INIT [2][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536032   807   822 D VoLTE IMSM: INIT [2][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536043   807   822 D VoLTE IMSM: INIT [2][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536056   807   822 D VoLTE IMSM: INIT [2] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 14:12:11.536111   807   823 D VoLTE IMSM: sim_id = 3, local sim_id = 3 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 14:12:11.536126   807   823 D VoLTE IMSM: sim_id = 3 event queue = 0xef91a5f0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 14:12:11.536138   807   823 D VoLTE IMSM: INIT [3][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536148   807   823 D VoLTE IMSM: INIT [3][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536157   807   823 D VoLTE IMSM: INIT [3][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536169   807   823 D VoLTE IMSM: INIT [3][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536179   807   823 D VoLTE IMSM: INIT [3][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536189   807   823 D VoLTE IMSM: INIT [3][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536200   807   823 D VoLTE IMSM: INIT [3][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536212   807   823 D VoLTE IMSM: INIT [3][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536225   807   823 D VoLTE IMSM: INIT [3][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536236   807   823 D VoLTE IMSM: INIT [3][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536247   807   823 D VoLTE IMSM: INIT [3][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 14:12:11.536261   807   823 D VoLTE IMSM: INIT [3] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 14:12:11.536856   806   806 D EMDLOGGER1: dllopen /system/lib64/libsysenv_system.so ok
01-10 14:12:11.537018   806   806 D         : [SYSENV]sysenv_get_with_area():429 , get env name=md1_ccb_cap_gear
01-10 14:12:11.537034   806   806 D         : [SYSENV]get_env_info():311 , initialize
01-10 14:12:11.537189   806   806 D         : [SYSENV]get_partition_count():107 , get_partition_count ret ptr: 38
01-10 14:12:11.537370   806   806 D         : [SYSENV]get_partition_path():158 , partition path = /dev/block/mmcblk0p3
01-10 14:12:11.537401   806   806 E         : [SYSENV]get_env_info():321 , env_buffer[0] : cde32bc0
01-10 14:12:11.537711   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.506000   805   805 W bip     : type=1400 audit(0.0:35): avc: denied { read } for name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=11773 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
01-10 14:12:11.510000   805   805 W bip     : type=1400 audit(0.0:36): avc: denied { read } for name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=11773 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
01-10 14:12:11.539865   806   806 D         : [SYSENV]read_env_area():244 , read 16384 data from 20000 to cde32bc0
01-10 14:12:11.540074   806   806 D         : [SYSENV]get_env_info():348 , ENV initialize success
01-10 14:12:11.540272   806   806 E EMDLOGGER1: sysenv_get key md1_ccb_cap_gear valus is null
01-10 14:12:11.541172   377   696 D AudioALSAStreamManager: openInputStream(), devices = 0x80000004, format = 0x1, channels = 0xc, sampleRate = 48000, status = 14, acoustics = 0x0
01-10 14:12:11.542603   377   696 D AudioALSAStreamIn: AudioALSAStreamIn()
01-10 14:12:11.542729   377   696 D AudioALSAStreamIn: set(), devices = 0x80000004, format = 0x1, channels = 0xc, sampleRate = 48000, acoustics = 0x0, flags = 0
01-10 14:12:11.542745   377   696 D AudioALSAStreamIn: CheckBesRecordInfo()
01-10 14:12:11.542759   377   696 D AudioSpeechEnhanceInfo: GetBesRecScene() -1
01-10 14:12:11.542796   377   696 D AudioSpeechEnhanceInfo: IsBesRecTuningEnable()- 0
01-10 14:12:11.542828   377   696 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 14:12:11.542874   377   696 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 14:12:11.542888   377   696 D AudioSpeechEnhanceInfo: IsAPDMNRTuningEnable(), 0
01-10 14:12:11.542937   377   696 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 14:12:11.542977   377   696 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 14:12:11.542994   377   696 D AudioSpeechEnhanceInfo: GetForceMagiASRState(), feature_support=1a097c57, 400, mForceMagiASR=0
01-10 14:12:11.543030   377   696 D AudioSpeechEnhanceInfo: GetForceAECRecState(), mForceAECRec=0
01-10 14:12:11.543061   377   696 D AudioALSAStreamIn: set() done, sampleRate = 48000, num_channels = 2, buffer_size=3840, tempDebugflag = 0
01-10 14:12:11.543111   377   696 D AudioALSAStreamManager: -openInputStream(), in = 0xeadfea00, status = 0x0, mStreamInVector.size() = 1
01-10 14:12:11.543168   377   696 D AudioALSAStreamIn: +setParameters(): input_source=1
01-10 14:12:11.543249   377   696 D AudioALSAStreamIn: -setParameters(): input_source=1 
01-10 14:12:11.546119   806   806 I EMDLOGGER1: mkdir: Failed.[/data/mdlog/bootupLog/] errno=17
01-10 14:12:11.550857   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.551027   563   578 D PQTransition: onTransition: TRS: Mode2 (48)
01-10 14:12:11.551131   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.551207   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.555827   573   573 I NetdagentController: Initializing iptables: 1999.7ms
01-10 14:12:11.559247   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.559488   806   806 I EMDLOGGER1: mkdir: access file ok
01-10 14:12:11.569716   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.569841   563   578 D PQTransition: onTransition: TRS: Mode2 (49)
01-10 14:12:11.569961   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.571719   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 14:12:11.571360   811   811 I VoLTE UA: [Box]VoLTE UA is launched (module/volte//volte_ua/src/volte_service.c:79)
01-10 14:12:11.573631   811   811 E VoLTE IF_CH: Try to open stream socket failed, retry! name = volte_stack, times = 1, error = Connection refused (module/volte//volte_core/src/os/api_channel.c:208)
01-10 14:12:11.575999   524   827 I AudioFlinger_Threads: AudioFlinger's thread 0xe9503600 tid=827 ready to run
01-10 14:12:11.576935   377   696 D AudioALSAStreamManager: +closeInputStream(), in = 0xeadfea00, size() = 1
01-10 14:12:11.577057   377   696 D AudioALSAStreamIn: ~AudioALSAStreamIn()
01-10 14:12:11.577096   377   696 D AudioALSAStreamManager: -closeInputStream(), mStreamInVector.size() = 0
01-10 14:12:11.579362   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.583132   808   808 I VoLTE Stack: [Box]VoLTE Stack is launched (module/volte//volte_stack/src/volte_stack.c:114)
01-10 14:12:11.583327   808   808 I VoLTE Stack: flush ipsec SA&SP (module/volte//volte_stack/src/volte_stack.c:132)
01-10 14:12:11.585942   521   521 I Zygote  : Preloading classes...
01-10 14:12:11.588600   563   578 D PQ      : ccorr table index=0
01-10 14:12:11.588735   563   578 D PQTransition: onTransition: TRS: Mode2 (50)
01-10 14:12:11.588853   563   578 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 14:12:11.588866   563   578 D PQTransition: CheckIfFinished: TRS: Finished
01-10 14:12:11.588895   563   578 D PQ      : [PQ_SERVICE]enablePQEvent: 1 -> 0
01-10 14:12:11.588951   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 3
01-10 14:12:11.588974   523   562 D AAL     : 01-10 02:12:11.514 BL= 923,ESS= 256, 01-10 02:12:11.533 BL= 924,ESS= 256, 01-10 02:12:11.551 BL= 925,ESS= 256, 01-10 02:12:11.570 BL= 926,ESS= 256, 01-10 02:12:11.588 BL= 927,ESS= 256, 
01-10 14:12:11.589988   808   808 D setkey  : netlink receive msg status:20
01-10 14:12:11.590229   808   808 D setkey  : receive netlink message: 00000020 0x00000003 0x00000002
01-10 14:12:11.590380   808   808 D setkey  : flush_SA_SP_exist_xfrm <0 done
01-10 14:12:11.591102   808   808 I VoLTE Stack: [SIP] enter sip_init. MOD_SIP:65 (module/volte//volte_stack/src/sip/sip_main.c:226)
01-10 14:12:11.592501   812   812 I VoLTE IMCB-CM: uid= 0, euid=0 #203
01-10 14:12:11.592775   812   812 I VoLTE IMCB-CM: get [0]permitted: FFFFFFFF, [1]permitted: 3F #223
01-10 14:12:11.592801   812   812 I VoLTE IMCB-CM: get [1]effective.CAP_WAKE_ALARM: 0, [1]permitted.CAP_WAKE_ALARM: 8 #227
01-10 14:12:11.592824   812   812 I VoLTE IMCB-CM: get [0]permitted: FFFFFFFF, [1]permitted: 3F #255
01-10 14:12:11.595000   812   812 I VoLTE IMCB-CM: boottime_alarm_support = 1 #302
01-10 14:12:11.594998   812   832 I VoLTE IMCB-CM: test timeout #185
01-10 14:12:11.596567   808   830 I VoLTE SOC: create soc_connect_thread task, pid : 808 (module/volte//volte_stack/src/soc/soc_data.c:361)
01-10 14:12:11.596570   808   829 I VoLTE SOC: create soc task, pid : 808 (module/volte//volte_stack/src/soc/soc_data.c:555)
01-10 14:12:11.599675   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.599703   401   401 W ccci_fsd(1): O: X://NA77_006, flag 0x700, ret 1
01-10 14:12:11.602721   812   812 I VoLTE IMCB-CM: register ims_hif for vt #375
01-10 14:12:11.603669   808   831 I VoLTE Stack: create sip task, pid : 808 (module/volte//volte_stack/src/sip/sip_main.c:296)
01-10 14:12:11.605129   808   808 I VoLTE IF_CH: server open stream socket (listen), name = volte_stack (module/volte//volte_core/src/os/api_channel.c:666)
01-10 14:12:11.605552   812   812 I VoLTE IMCB-CM: [ims_hif:0] init success, fd: 7 #422
01-10 14:12:11.605591   808   808 I VoLTE REG: REG init (module/volte//volte_stack/src/reg/reg.c:10234)
01-10 14:12:11.605669   812   812 I VoLTE IMCB-CM: [ims_hif:1] init success, fd: 9 #422
01-10 14:12:11.605735   812   812 I VoLTE IMCB-CM: [ims_hif:2] init success, fd: 10 #422
01-10 14:12:11.605754   808   808 I VoLTE REG: vtimer init (module/volte//volte_stack/src/reg/reg.c:10252)
01-10 14:12:11.605781   812   812 I VoLTE IMCB-CM: [ims_hif:3] init success, fd: 13 #422
01-10 14:12:11.606154   812   812 E VoLTE IF_CH: Try to open stream socket failed, retry! name = volte_ua, times = 1, error = Connection refused (module/volte//volte_core/src/os/api_channel.c:208)
01-10 14:12:11.606154   808   808 E VoLTE IF_CH: Try to open stream socket failed, retry! name = volte_stack, times = 1, error = Connection refused (module/volte//volte_core/src/os/api_channel.c:208)
01-10 14:12:11.606311   808   835 I VoLTE IF_CH: Max connection is 36, name = volte_stack (module/volte//volte_core/src/os/api_channel.c:438)
01-10 14:12:11.608927   521   521 I SystemServiceRegistry: regMtkService start
01-10 14:12:11.609429   521   521 I SystemServiceRegistry: setMtkSystemServiceName start
01-10 14:12:11.610596   521   521 I MtkSystemServiceRegistry: setMtkSystemServiceName start names{class android.app.KeyguardManager=keyguard, class android.nfc.NfcManager=nfc, class android.view.textservice.TextServicesManager=textservices, class android.hardware.usb.UsbManager=usb, class android.net.NetworkScoreManager=network_score, class android.os.IncidentManager=incident, class android.os.storage.StorageManager=storage, class android.os.Vibrator=vibrator, class android.hardware.location.ContextHubManager=contexthub, class android.view.textclassifier.TextClassificationManager=textclassification, class android.hardware.hdmi.HdmiControlManager=hdmi_control, class android.net.EthernetManager=ethernet, class android.app.UiModeManager=uimode, class android.companion.CompanionDeviceManager=companiondevice, class android.bluetooth.BluetoothManager=bluetooth, class android.os.DropBoxManager=dropbox, class android.media.session.MediaSessionManager=media_session, class android.content.ClipboardManager=clipboard, class android.hardware.display.DisplayManager=display, class android.os.RecoverySystem=recovery, class android.net.wifi.RttManager=rttmanager, class android.media.AudioManager=audio, class android.app.admin.DevicePolicyManager=device_policy, class android.app.SearchManager=search, class android.app.ActivityManager=activity, class android.app.AppOpsManager=appops, class android.content.pm.LauncherApps=launcherapps, class android.hardware.camera2.CameraManager=camera, class android.app.WallpaperManager=wallpaper, class android.app.job.JobScheduler=jobscheduler, class android.app.DownloadManager=download, class android.net.lowpan.LowpanManager=lowpan, class android.net.wifi.aware.WifiAwareManager=wifiaware, class android.media.midi.MidiManager=midi, class android.os.HardwarePropertiesManager=hardware_properties, class android.app.AlarmManager=alarm, class android.os.PowerManager=power, class android.net.IpSecManager=ipsec, class android.app.usage.NetworkStatsManager=netstats, class android.service.persistentdata.PersistentDataBlockManager=persistent_data_block, class android.os.health.SystemHealthManager=systemhealth, class android.media.MediaRouter=media_router, class android.net.ConnectivityManager=connectivity, class android.telecom.TelecomManager=telecom, class android.media.projection.MediaProjectionManager=media_projection, class android.app.StatusBarManager=statusbar, class android.hardware.SensorManager=sensor, class android.service.oemlock.OemLockManager=oem_lock, class android.telephony.euicc.EuiccManager=euicc_service, class android.view.accessibility.CaptioningManager=captioning, class android.app.usage.UsageStatsManager=usagestats, class android.view.inputmethod.InputMethodManager=input_method, class android.hardware.ConsumerIrManager=consumer_ir, class android.net.wifi.WifiManager=wifi, class android.print.PrintManager=print, class android.telephony.CarrierConfigManager=carrier_config, class android.media.tv.TvInputManager=tv_input, class android.appwidget.AppWidgetManager=appwidget, class android.app.trust.TrustManager=trust, class android.os.UserManager=user, class android.hardware.radio.RadioManager=broadcastradio, class android.view.autofill.AutofillManager=autofill, class android.location.CountryDetector=country_detector, class android.text.ClipboardManager=clipboard, class android.location.LocationManager=location, class android.net.wifi.WifiScanner=wifiscanner, class android.net.wifi.p2p.WifiP2pManager=wifip2p, interface android.view.WindowManager=window, class android.view.accessibility.AccessibilityManager=accessibility, class android.net.NetworkPolicyManager=netpolicy, class android.media.soundtrigger.SoundTriggerManager=soundtrigger, class android.os.BatteryManager=batterymanager, class android.app.VrManager=vrmanager, class android.app.NotificationManager=notification, class android.net.nsd.NsdManager=servicediscovery, class android.content.pm.ShortcutManager=shortcut, class android.accounts.AccountManager=account, class android.hardware.SerialManager=serial, class android.telephony.SubscriptionManager=
01-10 14:12:11.610775   521   521 I SystemServiceRegistry: registerAllMtkService start
01-10 14:12:11.610851   521   521 I MtkSystemServiceRegistry: registerAllService start
01-10 14:12:11.612074   401   401 W ccci_fsd(1): O: Y://NA77_006, flag 0x700, ret 1
01-10 14:12:11.613299   524   524 I bt_a2dp_hw: adev_open:  adev_open in A2dp_hw module
01-10 14:12:11.613535   524   524 I AudioFlinger: loadHwModule() Loaded a2dp audio interface, handle 18
01-10 14:12:11.613758   555   627 D agps    : [agps] WARNING: [CP] cp2_fd_1_req_sim_num_timeout
01-10 14:12:11.614197   555   580 D agps    : [agps][n][CP] [MD_1] write  sim_info_req  gsm_disabled=[0] umts_disabled=[0] lte_disabled=[0] lppe_enable=[1] lppe_network_location_disable=[0] reject_non911_nilr_enable=[0] battery_percentage=[100]
01-10 14:12:11.614466   377   696 D vndksupport: Loading /vendor/lib/hw/audio.usb.mt6763.so from current namespace instead of sphal namespace.
01-10 14:12:11.615813   555   580 D agps    : [agps][n][CP] [MD_1] read  sim_info_rsp  sim_number=2 md_type=0 (0=fdd, 1=tdd) ecid=1 otdoa=0 band_num=0
01-10 14:12:11.615889   555   580 E agps    : [agps] ERR: [CP] band_num is not ready  retry=0
01-10 14:12:11.621373   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.624371   811   811 I VoLTE IF_CH: client open stream socket , name = volte_stack, retry -200 times (module/volte//volte_core/src/os/api_channel.c:221)
01-10 14:12:11.624702   811   811 I VoLTE IF_CH: ** channel create (0xebc38900) (5) (module/volte//volte_core/src/os/api_channel.c:306)
01-10 14:12:11.625022   808   835 I VoLTE IF_CH: Connection from 0.0.0.0:0 [name:volte_stack, fd:10, idx:0] (module/volte//volte_core/src/os/api_channel.c:529)
01-10 14:12:11.625265   808   835 I VoLTE DISP: Parent channel id = 0x0 (module/volte//volte_stack/src/dispatcher/dispatcher.c:425)
01-10 14:12:11.625364   808   835 I VoLTE DISP: UA is connected (0xf2bb7a08 - 0xf2580000 - 0 - 0x0), type = 303301893 (module/volte//volte_stack/src/dispatcher/dispatcher.c:427)
01-10 14:12:11.627527   811   811 I VoLTE IF_CORE: volte_sip_stack_create, stack = 0xebc39000, channel = 0xebc38900 (module/volte//volte_ua/src/service/message.c:621) (module/volte//volte_core/src/interface/volte_stack.c:463)
01-10 14:12:11.627707   811   811 I VoLTE UA: Connect to VoLTE Stack (module/volte//volte_ua/src/service/message.c:626)
01-10 14:12:11.635308   621   621 D HWUIExtension: 18 Program id 21, key 0x0002080800000003, offset 135480, binaryLength 12588 within 109669ns
01-10 14:12:11.639684   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.639669   548   548 D ImgSensorDrv: [searchSensor]set sensor driver id =2
01-10 14:12:11.639800   548   548 D ImgSensorDrv: [searchSensor]found <0x7750/ov7251/SENSOR_DRVNAME_OV7251_MIPI_RAW>
01-10 14:12:11.650778   548   548 D ImgSensorDrv: [getInfo2]prv w=0x280,h=0x1e0
01-10 14:12:11.650859   548   548 D ImgSensorDrv: [getInfo2]cap w=0x280,h=0x1e0
01-10 14:12:11.650873   548   548 D ImgSensorDrv: [getInfo2]vd  w=0x280,h=0x1e0
01-10 14:12:11.650884   548   548 D ImgSensorDrv: [getInfo2]pre GrapX=0x0,GrapY=0x0
01-10 14:12:11.654346   406   406 I [WFCA]  : CCCI status:MD ready
01-10 14:12:11.654484   406   406 I [WFCA]  : Init imsx:/dev/ccci_imsa, 3
01-10 14:12:11.654501   406   406 I [WFCA]  : Init IPC MDM ringbuf
01-10 14:12:11.654518   406   406 I [WFCA]  : open ipc wfca
01-10 14:12:11.654740   406   406 I [WFCA]  : open ipc wfca_rds
01-10 14:12:11.654904   406   406 I [WFCA]  : open ipc MDM_rtp_OTA_msg_ctrl
01-10 14:12:11.654936   406   847 I [WFCA]  : listen thread created
01-10 14:12:11.655021   406   406 I [WFCA]  : unix_socket: MDM_rtp_OTA_msg_ctrl
01-10 14:12:11.655035   406   846 I [WFCA]  : listen_fd thread created
01-10 14:12:11.655302   406   848 I [WFCA]  : MDM ctrl thread created
01-10 14:12:11.655721   406   406 I [WFCA]  : CCCI status:MD ready
01-10 14:12:11.655755   406   406 I [WFCA]  : Init imsx:/dev/ccci_imsa, 3
01-10 14:12:11.655809   406   406 I [WFCA]  : WFCA Reset success
01-10 14:12:11.656580   808   808 I VoLTE IF_CH: client open stream socket , name = volte_stack, retry -200 times (module/volte//volte_core/src/os/api_channel.c:221)
01-10 14:12:11.656612   808   835 I VoLTE IF_CH: Connection from 0.0.0.0:0 [name:volte_stack, fd:12, idx:1] (module/volte//volte_core/src/os/api_channel.c:529)
01-10 14:12:11.656836   808   808 I VoLTE IF_CH: ** channel create (0xf2bc5940) (11) (module/volte//volte_core/src/os/api_channel.c:306)
01-10 14:12:11.656963   808   835 I VoLTE DISP: Reg UA is connected (0xf2bb7a4c - 0xf2590020 - 1) and send VOLTE_RSP_SIPTX_IF_REG_READY (module/volte//volte_stack/src/dispatcher/dispatcher.c:421)
01-10 14:12:11.657041   808   835 I VoLTE DISP: Reg UA is connected (0xf2bb7a4c - 0xf2590020 - 1) (module/volte//volte_stack/src/dispatcher/dispatcher.c:423)
01-10 14:12:11.657021   811   844 E VoLTE IF_CORE: type = 96012, response size error, size = 0 (module/volte//volte_core/src/interface/volte_stack.c:140)
01-10 14:12:11.657166   811   811 E VoLTE IF_CORE: volte_sip_stack_send_cmd, command error, type = 91034 (module/volte//volte_core/src/interface/volte_stack.c:549)
01-10 14:12:11.658566   811   811 I VoLTE IF_CH: server open stream socket (listen), name = volte_ua (module/volte//volte_core/src/os/api_channel.c:666)
01-10 14:12:11.658631   808   808 I VoLTE IF_CORE: volte_sip_stack_create, stack = 0xf2bcf050, channel = 0xf2bc5940 (module/volte//volte_stack/src/reg/reg.c:10281) (module/volte//volte_core/src/interface/volte_stack.c:463)
01-10 14:12:11.658754   808   808 I VoLTE REG: Init the Reg[0] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 14:12:11.658857   808   808 I VoLTE REG: *Reg[0] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 14:12:11.658890   808   808 I VoLTE_Auto_Testing: [0][reg] state/0/0/5/7
01-10 14:12:11.658952   808   808 I VoLTE REG: Init the Reg[1] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 14:12:11.659010   808   808 I VoLTE REG: *Reg[1] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 14:12:11.658926   811   856 I VoLTE IF_CH: Max connection is 1, name = volte_ua (module/volte//volte_core/src/os/api_channel.c:438)
01-10 14:12:11.659036   808   808 I VoLTE_Auto_Testing: [0][reg] state/1/0/5/7
01-10 14:12:11.659086   808   808 I VoLTE REG: Init the Reg[2] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 14:12:11.659138   808   808 I VoLTE REG: *Reg[2] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 14:12:11.659154   808   808 I VoLTE_Auto_Testing: [0][reg] state/2/0/5/7
01-10 14:12:11.659211   808   808 I VoLTE REG: Init the Reg[3] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 14:12:11.659268   808   808 I VoLTE REG: *Reg[3] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 14:12:11.659284   808   808 I VoLTE_Auto_Testing: [0][reg] state/3/0/5/7
01-10 14:12:11.659327   808   808 I VoLTE REG: Init the Reg[4] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 14:12:11.659382   808   808 I VoLTE REG: *Reg[4] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 14:12:11.659368   530   530 E VT      : [VTS] after addService 0
01-10 14:12:11.659487   808   808 I VoLTE_Auto_Testing: [0][reg] state/4/0/5/7
01-10 14:12:11.659546   530   530 I VT      : [SRV] [VT THREAD] VT_Connect start
01-10 14:12:11.659546   808   808 I VoLTE REG: Init the Reg[5] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 14:12:11.659565   530   530 I VT      : [VT] [DISPATCHER] VTMsgDispatcher Constuctor
01-10 14:12:11.659579   530   530 I VT      : [VT] [DISPATCHER] VTMsgDispatcher init
01-10 14:12:11.659593   808   808 I VoLTE REG: *Reg[5] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 14:12:11.659615   808   808 I VoLTE_Auto_Testing: [0][reg] state/5/0/5/7
01-10 14:12:11.660815   530   530 I VT      : [SRV] [VT THREAD] VT_Connect finish
01-10 14:12:11.660899   530   530 W VT      : [SRV] [VTCoreHelper] VTCoreHelper create
01-10 14:12:11.660923   530   530 I VT      : [SRV] [OPERATION][ID=1000] VTMALStub (VTMALStub)
01-10 14:12:11.660937   530   530 I VT      : [SRV] [OPERATION][ID=1000] VTMALStub (sim_id = 0)
01-10 14:12:11.660953   530   530 I VT      : [SRV] [CALL FLOW] create ( : )
01-10 14:12:11.661118   530   530 W AVSync  : VTAVSync enter!!!
01-10 14:12:11.663533   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.664663   621   621 D HWUIExtension: 19 Program id 22, key 0x0000000800500040, offset 148068, binaryLength 4496 within 29024ns
01-10 14:12:11.665518   621   621 D HWUIExtension: 20 Program id 23, key 0x0000000000000001, offset 152564, binaryLength 4944 within 741ns
01-10 14:12:11.666333   621   621 D HWUIExtension: 21 Program id 24, key 0x0000000800000000, offset 157508, binaryLength 4420 within 706ns
01-10 14:12:11.667052   621   621 D HWUIExtension: 22 Program id 25, key 0x0000000000500040, offset 161928, binaryLength 4496 within 612ns
01-10 14:12:11.667136   530   530 W AVSync  : open /dev/ccci_imsdc done, fd=6
01-10 14:12:11.667203   530   530 I AVSync  : CCCI status:MD ready
01-10 14:12:11.667291   530   530 I AVSync  : avInit, st 284325d86, int=a, frac=cf0bd759
01-10 14:12:11.667594   530   530 W VT      : [SRV] [VTCoreHelper] VTCoreHelper init
01-10 14:12:11.667687   530   530 I VT      : [SRV]   [MAP OPERATION]  clearElement ()
01-10 14:12:11.667719   530   530 I chatty  : uid=1000(system) /system/bin/vtservice identical 3 lines
01-10 14:12:11.667730   530   530 I VT      : [SRV]   [MAP OPERATION]  clearElement ()
01-10 14:12:11.667749   530   530 I VT      : [SRV] [CALL FLOW][ID=1000] create (User ID is :  : )
01-10 14:12:11.667785   530   530 I         : [VT][SRV]after VTService_instantiate
01-10 14:12:11.667801   530   860 W AVSync  : [AVSYNC] downlink_thread() entry
01-10 14:12:11.667889   530   860 E AVSync  : g_fd_avsync =6
01-10 14:12:11.668724   530   859 I VT      : [SRV] [VT THREAD] VT_Bind start
01-10 14:12:11.663374   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_LENS_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.671941   530   859 I VT      : [SRV] [THREAD] get hild success
01-10 14:12:11.672432   376   376 D VT HIDL : [IVT] configureFmqMode
01-10 14:12:11.672582   376   376 I VT HIDL : [IVT] configureFmqMode, getInstance wait client
01-10 14:12:11.672845   376   376 D VT HIDL : [IVT] configureFmqSyncRead
01-10 14:12:11.673003   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SENSOR_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.673759   376   376 D VT HIDL : [IVT] configureFmqSyncRead success
01-10 14:12:11.673861   376   376 D VT HIDL : [IVT] configureFmqSyncRead, evFlagWordPtr init done
01-10 14:12:11.674397   376   376 I VT HIDL : [IVT] configureFmqSyncRead, getInstance wait client
01-10 14:12:11.674707   376   376 D VT HIDL : [IVT] configureFmqSyncWrite
01-10 14:12:11.674995   376   376 D VT HIDL : [IVT] configureFmqSyncWrite success
01-10 14:12:11.675035   376   376 D VT HIDL : [IVT] configureFmqSyncWrite, evFlagWordPtr init done
01-10 14:12:11.675128   376   376 D VT HIDL : [IVT] initialization
01-10 14:12:11.675247   530   859 I VT      : [SRV] [VT THREAD] VT_Bind start finish
01-10 14:12:11.675269   376   376 D VT HIDL : [IVT] isImsVideoCallon : True
01-10 14:12:11.675510   376   376 D VT HIDL : [IVT] isImsVideoCallon : True
01-10 14:12:11.677208   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_TUNING_3A_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.679597   376   864 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] start
01-10 14:12:11.679689   376   864 D VT HIDL : [IVT] getInstance
01-10 14:12:11.679704   376   864 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] read from VTS
01-10 14:12:11.679941   376   865 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] start
01-10 14:12:11.679982   376   865 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1
01-10 14:12:11.680303   376   865 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 fd = -1
01-10 14:12:11.680363   376   865 D VT HIDL : [IVT] isIMCBrun : True
01-10 14:12:11.681964   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FLASHLIGHT_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.682026   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.684110   523   562 D AAL     : 01-10 02:12:11.607 BL= 928,ESS= 256, 01-10 02:12:11.626 BL= 929,ESS= 256, 01-10 02:12:11.645 BL= 930,ESS= 256, 01-10 02:12:11.664 BL= 931,ESS= 256, 01-10 02:12:11.684 BL= 932,ESS= 256, 
01-10 14:12:11.684662   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.685637   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_COMMON not found
01-10 14:12:11.686433   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.687338   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_COMMON not found
01-10 14:12:11.688344   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_CAMERA_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.689132   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_CAMERA_COMMON not found
01-10 14:12:11.689967   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.690864   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_COMMON not found
01-10 14:12:11.691886   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.692551   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_COMMON not found
01-10 14:12:11.693352   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.694169   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_COMMON not found
01-10 14:12:11.694988   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.696339   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_COMMON not found
01-10 14:12:11.697663   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.698393   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_COMMON not found
01-10 14:12:11.699013   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.699709   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_COMMON not found
01-10 14:12:11.700461   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.701157   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_COMMON not found
01-10 14:12:11.701473   621   621 D HWUIExtension: 23 Program id 26, key 0x0002000000d00041, offset 166424, binaryLength 5148 within 34222ns
01-10 14:12:11.701978   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.702757   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_COMMON not found
01-10 14:12:11.703554   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 14:12:11.704332   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_COMMON not found
01-10 14:12:11.705105   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.706133   548   548 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(0)
01-10 14:12:11.706282   548   548 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(0), SENINF_TG1_PH_CNT(0x1)
01-10 14:12:11.706555   548   548 D SeninfDrvImp: [setMclk2][setTg2Phase]pcEn(0), clkPol(0), mMclk2User(0), TimestampClk(0), SENINF_TG2_PH_CNT(0x0)
01-10 14:12:11.706878   548   548 D SeninfDrvImp: [uninit][uninit]: 1 
01-10 14:12:11.706965   548   548 D SeninfDrvImp: [uninit][uninit]: 0, mfd(8) 
01-10 14:12:11.708313   812   812 I VoLTE IF_CH: client open stream socket , name = volte_ua, retry -200 times (module/volte//volte_core/src/os/api_channel.c:221)
01-10 14:12:11.708364   811   856 I VoLTE IF_CH: Connection from 0.0.0.0:0 [name:volte_ua, fd:11, idx:0] (module/volte//volte_core/src/os/api_channel.c:529)
01-10 14:12:11.710854   548   548 D ImgSensorDrv: [uninit][uninit] imgsensor_drv 0
01-10 14:12:11.711607   377   696 D modules.usbaudio.audio_hal: [USB_AUD] adev_open
01-10 14:12:11.711027   548   548 I mtkcam-devicemgr: pHalSensorList:0xeddad3e8 searchSensors:1 queryNumberOfSensors:2
01-10 14:12:11.717219   524   524 I AudioFlinger: loadHwModule() Loaded usb audio interface, handle 26
01-10 14:12:11.718020   377   696 D vndksupport: Loading /vendor/lib/hw/audio.r_submix.mt6763.so from current namespace instead of sphal namespace.
01-10 14:12:11.724393   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.727745   812   812 I VoLTE IF_CH: ** channel create (0xeb598de0) (14) (module/volte//volte_core/src/os/api_channel.c:306)
01-10 14:12:11.727859   812   812 I VoLTE IMCB-CM: Send the init event to UA, max_acct=6 #54
01-10 14:12:11.727959   812   812 I VoLTE IMCB-CM: Connect to the UA, wait reg event (type 1) #217
01-10 14:12:11.727919   811   856 E VoLTE IF_SERVICE: volte_service_server_read, data = 0xeb311890, channel = 0xebc44680, type = 0, callback is NULL (module/volte//volte_core/src/interface/volte_service.c:188)
01-10 14:12:11.728130   811   856 I VoLTE Service: UA account num = 6 (module/volte//volte_ua/src/service/service.c:108)
01-10 14:12:11.728182   811   856 E VoLTE UA: Stack channel is created (module/volte//volte_ua/src/service/message.c:609)
01-10 14:12:11.728262   811   856 I VoLTE Service: VoLTE Service is ready (module/volte//volte_ua/src/service/service.c:124)
01-10 14:12:11.728599   808   843 I VoLTE REG: Reg[0] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 14:12:11.728755   808   843 I VoLTE REG: Reg[1] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 14:12:11.728812   808   843 I VoLTE REG: Reg[2] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 14:12:11.728825   808   843 I VoLTE REG: Reg[3] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 14:12:11.728837   808   843 I VoLTE REG: Reg[4] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 14:12:11.728850   808   843 I VoLTE REG: Reg[5] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 14:12:11.729841   812   867 I VoLTE IMCB-CM: Receive VOLTE_IND_REG_STATE, id = 5, and cause is VoLTE_Event_Reg_Cause_Channel_Bind #94
01-10 14:12:11.729868   812   812 I VoLTE IMCB-CM: socket opened, fd = 17!! #122
01-10 14:12:11.730229   812   812 I VoLTE IMCB: {{{{imcb main start ... (NDK build 20161209)/2018/12/05 15:44:45 GMT +08:00/MOLY.LR12A.R2.MP.V58.16 main()@0#481
01-10 14:12:11.730229   812   812 I VoLTE IMCB: [process_msg] msg_id=20002(0x00004E22), dst=UA[3], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 process_msg()@0#187
01-10 14:12:11.730229   812   812 I VoLTE IMCB: EndofMessage @0#236}}}}
01-10 14:12:11.730758   812   812 I VoLTE IMCB-2: {{{{[process_msg] msg_id=101602(0x00018CE2), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:11.730758   812   812 I VoLTE IMCB-2: connection status change for module 2 as error_num 0 imcb_imcb_comm_error_handler()@0#797
01-10 14:12:11.730758   812   812 I VoLTE IMCB-2: connection status for modudle 2 @0#820
01-10 14:12:11.730758   812   812 I VoLTE IMCB-2: ENTER imcb_send_multiple_imc_va_connect_req()@0#3073
01-10 14:12:11.730758   812   812 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@0#3056
01-10 14:12:11.730758   812   812 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.730758   812   812 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@1#3056
01-10 14:12:11.730758   812   812 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248}}}}
01-10 14:12:11.730922   812   812 I VoLTE IMCB: {{{{ENTER imcb_send_imc_va_connect_req()@2#3056
01-10 14:12:11.730922   812   812 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 14:12:11.730922   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.731303   807   807 E VoLTE IMSM: SOCK_Connect ok, fd = 6 (module/mdagent/volte_imsm_93/src/os_socket.c:305)
01-10 14:12:11.731683   807   807 D VoLTE IMSM: create imcb receiver[0], task_sock = 0xef91f270 (module/mdagent/volte_imsm_93/src/request_handler.c:214)
01-10 14:12:11.731779   812   812 I VoLTE IMCB-2: {{{{[process_msg] msg_id=101602(0x00018CE2), dst=IMSA1[5], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:11.731779   812   812 I VoLTE IMCB-2: connection status change for module 5 as error_num 0 imcb_imcb_comm_error_handler()@0#797
01-10 14:12:11.731779   812   812 I VoLTE IMCB-2: ENTER imcb_send_multiple_imc_va_connect_req()@0#3073
01-10 14:12:11.731779   812   812 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@0#3056
01-10 14:12:11.731779   812   812 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.731779   812   812 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@1#3056
01-10 14:12:11.731779   812   812 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:11.731779   812   812 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@2#3056}}}}
01-10 14:12:11.732239   812   812 I VoLTE IMCB-1: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 14:12:11.732239   812   812 I VoLTE IMCB-1: ENTER imcb_send_multiple_imc_imsa_connect_req()@0#3041
01-10 14:12:11.732239   812   812 I VoLTE IMCB-1: ENTER imcb_send_imc_imsa_connect_req()@0#3025
01-10 14:12:11.732239   812   812 I VoLTE IMCB-1: imcb_verno:0x6c imcb_set_imsa_connect_req_to_imc_para()@0#871
01-10 14:12:11.732239   812   812 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.732239   812   812 I VoLTE IMCB-1: ENTER imcb_send_imc_imsa_connect_req()@1#3025
01-10 14:12:11.732239   812   812 I VoLTE IMCB-1: imcb_verno:0x6c imcb_set_imsa_connect_req_to_imc_para()@1#871}}}}
01-10 14:12:11.732631   812   812 I VoLTE IMCB-1: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:11.732631   812   812 I VoLTE IMCB-1: ENTER imcb_send_imc_imsa_connect_req()@2#3025
01-10 14:12:11.732631   812   812 I VoLTE IMCB-1: imcb_verno:0x6c imcb_set_imsa_connect_req_to_imc_para()@2#871
01-10 14:12:11.732631   812   812 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 14:12:11.732631   812   812 I VoLTE IMCB-1: ENTER imcb_send_multiple_imc_va_connect_req()@0#3073
01-10 14:12:11.732631   812   812 I VoLTE IMCB-1: ENTER imcb_send_imc_va_connect_req()@0#3056
01-10 14:12:11.732631   812   812 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.732631   812   812 I VoLTE IMCB-1: ENTER imcb_send_imc_va_connect_req()@1#3056}}}}
01-10 14:12:11.732896   812   812 I VoLTE IMCB: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:11.732896   812   812 I VoLTE IMCB: ENTER imcb_send_imc_va_connect_req()@2#3056
01-10 14:12:11.732896   812   812 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 14:12:11.732896   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.733365   807   807 D VoLTE IMSM: version check begin (module/mdagent/volte_imsm_93/src/volte_imsm.c:172)
01-10 14:12:11.733424   807   807 I VoLTE IMSMx: IMSM -> IMSMMD : [0] AP_ID_IMSM_GET_VERSION_REQ
01-10 14:12:11.734469   807   870 I VoLTE IMSMx: IMSMMD -> IMSM : [0] AP_ID_IMSM_GET_VERSION_CNF
01-10 14:12:11.734406   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:11.734611   807   807 D VoLTE IMSM: AP version = 4, MD version = 4 (module/mdagent/volte_imsm_93/src/volte_imsm.c:180)
01-10 14:12:11.734743   807   807 I VoLTE IMSMx: IMSM -> IMSMMD : [0] AP_ID_SIMMNGR_SIM_INSERT_CHECK_REQ
01-10 14:12:11.735130   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:11.735311   812   812 I VoLTE IMCB-0: {{{{[process_msg] msg_id=100008(0x000186A8), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:11.735311   812   812 I VoLTE IMCB-0: ENTER imcb_imc_ims_init_ind_handler()@0#3890
01-10 14:12:11.735311   812   812 I VoLTE IMCB-0: ENTER imcb_initial_sim()@0#770
01-10 14:12:11.735311   812   812 I VoLTE IMCB-0: ENTER imcb_send_imc_ims_reg_state_req()@0#2392
01-10 14:12:11.735311   812   812 I VoLTE IMCB-0: error ua rat type = 0 imcb_rat_conv_to_imc()@0#85
01-10 14:12:11.735311   812   812 I VoLTE IMCB-0: acct_id:0, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@0#203
01-10 14:12:11.735311   812   812 I VoLTE IMCB-0: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.735311   812   812 I VoLTE IMCB-0: ENTER imcb_send_imc_ims_reg_state_req()@0#2392
01-10 14:12:11.735311   812   812 I VoLTE IMCB-0: error ua rat type = 0 imcb_rat_conv_to_imc()@0#85}}}}
01-10 14:12:11.735796   812   812 I VoLTE IMCB: {{{{acct_id:1, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@0#203
01-10 14:12:11.735796   812   812 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.735796   812   812 I VoLTE IMCB: sim:0 initiated ! imcb_initial_sim()@0#779
01-10 14:12:11.735796   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.736117   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:11.736442   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100014(0x000186AE), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:11.736442   812   812 I VoLTE IMCB: ENTER imcb_imc_sim_query_ind_handler()@0#5241
01-10 14:12:11.736442   812   812 I VoLTE IMCB: Pure Mesage Send dest=IMSA1[5], msg_id=100508(0x0001889C), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.736442   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.736489   807   869 I VoLTE IMSMx: IMCB -> IMSM : [0] SIM_QUERY_IND
01-10 14:12:11.736565   807   820 D VoLTE IMSM: ===> event queue = 0xef91a000, sim_id = 0, request_id = 100508 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5177)
01-10 14:12:11.736629   807   820 D VoLTE IMSM: Receive IMCB sim_id=0 request_id=100508 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2386)
01-10 14:12:11.736647   807   820 D VoLTE IMSM: receive MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_IND, transaction_id = 1 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2886)
01-10 14:12:11.736669   807   820 D VoLTE IMSM: send MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_RSP, transaction_id = 1, sim_usim_type = 0, isim_type = 3, session_id = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2907)
01-10 14:12:11.736681   807   820 I VoLTE IMSMx: IMSM -> IMCB : [0] SIM_QUERY_RSP
01-10 14:12:11.737895   812   812 I VoLTE IMCB-1: {{{{[process_msg] msg_id=100008(0x000186A8), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 14:12:11.737895   812   812 I VoLTE IMCB-1: ENTER imcb_imc_ims_init_ind_handler()@1#3890
01-10 14:12:11.737895   812   812 I VoLTE IMCB-1: ENTER imcb_initial_sim()@1#770
01-10 14:12:11.737895   812   812 I VoLTE IMCB-1: ENTER imcb_send_imc_ims_reg_state_req()@1#2392
01-10 14:12:11.737895   812   812 I VoLTE IMCB-1: error ua rat type = 0 imcb_rat_conv_to_imc()@1#85
01-10 14:12:11.737895   812   812 I VoLTE IMCB-1: acct_id:2, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@1#203
01-10 14:12:11.737895   812   812 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:11.737895   812   812 I VoLTE IMCB-1: ENTER imcb_send_imc_ims_reg_state_req()@1#2392
01-10 14:12:11.737895   812   812 I VoLTE IMCB-1: error ua rat type = 0 imcb_rat_conv_to_imc()@1#85}}}}
01-10 14:12:11.738324   377   696 I r_submix: adev_open(name=audio_hw_if)
01-10 14:12:11.738514   812   812 I VoLTE IMCB: {{{{acct_id:3, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@1#203
01-10 14:12:11.738514   812   812 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:11.738514   812   812 I VoLTE IMCB: sim:1 initiated ! imcb_initial_sim()@1#779
01-10 14:12:11.738514   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.739010   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100509(0x0001889D), dst=IMSA1[5], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:11.739010   812   812 I VoLTE IMCB: ENTER imsa_imcb_sim_query_rsp_handler()@0#1081
01-10 14:12:11.739010   812   812 I VoLTE IMCB: transaction_id:1, sim_usim_type:0, isim_type:3, session_id:0 @0#1084
01-10 14:12:11.739010   812   812 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.739010   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.739812   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:11.740055   807   870 I VoLTE IMSMx: IMSMMD -> IMSM : [0] AP_ID_SIMMNGR_SIM_INSERT_CHECK_CNF
01-10 14:12:11.739971   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:11.740365   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:11.740365   807   820 D VoLTE IMSM: ===> event queue = 0xef91a000, sim_id = 0, request_id = 800103 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5177)
01-10 14:12:11.740461   807   820 D VoLTE IMSM: MSG_ID_WRAP_MAL_IMSM_SIM_INSERT_CHECK_NOTIFY_IND, flag = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:4878)
01-10 14:12:11.740527   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100014(0x000186AE), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 14:12:11.740527   812   812 I VoLTE IMCB: ENTER imcb_imc_sim_query_ind_handler()@1#5241
01-10 14:12:11.740527   812   812 I VoLTE IMCB: Pure Mesage Send dest=IMSA1[5], msg_id=16877724(0x0101889C), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:11.740527   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.740730   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:11.740831   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:11.740924   377   696 I r_submix: adev_init_check()
01-10 14:12:11.741020   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100035(0x000186C3), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:11.741020   812   812 I VoLTE IMCB: ENTER imcb_imc_imsvops_notification_ind_handler()@0#5379
01-10 14:12:11.741020   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=12045(0x00002F0D), len=8, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.741020   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.741079   377   696 W DeviceHAL: Device set_master_mute: Function not implemented
01-10 14:12:11.741249   524   524 I AudioFlinger: loadHwModule() Loaded r_submix audio interface, handle 34
01-10 14:12:11.741249   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:11.741481   377   696 D r_submix: adev_open_input_stream(addr=0)
01-10 14:12:11.741598   377   696 D r_submix: submix_audio_device_create_pipe_l(addr=0, idx=9)
01-10 14:12:11.741617   377   696 D r_submix:   now using address 0 for route 9
01-10 14:12:11.741742   807   869 I VoLTE IMSMx: IMCB -> IMSM : [1] SIM_QUERY_IND
01-10 14:12:11.741740   811   853 I VoLTE SMS: SMS[0] update is_vops = (0) (module/volte//volte_ua/src/sms/sms.c:2935)
01-10 14:12:11.741882   807   821 D VoLTE IMSM: ===> event queue = 0xef91a5a0, sim_id = 1, request_id = 16877724 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5177)
01-10 14:12:11.741929   807   821 D VoLTE IMSM: Receive IMCB sim_id=1 request_id=100508 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2386)
01-10 14:12:11.741947   807   821 D VoLTE IMSM: receive MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_IND, transaction_id = 2 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2886)
01-10 14:12:11.741968   807   821 D VoLTE IMSM: send MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_RSP, transaction_id = 2, sim_usim_type = 0, isim_type = 3, session_id = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2907)
01-10 14:12:11.741980   807   821 I VoLTE IMSMx: IMSM -> IMCB : [1] SIM_QUERY_RSP
01-10 14:12:11.742229   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:11.742229   812   812 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@0#5493
01-10 14:12:11.742229   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=32, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.742229   812   812 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@0#5518
01-10 14:12:11.742229   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.742377   811   853 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 14:12:11.742407   811   853 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 14:12:11.742438   811   853 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 14:12:11.742629   808   843 I VoLTE REG: rcs_feature = 0 (module/volte//volte_stack/src/reg/reg.c:3230)
01-10 14:12:11.742590   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:11.742657   808   843 I VoLTE REG: rcs_state = 0 (module/volte//volte_stack/src/reg/reg.c:3233)
01-10 14:12:11.744621   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100118(0x00018716), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:11.744621   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:11.744621   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#248
01-10 14:12:11.744621   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.744852   811   853 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 14:12:11.744903   811   853 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 14:12:11.745207   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100035(0x000186C3), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 14:12:11.745207   812   812 I VoLTE IMCB: ENTER imcb_imc_imsvops_notification_ind_handler()@1#5379
01-10 14:12:11.745207   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=12045(0x00002F0D), len=8, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:11.745207   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.745329   811   853 I VoLTE SMS: SMS[2] update is_vops = (0) (module/volte//volte_ua/src/sms/sms.c:2935)
01-10 14:12:11.745767   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 14:12:11.745767   812   812 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@1#5493
01-10 14:12:11.745767   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=32, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:11.745767   812   812 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@1#5518
01-10 14:12:11.745767   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.745873   811   853 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 14:12:11.745917   811   853 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 14:12:11.745950   811   853 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 14:12:11.745943   808   843 E VoLTE REG: invalid rcs information (module/volte//volte_stack/src/reg/reg.c:3221)
01-10 14:12:11.746126   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100509(0x0001889D), dst=IMSA1[5], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 14:12:11.746126   812   812 I VoLTE IMCB: ENTER imsa_imcb_sim_query_rsp_handler()@1#1081
01-10 14:12:11.746126   812   812 I VoLTE IMCB: transaction_id:2, sim_usim_type:0, isim_type:3, session_id:0 @1#1084
01-10 14:12:11.746126   812   812 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:11.746126   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.746693   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100118(0x00018716), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 14:12:11.746693   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:11.746693   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#248
01-10 14:12:11.746693   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:11.746831   811   853 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 14:12:11.746887   811   853 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 14:12:11.747225   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.752026   524   872 I AudioFlinger_Threads: AudioFlinger's thread 0xe9503e00 tid=872 ready to run
01-10 14:12:11.752726   377   696 D r_submix: adev_close_input_stream()
01-10 14:12:11.752795   377   696 D r_submix: submix_audio_device_release_pipe_l(idx=9) addr=0
01-10 14:12:11.752824   377   696 D r_submix: submix_audio_device_destroy_pipe_l(): pipe destroyed
01-10 14:12:11.753047   524   524 E EffectsConfig: Failed to parse /vendor/etc/audio_effects.xml: Tinyxml2 error (3): /vendor/etc/audio_effects.xml (null)
01-10 14:12:11.753152   524   524 W AudioPolicyEffects: Failed to load XML effect configuration, fallback to .conf
01-10 14:12:11.754483   524   524 D audioserver: AudioPolicyService init done
01-10 14:12:11.755770   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.soundtrigger@2.0::ISoundTriggerHw/default in either framework or device manifest.
01-10 14:12:11.756041   524   524 E SoundTriggerHwService: could not read implementation properties
01-10 14:12:11.756558   524   524 D audioserver: SoundTriggerHwService init done
01-10 14:12:11.764615   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.764863   621   621 D HWUIExtension: 24 Program id 27, key 0x000201080000000b, offset 171572, binaryLength 11808 within 63211ns
01-10 14:12:11.765999   621   621 D HWUIExtension: 25 Program id 28, key 0x0000001800500040, offset 183380, binaryLength 4792 within 1005ns
01-10 14:12:11.770041   621   621 I ProgramBinary/Builder: ProgramEntry # 0: key 0x0000000000000000, offset      0, binaryLength 4420, format 36705 --> 0x4d 0x50 0x42 0x31 0x3c 0x11 0x00 0x00 0x02 0x00
01-10 14:12:11.770224   621   621 I ProgramBinary/Builder: ProgramEntry # 1: key 0x0000001000500040, offset   4420, binaryLength 4792, format 36705 --> 0x4d 0x50 0x42 0x31 0xb0 0x12 0x00 0x00 0x02 0x00
01-10 14:12:11.770247   621   621 I ProgramBinary/Builder: ProgramEntry # 2: key 0x0000003800000000, offset   9212, binaryLength 4812, format 36705 --> 0x4d 0x50 0x42 0x31 0xc4 0x12 0x00 0x00 0x02 0x00
01-10 14:12:11.770263   621   621 I ProgramBinary/Builder: ProgramEntry # 3: key 0x0002000000000001, offset  14024, binaryLength 4944, format 36705 --> 0x4d 0x50 0x42 0x31 0x48 0x13 0x00 0x00 0x02 0x00
01-10 14:12:11.770278   621   621 I ProgramBinary/Builder: ProgramEntry # 4: key 0x0002000000000003, offset  18968, binaryLength 4944, format 36705 --> 0x4d 0x50 0x42 0x31 0x48 0x13 0x00 0x00 0x02 0x00
01-10 14:12:11.770292   621   621 I ProgramBinary/Builder: ProgramEntry # 5: key 0x0002000000500041, offset  23912, binaryLength 5148, format 36705 --> 0x4d 0x50 0x42 0x31 0x14 0x14 0x00 0x00 0x02 0x00
01-10 14:12:11.770307   621   621 I ProgramBinary/Builder: ProgramEntry # 6: key 0x0000001000000000, offset  29060, binaryLength 4648, format 36705 --> 0x4d 0x50 0x42 0x31 0x20 0x12 0x00 0x00 0x02 0x00
01-10 14:12:11.770322   621   621 I ProgramBinary/Builder: ProgramEntry # 7: key 0x0002000800000003, offset  33708, binaryLength 5140, format 36705 --> 0x4d 0x50 0x42 0x31 0x0c 0x14 0x00 0x00 0x02 0x00
01-10 14:12:11.770340   621   621 I ProgramBinary/Builder: ProgramEntry # 8: key 0x0000010000000008, offset  38848, binaryLength 9412, format 36705 --> 0x4d 0x50 0x42 0x31 0xbc 0x24 0x00 0x00 0x02 0x00
01-10 14:12:11.770355   621   621 I ProgramBinary/Builder: ProgramEntry # 9: key 0x0002000800000001, offset  48260, binaryLength 5140, format 36705 --> 0x4d 0x50 0x42 0x31 0x0c 0x14 0x00 0x00 0x02 0x00
01-10 14:12:11.770371   621   621 I ProgramBinary/Builder: ProgramEntry #10: key 0x0000001800000000, offset  53400, binaryLength 4648, format 36705 --> 0x4d 0x50 0x42 0x31 0x20 0x12 0x00 0x00 0x02 0x00
01-10 14:12:11.770385   621   621 I ProgramBinary/Builder: ProgramEntry #11: key 0x0002001800500044, offset  58048, binaryLength 10924, format 36705 --> 0x4d 0x50 0x42 0x31 0xa4 0x2a 0x00 0x00 0x02 0x00
01-10 14:12:11.770405   621   621 I ProgramBinary/Builder: ProgramEntry #12: key 0x0000001000000008, offset  68972, binaryLength 11256, format 36705 --> 0x4d 0x50 0x42 0x31 0xf0 0x2b 0x00 0x00 0x02 0x00
01-10 14:12:11.770420   621   621 I ProgramBinary/Builder: ProgramEntry #13: key 0x0002000000900041, offset  80228, binaryLength 5204, format 36705 --> 0x4d 0x50 0x42 0x31 0x4c 0x14 0x00 0x00 0x02 0x00
01-10 14:12:11.770435   621   621 I ProgramBinary/Builder: ProgramEntry #14: key 0x0000081000000000, offset  85432, binaryLength 12020, format 36705 --> 0x4d 0x50 0x42 0x31 0xec 0x2e 0x00 0x00 0x02 0x00
01-10 14:12:11.770449   621   621 I ProgramBinary/Builder: ProgramEntry #15: key 0x0002080800000001, offset  97452, binaryLength 12588, format 36705 --> 0x4d 0x50 0x42 0x31 0x24 0x31 0x00 0x00 0x02 0x00
01-10 14:12:11.770464   621   621 I ProgramBinary/Builder: ProgramEntry #16: key 0x0002080000d00041, offset 110040, binaryLength 12592, format 36705 --> 0x4d 0x50 0x42 0x31 0x28 0x31 0x00 0x00 0x02 0x00
01-10 14:12:11.770479   621   621 I ProgramBinary/Builder: ProgramEntry #17: key 0x0002080000900041, offset 122632, binaryLength 12848, format 36705 --> 0x4d 0x50 0x42 0x31 0x28 0x32 0x00 0x00 0x02 0x00
01-10 14:12:11.770492   621   621 I ProgramBinary/Builder: ProgramEntry #18: key 0x0002080800000003, offset 135480, binaryLength 12588, format 36705 --> 0x4d 0x50 0x42 0x31 0x24 0x31 0x00 0x00 0x02 0x00
01-10 14:12:11.770507   621   621 I ProgramBinary/Builder: ProgramEntry #19: key 0x0000000800500040, offset 148068, binaryLength 4496, format 36705 --> 0x4d 0x50 0x42 0x31 0x88 0x11 0x00 0x00 0x02 0x00
01-10 14:12:11.770523   621   621 I ProgramBinary/Builder: ProgramEntry #20: key 0x0000000000000001, offset 152564, binaryLength 4944, format 36705 --> 0x4d 0x50 0x42 0x31 0x48 0x13 0x00 0x00 0x02 0x00
01-10 14:12:11.770537   621   621 I ProgramBinary/Builder: ProgramEntry #21: key 0x0000000800000000, offset 157508, binaryLength 4420, format 36705 --> 0x4d 0x50 0x42 0x31 0x3c 0x11 0x00 0x00 0x02 0x00
01-10 14:12:11.770551   621   621 I ProgramBinary/Builder: ProgramEntry #22: key 0x0000000000500040, offset 161928, binaryLength 4496, format 36705 --> 0x4d 0x50 0x42 0x31 0x88 0x11 0x00 0x00 0x02 0x00
01-10 14:12:11.770565   621   621 I ProgramBinary/Builder: ProgramEntry #23: key 0x0002000000d00041, offset 166424, binaryLength 5148, format 36705 --> 0x4d 0x50 0x42 0x31 0x14 0x14 0x00 0x00 0x02 0x00
01-10 14:12:11.770579   621   621 I ProgramBinary/Builder: ProgramEntry #24: key 0x000201080000000b, offset 171572, binaryLength 11808, format 36705 --> 0x4d 0x50 0x42 0x31 0x18 0x2e 0x00 0x00 0x02 0x00
01-10 14:12:11.770593   621   621 I ProgramBinary/Builder: ProgramEntry #25: key 0x0000001800500040, offset 183380, binaryLength 4792, format 36705 --> 0x4d 0x50 0x42 0x31 0xb0 0x12 0x00 0x00 0x02 0x00
01-10 14:12:11.770653   621   621 I ProgramBinary/Builder: Build program succeeded.
01-10 14:12:11.773814   621   621 I ProgramBinary/Builder: Build program result is sending to server...
01-10 14:12:11.774015   621   621 I ProgramBinary/Service: ProgramBinaryService client side disable debugging.
01-10 14:12:11.774096   621   621 I ProgramBinary/Service: ProgramBinaryService client side disable binary content debugging.
01-10 14:12:11.774112   621   621 D ProgramBinary/Service: BpProgramBinaryService.setProgramBinaryData
01-10 14:12:11.774356   569   634 D ProgramBinary/Service: zhiyin- ontransact 1 code 4
01-10 14:12:11.774658   621   621 D ProgramBinary/Service: BpProgramBuilderService.setReady
01-10 14:12:11.774792   569   634 D ProgramBinary/Service: zhiyin- ontransact 1 code 2
01-10 14:12:11.775010   621   621 I ProgramBinary/Builder: Build program result: Build is Successful & Send is Successful.
01-10 14:12:11.775106   621   621 I ProgramBinary/Builder: Program binary builder ended!
01-10 14:12:11.775115   621   621 I ProgramBinary/Builder: Build program desctruct.
01-10 14:12:11.778093   523   562 D AAL     : 01-10 02:12:11.702 BL= 933,ESS= 256, 01-10 02:12:11.721 BL= 934,ESS= 256, 01-10 02:12:11.739 BL= 935,ESS= 256, 01-10 02:12:11.758 BL= 936,ESS= 256, 01-10 02:12:11.778 BL= 937,ESS= 256, 
01-10 14:12:11.781586   621   621 I         : [MALI] @eglp_check_display_valid_and_initialized_and_retain: MALI_EGL_DISPLAY_INITIALIZED != dpy->state (EGL_NOT_INITIALIZED)
01-10 14:12:11.788984   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.806194   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.830808   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.848053   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.871781   523   562 D AAL     : 01-10 02:12:11.796 BL= 938,ESS= 256, 01-10 02:12:11.815 BL= 939,ESS= 256, 01-10 02:12:11.833 BL= 940,ESS= 256, 01-10 02:12:11.852 BL= 941,ESS= 256, 01-10 02:12:11.871 BL= 942,ESS= 256, 
01-10 14:12:11.872666   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.889513   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.897641   548   548 D AAALOGTAG:  3alog = 0, default = 0
01-10 14:12:11.898960   548   548 I mtkcam-module: [ModuleStore] ctor
01-10 14:12:11.899064   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10001 module_factory:0xe5147b6d register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_Hal3A.cpp
01-10 14:12:11.899081   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10002 module_factory:0xe5218281 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_HalFlash.cpp
01-10 14:12:11.899099   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10003 module_factory:0xe5147b71 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_IspMgrIf.cpp
01-10 14:12:11.899113   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10005 module_factory:0xe51f7dad register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_SwNR.cpp
01-10 14:12:11.899127   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10006 module_factory:0xe589e5e9 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_DngInfo.cpp
01-10 14:12:11.899141   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10007 module_factory:0xe6320791 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_NvBufUtil.cpp
01-10 14:12:11.899155   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10008 module_factory:0xe60b4c91 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_LscTable.cpp
01-10 14:12:11.899170   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10009 module_factory:0xe6e44f2d register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_lcs_hal.cpp
01-10 14:12:11.899187   548   548 I mtkcam-module: [ShowLoading] loading (MODULE_GROUP_ID:1 MODULE_GROUP_COUNT:10 ...
01-10 14:12:11.899470   548   548 I mtkcam-module: [load] MtkCam_getModuleFactory_aaa(0xe6ea4fe9) @ libmtkcam_modulefactory_aaa.so
01-10 14:12:11.899531   548   548 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(0)
01-10 14:12:11.899593   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(1), size(1039536)
01-10 14:12:11.900265   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(2), size(1039536)
01-10 14:12:11.901002   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(4), size(1039536)
01-10 14:12:11.901750   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(8), size(1039536)
01-10 14:12:11.902494   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(1), size(96504)
01-10 14:12:11.902636   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(2), size(96504)
01-10 14:12:11.902743   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(4), size(96504)
01-10 14:12:11.902841   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(8), size(96504)
01-10 14:12:11.902918   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(1), size(1050652)
01-10 14:12:11.903635   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(2), size(1050652)
01-10 14:12:11.904551   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(4), size(1050652)
01-10 14:12:11.905510   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(8), size(1050652)
01-10 14:12:11.906522   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(1), size(157704)
01-10 14:12:11.906716   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(2), size(157704)
01-10 14:12:11.906710   544   637 I ServiceManager: Waiting for service package_native...
01-10 14:12:11.906870   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(4), size(157704)
01-10 14:12:11.906989   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(8), size(157704)
01-10 14:12:11.907103   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(1), size(336868)
01-10 14:12:11.907319   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(2), size(336868)
01-10 14:12:11.907614   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(4), size(336868)
01-10 14:12:11.907847   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(8), size(336868)
01-10 14:12:11.908069   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(1), size(5120)
01-10 14:12:11.908113   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(2), size(5120)
01-10 14:12:11.908134   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(4), size(5120)
01-10 14:12:11.908151   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(8), size(5120)
01-10 14:12:11.908169   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(1), size(70520)
01-10 14:12:11.908226   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(2), size(70520)
01-10 14:12:11.908286   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(4), size(70520)
01-10 14:12:11.908340   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(8), size(70520)
01-10 14:12:11.908397   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(1), size(80)
01-10 14:12:11.908412   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(2), size(80)
01-10 14:12:11.908425   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(4), size(80)
01-10 14:12:11.908439   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(8), size(80)
01-10 14:12:11.908452   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(1), size(54000)
01-10 14:12:11.908495   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(2), size(54000)
01-10 14:12:11.908538   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(4), size(54000)
01-10 14:12:11.908589   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(8), size(54000)
01-10 14:12:11.908632   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(1), size(80)
01-10 14:12:11.908646   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(2), size(80)
01-10 14:12:11.908659   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(4), size(80)
01-10 14:12:11.908673   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(8), size(80)
01-10 14:12:11.908686   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(1), size(42928)
01-10 14:12:11.908726   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(2), size(42928)
01-10 14:12:11.908764   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(4), size(42928)
01-10 14:12:11.908804   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(8), size(42928)
01-10 14:12:11.908844   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(1), size(4096)
01-10 14:12:11.908862   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(2), size(4096)
01-10 14:12:11.908880   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(4), size(4096)
01-10 14:12:11.908897   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(8), size(4096)
01-10 14:12:11.908914   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(1), size(22400)
01-10 14:12:11.908941   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(2), size(22400)
01-10 14:12:11.908968   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(4), size(22400)
01-10 14:12:11.908993   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(8), size(22400)
01-10 14:12:11.909114   548   548 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:11.909271   548   548 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(0), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 14:12:11.909312   548   548 W NvramDrv: [readDefaultData:735] CAMERA_NVRAM_DATA_ISP
01-10 14:12:11.910842   548   548 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:11.910970   548   548 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(2), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:11.910999   548   548 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(2), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 14:12:11.911026   548   548 W NvramDrv: [readDefaultData:743] CAMERA_NVRAM_DATA_SHADING
01-10 14:12:11.913066   548   548 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:11.913227   548   548 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:11.913253   548   548 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(1), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 14:12:11.913281   548   548 W NvramDrv: [readDefaultData:739] CAMERA_NVRAM_DATA_3A
01-10 14:12:11.914382   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.928390   548   548 I mtkcam-devicemgr: [logLocked] Physical Devices: # 1
01-10 14:12:11.928518   548   548 I mtkcam-devicemgr: [logLocked] --
01-10 14:12:11.928531   548   548 I mtkcam-devicemgr: [logLocked]   [00] -> orientation(wanted/setup)=( 90/90 ) BACK  hasFlashUnit:1 SENSOR_DRVNAME_S5K3L8_MIPI_RAW [PhysEnumDevice:0xf1321730]
01-10 14:12:11.928541   548   548 I mtkcam-devicemgr: [logLocked] --
01-10 14:12:11.928550   548   548 I mtkcam-devicemgr: [logLocked] Virtual Devices: # 1
01-10 14:12:11.928558   548   548 I mtkcam-devicemgr: [logLocked] --
01-10 14:12:11.928566   548   548 I mtkcam-devicemgr: [logLocked]   [device@1.0/internal/0] -> 00 torchModeStatus:AVAILABLE_OFF hasFlashUnit:1 [VirtEnumDevice:0xf137c718 IVirtualDevice:0xf1321e50]
01-10 14:12:11.928574   548   548 I mtkcam-devicemgr: [logLocked] --
01-10 14:12:11.928584   548   548 I mtkcam-devicemgr: [logLocked] Open Devices: # 0 (multi-opened maximum: # 2)
01-10 14:12:11.928592   548   548 I mtkcam-devicemgr: [logLocked] --
01-10 14:12:11.928607   548   548 I mtkcam-devicemgr: [initialize] -
01-10 14:12:11.928626   548   548 I mtkcam-camprovider: [createICameraProvider_V2_4] + internal/0
01-10 14:12:11.928661   548   548 I mtkcam-camprovider: [initialize] +
01-10 14:12:11.928840   548   548 I mtkcam-camprovider: [initialize] -
01-10 14:12:11.928872   548   548 I mtkcam-camprovider: [createICameraProvider_V2_4] - internal/0 provider:0xf132b860 manager:0xf0e63004
01-10 14:12:11.930892   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.932443   548   548 I camerahalserver: Registration complete for android.hardware.camera.provider@2.4::ICameraProvider/internal/0.
01-10 14:12:11.934356   548   548 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.advcam@1.0-impl.so from current namespace instead of sphal namespace.
01-10 14:12:11.939828   548   548 I AdvCamControl_impl: IAdvCamControl  into HIDL_FETCH_IAdvCamControl
01-10 14:12:11.942147   548   548 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.advcam@1.0::IAdvCamControl/internal/0.
01-10 14:12:11.943316   548   548 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.lomoeffect@1.0-impl.so from current namespace instead of sphal namespace.
01-10 14:12:11.949052   548   548 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.lomoeffect@1.0::ILomoEffect/internal/0.
01-10 14:12:11.950080   548   548 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.ccap@1.0-impl.so from current namespace instead of sphal namespace.
01-10 14:12:11.954802   548   548 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.ccap@1.0::ICCAPControl/internal/0.
01-10 14:12:11.956333   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:11.956283   548   548 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.callbackclient@1.0-impl.so from current namespace instead of sphal namespace.
01-10 14:12:11.965447   548   548 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.callbackclient@1.0::IMtkCallbackClient/internal/0.
01-10 14:12:11.966050   523   562 D AAL     : 01-10 02:12:11.890 BL= 943,ESS= 256, 01-10 02:12:11.909 BL= 944,ESS= 256, 01-10 02:12:11.928 BL= 945,ESS= 256, 01-10 02:12:11.947 BL= 946,ESS= 256, 01-10 02:12:11.966 BL= 947,ESS= 256, 
01-10 14:12:11.966461   527   729 I CameraProviderManager: Connecting to new camera provider: internal/0, isRemote? 1
01-10 14:12:11.967536   527   729 I CameraProviderManager: Enumerating new camera device: device@1.0/internal/0
01-10 14:12:11.969686   548   878 I mtkcam-dev1: [createSpecificCameraDevice1] APP_MODE_NAME_DEFAULT
01-10 14:12:11.972510   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:11.975291   394   413 I powerd  : [powerd_req] POWER_MSG_SCN_REG: pid:548, uid:1047
01-10 14:12:11.975879   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnReg hdl:39
01-10 14:12:11.976844   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnEnable hdl:39, timeout:1000
01-10 14:12:11.977244   394   413 I powerd  : [powerd_req] POWER_MSG_SCN_ENABLE: hdl:39, timeout:1000
01-10 14:12:11.977397   394   413 I libPerfService: perfUserScnEnable - handle:39
01-10 14:12:11.978823   394   413 I libPerfService: 39: legacy set freq: 1508000 -1 2002000 -1
01-10 14:12:11.979788   548   878 I mtkcam-dev1: [createSpecificCameraDevice1] - 0xefab0600
01-10 14:12:11.979895   548   878 I mtkcam-dev1: 0[CameraDevice1Base::open] +
01-10 14:12:11.980187   548   878 I mtkcam-devicemgr: [attachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 14:12:11.980
01-10 14:12:11.980638   548   880 D SeninfDrvImp: [init][init]: Entry count 0 
01-10 14:12:11.981399   548   878 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_AE,0),srIdxNum(0)
01-10 14:12:11.981494   548   878 I Drv/HWsync: Drv/HWsync[init] mAECyclePeriod(3)
01-10 14:12:11.981509   548   878 I Drv/HWsync: Drv/HWsync[init] -
01-10 14:12:11.981562   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:11.981636   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:11.981655   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:11.981701   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:11.981733   548   878 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(4), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 14:12:11.981787   548   878 W NvramDrv: [readDefaultData:755] CAMERA_DATA_AE_PLINETABLE
01-10 14:12:11.982183   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:11.982262   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:11.985907   548   878 D LaserDrv: LaserDrv()
01-10 14:12:11.986189   548   878 D LaserDrv: Device error opening : No such file or directory
01-10 14:12:11.987218   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:11.987199   548   880 D SeninfDrvImp: [init]Efuse Data:0x11f1018c= 0x8c631940, 0x11f10190= 0x7c208364, 0x11f101bc= 0x80000000
01-10 14:12:11.987308   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:11.987316   548   880 D SeninfDrvImp: [init][init]: Exit count 1 
01-10 14:12:11.987447   548   880 D ImgSensorDrv: [init][init] imgsensor_drv 1
01-10 14:12:11.987591   548   880 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11)
01-10 14:12:11.987704   548   880 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11), SENINF_TG1_PH_CNT(0x80000005)
01-10 14:12:11.988035   548   880 D SeninfDrvImp: [setMclk1IODrivingCurrent]DrivingIdx(3), Reg(0x30000000)
01-10 14:12:11.998123   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.015313   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.029755   398   640 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=23.46 dur=1023.13 max=61.73 min=31.57
01-10 14:12:12.040150   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.055843   522   522 I zygote  : Explicit concurrent copying GC freed 181(8KB) AllocSpace objects, 0(0B) LOS objects, 98% free, 23KB/1559KB, paused 89us total 6.286ms
01-10 14:12:12.056713   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.060248   523   562 D AAL     : 01-10 02:12:11.985 BL= 948,ESS= 256, 01-10 02:12:12.003 BL= 949,ESS= 256, 01-10 02:12:12.022 BL= 950,ESS= 256, 01-10 02:12:12.041 BL= 951,ESS= 256, 01-10 02:12:12.060 BL= 952,ESS= 256, 
01-10 14:12:12.062567   522   522 I zygote  : Explicit concurrent copying GC freed 5(32KB) AllocSpace objects, 0(0B) LOS objects, 98% free, 23KB/1559KB, paused 56us total 6.222ms
01-10 14:12:12.064247   522   522 I zygote  : Global filter of size 170 installed
01-10 14:12:12.065937   522   522 I Zygote  : Accepting command socket connections
01-10 14:12:12.076548   548   880 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(0)
01-10 14:12:12.076715   548   880 I Drv/HWsync: Drv/HWsync[init] -
01-10 14:12:12.079165   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:12.079275   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:12.079290   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:12.079306   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(2), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:12.079319   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:12.079335   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:12.079350   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:12.079366   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(6), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:12.079449   548   878 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(6), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 14:12:12.079482   548   878 W NvramDrv: [readDefaultData:772] CAMERA_DATA_TSF_TABLE
01-10 14:12:12.079824   548   878 D CAM_CUS_MSDK: CAM_CUS_MSDK GetCameraCalData(MainSensorIdx=30c8) Enter
01-10 14:12:12.079873   548   878 D CAM_CUS_MSDK: CAM_CUS_MSDK SensorId != pstSensorInitFunc[0].SensorId=258 
01-10 14:12:12.079889   548   878 D CAM_CUS_MSDK: CAM_CUS_MSDK SensorId == pstSensorInitFunc[1].SensorId=30c8 
01-10 14:12:12.079903   548   878 D CAM_CUS_MSDK: CAM_CUS_MSDK Enter! GetCameraCalData(MainSensorIdx=30c8) Enter
01-10 14:12:12.079922   548   878 D CAM_CUS_MSDK: CAM_CUS_MSDK pstSensorInitFunc(MainSensorIdx=30c8) Enter
01-10 14:12:12.079936   548   878 I CamCalCamCal: ver1017~ pCamCalData->sensorID=30c8
01-10 14:12:12.079959   548   878 I CamCalCamCal: ver1017~ pCamCalData->deviceID=1
01-10 14:12:12.081828   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.085145   548   878 I CamCalCamCal: ver1017~ lsc table_size 1868
01-10 14:12:12.104032   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.123716   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.127314   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:23.558634,dur:1018.73,max:57.07,min:33.66
01-10 14:12:12.142297   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.154757   523   562 D AAL     : 01-10 02:12:12.079 BL= 953,ESS= 256, 01-10 02:12:12.097 BL= 954,ESS= 256, 01-10 02:12:12.116 BL= 955,ESS= 256, 01-10 02:12:12.135 BL= 956,ESS= 256, 01-10 02:12:12.154 BL= 957,ESS= 256, 
01-10 14:12:12.165721   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.180529   376   865 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Fail to connect . retry count: 1
01-10 14:12:12.180982   376   865 D VT HIDL : [IVT] isIMCBrun : True
01-10 14:12:12.182500   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.189436   548   878 I CamCalCamCal: ver1017~ ======================SingleLsc Data==================
01-10 14:12:12.189546   548   878 I CamCalCamCal: ver1017~ [1st] = 2, 8, 4c, 7 
01-10 14:12:12.189562   548   878 I CamCalCamCal: ver1017~ [1st] = SensorLSC(1)?MTKLSC(2)?  2 
01-10 14:12:12.189576   548   878 I CamCalCamCal: ver1017~ CapIspReg =0x30000000, 0xd04bd037, 0x40000000, 0x4d0041, 0x20202020
01-10 14:12:12.189587   548   878 I CamCalCamCal: ver1017~ RETURN = 0x0 
01-10 14:12:12.189601   548   878 I CamCalCamCal: ver1017~ ======================SingleLsc Data==================
01-10 14:12:12.189637   548   878 D CAM_CUS_MSDK: CAM_CUS_MSDK Done! GetCameraCalData(MainSensorIdx=30c8) Enter
01-10 14:12:12.190217   548   878 D gma_core: [GmaCore] constructor, sensor dev:1
01-10 14:12:12.190308   548   882 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:12.190387   548   878 D lce_core: [LceCore] constructor, sensor dev:1
01-10 14:12:12.195783   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.196297   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.196447   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 14:12:12.196520   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 14:12:12.196535   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 14:12:12.196547   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 14:12:12.197021   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.197319   548   878 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:12.198243   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.198876   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.199036   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 14:12:12.199092   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 14:12:12.199104   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 14:12:12.199115   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 14:12:12.186000   548   548 W HwBinder:548_2: type=1400 audit(0.0:37): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:12.199607   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.199961   548   878 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:12.200857   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.201410   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.201554   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 14:12:12.201618   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 14:12:12.201631   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 14:12:12.201642   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 14:12:12.202088   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.202436   548   878 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:12.203558   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.204126   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.204312   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 14:12:12.204416   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 14:12:12.204429   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 14:12:12.204440   548   878 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 14:12:12.204896   548   878 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 14:12:12.205279   548   878 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:12.205499   548   878 D AppTsf  : [AppTsf] constructor
01-10 14:12:12.205627   548   878 D tsf_core: [TsfCore] constructor
01-10 14:12:12.207699   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.207793   548   878 W aaa_state_mgr: [StateCommon::transitState] StateUninit --> StateInit
01-10 14:12:12.207967   548   884 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:12.208060   548   884 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(7), sensorDev(1), p(0x0), bForceRead(1) +
01-10 14:12:12.208093   548   884 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(7), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 14:12:12.208121   548   884 W NvramDrv: [readDefaultData:779] CAMERA_DATA_PDC_TABLE
01-10 14:12:12.208283   548   884 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 14:12:12.208421   548   878 I FlashAlgM: FlashAlgM 2
01-10 14:12:12.211132   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:12.211308   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(5), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:12.211338   548   878 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(5), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 14:12:12.211382   548   878 W NvramDrv: [readDefaultData:760] CAMERA_NVRAM_DATA_STROBE cust_fillDefaultStrobeNVRam
01-10 14:12:12.211509   548   878 D flash_custom.cpp: devid main id1
01-10 14:12:12.211946   548   878 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_SENSOR_DRVNAME_S5K3L8_MIPI_RAW
01-10 14:12:12.215136   548   878 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_FLASHLIGHT
01-10 14:12:12.216753   548   878 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_AFLAMP
01-10 14:12:12.217818   548   878 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_CAMERASHOT
01-10 14:12:12.219498   548   878 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_SENINDEPFEATURE
01-10 14:12:12.221258   548   878 I MtkCam/ParamsManager: [Feature::initFeatures_NoWarningCorrection] (fgIsLowMem, memory_total_in_byte, getpagesize)=(0, 2992164864, 4096)
01-10 14:12:12.222775   548   878 I MtkCam/ParamsManager: [updateDefaultParams2_ByQuery] cap(4208,3120),fov(67,49)
01-10 14:12:12.223085   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:12.223176   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0xe671f9d8), bForceRead(0) +
01-10 14:12:12.223192   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:12.223207   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0xe6c19e48), bForceRead(0) +
01-10 14:12:12.223218   548   878 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:12.223232   548   878 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0xe63257ac), bForceRead(0) +
01-10 14:12:12.223265   548   878 D LensMCU : LensMCU[isSupportLens][CurrSensorDev]0x0001 [CurrSensorId]0x30c8
01-10 14:12:12.223465   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.224459   548   878 I MtkCam/FrameController: [FrameController][prvcb] - miLogLevel(1), max delay(30000000), max sleep(1000000000 ns), min sleep(200 us), adj sleep(250000 ns)
01-10 14:12:12.229199   527   729 W CameraProviderManager: Camera provider internal/0 says an unknown camera device@1.0/internal/0 now has torch status 0. Curious.
01-10 14:12:12.229626   548   878 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:0
01-10 14:12:12.229785   548   878 I mtkcam-dev1: 0[CameraDevice1Base::open] Add new cameraId 0 - 0xefab0600
01-10 14:12:12.229899   548   878 I mtkcam-dev1: 0[CameraDevice1Base::open] -
01-10 14:12:12.232107   548   877 I mtkcam-dev1: 0[CameraDevice1Base::close] +
01-10 14:12:12.232759   548   877 I MtkCam/CamClient: (877)[uninit] + getStrongCount(1)
01-10 14:12:12.233879   548   884 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 14:12:12.234064   548   884 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 14:12:12.234080   548   884 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 14:12:12.234091   548   884 I MtkCam/Utils: onCreate#03 pc 000f5949  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+348)
01-10 14:12:12.234098   548   884 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 14:12:12.234109   548   884 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 14:12:12.234122   548   884 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 14:12:12.234132   548   884 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 14:12:12.234159   548   884 E MtkCam/IonHeap: PDC_tbl_1@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 14:12:12.234260   548   884 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 14:12:12.243339   548   877 W MtkCam/CamClient/FDClient: (877)[stopFaceDetection] FD was not running
01-10 14:12:12.243701   548   877 I MtkCam/CamClient: (877)[uninit] - getStrongCount(1)
01-10 14:12:12.244084   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 14:12:12.244918   394   413 I libPerfService: 39: legacy set freq: -1 -1 -1 -1
01-10 14:12:12.248906   523   562 D AAL     : 01-10 02:12:12.173 BL= 958,ESS= 256, 01-10 02:12:12.192 BL= 959,ESS= 256, 01-10 02:12:12.211 BL= 960,ESS= 256, 01-10 02:12:12.229 BL= 961,ESS= 256, 01-10 02:12:12.248 BL= 962,ESS= 256, 
01-10 14:12:12.250574   548   884 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 14:12:12.250727   548   884 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 14:12:12.250741   548   884 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 14:12:12.250749   548   884 I MtkCam/Utils: onCreate#03 pc 000f5983  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+406)
01-10 14:12:12.250760   548   884 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 14:12:12.250768   548   884 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 14:12:12.250779   548   884 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 14:12:12.250787   548   884 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 14:12:12.250812   548   884 E MtkCam/IonHeap: PDC_tbl_2@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 14:12:12.250912   548   884 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 14:12:12.253176   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.263935   548   877 W aaa_state_mgr: [StateCommon::transitState] StateInit --> StateUninit
01-10 14:12:12.264227   548   877 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_AE,2),srIdxNum(1)
01-10 14:12:12.264352   548   877 I Drv/HWsync: Drv/HWsync[uninit] mAECyclePeriod(-1)
01-10 14:12:12.264416   548   877 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 14:12:12.264548   548   877 E MtkCam/SensorProviderService: (877)[doDisableSensor] NULL value! (doDisableSensor){#412:vendor/mediatek/proprietary/hardware/mtkcam/utils/sys/SensorProvider/SensorProviderService.cpp}
01-10 14:12:12.264676   548   877 E MtkCam/SensorProviderService: (877)[doDisableSensor] NULL value! (doDisableSensor){#412:vendor/mediatek/proprietary/hardware/mtkcam/utils/sys/SensorProvider/SensorProviderService.cpp}
01-10 14:12:12.268042   548   884 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 14:12:12.268174   548   884 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 14:12:12.268188   548   884 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 14:12:12.268199   548   884 I MtkCam/Utils: onCreate#03 pc 000f59bd  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+464)
01-10 14:12:12.268210   548   884 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 14:12:12.268218   548   884 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 14:12:12.268225   548   884 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 14:12:12.268233   548   884 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 14:12:12.268256   548   884 E MtkCam/IonHeap: PDC_tbl_3@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 14:12:12.268329   548   884 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 14:12:12.269131   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.284361   548   884 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 14:12:12.284555   548   884 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 14:12:12.284571   548   884 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 14:12:12.284581   548   884 I MtkCam/Utils: onCreate#03 pc 000f59f3  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+518)
01-10 14:12:12.284590   548   884 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 14:12:12.284600   548   884 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 14:12:12.284609   548   884 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 14:12:12.284617   548   884 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 14:12:12.284645   548   884 E MtkCam/IonHeap: PDC_tbl_4@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 14:12:12.284719   548   884 E isp_mgr_bnr: [PDC_tbl_1] ImageBufferHeap create fail (setBPCIBuf){#727:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/isp_mgr/isp_mgr_bnr.cpp}
01-10 14:12:12.285665   548   877 D AppTsf  : [TsfExit] TsfExit
01-10 14:12:12.285798   548   877 D AppTsf  : [~AppTsf] destructor
01-10 14:12:12.285818   548   877 D tsf_core: [~TsfCore] destructor
01-10 14:12:12.286912   548   877 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(1)
01-10 14:12:12.287034   548   877 I Drv/HWsync: Drv/HWsync[uninit] idx(0,remain_0),tg(0)
01-10 14:12:12.287050   548   877 W Drv/HWsync: Drv/HWsync[uninit] WARNING: wtginf, sindex(0x0),tg(0x0)
01-10 14:12:12.287059   548   877 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 14:12:12.287154   548   877 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11)
01-10 14:12:12.287224   548   877 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11), SENINF_TG1_PH_CNT(0x5)
01-10 14:12:12.290529   548   877 D ImgSensorDrv: [uninit][uninit] imgsensor_drv 0
01-10 14:12:12.290686   548   877 D SeninfDrvImp: [uninit][uninit]: 1 
01-10 14:12:12.290790   548   877 D SeninfDrvImp: [uninit][uninit]: 0, mfd(16) 
01-10 14:12:12.294613   548   877 I mtkcam-devicemgr: [detachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 14:12:11.980
01-10 14:12:12.294790   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.295085   527   729 W CameraProviderManager: Camera provider internal/0 says an unknown camera device@1.0/internal/0 now has torch status 1. Curious.
01-10 14:12:12.295266   548   877 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:1
01-10 14:12:12.295507   548   877 I mtkcam-dev1: 0[CameraDevice1Base::close] Del cameraId 0 - 0xefab0600, this - 0xefab0600
01-10 14:12:12.295592   548   877 I mtkcam-dev1: 0[CameraDevice1Base::close] -
01-10 14:12:12.295848   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:39
01-10 14:12:12.296303   394   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:39
01-10 14:12:12.296392   394   413 I libPerfService: perfUserUnregScn - handle:39
01-10 14:12:12.296484   527   729 I CameraProviderManager: Camera provider internal/0 ready with 1 camera devices
01-10 14:12:12.296605   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 14:12:12.297508   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:-1
01-10 14:12:12.297476   527   729 I CameraService: onDeviceStatusChanged: Status changed for cameraId=0, newStatus=1
01-10 14:12:12.297581   527   729 E CameraService: onDeviceStatusChanged: State transition to the same status 0x1 not allowed
01-10 14:12:12.297715   394   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:-1
01-10 14:12:12.297787   394   413 I libPerfService: perfUserUnregScn - handle:-1
01-10 14:12:12.297898   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:-1
01-10 14:12:12.310672   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.336639   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.343232   523   562 D AAL     : 01-10 02:12:12.267 BL= 963,ESS= 256, 01-10 02:12:12.286 BL= 964,ESS= 256, 01-10 02:12:12.305 BL= 965,ESS= 256, 01-10 02:12:12.324 BL= 966,ESS= 256, 01-10 02:12:12.343 BL= 967,ESS= 256, 
01-10 14:12:12.346163   521   521 E ActivityRecognitionHardware: activity_recognition HAL is deprecated. class_init is effectively a no-op
01-10 14:12:12.352275   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.378464   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.393057   521   521 W Zygote  : Class not found for preloading: android.icu.impl.number.Parse
01-10 14:12:12.394302   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.395020   401   401 W ccci_fsd(1): O: X://NA77_006, flag 0x700, ret 1
01-10 14:12:12.396024   401   401 W ccci_fsd(1): O: Y://NA77_006, flag 0x700, ret 1
01-10 14:12:12.407271   521   521 I zygote64: Thread[1,tid=521,Native,Thread*=0x74c30c3a00,peer=0x12c01fb8,"main"] recursive attempt to load library "/system/lib64/libmedia_jni.so"
01-10 14:12:12.407879   521   521 D MtpDeviceJNI: register_android_mtp_MtpDevice
01-10 14:12:12.409525   521   521 I zygote64: Thread[1,tid=521,Native,Thread*=0x74c30c3a00,peer=0x12c01fb8,"main"] recursive attempt to load library "/system/lib64/libmedia_jni.so"
01-10 14:12:12.410078   521   521 I zygote64: Thread[1,tid=521,Native,Thread*=0x74c30c3a00,peer=0x12c01fb8,"main"] recursive attempt to load library "/system/lib64/libmedia_jni.so"
01-10 14:12:12.420509   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.429479   521   521 D MtkSettingsProviderExt: Global moveToSecure
01-10 14:12:12.431557   521   521 D MtkSettingsProviderExt: Secure moveToGlobal
01-10 14:12:12.433123   521   521 D MtkSettingsProviderExt: System moveToSecure
01-10 14:12:12.433398   521   521 D MtkSettingsProviderExt: System moveToGlobal
01-10 14:12:12.434088   521   521 D MtkSettingsProviderExt: putInPublicSettings
01-10 14:12:12.436136   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.437673   523   562 D AAL     : 01-10 02:12:12.367 BL= 968,ESS= 256, 01-10 02:12:12.381 BL= 969,ESS= 256, 01-10 02:12:12.399 BL= 970,ESS= 256, 01-10 02:12:12.418 BL= 971,ESS= 256, 01-10 02:12:12.437 BL= 972,ESS= 256, 
01-10 14:12:12.462368   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.477831   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.504381   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.510663   806   806 D ccci_lib: read info:[modem num]:1
01-10 14:12:12.510663   806   806 D ccci_lib: [modem en]:1-0-0-0-0
01-10 14:12:12.510663   806   806 D ccci_lib: [MTK_ECCCI_C2K]:1
01-10 14:12:12.510663   806   806 D ccci_lib: [ccci_drv_ver]:V2
01-10 14:12:12.510663   806   806 D ccci_lib: total:71
01-10 14:12:12.510839   806   806 D ccci_lib: parse_info name:modem num
01-10 14:12:12.510883   806   806 D EMDLOGGER1: initUSBPortMappingFile get current port is 1
01-10 14:12:12.511035   806   806 D EMDLOGGER1: Get auto start mode: 2
01-10 14:12:12.511059   806   806 D EMDLOGGER1: getSavedLoggingMode(): mode = 2
01-10 14:12:12.520109   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.531943   523   562 D AAL     : 01-10 02:12:12.456 BL= 973,ESS= 256, 01-10 02:12:12.475 BL= 974,ESS= 256, 01-10 02:12:12.493 BL= 975,ESS= 256, 01-10 02:12:12.512 BL= 976,ESS= 256, 01-10 02:12:12.531 BL= 977,ESS= 256, 
01-10 14:12:12.542683   891   891 I [epdg_wo]: [DMN] starting WI-FI OFFLOAD DAEMON
01-10 14:12:12.544729   891   891 I [epdg_wo]: [IKE] IKEv2 Daemon stopped
01-10 14:12:12.544818   891   891 I [epdg_wo]: [NID] create post_routing chain
01-10 14:12:12.544893   891   891 I [epdg_wo]: [NID] netutils supported
01-10 14:12:12.546421   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.562246   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.568493   806   806 D EMDLOGGER1: MAL_Init
01-10 14:12:12.568958   521   521 I Zygote  : ...preloaded 4715 classes in 983ms.
01-10 14:12:12.569171   521   521 I zygote64: VMRuntime.preloadDexCaches starting
01-10 14:12:12.571228   806   806 D ccci_lib: mmap on /dev/ccci_ccb_dhl(5) for addr=0x7c000000, len=2097152
01-10 14:12:12.575351   806   806 D ccci_lib: ccb_info_len=20
01-10 14:12:12.576685   806   806 D ccci_lib: new ccb_ctrl mmap on /dev/ccci_ccb_ctrl(6) for addr=0x80018000, len=4096
01-10 14:12:12.579225   806   806 D ccci_lib: register user57 md0: base=0x71cdbdf000, len=2097152, ctrl_base=0x71ce864000, ctrl_offset=0
01-10 14:12:12.579343   806   806 D ccci_lib: register user57 md0 DL0, pattern=ddbbccaa, dl_page=0x71cdbdf000
01-10 14:12:12.579361   806   806 D ccci_lib: register user57 md0 UL0, pattern=ddbbccaa, ul_page=0x71cdbe7000
01-10 14:12:12.579375   806   806 D ccci_lib: register user57 md0 DL1, pattern=ddbbccaa, dl_page=0x71cdbef000
01-10 14:12:12.579476   806   806 D ccci_lib: register user57 md0 UL1, pattern=ddbbccaa, ul_page=0x71cdc0d000
01-10 14:12:12.579494   806   806 D ccci_lib: register user57 md0 DL2, pattern=ddbbccaa, dl_page=0x71cdc0d080
01-10 14:12:12.579507   806   806 D ccci_lib: register user57 md0 UL2, pattern=ddbbccaa, ul_page=0x71cdc16080
01-10 14:12:12.579520   806   806 D ccci_lib: register user57 md0 DL3, pattern=ddbbccaa, dl_page=0x71cdc1e080
01-10 14:12:12.579533   806   806 D ccci_lib: register user57 md0 UL3, pattern=ddbbccaa, ul_page=0x71cdc26080
01-10 14:12:12.579545   806   806 D ccci_lib: register user57 md0 DL4, pattern=ddbbccaa, dl_page=0x71cdc26100
01-10 14:12:12.579557   806   806 D ccci_lib: register user57 md0 UL4, pattern=ddbbccaa, ul_page=0x71cdc2e100
01-10 14:12:12.579570   806   806 D ccci_lib: register user57 md0 DL5, pattern=ddbbccaa, dl_page=0x71cdc2e180
01-10 14:12:12.579581   806   806 D ccci_lib: register user57 md0 UL5, pattern=ddbbccaa, ul_page=0x71cdc4e180
01-10 14:12:12.579593   806   806 D ccci_lib: register user57 md0 DL6, pattern=ddbbccaa, dl_page=0x71cdc4e200
01-10 14:12:12.579605   806   806 D ccci_lib: register user57 md0 UL6, pattern=ddbbccaa, ul_page=0x71cdc4e280
01-10 14:12:12.579617   806   806 D ccci_lib: register user57 md0 DL7, pattern=ddbbccaa, dl_page=0x71cdc4e300
01-10 14:12:12.579629   806   806 D ccci_lib: register user57 md0 UL7, pattern=ddbbccaa, ul_page=0x71cdc4e380
01-10 14:12:12.579642   806   806 D ccci_lib: register user57 md0 DL8, pattern=ddbbccaa, dl_page=0x71cdc4e400
01-10 14:12:12.579653   806   806 D ccci_lib: register user57 md0 UL8, pattern=ddbbccaa, ul_page=0x71cdc4e480
01-10 14:12:12.579666   806   806 D ccci_lib: register user57 md0 DL9, pattern=ddbbccaa, dl_page=0x71cdc4e500
01-10 14:12:12.579678   806   806 D ccci_lib: register user57 md0 UL9, pattern=ddbbccaa, ul_page=0x71cdc4e580
01-10 14:12:12.579690   806   806 D ccci_lib: register user57 md0 DL10, pattern=ddbbccaa, dl_page=0x71cdc4e600
01-10 14:12:12.579702   806   806 D ccci_lib: register user57 md0 UL10, pattern=ddbbccaa, ul_page=0x71cdc4e680
01-10 14:12:12.579714   806   806 D ccci_lib: register user57 md0 DL11, pattern=ddbbccaa, dl_page=0x71cdc4e700
01-10 14:12:12.579727   806   806 D ccci_lib: register user57 md0 UL11, pattern=ddbbccaa, ul_page=0x71cdc4e780
01-10 14:12:12.579764   806   806 D ccci_lib: register user57 md0 DL12, pattern=ddbbccaa, dl_page=0x71cdc4e800
01-10 14:12:12.579777   806   806 D ccci_lib: register user57 md0 UL12, pattern=ddbbccaa, ul_page=0x71cdc4e880
01-10 14:12:12.579790   806   806 D ccci_lib: register user57 md0 DL13, pattern=ddbbccaa, dl_page=0x71cdc4e900
01-10 14:12:12.579802   806   806 D ccci_lib: register user57 md0 UL13, pattern=ddbbccaa, ul_page=0x71cdc4e980
01-10 14:12:12.579814   806   806 D ccci_lib: register user57 md0 DL14, pattern=ddbbccaa, dl_page=0x71cdc4ea00
01-10 14:12:12.579826   806   806 D ccci_lib: register user57 md0 UL14, pattern=ddbbccaa, ul_page=0x71cdc4ea80
01-10 14:12:12.579838   806   806 D ccci_lib: register user57 md0 DL15, pattern=ddbbccaa, dl_page=0x71cdc4eb00
01-10 14:12:12.579850   806   806 D ccci_lib: register user57 md0 UL15, pattern=ddbbccaa, ul_page=0x71cdc4eb80
01-10 14:12:12.579862   806   806 D ccci_lib: register user57 md0 DL16, pattern=ddbbccaa, dl_page=0x71cdc4ec00
01-10 14:12:12.579874   806   806 D ccci_lib: register user57 md0 UL16, pattern=ddbbccaa, ul_page=0x71cdc4ec80
01-10 14:12:12.579886   806   806 D ccci_lib: register user57 md0 DL17, pattern=ddbbccaa, dl_page=0x71cdc4ed00
01-10 14:12:12.579898   806   806 D ccci_lib: register user57 md0 UL17, pattern=ddbbccaa, ul_page=0x71cdc4ef80
01-10 14:12:12.579925   806   806 I EMDLOGGER1: MAL_ccb_Init: CCB is ready
01-10 14:12:12.582471   806   806 D ccci_lib: mmap on /dev/ccci_raw_dhl(7) for addr=0x7c200000, len=20971520
01-10 14:12:12.584092   806   908 I EMDLOGGER1: mdlog_ccb_ctrl_reader_thread started
01-10 14:12:12.584269   806   806 D ccci_lib: write done of user57 buffer0: OK, i=1 write=1, alloc=1, free=0, len=16
01-10 14:12:12.584548   806   806 D ccci_lib: write done of user57 buffer0: OK, i=2 write=2, alloc=2, free=1, len=12
01-10 14:12:12.586417   806   806 D ccci_lib: write done of user57 buffer0: OK, i=3 write=3, alloc=3, free=2, len=16
01-10 14:12:12.586523   806   806 D EMDLOGGER1: Main: getSavedGPSLocation support_gps_location: 1
01-10 14:12:12.586607   806   806 D EMDLOGGER1: Not set property: persist.mtklog.mdlog.mdsilrbt
01-10 14:12:12.587472   806   909 D EMDLOGGER1: runListener
01-10 14:12:12.587609   806   806 D EMDLOGGER1: Success to setup socket local server
01-10 14:12:12.587631   806   806 I EMDLOGGER1: MDL: START Logging, mode=2 Gear Id when Reset=0
01-10 14:12:12.587643   806   806 D EMDLOGGER1: startMDLogging: Create starter thread
01-10 14:12:12.587655   806   806 D EMDLOGGER1: startLoggingThreadFun: curr_mode=0, new_mode=2
01-10 14:12:12.587664   806   806 I EMDLOGGER1: ------>Init SD logging mode<------
01-10 14:12:12.587758   806   806 D EMDLOGGER1: Init MDEngine: OK
01-10 14:12:12.587806   806   806 D EMDLOGGER1: MAL_ccb_QueryMDInfo : Send MAL_QueryMDInfo
01-10 14:12:12.587853   806   806 D ccci_lib: write done of user57 buffer0: OK, i=4 write=4, alloc=4, free=3, len=12
01-10 14:12:12.588659   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.591659   806   806 D EMDLOGGER1: Init LogWritter: OK
01-10 14:12:12.591809   806   806 D EMDLOGGER1: OKOKOK >Init SD logging mode< OKOKOK
01-10 14:12:12.591826   806   806 D EMDLOGGER1: MDCommEngine.start: mode=2
01-10 14:12:12.591880   806   806 D EMDLOGGER1: LogWriter: Logging is started
01-10 14:12:12.597954   806   806 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 14:12:12.598055   806   806 D EMDLOGGER1: ccb_ioctl: fd 5, req 80044322, ret 0
01-10 14:12:12.598067   806   806 I EMDLOGGER1: MAL_ccb_GetModemSuffix: suffix 1_ulwctg_n
01-10 14:12:12.598258   806   806 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 14:12:12.598305   806   806 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 14:12:12.598349   806   806 D ccci_lib: write done of user57 buffer0: OK, i=5 write=5, alloc=5, free=4, len=12
01-10 14:12:12.599232   806   806 I EMDLOGGER1: MAL_ccb_QueryMDTime: MD time is 27049
01-10 14:12:12.599970   806   806 I EMDLOGGER1: Creating compressor thread
01-10 14:12:12.600503   806   806 D EMDLOGGER1: Check SD card status
01-10 14:12:12.601387   806   918 I EMDLOGGER1: thrLogBufferWriter started
01-10 14:12:12.604451   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.606039   806   806 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 14:12:12.606189   806   806 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 14:12:12.606234   806   806 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 14:12:12.606262   806   806 E EMDLOGGER1: Failed to get the SD card status: /mnt/sdcard, errno=2
01-10 14:12:12.606273   806   806 D EMDLOGGER1: Failed to init logwriter: SD card status can't be got or is full.
01-10 14:12:12.606282   806   806 D EMDLOGGER1: Init LogWriter: SD card is not ready, record log on Nand
01-10 14:12:12.606289   806   806 D EMDLOGGER1: Create log file on Nand
01-10 14:12:12.622660   806   806 D EMDLOGGER1: Open log file /data/mdlog/bootupLog/mdlog1/MDLog1_2020_0110_141212_data.muxz.tmp.
01-10 14:12:12.622770   806   806 D ccci_lib: write done of user57 buffer0: OK, i=6 write=6, alloc=6, free=5, len=12
01-10 14:12:12.623028   806   806 D EMDLOGGER1: MALCTL_NOTIFY_AP_LOG_FILE_CREATE : /data/mdlog/bootupLog/mdlog1/MDLog1_2020_0110_141212_data.muxz.tmp
01-10 14:12:12.623667   806   806 D EMDLOGGER1: MAL_ccb_OnLoggingStart mode = 2
01-10 14:12:12.623718   806   806 D EMDLOGGER1: MAL_ccb_OnLoggingStart: Send SPLM_A2M_RESET_SPLM_STATE. mdlog_logging_mode = 1
01-10 14:12:12.623752   806   806 D ccci_lib: write done of user57 buffer0: OK, i=7 write=7, alloc=7, free=6, len=16
01-10 14:12:12.624022   806   806 D ccci_lib: write done of user57 buffer0: OK, i=8 write=8, alloc=8, free=7, len=16
01-10 14:12:12.624449   806   926 I EMDLOGGER1: Started Waiting SD card thread.
01-10 14:12:12.624540   806   926 D EMDLOGGER1: Check SD card status
01-10 14:12:12.625225   806   806 D EMDLOGGER1: MAL_ccb_OnLoggingStart: Send SPLM_A2M_AP_LOGGING_IS_READY, mdlog_logging_mode = 1
01-10 14:12:12.625300   806   806 D ccci_lib: write done of user57 buffer0: OK, i=9 write=9, alloc=9, free=8, len=16
01-10 14:12:12.627114   523   562 D AAL     : 01-10 02:12:12.550 BL= 978,ESS= 256, 01-10 02:12:12.569 BL= 979,ESS= 256, 01-10 02:12:12.588 BL= 980,ESS= 256, 01-10 02:12:12.607 BL= 981,ESS= 256, 01-10 02:12:12.627 BL= 982,ESS= 256, 
01-10 14:12:12.627572   806   928 I EMDLOGGER1: Modem log writer thread started
01-10 14:12:12.627781   806   927 I EMDLOGGER1: Modem log reader thread started
01-10 14:12:12.628530   806   806 D ccci_lib: write done of user57 buffer2: OK, i=1 write=1, alloc=1, free=0, len=1016
01-10 14:12:12.628633   806   806 D ccci_lib: write done of user57 buffer2: OK, i=2 write=2, alloc=2, free=0, len=8
01-10 14:12:12.628658   806   806 D ccci_lib: write done of user57 buffer2: OK, i=3 write=3, alloc=3, free=0, len=1016
01-10 14:12:12.628706   806   806 D ccci_lib: write done of user57 buffer2: OK, i=4 write=4, alloc=4, free=0, len=8
01-10 14:12:12.628732   806   806 D ccci_lib: write done of user57 buffer2: OK, i=5 write=5, alloc=5, free=0, len=1016
01-10 14:12:12.628848   806   806 D ccci_lib: write done of user57 buffer2: OK, i=6 write=6, alloc=6, free=0, len=8
01-10 14:12:12.628920   806   806 D ccci_lib: write done of user57 buffer2: OK, i=7 write=7, alloc=7, free=0, len=1016
01-10 14:12:12.628972   806   806 D ccci_lib: write done of user57 buffer2: OK, i=8 write=8, alloc=8, free=0, len=8
01-10 14:12:12.628998   806   806 D ccci_lib: write done of user57 buffer2: OK, i=9 write=9, alloc=9, free=0, len=1016
01-10 14:12:12.629019   806   806 D ccci_lib: write done of user57 buffer2: OK, i=10 write=10, alloc=10, free=1, len=8
01-10 14:12:12.629068   806   806 D ccci_lib: write done of user57 buffer2: OK, i=11 write=11, alloc=11, free=1, len=1016
01-10 14:12:12.629090   806   806 D ccci_lib: write done of user57 buffer2: OK, i=12 write=12, alloc=12, free=1, len=8
01-10 14:12:12.629141   806   806 D ccci_lib: write done of user57 buffer2: OK, i=13 write=13, alloc=13, free=1, len=1016
01-10 14:12:12.629189   806   806 D ccci_lib: write done of user57 buffer2: OK, i=14 write=14, alloc=14, free=1, len=8
01-10 14:12:12.629187   806   929 I EMDLOGGER1: Comm monitor thread started!
01-10 14:12:12.629305   806   806 D ccci_lib: write done of user57 buffer2: OK, i=15 write=15, alloc=15, free=2, len=1016
01-10 14:12:12.629373   806   806 D ccci_lib: write done of user57 buffer2: OK, i=16 write=16, alloc=16, free=2, len=8
01-10 14:12:12.629400   806   806 D ccci_lib: write done of user57 buffer2: OK, i=17 write=17, alloc=17, free=2, len=1016
01-10 14:12:12.629422   806   806 D ccci_lib: write done of user57 buffer2: OK, i=18 write=18, alloc=18, free=2, len=8
01-10 14:12:12.629478   806   806 D ccci_lib: write done of user57 buffer2: OK, i=19 write=19, alloc=19, free=2, len=410
01-10 14:12:12.629608   806   806 E EMDLOGGER1: filter size: 9634 Bytes
01-10 14:12:12.629690   806   806 E EMDLOGGER1: filter modified time:2009-01-01 07:00:00
01-10 14:12:12.629701   806   806 E EMDLOGGER1: filter path:/system/vendor/firmware/catcher_filter_1_ulwctg_n.bin
01-10 14:12:12.629712   806   806 D EMDLOGGER1: passFilter: filter successfully sent
01-10 14:12:12.629957   806   930 I EMDLOGGER1: Detect filter thread started!
01-10 14:12:12.630155   806   806 I EMDLOGGER1: create log recycle thread for data folder log after MAL_start pass
01-10 14:12:12.630331   806   806 D EMDLOGGER1: Start MDEngine: done. mode = 2
01-10 14:12:12.630383   806   806 I EMDLOGGER1: Success to start logging in SD Mode!
01-10 14:12:12.630394   806   806 D EMDLOGGER1: startLoggingThread result is 1
01-10 14:12:12.630407   806   806 D EMDLOGGER1: startLoggingThread: inform auto start done
01-10 14:12:12.630450   806   806 E EMDLOGGER1: System is not ready then can not auto Start intent.
01-10 14:12:12.630490   806   806 D EMDLOGGER1: Normal boot 1
01-10 14:12:12.630562   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.630639   806   806 D EMDLOGGER1: Open servFifoFd FIFO -1
01-10 14:12:12.631692   806   926 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 14:12:12.631852   806   926 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 14:12:12.631947   806   926 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 14:12:12.646594   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.672353   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.681257   376   865 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Fail to connect . retry count: 2
01-10 14:12:12.681701   376   865 D VT HIDL : [IVT] isIMCBrun : True
01-10 14:12:12.684006   521   521 I zygote64: VMRuntime.preloadDexCaches strings total=360436 before=13118 after=13118
01-10 14:12:12.684118   521   521 I zygote64: VMRuntime.preloadDexCaches types total=30514 before=6502 after=6516
01-10 14:12:12.684136   521   521 I zygote64: VMRuntime.preloadDexCaches fields total=142505 before=5834 after=5892
01-10 14:12:12.684151   521   521 I zygote64: VMRuntime.preloadDexCaches methods total=267782 before=12265 after=12328
01-10 14:12:12.684162   521   521 I zygote64: VMRuntime.preloadDexCaches finished
01-10 14:12:12.689018   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.714026   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.720416   523   562 D AAL     : 01-10 02:12:12.644 BL= 983,ESS= 256, 01-10 02:12:12.663 BL= 984,ESS= 256, 01-10 02:12:12.682 BL= 985,ESS= 256, 01-10 02:12:12.701 BL= 986,ESS= 256, 01-10 02:12:12.720 BL= 987,ESS= 256, 
01-10 14:12:12.729960   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.755980   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.771974   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.797655   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.813935   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.814901   523   562 D AAL     : 01-10 02:12:12.739 BL= 988,ESS= 256, 01-10 02:12:12.758 BL= 989,ESS= 256, 01-10 02:12:12.776 BL= 990,ESS= 256, 01-10 02:12:12.795 BL= 991,ESS= 256, 01-10 02:12:12.814 BL= 992,ESS= 256, 
01-10 14:12:12.839756   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.855816   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.881861   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.890413   521   521 I Zygote  : Preloading resources...
01-10 14:12:12.898488   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.907371   544   637 I ServiceManager: Waiting for service package_native...
01-10 14:12:12.908854   523   562 D AAL     : 01-10 02:12:12.833 BL= 993,ESS= 256, 01-10 02:12:12.852 BL= 994,ESS= 256, 01-10 02:12:12.871 BL= 995,ESS= 256, 01-10 02:12:12.890 BL= 996,ESS= 256, 01-10 02:12:12.908 BL= 997,ESS= 256, 
01-10 14:12:12.917970   521   521 W Resources: Preloaded drawable resource #0x1080264 (android:drawable/dialog_background_material) that varies with configuration!!
01-10 14:12:12.923716   402   402 E ccci_fsd(3): fail to open /dev/ccci3_fs: 2
01-10 14:12:12.924033   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.940187   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.942717   891   891 I [epdg_wo]: [C3I] wo_ccci_open: status:MD ready
01-10 14:12:12.942934   891   891 I [epdg_wo]: [WOA] Open /dev/ccci_woa successfully (fd:5); wait adpt ready...
01-10 14:12:12.943039   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=1](13)
01-10 14:12:12.949239   521   521 I Zygote  : ...preloaded 64 resources in 58ms.
01-10 14:12:12.955330   521   521 W Resources: Preloaded color resource #0x1060053 (android:color/btn_default_material_dark) that varies with configuration!!
01-10 14:12:12.957025   521   521 I Zygote  : ...preloaded 41 resources in 6ms.
01-10 14:12:12.965825   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:12.981824   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:12.991347   548   881 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 14:12:13.002021   521   521 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 14:12:13.003176   523   562 D AAL     : 01-10 02:12:12.927 BL= 998,ESS= 256, 01-10 02:12:12.946 BL= 999,ESS= 256, 01-10 02:12:12.965 BL=1000,ESS= 256, 01-10 02:12:12.984 BL=1001,ESS= 256, 01-10 02:12:13.003 BL=1002,ESS= 256, 
01-10 14:12:13.006586   521   521 D libEGL  : loaded /vendor/lib64/egl/libGLES_mali.so
01-10 14:12:13.007959   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.024097   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.034912   398   421 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=23.87 dur=1005.25 max=46.65 min=39.06
01-10 14:12:13.046168   521   521 I Zygote  : Preloading shared libraries...
01-10 14:12:13.049911   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.065987   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.068077   521   521 I Zygote  : Uninstalled ICU cache reference pinning...
01-10 14:12:13.070068   521   521 I Zygote  : Installed AndroidKeyStoreProvider in 2ms.
01-10 14:12:13.081863   521   521 I Zygote  : Warmed up JCA providers in 12ms.
01-10 14:12:13.081942   521   521 D Zygote  : end preload
01-10 14:12:13.091970   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.097513   523   562 D AAL     : 01-10 02:12:13.021 BL=1003,ESS= 256, 01-10 02:12:13.040 BL=1004,ESS= 256, 01-10 02:12:13.059 BL=1005,ESS= 256, 01-10 02:12:13.078 BL=1006,ESS= 256, 01-10 02:12:13.097 BL=1007,ESS= 256, 
01-10 14:12:13.098937   521   521 I zygote64: Explicit concurrent copying GC freed 16171(799KB) AllocSpace objects, 2(56KB) LOS objects, 75% free, 1501KB/5MB, paused 40us total 16.693ms
01-10 14:12:13.107985   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.113484   521   521 I zygote64: Explicit concurrent copying GC freed 2260(112KB) AllocSpace objects, 0(0B) LOS objects, 75% free, 1420KB/5MB, paused 37us total 12.961ms
01-10 14:12:13.114571   521   521 I zygote64: Global filter of size 170 installed
01-10 14:12:13.133704   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.149851   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.158055   521   521 I Zygote  : System server process 943 has been created
01-10 14:12:13.161376   521   521 I Zygote  : Accepting command socket connections
01-10 14:12:13.163641   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:24.123470,dur:1036.34,max:57.17,min:36.98
01-10 14:12:13.175780   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.178143   943   943 I Zygote  : Process: zygote socket zygote_secondary opened, supported ABIS: armeabi-v7a,armeabi
01-10 14:12:13.181919   376   865 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Fail to connect . retry count: 3
01-10 14:12:13.182322   376   865 D VT HIDL : [IVT] isIMCBrun : True
01-10 14:12:13.190651   548   882 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:13.186000   548   548 W HwBinder:548_2: type=1400 audit(0.0:38): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:13.192038   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.192498   523   562 D AAL     : 01-10 02:12:13.116 BL=1008,ESS= 256, 01-10 02:12:13.135 BL=1009,ESS= 256, 01-10 02:12:13.153 BL=1010,ESS= 256, 01-10 02:12:13.172 BL=1011,ESS= 256, 01-10 02:12:13.192 BL=1012,ESS= 256, 
01-10 14:12:13.217708   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.223366   925   925 D         : [SYSENV]sysenv_get_with_area():429 , get env name=msim_config
01-10 14:12:13.223515   925   925 D         : [SYSENV]get_env_info():311 , initialize
01-10 14:12:13.223724   925   925 D         : [SYSENV]get_partition_count():107 , get_partition_count ret ptr: 38
01-10 14:12:13.223873   925   925 D         : [SYSENV]get_partition_path():158 , partition path = /dev/block/mmcblk0p3
01-10 14:12:13.223904   925   925 E         : [SYSENV]get_env_info():321 , env_buffer[1] : 40e45780
01-10 14:12:13.228242   925   925 D         : [SYSENV]read_env_area():244 , read 16384 data from 24000 to 40e45780
01-10 14:12:13.228554   925   925 W         : [SYSENV]get_env_info():352 , Incorrect sig, probably sysenv is still empty
01-10 14:12:13.234548   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.259710   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.275966   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.284545   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:13.287074   523   562 D AAL     : 01-10 02:12:13.210 BL=1013,ESS= 256, 01-10 02:12:13.229 BL=1014,ESS= 256, 01-10 02:12:13.248 BL=1015,ESS= 256, 01-10 02:12:13.267 BL=1016,ESS= 256, 01-10 02:12:13.287 BL=1017,ESS= 256, 
01-10 14:12:13.301577   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.305391   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:13.307993   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:13.318145   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.318453   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:13.343455   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.359968   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.367594   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:13.374757   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:13.375951   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:13.375951   812   812 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@0#5493
01-10 14:12:13.375951   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=24, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:13.375951   812   812 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@0#5518
01-10 14:12:13.375951   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:13.376263   811   853 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 14:12:13.376320   808   843 I VoLTE REG: rcs_feature = 0 (module/volte//volte_stack/src/reg/reg.c:3230)
01-10 14:12:13.376393   811   853 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 14:12:13.376403   808   843 I VoLTE REG: rcs_state = 0 (module/volte//volte_stack/src/reg/reg.c:3233)
01-10 14:12:13.376472   811   853 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 14:12:13.378914   812   812 I VoLTE IMCB-2: {{{{[process_msg] msg_id=101602(0x00018CE2), dst=VT1[7], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:13.378914   812   812 I VoLTE IMCB-2: connection status change for module 7 as error_num 0 imcb_imcb_comm_error_handler()@0#797
01-10 14:12:13.378914   812   812 I VoLTE IMCB-2: ENTER imcb_send_multiple_imc_imsvt_connect_req()@0#4072
01-10 14:12:13.378914   812   812 I VoLTE IMCB-2: CHECK: is_connect 0 imcb_send_imc_imsvt_connect_req()@0#4060
01-10 14:12:13.378914   812   812 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:13.378914   812   812 I VoLTE IMCB-2: CHECK: is_connect 0 imcb_send_imc_imsvt_connect_req()@1#4060
01-10 14:12:13.378914   812   812 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248}}}}
01-10 14:12:13.379578   812   812 I VoLTE IMCB-2: {{{{CHECK: is_connect 0 imcb_send_imc_imsvt_connect_req()@2#4060
01-10 14:12:13.379578   812   812 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 14:12:13.379578   812   812 I VoLTE IMCB-2: ENTER imcb_send_multiple_imc_imsvt_connect_req()@0#4072
01-10 14:12:13.379578   812   812 I VoLTE IMCB-2: CHECK: is_connect 1 imcb_send_imc_imsvt_connect_req()@0#4060
01-10 14:12:13.379578   812   812 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:13.379578   812   812 I VoLTE IMCB-2: CHECK: is_connect 1 imcb_send_imc_imsvt_connect_req()@1#4060
01-10 14:12:13.379578   812   812 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248}}}}
01-10 14:12:13.379745   812   812 I VoLTE IMCB: {{{{CHECK: is_connect 1 imcb_send_imc_imsvt_connect_req()@2#4060
01-10 14:12:13.379745   812   812 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 14:12:13.379745   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:13.380256   523   562 D AAL     : 01-10 02:12:13.304 BL=1018,ESS= 256, 01-10 02:12:13.323 BL=1017,ESS= 256, 01-10 02:12:13.342 BL=1016,ESS= 256, 01-10 02:12:13.361 BL=1017,ESS= 256, 01-10 02:12:13.380 BL=1018,ESS= 256, 
01-10 14:12:13.382952   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:13.383921   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:13.384660   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100038(0x000186C6), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:13.384660   812   812 I VoLTE IMCB: ENTER imcb_imc_vt_cap_query_ind_handler()@0#5407
01-10 14:12:13.384660   812   812 I VoLTE IMCB: ENTER imcb_send_imsvt_get_cap_req()@0#4089
01-10 14:12:13.384660   812   812 I VoLTE IMCB: Pure Mesage Send dest=VT1[7], msg_id=101505(0x00018C81), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:13.384660   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:13.385080   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.385546   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100038(0x000186C6), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 14:12:13.385546   812   812 I VoLTE IMCB: ENTER imcb_imc_vt_cap_query_ind_handler()@1#5407
01-10 14:12:13.385546   812   812 I VoLTE IMCB: ENTER imcb_send_imsvt_get_cap_req()@1#4089
01-10 14:12:13.385546   812   812 I VoLTE IMCB: Pure Mesage Send dest=VT1[7], msg_id=101505(0x00018C81), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 14:12:13.385546   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:13.401755   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.427035   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.443805   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.468866   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.471498   555   580 D agps    : [agps][n][RIL] rilp_init_handler = 0
01-10 14:12:13.471604   555   580 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_RE_INIT_RPC
01-10 14:12:13.474549   523   562 D AAL     : 01-10 02:12:13.399 BL=1019,ESS= 256, 01-10 02:12:13.417 BL=1018,ESS= 256, 01-10 02:12:13.436 BL=1017,ESS= 256, 01-10 02:12:13.455 BL=1016,ESS= 256, 01-10 02:12:13.474 BL=1015,ESS= 256, 
01-10 14:12:13.485747   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.492689   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:13.493311   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100109(0x0001870D), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:13.493311   812   812 I VoLTE IMCB: ENTER imcb_imc_ussd_urc_status_ind_handler()@0#5365
01-10 14:12:13.493311   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=16002(0x00003E82), len=8, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:13.493311   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:13.493422   811   856 E VoLTE Service: Error message type, type = 16002, len = 8 (module/volte//volte_ua/src/service/service.c:1118)
01-10 14:12:13.510592   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.520123   361   367 D tkcore-teec: New pos: 68659
01-10 14:12:13.520485   361   367 D tkcore-teec: Logging started
01-10 14:12:13.518000   361   361 W teed    : type=1400 audit(0.0:39): avc: denied { write } for name="/" dev="dm-2" ino=2 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:13.527455   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.552362   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.568847   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.568901   523   562 D AAL     : 01-10 02:12:13.493 BL=1014,ESS= 256, 01-10 02:12:13.512 BL=1013,ESS= 256, 01-10 02:12:13.531 BL=1012,ESS= 256, 01-10 02:12:13.549 BL=1011,ESS= 256, 01-10 02:12:13.568 BL=1010,ESS= 256, 
01-10 14:12:13.588745   806   909 E EMDLOGGER1: select timeout
01-10 14:12:13.594338   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.610950   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.614600   555   627 D agps    : [agps] WARNING: [CP] cp2_fd_1_req_sim_num_timeout
01-10 14:12:13.615340   555   580 D agps    : [agps][n][CP] [MD_1] write  sim_info_req  gsm_disabled=[0] umts_disabled=[0] lte_disabled=[0] lppe_enable=[1] lppe_network_location_disable=[0] reject_non911_nilr_enable=[0] battery_percentage=[100]
01-10 14:12:13.618368   555   580 D agps    : [agps][n][CP] [MD_1] read  sim_info_rsp  sim_number=2 md_type=0 (0=fdd, 1=tdd) ecid=1 otdoa=0 band_num=11
01-10 14:12:13.618457   555   580 D agps    : [agps][n][CP] i=0  support_band=1
01-10 14:12:13.618504   555   580 D agps    : [agps][n][CP] i=1  support_band=3
01-10 14:12:13.618546   555   580 D agps    : [agps][n][CP] i=2  support_band=5
01-10 14:12:13.618587   555   580 D agps    : [agps][n][CP] i=3  support_band=7
01-10 14:12:13.618628   555   580 D agps    : [agps][n][CP] i=4  support_band=8
01-10 14:12:13.618670   555   580 D agps    : [agps][n][CP] i=5  support_band=20
01-10 14:12:13.618712   555   580 D agps    : [agps][n][CP] i=6  support_band=28
01-10 14:12:13.618754   555   580 D agps    : [agps][n][CP] i=7  support_band=38
01-10 14:12:13.618796   555   580 D agps    : [agps][n][CP] i=8  support_band=39
01-10 14:12:13.618838   555   580 D agps    : [agps][n][CP] i=9  support_band=40
01-10 14:12:13.618880   555   580 D agps    : [agps][n][CP] i=10  support_band=41
01-10 14:12:13.618968   555   580 D agps    : [agps][n][CP] index=[0]  support_lpp_otdoa_nbr_cell_list=[0] support_supl_flow_ind=[1] support_location_settings=[1] support_cp_lppe=[0]
01-10 14:12:13.619706   555   580 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[0]
01-10 14:12:13.619706   555   604 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_LBS_CAPABILITY_UPDATE_REQ]
01-10 14:12:13.619924   555   604 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_PEER_EUTRAN_BAND_UPDATE_CNF]
01-10 14:12:13.620125   555   580 D agps    : [agps][n][AGPS] [MNL] write  agps_settings_sync  sib8_16=[1], gps=[1] glonass=[1] beidou=[1] galileo=[1] agps=[1] aglonass=[1] abeidou=[0] agalileo=[0]
01-10 14:12:13.620781   520   691 D MNLD    : agps_settings_sync: agps setting, sib8_16_enable = 1, gps_sat_en = 1, glonass_sat_en = 1,         beidou_sat_en = 1, galileo_sat_en = 1, a_glonass_sat_en = 1,         a_gps_satellite_enable = 1, a_beidou_satellite_enable = 0, a_galileo_satellite_enable = 0, lppe_enable=1
01-10 14:12:13.622050   520   691 D MNLD    : agps_settings_sync: mnl stop, mnld send pmtk764 to agpsd
01-10 14:12:13.622171   555   580 D agps    : [agps][n][AGPS] [MNL] read  agps_settings_ack  gps=[1] glonass=[1] beidou=[1] galileo=[0]
01-10 14:12:13.622234   520   691 D MNLD    : get_agnss_capability: MNLD_PMTK764: $PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 14:12:13.622234   520   691 D MNLD    : , agps_cap:1, aglonass_cap:1, abeidou_cap:0, agalileo_cap:0, lppe_support:1
01-10 14:12:13.623082   555   580 D agps    : [agps][n][AGPS] [MNL] read  pmtk=[$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 14:12:13.623082   555   580 D agps    : ]
01-10 14:12:13.623178   555   580 D agps    : [agps][n][AGPS] gnss_num=2
01-10 14:12:13.623322   555   580 D agps    : [agps][n][CP] [MD_1] write  pmtk [$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 14:12:13.623322   555   580 D agps    : ]
01-10 14:12:13.636385   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.653139   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.663189   523   562 D AAL     : 01-10 02:12:13.587 BL=1009,ESS= 256, 01-10 02:12:13.606 BL=1008,ESS= 256, 01-10 02:12:13.625 BL=1007,ESS= 256, 01-10 02:12:13.644 BL=1006,ESS= 256, 01-10 02:12:13.663 BL=1005,ESS= 256, 
01-10 14:12:13.678200   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.682732   376   865 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Fail to connect . retry count: 4
01-10 14:12:13.683762   376   865 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Success fd: 10
01-10 14:12:13.683909   376   865 I VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 initialize communication
01-10 14:12:13.683963   376   865 D VT HIDL : [IVT] getInstance
01-10 14:12:13.684031   376   865 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] read from IMCB
01-10 14:12:13.695088   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.720162   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.736985   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.757430   523   562 D AAL     : 01-10 02:12:13.681 BL=1004,ESS= 256, 01-10 02:12:13.700 BL=1003,ESS= 256, 01-10 02:12:13.719 BL=1002,ESS= 256, 01-10 02:12:13.738 BL=1001,ESS= 256, 01-10 02:12:13.757 BL=1000,ESS= 256, 
01-10 14:12:13.761908   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.778767   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.803748   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.820942   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.845549   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.851732   523   562 D AAL     : 01-10 02:12:13.776 BL= 999,ESS= 256, 01-10 02:12:13.795 BL= 998,ESS= 256, 01-10 02:12:13.813 BL= 997,ESS= 256, 01-10 02:12:13.833 BL= 996,ESS= 256, 01-10 02:12:13.851 BL= 995,ESS= 256, 
01-10 14:12:13.862519   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.880159   943   943 D MtkCam/Utils: ###### get camera log property =-1
01-10 14:12:13.885813   943   943 D aaa_log : ###### get hal3a log level =-1
01-10 14:12:13.888009   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.888160   376   865 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] read from IMCB done
01-10 14:12:13.888316   376   865 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (status = 0)
01-10 14:12:13.888436   376   865 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (efGroup = -240021016)
01-10 14:12:13.888531   376   865 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (type)
01-10 14:12:13.888716   376   865 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (len)
01-10 14:12:13.888804   376   865 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (buffer)
01-10 14:12:13.888881   376   865 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] read from IMCB
01-10 14:12:13.889092   530   859 I VT      : [SRV] [VT THREAD] [VT_HIDL_Thread] msg_type : 101505
01-10 14:12:13.889456   530   859 I VT      : [SRV] [VT THREAD] [VT_HIDL_Thread] recv_length : 4
01-10 14:12:13.889546   530   859 I VT      : [SRV] [VT THREAD] [VT_HIDL_Thread] outBuffer
01-10 14:12:13.889617   530   859 I VT      : [VT] [DISPATCHER] VTMsgDispatcher dispatchMessage
01-10 14:12:13.889917   530   857 I VT      : [VT] [PRI HDLR] VTPriMsgHdlr onMessageReceived
01-10 14:12:13.890046   530   857 I VT      : [VT] [PRI HDLR] VTPriMsgHdlr dispatch normal message
01-10 14:12:13.890386   530   858 I VT      : [VT] [HDLR] VTMsgHdlr onMessageReceived
01-10 14:12:13.890429   530   858 I VT      : [VT] [HDLR] VTMsgHdlr handle normal message
01-10 14:12:13.890494   530   858 W VT      : [SRV] [OPERATION][ID=0] vt_callback (MSG_ID_WRAP_IMSVT_IMCB_GET_CAP_IND)
01-10 14:12:13.890526   530   858 I VT      : [SRV] [MA NOTIFY] Get camera capability (id = 0) (arg1 = 0, arg2 = 0, arg3 = 0)
01-10 14:12:13.890533   530   858 I VT      : [SRV] [MA NOTIFY]                   (obj1 = , obj2 = )
01-10 14:12:13.890544   530   858 I VT      : [VTS] gVTSClient == NULL
01-10 14:12:13.904946   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.928301   531   558 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 14:12:13.929423   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.943775   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:1,0](15)
01-10 14:12:13.944096   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=1](13)
01-10 14:12:13.945823   523   562 D AAL     : 01-10 02:12:13.870 BL= 994,ESS= 256, 01-10 02:12:13.889 BL= 993,ESS= 256, 01-10 02:12:13.908 BL= 992,ESS= 256, 01-10 02:12:13.927 BL= 991,ESS= 256, 01-10 02:12:13.945 BL= 990,ESS= 256, 
01-10 14:12:13.946794   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.971304   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:13.988650   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:13.991884   548   881 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 14:12:14.003063   401   401 W ccci_fsd(1): O: X://ST33_004, flag 0x700, ret 1
01-10 14:12:14.005127   401   401 W ccci_fsd(1): O: Y://ST33_004, flag 0x700, ret 1
01-10 14:12:14.013224   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.030431   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.040350   523   562 D AAL     : 01-10 02:12:13.964 BL= 989,ESS= 256, 01-10 02:12:13.983 BL= 988,ESS= 256, 01-10 02:12:14.002 BL= 987,ESS= 256, 01-10 02:12:14.021 BL= 986,ESS= 256, 01-10 02:12:14.040 BL= 985,ESS= 256, 
01-10 14:12:14.042561   398   421 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=23.82 dur=1007.62 max=44.17 min=40.21
01-10 14:12:14.054991   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.063871   943  1004 E BluetoothAdapter: Bluetooth binder is null
01-10 14:12:14.072918   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.079626   943  1004 I PowerManagerService-JNI: Loaded power HAL service
01-10 14:12:14.096777   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.110147   401   401 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 14:12:14.113951   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.117624   401   401 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 14:12:14.125123   401   401 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 14:12:14.126711   401   401 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 14:12:14.128743   401   401 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 14:12:14.130385   401   401 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 14:12:14.132473   401   401 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 14:12:14.134063   401   401 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 14:12:14.134490   523   562 D AAL     : 01-10 02:12:14.058 BL= 984,ESS= 256, 01-10 02:12:14.078 BL= 983,ESS= 256, 01-10 02:12:14.096 BL= 982,ESS= 256, 01-10 02:12:14.115 BL= 981,ESS= 256, 01-10 02:12:14.134 BL= 980,ESS= 256, 
01-10 14:12:14.136068   401   401 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 14:12:14.137600   401   401 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 14:12:14.138522   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.155760   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.179257   943   943 I AES     : load Exception Log jni
01-10 14:12:14.180428   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.182120   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:23.566523,dur:1018.39,max:58.24,min:36.01
01-10 14:12:14.185386   943   943 W zygote64: Failed to remove /acct/uid_0/pid_303: Device or resource busy
01-10 14:12:14.185553   943   943 W zygote64: Failed to remove /acct/uid_0/pid_363: Device or resource busy
01-10 14:12:14.185618   943   943 W zygote64: Failed to remove /acct/uid_0/pid_396: Device or resource busy
01-10 14:12:14.185644   943   943 W zygote64: Failed to remove /acct/uid_0/pid_397: Device or resource busy
01-10 14:12:14.185670   943   943 W zygote64: Failed to remove /acct/uid_0/pid_399: Device or resource busy
01-10 14:12:14.185699   943   943 W zygote64: Failed to remove /acct/uid_0/pid_400: Device or resource busy
01-10 14:12:14.185724   943   943 W zygote64: Failed to remove /acct/uid_0/pid_406: Device or resource busy
01-10 14:12:14.185905   943   943 W zygote64: Failed to remove /acct/uid_0/pid_521: Device or resource busy
01-10 14:12:14.185980   943   943 W zygote64: Failed to remove /acct/uid_0/pid_522: Device or resource busy
01-10 14:12:14.186010   943   943 W zygote64: Failed to remove /acct/uid_0/pid_531: Device or resource busy
01-10 14:12:14.186040   943   943 W zygote64: Failed to remove /acct/uid_0/pid_538: Device or resource busy
01-10 14:12:14.186071   943   943 W zygote64: Failed to remove /acct/uid_0/pid_539: Device or resource busy
01-10 14:12:14.186099   943   943 W zygote64: Failed to remove /acct/uid_0/pid_541: Device or resource busy
01-10 14:12:14.186129   943   943 W zygote64: Failed to remove /acct/uid_0/pid_542: Device or resource busy
01-10 14:12:14.186157   943   943 W zygote64: Failed to remove /acct/uid_0/pid_543: Device or resource busy
01-10 14:12:14.186184   943   943 W zygote64: Failed to remove /acct/uid_0/pid_544: Device or resource busy
01-10 14:12:14.186214   943   943 W zygote64: Failed to remove /acct/uid_0/pid_549: Device or resource busy
01-10 14:12:14.186279   943   943 W zygote64: Failed to remove /acct/uid_0/pid_557: Device or resource busy
01-10 14:12:14.186375   943   943 W zygote64: Failed to remove /acct/uid_0/pid_772: Device or resource busy
01-10 14:12:14.186439   943   943 W zygote64: Failed to remove /acct/uid_0/pid_773: Device or resource busy
01-10 14:12:14.186467   943   943 W zygote64: Failed to remove /acct/uid_0/pid_774: Device or resource busy
01-10 14:12:14.186494   943   943 W zygote64: Failed to remove /acct/uid_0/pid_776: Device or resource busy
01-10 14:12:14.186522   943   943 W zygote64: Failed to remove /acct/uid_0/pid_805: Device or resource busy
01-10 14:12:14.186553   943   943 W zygote64: Failed to remove /acct/uid_0/pid_807: Device or resource busy
01-10 14:12:14.186579   943   943 W zygote64: Failed to remove /acct/uid_0/pid_808: Device or resource busy
01-10 14:12:14.186605   943   943 W zygote64: Failed to remove /acct/uid_0/pid_809: Device or resource busy
01-10 14:12:14.186633   943   943 W zygote64: Failed to remove /acct/uid_0/pid_811: Device or resource busy
01-10 14:12:14.186663   943   943 W zygote64: Failed to remove /acct/uid_0/pid_812: Device or resource busy
01-10 14:12:14.186695   943   943 W zygote64: Failed to remove /acct/uid_0/pid_891: Device or resource busy
01-10 14:12:14.186736   943   943 W zygote64: Failed to remove /acct/uid_0: Permission denied
01-10 14:12:14.186869   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_348: Device or resource busy
01-10 14:12:14.186896   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_349: Device or resource busy
01-10 14:12:14.186953   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_350: Device or resource busy
01-10 14:12:14.186983   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_361: Device or resource busy
01-10 14:12:14.187011   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_362: Device or resource busy
01-10 14:12:14.187080   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_375: Device or resource busy
01-10 14:12:14.187107   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_376: Device or resource busy
01-10 14:12:14.187138   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_381: Device or resource busy
01-10 14:12:14.187165   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_384: Device or resource busy
01-10 14:12:14.187191   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_385: Device or resource busy
01-10 14:12:14.187217   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_386: Device or resource busy
01-10 14:12:14.187244   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_387: Device or resource busy
01-10 14:12:14.187306   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_388: Device or resource busy
01-10 14:12:14.187334   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_389: Device or resource busy
01-10 14:12:14.187362   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_390: Device or resource busy
01-10 14:12:14.187450   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_392: Device or resource busy
01-10 14:12:14.187482   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_393: Device or resource busy
01-10 14:12:14.187514   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_394: Device or resource busy
01-10 14:12:14.187541   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_398: Device or resource busy
01-10 14:12:14.187568   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_403: Device or resource busy
01-10 14:12:14.187636   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_408: Device or resource busy
01-10 14:12:14.187759   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_523: Device or resource busy
01-10 14:12:14.187788   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_526: Device or resource busy
01-10 14:12:14.187815   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_529: Device or resource busy
01-10 14:12:14.187849   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_530: Device or resource busy
01-10 14:12:14.187876   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_547: Device or resource busy
01-10 14:12:14.187903   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_550: Device or resource busy
01-10 14:12:14.187931   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_552: Device or resource busy
01-10 14:12:14.187983   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_553: Device or resource busy
01-10 14:12:14.188013   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_554: Device or resource busy
01-10 14:12:14.188041   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_556: Device or resource busy
01-10 14:12:14.188068   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_559: Device or resource busy
01-10 14:12:14.188094   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_561: Device or resource busy
01-10 14:12:14.188121   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_563: Device or resource busy
01-10 14:12:14.188149   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_567: Device or resource busy
01-10 14:12:14.188177   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_569: Device or resource busy
01-10 14:12:14.188204   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_570: Device or resource busy
01-10 14:12:14.188231   943   943 W zygote64: Failed to remove /acct/uid_1000/pid_573: Device or resource busy
01-10 14:12:14.188271   943   943 W zygote64: Failed to remove /acct/uid_1000: Permission denied
01-10 14:12:14.188345   943   943 W zygote64: Failed to remove /acct/uid_1001/pid_401: Device or resource busy
01-10 14:12:14.188441   943   943 W zygote64: Failed to remove /acct/uid_1001/pid_405: Device or resource busy
01-10 14:12:14.188490   943   943 W zygote64: Failed to remove /acct/uid_1001/pid_409: Device or resource busy
01-10 14:12:14.188518   943   943 W zygote64: Failed to remove /acct/uid_1001/pid_925: Device or resource busy
01-10 14:12:14.188545   943   943 W zygote64: Failed to remove /acct/uid_1001: Permission denied
01-10 14:12:14.188599   943   943 W zygote64: Failed to remove /acct/uid_1002/pid_378: Device or resource busy
01-10 14:12:14.188619   943   943 W zygote64: Failed to remove /acct/uid_1002: Permission denied
01-10 14:12:14.188667   943   943 W zygote64: Failed to remove /acct/uid_1003/pid_484: Device or resource busy
01-10 14:12:14.188687   943   943 W zygote64: Failed to remove /acct/uid_1003: Permission denied
01-10 14:12:14.188743   943   943 W zygote64: Failed to remove /acct/uid_1010/pid_391: Device or resource busy
01-10 14:12:14.188771   943   943 W zygote64: Failed to remove /acct/uid_1010/pid_545: Device or resource busy
01-10 14:12:14.188798   943   943 W zygote64: Failed to remove /acct/uid_1010/pid_565: Device or resource busy
01-10 14:12:14.188817   943   943 W zygote64: Failed to remove /acct/uid_1010: Permission denied
01-10 14:12:14.188881   943   943 W zygote64: Failed to remove /acct/uid_1013/pid_380: Device or resource busy
01-10 14:12:14.188912   943   943 W zygote64: Failed to remove /acct/uid_1013/pid_382: Device or resource busy
01-10 14:12:14.188939   943   943 W zygote64: Failed to remove /acct/uid_1013/pid_383: Device or resource busy
01-10 14:12:14.188966   943   943 W zygote64: Failed to remove /acct/uid_1013/pid_533: Device or resource busy
01-10 14:12:14.188993   943   943 W zygote64: Failed to remove /acct/uid_1013/pid_536: Device or resource busy
01-10 14:12:14.189019   943   943 W zygote64: Failed to remove /acct/uid_1013/pid_537: Device or resource busy
01-10 14:12:14.189039   943   943 W zygote64: Failed to remove /acct/uid_1013: Permission denied
01-10 14:12:14.189091   943   943 W zygote64: Failed to remove /acct/uid_1017/pid_532: Device or resource busy
01-10 14:12:14.189111   943   943 W zygote64: Failed to remove /acct/uid_1017: Permission denied
01-10 14:12:14.189157   943   943 W zygote64: Failed to remove /acct/uid_1019/pid_528: Device or resource busy
01-10 14:12:14.189178   943   943 W zygote64: Failed to remove /acct/uid_1019: Permission denied
01-10 14:12:14.189228   943   943 W zygote64: Failed to remove /acct/uid_1021/pid_520: Device or resource busy
01-10 14:12:14.189285   943   943 W zygote64: Failed to remove /acct/uid_1021/pid_555: Device or resource busy
01-10 14:12:14.189306   943   943 W zygote64: Failed to remove /acct/uid_1021: Permission denied
01-10 14:12:14.189354   943   943 W zygote64: Failed to remove /acct/uid_1027/pid_395: Device or resource busy
01-10 14:12:14.189374   943   943 W zygote64: Failed to remove /acct/uid_1027: Permission denied
01-10 14:12:14.189429   943   943 W zygote64: Failed to remove /acct/uid_1036/pid_347: Device or resource busy
01-10 14:12:14.189525   943   943 W zygote64: Failed to remove /acct/uid_1036: Permission denied
01-10 14:12:14.189600   943   943 W zygote64: Failed to remove /acct/uid_1040/pid_535: Device or resource busy
01-10 14:12:14.189622   943   943 W zygote64: Failed to remove /acct/uid_1040: Permission denied
01-10 14:12:14.189672   943   943 W zygote64: Failed to remove /acct/uid_1041/pid_377: Device or resource busy
01-10 14:12:14.189699   943   943 W zygote64: Failed to remove /acct/uid_1041/pid_379: Device or resource busy
01-10 14:12:14.189725   943   943 W zygote64: Failed to remove /acct/uid_1041/pid_524: Device or resource busy
01-10 14:12:14.189745   943   943 W zygote64: Failed to remove /acct/uid_1041: Permission denied
01-10 14:12:14.189797   943   943 W zygote64: Failed to remove /acct/uid_1046/pid_546: Device or resource busy
01-10 14:12:14.189816   943   943 W zygote64: Failed to remove /acct/uid_1046: Permission denied
01-10 14:12:14.189867   943   943 W zygote64: Failed to remove /acct/uid_1047/pid_527: Device or resource busy
01-10 14:12:14.189917   943   943 W zygote64: Failed to remove /acct/uid_1047/pid_540: Device or resource busy
01-10 14:12:14.189945   943   943 W zygote64: Failed to remove /acct/uid_1047/pid_548: Device or resource busy
01-10 14:12:14.189965   943   943 W zygote64: Failed to remove /acct/uid_1047: Permission denied
01-10 14:12:14.190012   943   943 W zygote64: Failed to remove /acct/uid_1058/pid_572: Device or resource busy
01-10 14:12:14.190032   943   943 W zygote64: Failed to remove /acct/uid_1058: Permission denied
01-10 14:12:14.190087   943   943 W zygote64: Failed to remove /acct/uid_2000/pid_424: Device or resource busy
01-10 14:12:14.190115   943   943 W zygote64: Failed to remove /acct/uid_2000/pid_806: Device or resource busy
01-10 14:12:14.190136   943   943 W zygote64: Failed to remove /acct/uid_2000: Permission denied
01-10 14:12:14.191152   548   882 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:14.186000   548   548 W HwBinder:548_2: type=1400 audit(0.0:41): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:14.197691   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.222314   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.228868   523   562 D AAL     : 01-10 02:12:14.153 BL= 979,ESS= 256, 01-10 02:12:14.172 BL= 978,ESS= 256, 01-10 02:12:14.191 BL= 977,ESS= 256, 01-10 02:12:14.209 BL= 976,ESS= 256, 01-10 02:12:14.228 BL= 975,ESS= 256, 
01-10 14:12:14.240264   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.264359   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.281765   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.299052   943   943 W System.err: java.io.FileNotFoundException: /proc/cpu_loading/onoff (No such file or directory)
01-10 14:12:14.299373   943   943 W System.err: 	at java.io.FileOutputStream.open0(Native Method)
01-10 14:12:14.299452   943   943 W System.err: 	at java.io.FileOutputStream.open(FileOutputStream.java:287)
01-10 14:12:14.299472   943   943 W System.err: 	at java.io.FileOutputStream.<init>(FileOutputStream.java:223)
01-10 14:12:14.299486   943   943 W System.err: 	at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
01-10 14:12:14.299542   943   943 W System.err: 	at com.mediatek.duraspeed.utils.FileUtilsController.writeStringToFile(FileUtilsController.java:319)
01-10 14:12:14.299558   943   943 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedInternalManager.stopObserving(DuraSpeedInternalManager.java:563)
01-10 14:12:14.299582   943   943 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedInternalManager.enableCpuObserving(DuraSpeedInternalManager.java:165)
01-10 14:12:14.299597   943   943 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedInternalManager.<init>(DuraSpeedInternalManager.java:145)
01-10 14:12:14.299611   943   943 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedService.startDuraSpeedService(DuraSpeedService.java:145)
01-10 14:12:14.299625   943   943 W System.err: 	at com.mediatek.server.am.AmsExtImpl.startDuraSpeedService(AmsExtImpl.java:495)
01-10 14:12:14.299641   943   943 W System.err: 	at com.android.server.am.ActivityManagerService.start(ActivityManagerService.java:2923)
01-10 14:12:14.299656   943   943 W System.err: 	at com.android.server.am.ActivityManagerService.-wrap11(Unknown Source:0)
01-10 14:12:14.299670   943   943 W System.err: 	at com.android.server.am.ActivityManagerService$Lifecycle.onStart(ActivityManagerService.java:2709)
01-10 14:12:14.299685   943   943 W System.err: 	at com.android.server.SystemServiceManager.startService(SystemServiceManager.java:124)
01-10 14:12:14.299702   943   943 W System.err: 	at com.android.server.SystemServiceManager.startService(SystemServiceManager.java:111)
01-10 14:12:14.299716   943   943 W System.err: 	at com.android.server.SystemServer.startBootstrapServices(SystemServer.java:566)
01-10 14:12:14.299730   943   943 W System.err: 	at com.android.server.SystemServer.run(SystemServer.java:428)
01-10 14:12:14.299743   943   943 W System.err: 	at com.android.server.SystemServer.main(SystemServer.java:299)
01-10 14:12:14.299757   943   943 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 14:12:14.299771   943   943 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 14:12:14.299783   943   943 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:837)
01-10 14:12:14.306186   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.307933   943   943 E libsuspend: Error opening dlservice!!
01-10 14:12:14.308470   943   943 I libsuspend: Selected wakeup count
01-10 14:12:14.308914   394   414 I vendor.mediatek.hardware.power@1.1-impl: setInteractive Restore All
01-10 14:12:14.309637   394   413 I powerd  : [powerd_req] POWER_MSG_SCN_RESTORE_ALL
01-10 14:12:14.323829   523   562 D AAL     : 01-10 02:12:14.247 BL= 974,ESS= 256, 01-10 02:12:14.266 BL= 973,ESS= 256, 01-10 02:12:14.285 BL= 972,ESS= 256, 01-10 02:12:14.304 BL= 971,ESS= 256, 01-10 02:12:14.323 BL= 970,ESS= 256, 
01-10 14:12:14.323895   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.332053   398   421 I SurfaceFlinger: EventThread Client Pid (943) created
01-10 14:12:14.332938   398   421 I SurfaceFlinger: EventThread Client Pid (943) created
01-10 14:12:14.336968   398   398 D SurfaceFlinger: Set power mode=2, type=0 flinger=0x7f7b660000
01-10 14:12:14.348099   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.362545   387   387 D lights  : write_int open fd=7
01-10 14:12:14.363275   563   578 D PQ      : ccorr table index=0
01-10 14:12:14.363956   563   578 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 1
01-10 14:12:14.364375   387   387 D lights  : write_int open fd=7
01-10 14:12:14.365630   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.379541   523   562 D AAL     : onBacklightChanged: 1023/1023 -> 409/1023(phy:1637/4095)
01-10 14:12:14.389854   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.391904   549   549 D NVRAM   : length of g_NVRAM_BACKUP_DEVICE=44
01-10 14:12:14.392492   549   549 D NVRAM   : failed to get entry for /nvdata 
01-10 14:12:14.392561   549   549 D NVRAM   : failed to get nvdata path /nvdata 
01-10 14:12:14.393013   549   549 D NVRAM   : nvram_layout_callback will run!!!
01-10 14:12:14.393189   549   549 D NVRAM   : nvram_platform_log_block: 2
01-10 14:12:14.393351   549   549 D NVRAM   : nvram_platform_resv_block: 2
01-10 14:12:14.393412   549   549 D NVRAM   : nvram_platform_DM_block: 1
01-10 14:12:14.393565   549   549 D NVRAM   : nvram_platform_layout_version: 0
01-10 14:12:14.393627   549   549 D NVRAM   : nvram_platform_header_offset: 0
01-10 14:12:14.393686   549   549 D NVRAM   : g_i4CFG_File_Count: 51
01-10 14:12:14.393739   549   549 D NVRAM   : NVM_Init Max Lid: 78
01-10 14:12:14.393801   549   549 D NVRAM   : [NVRAM]: info nvram_gpt_flag =1
01-10 14:12:14.393860   549   549 D NVRAM   : [NVRAM]: info NVRAM Init Completed!
01-10 14:12:14.394277   549   549 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/APCFG/APRDCL/FG,LID:76
01-10 14:12:14.395181   549   549 D NVRAM   : NVM_CmpFileVerNo 76  
01-10 14:12:14.395626   549   549 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 14:12:14.395815   549   549 D NVRAM   : NVM_ProtectDataFile : 76 ++
01-10 14:12:14.395875   549   549 D NVRAM   : iCustomBeginLID = 51
01-10 14:12:14.396007   549   549 D NVRAM   : NVM_CheckFileSize:stat_size:26,size in table:24
01-10 14:12:14.397255   549   549 D NVRAM   : NVM_CheckFile: File is correct!
01-10 14:12:14.397434   549   549 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 14:12:14.397507   549   549 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 14:12:14.400131   549   549 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 14:12:14.407683   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.417456   523   562 D AAL     : 01-10 02:12:14.341 BL= 969,ESS= 256, 01-10 02:12:14.360 BL= 968,ESS= 256, 01-10 02:12:14.379 BL= 943,ESS= 256, 01-10 02:12:14.399 BL= 918,ESS= 256, 01-10 02:12:14.417 BL= 893,ESS= 256, 
01-10 14:12:14.431935   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.449505   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.473763   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.491799   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.511747   523   562 D AAL     : 01-10 02:12:14.436 BL= 868,ESS= 256, 01-10 02:12:14.455 BL= 843,ESS= 256, 01-10 02:12:14.473 BL= 818,ESS= 256, 01-10 02:12:14.492 BL= 793,ESS= 256, 01-10 02:12:14.511 BL= 768,ESS= 256, 
01-10 14:12:14.515544   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.533948   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.557368   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.576080   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.599226   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.605941   523   562 D AAL     : 01-10 02:12:14.530 BL= 743,ESS= 256, 01-10 02:12:14.549 BL= 719,ESS= 256, 01-10 02:12:14.568 BL= 694,ESS= 256, 01-10 02:12:14.587 BL= 669,ESS= 256, 01-10 02:12:14.605 BL= 645,ESS= 256, 
01-10 14:12:14.611801   943   943 D Cta_PermRecordsController: readState() BEGIN
01-10 14:12:14.618110   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.637660   943   943 D Cta_PermRecordsController: readState() END
01-10 14:12:14.641087   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.642139   806   926 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 14:12:14.642597   806   926 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 14:12:14.642828   806   926 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 14:12:14.660019   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.675776   943   943 D PackageManager: No files in app dir /custom/framework
01-10 14:12:14.682867   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.700385   523   562 D AAL     : 01-10 02:12:14.624 BL= 620,ESS= 256, 01-10 02:12:14.643 BL= 596,ESS= 256, 01-10 02:12:14.662 BL= 571,ESS= 256, 01-10 02:12:14.681 BL= 547,ESS= 256, 01-10 02:12:14.700 BL= 522,ESS= 256, 
01-10 14:12:14.702283   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.724705   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.744515   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.766723   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.787218   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.794519   523   562 D AAL     : 01-10 02:12:14.719 BL= 498,ESS= 256, 01-10 02:12:14.737 BL= 474,ESS= 256, 01-10 02:12:14.757 BL= 450,ESS= 256, 01-10 02:12:14.775 BL= 425,ESS= 256, 01-10 02:12:14.794 BL= 401,ESS= 256, 
01-10 14:12:14.808416   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.829339   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.850283   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.871825   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.892068   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.913965   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.934126   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.945089   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=0](13)
01-10 14:12:14.945287   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:0,0](15)
01-10 14:12:14.945363   891   891 I [epdg_wo]: [WOA] Daemon & Adpt are ready.
01-10 14:12:14.945388   891   891 I [epdg_wo]: [SKT] external server socket[wod_action]-fd:-1 init successfully
01-10 14:12:14.945427   891   891 I [epdg_wo]: [SKT] external server socket[wod_sim]-fd:-1 init successfully
01-10 14:12:14.945709   891   891 I [epdg_wo]: [SKT] external server socket[wod_ipsec]-fd:6 init successfully
01-10 14:12:14.945740   891   891 I [epdg_wo]: [DMN] WI-FI OFFLOAD DAEMON started
01-10 14:12:14.945911   891   891 I [epdg_wo]: [CFG] Reset settings[0] to default
01-10 14:12:14.945945   891   891 I [epdg_wo]: [CFG] Reset settings[1] to default
01-10 14:12:14.946355   891  1034 I [epdg_wo]: [DNS] Handle DNS Cmd Loop: dns_handler 660 
01-10 14:12:14.946532   891   891 D [epdg_wo]: [DSC] epdg discoverer state: [NOT_INIT] -> [IS_READY]
01-10 14:12:14.946567   891   891 D [epdg_wo]: [DSC] epdg discoverer state: [NOT_INIT] -> [IS_READY]
01-10 14:12:14.946741   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:1,1](15)
01-10 14:12:14.946804   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=0](13)
01-10 14:12:14.946852   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:0,1](15)
01-10 14:12:14.951675   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp=0,0,"",""](15)
01-10 14:12:14.952356   891   891 I [epdg_wo]: [CFG] Reset settings[0] to default
01-10 14:12:14.952535   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp:0,0](9)
01-10 14:12:14.952788   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset=***](15)
01-10 14:12:14.952874   891   891 I [epdg_wo]: [CFG] cfg0: epdg_fqdn=[***],ikev2if=[wlan0],select_info=[***],epdg_identifier=[***],retry_vector=[],
01-10 14:12:14.952901   891   891 I [epdg_wo]: [CFG] cfg0: ike_algo=[],
01-10 14:12:14.952954   891   891 I [epdg_wo]: [CFG] cfg0: esp_algo=[],
01-10 14:12:14.953240   891   891 I [epdg_wo]: [CFG] cfg0: ike_rekey_timer=[81000],esp_rekey_timer=[81000],rekey_margin=[32400],dpd_timer=[120],keep_timer=[20],esp_setup_time=[15],pdn_setup_time=[295],cert_used=[1],urlcert=[0],ocsp=[0],nocert=[1],skip_check_cert=[0],noid=[1],force_tsi_64=[1],force_tsi_full=[1],use_cfg_vip=[0],reauth_addr=[0],dpd_no_reply=[0],pre_post_ping=[0],log_level=[1],wdrv_keep_alive=[1],fragment=[0],mobike=[0],oos=[7],retrans_to=[2],retrans_tries=[4],retrans_base=[1],mtu=[1280],mss4_off=[68],mss6_off=[88],cust_pcscf_4=[20],cust_pcscf_6=[21],cust_imei_cp=[0],port=[10500],port_natt=[14500],cpa_nm=[0],cpa_dns4=[1],cpa_dns6=[1],no_ic=[0],no_eap=[0],ike_dscp=[0],IDi=[0],IDr=[0],leftauth=[0],eap=[0],fastreauth=[0],dns_timer=[0],dns_type=[3],dns_max_count=[254],dns_cache=[1],redirect=[0],max_redirects=[5],redirect_loop_detect=[300],detach_soft_timer=[3],detach_hard_timer=[300],
01-10 14:12:14.953302   891   891 I [epdg_wo]: [CFG] cfg0: fdpd_retrans_to=[1],fdpd_retrans_tries=[2],fdpd_retrans_base=[1],certreq_critical=[0],pcscf_restore=[0],liveness_check=[0],device_identity=[0],abort_mode=[0],ho_ip_disc=[0],emerg_epdg=[0],try_epdg_policy=[0],imei_format=[0],
01-10 14:12:14.953346   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset:0,"",-1](15)
01-10 14:12:14.953519   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp=1,0,"",""](15)
01-10 14:12:14.953605   891   891 I [epdg_wo]: [CFG] Reset settings[1] to default
01-10 14:12:14.953654   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp:1,0](9)
01-10 14:12:14.953742   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset=***](15)
01-10 14:12:14.953818   891   891 I [epdg_wo]: [CFG] cfg1: epdg_fqdn=[***],ikev2if=[wlan0],select_info=[***],epdg_identifier=[***],retry_vector=[],
01-10 14:12:14.953842   891   891 I [epdg_wo]: [CFG] cfg1: ike_algo=[],
01-10 14:12:14.953861   891   891 I [epdg_wo]: [CFG] cfg1: esp_algo=[],
01-10 14:12:14.954115   891   891 I [epdg_wo]: [CFG] cfg1: ike_rekey_timer=[81000],esp_rekey_timer=[81000],rekey_margin=[32400],dpd_timer=[120],keep_timer=[20],esp_setup_time=[15],pdn_setup_time=[295],cert_used=[1],urlcert=[0],ocsp=[0],nocert=[1],skip_check_cert=[0],noid=[1],force_tsi_64=[1],force_tsi_full=[1],use_cfg_vip=[0],reauth_addr=[0],dpd_no_reply=[0],pre_post_ping=[0],log_level=[1],wdrv_keep_alive=[1],fragment=[0],mobike=[0],oos=[7],retrans_to=[2],retrans_tries=[4],retrans_base=[1],mtu=[1280],mss4_off=[68],mss6_off=[88],cust_pcscf_4=[20],cust_pcscf_6=[21],cust_imei_cp=[0],port=[10500],port_natt=[14500],cpa_nm=[0],cpa_dns4=[1],cpa_dns6=[1],no_ic=[0],no_eap=[0],ike_dscp=[0],IDi=[0],IDr=[0],leftauth=[0],eap=[0],fastreauth=[0],dns_timer=[0],dns_type=[3],dns_max_count=[254],dns_cache=[1],redirect=[0],max_redirects=[5],redirect_loop_detect=[300],detach_soft_timer=[3],detach_hard_timer=[300],
01-10 14:12:14.954176   891   891 I [epdg_wo]: [CFG] cfg1: fdpd_retrans_to=[1],fdpd_retrans_tries=[2],fdpd_retrans_base=[1],certreq_critical=[0],pcscf_restore=[0],liveness_check=[0],device_identity=[0],abort_mode=[0],ho_ip_disc=[0],emerg_epdg=[0],try_epdg_policy=[0],imei_format=[0],
01-10 14:12:14.954217   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset:1,"",-1](15)
01-10 14:12:14.954314   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim=***](19)
01-10 14:12:14.954361   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim:0,0](9)
01-10 14:12:14.954440   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim=***](19)
01-10 14:12:14.954486   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim:1,0](9)
01-10 14:12:14.956427   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:14.975978   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:14.992280   548   881 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 14:12:14.999014   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.001745   523   562 D AAL     : 01-10 02:12:14.813 BL= 377,ESS= 256, 01-10 02:12:14.850 BL= 376,ESS= 256, 01-10 02:12:14.907 BL= 375,ESS= 256, 01-10 02:12:14.945 BL= 374,ESS= 256, 01-10 02:12:15.001 BL= 373,ESS= 256, 
01-10 14:12:15.017837   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.029339   943   943 D PackageManager: No files in app dir /vendor/priv-app
01-10 14:12:15.030000   943   943 W system_server: type=1400 audit(0.0:42): avc: denied { getattr } for path="/vendor/app/t6" dev="dm-1" ino=31 scontext=u:r:system_server:s0 tcontext=u:object_r:tkcore_systa_dir:s0 tclass=dir permissive=0
01-10 14:12:15.041649   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.053049   398   640 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=23.75 dur=1010.52 max=45.47 min=39.61
01-10 14:12:15.059706   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.078559   943   943 D PackageManager: No files in app dir /vendor/plugin
01-10 14:12:15.078809   943   943 D PackageManager: No files in app dir /custom/app
01-10 14:12:15.078875   943   943 D PackageManager: No files in app dir /custom/plugin
01-10 14:12:15.078915   943   943 D PackageManager: No files in app dir /oem/app
01-10 14:12:15.084073   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.088878   943   943 D PackageManager: No files in app dir /data/app-private
01-10 14:12:15.101330   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.116630   531   558 I SELinux : SELinux: Loaded file_contexts
01-10 14:12:15.126393   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.143080   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.168839   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.184808   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.191797   548   882 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:15.190000   548   548 W HwBinder:548_2: type=1400 audit(0.0:43): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:15.202101   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:23.528801,dur:1020.03,max:56.83,min:36.98
01-10 14:12:15.211321   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.226663   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.228278   523   562 D AAL     : 01-10 02:12:15.039 BL= 372,ESS= 256, 01-10 02:12:15.095 BL= 371,ESS= 256, 01-10 02:12:15.133 BL= 370,ESS= 256, 01-10 02:12:15.190 BL= 369,ESS= 256, 01-10 02:12:15.228 BL= 368,ESS= 256, 
01-10 14:12:15.253492   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.268421   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.295484   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.310165   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.337588   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.352070   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.380404   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.393766   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.422205   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.435528   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.463684   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.473164   523   562 D AAL     : 01-10 02:12:15.284 BL= 367,ESS= 256, 01-10 02:12:15.341 BL= 366,ESS= 256, 01-10 02:12:15.378 BL= 365,ESS= 256, 01-10 02:12:15.435 BL= 364,ESS= 256, 01-10 02:12:15.473 BL= 363,ESS= 256, 
01-10 14:12:15.477268   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.504432   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.519239   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.545352   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.560963   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.578734   531  1050 D installd: Found valid user 10
01-10 14:12:15.586247   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.602817   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.628664   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.644583   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.648836   531  1050 W installd: Ignoring /data/data/com.android.webview/lib with unexpected GID 0 instead of 10070
01-10 14:12:15.658937   531  1050 W installd: Ignoring /data/data/com.svox.pico/lib with unexpected GID 0 instead of 10059
01-10 14:12:15.662931   531  1050 W installd: Ignoring /data/data/com.mediatek.webview/lib with unexpected GID 0 instead of 10056
01-10 14:12:15.669482   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.685279   943   943 E PackageManager: There should probably be a verifier, but, none were found
01-10 14:12:15.686468   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.686820   531  1050 W installd: Ignoring /data/data/com.gears42.surefox/lib with unexpected GID 0 instead of 10030
01-10 14:12:15.710514   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.718184   523   562 D AAL     : 01-10 02:12:15.529 BL= 362,ESS= 256, 01-10 02:12:15.567 BL= 361,ESS= 256, 01-10 02:12:15.623 BL= 360,ESS= 256, 01-10 02:12:15.661 BL= 359,ESS= 256, 01-10 02:12:15.718 BL= 358,ESS= 256, 
01-10 14:12:15.728497   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.746357   943   943 I zygote64: Waiting for a blocking GC Explicit
01-10 14:12:15.751208   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.756589   943   943 I zygote64: WaitForGcToComplete blocked Explicit on AddRemoveAppImageSpace for 10.231ms
01-10 14:12:15.770281   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.783867   531  1050 W installd: Ignoring /data/user/10/com.android.webview/lib with unexpected GID 0 instead of 1010070
01-10 14:12:15.790531   531  1050 W installd: Ignoring /data/user/10/com.svox.pico/lib with unexpected GID 0 instead of 1010059
01-10 14:12:15.791723   531  1050 W installd: Ignoring /data/user/10/com.mediatek.webview/lib with unexpected GID 0 instead of 1010056
01-10 14:12:15.793210   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.801817   531  1050 W installd: Ignoring /data/user/10/com.gears42.surefox/lib with unexpected GID 0 instead of 1010030
01-10 14:12:15.812317   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.830789   943   943 I zygote64: Explicit concurrent copying GC freed 12719(584KB) AllocSpace objects, 2(40KB) LOS objects, 42% free, 4MB/8MB, paused 88us total 73.863ms
01-10 14:12:15.833802   943   943 D FallbackCategoryProvider: Found 1 fallback categories
01-10 14:12:15.833975   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.854108   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.875494   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.876194   397   397 I lowmemorykiller: ActivityManager connected
01-10 14:12:15.885657   943  1061 D SensorService: nuSensorService starting...
01-10 14:12:15.892379   547   547 D Sensors_Init:  sSensorList addr =0x72517ae008, module addr =0x72517ae218
01-10 14:12:15.892594   547   547 D Sensors_Init:  ARRAY_SIZE(sSensorList) =5 SENSORS_NUM=5 MAX_NUM_SENSOR=5 
01-10 14:12:15.892982   943  1061 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 14:12:15.893246   547   547 I Accelerometer: enable: handle:0, en:0
01-10 14:12:15.893946   943  1061 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 14:12:15.894215   547   547 I Magnetic: enable: handle:1, en:0 
01-10 14:12:15.894851   943  1061 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 14:12:15.895049   547   547 I Gyroscope: enable: handle:3, en:0
01-10 14:12:15.895864   943  1061 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 14:12:15.896081   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.896102   547   547 I Light   : enable: handle:4, en:0 
01-10 14:12:15.897911   943  1061 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 14:12:15.898333   547   547 I Proximity: enable: handle:7, en:0 
01-10 14:12:15.905167   943  1064 D SensorService: nuSensorService thread starting...
01-10 14:12:15.905502   943  1063 D SensorService: new thread SensorEventAckReceiver
01-10 14:12:15.916406   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.937746   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.944816   523   562 D AAL     : 01-10 02:12:15.755 BL= 357,ESS= 256, 01-10 02:12:15.812 BL= 356,ESS= 256, 01-10 02:12:15.850 BL= 355,ESS= 256, 01-10 02:12:15.907 BL= 354,ESS= 256, 01-10 02:12:15.944 BL= 353,ESS= 256, 
01-10 14:12:15.951922   943   977 D BatteryService: mPlugType = 2, mIsTemperatureWarningState = false
01-10 14:12:15.952521   387   387 D lights  : set_led_state colorRGB=FF00FF00, onMS=0, offMS=0
01-10 14:12:15.952645   387   387 D lights  : blink_green, level=255, onMS=0, offMS=0
01-10 14:12:15.953621   387   387 D lights  : write_int open fd=7
01-10 14:12:15.957398   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:15.980022   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:15.985589   943   943 D DL-DeviceManager: parseRebootType: file not found, fallback to RESET
01-10 14:12:15.990300   943   999 I Zygote  : Process: zygote socket zygote opened, supported ABIS: arm64-v8a
01-10 14:12:15.992702   548   881 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 14:12:15.999483   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.001237   943   999 I Zygote  : Process: zygote socket zygote_secondary opened, supported ABIS: armeabi-v7a,armeabi
01-10 14:12:16.001895   522   522 I Zygote  : Lazily preloading resources.
01-10 14:12:16.002008   522   522 D Zygote  : begin preload
01-10 14:12:16.002029   522   522 I Zygote  : Installing ICU cache reference pinning...
01-10 14:12:16.002043   522   522 I Zygote  : Preloading ICU data...
01-10 14:12:16.020293   522   522 I Zygote  : Preloading classes...
01-10 14:12:16.021602   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.034051   522   522 I SystemServiceRegistry: regMtkService start
01-10 14:12:16.034497   522   522 I SystemServiceRegistry: setMtkSystemServiceName start
01-10 14:12:16.037002   522   522 I MtkSystemServiceRegistry: setMtkSystemServiceName start names{class android.media.projection.MediaProjectionManager=media_projection, class android.app.KeyguardManager=keyguard, class android.os.health.SystemHealthManager=systemhealth, class android.nfc.NfcManager=nfc, class android.view.textservice.TextServicesManager=textservices, class android.os.HardwarePropertiesManager=hardware_properties, class android.hardware.usb.UsbManager=usb, class android.net.NetworkScoreManager=network_score, class android.app.timezone.RulesManager=timezone, class android.os.storage.StorageManager=storage, class android.os.Vibrator=vibrator, class android.view.textclassifier.TextClassificationManager=textclassification, class android.hardware.hdmi.HdmiControlManager=hdmi_control, class android.net.EthernetManager=ethernet, class android.app.UiModeManager=uimode, class android.companion.CompanionDeviceManager=companiondevice, class android.bluetooth.BluetoothManager=bluetooth, class android.os.DropBoxManager=dropbox, class android.media.session.MediaSessionManager=media_session, class android.hardware.location.ContextHubManager=contexthub, class android.content.ClipboardManager=clipboard, class android.hardware.display.DisplayManager=display, class android.os.RecoverySystem=recovery, class android.net.wifi.RttManager=rttmanager, class android.media.AudioManager=audio, class android.app.admin.DevicePolicyManager=device_policy, class android.view.autofill.AutofillManager=autofill, class android.app.SearchManager=search, class android.app.ActivityManager=activity, class android.app.AppOpsManager=appops, class android.content.pm.LauncherApps=launcherapps, class android.hardware.radio.RadioManager=broadcastradio, class android.hardware.camera2.CameraManager=camera, class android.app.WallpaperManager=wallpaper, class android.app.job.JobScheduler=jobscheduler, class android.app.DownloadManager=download, class android.net.lowpan.LowpanManager=lowpan, class android.net.wifi.aware.WifiAwareManager=wifiaware, class android.app.AlarmManager=alarm, class android.os.PowerManager=power, class android.service.persistentdata.PersistentDataBlockManager=persistent_data_block, class android.net.IpSecManager=ipsec, class android.app.usage.NetworkStatsManager=netstats, class android.media.MediaRouter=media_router, class android.net.ConnectivityManager=connectivity, class android.telecom.TelecomManager=telecom, class android.content.pm.ShortcutManager=shortcut, class android.app.StatusBarManager=statusbar, class android.hardware.SensorManager=sensor, class android.os.IncidentManager=incident, class android.telephony.euicc.EuiccManager=euicc_service, class android.media.soundtrigger.SoundTriggerManager=soundtrigger, class android.view.accessibility.CaptioningManager=captioning, class android.app.usage.UsageStatsManager=usagestats, class android.view.inputmethod.InputMethodManager=input_method, class android.hardware.ConsumerIrManager=consumer_ir, class android.net.wifi.WifiManager=wifi, class android.print.PrintManager=print, class android.telephony.CarrierConfigManager=carrier_config, class android.media.tv.TvInputManager=tv_input, class android.app.VrManager=vrmanager, class android.service.oemlock.OemLockManager=oem_lock, class android.app.trust.TrustManager=trust, class android.os.UserManager=user, class android.location.CountryDetector=country_detector, class android.media.midi.MidiManager=midi, class android.text.ClipboardManager=clipboard, class android.location.LocationManager=location, class android.net.wifi.WifiScanner=wifiscanner, class android.net.wifi.p2p.WifiP2pManager=wifip2p, interface android.view.WindowManager=window, class android.view.accessibility.AccessibilityManager=accessibility, class android.net.NetworkPolicyManager=netpolicy, class android.os.BatteryManager=batterymanager, class android.app.NotificationManager=notification, class android.net.nsd.NsdManager=servicediscovery, class android.accounts.AccountManager=account, class android.hardware.SerialManager=serial, class android.telephony.SubscriptionManager=te
01-10 14:12:16.037239   522   522 I SystemServiceRegistry: registerAllMtkService start
01-10 14:12:16.037371   522   522 I MtkSystemServiceRegistry: registerAllService start
01-10 14:12:16.040028   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:16.040964   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.054325   398   640 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=23.97 dur=1001.24 max=43.51 min=39.99
01-10 14:12:16.063522   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.082242   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.105405   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.113612   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:16.119845   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:16.123819   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.147262   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.147860   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.ir@1.0::IConsumerIr/default in either framework or device manifest.
01-10 14:12:16.163766   943   943 D AlarmManagerService: Kernel timezone updated to -480 minutes west of GMT
01-10 14:12:16.163856   403   703 D ccci_mdinit: (1):save_timezone++
01-10 14:12:16.164872   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.180501   943   943 D AES     : AEEIOCTL_RT_MON_Kick IOCTL,cmd= 2147774474, lParam=0. 
01-10 14:12:16.189049   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.189748   523   562 D AAL     : 01-10 02:12:16.001 BL= 352,ESS= 256, 01-10 02:12:16.038 BL= 351,ESS= 256, 01-10 02:12:16.095 BL= 350,ESS= 256, 01-10 02:12:16.133 BL= 349,ESS= 256, 01-10 02:12:16.189 BL= 348,ESS= 256, 
01-10 14:12:16.192318   548   882 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:16.190000   548   548 W HwBinder:548_2: type=1400 audit(0.0:44): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:16.206502   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.215505   398   640 I SurfaceFlinger: [SF client] NEW(0x7f769df900) for (943:system_server)
01-10 14:12:16.228557   398   640 I SurfaceFlinger: EventThread Client Pid (943) created
01-10 14:12:16.229264   398   640 I SurfaceFlinger: EventThread Client Pid (943) created
01-10 14:12:16.230903   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.233357   398   640 I SurfaceFlinger: EventThread Client Pid (943) created
01-10 14:12:16.234020   398   640 I SurfaceFlinger: EventThread Client Pid (943) created
01-10 14:12:16.237663   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:24.140682,dur:1035.60,max:56.99,min:36.25
01-10 14:12:16.247674   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.263092   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.vr@1.0::IVr/default in either framework or device manifest.
01-10 14:12:16.263308   943   943 W VrManagerService: init_native: Could not open IVr interface
01-10 14:12:16.264101   548   881 E /vendor/bin/hw/camerahalserver: Could not unregister service notification for android.frameworks.sensorservice@1.0::ISensorManager/default.
01-10 14:12:16.269453   943  1073 I zygote64: hidl_ssvc_poll started.
01-10 14:12:16.270955   547  1062 I Gyroscope: batch: handle:3, flag:0,samplingPeriodNs:20000000 maxBatchReportLatencyNs:0
01-10 14:12:16.271594   547  1062 I Gyroscope: enable: handle:3, en:1
01-10 14:12:16.272821   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.274529   547  1062 E Gyroscope: MPE_gyr_calib_read 0.000246 -0.005214 -0.000687,0.000000 0.000000 0.000000,0.000246 -0.005214 -0.000687
01-10 14:12:16.277551   943  1075 D EventHub: No input device configuration file found for device 'STM VL53L0 proximity sensor'.
01-10 14:12:16.277655   943  1075 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 14:12:16.277699   943  1075 I EventHub: New device: id=1, fd=117, path='/dev/input/event3', name='STM VL53L0 proximity sensor', classes=0x800, configuration='', keyLayout='', keyCharacterMap='', builtinKeyboard=false, 
01-10 14:12:16.278069   943  1075 D EventHub: No input device configuration file found for device 'mtk-kpd'.
01-10 14:12:16.282829   943  1075 W EventHub: Unable to disable kernel key repeat for /dev/input/event2: Function not implemented
01-10 14:12:16.282930   943  1075 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 14:12:16.282970   943  1075 I EventHub: New device: id=2, fd=118, path='/dev/input/event2', name='mtk-kpd', classes=0x1, configuration='', keyLayout='/system/usr/keylayout/mtk-kpd.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 14:12:16.283356   943  1075 D EventHub: No input device configuration file found for device 'tp-kpd'.
01-10 14:12:16.288311   943  1075 W EventHub: Unable to disable kernel key repeat for /dev/input/event6: Function not implemented
01-10 14:12:16.288394   943  1075 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 14:12:16.288419   943  1075 I EventHub: New device: id=3, fd=119, path='/dev/input/event6', name='tp-kpd', classes=0x1, configuration='', keyLayout='/system/usr/keylayout/Generic.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 14:12:16.288682   943  1075 D EventHub: No input device configuration file found for device 'scan-keys'.
01-10 14:12:16.289517   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.291875   943  1075 W EventHub: Unable to disable kernel key repeat for /dev/input/event1: Function not implemented
01-10 14:12:16.291976   943  1075 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 14:12:16.292004   943  1075 I EventHub: New device: id=4, fd=120, path='/dev/input/event1', name='scan-keys', classes=0x1, configuration='', keyLayout='/system/usr/keylayout/scan-keys.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 14:12:16.292309   943  1075 D EventHub: No input device configuration file found for device 'low_g'.
01-10 14:12:16.310091   522   522 E ActivityRecognitionHardware: activity_recognition HAL is deprecated. class_init is effectively a no-op
01-10 14:12:16.314785   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.331252   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.339483   522   522 W Zygote  : Class not found for preloading: android.icu.impl.number.Parse
01-10 14:12:16.339728   943  1075 D EventHub: No input device configuration file found for device 'mtk-tpd'.
01-10 14:12:16.340072   943  1075 E filemap : mmap(0,4096) failed: No such device
01-10 14:12:16.343814   943  1075 W EventHub: Unable to disable kernel key repeat for /dev/input/event5: Function not implemented
01-10 14:12:16.343945   943  1075 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 14:12:16.343970   943  1075 I EventHub: New device: id=6, fd=122, path='/dev/input/event5', name='mtk-tpd', classes=0x15, configuration='', keyLayout='/system/usr/keylayout/Generic.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 14:12:16.344181   943  1075 D EventHub: No input device configuration file found for device 'ACCDET'.
01-10 14:12:16.346542   943  1075 W EventHub: Unable to disable kernel key repeat for /dev/input/event0: Function not implemented
01-10 14:12:16.346592   943  1075 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 14:12:16.346611   943  1075 I EventHub: New device: id=7, fd=123, path='/dev/input/event0', name='ACCDET', classes=0x81, configuration='', keyLayout='/system/usr/keylayout/ACCDET.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 14:12:16.350419   943  1075 I InputReader: Device added: id=-1, name='Virtual', sources=0x00000301
01-10 14:12:16.350754   943  1075 I InputReader: Device added: id=7, name='ACCDET', sources=0x80000101
01-10 14:12:16.351808   943  1075 I InputReader:   Touch device 'mtk-tpd' could not query the properties of its associated display.  The device will be inoperable until the display size becomes available.
01-10 14:12:16.351929   943  1075 I InputReader: Device added: id=6, name='mtk-tpd', sources=0x00001103
01-10 14:12:16.352019   943  1075 I InputReader: Device added: id=4, name='scan-keys', sources=0x00000101
01-10 14:12:16.352070   943  1075 I InputReader: Device added: id=3, name='tp-kpd', sources=0x00000101
01-10 14:12:16.352100   943  1075 I InputReader: Device added: id=2, name='mtk-kpd', sources=0x00000101
01-10 14:12:16.352199   943  1075 I InputReader: Device added: id=1, name='STM VL53L0 proximity sensor', sources=0x00004002
01-10 14:12:16.352575   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000080
01-10 14:12:16.352722   943  1075 I InputReader: Device reconfigured: id=6, name='mtk-tpd', size 720x1280, orientation 0, mode 1, display id 0
01-10 14:12:16.353631   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 14:12:16.353808   522   522 I zygote  : Thread[1,tid=522,Native,Thread*=0xf00da000,peer=0x12dc0228,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
01-10 14:12:16.354358   522   522 D MtpDeviceJNI: register_android_mtp_MtpDevice
01-10 14:12:16.355156   522   522 I zygote  : Thread[1,tid=522,Native,Thread*=0xf00da000,peer=0x12dc0228,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
01-10 14:12:16.356028   522   522 I zygote  : Thread[1,tid=522,Native,Thread*=0xf00da000,peer=0x12dc0228,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
01-10 14:12:16.360687   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.362628   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 14:12:16.376790   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.382174   522   522 D MtkSettingsProviderExt: Global moveToSecure
01-10 14:12:16.384553   522   522 D MtkSettingsProviderExt: Secure moveToGlobal
01-10 14:12:16.385223   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 14:12:16.386268   522   522 D MtkSettingsProviderExt: System moveToSecure
01-10 14:12:16.386592   522   522 D MtkSettingsProviderExt: System moveToGlobal
01-10 14:12:16.387519   522   522 D MtkSettingsProviderExt: putInPublicSettings
01-10 14:12:16.391883   531  1049 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 14:12:16.392063   531  1049 E installd: Failed to enable USRQUOTA on /dev/block/dm-2: File exists
01-10 14:12:16.392089   531  1049 E installd: Failed to enable GRPQUOTA on /dev/block/dm-2: File exists
01-10 14:12:16.393095   531   558 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 14:12:16.393189   531   558 E installd: Failed to enable USRQUOTA on /dev/block/dm-2: File exists
01-10 14:12:16.393211   531   558 E installd: Failed to enable GRPQUOTA on /dev/block/dm-2: File exists
01-10 14:12:16.402375   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.405754   547  1062 W hw-IPCThreadState: All binder threads in pool (2 threads) busy for 134 ms
01-10 14:12:16.406440   548   881 W libutils.threads: Thread (this=0xf1337200): don't call join() from this Thread object's thread. It's a guaranteed deadlock!
01-10 14:12:16.406913   547  1062 I Gyroscope: enable: handle:3, en:0
01-10 14:12:16.416133   523   562 D AAL     : 01-10 02:12:16.227 BL= 347,ESS= 256, 01-10 02:12:16.283 BL= 346,ESS= 256, 01-10 02:12:16.321 BL= 345,ESS= 256, 01-10 02:12:16.378 BL= 344,ESS= 256, 01-10 02:12:16.416 BL= 343,ESS= 256, 
01-10 14:12:16.419784   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.441466   943   943 I zygote64: Looking for service android.hardware.oemlock@1.0::IOemLock/default
01-10 14:12:16.443076   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.oemlock@1.0::IOemLock/default in either framework or device manifest.
01-10 14:12:16.443357   943   943 E zygote64: service android.hardware.oemlock@1.0::IOemLock declares transport method EMPTY but framework expects hwbinder.
01-10 14:12:16.445081   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.448908   943   943 I zygote64: Looking for service android.hardware.oemlock@1.0::IOemLock/default
01-10 14:12:16.449629   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.oemlock@1.0::IOemLock/default in either framework or device manifest.
01-10 14:12:16.449845   943   943 E zygote64: service android.hardware.oemlock@1.0::IOemLock declares transport method EMPTY but framework expects hwbinder.
01-10 14:12:16.461973   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.487294   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.492187   943  1076 I PackageManager: No secure containers found
01-10 14:12:16.504729   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.515743   547  1062 W hw-IPCThreadState: All binder threads in pool (2 threads) busy for 109 ms
01-10 14:12:16.528701   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.544703   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.554278   522   522 I Zygote  : ...preloaded 4715 classes in 534ms.
01-10 14:12:16.554447   522   522 I zygote  : VMRuntime.preloadDexCaches starting
01-10 14:12:16.570606   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.584135   943  1076 W StorageManagerService: No primary storage defined yet; hacking together a stub
01-10 14:12:16.585138   943  1076 W StorageManagerService: No primary storage defined yet; hacking together a stub
01-10 14:12:16.586683   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.612532   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.628440   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.649377   806   926 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 14:12:16.649570   806   926 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 14:12:16.649611   806   926 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 14:12:16.653000   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:16.654294   943   943 D MtkFakeNtpTrustedTime: creating MtkFakeNtpTrustedTime using null
01-10 14:12:16.654397   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.657014   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:16.661143   523   562 D AAL     : 01-10 02:12:16.472 BL= 342,ESS= 256, 01-10 02:12:16.510 BL= 341,ESS= 256, 01-10 02:12:16.566 BL= 340,ESS= 256, 01-10 02:12:16.604 BL= 339,ESS= 256, 01-10 02:12:16.661 BL= 338,ESS= 256, 
01-10 14:12:16.670247   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.673647   522   522 I zygote  : VMRuntime.preloadDexCaches strings total=360436 before=13118 after=13118
01-10 14:12:16.673776   522   522 I zygote  : VMRuntime.preloadDexCaches types total=30514 before=6502 after=6516
01-10 14:12:16.673813   522   522 I zygote  : VMRuntime.preloadDexCaches fields total=142505 before=5834 after=5892
01-10 14:12:16.673844   522   522 I zygote  : VMRuntime.preloadDexCaches methods total=267782 before=12265 after=12328
01-10 14:12:16.673871   522   522 I zygote  : VMRuntime.preloadDexCaches finished
01-10 14:12:16.680175   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:16.681816   943   943 D MtkFakeNtpTrustedTime: creating MtkFakeNtpTrustedTime using null
01-10 14:12:16.696370   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.712485   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.730437   943   943 D WifiApConfigStore: 2G band allowed channels are:0
01-10 14:12:16.738040   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.754095   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.775168   522   522 I Zygote  : Preloading resources...
01-10 14:12:16.780162   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.796104   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.802435   522   522 W Resources: Preloaded drawable resource #0x1080264 (android:drawable/dialog_background_material) that varies with configuration!!
01-10 14:12:16.802792   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:16.806101   943   943 D MtkIpRunningState: Initialize MtkIpRunningState
01-10 14:12:16.809134   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:16.810484   943   943 D MtkIpStoppedState: Initialize MtkIpStoppedState
01-10 14:12:16.810917   943  1090 D MtkIpStoppedState: enter
01-10 14:12:16.812998   943   943 D WifiStateMachine: Initialize MtkL2ConnectedState
01-10 14:12:16.814323   943  1090 E IpManager.wlan0: ERROR Failed to disable IPv6: java.lang.IllegalStateException: command '1 interface ipv6 wlan0 disable' failed with '400 1 Failed to change IPv6 state (No such file or directory)'
01-10 14:12:16.815645   943  1089 E HalDeviceManager: isSupported: called but mServiceManager is null!?
01-10 14:12:16.815927   943  1089 I WifiNative-wlan0: Vendor HAL not supported, Ignore stop...
01-10 14:12:16.816053   943  1089 D WificondControl: tearing down interfaces in wificond
01-10 14:12:16.816135   541   652 D CommandListener: Clearing all IP addresses on wlan0
01-10 14:12:16.821874   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.825379   943   943 D WifiController: isAirplaneModeOn = false, isWifiEnabled = false, isScanningAvailable = false
01-10 14:12:16.833112   943   943 I WifiService: getVerboseLoggingLevel uid=1000
01-10 14:12:16.833697   943   943 E SupplicantStaIfaceHal: Can't call setDebugParams, ISupplicant is null
01-10 14:12:16.833948   943   943 W WifiDiags: Failed to start packet fate monitoring
01-10 14:12:16.834907   943   943 I WifiService: Registering wifi
01-10 14:12:16.838112   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.840158   943   943 I WifiScanningService: Creating wifiscanner
01-10 14:12:16.843140   943   943 I WifiScanningService: Publishing wifiscanner
01-10 14:12:16.848150   943   943 I RttService: Creating rttmanager
01-10 14:12:16.852099   943   943 I RttService: Starting rttmanager
01-10 14:12:16.856370   522   522 I Zygote  : ...preloaded 64 resources in 81ms.
01-10 14:12:16.863621   522   522 W Resources: Preloaded color resource #0x1060053 (android:color/btn_default_material_dark) that varies with configuration!!
01-10 14:12:16.864135   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.864975   943   943 I WifiP2pService: Registering wifip2p
01-10 14:12:16.866100   522   522 I Zygote  : ...preloaded 41 resources in 8ms.
01-10 14:12:16.869161   943   943 I EthernetServiceImpl: Creating EthernetConfigStore
01-10 14:12:16.871436   943   943 E IpConfigStore: Error opening configuration file: java.io.FileNotFoundException: /data/misc/ethernet/ipconfig.txt (No such file or directory)
01-10 14:12:16.871672   943   943 W EthernetConfigStore: No Ethernet configuration found. Using default.
01-10 14:12:16.871814   943   943 I EthernetServiceImpl: Read stored IP configuration: IP assignment: DHCP
01-10 14:12:16.871814   943   943 I EthernetServiceImpl: Proxy settings: NONE
01-10 14:12:16.878599   943   943 I EthernetService: Registering service ethernet
01-10 14:12:16.880126   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.884103   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:16.905712   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.906570   523   562 D AAL     : 01-10 02:12:16.698 BL= 337,ESS= 256, 01-10 02:12:16.755 BL= 336,ESS= 256, 01-10 02:12:16.793 BL= 335,ESS= 256, 01-10 02:12:16.849 BL= 334,ESS= 256, 01-10 02:12:16.906 BL= 335,ESS= 256, 
01-10 14:12:16.921560   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.947546   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.956672   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:16.961125   943   943 D MtkIPv6TetheringCoordinator: MtkIPv6TetheringCoordinator
01-10 14:12:16.961392   943   943 D Tethering: MtkIPv6TetheringCoordinator is loaded
01-10 14:12:16.962889   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:16.966595   943   943 D Tethering: getMtkTethering is loaded
01-10 14:12:16.989253   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:16.996197   522   522 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 14:12:17.004692   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.030995   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.046377   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.058690   398   421 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=23.90 dur=1004.37 max=48.00 min=39.64
01-10 14:12:17.072801   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.088157   943   943 W TelecomManager: Telecom Service not found.
01-10 14:12:17.088408   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.090650   524   524 D PermissionCache: checking android.permission.MODIFY_AUDIO_SETTINGS for uid=1000 => granted (1714 us)
01-10 14:12:17.090933   524   524 D APM_AudioPolicyManager: setForceUse() usage 4, config 0, mPhoneState 0
01-10 14:12:17.091507   524   707 D APM_AudioPolicyManager: setForceUse() usage 3, config 8, mPhoneState 0
01-10 14:12:17.092909   524   707 D APM_AudioPolicyManager: setForceUse() usage 6, config 0, mPhoneState 0
01-10 14:12:17.093246   524   798 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 14:12:17.093262   524   818 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 14:12:17.094589   377   377 D AudioALSAStreamManager: setMicMute(), mMicMute: 0 => 0
01-10 14:12:17.097223   377   377 D AudioALSAStreamManager: +SetInputMute(), 0
01-10 14:12:17.097601   377  1107 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 14:12:17.097733   377   377 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 14:12:17.113253   943   943 D AudioService: applyDeviceVolumemStreamType:3,device:2
01-10 14:12:17.113798   943   943 D AudioService: applyDeviceVolumemStreamType:3,device:1073741824
01-10 14:12:17.113990   943   943 D AudioService: applyDeviceVolumemStreamType:9,device:2
01-10 14:12:17.114115   943   943 D AudioService: applyDeviceVolumemStreamType:9,device:1073741824
01-10 14:12:17.114220   943   943 D AudioService: applyDeviceVolumemStreamType:10,device:2
01-10 14:12:17.114313   943   943 D AudioService: applyDeviceVolumemStreamType:10,device:1073741824
01-10 14:12:17.114613   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.129826   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.144411   522   522 D libEGL  : loaded /vendor/lib/egl/libGLES_mali.so
01-10 14:12:17.151343   523   562 D AAL     : 01-10 02:12:16.962 BL= 336,ESS= 256, 01-10 02:12:17.000 BL= 337,ESS= 256, 01-10 02:12:17.057 BL= 338,ESS= 256, 01-10 02:12:17.094 BL= 339,ESS= 256, 01-10 02:12:17.151 BL= 340,ESS= 256, 
01-10 14:12:17.154830   943   943 I zygote64: Looking for service android.hidl.manager@1.0::IServiceManager/default
01-10 14:12:17.156365   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.157305   943   943 I zygote64: Starting thread pool.
01-10 14:12:17.161347   943   943 I zygote64: Looking for service android.hardware.usb@1.0::IUsb/default
01-10 14:12:17.162267   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.usb@1.0::IUsb/default in either framework or device manifest.
01-10 14:12:17.162500   943   943 E zygote64: service android.hardware.usb@1.0::IUsb declares transport method EMPTY but framework expects hwbinder.
01-10 14:12:17.171544   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.174095   943   943 D HardwarePropertiesManagerService-JNI: Link to death notification successful
01-10 14:12:17.190000   548   548 W HwBinder:548_2: type=1400 audit(0.0:45): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:17.192744   548   882 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:17.198304   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.213947   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.218310   522   522 I Zygote  : Preloading shared libraries...
01-10 14:12:17.225081   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.contexthub@1.0::IContexthub/default in either framework or device manifest.
01-10 14:12:17.225257   943  1060 E ContextHubService: Could not load context hub hal
01-10 14:12:17.225373   943  1060 W ContextHubService: No Context Hub Module present
01-10 14:12:17.227947   943   943 D NtpTrustedTime: getServer:[time.android.com]
01-10 14:12:17.240140   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.245714   522   522 I Zygote  : Uninstalled ICU cache reference pinning...
01-10 14:12:17.248036   522   522 I Zygote  : Installed AndroidKeyStoreProvider in 2ms.
01-10 14:12:17.255685   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.262176   522   522 I Zygote  : Warmed up JCA providers in 14ms.
01-10 14:12:17.262273   522   522 D Zygote  : end preload
01-10 14:12:17.274931   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:26.032162,dur:1037.18,max:57.10,min:18.75
01-10 14:12:17.277235   943   943 W BackgroundDexOptService: SysProp pm.dexopt.downgrade_after_inactive_days not set
01-10 14:12:17.281940   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.293785   943   943 V MediaRouter: Adding route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 14:12:17.297265   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.298112   943   943 V MediaRouter: Selecting route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 14:12:17.323946   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.330614   943   943 I WindowManager: SAFE MODE not enabled
01-10 14:12:17.339118   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.348299   943   943 D OmadmService: OmadmService() ... constructor
01-10 14:12:17.350264   943   943 I debug   : [getDefaultDmManager]The binder is null
01-10 14:12:17.350426   943   943 D @M_OmadmService: IOmadm.getService
01-10 14:12:17.350800   943   943 I zygote64: Looking for service vendor.mediatek.hardware.omadm@1.0::IOmadm/omadm
01-10 14:12:17.354105   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry vendor.mediatek.hardware.omadm@1.0::IOmadm/omadm in either framework or device manifest.
01-10 14:12:17.354752   943   943 E zygote64: service vendor.mediatek.hardware.omadm@1.0::IOmadm declares transport method EMPTY but framework expects hwbinder.
01-10 14:12:17.355356   943   943 D @M_OmadmService: mOmadmProxy getService/setResponseFunctions: java.util.NoSuchElementException
01-10 14:12:17.364019   943   943 I zygote64: Looking for service vendor.mediatek.hardware.power@1.1::IPower/default
01-10 14:12:17.365626   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.368394   943   943 I zygote64: Starting thread pool.
01-10 14:12:17.377774   523   562 D AAL     : 01-10 02:12:17.189 BL= 341,ESS= 256, 01-10 02:12:17.245 BL= 342,ESS= 256, 01-10 02:12:17.283 BL= 343,ESS= 256, 01-10 02:12:17.339 BL= 344,ESS= 256, 01-10 02:12:17.377 BL= 345,ESS= 256, 
01-10 14:12:17.380896   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.396460   943   943 I zygote64: Looking for service android.hardware.weaver@1.0::IWeaver/default
01-10 14:12:17.397787   349   349 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.weaver@1.0::IWeaver/default in either framework or device manifest.
01-10 14:12:17.398087   943   943 E zygote64: service android.hardware.weaver@1.0::IWeaver declares transport method EMPTY but framework expects hwbinder.
01-10 14:12:17.407625   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.423446   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.434676   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:17.436032   943   943 D MtkIpConnectivityMetrics: MtkIpConnectivityMetrics is created:true
01-10 14:12:17.445090   943   943 D WifiAsyncChannel.WifiService: sendMessageSynchronously.send message=131207
01-10 14:12:17.446693   943  1089 D WifiStateMachine:  InitialState !CMD_INITIALIZE uid=1000 rt=16587/16587 0 0
01-10 14:12:17.446831   943  1089 D WifiStateMachine:  DefaultState !CMD_INITIALIZE uid=1000 rt=16587/16587 0 0
01-10 14:12:17.446954   943  1089 D HalDeviceManager: initIServiceManagerIfNecessary
01-10 14:12:17.447071   943  1089 I zygote64: Looking for service android.hidl.manager@1.0::IServiceManager/default
01-10 14:12:17.448366   943  1089 I zygote64: Starting thread pool.
01-10 14:12:17.449286   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.450324   943  1089 D HalDeviceManager: isSupportedInternal
01-10 14:12:17.450444   943  1070 D HalDeviceManager: IWifi registration notification: fqName=android.hardware.wifi@1.0::IWifi, name=default, preexisting=true
01-10 14:12:17.451162   943  1070 D HalDeviceManager: initIWifiIfNecessary
01-10 14:12:17.451162   943  1089 D HalDeviceManager: initIWifiIfNecessary
01-10 14:12:17.451811   943  1070 I zygote64: Looking for service android.hardware.wifi@1.0::IWifi/default
01-10 14:12:17.452913   943  1070 I zygote64: Starting thread pool.
01-10 14:12:17.455294   943  1070 D HalDeviceManager: stopWifi
01-10 14:12:17.456069   943  1070 D HalDeviceManager: dispatchAllDestroyedListeners
01-10 14:12:17.457235   943   943 D WifiAsyncChannel.WifiService: sendMessageSynchronously.recv message=131207 sendingUid=1000
01-10 14:12:17.458059   943   943 D MtkOpExtManager: initialize: android.app.ContextImpl@f439358
01-10 14:12:17.458838   943   943 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:17.458944   943   943 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:17.459107   943   943 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:17.459107   943   943 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:Op01WifiService.apk:com.mediatek.op.wifi.Op01WifiOperatorFactory:com.mediatek.server.wifi.op01)
01-10 14:12:17.459107   943   943 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP09_null_null:Op09WifiService.apk:com.mediatek.op.wifi.Op09WifiOperatorFactory:com.mediatek.server.wifi.op09)
01-10 14:12:17.461810   943   943 D MtkOpExtManager: initialize done
01-10 14:12:17.462059   943   943 I WifiScanningService: Starting wifiscanner
01-10 14:12:17.462309   943  1088 D WifiController: Enter ApStaDisabledState mScreenOff=false
01-10 14:12:17.462551   943  1089 D WifiStateMachine:  InitialState !CMD_STOP_SUPPLICANT rt=16603/16603 0 0
01-10 14:12:17.462634   943  1089 D WifiStateMachine:  DefaultState !CMD_STOP_SUPPLICANT rt=16603/16603 0 0
01-10 14:12:17.464696   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.465081   943   943 I RttService: Registering rttmanager
01-10 14:12:17.467506   943   943 I EthernetServiceImpl: Starting Ethernet service
01-10 14:12:17.470823   943   943 D Ethernet: Registering NetworkFactory
01-10 14:12:17.480957   524   524 D PermissionCache: checking android.permission.CAPTURE_AUDIO_HOTWORD for uid=1000 => granted (189 us)
01-10 14:12:17.480974   943  1112 D Ethernet: got request NetworkRequest [ REQUEST id=1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 14:12:17.481206   943  1112 D Ethernet: got request NetworkRequest [ TRACK_DEFAULT id=3, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 14:12:17.482945   943   943 D ContextHubSystemService: onBootPhase: PHASE_SYSTEM_SERVICES_READY
01-10 14:12:17.490320   943  1113 I WifiService: getWifiApEnabledState uid=1000
01-10 14:12:17.490520   943  1113 I WifiService: getWifiApEnabledState uid=1000
01-10 14:12:17.490972   943   943 I zygote64: Looking for service android.hardware.configstore@1.0::ISurfaceFlingerConfigs/default
01-10 14:12:17.491566   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.493502   943   943 I zygote64: Starting thread pool.
01-10 14:12:17.506686   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.512703   398   640 I SurfaceFlinger: EventThread Client Pid (943) created
01-10 14:12:17.513587   398   640 I SurfaceFlinger: EventThread Client Pid (943) created
01-10 14:12:17.522920   943  1018 W DefaultPermGrantPolicy: Unknown package:com.google.android.apps.assistant
01-10 14:12:17.533287   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.537856   943  1008 D WifiP2pService: getMessenger: uid=1000, binder=android.os.Binder@91d81b1, messenger=android.os.Messenger@efa5696
01-10 14:12:17.538383   943  1008 D HalDeviceManager: createIface: ifaceType=2
01-10 14:12:17.538584   943  1008 D HalDeviceManager: getAllChipInfo
01-10 14:12:17.540494   943  1008 D HalDeviceManager: getChipIds=[]
01-10 14:12:17.540674   943  1008 E HalDeviceManager: Should have at least 1 chip!
01-10 14:12:17.540729   943  1008 E HalDeviceManager: createIface: no chip info found
01-10 14:12:17.540755   943  1008 D HalDeviceManager: stopWifi
01-10 14:12:17.541515   943  1008 D HalDeviceManager: dispatchAllDestroyedListeners
01-10 14:12:17.541627   943  1089 D ManagerStatusListenerProxy: ListenerProxy.handleMessage: what=0
01-10 14:12:17.541792   943  1089 D HalDeviceManager: isWifiStart
01-10 14:12:17.542594   943  1089 I WifiVendorHal: Device Manager onStatusChanged. isReady(): true, isStarted(): false
01-10 14:12:17.548721   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.575436   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.590657   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.617215   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.618674   943  1097 I MtkTethering: Intent:Intent { act=android.intent.action.LOCALE_CHANGED flg=0x51200010 }
01-10 14:12:17.619974   943   943 D BatteryService: mPlugType = 2, mIsTemperatureWarningState = false
01-10 14:12:17.622900   523   562 D AAL     : 01-10 02:12:17.434 BL= 346,ESS= 256, 01-10 02:12:17.471 BL= 347,ESS= 256, 01-10 02:12:17.528 BL= 348,ESS= 256, 01-10 02:12:17.566 BL= 349,ESS= 256, 01-10 02:12:17.622 BL= 350,ESS= 256, 
01-10 14:12:17.623230   943  1097 D Tethering: sendTetherStateChangedBroadcast avail=[] local_only=[] tether=[] error=[]
01-10 14:12:17.623623   943  1097 I MtkTethering: Intent:Intent { act=android.net.conn.TETHER_STATE_CHANGED flg=0x24000010 (has extras) }
01-10 14:12:17.623651   943  1095 D WifiHandler.WifiP2pService: Received message=139323d sendingUid=1000
01-10 14:12:17.624006   943  1097 I MtkTethering: showTetheredNotification:false:0
01-10 14:12:17.624997   943  1095 D WifiAsyncChannel.WifiP2pService: replyToMessage recvdMessage=139323 sendingUid=1000 sentMessage=139324
01-10 14:12:17.625186   943  1097 I MtkTethering: Ignore
01-10 14:12:17.630069   806   929 I EMDLOGGER1: MDL rate:150 KB/s, full count:0
01-10 14:12:17.632564   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.640734   943  1008 W AlarmManager: Unrecognized alarm listener com.mediatek.server.display.MtkWifiDisplayController$1@65d7b88
01-10 14:12:17.659231   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.674410   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.701132   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.703786   943   943 E PowerHalManagerImpl: <checkWetherSupport> sHasChecked: false
01-10 14:12:17.704157   943   943 I PowerHalManagerImpl: <checkWetherSupport> clazz: class com.mediatek.powerhalwrapper.PowerHalWrapper
01-10 14:12:17.704453   943   943 I PowerHalManagerImpl: <checkWetherSupport> methodSetRotationBoost: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setRotationBoost(int)
01-10 14:12:17.704514   943   943 I PowerHalManagerImpl: <checkWetherSupport> methodSetFpsGo: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setFpsGo(boolean)
01-10 14:12:17.704570   943   943 I PowerHalManagerImpl: <checkWetherSupport> methodSetInstallationBoost: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setInstallationBoost(boolean)
01-10 14:12:17.704628   943   943 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostResume: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostResume(java.lang.String,java.lang.String)
01-10 14:12:17.704678   943   943 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostNotify: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostNotify(int,java.lang.String,java.lang.String)
01-10 14:12:17.704734   943   943 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostProcessCreate: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostProcessCreate(java.lang.String,java.lang.String)
01-10 14:12:17.704791   943   943 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostStop: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostStop()
01-10 14:12:17.704864   943   943 I PowerHalManagerImpl: <checkWetherSupport> methodSetSpeedDownload: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setSpeedDownload(int)
01-10 14:12:17.704910   943   943 D PowerHalManagerImpl: <checkWetherSupport> sIsMtkPowerHalExist: true
01-10 14:12:17.705071   943   943 E PowerHalWrapper: PowerHalWrapper
01-10 14:12:17.705183   943   943 I zygote64: Looking for service vendor.mediatek.hardware.power@1.1::IPower/default
01-10 14:12:17.706488   943   943 I zygote64: Starting thread pool.
01-10 14:12:17.707882   943   943 E PowerHalWrapper: DeathRecipient
01-10 14:12:17.709170   943   943 E PowerHalWrapper: pextpeak_period: 0
01-10 14:12:17.716346   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.735301   943   943 E BitmapFactory: Unable to decode stream: java.io.FileNotFoundException: /data/system/users/0/wallpaper_orig (No such file or directory)
01-10 14:12:17.743128   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.758653   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.773046   943  1105 D AudioSystem: +setParameters(): A2dpSuspended=false 
01-10 14:12:17.775163   377  1107 D AudioALSAHardware: +setParameters(): A2dpSuspended=false
01-10 14:12:17.775976   377  1107 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "A2dpSuspended=false"
01-10 14:12:17.776119   377  1107 D AudioALSAHardware: -setParameters(): A2dpSuspended=false 
01-10 14:12:17.779698   943  1105 D AudioService: setBluetoothScoOnInt : false, eventSource = resetBluetoothSco
01-10 14:12:17.779862   943  1105 D AudioSystem: +setParameters(): BT_SCO=off 
01-10 14:12:17.780523   377  1107 D AudioALSAHardware: +setParameters(): BT_SCO=off
01-10 14:12:17.780783   377  1107 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "BT_SCO=off"
01-10 14:12:17.780815   377  1107 D AudioALSAHardware: -setParameters(): BT_SCO=off 
01-10 14:12:17.784994   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.785496   524   524 I AudioFlinger: systemReady
01-10 14:12:17.787151   943  1006 W TelecomManager: Telecom Service not found.
01-10 14:12:17.794849   943  1006 W TelecomManager: Telecom Service not found.
01-10 14:12:17.801852   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.805841  1138  1138 W /system/bin/sdcard: Device explicitly enabled sdcardfs
01-10 14:12:17.808452   943  1147 V NuMediaExtractor: setDataSource fd=189 (/system/media/audio/ui/Effect_Tick.ogg), offset=0, length=5136
01-10 14:12:17.813822   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:17.814218   528   733 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:17.816298   943  1061 D WebViewLibraryLoader: Setting new address space to 125701040
01-10 14:12:17.818565   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:17.818545   943   943 W NetworkManagement: setDataSaverMode(): already false
01-10 14:12:17.818816   528   733 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:17.822431   943  1004 I WifiService: requestActivityInfo uid=1000
01-10 14:12:17.822550   943  1004 I WifiService: reportActivityInfo uid=1000
01-10 14:12:17.822596   943  1004 I WifiService: getSupportedFeatures uid=1000
01-10 14:12:17.822631   943  1004 D WifiAsyncChannel.WifiService: sendMessageSynchronously.send message=131133
01-10 14:12:17.822823  1117  1117 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:17.822949   943  1089 D WifiStateMachine:  InitialState !CMD_GET_SUPPORTED_FEATURES uid=1000 rt=16963/16963 0 0
01-10 14:12:17.823011   943  1089 D WifiStateMachine:  DefaultState !CMD_GET_SUPPORTED_FEATURES uid=1000 rt=16963/16963 0 0
01-10 14:12:17.823031   943  1089 D HalDeviceManager: isWifiStart
01-10 14:12:17.823745   943  1004 D WifiAsyncChannel.WifiService: sendMessageSynchronously.recv message=131133 sendingUid=1000
01-10 14:12:17.826988   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.828104   535   663 V APEExtractor: getAPEInfo not ape 20484
01-10 14:12:17.828743   535   663 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:17.833609   943  1147 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 14:12:17.842231   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.849275   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:17.850368   546   658 I OMXMaster: makeComponentInstance(OMX.google.aac.decoder) in omx@1.0-service process
01-10 14:12:17.853634  1130  1130 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:17.860949   555   579 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_AGPS_INIT
01-10 14:12:17.861623   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:17.862008   546  1160 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.ADPCM.MS) in omx@1.0-service process
01-10 14:12:17.868154   523   562 D AAL     : 01-10 02:12:17.660 BL= 351,ESS= 256, 01-10 02:12:17.717 BL= 352,ESS= 256, 01-10 02:12:17.776 BL= 353,ESS= 256, 01-10 02:12:17.830 BL= 354,ESS= 256, 01-10 02:12:17.868 BL= 355,ESS= 256, 
01-10 14:12:17.868785   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.878429   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:17.878933   546  1160 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.ADPCM.DVI) in omx@1.0-service process
01-10 14:12:17.884540   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:17.885002   546  1160 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.ALAC) in omx@1.0-service process
01-10 14:12:17.885810   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.889494   546  1160 D MtkOmxAlacDec: MtkOmxAlacDec::MtkOmxAlacDec this= 0xf0508000
01-10 14:12:17.889619   546  1160 D MtkOmxAlacDec: MtkOmxComponentCreate mCompHandle(0xf0508000)
01-10 14:12:17.889640   546  1160 D MtkOmxAlacDec: MtkOmxAlacDec::InitAudioParams(ALAC)
01-10 14:12:17.895985   546  1160 D MtkOmxAlacDec: +MtkOmxAlacDec::~MtkOmxAlacDec this= 0xf0508000
01-10 14:12:17.896051   546  1160 D MtkOmxAlacDec: -MtkOmxAlacDec::~MtkOmxAlacDec this= 0xf0508000
01-10 14:12:17.899835   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:17.900428   943  1085 W NetworkManagement: setDataSaverMode(): already false
01-10 14:12:17.900472   546   657 I OMXMaster: makeComponentInstance(OMX.google.amrnb.decoder) in omx@1.0-service process
01-10 14:12:17.910786   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.910898   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:17.911383   546   657 I OMXMaster: makeComponentInstance(OMX.google.amrwb.decoder) in omx@1.0-service process
01-10 14:12:17.923156   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:17.923737   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.APE) in omx@1.0-service process
01-10 14:12:17.926754   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.932174   943   943 D PermissionMonitor: Monitoring
01-10 14:12:17.936991   546   657 D MtkOmxApeDec: APE component create
01-10 14:12:17.937138  1176  1176 V WebViewLibraryLoader: RelroFileCreator (64bit = false),  32-bit lib: /system/app/webview/webview.apk!/lib/armeabi-v7a/libwebviewchromium.so, 64-bit lib: /system/app/webview/webview.apk!/lib/arm64-v8a/libwebviewchromium.so
01-10 14:12:17.937239   546   657 D MtkOmxApeDec: new BpMtkCodec
01-10 14:12:17.937256   546   657 D BpMtkCodecService: BpMtkCodecService ctor
01-10 14:12:17.940471   546   657 D BpMtkCodecService: BpMtkCodecService get getService Done
01-10 14:12:17.940598   546   657 D BpMtkCodecService: mtk.codecservice success
01-10 14:12:17.940613   546   657 D BpMtkCodecService: BpMtkCodecService::create
01-10 14:12:17.940764   393   393 E MtkCodecService: mtkcodecservice create
01-10 14:12:17.941030   546   657 D MtkOmxApeDec: create:0
01-10 14:12:17.941136   546   657 D MtkOmxApeDec: InitAudioParams:out_size:5184
01-10 14:12:17.943288  1117  1117 I LatinIME: Hardware accelerated drawing: true
01-10 14:12:17.944485   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(12288) returning hidl_memory(0x705b02b5f0, 12288)
01-10 14:12:17.948372   943   943 D PermissionMonitor: Users: 2, Apps: 80
01-10 14:12:17.952237   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:17.954079   546   657 D MtkOmxApeDec: [MtkOmxApeDec] Get HIDL input memory success.
01-10 14:12:17.956678   546   657 D MtkOmxApeDec: ~dtor+ this= 0xf0ad7000
01-10 14:12:17.956763   546   657 D MtkOmxApeDec: close handle
01-10 14:12:17.956779   546   657 D MtkOmxApeDec: call MtkCodec destroy+
01-10 14:12:17.956794   546   657 D BpMtkCodecService: BpMtkCodecService::Destroy
01-10 14:12:17.957187   393   393 E MtkCodecService: mtkcodecservice Destory
01-10 14:12:17.957440   546   657 D MtkOmxApeDec: call MtkCodec destroy-
01-10 14:12:17.957655   546   657 D BpMtkCodecService: ~BpMtkCodecService
01-10 14:12:17.958093  1189  1189 V WebViewLibraryLoader: RelroFileCreator (64bit = true),  32-bit lib: /system/app/webview/webview.apk!/lib/armeabi-v7a/libwebviewchromium.so, 64-bit lib: /system/app/webview/webview.apk!/lib/arm64-v8a/libwebviewchromium.so
01-10 14:12:17.959219  1130  1130 V SystemUIService: Starting SystemUI services for user 0.
01-10 14:12:17.960601   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:17.961003   546   657 I OMXMaster: makeComponentInstance(OMX.google.flac.decoder) in omx@1.0-service process
01-10 14:12:17.968190   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:17.984804   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:17.985167   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.G711.ALAW) in omx@1.0-service process
01-10 14:12:17.994399   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.005731   943  1215 D AES     : AEEIOCTL_RT_MON_Kick IOCTL,cmd= 2147774474, lParam=300. 
01-10 14:12:18.006772   387   387 D lights  : set_led_state colorRGB=FF00FF00, onMS=0, offMS=0
01-10 14:12:18.007109   387   387 D lights  : blink_green, level=0, onMS=0, offMS=0
01-10 14:12:18.007650   387   387 D lights  : write_int open fd=7
01-10 14:12:18.007841   387   387 D lights  : blink_green, level=255, onMS=0, offMS=0
01-10 14:12:18.008456   387   387 D lights  : write_int open fd=7
01-10 14:12:18.009732   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.010187   546  1199 I OMXMaster: makeComponentInstance(OMX.google.g711.alaw.decoder) in omx@1.0-service process
01-10 14:12:18.010791   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.011377  1130  1130 V MediaRouter: Adding route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 14:12:18.025645  1130  1130 V MediaRouter: Selecting route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 14:12:18.036108   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.046954   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.047448   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.G711.MLAW) in omx@1.0-service process
01-10 14:12:18.052102   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.053737   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.054318   546  1199 I OMXMaster: makeComponentInstance(OMX.google.g711.mlaw.decoder) in omx@1.0-service process
01-10 14:12:18.056505   943   943 D GnssLocationProvider: Link to death notification successful
01-10 14:12:18.056836   561   561 W MtkGnssHAL_GnssInterface: getExtensionXtra GnssXtra interface not implemented by HAL
01-10 14:12:18.061026   561   561 W MtkGnssHAL_GnssInterface: getExtensionGnssDebug: GnssDebug interface is not implemented by HAL
01-10 14:12:18.061628   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.062003   546  1199 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.GSM) in omx@1.0-service process
01-10 14:12:18.062058   561   561 W MtkGnssHAL_GnssInterface: getExtensionGnssConfiguration GnssConfiguration interface not implemented by GNSS HAL
01-10 14:12:18.062793   561   561 D vndksupport: Loading /vendor/lib64/hw/flp.mt6763.so from current namespace instead of sphal namespace.
01-10 14:12:18.065790   398   640 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=23.83 dur=1007.00 max=48.04 min=38.31
01-10 14:12:18.072697  1176  1176 I zygote  : System.exit called, status: 0
01-10 14:12:18.072870  1176  1176 I AndroidRuntime: VM exiting with result code 0, cleanup skipped.
01-10 14:12:18.075327   561   561 D         : mtk_flp_get_flp_interface
01-10 14:12:18.077790   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.080689   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.081169   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.MP3) in omx@1.0-service process
01-10 14:12:18.085485   943   943 I GnssLocationProvider: WakeLock acquired by sendMessage(INITIALIZE_HANDLER, 0, null)
01-10 14:12:18.087967   943   943 D MtkLocationExt: MtkLocationExt GnssLocationProvider()
01-10 14:12:18.088639   943   943 D MtkLocationExt: add GPS time sync handler and looper
01-10 14:12:18.089684   943   943 D GnssLocationProvider: mMtkGnssProvider = com.mediatek.location.MtkLocationExt$GnssLocationProvider@449049c
01-10 14:12:18.090269   561   561 D         : gpshal_gpscbs_save: Use GpsCallbacks
01-10 14:12:18.090422   943   943 D GnssLocationProvider: gnssSetCapabilitesCb: 65536u
01-10 14:12:18.090812   943   943 D GnssLocationProvider: gnssSetSystemInfoCb: yearOfHw=2015
01-10 14:12:18.091304   561   561 D         : socket_bind_udp: fd=8
01-10 14:12:18.091459   561   561 D         : socket_bind_udp: path=mtk_mnl2hal
01-10 14:12:18.091679   561   561 D hal2mnl : hal2mnl_gps_init: hal2mnl_gps_init
01-10 14:12:18.092072   943   943 E GnssLocationProvider: Unable to initialize GNSS Xtra interface
01-10 14:12:18.092018   520   691 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 14:12:18.092179   520   691 W MNLD    : hal_gps_init: hal_gps_init
01-10 14:12:18.092198   520   691 D MNL2AGPS: mnl2agps_gps_init: mnl2agps_gps_init
01-10 14:12:18.093145   555   580 D agps    : [agps][n][AGPS] [MNL] read  gps_init
01-10 14:12:18.093215   555   580 D agps    : [agps][n][CDMA] cdma_mgr_sync_gps_setting(): 1
01-10 14:12:18.093233   555   580 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_SET_PRIVACY_MODE
01-10 14:12:18.093249   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.093352   555   580 D agps    : [agps][n][CDMA] check_low_power_mode(): old=0, new=0
01-10 14:12:18.093404   555   580 D agps    : [agps] WARNING: [AGPS] agps2_mgr_aireplane_mode_from_c2k() flight_mode_state=[0] flight_mode_power_off_md=[1] is_cp_run=[0]
01-10 14:12:18.093429   555   580 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 14:12:18.093966   561   561 E GFC_INF : mtk_geo_set_project_config: mtk_flp_set_project_config - open fd fail! 2 (No such file or directory)
01-10 14:12:18.094059   561  1237 D GFC_INF : mnl2gfchal_jni_thread: mtk_gfc_hal_jni_thread, Create
01-10 14:12:18.094137   561   561 D         : mtk_hal_geofence_init: init geofence, cb function : ff3ab0c8
01-10 14:12:18.094104   943  1003 W zygote64: kill(-1176, 9) failed: No such process
01-10 14:12:18.094262   943  1003 I zygote64: Successfully killed process cgroup uid 1037 pid 1176 in 0ms
01-10 14:12:18.095805   520   691 D MNLD    : mnld_main_thread: gfc2mnl_hdlr msg
01-10 14:12:18.096033   520   691 D         : mtk_gfc_controller_process: MNLD_FLP_TYPE_FLP_ATTACH
01-10 14:12:18.096069   520   691 D         : gfc2mnl_hdlr: [GFC2MNLD]data from gfc: type=0xc8, session_id=0, len=0,read_len = 12
01-10 14:12:18.096104   520   691 D         : mnl_gfc_dump_buf: [GFC2MNLD]data from gfc: data=200,  0,  0,  0,  0,  0,  0,  0,
01-10 14:12:18.096127   520   691 D         : mnl_gfc_dump_buf: [GFC2MNLD]data from gfc: data=  0,  0,  0,  0,
01-10 14:12:18.096142   520   691 D MNLD    : mnld_gfc_attach: mnld_gfc_attach
01-10 14:12:18.096157   520   691 D         : mnld_gfc_attach_done: mnld_gfc_attach_done
01-10 14:12:18.096174   520   691 D         : mnl2gfc_hdlr: MNL_STATUS_ATTACH_DONE
01-10 14:12:18.096191   520   691 D MNLD    : mnld_gfc_attach: Send attach done to GFC succeed
01-10 14:12:18.096209   520   691 D         : mnld_gfc_session_update: mnld_gfc_session_update,id=1,type=1
01-10 14:12:18.096226   520   691 D         : mnl2gfc_hdlr: SESSION_UPDATE 1 support 1 mode 2
01-10 14:12:18.096246   520   691 D         : mtk_gfc_set_sys_mode: mtk_gfc_set_sys_mode success = 1
01-10 14:12:18.096261   520   691 D         : mnl2gfc_hdlr: SESSION_UPDATE: set ap mode
01-10 14:12:18.097780   561   561 E VzwDebugInterface: init: Vzw debug init, to set callback
01-10 14:12:18.098230   561   561 D hal2mnl : hal2mnl_gps_cleanup: hal2mnl_gps_cleanup
01-10 14:12:18.098582   520   691 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 14:12:18.098703   520   691 W MNLD    : hal_gps_cleanup: hal_gps_cleanup
01-10 14:12:18.098722   520   691 D MNL2AGPS: mnl2agps_gps_cleanup: mnl2agps_gps_cleanup
01-10 14:12:18.099662   555   580 D agps    : [agps][n][AGPS] [MNL] read  gps_cleanup
01-10 14:12:18.099737   555   580 D agps    : [agps][n][CDMA] cdma_mgr_sync_gps_setting(): 0
01-10 14:12:18.099755   555   580 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_SET_PRIVACY_MODE
01-10 14:12:18.099888   555   580 D agps    : [agps][n][CDMA] check_low_power_mode(): old=0, new=0
01-10 14:12:18.099936   555   580 D agps    : [agps] WARNING: [AGPS] agps2_mgr_aireplane_mode_from_c2k() flight_mode_state=[0] flight_mode_power_off_md=[1] is_cp_run=[0]
01-10 14:12:18.099960   555   580 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[0]
01-10 14:12:18.101875   561   561 D hal2mnl : hal2mnl_set_server: hal2mnl_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 14:12:18.102431   520   691 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 14:12:18.102611   520   691 D MNLD    : hal_set_server: hal_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 14:12:18.103319   555   580 D agps    : [agps][n][AGPS] [MNL] read  set_server  type=1 hostname=[supl.google.com] port=7275 aosp_profile_enable=0
01-10 14:12:18.103446   943   943 D LocationProviderProxy-network: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 14:12:18.104316   943   943 D LocationProviderProxy-network: bindBestPackage for com.android.location.service.v3.NetworkLocationProvider :  found 0, no new best component
01-10 14:12:18.106730   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.107312   546  1199 I OMXMaster: makeComponentInstance(OMX.google.mp3.decoder) in omx@1.0-service process
01-10 14:12:18.108581   943   943 D LocationProviderProxy-fused: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 14:12:18.108579  1189  1189 I zygote64: System.exit called, status: 0
01-10 14:12:18.108682  1189  1189 I AndroidRuntime: VM exiting with result code 0, cleanup skipped.
01-10 14:12:18.110055   943   943 D LocationProviderProxy-fused: bindBestPackage for com.android.location.service.FusedLocationProvider :  found 1, new best component: ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService}
01-10 14:12:18.110305   943   943 D LocationProviderProxy-fused: binding ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService} (v0) (u0)
01-10 14:12:18.113006   943   943 D GeocoderProxy: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 14:12:18.113898   943   943 D GeocoderProxy: bindBestPackage for com.android.location.service.GeocodeProvider :  found 0, no new best component
01-10 14:12:18.115991   943   943 D GeofenceProxy: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 14:12:18.117097   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.117460   546   657 I OMXMaster: makeComponentInstance(OMX.google.opus.decoder) in omx@1.0-service process
01-10 14:12:18.119854   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.121593   943  1003 W zygote64: kill(-1189, 9) failed: No such process
01-10 14:12:18.121725   943  1003 I zygote64: Successfully killed process cgroup uid 1037 pid 1189 in 0ms
01-10 14:12:18.124138   943   943 E ActivityRecognitionHardware: activity_recognition HAL is deprecated. is_supported is effectively a no-op
01-10 14:12:18.124638   943   943 D ActivityRecognitionProxy: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 14:12:18.125254   943   943 E ActivityRecognitionProxy: ServiceWatcher could not start.
01-10 14:12:18.125505  1130  1130 W SoundPool: Use of stream types is deprecated for operations other than volume control
01-10 14:12:18.125603  1130  1130 W SoundPool: See the documentation of SoundPool() for what to use instead with android.media.AudioAttributes to qualify your playback use case
01-10 14:12:18.125997   943   943 D LocationManagerService: updateProvidersLocked provider:fused changesMade: true isEnabled:false shouldBeEnabled:true
01-10 14:12:18.126244   943   943 D LocationManagerService: updateProvidersLocked provider:network changesMade: true isEnabled:false shouldBeEnabled:false
01-10 14:12:18.126387   943   943 I GnssLocationProvider: WakeLock acquired by sendMessage(ENABLE, 1, null)
01-10 14:12:18.126426   943   943 D LocationManagerService: updateProvidersLocked provider:gps changesMade: true isEnabled:false shouldBeEnabled:true
01-10 14:12:18.126480   943   943 D LocationManagerService: updateProvidersLocked provider:passive changesMade: true isEnabled:true shouldBeEnabled:true
01-10 14:12:18.127790   943   943 D MtkLocationExt: MtkLocationExt LocationManagerService()
01-10 14:12:18.127906  1130  1244 V NuMediaExtractor: setDataSource fd=44 (/system/media/audio/ui/Lock.ogg), offset=0, length=8308
01-10 14:12:18.127970   943   943 D LocationManagerService: mMtkLocationManagerService = com.mediatek.location.MtkLocationExt$LocationManagerService@f45de30
01-10 14:12:18.128151   943   943 D LocationManagerService: checkCtaSupport = true
01-10 14:12:18.129162   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.129650   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.RAW) in omx@1.0-service process
01-10 14:12:18.130585   943  1000 D LocationManagerService: request 57fcf passive Request[POWER_NONE passive fastest=0] from android(1000 foreground [whitelisted])
01-10 14:12:18.131081  1130  1130 D KeyguardDialogManager: DialogSequenceManager DialogSequenceManager()
01-10 14:12:18.131970   523   562 D AAL     : 01-10 02:12:17.924 BL= 356,ESS= 256, 01-10 02:12:17.962 BL= 357,ESS= 256, 01-10 02:12:18.018 BL= 358,ESS= 256, 01-10 02:12:18.056 BL= 359,ESS= 256, 01-10 02:12:18.131 BL= 360,ESS= 256, 
01-10 14:12:18.132496   943  1000 I GnssLocationProvider: WakeLock released by handleMessage(INITIALIZE_HANDLER, 0, null)
01-10 14:12:18.133380   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/1130/cmdline]
01-10 14:12:18.134646   561   561 W MtkGnssHAL_GnssInterface: setCallback called more than once. Unexpected unless test.
01-10 14:12:18.135211   943  1000 D GnssLocationProvider: gnssSetCapabilitesCb: 65536u
01-10 14:12:18.135319   943  1112 D Ethernet: got request NetworkRequest [ TRACK_DEFAULT id=6, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 14:12:18.135330   943   943 I CommonTimeManagementService: No common time service detected on this platform.  Common time services will be unavailable.
01-10 14:12:18.135619   943  1000 D GnssLocationProvider: gnssSetSystemInfoCb: yearOfHw=2015
01-10 14:12:18.135780   561   561 D         : gpshal_gpscbs_save: Use GpsCallbacks
01-10 14:12:18.135814   561   561 D hal2mnl : hal2mnl_gps_init: hal2mnl_gps_init
01-10 14:12:18.136192   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.136250   520   691 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 14:12:18.136310   520   691 W MNLD    : hal_gps_init: hal_gps_init
01-10 14:12:18.136340   943  1000 E GnssLocationProvider: Unable to initialize GNSS Xtra interface
01-10 14:12:18.136336   520   691 D MNL2AGPS: mnl2agps_gps_init: mnl2agps_gps_init
01-10 14:12:18.137195   555   580 D agps    : [agps][n][AGPS] [MNL] read  gps_init
01-10 14:12:18.137307   555   580 D agps    : [agps][n][CDMA] cdma_mgr_sync_gps_setting(): 1
01-10 14:12:18.137325   555   580 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_SET_PRIVACY_MODE
01-10 14:12:18.137472   555   580 D agps    : [agps][n][CDMA] check_low_power_mode(): old=0, new=0
01-10 14:12:18.137531   555   580 D agps    : [agps] WARNING: [AGPS] agps2_mgr_aireplane_mode_from_c2k() flight_mode_state=[0] flight_mode_power_off_md=[1] is_cp_run=[0]
01-10 14:12:18.137554   555   580 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 14:12:18.138135   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000020
01-10 14:12:18.139757   561   561 E GFC_INF : hal2_geofence_init: geofence init before
01-10 14:12:18.139864   561   561 D         : mtk_hal_geofence_init: init geofence, cb function : ff3ab0c8
01-10 14:12:18.140701   543   610 I PPL/PPLAgent: checkCallerUidPermission(code:3,  uid:10021)
01-10 14:12:18.140830   543   610 E PPL/PPLAgent: checkCallerUidPermission Fail! (code:3,  uid:10021)
01-10 14:12:18.141131  1130  1130 I AntiTheftManager: PplCheckLocked, the lock flag is:false
01-10 14:12:18.141347  1130  1130 D AntiTheftManager: getInstance(...) is called.
01-10 14:12:18.141397  1130  1130 D AntiTheftManager: getInstance(...) create one.
01-10 14:12:18.142377   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.142551  1130  1130 D AntiTheftManager: AntiTheftManager() is called.
01-10 14:12:18.142732   561   561 E VzwDebugInterface: init: Vzw debug init, to set callback
01-10 14:12:18.142864   546  1199 I OMXMaster: makeComponentInstance(OMX.google.raw.decoder) in omx@1.0-service process
01-10 14:12:18.143205  1130  1130 D AntiTheftManager: mDismissable is 0 before
01-10 14:12:18.143284  1130  1130 D AntiTheftManager: mDismissable is 0 after
01-10 14:12:18.143382  1130  1130 D AntiTheftManager: MTK_PRIVACY_PROTECTION_LOCK is enabled.
01-10 14:12:18.143471  1130  1130 D AntiTheftManager: mDismissable is 0 before
01-10 14:12:18.143488  1130  1130 D AntiTheftManager: mDismissable is 2 after
01-10 14:12:18.143490   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/1130/cmdline]
01-10 14:12:18.143591   561   561 D hal2mnl : hal2mnl_set_server: hal2mnl_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 14:12:18.144128   520   691 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 14:12:18.144299   520   691 D MNLD    : hal_set_server: hal_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 14:12:18.145079   555   580 D agps    : [agps][n][AGPS] [MNL] read  set_server  type=1 hostname=[supl.google.com] port=7275 aosp_profile_enable=0
01-10 14:12:18.145508   561   561 D         : mtk_flp_init
01-10 14:12:18.145562   561   561 E         : mtk_flp_init: mtkFlpCallbacks.set_thread_event_cb
01-10 14:12:18.145573   561   561 E         : mtk_flp_init: mtkFlpCallbacks.flp_capabilities_cb
01-10 14:12:18.145585   561   561 D GnssHAL_GnssBatchingInterface: flpCapabilitiesCb capabilities 1
01-10 14:12:18.145668  1130  1130 D VoiceWakeupManagerProxy: getInstance(...) is called.
01-10 14:12:18.145714  1130  1130 D VoiceWakeupManagerProxy: getInstance(...) create one.
01-10 14:12:18.145750  1130  1130 D VoiceWakeupManagerProxy: constructor is called.
01-10 14:12:18.146165   561   561 D         : init_timer_id: timer create ok
01-10 14:12:18.146235  1130  1130 E VoiceWakeupManagerProxy: createVoiceWakeupManagerInstance error
01-10 14:12:18.146834   943  1000 I GnssLocationProvider: WakeLock released by handleMessage(ENABLE, 1, null)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: java.lang.ClassNotFoundException: com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManager
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at java.lang.Class.classForName(Native Method)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at java.lang.Class.forName(Class.java:453)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at java.lang.Class.forName(Class.java:378)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManagerProxy.createVoiceWakeupManagerInstance(VoiceWakeupManagerProxy.java:40)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManagerProxy.getInstance(VoiceWakeupManagerProxy.java:33)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at com.android.systemui.keyguard.KeyguardViewMediator.setupLocked(KeyguardViewMediator.java:933)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at com.android.systemui.keyguard.KeyguardViewMediator.start(KeyguardViewMediator.java:948)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at com.android.systemui.SystemUIApplication.startServicesIfNeeded(SystemUIApplication.java:215)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at com.android.systemui.SystemUIApplication.startServicesIfNeeded(SystemUIApplication.java:164)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at com.android.systemui.SystemUIService.onCreate(SystemUIService.java:33)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread.handleCreateService(ActivityThread.java:3380)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread.-wrap4(Unknown Source:0)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1711)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at android.os.Looper.loop(Looper.java:164)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: Caused by: java.lang.ClassNotFoundException: Didn't find class "com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManager" on path: DexPathList[[zip file "/system/priv-app/MtkSystemUI/MtkSystemUI.apk"],nativeLibraryDirectories=[/system/priv-app/MtkSystemUI/lib/arm64, /system/lib64, /vendor/lib64, /system/lib64, /vendor/lib64]]
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:125)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 14:12:18.147043  1130  1130 E VoiceWakeupManagerProxy: 	... 19 more
01-10 14:12:18.148247   561  1252 D         : mnl2flphal_jni_thread: mtk_flp_hal_jni_thread, Create
01-10 14:12:18.148497   520   691 D MNLD    : mnld_main_thread: flp2mnl_hdlr msg
01-10 14:12:18.148573   520   691 D flpint  : mtk_flp2mnl_process: MNLD_FLP_TYPE_FLP_ATTACH
01-10 14:12:18.148851   520   691 D flpmain : mnl_flp_dump_buf: [FLP2MNLD]data from flp: data=200,  0,  0,  0,  0,  0,  0,  0,
01-10 14:12:18.148912   520   691 D flpmain : mnl_flp_dump_buf: [FLP2MNLD]data from flp: data=  0,  0,  0,  0,
01-10 14:12:18.148928   520   691 D MNLD    : mnld_flp_attach: mnld_flp_attach
01-10 14:12:18.148961   520   691 D flpmain : mnld_flp_attach_done: mnld_flp_attach_done
01-10 14:12:18.148993   520   691 D flpint  : mnl2flp_hdlr: MNL_STATUS_ATTACH_DONE
01-10 14:12:18.149025   520   691 D MNLD    : mnld_flp_attach: Send attach done to FLP succeed
01-10 14:12:18.149059   520   691 D flpmain : mnld_flp_session_update: mnld_flp_session_update,id=1,type=1
01-10 14:12:18.149092   520   691 D flpint  : mnl2flp_hdlr: SESSION_UPDATE 1 support 1 mode 2
01-10 14:12:18.149136   520   691 D flpmain : mtk_flp_set_sys_mode: mtk_flp_set_sys_mode success = 1
01-10 14:12:18.149170   520   691 D flpint  : mnl2flp_hdlr: SESSION_UPDATE: set ap mode
01-10 14:12:18.149991   535   663 V APEExtractor: getAPEInfo not ape 20483
01-10 14:12:18.150175   535   663 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:18.150348  1130  1130 D RemoteLockManager: getInstance(...) is called.
01-10 14:12:18.150384  1130  1130 D RemoteLockManager: getInstance(...) create one.
01-10 14:12:18.150884  1130  1130 D RemoteLockManager: RemoteLockManager() is called.
01-10 14:12:18.151834   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.152160   546   657 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:18.154539   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000010
01-10 14:12:18.155876  1130  1244 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 14:12:18.160418   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.160820   546   657 I OMXMaster: makeComponentInstance(OMX.google.aac.encoder) in omx@1.0-service process
01-10 14:12:18.161621   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.161776  1117  1117 W InputAttributes: No editor info for this field. Bug?
01-10 14:12:18.172160   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.172728   546  1199 I OMXMaster: makeComponentInstance(OMX.google.amrnb.encoder) in omx@1.0-service process
01-10 14:12:18.178024   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.183335   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.183841   546   657 I OMXMaster: makeComponentInstance(OMX.google.amrwb.encoder) in omx@1.0-service process
01-10 14:12:18.189225  1117  1269 I LatinIME:LogUtils: Dictionary info: dictionary = UserHistoryDictionary.en_US ; version = 1578016041 ; date = 1578104338
01-10 14:12:18.190657  1117  1269 I LatinIME:LogUtils: Dictionary info: dictionary = userunigram.en_US ; version = 1578636738 ; date = ?
01-10 14:12:18.190000   548   548 W HwBinder:548_2: type=1400 audit(0.0:46): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:18.193149   548   882 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:18.194816   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.195205   546   657 I OMXMaster: makeComponentInstance(OMX.google.flac.encoder) in omx@1.0-service process
01-10 14:12:18.203703   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.205111   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.205590   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.AVC) in omx@1.0-service process
01-10 14:12:18.219304   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.229388  1117  1269 I LatinIME:LogUtils: Dictionary info: dictionary = main:en ; version = 54 ; date = 1414726273
01-10 14:12:18.243148   546   657 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 14:12:18.243744  1130  1130 I vol.Events: writeEvent collection_started
01-10 14:12:18.244004   546   657 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::MtkOmxVdec this= 0xF0AE1000
01-10 14:12:18.244183   546   657 D MtkOmxVdecEx: [0xf0ae1000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.244715   546   657 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxComponentCreate mCompHandle(0xF0AE1004)
01-10 14:12:18.244756   546   657 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.AVC)
01-10 14:12:18.245053   546   657 I         : isVTService(media.codec)
01-10 14:12:18.245708   546   657 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 14:12:18.246096   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.246501   546  1279 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecThread created pVdec=0xF0AE1000, tid=1279
01-10 14:12:18.247560   546  1280 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecDecodeThread created pVdec=0xF0AE1000, tid=1280
01-10 14:12:18.251646   546  1281 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecConvertThread created pVdec=0xF0AE1000, tid=1281
01-10 14:12:18.260109  1130  1278 I vol.Events: writeEvent external_ringer_mode_changed normal
01-10 14:12:18.260532  1130  1278 I vol.Events: writeEvent internal_ringer_mode_changed normal
01-10 14:12:18.262956   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.274390   943   943 E libdevice_genetic: VSCAN_LEFT_TRIGGER 
01-10 14:12:18.286695   943   943 E libdevice_genetic: VSCAN_RIGHT_TRIGGER 
01-10 14:12:18.288290   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.292448   546   657 E OMXNodeInstance: getParameter(0xf0ae1004:MTK.DECODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.293063   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:23.570530,dur:1018.22,max:87.85,min:7.32
01-10 14:12:18.292719   537   704 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 14:12:18.294099   546   657 E OMXNodeInstance: getParameter(0xf0ae1004:MTK.DECODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.294476   546   657 E OMXNodeInstance: getExtensionIndex(0xf0ae1004:MTK.DECODER.AVC, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.294637   546   657 E MtkOmxVdecEx: [0xf0ae1000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.294725   546   657 E OMXNodeInstance: setParameter(0xf0ae1004:MTK.DECODER.AVC, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.295030   546   657 D MtkOmxVdecEx: [0xf0ae1000] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.295288   546  1280 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE1000
01-10 14:12:18.295288   546  1281 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecConvertThread terminated
01-10 14:12:18.295355   546  1279 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecThread terminated
01-10 14:12:18.304864   943   943 E libdevice_genetic: VSCAN_PISTOL_TRIGGER 
01-10 14:12:18.306250   546   657 D MtkOmxVdecEx: [0xf0ae1000] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.306305   546   657 D MtkOmxVdecEx: [0xf0ae1000] ~MtkOmxVdec this= 0xF0AE1000
01-10 14:12:18.306318   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.306464   546  1282 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.309049   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.309445   546   657 I OMXMaster: makeComponentInstance(OMX.google.h264.decoder) in omx@1.0-service process
01-10 14:12:18.319281   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a943c0:google.h264.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.319571   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a943c0:google.h264.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.321904   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.322375   943   943 E libdevice_battery: battery_min_temperature: temperature not in range
01-10 14:12:18.322597   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.DIVX) in omx@1.0-service process
01-10 14:12:18.323263   546   657 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::MtkOmxVdec this= 0xF0AE1000
01-10 14:12:18.323457   546   657 D MtkOmxVdecEx: [0xf0ae1000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.323902   546   657 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxComponentCreate mCompHandle(0xF0AE1004)
01-10 14:12:18.323942   546   657 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.DIVX)
01-10 14:12:18.324592   546   657 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 14:12:18.325120   546  1289 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecThread created pVdec=0xF0AE1000, tid=1289
01-10 14:12:18.325402   546  1290 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecDecodeThread created pVdec=0xF0AE1000, tid=1290
01-10 14:12:18.325408   546  1291 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecConvertThread created pVdec=0xF0AE1000, tid=1291
01-10 14:12:18.329920   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.330621   546  1199 E OMXNodeInstance: getParameter(0xf0ae1004:MTK.DECODER.DIVX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.330845   537   704 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 14:12:18.331334   546  1199 E OMXNodeInstance: getParameter(0xf0ae1004:MTK.DECODER.DIVX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.331686   546  1199 E OMXNodeInstance: getExtensionIndex(0xf0ae1004:MTK.DECODER.DIVX, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.331840   546  1199 E MtkOmxVdecEx: [0xf0ae1000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.331925   546  1199 E OMXNodeInstance: setParameter(0xf0ae1004:MTK.DECODER.DIVX, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.332163   546  1199 D MtkOmxVdecEx: [0xf0ae1000] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.332403   546  1290 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE1000
01-10 14:12:18.332411   546  1291 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecConvertThread terminated
01-10 14:12:18.332468   546  1289 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecThread terminated
01-10 14:12:18.332736   943   943 E DL-KSParserFactory: Error while retrieving KSType file
01-10 14:12:18.332899   943   943 W System.err: java.io.FileNotFoundException: /enterprise/imported/type (Permission denied)
01-10 14:12:18.333136   943   943 W System.err: 	at java.io.FileInputStream.open0(Native Method)
01-10 14:12:18.333171   943   943 W System.err: 	at java.io.FileInputStream.open(FileInputStream.java:200)
01-10 14:12:18.333186   943   943 W System.err: 	at java.io.FileInputStream.<init>(FileInputStream.java:150)
01-10 14:12:18.333205   943   943 W System.err: 	at java.io.FileInputStream.<init>(FileInputStream.java:103)
01-10 14:12:18.333219   943   943 W System.err: 	at java.io.FileReader.<init>(FileReader.java:58)
01-10 14:12:18.333235   943   943 W System.err: 	at com.datalogic.server.KSParserFactory.getType(KSParserFactory.java:39)
01-10 14:12:18.333251   943   943 W System.err: 	at com.datalogic.server.KSParserFactory.createKSParser(KSParserFactory.java:19)
01-10 14:12:18.333272   943   943 W System.err: 	at com.datalogic.server.WifiConfDecryptManager.importExternalKeystore(WifiConfDecryptManager.java:262)
01-10 14:12:18.333288   943   943 W System.err: 	at com.datalogic.server.WifiConfDecryptManager.setupKeyStore(WifiConfDecryptManager.java:232)
01-10 14:12:18.333303   943   943 W System.err: 	at com.datalogic.server.WifiConfDecryptManager.init(WifiConfDecryptManager.java:151)
01-10 14:12:18.333319   943   943 W System.err: 	at com.datalogic.server.CryptoManager.systemReady(CryptoManager.java:46)
01-10 14:12:18.333337   943   943 W System.err: 	at com.android.server.SystemServer.lambda$-com_android_server_SystemServer_85408(SystemServer.java:2117)
01-10 14:12:18.333354   943   943 W System.err: 	at com.android.server.-$Lambda$T7cKu_OKm_Fk2kBNthmo_uUJTSo$1.$m$0(Unknown Source:146)
01-10 14:12:18.333369   943   943 W System.err: 	at com.android.server.-$Lambda$T7cKu_OKm_Fk2kBNthmo_uUJTSo$1.run(Unknown Source:0)
01-10 14:12:18.333384   943   943 W System.err: 	at com.android.server.am.ActivityManagerService.systemReady(ActivityManagerService.java:14428)
01-10 14:12:18.333404   943   943 W System.err: 	at com.android.server.SystemServer.startOtherServices(SystemServer.java:1875)
01-10 14:12:18.333418   943   943 W System.err: 	at com.android.server.SystemServer.run(SystemServer.java:434)
01-10 14:12:18.333432   943   943 W System.err: 	at com.android.server.SystemServer.main(SystemServer.java:299)
01-10 14:12:18.333445   943   943 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 14:12:18.333461   943   943 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 14:12:18.333476   943   943 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:837)
01-10 14:12:18.333574   943   943 E DL-KSParserFactory: Unknown keystore type
01-10 14:12:18.330000   943   943 W system_server: type=1400 audit(0.0:47): avc: denied { search } for name="/" dev="mmcblk0p7" ino=2 scontext=u:r:system_server:s0 tcontext=u:object_r:enterprise_file:s0 tclass=dir permissive=0
01-10 14:12:18.342868   546  1199 D MtkOmxVdecEx: [0xf0ae1000] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.342962   546  1199 D MtkOmxVdecEx: [0xf0ae1000] ~MtkOmxVdec this= 0xF0AE1000
01-10 14:12:18.343136   546  1292 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.345347   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.345994   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.346639   546  1199 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.DIVX3) in omx@1.0-service process
01-10 14:12:18.347584   546  1199 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::MtkOmxVdec this= 0xF0AE1000
01-10 14:12:18.347752   546  1199 D MtkOmxVdecEx: [0xf0ae1000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.348374   546  1199 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxComponentCreate mCompHandle(0xF0AE1004)
01-10 14:12:18.348429   546  1199 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.DIVX3)
01-10 14:12:18.349358   546  1199 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 14:12:18.349879   546  1294 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecThread created pVdec=0xF0AE1000, tid=1294
01-10 14:12:18.350030   546  1295 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecDecodeThread created pVdec=0xF0AE1000, tid=1295
01-10 14:12:18.350111   546  1296 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecConvertThread created pVdec=0xF0AE1000, tid=1296
01-10 14:12:18.356505   546  1199 E OMXNodeInstance: getParameter(0xf0ae1004:MTK.DECODER.DIVX3, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.356678   537   704 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 14:12:18.357102   546  1199 E OMXNodeInstance: getParameter(0xf0ae1004:MTK.DECODER.DIVX3, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.357382   546  1199 E OMXNodeInstance: getExtensionIndex(0xf0ae1004:MTK.DECODER.DIVX3, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.357544   546  1199 E MtkOmxVdecEx: [0xf0ae1000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.357628   546  1199 E OMXNodeInstance: setParameter(0xf0ae1004:MTK.DECODER.DIVX3, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.357894   546  1199 D MtkOmxVdecEx: [0xf0ae1000] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.358177   546  1295 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE1000
01-10 14:12:18.358157   523   562 D AAL     : 01-10 02:12:18.169 BL= 361,ESS= 256, 01-10 02:12:18.226 BL= 362,ESS= 256, 01-10 02:12:18.263 BL= 363,ESS= 256, 01-10 02:12:18.320 BL= 364,ESS= 256, 01-10 02:12:18.358 BL= 365,ESS= 256, 
01-10 14:12:18.358241   546  1296 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecConvertThread terminated
01-10 14:12:18.358256   546  1294 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecThread terminated
01-10 14:12:18.368426   546  1199 D MtkOmxVdecEx: [0xf0ae1000] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.368525   546  1199 D MtkOmxVdecEx: [0xf0ae1000] ~MtkOmxVdec this= 0xF0AE1000
01-10 14:12:18.368698   546  1297 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.371367   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.371723   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.372360   546  1199 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.H263) in omx@1.0-service process
01-10 14:12:18.373178   546  1199 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::MtkOmxVdec this= 0xF0AE1000
01-10 14:12:18.373360   546  1199 D MtkOmxVdecEx: [0xf0ae1000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.374045   546  1199 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxComponentCreate mCompHandle(0xF0AE1004)
01-10 14:12:18.374099   546  1199 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.H263)
01-10 14:12:18.374648   546  1199 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 14:12:18.379525   546  1312 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecThread created pVdec=0xF0AE1000, tid=1312
01-10 14:12:18.383900   546  1313 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecDecodeThread created pVdec=0xF0AE1000, tid=1313
01-10 14:12:18.384066   546  1314 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecConvertThread created pVdec=0xF0AE1000, tid=1314
01-10 14:12:18.387518   546  1199 E OMXNodeInstance: getParameter(0xf0ae1004:MTK.DECODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.387806   537   704 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 14:12:18.388369   546  1199 E OMXNodeInstance: getParameter(0xf0ae1004:MTK.DECODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.388781   546  1199 E OMXNodeInstance: getExtensionIndex(0xf0ae1004:MTK.DECODER.H263, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.388963   546  1199 E MtkOmxVdecEx: [0xf0ae1000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.389079   546  1199 E OMXNodeInstance: setParameter(0xf0ae1004:MTK.DECODER.H263, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.389403   546  1199 D MtkOmxVdecEx: [0xf0ae1000] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.389707   546  1313 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE1000
01-10 14:12:18.389712   546  1314 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecConvertThread terminated
01-10 14:12:18.389797   546  1312 D MtkOmxVdecEx: [0xf0ae1000] MtkOmxVdecThread terminated
01-10 14:12:18.393150   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.399941   546  1199 D MtkOmxVdecEx: [0xf0ae1000] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.400025   546  1199 D MtkOmxVdecEx: [0xf0ae1000] ~MtkOmxVdec this= 0xF0AE1000
01-10 14:12:18.400202   546  1315 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.402674   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.403156   546   657 I OMXMaster: makeComponentInstance(OMX.google.h263.decoder) in omx@1.0-service process
01-10 14:12:18.413055   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a94360:google.h263.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.413349   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a94360:google.h263.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.413688   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.416164   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.416641   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.HEVC) in omx@1.0-service process
01-10 14:12:18.417459   546   657 D MtkOmxVdecEx: [0xf0ae2800] MtkOmxVdec::MtkOmxVdec this= 0xF0AE2800
01-10 14:12:18.417606   546   657 D MtkOmxVdecEx: [0xf0ae2800] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.418201   546   657 D MtkOmxVdecEx: [0xf0ae2800] MtkOmxComponentCreate mCompHandle(0xF0AE2804)
01-10 14:12:18.418247   546   657 D MtkOmxVdecEx: [0xf0ae2800] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.HEVC)
01-10 14:12:18.418721   546   657 D MtkOmxVdecEx: [0xf0ae2800] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 14:12:18.423995   546  1332 D MtkOmxVdecEx: [0xf0ae2800] MtkOmxVdecThread created pVdec=0xF0AE2800, tid=1332
01-10 14:12:18.424102   546  1334 D MtkOmxVdecEx: [0xf0ae2800] MtkOmxVdecConvertThread created pVdec=0xF0AE2800, tid=1334
01-10 14:12:18.424403   546  1333 D MtkOmxVdecEx: [0xf0ae2800] MtkOmxVdecDecodeThread created pVdec=0xF0AE2800, tid=1333
01-10 14:12:18.429359   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.430445   546  1160 E OMXNodeInstance: getParameter(0xf0ae2804:MTK.DECODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.430655   537   704 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 14:12:18.431230   546  1160 E OMXNodeInstance: getParameter(0xf0ae2804:MTK.DECODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.431709   546  1160 E OMXNodeInstance: getExtensionIndex(0xf0ae2804:MTK.DECODER.HEVC, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.432019   546  1160 E MtkOmxVdecEx: [0xf0ae2800] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.432142   546  1160 E OMXNodeInstance: setParameter(0xf0ae2804:MTK.DECODER.HEVC, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.432497   546  1160 D MtkOmxVdecEx: [0xf0ae2800] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.432792   546  1334 D MtkOmxVdecEx: [0xf0ae2800] MtkOmxVdecConvertThread terminated
01-10 14:12:18.432803   546  1333 D MtkOmxVdecEx: [0xf0ae2800] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE2800
01-10 14:12:18.432829   546  1332 D MtkOmxVdecEx: [0xf0ae2800] MtkOmxVdecThread terminated
01-10 14:12:18.443158   546  1160 D MtkOmxVdecEx: [0xf0ae2800] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.443504   546  1160 D MtkOmxVdecEx: [0xf0ae2800] ~MtkOmxVdec this= 0xF0AE2800
01-10 14:12:18.443796   546  1335 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.446117   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.446611   546   657 I OMXMaster: makeComponentInstance(OMX.google.hevc.decoder) in omx@1.0-service process
01-10 14:12:18.456968   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.460308   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a94180:google.hevc.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.460592   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a94180:google.hevc.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.464543   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.465020   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.MPEG2) in omx@1.0-service process
01-10 14:12:18.465912   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::MtkOmxVdec this= 0xF0AE4000
01-10 14:12:18.466147   546   657 D MtkOmxVdecEx: [0xf0ae4000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.466802   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxComponentCreate mCompHandle(0xF0AE4004)
01-10 14:12:18.466861   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.MPEG2)
01-10 14:12:18.467530   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 14:12:18.468784   546  1339 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecThread created pVdec=0xF0AE4000, tid=1339
01-10 14:12:18.469484   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.MPEG2, ParamVideoProfileLevelQuerySupported(0x600000f)) ERROR: BadParameter(0x80001005)
01-10 14:12:18.469957   546  1340 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecDecodeThread created pVdec=0xF0AE4000, tid=1340
01-10 14:12:18.470035   546  1341 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecConvertThread created pVdec=0xF0AE4000, tid=1341
01-10 14:12:18.470600   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.MPEG2, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.470834   537   704 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 14:12:18.471651   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.MPEG2, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.472119   546   657 E OMXNodeInstance: getExtensionIndex(0xf0ae4004:MTK.DECODER.MPEG2, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.472402   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.472356   546   657 E MtkOmxVdecEx: [0xf0ae4000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.472472   546   657 E OMXNodeInstance: setParameter(0xf0ae4004:MTK.DECODER.MPEG2, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.472920   546   657 D MtkOmxVdecEx: [0xf0ae4000] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.473144   394   414 I vendor.mediatek.hardware.power@1.1-impl: PowerHint hint:8, data:1
01-10 14:12:18.473227   546  1340 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE4000
01-10 14:12:18.473230   546  1341 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecConvertThread terminated
01-10 14:12:18.473290   546  1339 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecThread terminated
01-10 14:12:18.475246   394   413 I libPerfService: 8: legacy set freq: 1508000 -1 2002000 -1
01-10 14:12:18.482931  1200  1200 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 14:12:18.483707   546   657 D MtkOmxVdecEx: [0xf0ae4000] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.483802   546   657 D MtkOmxVdecEx: [0xf0ae4000] ~MtkOmxVdec this= 0xF0AE4000
01-10 14:12:18.483970   546  1342 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.486058   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.486392   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.MPEG4) in omx@1.0-service process
01-10 14:12:18.486979   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::MtkOmxVdec this= 0xF0AE4000
01-10 14:12:18.487081   546   657 D MtkOmxVdecEx: [0xf0ae4000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.487579   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxComponentCreate mCompHandle(0xF0AE4004)
01-10 14:12:18.487615   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.MPEG4)
01-10 14:12:18.487592  1200  1200 D AndroidRuntime: >>>>>> START com.android.internal.os.WebViewZygoteInit uid 1053 <<<<<<
01-10 14:12:18.488206   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 14:12:18.488472   546  1344 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecThread created pVdec=0xF0AE4000, tid=1344
01-10 14:12:18.488572   546  1345 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecDecodeThread created pVdec=0xF0AE4000, tid=1345
01-10 14:12:18.488704   546  1346 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecConvertThread created pVdec=0xF0AE4000, tid=1346
01-10 14:12:18.492891  1200  1200 I /system/bin/webview_zygote32: option[0]=-Xzygote
01-10 14:12:18.492979  1200  1200 I /system/bin/webview_zygote32: option[1]=-Xusetombstonedtraces
01-10 14:12:18.492996  1200  1200 I /system/bin/webview_zygote32: option[2]=exit
01-10 14:12:18.493011  1200  1200 I /system/bin/webview_zygote32: option[3]=vfprintf
01-10 14:12:18.493027  1200  1200 I /system/bin/webview_zygote32: option[4]=sensitiveThread
01-10 14:12:18.493041  1200  1200 I /system/bin/webview_zygote32: option[5]=-verbose:gc
01-10 14:12:18.493056  1200  1200 I /system/bin/webview_zygote32: option[6]=-Xms4m
01-10 14:12:18.493072  1200  1200 I /system/bin/webview_zygote32: option[7]=-Xmx256m
01-10 14:12:18.493090  1200  1200 I /system/bin/webview_zygote32: option[8]=-XX:HeapGrowthLimit=128m
01-10 14:12:18.493107  1200  1200 I /system/bin/webview_zygote32: option[9]=-Xusejit:true
01-10 14:12:18.493125  1200  1200 I /system/bin/webview_zygote32: option[10]=-Xjitsaveprofilinginfo
01-10 14:12:18.493143  1200  1200 I /system/bin/webview_zygote32: option[11]=-agentlib:jdwp=transport=dt_android_adb,suspend=n,server=y
01-10 14:12:18.493160  1200  1200 I /system/bin/webview_zygote32: option[12]=-Ximage-compiler-option
01-10 14:12:18.493176  1200  1200 I /system/bin/webview_zygote32: option[13]=--runtime-arg
01-10 14:12:18.493193  1200  1200 I /system/bin/webview_zygote32: option[14]=-Ximage-compiler-option
01-10 14:12:18.493209  1200  1200 I /system/bin/webview_zygote32: option[15]=-Xms64m
01-10 14:12:18.493227  1200  1200 I /system/bin/webview_zygote32: option[16]=-Ximage-compiler-option
01-10 14:12:18.493243  1200  1200 I /system/bin/webview_zygote32: option[17]=--runtime-arg
01-10 14:12:18.493259  1200  1200 I /system/bin/webview_zygote32: option[18]=-Ximage-compiler-option
01-10 14:12:18.493275  1200  1200 I /system/bin/webview_zygote32: option[19]=-Xmx64m
01-10 14:12:18.493291  1200  1200 I /system/bin/webview_zygote32: option[20]=-Ximage-compiler-option
01-10 14:12:18.493307  1200  1200 I /system/bin/webview_zygote32: option[21]=--image-classes=/system/etc/preloaded-classes
01-10 14:12:18.493323  1200  1200 I /system/bin/webview_zygote32: option[22]=-Ximage-compiler-option
01-10 14:12:18.493340  1200  1200 I /system/bin/webview_zygote32: option[23]=--compiled-classes=/system/etc/compiled-classes
01-10 14:12:18.493356  1200  1200 I /system/bin/webview_zygote32: option[24]=-Ximage-compiler-option
01-10 14:12:18.493373  1200  1200 I /system/bin/webview_zygote32: option[25]=--dirty-image-objects=/system/etc/dirty-image-objects
01-10 14:12:18.493388  1200  1200 I /system/bin/webview_zygote32: option[26]=-Xcompiler-option
01-10 14:12:18.493404  1200  1200 I /system/bin/webview_zygote32: option[27]=--runtime-arg
01-10 14:12:18.493420  1200  1200 I /system/bin/webview_zygote32: option[28]=-Xcompiler-option
01-10 14:12:18.493435  1200  1200 I /system/bin/webview_zygote32: option[29]=-Xms64m
01-10 14:12:18.493450  1200  1200 I /system/bin/webview_zygote32: option[30]=-Xcompiler-option
01-10 14:12:18.493466  1200  1200 I /system/bin/webview_zygote32: option[31]=--runtime-arg
01-10 14:12:18.493481  1200  1200 I /system/bin/webview_zygote32: option[32]=-Xcompiler-option
01-10 14:12:18.493496  1200  1200 I /system/bin/webview_zygote32: option[33]=-Xmx512m
01-10 14:12:18.493512  1200  1200 I /system/bin/webview_zygote32: option[34]=-Ximage-compiler-option
01-10 14:12:18.493527  1200  1200 I /system/bin/webview_zygote32: option[35]=--instruction-set-variant=cortex-a53
01-10 14:12:18.493542  1200  1200 I /system/bin/webview_zygote32: option[36]=-Xcompiler-option
01-10 14:12:18.493557  1200  1200 I /system/bin/webview_zygote32: option[37]=--instruction-set-variant=cortex-a53
01-10 14:12:18.493574  1200  1200 I /system/bin/webview_zygote32: option[38]=-Ximage-compiler-option
01-10 14:12:18.493589  1200  1200 I /system/bin/webview_zygote32: option[39]=--instruction-set-features=default
01-10 14:12:18.493608  1200  1200 I /system/bin/webview_zygote32: option[40]=-Xcompiler-option
01-10 14:12:18.493626  1200  1200 I /system/bin/webview_zygote32: option[41]=--instruction-set-features=default
01-10 14:12:18.493645  1200  1200 I /system/bin/webview_zygote32: option[42]=-Duser.locale=zh-Hans-CN
01-10 14:12:18.493661  1200  1200 I /system/bin/webview_zygote32: option[43]=--cpu-abilist=armeabi-v7a,armeabi
01-10 14:12:18.493680  1200  1200 I /system/bin/webview_zygote32: option[44]=-Xfingerprint:Datalogic/dl35cn/dl35:8.1.0/1.07.15.20191227/1577435794:user/release-keys
01-10 14:12:18.494230   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.494373   537   704 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 14:12:18.494661   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.494875   546   657 E OMXNodeInstance: getExtensionIndex(0xf0ae4004:MTK.DECODER.MPEG4, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.495089   546   657 E MtkOmxVdecEx: [0xf0ae4000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.495157   546   657 E OMXNodeInstance: setParameter(0xf0ae4004:MTK.DECODER.MPEG4, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.495342   546   657 D MtkOmxVdecEx: [0xf0ae4000] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.495609   546  1345 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE4000
01-10 14:12:18.495627   546  1346 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecConvertThread terminated
01-10 14:12:18.495810   546  1344 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecThread terminated
01-10 14:12:18.498743   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.505810   546   657 D MtkOmxVdecEx: [0xf0ae4000] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.505929   546   657 D MtkOmxVdecEx: [0xf0ae4000] ~MtkOmxVdec this= 0xF0AE4000
01-10 14:12:18.506103   546  1347 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.508503   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.508880   546   657 I OMXMaster: makeComponentInstance(OMX.google.mpeg4.decoder) in omx@1.0-service process
01-10 14:12:18.510987   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a94180:google.mpeg4.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.511337   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a94180:google.mpeg4.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.515616   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.517987   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.518487   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.VPX) in omx@1.0-service process
01-10 14:12:18.519663   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::MtkOmxVdec this= 0xF0AE4000
01-10 14:12:18.519891   546   657 D MtkOmxVdecEx: [0xf0ae4000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.520454   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxComponentCreate mCompHandle(0xF0AE4004)
01-10 14:12:18.520500   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.VPX)
01-10 14:12:18.521532  1130  1278 I vol.Events: writeEvent level_changed STREAM_VOICE_CALL 4
01-10 14:12:18.523897   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.524183   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.527251   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.527797   546   657 E OMXNodeInstance: getExtensionIndex(0xf0ae4004:MTK.DECODER.VPX, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.528080   546   657 E MtkOmxVdecEx: [0xf0ae4000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.528208   546   657 E OMXNodeInstance: setParameter(0xf0ae4004:MTK.DECODER.VPX, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.528270  1130  1278 I vol.Events: writeEvent level_changed STREAM_SYSTEM 13
01-10 14:12:18.528761   546   657 D MtkOmxVdecEx: [0xf0ae4000] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.529018   546  1365 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecThread created pVdec=0xF0AE4000, tid=1365
01-10 14:12:18.529194   546  1366 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecDecodeThread created pVdec=0xF0AE4000, tid=1366
01-10 14:12:18.529243   546  1366 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE4000
01-10 14:12:18.529464   546  1367 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecConvertThread created pVdec=0xF0AE4000, tid=1367
01-10 14:12:18.529513   546  1367 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecConvertThread terminated
01-10 14:12:18.529839   546  1365 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecThread terminated
01-10 14:12:18.530378  1130  1278 I vol.Events: writeEvent level_changed STREAM_RING 13
01-10 14:12:18.532533  1130  1278 I vol.Events: writeEvent level_changed STREAM_MUSIC 13
01-10 14:12:18.539355   546   657 D MtkOmxVdecEx: [0xf0ae4000] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.539471   546   657 D MtkOmxVdecEx: [0xf0ae4000] ~MtkOmxVdec this= 0xF0AE4000
01-10 14:12:18.539623   546  1368 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.539808  1130  1278 I vol.Events: writeEvent level_changed STREAM_ALARM 8
01-10 14:12:18.540586   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.542409   394   414 I vendor.mediatek.hardware.power@1.1-impl: notifyAppState pack:com.android.settings, act:com.android.settings.FallbackHome, pid:1349, state:1
01-10 14:12:18.543108   394   413 I libPerfService: [smart_table_init] open file fail
01-10 14:12:18.543213   394   413 I libPerfService: [smart_table_init] open file fail
01-10 14:12:18.545463   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.547895   943  1000 D LocationProviderProxy-network: bindBestPackage for com.android.location.service.v3.NetworkLocationProvider :  found 0, no new best component
01-10 14:12:18.548937   943  1000 D LocationProviderProxy-fused: bindBestPackage for com.android.location.service.FusedLocationProvider :  found 1, new best component: ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService}
01-10 14:12:18.549007   546   657 I OMXMaster: makeComponentInstance(OMX.google.vp8.decoder) in omx@1.0-service process
01-10 14:12:18.549342   392   392 D DynamicFpsPolicy: regInfo: 18a00000001
01-10 14:12:18.549891   394   413 I libPerfService: [perfNotifyAppState] foreground:com.android.settings, pid:1349
01-10 14:12:18.552685   943  1000 D GeocoderProxy: bindBestPackage for com.android.location.service.GeocodeProvider :  found 0, no new best component
01-10 14:12:18.552989  1130  1278 I vol.Events: writeEvent level_changed STREAM_BLUETOOTH_SCO 7
01-10 14:12:18.558331   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a94180:google.vp8.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.558637   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a94180:google.vp8.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.559764   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.566951   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.567605   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.VP9) in omx@1.0-service process
01-10 14:12:18.568045  1349  1349 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:18.568195   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::MtkOmxVdec this= 0xF0AE4000
01-10 14:12:18.568305   546   657 D MtkOmxVdecEx: [0xf0ae4000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.568646   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxComponentCreate mCompHandle(0xF0AE4004)
01-10 14:12:18.568688   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.VP9)
01-10 14:12:18.569696   546  1376 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecThread created pVdec=0xF0AE4000, tid=1376
01-10 14:12:18.575579   546  1377 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecDecodeThread created pVdec=0xF0AE4000, tid=1377
01-10 14:12:18.575729   546  1378 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecConvertThread created pVdec=0xF0AE4000, tid=1378
01-10 14:12:18.577100   398   640 I SurfaceFlinger: EventThread Client Pid (1130) created
01-10 14:12:18.577402   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.VP9, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.577609   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.578097   398   640 I SurfaceFlinger: EventThread Client Pid (1130) created
01-10 14:12:18.578149   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.VP9, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.578456   546   657 E OMXNodeInstance: getExtensionIndex(0xf0ae4004:MTK.DECODER.VP9, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.578618   546   657 E MtkOmxVdecEx: [0xf0ae4000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.578705   546   657 E OMXNodeInstance: setParameter(0xf0ae4004:MTK.DECODER.VP9, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.578924   546   657 D MtkOmxVdecEx: [0xf0ae4000] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.579133   546  1377 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE4000
01-10 14:12:18.579133   546  1378 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecConvertThread terminated
01-10 14:12:18.579276   546  1376 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecThread terminated
01-10 14:12:18.582388   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.585560  1299  1299 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:18.585968  1349  1349 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:18.589380   546   657 D MtkOmxVdecEx: [0xf0ae4000] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.589459   546   657 D MtkOmxVdecEx: [0xf0ae4000] ~MtkOmxVdec this= 0xF0AE4000
01-10 14:12:18.589627   546  1379 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.592236   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.592641   546   657 I OMXMaster: makeComponentInstance(OMX.google.vp9.decoder) in omx@1.0-service process
01-10 14:12:18.595360   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a94180:google.vp9.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.595657   546   657 E OMXNodeInstance: getExtensionIndex(0xf0a94180:google.vp9.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.596537  1130  1130 I SurfaceFactory: [static] sSurfaceFactory = com.mediatek.view.impl.SurfaceFactoryImpl@ddc8562
01-10 14:12:18.598289   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.598641   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.VC1) in omx@1.0-service process
01-10 14:12:18.599513   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::MtkOmxVdec this= 0xF0AE4000
01-10 14:12:18.599723   546   657 D MtkOmxVdecEx: [0xf0ae4000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.600204   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxComponentCreate mCompHandle(0xF0AE4004)
01-10 14:12:18.600270   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.VC1)
01-10 14:12:18.600977   546   657 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 14:12:18.601466   546  1385 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecThread created pVdec=0xF0AE4000, tid=1385
01-10 14:12:18.601544   546  1386 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecDecodeThread created pVdec=0xF0AE4000, tid=1386
01-10 14:12:18.601611   546  1387 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecConvertThread created pVdec=0xF0AE4000, tid=1387
01-10 14:12:18.602482   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.VC1, ParamVideoProfileLevelQuerySupported(0x600000f)) ERROR: BadParameter(0x80001005)
01-10 14:12:18.603281   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.VC1, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.603562   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.604405   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.605978  1130  1130 D WindowClient: Add to mViews: com.android.systemui.stackdivider.DividerView{6bc6e29 I.E...... ......I. 0,0-0,0}, this = android.view.WindowManagerGlobal@48195ae
01-10 14:12:18.607572  1130  1130 D OpenGLRenderer: Dumper init 4 threads <0x74b7fcc640>
01-10 14:12:18.608159  1130  1130 D OpenGLRenderer: <com.android.systemui> is running.
01-10 14:12:18.608191   546   657 E OMXNodeInstance: getParameter(0xf0ae4004:MTK.DECODER.VC1, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.609537   546   657 E OMXNodeInstance: getExtensionIndex(0xf0ae4004:MTK.DECODER.VC1, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.610830   546  1160 E MtkOmxVdecEx: [0xf0ae4000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.610967   398   640 I SurfaceFlinger: EventThread Client Pid (1130) created
01-10 14:12:18.610995   546  1160 E OMXNodeInstance: setParameter(0xf0ae4004:MTK.DECODER.VC1, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.611443   546  1160 D MtkOmxVdecEx: [0xf0ae4000] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.611560  1130  1390 D OpenGLRenderer: HWUI GL Pipeline
01-10 14:12:18.611812   546  1386 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE4000
01-10 14:12:18.611839   546  1385 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecThread terminated
01-10 14:12:18.612020   546  1387 D MtkOmxVdecEx: [0xf0ae4000] MtkOmxVdecConvertThread terminated
01-10 14:12:18.617035  1130  1130 D ViewRootImpl[DockedStackDivider]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 14:12:18.617889  1299  1299 D ImsConfigProvider: [onCreate] User locked, register receiver for BOOT_COMPLETED
01-10 14:12:18.618538  1311  1311 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:18.622059   523   562 D AAL     : 01-10 02:12:18.414 BL= 366,ESS= 256, 01-10 02:12:18.471 BL= 367,ESS= 256, 01-10 02:12:18.527 BL= 368,ESS= 256, 01-10 02:12:18.585 BL= 369,ESS= 256, 01-10 02:12:18.622 BL= 370,ESS= 256, 
01-10 14:12:18.622304   546  1160 D MtkOmxVdecEx: [0xf0ae4000] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.622356   546  1160 D MtkOmxVdecEx: [0xf0ae4000] ~MtkOmxVdec this= 0xF0AE4000
01-10 14:12:18.622505   546  1388 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.623215   398   640 I SurfaceFlinger: [SF client] NEW(0x7f769dfb40) for (943:system_server)
01-10 14:12:18.624241   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.625500   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.625945   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.XVID) in omx@1.0-service process
01-10 14:12:18.626670   546   657 D MtkOmxVdecEx: [0xf0ae5800] MtkOmxVdec::MtkOmxVdec this= 0xF0AE5800
01-10 14:12:18.626818   546   657 D MtkOmxVdecEx: [0xf0ae5800] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 14:12:18.627310   546   657 D MtkOmxVdecEx: [0xf0ae5800] MtkOmxComponentCreate mCompHandle(0xF0AE5804)
01-10 14:12:18.627352   546   657 D MtkOmxVdecEx: [0xf0ae5800] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.XVID)
01-10 14:12:18.628265   546   657 D MtkOmxVdecEx: [0xf0ae5800] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 14:12:18.628887   546  1391 D MtkOmxVdecEx: [0xf0ae5800] MtkOmxVdecThread created pVdec=0xF0AE5800, tid=1391
01-10 14:12:18.629211   546  1392 D MtkOmxVdecEx: [0xf0ae5800] MtkOmxVdecDecodeThread created pVdec=0xF0AE5800, tid=1392
01-10 14:12:18.629719   546  1393 D MtkOmxVdecEx: [0xf0ae5800] MtkOmxVdecConvertThread created pVdec=0xF0AE5800, tid=1393
01-10 14:12:18.637000   546   657 E OMXNodeInstance: getParameter(0xf0ae5804:MTK.DECODER.XVID, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.637249   537   704 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 14:12:18.637709   546   657 E OMXNodeInstance: getParameter(0xf0ae5804:MTK.DECODER.XVID, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.637967   546   657 E OMXNodeInstance: getExtensionIndex(0xf0ae5804:MTK.DECODER.XVID, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.638114   546   657 E MtkOmxVdecEx: [0xf0ae5800] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 14:12:18.638194   546   657 E OMXNodeInstance: setParameter(0xf0ae5804:MTK.DECODER.XVID, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 14:12:18.638529   546   657 D MtkOmxVdecEx: [0xf0ae5800] +MtkOmxVdec::ComponentDeInit
01-10 14:12:18.638791   546  1392 D MtkOmxVdecEx: [0xf0ae5800] MtkOmxVdecDecodeThread terminated pVdec=0xF0AE5800
01-10 14:12:18.638799   546  1393 D MtkOmxVdecEx: [0xf0ae5800] MtkOmxVdecConvertThread terminated
01-10 14:12:18.638882   546  1391 D MtkOmxVdecEx: [0xf0ae5800] MtkOmxVdecThread terminated
01-10 14:12:18.639168   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.647855   943   977 I WifiService: getVerboseLoggingLevel uid=10021
01-10 14:12:18.649168   546   657 D MtkOmxVdecEx: [0xf0ae5800] -MtkOmxVdec::ComponentDeInit
01-10 14:12:18.649256   546   657 D MtkOmxVdecEx: [0xf0ae5800] ~MtkOmxVdec this= 0xF0AE5800
01-10 14:12:18.649559   546  1394 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.651905   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.652267   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.AVC) in omx@1.0-service process
01-10 14:12:18.654872   806   926 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 14:12:18.655079   806   926 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 14:12:18.655137   806   926 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 14:12:18.659136   943   977 I WifiService: getWifiServiceMessenger uid=10021
01-10 14:12:18.662090   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::MtkOmxVenc this= 0xF0125000
01-10 14:12:18.662629   546   657 D MtkOmxVenc: [0xf0125000] dump flag=0x0
01-10 14:12:18.662767   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxComponentCreate mCompHandle(0xF0125004)
01-10 14:12:18.662804   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.AVC)
01-10 14:12:18.662851   546   657 E MtkOmxVenc: [0xf0125000] bufk = 0
01-10 14:12:18.662890   546   657 D MtkOmxVenc: [0xf0125000] uDefaultAVCProfileType 2
01-10 14:12:18.662915   546   657 D MtkOmxVenc: [0xf0125000] uDefaultAVCLevelType 4
01-10 14:12:18.662931   546   657 D MtkOmxVenc: [0xf0125000] uDefaultAVCProfileType 2
01-10 14:12:18.664123   546   657 D MtkOmxVenc: [0xf0125000] uDefaultAVCProfileType 2
01-10 14:12:18.664189   546   657 D MtkOmxVenc: [0xf0125000] uDefaultAVCLevelType 4
01-10 14:12:18.664207   546   657 D MtkOmxVenc: [0xf0125000] uDefaultAVCProfileType 2
01-10 14:12:18.664421   546   657 D MtkOmxVenc: [0xf0125000] InitSecEncParams svp support: 0, type: 0
01-10 14:12:18.664464   546   657 D MtkOmxVenc: [0xf0125000] ComponentInit init sec 2 mIsSecureInst 0
01-10 14:12:18.664892   546  1398 D MtkOmxVenc: [0xf0125000] MtkOmxVencEncodeThread created pVenc=0xF0125000, tid=1398
01-10 14:12:18.665022   546  1399 D MtkOmxVenc: [0xf0125000] MtkOmxVencConvertThread created pVenc=0xF0125000, tid=1399
01-10 14:12:18.666108   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.664804   546  1397 D MtkOmxVenc: [0xf0125000] MtkOmxVencThread created pVenc=0xF0125000
01-10 14:12:18.673062  1130  1130 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:18.673171  1130  1130 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:18.673496  1130  1130 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:18.673496  1130  1130 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP03_null_SEGDEFAULT:OP03SystemUI.apk:com.mediatek.op03.systemui.Op03SystemUICustomizationFactory:com.mediatek.op03.systemui)
01-10 14:12:18.673496  1130  1130 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07SystemUI.apk:com.mediatek.op07.systemui.OP07SystemUICustomizationFactory:com.mediatek.op07.systemui)
01-10 14:12:18.673496  1130  1130 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP18_null_SEGDEFAULT:OP18SystemUI.apk:com.mediatek.op18.systemui.Op18SystemUICustomizationFactory:com.mediatek.op18.systemui)
01-10 14:12:18.673496  1130  1130 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP01_null_null:OP01SystemUI.apk:com.mediatek.systemui.op01.Op01SystemUICustomizationFactory:com.mediatek.systemui.op01)
01-10 14:12:18.673496  1130  1130 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP02_null_null:OP02SystemUI.apk:com.mediatek.systemui.op02.Op02SystemUICustomizationFactory:com.mediatek.systemui.op02)
01-10 14:12:18.673496  1130  1130 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09SystemUI.apk:com.mediatek.systemui.op09.Op09SystemUICustomizationFactory:com.mediatek.systemui.op09)
01-10 14:12:18.673496  1130  1130 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP09_null_SEGC:OP09ClipSystemUI.apk:com.mediatek.systemui.op09clip.Op09SystemUICustomizationFactory:com.mediatek.systemui.op09clip)
01-10 14:12:18.673496  1130  1130 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP08_null_null:OP08SystemUI.apk:com.mediatek.op08.systemui.Op08SystemUICustomizationFactory:com.mediatek.op08.systemui)
01-10 14:12:18.673496  1130  1130 E OperatorCustomizationFactoryLoader: 8: OperatorFactoryInfo(OP20_null_null:OP20SystemUI.apk:com.mediatek.op20.systemui.Op20SystemUICustomizationFactory:com.mediatek.op20.systemui)
01-10 14:12:18.679213  1299  1299 I zygote64: Looking for service vendor.mediatek.hardware.radio@2.0::IRadio/imsrild1
01-10 14:12:18.679989   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 14:12:18.680061   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 14:12:18.680081   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 14:12:18.680099   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 14:12:18.680117   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 14:12:18.680136   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 14:12:18.680155   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.680744  1130  1284 D NetworkController: subscriptions is null
01-10 14:12:18.681649   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.682494   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.682645   537   704 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 14:12:18.683119   546   657 D MtkOmxVenc: [0xf0125000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 14:12:18.683836   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.684045   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.684991   546   657 D MtkOmxVenc: [0xf0125000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 14:12:18.685260   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.685431   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.685597   537   704 W OMXUtils: do not know color format 0x6 = 6
01-10 14:12:18.685927   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.686029   537   704 W OMXUtils: do not know color format 0xb = 11
01-10 14:12:18.686392   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.686538   537   704 W OMXUtils: do not know color format 0x10 = 16
01-10 14:12:18.689720   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.689976   537   704 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 14:12:18.690622   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.690775   537   704 W OMXUtils: do not know color format 0xf = 15
01-10 14:12:18.690929   546   657 D MtkOmxVenc: [0xf0125000] uGetIsNoTHWSolution0
01-10 14:12:18.691721   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.692138   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 14:12:18.692251   546   657 D MtkOmxVenc: [0xf0125000] +MtkOmxVenc::ComponentDeInit
01-10 14:12:18.692315   546  1398 D MtkOmxVenc: [0xf0125000] MtkOmxVencEncodeThread terminated pVenc=0xF0125000
01-10 14:12:18.692352   546  1397 D MtkOmxVenc: [0xf0125000] MtkOmxVencThread terminated
01-10 14:12:18.692347   546  1399 D MtkOmxVenc: [0xf0125000] MtkOmxVencConvertThread terminated pVenc=0xF0125000
01-10 14:12:18.692555   546   657 D MtkOmxVenc: [0xf0125000] -MtkOmxVenc::ComponentDeInit
01-10 14:12:18.692585   546   657 D MtkOmxVenc: [0xf0125000] ~MtkOmxVenc this= 0xF0125000
01-10 14:12:18.692699   546   657 D PQ      : [PQ][PQSessionManager] PQSessionManager()... 
01-10 14:12:18.692771   546   657 D PQ      : [PQ][PQSessionManager] m_PQSupport = 2 
01-10 14:12:18.692870   546  1400 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.695036   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.695045  1311  1311 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:18.695787   546   657 I OMXMaster: makeComponentInstance(OMX.google.h264.encoder) in omx@1.0-service process
01-10 14:12:18.697670  1299  1299 I zygote64: Starting thread pool.
01-10 14:12:18.703931  1349  1349 I SurfaceFactory: [static] sSurfaceFactory = com.mediatek.view.impl.SurfaceFactoryImpl@42cf4ac
01-10 14:12:18.708363   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.708493   398   640 I SurfaceFlinger: EventThread Client Pid (1349) created
01-10 14:12:18.709680   398   640 I SurfaceFlinger: EventThread Client Pid (1349) created
01-10 14:12:18.711728  1349  1349 D WindowClient: Add to mViews: DecorView@677757b[FallbackHome], this = android.view.WindowManagerGlobal@ecaaf98
01-10 14:12:18.712754  1349  1349 D OpenGLRenderer: Dumper init 4 threads <0x74b7f00680>
01-10 14:12:18.713185  1349  1349 D OpenGLRenderer: <com.android.settings> is running.
01-10 14:12:18.716663   398   640 I SurfaceFlinger: EventThread Client Pid (1349) created
01-10 14:12:18.717162   537   704 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 14:12:18.717332  1349  1407 D OpenGLRenderer: HWUI GL Pipeline
01-10 14:12:18.718649  1130  1130 D WindowClient: Add to mViews: com.android.systemui.assist.AssistOrbContainer{5bd4a3f G.E...... ......I. 0,0-0,0}, this = android.view.WindowManagerGlobal@48195ae
01-10 14:12:18.720638   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.720996   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.H263) in omx@1.0-service process
01-10 14:12:18.721638  1349  1349 D ViewRootImpl[FallbackHome]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 14:12:18.722810   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::MtkOmxVenc this= 0xF0125000
01-10 14:12:18.723265   546   657 D MtkOmxVenc: [0xf0125000] dump flag=0x0
01-10 14:12:18.723290   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.723382   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxComponentCreate mCompHandle(0xF0125004)
01-10 14:12:18.723512   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.H263)
01-10 14:12:18.723637   398   640 I SurfaceFlinger: [SF client] NEW(0x7f769dfc00) for (943:system_server)
01-10 14:12:18.724444   546  1410 D MtkOmxVenc: [0xf0125000] MtkOmxVencEncodeThread created pVenc=0xF0125000, tid=1410
01-10 14:12:18.724575   546  1409 D MtkOmxVenc: [0xf0125000] MtkOmxVencThread created pVenc=0xF0125000
01-10 14:12:18.725038  1130  1130 D ViewRootImpl[AssistPreviewPanel]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 14:12:18.725432  1349  1349 V PhoneWindow: DecorView setVisiblity: visibility = 0, Parent = ViewRoot{55d43f1 com.android.settings/com.android.settings.FallbackHome,ident = 0}, this = DecorView@677757b[FallbackHome]
01-10 14:12:18.725946   546  1411 D MtkOmxVenc: [0xf0125000] MtkOmxVencConvertThread created pVenc=0xF0125000, tid=1411
01-10 14:12:18.733440   943  1135 I SurfaceFactory: [static] sSurfaceFactory = com.mediatek.view.impl.SurfaceFactoryImpl@2557161
01-10 14:12:18.736059   546   657 E MtkOmxVenc: [0xf0125000] [ERROR] Unsupported H263 Level
01-10 14:12:18.737877   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 14:12:18.737943   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 14:12:18.737961   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 14:12:18.737978   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 14:12:18.737996   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 14:12:18.738014   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 14:12:18.738035   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.738211   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.738551   398   398 I BufferQueue: [unnamed-398-2](this:0x7f7b6e2800,id:2,api:0,p:-1,c:-1) BufferQueue core=(398:/system/bin/surfaceflinger)
01-10 14:12:18.738910   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.739120   537   704 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 14:12:18.739121   398   398 W GuiExt  : Cannot find GuiExtService
01-10 14:12:18.739313   398   398 I BufferQueueConsumer: [unnamed-398-2](this:0x7f7b6e2800,id:2,api:0,p:-1,c:398) connect(C): consumer=(398:/system/bin/surfaceflinger) controlledByApp=false
01-10 14:12:18.739438   398   398 I BufferQueueConsumer: [unnamed-398-2](this:0x7f7b6e2800,id:2,api:0,p:-1,c:398) setConsumerName: unnamed-398-2
01-10 14:12:18.739500   398   398 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7f7b6e2800,id:2,api:0,p:-1,c:398) setConsumerName: com.android.settings/com.android.settings.FallbackHome#0
01-10 14:12:18.739549   398   398 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7f7b6e2800,id:2,api:0,p:-1,c:398) setDefaultBufferSize: width=720 height=1280
01-10 14:12:18.741525   546   657 D MtkOmxVenc: [0xf0125000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 14:12:18.742219   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.743759   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.745469   546   657 D MtkOmxVenc: [0xf0125000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 14:12:18.746525   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.746781   537   704 W OMXUtils: do not know color format 0x6 = 6
01-10 14:12:18.747703   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.747770  1349  1349 D Surface : Surface::allocateBuffers(this=0x74b7ebf000)
01-10 14:12:18.747895   537   704 W OMXUtils: do not know color format 0xb = 11
01-10 14:12:18.748904   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.749198   537   704 W OMXUtils: do not know color format 0x10 = 16
01-10 14:12:18.749796   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.749969   537   704 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 14:12:18.750488   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.750658   537   704 W OMXUtils: do not know color format 0xf = 15
01-10 14:12:18.751129   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 14:12:18.751291   546   657 D MtkOmxVenc: [0xf0125000] +MtkOmxVenc::ComponentDeInit
01-10 14:12:18.751369   546  1411 D MtkOmxVenc: [0xf0125000] MtkOmxVencConvertThread terminated pVenc=0xF0125000
01-10 14:12:18.751372   546  1410 D MtkOmxVenc: [0xf0125000] MtkOmxVencEncodeThread terminated pVenc=0xF0125000
01-10 14:12:18.751649   546  1409 D MtkOmxVenc: [0xf0125000] MtkOmxVencThread terminated
01-10 14:12:18.751816   546   657 D MtkOmxVenc: [0xf0125000] -MtkOmxVenc::ComponentDeInit
01-10 14:12:18.751854   546   657 D MtkOmxVenc: [0xf0125000] ~MtkOmxVenc this= 0xF0125000
01-10 14:12:18.752038   546  1412 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.757154   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.760661  1299  1299 D ImsConfigStorage: ImsConfigStorage() on phone 0
01-10 14:12:18.764956   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.765469   546   657 I OMXMaster: makeComponentInstance(OMX.google.h263.encoder) in omx@1.0-service process
01-10 14:12:18.766353  1349  1407 I zygote64: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 14:12:18.766563  1349  1407 I OpenGLRenderer: Initialized EGL, version 1.4
01-10 14:12:18.766663  1349  1407 D OpenGLRenderer: Swap behavior 2
01-10 14:12:18.770021   546   657 I SoftMPEG4Encoder: Construct SoftMPEG4Encoder
01-10 14:12:18.771955   537   704 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 14:12:18.772273   546   657 E OMXNodeInstance: getConfig(0xf0a945a0:google.h263.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
01-10 14:12:18.774533  1311  1311 D TelephonyProvider: Version: [1376520]
01-10 14:12:18.777144  1349  1407 D OpenGLRenderer: [init] completed
01-10 14:12:18.777243  1349  1407 D HWUIExtension: MTKProgramCache.init: enable enhancement 1
01-10 14:12:18.777370  1349  1407 I HWUIExtension: Get disable program binary service property (0)
01-10 14:12:18.777399  1349  1407 I HWUIExtension: Initializing program atlas...
01-10 14:12:18.777686  1311  1311 D TelephonyProvider: DatabaseHelper: guestUser=false
01-10 14:12:18.778584  1349  1407 I ProgramBinary/Service: ProgramBinaryService client side disable debugging.
01-10 14:12:18.778684  1349  1407 I ProgramBinary/Service: ProgramBinaryService client side disable binary content debugging.
01-10 14:12:18.778700  1349  1407 D ProgramBinary/Service: BpProgramBinaryService.getReady
01-10 14:12:18.778724  1349  1407 D ProgramBinary/Service: zhiyin- 1 BpProgramBinaryService::getReady()
01-10 14:12:18.778946   569   634 D ProgramBinary/Service: zhiyin- ontransact 1 code 1
01-10 14:12:18.779040   569   634 D ProgramBinary/Service: zhiyin- ontransact 2 code 1
01-10 14:12:18.779063   569   634 D ProgramBinary/Service: zhiyin- ontransact 3 code 1
01-10 14:12:18.779234  1349  1407 D ProgramBinary/Service: zhiyin- 2 BpProgramBinaryService::getReady()
01-10 14:12:18.779273  1349  1407 D ProgramBinary/Service: BpProgramBinaryService.getProgramBinaryData
01-10 14:12:18.779374   569   634 D ProgramBinary/Service: zhiyin- ontransact 1 code 3
01-10 14:12:18.779778  1349  1407 I HWUIExtension: Program binary detail: Binary length is 188172, program map length is 104.
01-10 14:12:18.779940  1349  1407 I HWUIExtension: Succeeded to mmap program binaries. File descriptor is 66, and path is /dev/ashmem.
01-10 14:12:18.780001  1349  1407 I HWUIExtension: No need to use file discriptor anymore, close fd(66).
01-10 14:12:18.780151  1349  1407 D HWUIExtension: Dumper init 4 threads <0x74a97d9c00>
01-10 14:12:18.780301  1349  1407 D HWUIExtension: <com.android.settings> is running.
01-10 14:12:18.780371  1349  1407 D HWUIExtension: Initializing program cache from 0x0, size = -1
01-10 14:12:18.780809  1349  1407 D Surface : Surface::connect(this=0x74b7ebf000,api=1)
01-10 14:12:18.781417   398   421 I BufferQueueProducer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7f7b6e2800,id:2,api:1,p:1349,c:398) connect(P): api=1 producer=(1349:com.android.settings) producerControlledByApp=true
01-10 14:12:18.781554   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.782105   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.HEVC) in omx@1.0-service process
01-10 14:12:18.782816  1311  1311 D TelephonyProvider: dbh.onOpen: ok, queried table=siminfo
01-10 14:12:18.783228  1349  1407 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 14:12:18.783557  1311  1311 D TelephonyProvider: dbh.onOpen: ok, queried table=carriers
01-10 14:12:18.783609   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.784188   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::MtkOmxVenc this= 0xF0125000
01-10 14:12:18.784767   546   657 D MtkOmxVenc: [0xf0125000] dump flag=0x0
01-10 14:12:18.784886   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxComponentCreate mCompHandle(0xF0125004)
01-10 14:12:18.784906   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.HEVC)
01-10 14:12:18.784946   546   657 E MtkOmxVenc: [0xf0125000] bufk = 0
01-10 14:12:18.784961   546   657 D MtkOmxVenc: [0xf0125000] uIsHEVCSWPlatform 0
01-10 14:12:18.785569   546   657 D MtkOmxVenc: [0xf0125000] uIsHEVCSWPlatform 0
01-10 14:12:18.787906   546  1433 D MtkOmxVenc: [0xf0125000] MtkOmxVencThread created pVenc=0xF0125000
01-10 14:12:18.789095   546  1434 D MtkOmxVenc: [0xf0125000] MtkOmxVencEncodeThread created pVenc=0xF0125000, tid=1434
01-10 14:12:18.788199   546  1435 D MtkOmxVenc: [0xf0125000] MtkOmxVencConvertThread created pVenc=0xF0125000, tid=1435
01-10 14:12:18.795689   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 14:12:18.795787   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 14:12:18.795809   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 14:12:18.795827   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 14:12:18.795845   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 14:12:18.795870   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 14:12:18.795895   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.796185   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.796982   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.797123   537   704 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 14:12:18.798372   546   657 D MtkOmxVenc: [0xf0125000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 14:12:18.799202   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.800653   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.803122   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.807153   546   657 D MtkOmxVenc: [0xf0125000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 14:12:18.807848  1299  1299 D ImsConfigProvider: getSimState() for checking whether broadcast phoneId: 0, Sim state: null
01-10 14:12:18.807979   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.808152  1299  1299 D ImsConfigStorage: updateFeature: VoLTE initial value:1 for phoneId:0
01-10 14:12:18.808166   537   704 W OMXUtils: do not know color format 0x6 = 6
01-10 14:12:18.810754   394   414 I vendor.mediatek.hardware.power@1.1-impl: PowerHint hint:8, data:0
01-10 14:12:18.811948   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.813940  1311  1311 D CarrierProvider: onCreate
01-10 14:12:18.815548   943  1008 I ActivityManager: Displayed com.android.settings/.FallbackHome: +328ms
01-10 14:12:18.816820   537   704 W OMXUtils: do not know color format 0xb = 11
01-10 14:12:18.817382   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.817517   537   704 W OMXUtils: do not know color format 0x10 = 16
01-10 14:12:18.817877   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.817996   537   704 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 14:12:18.818341   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.818467   537   704 W OMXUtils: do not know color format 0xf = 15
01-10 14:12:18.818703   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 14:12:18.819358   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 14:12:18.819645   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.819659   546   657 D MtkOmxVenc: [0xf0125000] +MtkOmxVenc::ComponentDeInit
01-10 14:12:18.819735   546  1435 D MtkOmxVenc: [0xf0125000] MtkOmxVencConvertThread terminated pVenc=0xF0125000
01-10 14:12:18.819775   546  1433 D MtkOmxVenc: [0xf0125000] MtkOmxVencThread terminated
01-10 14:12:18.820379   546  1434 D MtkOmxVenc: [0xf0125000] MtkOmxVencEncodeThread terminated pVenc=0xF0125000
01-10 14:12:18.820722   394   413 I libPerfService: 10: legacy set freq: -1 -1 -1 -1
01-10 14:12:18.822144   546   657 D MtkOmxVenc: [0xf0125000] -MtkOmxVenc::ComponentDeInit
01-10 14:12:18.822238   546   657 D MtkOmxVenc: [0xf0125000] ~MtkOmxVenc this= 0xF0125000
01-10 14:12:18.822498   546  1436 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.824550  1299  1299 D ImsConfigProvider: getSimState() for checking whether broadcast phoneId: 0, Sim state: null
01-10 14:12:18.824833  1299  1299 D ImsConfigStorage: updateFeature: ViLTE initial value:0 for phoneId:0
01-10 14:12:18.825961   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.826394   546   657 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.MPEG4) in omx@1.0-service process
01-10 14:12:18.829703   943   943 D RttService: SCAN_AVAILABLE : 1
01-10 14:12:18.829830   943  1093 I WifiScanningService: wifi driver unloaded
01-10 14:12:18.829972   943  1094 D RttService: DefaultState got{ when=0 what=160513 target=com.android.internal.util.StateMachine$SmHandler }
01-10 14:12:18.830216   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::MtkOmxVenc this= 0xF0125000
01-10 14:12:18.830724   546   657 D MtkOmxVenc: [0xf0125000] dump flag=0x0
01-10 14:12:18.830840   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxComponentCreate mCompHandle(0xF0125004)
01-10 14:12:18.830868   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.MPEG4)
01-10 14:12:18.831259   546  1442 D MtkOmxVenc: [0xf0125000] MtkOmxVencEncodeThread created pVenc=0xF0125000, tid=1442
01-10 14:12:18.831328   546  1443 D MtkOmxVenc: [0xf0125000] MtkOmxVencConvertThread created pVenc=0xF0125000, tid=1443
01-10 14:12:18.831922   546  1441 D MtkOmxVenc: [0xf0125000] MtkOmxVencThread created pVenc=0xF0125000
01-10 14:12:18.838240   546   657 E MtkOmxVenc: [0xf0125000] QueryVideoProfileLevel(1) fail, profile(16384)/level(16)
01-10 14:12:18.838971   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 14:12:18.839037   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 14:12:18.839057   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 14:12:18.839073   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 14:12:18.839090   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 14:12:18.839108   546   657 E MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 14:12:18.839127   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.839359   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.840423  1299  1299 D ImsConfigProvider: getSimState() for checking whether broadcast phoneId: 0, Sim state: null
01-10 14:12:18.840609  1299  1299 D ImsConfigStorage: updateFeature: VoWIFI initial value:0 for phoneId:0
01-10 14:12:18.843080  1130  1130 D StatusBar: disable<e i a s b h r c s q >
01-10 14:12:18.844627   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.844728   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.845807   537   704 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 14:12:18.847301   546   657 D MtkOmxVenc: [0xf0125000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 14:12:18.847976   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.848212   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.848832   546   657 D MtkOmxVenc: [0xf0125000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 14:12:18.849734   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.849928   537   704 W OMXUtils: do not know color format 0x6 = 6
01-10 14:12:18.850505   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.850864   537   704 W OMXUtils: do not know color format 0xb = 11
01-10 14:12:18.852331   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.852542   537   704 W OMXUtils: do not know color format 0x10 = 16
01-10 14:12:18.854502   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.854883   537   704 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 14:12:18.855178   537  1264 E DrmMtkUtil/DrmUtil: checkDcf: not dcf type, dcf version value [79]
01-10 14:12:18.855281   537  1264 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 14:12:18.855315   537  1264 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:
01-10 14:12:18.855382   537  1264 D NuPlayerDriver: NuPlayerDriver(0xe9aaf540) created, clientPid(943)
01-10 14:12:18.856130   546   657 E OMXNodeInstance: getParameter(0xf0125004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.856404   537   704 W OMXUtils: do not know color format 0xf = 15
01-10 14:12:18.857208   546   657 D MtkOmxVenc: [0xf0125000] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 14:12:18.857394   546   657 D MtkOmxVenc: [0xf0125000] +MtkOmxVenc::ComponentDeInit
01-10 14:12:18.857484   546  1442 D MtkOmxVenc: [0xf0125000] MtkOmxVencEncodeThread terminated pVenc=0xF0125000
01-10 14:12:18.857484   546  1443 D MtkOmxVenc: [0xf0125000] MtkOmxVencConvertThread terminated pVenc=0xF0125000
01-10 14:12:18.857545   546  1441 D MtkOmxVenc: [0xf0125000] MtkOmxVencThread terminated
01-10 14:12:18.857812   546   657 D MtkOmxVenc: [0xf0125000] -MtkOmxVenc::ComponentDeInit
01-10 14:12:18.857842   546   657 D MtkOmxVenc: [0xf0125000] ~MtkOmxVenc this= 0xF0125000
01-10 14:12:18.858481   546  1444 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.860939   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.861213   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.861432   546  1160 I OMXMaster: makeComponentInstance(OMX.google.mpeg4.encoder) in omx@1.0-service process
01-10 14:12:18.862554   546  1160 I SoftMPEG4Encoder: Construct SoftMPEG4Encoder
01-10 14:12:18.866298  1299  1299 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:18.866398  1299  1299 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:18.866595  1299  1299 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:18.866595  1299  1299 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP08_null_null:OP08Ims.apk:com.mediatek.op08.ims.Op08ImsServiceCustomizationFactory:com.mediatek.op08.ims)
01-10 14:12:18.866595  1299  1299 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP18_null_null:OP18Ims.jar:com.mediatek.op18.ims.Op18ImsServiceCustomizationFactory:null)
01-10 14:12:18.866595  1299  1299 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP12_null_null:OP12Ims.apk:com.mediatek.op12.ims.Op12ImsServiceCustomizationFactory:com.mediatek.op12.ims)
01-10 14:12:18.866595  1299  1299 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP112_null_null:OP112Ims.apk:com.mediatek.op112.ims.Op112ImsServiceCustomizationFactory:com.mediatek.op112.ims)
01-10 14:12:18.868745   537   704 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 14:12:18.870285   546  1160 E OMXNodeInstance: getConfig(0xf0a943c0:google.mpeg4.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
01-10 14:12:18.873574   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.873958   546  1160 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.VPX) in omx@1.0-service process
01-10 14:12:18.876406   537  1451 D GenericSource: FileSource remote
01-10 14:12:18.876452   546  1160 D MtkOmxVenc: [0xf0f5d800] MtkOmxVenc::MtkOmxVenc this= 0xF0F5D800
01-10 14:12:18.877005   546  1160 D MtkOmxVenc: [0xf0f5d800] dump flag=0x0
01-10 14:12:18.877143   546  1160 D MtkOmxVenc: [0xf0f5d800] MtkOmxComponentCreate mCompHandle(0xF0F5D804)
01-10 14:12:18.877183   546  1160 D MtkOmxVenc: [0xf0f5d800] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.VPX)
01-10 14:12:18.877229   546  1160 E MtkOmxVenc: [0xf0f5d800] bufk = 0
01-10 14:12:18.878009   546  1453 D MtkOmxVenc: [0xf0f5d800] MtkOmxVencThread created pVenc=0xF0F5D800
01-10 14:12:18.878435   546  1454 D MtkOmxVenc: [0xf0f5d800] MtkOmxVencEncodeThread created pVenc=0xF0F5D800, tid=1454
01-10 14:12:18.879254   546  1455 D MtkOmxVenc: [0xf0f5d800] MtkOmxVencConvertThread created pVenc=0xF0F5D800, tid=1455
01-10 14:12:18.879319  1311  1311 I ImsResolver: Initializing cache and binding.
01-10 14:12:18.879952  1299  1299 D ImsVT Util: multiIMSSupportNum:1
01-10 14:12:18.880110  1299  1299 D ImsVT Util: Getprop [persist.mtk.vilte.enable][0]=false
01-10 14:12:18.880112   546  1160 E MtkOmxVenc: [0xf0f5d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 14:12:18.880164   546  1160 E MtkOmxVenc: [0xf0f5d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 14:12:18.880188   546  1160 E MtkOmxVenc: [0xf0f5d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 14:12:18.880209   546  1160 E MtkOmxVenc: [0xf0f5d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 14:12:18.880231   546  1160 E MtkOmxVenc: [0xf0f5d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 14:12:18.880255   546  1160 E MtkOmxVenc: [0xf0f5d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 14:12:18.880278   546  1160 E OMXNodeInstance: getParameter(0xf0f5d804:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.880372  1299  1299 D ImsVT Util: Getprop [persist.mtk.viwifi.enable][0]=false
01-10 14:12:18.880494   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.880902  1299  1452 D ImsVT Util: setContextAndInitRefVTPInternal(), context =com.mediatek.ims.ImsApp@803755a
01-10 14:12:18.880915   546  1160 E OMXNodeInstance: getParameter(0xf0f5d804:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.880991   537   704 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 14:12:18.881208  1299  1452 D VT SRC  : [STC] [setContext] context:com.mediatek.ims.ImsApp@803755a
01-10 14:12:18.881246   546  1160 D MtkOmxVenc: [0xf0f5d800] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 14:12:18.881353  1299  1452 D ImsVT Util: setContextAndInitRefVTP, register FeatureValueReceiver
01-10 14:12:18.881635   546  1160 E OMXNodeInstance: getParameter(0xf0f5d804:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.882075   535   663 V APEExtractor: getAPEInfo not ape 20482
01-10 14:12:18.882257   535   663 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:18.882572   537   704 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 14:12:18.883172  1299  1452 D ImsVT Util: setContextAndInitRefVTP, register SimStateReceiver
01-10 14:12:18.883202   546  1160 D MtkOmxVenc: [0xf0f5d800] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 14:12:18.883860   546  1160 E OMXNodeInstance: getParameter(0xf0f5d804:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.884025   537   704 W OMXUtils: do not know color format 0x6 = 6
01-10 14:12:18.885058   546  1160 E OMXNodeInstance: getParameter(0xf0f5d804:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.885600   537   704 W OMXUtils: do not know color format 0xb = 11
01-10 14:12:18.885848   537  1448 D NuPlayerDriver: notifyListener_l(0xe9aaf540), (1, 0, 0, -1), loop setting(0, 0)
01-10 14:12:18.886280  1299  1452 D ImsVT Util: setContextAndInitRefVTPInternal(), ViLTE on, do natvie init
01-10 14:12:18.886279   523   562 D AAL     : 01-10 02:12:18.678 BL= 371,ESS= 256, 01-10 02:12:18.716 BL= 372,ESS= 256, 01-10 02:12:18.772 BL= 373,ESS= 256, 01-10 02:12:18.810 BL= 374,ESS= 256, 01-10 02:12:18.886 BL= 375,ESS= 256, 
01-10 14:12:18.886535   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.886757   546  1160 E OMXNodeInstance: getParameter(0xf0f5d804:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.886883   537   704 W OMXUtils: do not know color format 0x10 = 16
01-10 14:12:18.887221   546  1160 E OMXNodeInstance: getParameter(0xf0f5d804:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.887305   537   704 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 14:12:18.887692   546  1160 E OMXNodeInstance: getParameter(0xf0f5d804:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 14:12:18.887792   537   704 W OMXUtils: do not know color format 0xf = 15
01-10 14:12:18.888092   546  1160 D MtkOmxVenc: [0xf0f5d800] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 14:12:18.888239   546  1160 D MtkOmxVenc: [0xf0f5d800] +MtkOmxVenc::ComponentDeInit
01-10 14:12:18.888373   546  1455 D MtkOmxVenc: [0xf0f5d800] MtkOmxVencConvertThread terminated pVenc=0xF0F5D800
01-10 14:12:18.889172   546  1454 D MtkOmxVenc: [0xf0f5d800] MtkOmxVencEncodeThread terminated pVenc=0xF0F5D800
01-10 14:12:18.891160   530   858 I VT      : [VTS] gVTSClient == NULL
01-10 14:12:18.891557   546  1453 D MtkOmxVenc: [0xf0f5d800] MtkOmxVencThread terminated
01-10 14:12:18.891802   546  1160 D MtkOmxVenc: [0xf0f5d800] -MtkOmxVenc::ComponentDeInit
01-10 14:12:18.891839   546  1160 D MtkOmxVenc: [0xf0f5d800] ~MtkOmxVenc this= 0xF0F5D800
01-10 14:12:18.892046   546  1456 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 14:12:18.892852   943   943 D Ringtone: Successfully created local player
01-10 14:12:18.893047   943   943 W Ringtone: Use of stream types is deprecated for operations other than volume control
01-10 14:12:18.893088   943   943 W Ringtone: See the documentation of setStreamType() for what to use instead with android.media.AudioAttributes to qualify your playback use case
01-10 14:12:18.893738   537  1264 D NuPlayerDriver: reset(0xe9aaf540) at state 4
01-10 14:12:18.893893   537  1264 D NuPlayerDriver: notifyListener_l(0xe9aaf540), (8, 0, 0, -1), loop setting(0, 0)
01-10 14:12:18.893982   537  1264 D GenericSource: disconnect: mDataSource 0xe9af73c0 mHttpSource 0x0
01-10 14:12:18.894488   537   704 I OMXClient: Treble IOmx obtained
01-10 14:12:18.894881   546  1160 I OMXMaster: makeComponentInstance(OMX.google.vp8.encoder) in omx@1.0-service process
01-10 14:12:18.895832   537  1448 D NuPlayerDriver: notifyResetComplete(0xe9aaf540)
01-10 14:12:18.896329   537  1264 D NuPlayerDriver: reset(0xe9aaf540) at state 0
01-10 14:12:18.896848   943   943 V MediaPlayer: resetDrmState:  mDrmInfo=null mDrmProvisioningThread=null mPrepareDrmInProgress=false mActiveDrmScheme=false
01-10 14:12:18.896982   943   943 V MediaPlayer: cleanDrmObj: mDrmObj=null mDrmSessionId=null
01-10 14:12:18.897717   943   943 V MediaPlayer: resetDrmState:  mDrmInfo=null mDrmProvisioningThread=null mPrepareDrmInProgress=false mActiveDrmScheme=false
01-10 14:12:18.897788   943   943 V MediaPlayer: cleanDrmObj: mDrmObj=null mDrmSessionId=null
01-10 14:12:18.901397   537  1264 E DrmMtkUtil/DrmUtil: checkDcf: not dcf type, dcf version value [79]
01-10 14:12:18.901519   537  1264 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 14:12:18.901564   537  1264 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:
01-10 14:12:18.901647   537  1264 D NuPlayerDriver: NuPlayerDriver(0xe9aaf5b0) created, clientPid(943)
01-10 14:12:18.905306   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.913910   537   704 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 14:12:18.914400   546  1160 E OMXNodeInstance: getConfig(0xf0a943c0:google.vp8.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
01-10 14:12:18.922716  1311  1311 I zygote64: Looking for service android.hardware.radio.deprecated@1.0::IOemHook/slot1
01-10 14:12:18.926810   537  1462 D GenericSource: FileSource remote
01-10 14:12:18.926990  1311  1311 I zygote64: Starting thread pool.
01-10 14:12:18.928293   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.928816   943  1155 I OMXClient: Treble IOmx obtained
01-10 14:12:18.929253   546   657 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:18.929323  1130  1260 I OMXClient: Treble IOmx obtained
01-10 14:12:18.930125  1200  1200 E DrmMtkUtil/SecureTimer: open proc/uptime failed: [Permission denied].
01-10 14:12:18.930514   546  1160 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:18.932812   943  1155 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x74a1832800
01-10 14:12:18.933683   535  1460 V APEExtractor: getAPEInfo not ape 20482
01-10 14:12:18.933802   535  1460 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:18.934312  1130  1260 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x74c3082c00
01-10 14:12:18.934563   546  1160 E OMXNodeInstance: getConfig(0xf0a945a0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 14:12:18.934958   546   657 E OMXNodeInstance: getConfig(0xf0a943c0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 14:12:18.926000  1200  1200 W main    : type=1400 audit(0.0:48): avc: denied { open } for path="/proc/uptime" dev="proc" ino=4026532104 scontext=u:r:webview_zygote:s0 tcontext=u:object_r:proc:s0 tclass=file permissive=0
01-10 14:12:18.938252  1299  1452 I VT      : [JNI] Entering InitRefVTP
01-10 14:12:18.938288  1299  1452 I VT      : [JNI] Entering native_init
01-10 14:12:18.938504  1299  1452 E VT      : [JNI] native_init (g_client == 0)
01-10 14:12:18.938516   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.938575  1299  1452 I VT      : [VTC] before getVTService
01-10 14:12:18.939530   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.939513  1299  1299 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:18.940690   537  1461 D NuPlayerDriver: notifyListener_l(0xe9aaf5b0), (1, 0, 0, -1), loop setting(0, 0)
01-10 14:12:18.943637   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.943916  1299  1452 I VT      : [VTC] after getVTService
01-10 14:12:18.944060  1299  1452 I VT      : [VTC] Add DeathNotifier
01-10 14:12:18.944970   530   861 I ServiceManager: Waiting for service phone...
01-10 14:12:18.948315   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.949278   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 14:12:18.949988   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.951240  1200  1200 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base_mtk.so absent, libpq_cust_mtk.so absent
01-10 14:12:18.952006  1200  1200 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 14:12:18.952506  1200  1200 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 14:12:18.952653   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.952683  1200  1200 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 14:12:18.953183  1200  1200 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 14:12:18.953742   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.956107   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.956560   943   943 D Ringtone: Successfully created local player
01-10 14:12:18.956865   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.957403   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 14:12:18.957867   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.958360   537   704 D NuPlayerDriver: start(0xe9aaf5b0), state is 4, eos is 0
01-10 14:12:18.958480   537  1461 I GenericSource: start
01-10 14:12:18.959144   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.959153  1299  1299 D WfoService: onCreate()
01-10 14:12:18.959312  1299  1299 D WfoService: WfoService new MWIService
01-10 14:12:18.960990   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.962117   943   952 I zygote64: Background concurrent copying GC freed 96633(5MB) AllocSpace objects, 18(632KB) LOS objects, 42% free, 8MB/14MB, paused 290us total 260.181ms
01-10 14:12:18.963795   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.965006   943  1006 W TelecomManager: Telecom Service not found.
01-10 14:12:18.966661   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.967961   943  1006 W TelecomManager: Telecom Service not found.
01-10 14:12:18.968310   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.970269   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:18.976544   537  1475 I OMXClient: Treble IOmx obtained
01-10 14:12:18.977013   546   657 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:18.979623   537  1475 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0xe7eed800
01-10 14:12:18.980804   943  1214 I WifiService: getWifiEnabledState uid=1001
01-10 14:12:18.981559  1299  1299 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 14:12:18.981573   546  1199 E OMXNodeInstance: setConfig(0xf0a94780:google.vorbis.decoder, ConfigPriority(0x6f800002)) ERROR: Undefined(0x80001001)
01-10 14:12:18.981714   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.981799   537  1475 I ACodec  : codec does not support config priority (err -2147483648)
01-10 14:12:18.982269   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.982604   546  1199 E OMXNodeInstance: getConfig(0xf0a94780:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 14:12:18.982776   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:18.982850   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.983707   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 14:12:18.983969   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.984131   537  1475 I MediaCodec: MediaCodec will operate in async mode
01-10 14:12:18.984320   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.984584   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.985820   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:18.988968   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:18.997803  1311  1311 I zygote64: Looking for service vendor.mediatek.hardware.radio@2.0::IRadio/slot1
01-10 14:12:18.998396   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.000020   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 14:12:19.000691   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.002179  1311  1311 I zygote64: Starting thread pool.
01-10 14:12:19.004441   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.007488   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 14:12:19.008551   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.012146   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.015286   943  1214 I WifiService: getWifiEnabledState uid=1001
01-10 14:12:19.016519  1299  1299 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:19.016614  1299  1299 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:19.016771  1299  1299 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:19.016771  1299  1299 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP07_null_null:OP07Wos.apk:com.mediatek.op07.wfo.Op07WosCustomizationFactory:com.mediatek.op07.wfo)
01-10 14:12:19.016771  1299  1299 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP08_null_null:OP08Wos.apk:com.mediatek.op08.wfo.Op08WosCustomizationFactory:com.mediatek.op08.wfo)
01-10 14:12:19.017140  1299  1299 D DefaultWosExt: DefaultWosExt constructor
01-10 14:12:19.023112   943  1147 V NuMediaExtractor: setDataSource fd=197 (/system/media/audio/ui/KeypressStandard.ogg), offset=0, length=5837
01-10 14:12:19.024469   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:19.024890   528   733 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:19.025437  1130  1479 I SecurityController: e.getMessage() = could not bind to KeyChainService
01-10 14:12:19.027454   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:19.027620   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.027677   528   733 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:19.029056   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.029167  1299  1299 D WfoService: onStartCommand()
01-10 14:12:19.029366  1299  1299 D WfoService: Service starting for intent null
01-10 14:12:19.030335   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.030848   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.031559   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.035793   535  1459 V APEExtractor: getAPEInfo not ape 20483
01-10 14:12:19.035961   535  1459 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:19.038186  1299  1299 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 14:12:19.040519   537  1473 D AudioTrack: set(): 0xe738a000, streamType 1, sampleRate 44100, format 0x1, channelMask 0x1, frameCount 22560, flags #0, notificationFrames 0, sessionId 17, transferType 0, uid 1000, pid 943
01-10 14:12:19.040647   537  1473 D AudioTrack: Building AudioTrack with attributes: usage = 13, content = 4, flags = 0x0, tags = []
01-10 14:12:19.042284  1311  1311 W System.err: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 14:12:19.042628  1311  1311 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 14:12:19.042693  1311  1311 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 14:12:19.042710  1311  1311 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 14:12:19.042728  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.getRilOp(MtkRIL.java:467)
01-10 14:12:19.042744  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.<init>(MtkRIL.java:377)
01-10 14:12:19.042761  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkTelephonyComponentFactory.makeRil(MtkTelephonyComponentFactory.java:188)
01-10 14:12:19.042776  1311  1311 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhone(PhoneFactory.java:206)
01-10 14:12:19.042794  1311  1311 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhones(PhoneFactory.java:131)
01-10 14:12:19.042809  1311  1311 W System.err: 	at com.android.phone.PhoneGlobals.onCreate(PhoneGlobals.java:370)
01-10 14:12:19.042823  1311  1311 W System.err: 	at com.android.phone.PhoneApp.onCreate(PhoneApp.java:43)
01-10 14:12:19.042838  1311  1311 W System.err: 	at android.app.Instrumentation.callApplicationOnCreate(Instrumentation.java:1119)
01-10 14:12:19.042874  1311  1311 W System.err: 	at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5781)
01-10 14:12:19.042889  1311  1311 W System.err: 	at android.app.ActivityThread.-wrap1(Unknown Source:0)
01-10 14:12:19.042903  1311  1311 W System.err: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1690)
01-10 14:12:19.042916  1311  1311 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 14:12:19.042932  1311  1311 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 14:12:19.042945  1311  1311 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 14:12:19.042963  1311  1311 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 14:12:19.042978  1311  1311 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 14:12:19.042992  1311  1311 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 14:12:19.043204  1311  1311 W System.err: Caused by: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 14:12:19.043234  1311  1311 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 14:12:19.043250  1311  1311 W System.err: 	at java.lang.BootClassLoader.findClass(ClassLoader.java:1355)
01-10 14:12:19.043195   524   524 D AudioFlinger: track(0xe9e43180): mIsOut 1, mFrameCount 22560, mSampleRate 44100, mFormat 1, mChannelCount 1, mTrackCount 0, thread 0xe9c03980, sessionId 17
01-10 14:12:19.043267  1311  1311 W System.err: 	at java.lang.BootClassLoader.loadClass(ClassLoader.java:1415)
01-10 14:12:19.043297  1311  1311 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 14:12:19.043307  1311  1311 W System.err: 	... 20 more
01-10 14:12:19.043357   524   524 D AudioFlinger: track(0xe9e43180): mFastIndex -1, mStreamType 1, mName 4096
01-10 14:12:19.043365  1311  1311 W System.err: Caused by: java.lang.NoClassDefFoundError: Class not found using the boot class loader; no stack trace available
01-10 14:12:19.044387   537  1473 D AudioTrack: Client defaulted notificationFrames to 7520 for frameCount 22560
01-10 14:12:19.044585   537  1473 D AudioTrack: createTrack_l: 0xe738a000, mCblk = 0xe6f80000, mLatency = 563, mAfLatency = 52, frameCount = 22560, mSampleRate = 44100, mFlags = 0, mReqFrameCount = 22560, mNotificationFramesAct = 7520
01-10 14:12:19.045317   537  1473 D AudioTrack: start(): 0xe738a000, mState = 1
01-10 14:12:19.045515   524   707 D APM_AudioPolicyManager: startOutput() output 13, stream 1, session 17
01-10 14:12:19.045717   524   707 V APM::AudioOutputDescriptor: changeRefCount() stream 1, count 1
01-10 14:12:19.045803  1299  1299 D WfoService: onStartCommand()
01-10 14:12:19.045890  1299  1299 D WfoService: Service starting for intent null
01-10 14:12:19.046226   524   700 D AudioSystem: +setParameters(): volumeDevice=2;volumeIndex=13;volumeStreamType=1 
01-10 14:12:19.046836   377   377 D AudioALSAStreamOut: +setParameters(): flag 6, volumeDevice=2;volumeIndex=13;volumeStreamType=1
01-10 14:12:19.047010   377   377 D AudioMTKGainController: setNormalVolume(), mSceneIndex = 0, stream 1, devices 0x2, index 13, mode 0x0
01-10 14:12:19.047079   377   377 D AudioMTKGainController: setSpeakerGain(), gain = 9, spkAnaType = 3, spkLMixerName = Lineout_PGAL_GAIN, spkRMixerName = Lineout_PGAR_GAIN
01-10 14:12:19.048396   943  1147 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 14:12:19.051891   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 14:12:19.052054   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 14:12:19.053954   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.059061   943  1485 I OMXClient: Treble IOmx obtained
01-10 14:12:19.059531   546   657 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:19.061385   943  1485 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x74badf2c00
01-10 14:12:19.061977   546   657 E OMXNodeInstance: getConfig(0xf0a94840:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 14:12:19.064268  1130  1244 V NuMediaExtractor: setDataSource fd=47 (/system/media/audio/ui/Unlock.ogg), offset=0, length=7853
01-10 14:12:19.065230   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/1130/cmdline]
01-10 14:12:19.065983   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.067739   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 14:12:19.068586   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.069274   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/1130/cmdline]
01-10 14:12:19.071690   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.072384   535  1460 V APEExtractor: getAPEInfo not ape 20482
01-10 14:12:19.072491   535  1460 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:19.072620   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.073365   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.073593   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.074804   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.076328  1130  1244 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 14:12:19.080725  1130  1490 I OMXClient: Treble IOmx obtained
01-10 14:12:19.081161   546  1199 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:19.082028  1130  1130 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:19.082174  1130  1130 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:19.082492  1130  1130 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:19.082492  1130  1130 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01SystemUI.apk:com.mediatek.keyguard.op01.Op01KeyguardCustomizationFactory:com.mediatek.systemui.op01)
01-10 14:12:19.082492  1130  1130 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02SystemUI.apk:com.mediatek.keyguard.op02.Op02KeyguardCustomizationFactory:com.mediatek.systemui.op02)
01-10 14:12:19.082492  1130  1130 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07SystemUI.apk:com.mediatek.op07.keyguard.Op07KeyguardCustomizationFactory:com.mediatek.op07.systemui)
01-10 14:12:19.082492  1130  1130 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09SystemUI.apk:com.mediatek.keyguard.op09.Op09KeyguardCustomizationFactory:com.mediatek.systemui.op09)
01-10 14:12:19.082492  1130  1130 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP09_null_SEGC:OP09ClipSystemUI.apk:com.mediatek.keyguard.op09clip.Op09KeyguardCustomizationFactory:com.mediatek.systemui.op09clip)
01-10 14:12:19.085174  1130  1490 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x74bad39000
01-10 14:12:19.085809   546  1199 E OMXNodeInstance: getConfig(0xf0a943c0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 14:12:19.088321   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.090015   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 14:12:19.090725   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.092819   398  1416 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=23.37 dur=1027.13 max=57.31 min=32.44
01-10 14:12:19.093821   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.094705   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.095802   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.096332   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.097229   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.106054   943  1147 V NuMediaExtractor: setDataSource fd=198 (/system/media/audio/ui/KeypressSpacebar.ogg), offset=0, length=5952
01-10 14:12:19.106837   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:19.107015   528   733 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:19.107189   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.107582  1311  1311 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:19.107694  1311  1311 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:19.107864  1311  1311 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:19.107864  1311  1311 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP18_null_null:OP18Ims.jar:com.mediatek.op18.ims.Op18ImsCustomizationFactory:null)
01-10 14:12:19.107864  1311  1311 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP15_null_null:OP15Ims.jar:com.mediatek.op15.ims.Op15ImsCustomizationFactory:null)
01-10 14:12:19.108167   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.108858   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:19.108919   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.109053   528   733 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:19.109757   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.110888  1130  1130 W TelecomManager: Telecom Service not found.
01-10 14:12:19.111015   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.118937   535   663 V APEExtractor: getAPEInfo not ape 20482
01-10 14:12:19.119081   535   663 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:19.122113  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:19.122225  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:19.122279  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:19.123299   943  1147 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 14:12:19.128698  1311  1496 D PowerSM : mDesiredModemPower: true mCurrentModemPower: true
01-10 14:12:19.129534   943  1495 I OMXClient: Treble IOmx obtained
01-10 14:12:19.130009   546  1199 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:19.131286   523   562 D AAL     : 01-10 02:12:18.924 BL= 376,ESS= 256, 01-10 02:12:18.980 BL= 377,ESS= 256, 01-10 02:12:19.018 BL= 378,ESS= 256, 01-10 02:12:19.095 BL= 379,ESS= 256, 01-10 02:12:19.131 BL= 380,ESS= 256, 
01-10 14:12:19.132123   943  1495 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x749da48800
01-10 14:12:19.132582   546  1199 E OMXNodeInstance: getConfig(0xf0a94600:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 14:12:19.134888   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.136666   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 14:12:19.137675   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.137676   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.140129   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.142167   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 14:12:19.143030   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.146775  1130  1244 V NuMediaExtractor: setDataSource fd=48 (/system/media/audio/ui/Trusted.ogg), offset=0, length=5713
01-10 14:12:19.147744   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/1130/cmdline]
01-10 14:12:19.150699   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/1130/cmdline]
01-10 14:12:19.153644   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.153602   535  1459 V APEExtractor: getAPEInfo not ape 20482
01-10 14:12:19.153738   535  1459 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:19.158061  1130  1244 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 14:12:19.163921  1130  1503 I OMXClient: Treble IOmx obtained
01-10 14:12:19.164442   546  1199 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:19.166454  1130  1503 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x74bad16c00
01-10 14:12:19.167373   546   657 E OMXNodeInstance: getConfig(0xf0a945a0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 14:12:19.170115   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.171135   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.171509  1311  1311 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:19.171611  1311  1311 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:19.171874  1311  1311 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:19.171874  1311  1311 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01Telephony.jar:com.mediatek.op01.telephony.Op01TelephonyCustomizationFactory:null)
01-10 14:12:19.171874  1311  1311 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02Telephony.jar:com.mediatek.op02.telephony.Op02TelephonyCustomizationFactory:null)
01-10 14:12:19.171874  1311  1311 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP08_null_null:OP08Telephony.jar:com.mediatek.op08.telephony.Op08TelephonyCustomizationFactory:null)
01-10 14:12:19.171874  1311  1311 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09ATelephony.jar:com.mediatek.op09a.telephony.Op09ATelephonyCustomizationFactory:null)
01-10 14:12:19.171874  1311  1311 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP09_null_SEGC:OP09CTelephony.jar:com.mediatek.op09c.telephony.Op09CTelephonyCustomizationFactory:null)
01-10 14:12:19.171874  1311  1311 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP12_null_null:OP12Telephony.jar:com.mediatek.op12.telephony.Op12TelephonyCustomizationFactory:null)
01-10 14:12:19.171874  1311  1311 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP07_null_null:OP07Telephony.jar:com.mediatek.op07.telephony.Op07TelephonyCustomizationFactory:null)
01-10 14:12:19.171874  1311  1311 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP18_null_null:OP18Telephony.jar:com.mediatek.op18.telephony.Op18TelephonyCustomizationFactory:null)
01-10 14:12:19.172769   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.174179   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.174863   943  1147 V NuMediaExtractor: setDataSource fd=199 (/system/media/audio/ui/KeypressDelete.ogg), offset=0, length=5832
01-10 14:12:19.174983  1130  1130 I CameraManagerGlobal: Connecting to camera service
01-10 14:12:19.175946   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:19.176121   528   733 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:19.177361   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.178075   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:19.178335   528   733 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:19.179118   527   730 I CameraService: CameraService::connect call (PID -1 "cameraserver", camera ID 0) for HAL version default and Camera API version 1
01-10 14:12:19.179601   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.180121   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.181029   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 14:12:19.181970   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.182416   535   663 V APEExtractor: getAPEInfo not ape 20482
01-10 14:12:19.182566   535   663 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:19.185450   527   730 I CameraService: onTorchStatusChangedLocked: Torch status changed for cameraId=0, newStatus=0
01-10 14:12:19.186383   527   730 I CameraHardwareInterface: Opening camera 0
01-10 14:12:19.186507   943  1147 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 14:12:19.188288   548   877 I mtkcam-dev1: [createSpecificCameraDevice1] APP_MODE_NAME_DEFAULT
01-10 14:12:19.188998   537   704 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 14:12:19.189131   537   704 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:cX�
01-10 14:12:19.189311   537   704 D NuPlayerDriver: NuPlayerDriver(0xe77e51c0) created, clientPid(527)
01-10 14:12:19.192868   394   413 I powerd  : [powerd_req] POWER_MSG_SCN_REG: pid:548, uid:1047
01-10 14:12:19.193228   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnReg hdl:39
01-10 14:12:19.193130   943  1511 I OMXClient: Treble IOmx obtained
01-10 14:12:19.193606   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.193551   548   882 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:19.193796   546   657 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:19.194803   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.195744   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.196085   943  1511 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x74a198cc00
01-10 14:12:19.196493   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnEnable hdl:39, timeout:1000
01-10 14:12:19.196970   394   413 I powerd  : [powerd_req] POWER_MSG_SCN_ENABLE: hdl:39, timeout:1000
01-10 14:12:19.197057   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.197094   394   413 I libPerfService: perfUserScnEnable - handle:39
01-10 14:12:19.197160   548   877 I mtkcam-dev1: [createSpecificCameraDevice1] - 0xefab0600
01-10 14:12:19.197280   548   877 I mtkcam-dev1: 0[CameraDevice1Base::open] +
01-10 14:12:19.197309   546  1199 E OMXNodeInstance: getConfig(0xf0a94360:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 14:12:19.197434   394   413 I libPerfService: 39: legacy set freq: 1508000 -1 2002000 -1
01-10 14:12:19.197826   548   877 I mtkcam-devicemgr: [attachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 14:12:19.197
01-10 14:12:19.198265   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.198718   548   877 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_AE,0),srIdxNum(0)
01-10 14:12:19.198800   548   877 I Drv/HWsync: Drv/HWsync[init] mAECyclePeriod(3)
01-10 14:12:19.198814   548   877 I Drv/HWsync: Drv/HWsync[init] -
01-10 14:12:19.198895   548   877 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:19.198936   548   877 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0xe671f9d8), bForceRead(0) +
01-10 14:12:19.198965   548  1516 D SeninfDrvImp: [init][init]: Entry count 0 
01-10 14:12:19.198955   548   877 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:19.199360   548   877 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0xe6c19e48), bForceRead(0) +
01-10 14:12:19.199516   548   877 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:19.199539   548   877 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:19.200558   548  1516 D SeninfDrvImp: [init]Efuse Data:0x11f1018c= 0x8c631940, 0x11f10190= 0x7c208364, 0x11f101bc= 0x80000000
01-10 14:12:19.200706   548  1516 D SeninfDrvImp: [init][init]: Exit count 1 
01-10 14:12:19.200818   548  1516 D ImgSensorDrv: [init][init] imgsensor_drv 1
01-10 14:12:19.200978   548  1516 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11)
01-10 14:12:19.201040   548  1516 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11), SENINF_TG1_PH_CNT(0x80000005)
01-10 14:12:19.201525   548  1516 D SeninfDrvImp: [setMclk1IODrivingCurrent]DrivingIdx(3), Reg(0x30000000)
01-10 14:12:19.201915   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.203161   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.203888  1311  1311 D @M_MtkDupSmsFilter: call constructor
01-10 14:12:19.204493   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.190000   548   548 W HwBinder:548_2: type=1400 audit(0.0:49): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:19.200185   548   877 D LaserDrv: Device error opening : No such file or directory
01-10 14:12:19.205417   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.205866   548   877 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:19.205942   548   877 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 14:12:19.206394   535   663 V APEExtractor: getAPEInfo not ape 20482
01-10 14:12:19.206543   535   663 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:19.208286   548   877 D AppTsf  : [AppTsf] constructor
01-10 14:12:19.208379   548   877 D tsf_core: [TsfCore] constructor
01-10 14:12:19.210239   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.210525   548   877 W aaa_state_mgr: [StateCommon::transitState] StateUninit --> StateInit
01-10 14:12:19.211012   548   877 D flash_tuning_custom.cpp: paraIdx=0 aeSceneInd =2
01-10 14:12:19.211080   548   877 D flash_tuning_custom.cpp: copyTuningPara main yTarget=188
01-10 14:12:19.211169   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.211743   548  1520 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:19.211850   548  1520 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(7), sensorDev(1), p(0x0), bForceRead(1) +
01-10 14:12:19.211876   548  1520 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(7), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 14:12:19.211898   548  1520 W NvramDrv: [readDefaultData:779] CAMERA_DATA_PDC_TABLE
01-10 14:12:19.212014   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.212042   548  1520 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 14:12:19.212006   547  1062 I Gyroscope: batch: handle:3, flag:0,samplingPeriodNs:20000000 maxBatchReportLatencyNs:0
01-10 14:12:19.212340   537  1512 D NuPlayerDriver: notifyListener_l(0xe77e51c0), (1, 0, 0, -1), loop setting(0, 0)
01-10 14:12:19.212499   547  1062 I Gyroscope: enable: handle:3, en:1
01-10 14:12:19.212866   547  1062 E Gyroscope: MPE_gyr_calib_read 0.000246 -0.005214 -0.000687,0.000000 0.000000 0.000000,0.000246 -0.005214 -0.000687
01-10 14:12:19.213065   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.213411   548   877 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:19.213503   548   877 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(5), sensorDev(1), p(0xe6d62dd8), bForceRead(0) +
01-10 14:12:19.214579   537   704 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 14:12:19.214740   537   704 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:@��
01-10 14:12:19.214868   537   704 D NuPlayerDriver: NuPlayerDriver(0xe77e52a0) created, clientPid(527)
01-10 14:12:19.214959   548   877 I MtkCam/ParamsManager: [updateDefaultParams2_ByQuery] cap(4208,3120),fov(67,49)
01-10 14:12:19.215178   548   877 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:19.215237   548   877 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0xe671f9d8), bForceRead(0) +
01-10 14:12:19.215253   548   877 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:19.215267   548   877 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0xe6c19e48), bForceRead(0) +
01-10 14:12:19.215279   548   877 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 14:12:19.215294   548   877 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0xe63257ac), bForceRead(0) +
01-10 14:12:19.215336   548   877 D LensMCU : LensMCU[isSupportLens][CurrSensorDev]0x0001 [CurrSensorId]0x30c8
01-10 14:12:19.216326   548   877 I MtkCam/FrameController: [FrameController][prvcb] - miLogLevel(1), max delay(30000000), max sleep(1000000000 ns), min sleep(200 us), adj sleep(250000 ns)
01-10 14:12:19.221311   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.226409   527   730 I CameraProviderManager: Camera device device@1.0/internal/0 torch status is now NOT_AVAILABLE
01-10 14:12:19.226568   527   730 I CameraService: onTorchStatusChangedLocked: Torch status changed for cameraId=0, newStatus=0
01-10 14:12:19.226768   548   877 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:0
01-10 14:12:19.226900   548   877 I mtkcam-dev1: 0[CameraDevice1Base::open] Add new cameraId 0 - 0xefab0600
01-10 14:12:19.227197   548   877 I mtkcam-dev1: 0[CameraDevice1Base::open] -
01-10 14:12:19.230356   535  1459 V APEExtractor: getAPEInfo not ape 20483
01-10 14:12:19.230509   535  1459 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:19.232258   548   877 I mtkcam-dev1: 0[CameraDevice1Base::stopPreview] +
01-10 14:12:19.232386   548   877 W MtkCam/CamClient/FDClient: (877)[stopFaceDetection] FD was not running
01-10 14:12:19.232479   548   877 W MtkCam/RecordClient: (877)[stopPreview] Preview has been stopped
01-10 14:12:19.232520   548   877 I mtkcam-dev1: 0[CameraDevice1Base::stopPreview] -
01-10 14:12:19.233320   548   877 I mtkcam-dev1: 0[CameraDevice1Base::cancelPicture] +
01-10 14:12:19.233414   548   877 I mtkcam-dev1: 0[CameraDevice1Base::cancelPicture] - status(7)
01-10 14:12:19.234457   548   877 I mtkcam-dev1: 0[CameraDevice1Base::close] +
01-10 14:12:19.236397   548  1520 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 14:12:19.236522   548  1520 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 14:12:19.236535   548  1520 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 14:12:19.236546   548  1520 I MtkCam/Utils: onCreate#03 pc 000f5949  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+348)
01-10 14:12:19.236557   548  1520 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 14:12:19.236568   548  1520 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 14:12:19.236581   548  1520 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 14:12:19.236592   548  1520 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 14:12:19.236619   548  1520 E MtkCam/IonHeap: PDC_tbl_1@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 14:12:19.236699   548  1520 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 14:12:19.237879   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.242965   537  1523 D NuPlayerDriver: notifyListener_l(0xe77e52a0), (1, 0, 0, -1), loop setting(0, 0)
01-10 14:12:19.245192   537   704 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 14:12:19.245373   537   704 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:�@��
01-10 14:12:19.245546   537   704 D NuPlayerDriver: NuPlayerDriver(0xe77e5700) created, clientPid(527)
01-10 14:12:19.249035   943  1147 V NuMediaExtractor: setDataSource fd=200 (/system/media/audio/ui/KeypressReturn.ogg), offset=0, length=6246
01-10 14:12:19.249718   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:19.249986   528   733 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:19.252335   528   733 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:19.252516   528   733 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:19.256068   535   663 V APEExtractor: getAPEInfo not ape 20482
01-10 14:12:19.256152   535   663 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:19.256201   535  1459 V APEExtractor: getAPEInfo not ape 20483
01-10 14:12:19.256254   535  1459 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:19.259612   943  1147 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 14:12:19.260655   537  1531 D NuPlayerDriver: notifyListener_l(0xe77e5700), (1, 0, 0, -1), loop setting(0, 0)
01-10 14:12:19.261372   548  1520 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 14:12:19.261484   548  1520 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 14:12:19.261495   548  1520 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 14:12:19.261504   548  1520 I MtkCam/Utils: onCreate#03 pc 000f5983  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+406)
01-10 14:12:19.261514   548  1520 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 14:12:19.261522   548  1520 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 14:12:19.261533   548  1520 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 14:12:19.261541   548  1520 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 14:12:19.261573   548  1520 E MtkCam/IonHeap: PDC_tbl_2@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 14:12:19.261665   548  1520 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 14:12:19.261881  1311  1311 D IntentBroadcaster: Broadcasting and adding intent for rebroadcast: android.intent.action.SIM_STATE_CHANGED NOT_READY for slotId 0
01-10 14:12:19.263309   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.264531   943  1272 D CTA_BootReceiverPolicy: initBootIntentFilterList() - add monitored intent = android.intent.action.BOOT_COMPLETED
01-10 14:12:19.266236   943  1272 D Cta_ReceiverRecordHelper: storeDir = /data/data/com.mediatek.security
01-10 14:12:19.266610   943  1535 I OMXClient: Treble IOmx obtained
01-10 14:12:19.267029   943  1272 D Cta_ReceiverRecordHelper: initReceiverCache() at User(0)
01-10 14:12:19.267177   943  1272 D Cta_ReceiverRecordHelper: getPackageListReceivingSpecifiedIntent() find activities receiving intent = android.intent.action.BOOT_COMPLETED
01-10 14:12:19.267196   546   657 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:19.269729   943  1535 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x749da49400
01-10 14:12:19.270523   546   657 E OMXNodeInstance: getConfig(0xf0a94360:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 14:12:19.271100   943  1272 D Cta_ReceiverRecordHelper: initReceiverCache() at User(10)
01-10 14:12:19.271326   943  1272 D Cta_ReceiverRecordHelper: getPackageListReceivingSpecifiedIntent() find activities receiving intent = android.intent.action.BOOT_COMPLETED
01-10 14:12:19.273438   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.275131   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 14:12:19.275822   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.276735   943  1272 D Cta_ReceiverRecordHelper: loadDataFromFileToCache()
01-10 14:12:19.277417   943  1272 I Cta_ReceiverRecordHelper: No existing /data/data/com.mediatek.security/bootreceiver.xml; starting empty
01-10 14:12:19.277501   943  1272 D Cta_ReceiverRecordHelper: resetAllReceiverRecords()
01-10 14:12:19.277846   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.277846   943  1272 D Cta_ReceiverController: init ReceiverRecordHelper done.
01-10 14:12:19.278426   943  1272 D Cta_ReceiverController: startMonitor(Normal Bootup Start)
01-10 14:12:19.278635   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.279125   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.279658   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.279782   548  1520 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 14:12:19.279918   548  1520 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 14:12:19.279933   548  1520 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 14:12:19.279944   548  1520 I MtkCam/Utils: onCreate#03 pc 000f59bd  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+464)
01-10 14:12:19.279952   548  1520 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 14:12:19.279960   548  1520 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 14:12:19.279975   548  1520 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 14:12:19.279985   548  1520 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 14:12:19.280023   548  1520 E MtkCam/IonHeap: PDC_tbl_3@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 14:12:19.280140   548  1520 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 14:12:19.282261  1299  1299 D ImsConfigReceiver: Update LatestSimState, phoneId = 0, state = NOT_READY
01-10 14:12:19.282571  1299  1299 D ImsConfigReceiver: Sim state changed, event = NOT_READY, reset broadcast flag
01-10 14:12:19.282940  1299  1299 D ImsVT Util: Received ACTION_SIM_STATE_CHANGED, slotId:0, simState:NOT_READY
01-10 14:12:19.283532   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.286866  1130  1284 D NetworkController: subscriptions is null
01-10 14:12:19.298770   548  1520 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 14:12:19.298872   548  1520 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 14:12:19.298885   548  1520 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 14:12:19.298895   548  1520 I MtkCam/Utils: onCreate#03 pc 000f59f3  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+518)
01-10 14:12:19.298904   548  1520 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 14:12:19.298912   548  1520 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 14:12:19.298920   548  1520 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 14:12:19.298928   548  1520 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 14:12:19.298955   548  1520 E MtkCam/IonHeap: PDC_tbl_4@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 14:12:19.299015   548  1520 E isp_mgr_bnr: [PDC_tbl_1] ImageBufferHeap create fail (setBPCIBuf){#727:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/isp_mgr/isp_mgr_bnr.cpp}
01-10 14:12:19.304486   537  1461 D NuPlayerDriver: notifyListener_l(0xe9aaf5b0), (6, 0, 0, -1), loop setting(0, 0)
01-10 14:12:19.304868   524   798 E AudioFlinger_Threads: no wake lock to update, but system ready!
01-10 14:12:19.305902   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.311527   377  1538 D AudioALSAStreamManager: +syncSharedOutDevice(), routingSharedOutDevice: 2
01-10 14:12:19.311640   377  1538 D AudioALSAStreamManager: setMasterVolume(), volume = 1.000000
01-10 14:12:19.311674   377  1538 D AudioMTKGainController: setNormalVolume(), mSceneIndex = 0, stream 1, devices 0x2, index 13, mode 0x0
01-10 14:12:19.311722   377  1538 D AudioMTKGainController: setSpeakerGain(), gain = 9, spkAnaType = 3, spkLMixerName = Lineout_PGAL_GAIN, spkRMixerName = Lineout_PGAR_GAIN
01-10 14:12:19.311809   377  1538 D AudioALSAStreamOut: open(), flags 6
01-10 14:12:19.311983   377  1538 D AudioUtility: power_hal_hint - custPowerHint 0, data 268435455
01-10 14:12:19.312035   377  1538 D AudioALSAStreamManager: +createPlaybackHandler(), mAudioMode = 0, output_devices = 0x2
01-10 14:12:19.312084   377  1538 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 14:12:19.312095   394   414 I vendor.mediatek.hardware.power@1.1-impl: mtkCusPowerHint hint:0, data:268435455
01-10 14:12:19.312121   377  1538 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 14:12:19.312174   377  1538 D AudioSpeechEnhanceInfo: IsAPDMNRTuningEnable(), 0
01-10 14:12:19.312273   377  1538 D AudioALSADataProcessor: AudioALSADataProcessor()
01-10 14:12:19.312303   377  1538 D AudioALSAPlaybackHandlerNormal: AudioALSAPlaybackHandlerNormal()
01-10 14:12:19.312332   377  1538 D AudioALSAPlaybackHandlerNormal: +setFilterMng() mAudioFilterManagerHandler [0xead8e8d0]
01-10 14:12:19.312356   377  1538 D AudioALSAPlaybackHandlerNormal: +open(), flag 6, mDevice = 0x2
01-10 14:12:19.312500   377  1538 D AudioALSADeviceParser: compare pcm success = 7, stringpair = I2S0DL1_PLayback
01-10 14:12:19.312621   394   413 I powerd  : [powerd_req] POWER_MSG_MTK_CUS_HINT: hint:0, hdl:36, data:268435455
01-10 14:12:19.312728   394   413 I libPerfService: perfCusUserScnEnable - handle:36
01-10 14:12:19.315174   548  1516 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(0)
01-10 14:12:19.315355   377  1538 D         : -AssignDRAM() retval 0
01-10 14:12:19.315493   548  1516 I Drv/HWsync: Drv/HWsync[init] -
01-10 14:12:19.315475   377  1538 D AudioALSAPlaybackHandlerBase: transferAudioFormatToPcmFormat(), audio_format(0x4) => pcm_format(0x1)
01-10 14:12:19.315576   377  1538 D AudioALSAPlaybackHandlerNormal: open(), mConfig: channels = 2, rate = 48000, period_size = 256, period_count = 2, format = 1 avail_min = 256
01-10 14:12:19.315627   377  1538 D AudioALSADriverUtility: GetPropertyValue key = af.resouce.extdac_support value = 0
01-10 14:12:19.315660   377  1538 D AudioALSAPlaybackHandlerNormal: SetLowJitterMode(), bypass low jitter mode, bEnable = 1, device = 0x2, SampleRate = 48000
01-10 14:12:19.315686   377  1538 D AudioALSAPlaybackHandlerBase: openPcmDriverWithFlag(), pcm device = 7 flag = 0x8
01-10 14:12:19.316408   548   877 I MtkCam/CamClient: (877)[uninit] + getStrongCount(1)
01-10 14:12:19.322071   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.322753   377  1538 D AudioALSAPlaybackHandlerBase: initBitConverter(), audio_format: 0x3 => 0x4, bcv_pcm_format = 0x3
01-10 14:12:19.322869   377  1538 D MtkAudioBitConverter: +open(), format 3, CH 2, SR 48000
01-10 14:12:19.322985   377  1538 D MtkAudioBitConverter: +resetBuffer()
01-10 14:12:19.324331   377  1538 D AudioALSAHardwareResourceManager: +startOutputDevice(), new_devices = 0x2, mOutputDevices = 0x0, mStartOutputDevicesCount = 0 SampleRate = 48000
01-10 14:12:19.324628   377  1538 D AudioALSADriverUtility: GetPropertyValue key = af.resouce.extdac_support value = 0
01-10 14:12:19.324701   377  1538 D AudioALSADeviceConfigManager: ApplyDeviceTurnonSequenceByName() DeviceName = speaker_output descriptor->DeviceStatusCounte = 0
01-10 14:12:19.325923   377  1538 D AudioALSADeviceConfigManager: ApplyDeviceTurnonSequenceByName() DeviceName = ext_speaker_output descriptor->DeviceStatusCounte = 0
01-10 14:12:19.326171   547  1062 W hw-IPCThreadState: All binder threads in pool (2 threads) busy for 111 ms
01-10 14:12:19.326895   548   877 W MtkCam/CamClient/FDClient: (877)[stopFaceDetection] FD was not running
01-10 14:12:19.327155   548   877 I MtkCam/CamClient: (877)[uninit] - getStrongCount(1)
01-10 14:12:19.327465   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 14:12:19.328418   394   413 I libPerfService: 39: legacy set freq: -1 -1 -1 -1
01-10 14:12:19.336007   548   877 W aaa_state_mgr: [StateCommon::transitState] StateInit --> StateUninit
01-10 14:12:19.336182   548   877 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_AE,2),srIdxNum(1)
01-10 14:12:19.336243   548   877 I Drv/HWsync: Drv/HWsync[uninit] mAECyclePeriod(-1)
01-10 14:12:19.336257   548   877 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 14:12:19.336421   547  1062 I Accelerometer: batch: handle:0, flag:0,samplingPeriodNs:20000000 maxBatchReportLatencyNs:0
01-10 14:12:19.336981   547  1062 I Accelerometer: enable: handle:0, en:1
01-10 14:12:19.337208   547  1062 E         : settings file open failed: -2 (No such file or directory)
01-10 14:12:19.337251   547  1062 E Accelerometer: MPE_acc_read_data_fail
01-10 14:12:19.340486  1311  1311 W System.err: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 14:12:19.340779  1311  1311 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 14:12:19.340846  1311  1311 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 14:12:19.340865  1311  1311 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 14:12:19.340879  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.getRilOp(MtkRIL.java:467)
01-10 14:12:19.340893  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.registerForModulation(MtkRIL.java:1452)
01-10 14:12:19.340910  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkServiceStateTracker.updatePhoneType(MtkServiceStateTracker.java:503)
01-10 14:12:19.340932  1311  1311 W System.err: 	at com.android.internal.telephony.ServiceStateTracker.<init>(ServiceStateTracker.java:634)
01-10 14:12:19.340947  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkServiceStateTracker.<init>(MtkServiceStateTracker.java:429)
01-10 14:12:19.340963  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkTelephonyComponentFactory.makeServiceStateTracker(MtkTelephonyComponentFactory.java:193)
01-10 14:12:19.340993  1311  1311 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.<init>(GsmCdmaPhone.java:249)
01-10 14:12:19.341011  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.<init>(MtkGsmCdmaPhone.java:393)
01-10 14:12:19.341026  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.<init>(MtkGsmCdmaPhone.java:432)
01-10 14:12:19.341040  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkTelephonyComponentFactory.makePhone(MtkTelephonyComponentFactory.java:181)
01-10 14:12:19.341054  1311  1311 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhone(PhoneFactory.java:224)
01-10 14:12:19.341086  1311  1311 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhones(PhoneFactory.java:131)
01-10 14:12:19.341100  1311  1311 W System.err: 	at com.android.phone.PhoneGlobals.onCreate(PhoneGlobals.java:370)
01-10 14:12:19.341114  1311  1311 W System.err: 	at com.android.phone.PhoneApp.onCreate(PhoneApp.java:43)
01-10 14:12:19.341129  1311  1311 W System.err: 	at android.app.Instrumentation.callApplicationOnCreate(Instrumentation.java:1119)
01-10 14:12:19.341146  1311  1311 W System.err: 	at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5781)
01-10 14:12:19.341169  1311  1311 W System.err: 	at android.app.ActivityThread.-wrap1(Unknown Source:0)
01-10 14:12:19.341441  1311  1311 W System.err: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1690)
01-10 14:12:19.341452   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:27.662945,dur:1048.33,max:87.10,min:2.16
01-10 14:12:19.341501  1311  1311 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 14:12:19.341558  1311  1311 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 14:12:19.341588  1311  1311 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 14:12:19.341602  1311  1311 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 14:12:19.341616  1311  1311 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 14:12:19.341629  1311  1311 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 14:12:19.341899  1311  1311 W System.err: Caused by: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 14:12:19.341961  1311  1311 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 14:12:19.341980  1311  1311 W System.err: 	at java.lang.BootClassLoader.findClass(ClassLoader.java:1355)
01-10 14:12:19.341994  1311  1311 W System.err: 	at java.lang.BootClassLoader.loadClass(ClassLoader.java:1415)
01-10 14:12:19.342006  1311  1311 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 14:12:19.342018  1311  1311 W System.err: 	... 27 more
01-10 14:12:19.342056  1311  1311 W System.err: Caused by: java.lang.NoClassDefFoundError: Class not found using the boot class loader; no stack trace available
01-10 14:12:19.347178   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.348166   943  1147 V NuMediaExtractor: setDataSource fd=201 (/system/media/audio/ui/KeypressInvalid.ogg), offset=0, length=9847
01-10 14:12:19.349468   528   528 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:19.349739   528   528 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:19.355307   528   528 D DrmMtkUtil: getProcessName() : path : [/proc/943/cmdline]
01-10 14:12:19.355904   528   528 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 14:12:19.358658   943   943 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:19.358767   943   943 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:19.358864   943   943 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:19.358864   943   943 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(null_null_null:OPTelecomCommon.apk:com.mediatek.op.telecom.CommonTelecomCustomizationFactory:com.mediatek.op.telecom)
01-10 14:12:19.359242   943   943 I CommonTelecomCustomizationUtils: return default CommonTelecomCustomizationFactoryBase
01-10 14:12:19.360178   535  1460 V APEExtractor: getAPEInfo not ape 20481
01-10 14:12:19.360280   535  1460 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 14:12:19.362489   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.363658   943  1147 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 14:12:19.364309   524   798 D MtkAudioLoud: +close()
01-10 14:12:19.364395   524   798 D NVRAM   : getPlaybackPostProcessParameterFromXML Type/Name [5]/[PlaybackDRC]
01-10 14:12:19.364507   524   798 D NVRAM   : bes_loudness_L_hpf_fc = 0
01-10 14:12:19.364547   524   798 D NVRAM   : bes_loudness_L_hpf_order = 0
01-10 14:12:19.364564   524   798 D NVRAM   : bes_loudness_L_lpf_fc = 0
01-10 14:12:19.364578   524   798 D NVRAM   : bes_loudness_L_lpf_order = 0
01-10 14:12:19.364599   524   798 D NVRAM   : bes_loudness_R_hpf_fc = 0
01-10 14:12:19.364630   524   798 D NVRAM   : bes_loudness_R_hpf_order = 0
01-10 14:12:19.364645   524   798 D NVRAM   : bes_loudness_R_lpf_fc = 0
01-10 14:12:19.364660   524   798 D NVRAM   : bes_loudness_R_lpf_order = 0
01-10 14:12:19.364679   524   798 D NVRAM   : bes_loudness_Sep_LR_Filter = 0
01-10 14:12:19.364709   524   798 D NVRAM   : bes_loudness_WS_Gain_Max = 0
01-10 14:12:19.364725   524   798 D NVRAM   : bes_loudness_WS_Gain_Min = 0
01-10 14:12:19.364739   524   798 D NVRAM   : bes_loudness_Filter_First = 0
01-10 14:12:19.364752   524   798 D NVRAM   : bes_loudness_Num_Bands = 8
01-10 14:12:19.364766   524   798 D NVRAM   : bes_loudness_Flt_Bank_Order = 0
01-10 14:12:19.364786   524   798 D NVRAM   : DRC_Delay = 0
01-10 14:12:19.364806   524   798 D NVRAM   : Lim_Th = 32767
01-10 14:12:19.364818   524   798 D NVRAM   : Lim_Gn = 32767
01-10 14:12:19.364829   524   798 D NVRAM   : Lim_Const = 4
01-10 14:12:19.364840   524   798 D NVRAM   : Lim_Delay = 0
01-10 14:12:19.364852   524   798 D NVRAM   : SWIPRev = 0x520
01-10 14:12:19.364869   524   798 D NVRAM   : getPlaybackPostProcessParameterFromXML Parameter 5 returnValue 0
01-10 14:12:19.364949   524   798 D MtkAudioLoud: mIsZeroCoeff 1 mFilterType 5
01-10 14:12:19.365012   524   798 D MtkAudioLoud: setParameter 382 mInitParam.Initial_State 2
01-10 14:12:19.365032   524   798 D MtkAudioLoud: +open()
01-10 14:12:19.365862   524   798 D MtkAudioLoud: -open() result 0
01-10 14:12:19.365906   524   798 D MtkAudioLoud: +change2Normal()
01-10 14:12:19.365919   524   798 D MtkAudioLoud: -change2Normal()
01-10 14:12:19.370346   943  1542 I OMXClient: Treble IOmx obtained
01-10 14:12:19.370723   546  1199 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 14:12:19.372627   943  1542 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x74a4c3ac00
01-10 14:12:19.373134   546  1199 E OMXNodeInstance: getConfig(0xf0a945a0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 14:12:19.375709   377  1538 D AudioVoiceUIDL: [GetSRCInputParameter] mOutputSampleRate 16000,  mInputSampleRate 48000, mInChannel 2, mOutChannel, 0 format 4
01-10 14:12:19.375802   377  1538 D AudioVoiceUIDL: [GetSRCInputParameter] create SRC handle fail
01-10 14:12:19.375836   377  1538 D AudioALSAPlaybackHandlerNormal: -open()
01-10 14:12:19.375935   377  1538 D AudioMTKFilter: AudioMTKFilter::start() type 0 mode 9 bFirstDataWrite 1
01-10 14:12:19.375986   377  1538 D MtkAudioLoud: setWorkMode(), chNum 2, sampleRate 48000, workMode 9 RampupEnable 0
01-10 14:12:19.376027   377  1538 D MtkAudioLoud: setParameter 382 mInitParam.Initial_State 0
01-10 14:12:19.376040   377  1538 D MtkAudioLoud: +open()
01-10 14:12:19.376232   377  1538 D MtkAudioLoud: -open() result 0
01-10 14:12:19.376246   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.376938   547  1062 I Accelerometer: enable: handle:0, en:0
01-10 14:12:19.377087   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.377839   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 14:12:19.378583   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.380269   531  1050 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 14:12:19.380477   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.380492   531  1050 E installd: Failed to enable USRQUOTA on /dev/block/dm-2: File exists
01-10 14:12:19.380517   531  1050 E installd: Failed to enable GRPQUOTA on /dev/block/dm-2: File exists
01-10 14:12:19.380533   531  1050 D installd: Found storage mount /data/media at /mnt/runtime/default/emulated
01-10 14:12:19.381330   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.382055   375   375 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 14:12:19.382735   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.389002   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.392858   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.393863   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.394199   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:19.394657   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.395295   523   562 D AAL     : 01-10 02:12:19.187 BL= 381,ESS= 256, 01-10 02:12:19.225 BL= 382,ESS= 256, 01-10 02:12:19.282 BL= 383,ESS= 256, 01-10 02:12:19.340 BL= 384,ESS= 256, 01-10 02:12:19.395 BL= 385,ESS= 256, 
01-10 14:12:19.395684   375   375 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x705b02b5f0, 32768)
01-10 14:12:19.402151   943   943 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:19.404722   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.416408   547  1062 I Gyroscope: enable: handle:3, en:0
01-10 14:12:19.426556   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 14:12:19.430839   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.432280   943   943 E WiredAccessoryManager: No state change.
01-10 14:12:19.432276   524   524 D APM_AudioPolicyManager: setForceUse() usage 0, config 0, mPhoneState 0
01-10 14:12:19.432531   524   524 D APM_AudioPolicyManager: setForceUse() usage 2, config 0, mPhoneState 0
01-10 14:12:19.443257  1349  1407 D Surface : Surface::disconnect(this=0x74b7ebf000,api=1)
01-10 14:12:19.444047   398   421 I BufferQueueProducer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7f7b6e2800,id:2,api:1,p:1349,c:398) disconnect(P): api 1
01-10 14:12:19.445083   398   421 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7f7b6e2800,id:2,api:1,p:-1,c:398) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 14:12:19.446613   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.451891   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 14:12:19.455492  1349  1349 V PhoneWindow: DecorView setVisiblity: visibility = 4, Parent = ViewRoot{55d43f1 com.android.settings/com.android.settings.FallbackHome,ident = 0}, this = DecorView@677757b[FallbackHome]
01-10 14:12:19.464001   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 14:12:19.472603   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.479447   524   707 D APM_AudioPolicyManager: setForceUse() usage 3, config 8, mPhoneState 0
01-10 14:12:19.479652   398   398 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7f7b6e2800,id:2,api:1,p:-1,c:-1) disconnect(C)
01-10 14:12:19.479798   524   524 D APM_AudioPolicyManager: setForceUse() usage 6, config 0, mPhoneState 0
01-10 14:12:19.480252   398   398 I BufferQueue: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7f7b6e2800,id:2,api:1,p:-1,c:-1) ~BufferQueueCore
01-10 14:12:19.483940   377  1107 D AudioALSAStreamManager: setMicMute(), mMicMute: 0 => 0
01-10 14:12:19.486121   377  1107 D AudioALSAStreamManager: +SetInputMute(), 0
01-10 14:12:19.486370   377   377 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 14:12:19.486534   377   377 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 14:12:19.488323   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.493754   943   943 D AudioService: applyDeviceVolumemStreamType:3,device:2
01-10 14:12:19.494254   943   943 D AudioService: applyDeviceVolumemStreamType:3,device:1073741824
01-10 14:12:19.494714   943   943 D AudioService: applyDeviceVolumemStreamType:9,device:2
01-10 14:12:19.495068   943   943 D AudioService: applyDeviceVolumemStreamType:9,device:1073741824
01-10 14:12:19.495375   943   943 D AudioService: applyDeviceVolumemStreamType:10,device:2
01-10 14:12:19.495962   943   943 D AudioService: applyDeviceVolumemStreamType:10,device:1073741824
01-10 14:12:19.506881   943  1088 D WifiController: ApStaDisabledState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 14:12:19.506983   943  1088 D WifiController: DefaultState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 14:12:19.514711   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.529479   548   877 D AppTsf  : [TsfExit] TsfExit
01-10 14:12:19.529604   548   877 D AppTsf  : [~AppTsf] destructor
01-10 14:12:19.529629   548   877 D tsf_core: [~TsfCore] destructor
01-10 14:12:19.530925   548   877 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(1)
01-10 14:12:19.531035   548   877 I Drv/HWsync: Drv/HWsync[uninit] idx(0,remain_0),tg(0)
01-10 14:12:19.531051   548   877 W Drv/HWsync: Drv/HWsync[uninit] WARNING: wtginf, sindex(0x0),tg(0x0)
01-10 14:12:19.531061   548   877 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 14:12:19.531176   548   877 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11)
01-10 14:12:19.531226   548   877 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11), SENINF_TG1_PH_CNT(0x5)
01-10 14:12:19.534568   548   877 D ImgSensorDrv: [uninit][uninit] imgsensor_drv 0
01-10 14:12:19.534754   548   877 D SeninfDrvImp: [uninit][uninit]: 1 
01-10 14:12:19.534886   548   877 D SeninfDrvImp: [uninit][uninit]: 0, mfd(16) 
01-10 14:12:19.538634   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.538744   548   877 I mtkcam-devicemgr: [detachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 14:12:19.197
01-10 14:12:19.539519   527   730 I CameraProviderManager: Camera device device@1.0/internal/0 torch status is now AVAILABLE_OFF
01-10 14:12:19.539704   527   730 I CameraService: onTorchStatusChangedLocked: Torch status changed for cameraId=0, newStatus=1
01-10 14:12:19.540535   548   877 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:1
01-10 14:12:19.540762   548   877 I mtkcam-dev1: 0[CameraDevice1Base::close] Del cameraId 0 - 0xefab0600, this - 0xefab0600
01-10 14:12:19.540880   548   877 I mtkcam-dev1: 0[CameraDevice1Base::close] -
01-10 14:12:19.541227   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:39
01-10 14:12:19.541827   527   730 I CameraHardwareInterface: Destroying camera 0
01-10 14:12:19.541906   394   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:39
01-10 14:12:19.541969   394   413 I libPerfService: perfUserUnregScn - handle:39
01-10 14:12:19.542233   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 14:12:19.542668   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:-1
01-10 14:12:19.543533   394   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:-1
01-10 14:12:19.543657   394   413 I libPerfService: perfUserUnregScn - handle:-1
01-10 14:12:19.543865   394   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:-1
01-10 14:12:19.545413   527   730 I CameraService: disconnect: Disconnected client for camera 0 for PID 527
01-10 14:12:19.545545   527   730 V DL-NativeProxy: Resume requested start
01-10 14:12:19.547038   527   730 W DL-NativeProxy: Cannot connect to the scanner service
01-10 14:12:19.547119   527   730 W DL-NativeProxy: Cannot resume scanner, service is not alive
01-10 14:12:19.547157   527   730 W CameraService: camera_interop: suspendResume failure on dlservice module, error -2147483648
01-10 14:12:19.547696   537   704 D NuPlayerDriver: reset(0xe77e51c0) at state 4
01-10 14:12:19.547874   537   704 D NuPlayerDriver: notifyListener_l(0xe77e51c0), (8, 0, 0, -1), loop setting(0, 0)
01-10 14:12:19.547908   537   704 D GenericSource: disconnect: mDataSource 0xe7e9aa00 mHttpSource 0x0
01-10 14:12:19.548537   537  1512 D NuPlayerDriver: notifyResetComplete(0xe77e51c0)
01-10 14:12:19.550535   943   943 D MediaPlayer: handleMessage msg:(1, 0, 0)
01-10 14:12:19.552356   943   943 V MediaRouter: onRestoreRoute() : route=RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 14:12:19.552458   537   537 D NuPlayerDriver: reset(0xe77e52a0) at state 4
01-10 14:12:19.552517   943   943 V MediaRouter: Selecting route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 14:12:19.552583   537   537 D NuPlayerDriver: notifyListener_l(0xe77e52a0), (8, 0, 0, -1), loop setting(0, 0)
01-10 14:12:19.552609   537   537 D GenericSource: disconnect: mDataSource 0xe7e9ab00 mHttpSource 0x0
01-10 14:12:19.552970   537  1523 D NuPlayerDriver: notifyResetComplete(0xe77e52a0)
01-10 14:12:19.553848   943  1088 D WifiController: ApStaDisabledState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 14:12:19.553987   943  1088 D WifiController: DefaultState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 14:12:19.554609   537  1563 D NuPlayerDriver: reset(0xe77e5700) at state 4
01-10 14:12:19.554797   537  1563 D NuPlayerDriver: notifyListener_l(0xe77e5700), (8, 0, 0, -1), loop setting(0, 0)
01-10 14:12:19.554821   537  1563 D GenericSource: disconnect: mDataSource 0xe7e9ac00 mHttpSource 0x0
01-10 14:12:19.555085   537  1531 D NuPlayerDriver: notifyResetComplete(0xe77e5700)
01-10 14:12:19.557389   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.570802   943   943 D MtkEapSimUtility: onReceive ACTION_SIM_STATE_CHANGED iccState: NOT_READY, simSlot: 0
01-10 14:12:19.571017   943   943 D MediaPlayer: handleMessage msg:(6, 0, 0)
01-10 14:12:19.574740   943   943 D MediaSessionService: Media button session is changed to com.android.server.telecom/HeadsetMediaButton (userId=0)
01-10 14:12:19.576059   943   943 D MediaSessionService: Global priority session is changed from null to com.android.server.telecom/HeadsetMediaButton (userId=0)
01-10 14:12:19.576177   943   943 D MediaSessionService: Media button session is changed to null
01-10 14:12:19.582789   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.588855   943   943 D LocationProviderProxy-fused: ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService} connected
01-10 14:12:19.600595   943   943 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 14:12:19.602625   523   562 D AAL     : 01-10 02:12:19.432 BL= 386,ESS= 256, 01-10 02:12:19.490 BL= 387,ESS= 256, 01-10 02:12:19.527 BL= 388,ESS= 256, 01-10 02:12:19.583 BL= 389,ESS= 256, 01-10 02:12:19.602 BL= 388,ESS= 256, 
01-10 14:12:19.603050   943  1000 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 14:12:19.607177   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.613101   943   943 I FusedLocation: engine started (com.android.location.fused)
01-10 14:12:19.633560  1550  1550 D PPL/PlatformManager: SIM_NUMBER=1
01-10 14:12:19.634876   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.637496  1130  1143 D Camera  : Camera release.
01-10 14:12:19.648017  1550  1550 I PPL/PlatformManager: Bring service to foreground
01-10 14:12:19.654367   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.656124   943  1101 D NotificationSQLiteLog: Pruned event entries: 0
01-10 14:12:19.660279   543   610 I PPL/PPLAgent: checkCallerUidPermission(code:1,  uid:1000)
01-10 14:12:19.660355   543   610 I PPL/PPLAgent: OnTransact(1,16)
01-10 14:12:19.660385   543   610 I PPL/PPLAgent: readControlData enter
01-10 14:12:19.660421   543   610 W Parcel  : **** enforceInterface() expected 'PPLAgent' but read 'com.mediatek.internal.telephony.ppl.IPplAgent'
01-10 14:12:19.660443   543   610 I PPL/PPLAgent: enforceInterface fail
01-10 14:12:19.660460   543   610 I PPL/PPLAgent: readControlData enter
01-10 14:12:19.661409   543   610 D PPL/PPLAgent: open control data file error = No such file or directory
01-10 14:12:19.661514   543   610 I PPL/PPLAgent: readControlData exit
01-10 14:12:19.661865  1550  1550 W PPL/ControlData: buildControlData: data is empty, return empty instance
01-10 14:12:19.662035  1550  1550 D PPL/PPLManager: mCache.status = 0
01-10 14:12:19.662915  1550  1550 D PPL/PPLService: onStartCommand(Intent { act=android.intent.action.SIM_STATE_CHANGED flg=0x5000010 cmp=com.mediatek.ppl/.PplService (has extras) })
01-10 14:12:19.663027  1550  1550 D PPL/PPLService: action is android.intent.action.SIM_STATE_CHANGED
01-10 14:12:19.663084  1550  1550 I PPL/PPLService: Privacy Protection Lock is disabled. Exit.
01-10 14:12:19.671194  1550  1550 D PPL/PlatformManager: Exec stopForeground with para true.
01-10 14:12:19.677161  1311  1311 D ImsExternalCallTracker: Registering: Handler (com.mediatek.internal.telephony.imsphone.MtkImsPhone) {912e01d}
01-10 14:12:19.677708   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.697911   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.708872  1311  1311 D OpImsPhoneCallTrackerBase: initRtt call to op base
01-10 14:12:19.716019   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.720745  1311  1559 W Binder  : Binder call failed.
01-10 14:12:19.720745  1311  1559 W Binder  : java.lang.NullPointerException: Attempt to get length of null array
01-10 14:12:19.720745  1311  1559 W Binder  : 	at com.android.internal.telephony.SubscriptionMonitor$1.onSubscriptionsChanged(SubscriptionMonitor.java:113)
01-10 14:12:19.720745  1311  1559 W Binder  : 	at com.android.internal.telephony.IOnSubscriptionsChangedListener$Stub.onTransact(IOnSubscriptionsChangedListener.java:48)
01-10 14:12:19.720745  1311  1559 W Binder  : 	at android.os.Binder.execTransact(Binder.java:697)
01-10 14:12:19.726717  1311  1311 D PhoneSwitcherNetworkRequstListener: Registering NetworkFactory
01-10 14:12:19.739835   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.757672   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.761172  1130  1130 D QSTileHost: loadTileSpecs() default tile list: wifi,bt,dnd,flashlight,rotation,battery,cell,airplane,cast
01-10 14:12:19.761367  1130  1284 D NetworkController: subscriptions is null
01-10 14:12:19.764346  1130  1284 D NetworkController: updateMobileControllers detectedType: 4
01-10 14:12:19.768837  1311  1570 I MTKDefaultSmsSimSettings: oldSmsDefaultSIM1
01-10 14:12:19.769024  1311  1570 I MTKDefaultSmsSimSettings: subInfos == null, return
01-10 14:12:19.770702   943   943 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 14:12:19.772026  1311  1578 W CallerInfoCache: cursor is null
01-10 14:12:19.773214   943  1000 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 14:12:19.774712  1130  1284 W Tile.BluetoothTile: Error in handleSetListening
01-10 14:12:19.774712  1130  1284 W Tile.BluetoothTile: java.lang.NullPointerException: Attempt to invoke interface method 'void com.android.systemui.statusbar.policy.BluetoothController.addCallback(java.lang.Object)' on a null object reference
01-10 14:12:19.774712  1130  1284 W Tile.BluetoothTile: 	at com.android.systemui.qs.tiles.BluetoothTile.handleSetListening(BluetoothTile.java:81)
01-10 14:12:19.774712  1130  1284 W Tile.BluetoothTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:468)
01-10 14:12:19.774712  1130  1284 W Tile.BluetoothTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 14:12:19.774712  1130  1284 W Tile.BluetoothTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 14:12:19.774712  1130  1284 W Tile.BluetoothTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 14:12:19.775096  1130  1284 W Tile.BluetoothTile: Error in handleRefreshState
01-10 14:12:19.775096  1130  1284 W Tile.BluetoothTile: java.lang.NullPointerException: Attempt to invoke interface method 'boolean com.android.systemui.statusbar.policy.BluetoothController.isBluetoothEnabled()' on a null object reference
01-10 14:12:19.775096  1130  1284 W Tile.BluetoothTile: 	at com.android.systemui.qs.tiles.BluetoothTile.handleUpdateState(BluetoothTile.java:122)
01-10 14:12:19.775096  1130  1284 W Tile.BluetoothTile: 	at com.android.systemui.qs.tiles.BluetoothTile.handleUpdateState(BluetoothTile.java:120)
01-10 14:12:19.775096  1130  1284 W Tile.BluetoothTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl.handleRefreshState(QSTileImpl.java:289)
01-10 14:12:19.775096  1130  1284 W Tile.BluetoothTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:447)
01-10 14:12:19.775096  1130  1284 W Tile.BluetoothTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 14:12:19.775096  1130  1284 W Tile.BluetoothTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 14:12:19.775096  1130  1284 W Tile.BluetoothTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 14:12:19.778323  1130  1284 D NetworkController: subscriptions is null
01-10 14:12:19.779265  1311  1311 E MtkPhoneIntfMgrEx: [updateUserCustomizedEccList] mUserCustomizedEccList: []
01-10 14:12:19.779506  1311  1311 E MtkPhoneIntfMgrEx: publish: com.mediatek.phone.MtkPhoneInterfaceManagerEx@8d10a8d
01-10 14:12:19.780045  1130  1284 D NetworkController: updateMobileControllers detectedType: 4
01-10 14:12:19.781964   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.783006  1130  1284 D NetworkController: isEmergencyOnly No sims 
01-10 14:12:19.786003  1130  1130 D LocalBluetoothProfileManager: Adding local MAP profile
01-10 14:12:19.786467  1130  1284 D NetworkController: isEmergencyOnly No sims 
01-10 14:12:19.787825  1130  1130 D BluetoothMap: Create BluetoothMap proxy object
01-10 14:12:19.796638  1130  1130 D LocalBluetoothProfileManager: LocalBluetoothProfileManager construction complete
01-10 14:12:19.801660  1130  1284 W Tile.DndTile: Error in handleSetListening
01-10 14:12:19.801660  1130  1284 W Tile.DndTile: java.lang.NullPointerException: Attempt to invoke interface method 'void com.android.systemui.statusbar.policy.ZenModeController.addCallback(java.lang.Object)' on a null object reference
01-10 14:12:19.801660  1130  1284 W Tile.DndTile: 	at com.android.systemui.qs.tiles.DndTile.handleSetListening(DndTile.java:239)
01-10 14:12:19.801660  1130  1284 W Tile.DndTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:468)
01-10 14:12:19.801660  1130  1284 W Tile.DndTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 14:12:19.801660  1130  1284 W Tile.DndTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 14:12:19.801660  1130  1284 W Tile.DndTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 14:12:19.802541  1311  1311 D CarrierConfigLoader: CarrierConfigLoader has started
01-10 14:12:19.804378   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.813519  1130  1284 W Tile.CellularTile: Error in handleSetListening
01-10 14:12:19.813519  1130  1284 W Tile.CellularTile: java.lang.NullPointerException: Attempt to invoke interface method 'void com.android.systemui.statusbar.policy.NetworkController.addCallback(com.android.systemui.statusbar.policy.NetworkController$SignalCallback)' on a null object reference
01-10 14:12:19.813519  1130  1284 W Tile.CellularTile: 	at com.android.systemui.qs.tiles.CellularTile.handleSetListening(CellularTile.java:120)
01-10 14:12:19.813519  1130  1284 W Tile.CellularTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:468)
01-10 14:12:19.813519  1130  1284 W Tile.CellularTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 14:12:19.813519  1130  1284 W Tile.CellularTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 14:12:19.813519  1130  1284 W Tile.CellularTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 14:12:19.813841  1130  1130 I DefaultQuickSettingsPlugin: customizeDisplayDataUsage, return isDisplay = false
01-10 14:12:19.820812  1311  1311 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 14:12:19.820813  1130  1284 W Tile.CastTile: Error in handleRefreshState
01-10 14:12:19.820813  1130  1284 W Tile.CastTile: java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Set com.android.systemui.statusbar.policy.CastController.getCastDevices()' on a null object reference
01-10 14:12:19.820813  1130  1284 W Tile.CastTile: 	at com.android.systemui.qs.tiles.CastTile.handleUpdateState(CastTile.java:196)
01-10 14:12:19.820813  1130  1284 W Tile.CastTile: 	at com.android.systemui.qs.tiles.CastTile.handleUpdateState(CastTile.java:191)
01-10 14:12:19.820813  1130  1284 W Tile.CastTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl.handleRefreshState(QSTileImpl.java:289)
01-10 14:12:19.820813  1130  1284 W Tile.CastTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:447)
01-10 14:12:19.820813  1130  1284 W Tile.CastTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 14:12:19.820813  1130  1284 W Tile.CastTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 14:12:19.820813  1130  1284 W Tile.CastTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 14:12:19.823633   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.833292  1311  1311 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:19.833431  1311  1311 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01TeleService.apk:com.mediatek.op01.phone.plugin.Op01PhoneCustomizationFactory:com.mediatek.op01.phone.plugin)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02TeleService.apk:com.mediatek.phone.op02.plugin.Op02PhoneCustomizationFactory:com.mediatek.phone.op02.plugin)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP03_null_null:OP03TeleService.apk:com.mediatek.op03.phone.Op03PhoneCustomizationFactory:com.mediatek.op03.phone)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP05_null_null:OP05TeleService.apk:com.mediatek.op05.phone.Op05PhoneCustomizationFactory:com.mediatek.op05.phone)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP06_null_null:OP06TeleService.apk:com.mediatek.op06.phone.Op06PhoneCustomizationFactory:com.mediatek.op06.phone)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07TeleService.apk:com.mediatek.op07.phone.OP07PhoneCustomizationFactory:com.mediatek.op07.phone)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP08_null_null:OP08TeleService.apk:com.mediatek.op08.phone.Op08PhoneCustomizationFactory:com.mediatek.op08.phone)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09TeleService.apk:com.mediatek.phone.op09.plugin.Op09PhoneCustomizationFactory:com.mediatek.phone.op09.plugin)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 8: OperatorFactoryInfo(OP09_null_SEGC:OP09ClibTeleService.apk:com.mediatek.phone.op09Clib.plugin.Op09ClibPhoneCustomizationFactory:com.mediatek.phone.op09Clib.plugin)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 9: OperatorFactoryInfo(OP11_null_null:OP11TeleService.apk:com.mediatek.op11.phone.Op11PhoneCustomizationFactory:com.mediatek.op11.phone)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 10: OperatorFactoryInfo(OP12_null_null:OP12TeleService.apk:com.mediatek.op12.phone.Op12PhoneCustomizationFactory:com.mediatek.op12.phone)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 11: OperatorFactoryInfo(OP15_null_null:OP15TeleService.apk:com.mediatek.op15.phone.Op15PhoneCustomizationFactory:com.mediatek.op15.phone)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 12: OperatorFactoryInfo(OP16_null_null:OP16TeleService.apk:com.mediatek.op16.phone.Op16PhoneCustomizationFactory:com.mediatek.op16.phone)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 13: OperatorFactoryInfo(OP18_null_null:OP18TeleService.apk:com.mediatek.op18.phone.Op18PhoneCustomizationFactory:com.mediatek.op18.phone)
01-10 14:12:19.833969  1311  1311 E OperatorCustomizationFactoryLoader: 14: OperatorFactoryInfo(OP112_null_null:OP112TeleService.apk:com.mediatek.op112.phone.Op112PhoneCustomizationFactory:com.mediatek.op112.phone)
01-10 14:12:19.834646  1311  1311 D ExtensionManager: [sSsRoamingServiceExt] create ext instance: com.mediatek.phone.ext.DefaultSsRoamingServiceExt@8344aaf
01-10 14:12:19.839717  1311  1311 D CdmaVolteServiceChecker: updateState, checking = false
01-10 14:12:19.841668   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.842097  1311  1311 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 14:12:19.842341  1311  1311 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 14:12:19.842476  1311  1311 D PhoneGlobals: registerSubInfoRecordIntent
01-10 14:12:19.847908   523   562 D AAL     : 01-10 02:12:19.659 BL= 387,ESS= 256, 01-10 02:12:19.697 BL= 386,ESS= 256, 01-10 02:12:19.753 BL= 385,ESS= 256, 01-10 02:12:19.791 BL= 384,ESS= 256, 01-10 02:12:19.847 BL= 383,ESS= 256, 
01-10 14:12:19.847979  1311  1581 D PhoneGlobals: Start Sim Select Service
01-10 14:12:19.850962  1311  1311 W ImsPhoneCallTracker: ImsManager is null when setting TTY mode
01-10 14:12:19.852430  1349  1349 D UtilsExt: file in /vendor/etc/disableapplist.txt does not exist!
01-10 14:12:19.853679  1311  1311 D ExtensionManager: [sDigitsUtilExt] create ext instance: com.mediatek.phone.ext.DefaultDigitsUtilExt@248799a
01-10 14:12:19.854929  1349  1349 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:19.855049  1349  1349 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01Settings.apk:com.mediatek.settings.op01.Op01SettingsCustomizationFactory:com.mediatek.settings.op01)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02Settings.apk:com.mediatek.settings.op02.Op02SettingsCustomizationFactory:com.mediatek.settings.op02)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP03_null_SEGDEFAULT:OP03Settings.apk:com.mediatek.op03.settings.OP03SettingsCustomizationFactory:com.mediatek.op03.settings)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP06_null_SEGDEFAULT:OP06Settings.apk:com.mediatek.op06.settings.Op06SettingsCustomizationFactory:com.mediatek.op06.settings)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07Settings.apk:com.mediatek.op07.settings.OP07SettingsCustomizationFactory:com.mediatek.op07.settings)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP08_null_SEGDEFAULT:OP08Settings.apk:com.mediatek.op08.settings.Op08SettingsCustomizationFactory:com.mediatek.op08.settings)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09AlibSettings.apk:com.mediatek.settings.op09alib.Op09AlibSettingsCustomizationFactory:com.mediatek.settings.op09alib)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP09_null_SEGC:OP09ClibSettings.apk:com.mediatek.settings.op09clib.Op09ClibSettingsCustomizationFactory:com.mediatek.settings.op09clib)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 8: OperatorFactoryInfo(OP12_null_null:OP12Settings.apk:com.mediatek.op12.settings.Op12SettingsCustomizationFactory:com.mediatek.op12.settings)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 9: OperatorFactoryInfo(OP16_null_SEGDEFAULT:OP16Settings.apk:com.mediatek.op16.settings.Op16SettingsCustomizationFactory:com.mediatek.op16.settings)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 10: OperatorFactoryInfo(OP18_null_SEGDEFAULT:OP18Settings.apk:com.mediatek.op18.settings.OP18SettingsCustomizationFactory:com.mediatek.op18.settings)
01-10 14:12:19.855733  1349  1349 E OperatorCustomizationFactoryLoader: 11: OperatorFactoryInfo(OP20_null_SEGDEFAULT:OP20Settings.apk:com.mediatek.op20.settings.OP20SettingsCustomizationFactory:com.mediatek.op20.settings)
01-10 14:12:19.856683  1349  1349 D UtilsExt: [getSimManagementExt] create ext instance: com.mediatek.settings.ext.DefaultSimManagementExt@bf12e2d
01-10 14:12:19.858244  1349  1349 D SimSelectService: onCreate
01-10 14:12:19.858791  1130  1390 D OpenGLRenderer: profile bars disabled
01-10 14:12:19.859003  1349  1349 D SimSelectService: onReceive action=android.intent.action.ACTION_SUBINFO_RECORD_UPDATED
01-10 14:12:19.859135  1130  1390 D OpenGLRenderer: ambientRatio = 1.50
01-10 14:12:19.859274  1349  1349 D UtilsExt: autoSanity: false buildType: user
01-10 14:12:19.860052  1349  1349 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 14:12:19.861277  1130  1130 D WindowClient: Add to mViews: com.android.systemui.statusbar.phone.StatusBarWindowView{4e337df V.E...... ......I. 0,0-0,0}, this = android.view.WindowManagerGlobal@48195ae
01-10 14:12:19.861639  1311  1311 W System.err: java.lang.ClassNotFoundException: cn.richinfo.dm.CtmApplication
01-10 14:12:19.861814  1311  1311 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 14:12:19.861856  1311  1311 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 14:12:19.861870  1311  1311 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 14:12:19.861885  1311  1311 W System.err: 	at com.mediatek.phone.ext.ExtensionManager.initPhoneHelper(ExtensionManager.java:287)
01-10 14:12:19.861904  1311  1311 W System.err: 	at com.android.phone.PhoneApp.onCreate(PhoneApp.java:48)
01-10 14:12:19.861918  1311  1311 W System.err: 	at android.app.Instrumentation.callApplicationOnCreate(Instrumentation.java:1119)
01-10 14:12:19.861947  1311  1311 W System.err: 	at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5781)
01-10 14:12:19.861961  1311  1311 W System.err: 	at android.app.ActivityThread.-wrap1(Unknown Source:0)
01-10 14:12:19.861973  1311  1311 W System.err: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1690)
01-10 14:12:19.862003  1311  1311 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 14:12:19.862017  1311  1311 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 14:12:19.862037  1311  1311 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 14:12:19.862065  1311  1311 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 14:12:19.862079  1311  1311 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 14:12:19.862105  1311  1311 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 14:12:19.862286  1311  1311 W System.err: Caused by: java.lang.ClassNotFoundException: Didn't find class "cn.richinfo.dm.CtmApplication" on path: DexPathList[[zip file "/system/priv-app/MtkTeleService/MtkTeleService.apk"],nativeLibraryDirectories=[/system/priv-app/MtkTeleService/lib/arm64, /system/lib64, /vendor/lib64, /system/lib64, /vendor/lib64]]
01-10 14:12:19.862318  1311  1311 W System.err: 	at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:125)
01-10 14:12:19.862332  1311  1311 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
01-10 14:12:19.862347  1311  1311 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 14:12:19.862365  1311  1311 W System.err: 	... 15 more
01-10 14:12:19.863326  1130  1130 D ViewRootImpl[StatusBar]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 14:12:19.864254  1349  1349 D SimSelectService: sub info update, type = 4, subs = null
01-10 14:12:19.864371  1349  1349 D SimSelectService: extra value no change, return
01-10 14:12:19.865310   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.865945  1311  1311 D ImsResolver: maybeAddedImsService, packageName: null
01-10 14:12:19.872533  1130  1130 D StatusBar: disable<e i a s b h r c s q >
01-10 14:12:19.875580  1311  1311 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 14:12:19.883269   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.901499  1130  1130 D PhoneStatusBarPolicy: registerAlarmClockChanged:0
01-10 14:12:19.903315  1311  1311 D IntentBroadcaster: Broadcasting and adding intent for rebroadcast: android.intent.action.SIM_STATE_CHANGED UNKNOWN for slotId 0
01-10 14:12:19.905934   943   943 D MtkEapSimUtility: onReceive ACTION_SIM_STATE_CHANGED iccState: UNKNOWN, simSlot: 0
01-10 14:12:19.907233   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.907953  1299  1299 D ImsConfigReceiver: Update LatestSimState, phoneId = 0, state = UNKNOWN
01-10 14:12:19.908087  1299  1299 D ImsConfigReceiver: Sim state changed, event = UNKNOWN, reset broadcast flag
01-10 14:12:19.908337  1299  1299 D ImsVT Util: Received ACTION_SIM_STATE_CHANGED, slotId:0, simState:UNKNOWN
01-10 14:12:19.915113  1311  1311 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 14:12:19.915363  1130  1284 D NetworkController: subscriptions is null
01-10 14:12:19.917773  1311  1311 W System.err: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 14:12:19.918038  1311  1311 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 14:12:19.918080  1311  1311 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 14:12:19.918095  1311  1311 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 14:12:19.918116  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.getRilOp(MtkRIL.java:467)
01-10 14:12:19.918132  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.unregisterForModulation(MtkRIL.java:1461)
01-10 14:12:19.918161  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkServiceStateTracker.updatePhoneType(MtkServiceStateTracker.java:536)
01-10 14:12:19.918186  1311  1311 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.switchPhoneType(GsmCdmaPhone.java:414)
01-10 14:12:19.918200  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.switchPhoneType(MtkGsmCdmaPhone.java:580)
01-10 14:12:19.918214  1311  1311 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.switchVoiceRadioTech(GsmCdmaPhone.java:3321)
01-10 14:12:19.918239  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.switchVoiceRadioTech(MtkGsmCdmaPhone.java:667)
01-10 14:12:19.918254  1311  1311 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.phoneObjectUpdater(GsmCdmaPhone.java:3295)
01-10 14:12:19.918274  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.phoneObjectUpdater(MtkGsmCdmaPhone.java:5503)
01-10 14:12:19.918289  1311  1311 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.handleMessage(GsmCdmaPhone.java:2243)
01-10 14:12:19.918307  1311  1311 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.handleMessage(MtkGsmCdmaPhone.java:2128)
01-10 14:12:19.918328  1311  1311 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 14:12:19.918341  1311  1311 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 14:12:19.918353  1311  1311 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 14:12:19.918405  1311  1311 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 14:12:19.918428  1311  1311 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 14:12:19.918446  1311  1311 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 14:12:19.918671  1311  1311 W System.err: Caused by: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 14:12:19.918700  1311  1311 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 14:12:19.918715  1311  1311 W System.err: 	at java.lang.BootClassLoader.findClass(ClassLoader.java:1355)
01-10 14:12:19.918730  1311  1311 W System.err: 	at java.lang.BootClassLoader.loadClass(ClassLoader.java:1415)
01-10 14:12:19.918743  1311  1311 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 14:12:19.918755  1311  1311 W System.err: 	... 20 more
01-10 14:12:19.918799  1311  1311 W System.err: Caused by: java.lang.NoClassDefFoundError: Class not found using the boot class loader; no stack trace available
01-10 14:12:19.922992   943   952 I zygote64: Background concurrent copying GC freed 44596(2MB) AllocSpace objects, 11(476KB) LOS objects, 42% free, 8MB/14MB, paused 246us total 115.393ms
01-10 14:12:19.925724   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.932744  1311  1311 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 14:12:19.933721  1311  1311 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 14:12:19.944192  1130  1130 D StatusBar: heads up is enabled
01-10 14:12:19.946626  1299  1452 I VT      : [JNI] Leaving InitRefVTP
01-10 14:12:19.947491  1311  1311 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 14:12:19.948780  1311  1311 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 14:12:19.949274   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.956240  1299  1370 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 14:12:19.967904   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:19.970525  1130  1130 W SystemUIService: Initialization of com.android.systemui.SystemBars took 1340 ms
01-10 14:12:19.974031   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 14:12:19.974247   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 14:12:19.982598  1130  1130 D StorageNotification: Notifying about private volume: VolumeInfo{private}:
01-10 14:12:19.982598  1130  1130 D StorageNotification:     type=PRIVATE diskId=null partGuid=null mountFlags=0 mountUserId=-1 
01-10 14:12:19.982598  1130  1130 D StorageNotification:     state=MOUNTED 
01-10 14:12:19.982598  1130  1130 D StorageNotification:     fsType=null fsUuid=null fsLabel=null 
01-10 14:12:19.982598  1130  1130 D StorageNotification:     path=/data internalPath=null 
01-10 14:12:19.987775  1311  1311 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 14:12:19.988968  1311  1311 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 14:12:19.991510   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:19.993156   555   580 D agps    : [agps][n][CP] [MD_1] read  md_modem_reboot_ind_hdlr
01-10 14:12:19.993386   555   580 D agps    : [agps][n][CP] [MD_1] write  sim_info_req  gsm_disabled=[0] umts_disabled=[0] lte_disabled=[0] lppe_enable=[1] lppe_network_location_disable=[0] reject_non911_nilr_enable=[0] battery_percentage=[100]
01-10 14:12:19.993470   555   580 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 14:12:19.993513   555   580 D agps    : [agps] WARNING: [LPPe] lppe_mgr_start_capabilities_sync()
01-10 14:12:19.994288   554   622 D lbs_hidl_service: [1.05][mtk_lppe_socket_wlan] handleSocketEvent() ret=[12]
01-10 14:12:19.994428   554   622 D lbs_hidl_service: [1.05][mtk_lppe_socket_bt] handleSocketEvent() ret=[12]
01-10 14:12:19.994456   554   622 D lbs_hidl_service: [1.05][mtk_lppe_socket_sensor] handleSocketEvent() ret=[12]
01-10 14:12:19.994481   554   622 D lbs_hidl_service: [1.05][mtk_lppe_socket_network] handleSocketEvent() ret=[12]
01-10 14:12:19.994506   554   622 D lbs_hidl_service: [1.05][mtk_lppe_socket_ipaddr] handleSocketEvent() ret=[12]
01-10 14:12:19.994547   554   622 D lbs_hidl_service: [1.05][mtk_lppe_socket_lbs] handleSocketEvent() ret=[12]
01-10 14:12:19.997037  1299  1370 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 14:12:20.003548   555   580 D agps    : [agps][n][CP] [MD_1] read  sim_info_rsp  sim_number=2 md_type=0 (0=fdd, 1=tdd) ecid=1 otdoa=0 band_num=11
01-10 14:12:20.003616   555   580 D agps    : [agps][n][CP] i=0  support_band=1
01-10 14:12:20.003629   555   580 D agps    : [agps][n][CP] i=1  support_band=3
01-10 14:12:20.003640   555   580 D agps    : [agps][n][CP] i=2  support_band=5
01-10 14:12:20.003652   555   580 D agps    : [agps][n][CP] i=3  support_band=7
01-10 14:12:20.003662   555   580 D agps    : [agps][n][CP] i=4  support_band=8
01-10 14:12:20.003673   555   580 D agps    : [agps][n][CP] i=5  support_band=20
01-10 14:12:20.003683   555   580 D agps    : [agps][n][CP] i=6  support_band=28
01-10 14:12:20.003694   555   580 D agps    : [agps][n][CP] i=7  support_band=38
01-10 14:12:20.003705   555   580 D agps    : [agps][n][CP] i=8  support_band=39
01-10 14:12:20.003717   555   580 D agps    : [agps][n][CP] i=9  support_band=40
01-10 14:12:20.003729   555   580 D agps    : [agps][n][CP] i=10  support_band=41
01-10 14:12:20.003751   555   580 D agps    : [agps][n][CP] index=[0]  support_lpp_otdoa_nbr_cell_list=[0] support_supl_flow_ind=[1] support_location_settings=[1] support_cp_lppe=[0]
01-10 14:12:20.003824   555   580 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 14:12:20.003860   555   604 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_LBS_CAPABILITY_UPDATE_REQ]
01-10 14:12:20.003920   555   604 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_PEER_EUTRAN_BAND_UPDATE_CNF]
01-10 14:12:20.004008   555   580 D agps    : [agps][n][AGPS] [MNL] write  agps_settings_sync  sib8_16=[1], gps=[1] glonass=[1] beidou=[1] galileo=[1] agps=[1] aglonass=[1] abeidou=[0] agalileo=[0]
01-10 14:12:20.004367   520   691 D MNLD    : agps_settings_sync: agps setting, sib8_16_enable = 1, gps_sat_en = 1, glonass_sat_en = 1,         beidou_sat_en = 1, galileo_sat_en = 1, a_glonass_sat_en = 1,         a_gps_satellite_enable = 1, a_beidou_satellite_enable = 0, a_galileo_satellite_enable = 0, lppe_enable=1
01-10 14:12:20.005405   520   691 D MNLD    : agps_settings_sync: mnl stop, mnld send pmtk764 to agpsd
01-10 14:12:20.005467   555   580 D agps    : [agps][n][AGPS] [MNL] read  agps_settings_ack  gps=[1] glonass=[1] beidou=[1] galileo=[0]
01-10 14:12:20.005490   520   691 D MNLD    : get_agnss_capability: MNLD_PMTK764: $PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 14:12:20.005490   520   691 D MNLD    : , agps_cap:1, aglonass_cap:1, abeidou_cap:0, agalileo_cap:0, lppe_support:1
01-10 14:12:20.005762   555   580 D agps    : [agps][n][AGPS] [MNL] read  pmtk=[$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 14:12:20.005762   555   580 D agps    : ]
01-10 14:12:20.005809   555   580 D agps    : [agps][n][AGPS] gnss_num=2
01-10 14:12:20.005877   555   580 D agps    : [agps][n][CP] [MD_1] write  pmtk [$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 14:12:20.005877   555   580 D agps    : ]
01-10 14:12:20.009908   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 14:12:20.010047   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 14:12:20.010283   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.023345   398  1416 I SurfaceFlinger: EventThread Client Pid (1130) created
01-10 14:12:20.024417   398  1416 I SurfaceFlinger: EventThread Client Pid (1130) created
01-10 14:12:20.033246   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.051735   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.060275  1130  1150 D KeyguardViewMediator: lockedOrMissing is false, requireSim=false, antiTheftLocked=false remoteLocked = false
01-10 14:12:20.074958   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.085034  1299  1299 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 14:12:20.086117  1130  1130 I Choreographer: Skipped 77 frames!  The application may be doing too much work on its main thread.
01-10 14:12:20.089889  1311  1328 E MtkPhoneIntfMgrEx: [setWifiSignalLevel] pheonId:0, rssi:0, snr:60
01-10 14:12:20.092796  1130  1502 D KeyguardViewMediator: onBootCompleted() is called
01-10 14:12:20.092991   523   562 D AAL     : 01-10 02:12:19.906 BL= 382,ESS= 256, 01-10 02:12:19.960 BL= 381,ESS= 256, 01-10 02:12:19.998 BL= 380,ESS= 256, 01-10 02:12:20.055 BL= 379,ESS= 256, 01-10 02:12:20.092 BL= 378,ESS= 256, 
01-10 14:12:20.094592  1311  1328 E MtkPhoneIntfMgrEx: [setWifiEnabled] pheonId:0, ifName:wlan0, isEnabled:0
01-10 14:12:20.099049   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 14:12:20.099208   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 14:12:20.100965  1311  1328 E MtkPhoneIntfMgrEx: [setWifiAssociated] pheonId:0, ifName:wlan0, associated:false, ssid:, apMac:
01-10 14:12:20.103334  1311  1311 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: No UICC
01-10 14:12:20.105154  1311  1328 E MtkPhoneIntfMgrEx: [setWifiIpAddress] pheonId:0, ifName:wlan0, ipv4Addr:, ipv6Addr:
01-10 14:12:20.105863   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.110811   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wowifi=***](28)
01-10 14:12:20.111079   891   891 D [epdg_wo]: [DBG] wifi->prev_ssid= de-associcated
01-10 14:12:20.111158   891   891 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wowifi:0,0](10)
01-10 14:12:20.113413  1130  1130 D ViewRootImpl[StatusBar]: changeCanvasOpacity: opaque=true
01-10 14:12:20.122955   398  1416 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=23.30 dur=1030.18 max=55.74 min=32.53
01-10 14:12:20.123032  1311  1311 I VvmSimStateTracker: android.intent.action.SIM_STATE_CHANGED
01-10 14:12:20.124453  1311  1311 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 14:12:20.124534  1311  1311 D ImsExternalCallTracker: refreshCallPullState
01-10 14:12:20.124779   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.143602   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.148633  1311  1311 D PhoneSwitcherNetworkRequstListener: got request NetworkRequest [ TRACK_DEFAULT id=6, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 14:12:20.149326  1311  1311 D PhoneSwitcherNetworkRequstListener: got request NetworkRequest [ REQUEST id=1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 14:12:20.149580  1311  1311 D PhoneSwitcherNetworkRequstListener: got request NetworkRequest [ TRACK_DEFAULT id=3, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 14:12:20.152994  1311  1311 D TelephonyDebugService: TelephonyDebugService()
01-10 14:12:20.156991   557   557 D NVRAM   : NVRAM daemon sync start !
01-10 14:12:20.158438   537  1474 I NuPlayerDecoder: [audio] saw output EOS
01-10 14:12:20.166409  1311  1311 D CarrierConfigLoader: mHandler: 12 phoneId: 0
01-10 14:12:20.166498   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.169797  1311  1311 D PhoneGlobals: onSubscriptionsChanged start
01-10 14:12:20.172748  1311  1311 D TelephonyUtils: isHotSwapHanppened : false
01-10 14:12:20.172907  1311  1311 D PhoneGlobals: onSubscriptionsChanged end
01-10 14:12:20.173122  1311  1311 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SERVICE_STATE
01-10 14:12:20.173185  1311  1311 D CdmaVolteServiceChecker: updateState, checking = false
01-10 14:12:20.173851  1311  1311 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 14:12:20.173995  1311  1311 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 14:12:20.174203  1311  1311 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SIM_STATE_CHANGED
01-10 14:12:20.174238  1311  1311 D CdmaVolteServiceChecker: updateState, checking = false
01-10 14:12:20.174744  1311  1311 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 14:12:20.174847  1311  1311 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 14:12:20.177687  1311  1311 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: No UICC
01-10 14:12:20.185470   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.194073   548   882 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:20.190000   548   548 W HwBinder:548_2: type=1400 audit(0.0:50): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 14:12:20.196189  1311  1311 D OpenGLRenderer: HWUI GL Pipeline
01-10 14:12:20.202444  1311  1311 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 14:12:20.202599  1311  1311 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 14:12:20.202767  1311  1311 I zygote64: Deoptimizing java.lang.Object com.mediatek.common.util.OperatorCustomizationFactoryLoader.loadFactory(android.content.Context, java.util.List, int) due to JIT inline cache
01-10 14:12:20.202937  1311  1311 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 14:12:20.202937  1311  1311 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(null_null_null:OPTeleServiceCommon.apk:com.mediatek.op.phone.plugin.CommonPhoneCustomizationFactory:com.mediatek.op.phone.plugin)
01-10 14:12:20.203669  1311  1311 D ExtensionManager: [sRttUtilExt] create ext instance: com.mediatek.phone.ext.DefaultRttUtilExt@13fdd8
01-10 14:12:20.207089   557   557 D NVRAM   : NVRAM daemon sync end !
01-10 14:12:20.207178   557   557 D NVRAM   : NVRAM daemon exits !
01-10 14:12:20.208465   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.227443   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.227872  1130  1130 D SignalClusterView: hasCorrectSubs, subsInfo:[],--mPhoneStates:[]
01-10 14:12:20.230377  1311  1311 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SIM_STATE_CHANGED
01-10 14:12:20.230513  1311  1565 D CarrierConfigLoader: update config for phoneId: 0 simState: UNKNOWN
01-10 14:12:20.230625  1311  1311 D CdmaVolteServiceChecker: updateState, checking = false
01-10 14:12:20.230696  1311  1565 D CarrierSvcBindHelper: update binding for phoneId: 0 simState: UNKNOWN
01-10 14:12:20.231477  1311  1311 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 14:12:20.231668  1311  1311 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 14:12:20.234708  1311  1311 D IntentBroadcaster: Broadcasting and adding intent for rebroadcast: android.intent.action.SIM_STATE_CHANGED ABSENT for slotId 0
01-10 14:12:20.236852   943   943 D MtkEapSimUtility: onReceive ACTION_SIM_STATE_CHANGED iccState: ABSENT, simSlot: 0
01-10 14:12:20.237054   943   943 D MtkEapSimUtility: resetting networks because SIM0 was removed
01-10 14:12:20.240522  1311  1311 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 14:12:20.241195   943  1089 D WifiStateMachine:  InitialState !CMD_RESET_SIM_NETWORKS rt=19381/19381 0 0
01-10 14:12:20.241316   943  1089 D WifiStateMachine:  DefaultState !CMD_RESET_SIM_NETWORKS rt=19381/19381 0 0
01-10 14:12:20.241428  1311  1311 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 14:12:20.241890  1130  1284 D NetworkController: subscriptions is null
01-10 14:12:20.242844  1299  1299 D ImsConfigReceiver: Update LatestSimState, phoneId = 0, state = ABSENT
01-10 14:12:20.242935  1299  1299 D ImsConfigReceiver: Sim state changed, event = ABSENT, check for ECC flag
01-10 14:12:20.242985  1299  1299 D ImsConfigReceiver: Sim state changed, event = ABSENT, reset broadcast flag
01-10 14:12:20.243502  1130  1130 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 14:12:20.244554  1299  1299 D ImsVT Util: Received ACTION_SIM_STATE_CHANGED, slotId:0, simState:ABSENT
01-10 14:12:20.245772  1299  1299 D ImsConfigManager: DYNAMIC_IMS_SWITCH_TRIGGER phoneId:0, simState:ABSENT
01-10 14:12:20.246002  1299  1299 D ImsConfigManager: get MtkImsConfigImpl of phone 0
01-10 14:12:20.246167  1299  1299 W ImsConfigManager: setImsResCapability to volte only w/o SIM on phone 0
01-10 14:12:20.247959  1130  1130 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 14:12:20.249125  1299  1299 D ImsConfigStorage: updateResource() comparing: curValue: 1, value:1
01-10 14:12:20.250225   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.260766  1299  1299 D ImsConfigStorage: updateResource() comparing: curValue: 0, value:0
01-10 14:12:20.269344   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.272635  1299  1299 D ImsConfigStorage: updateResource() comparing: curValue: 0, value:0
01-10 14:12:20.280293  1311  1311 D PhoneGlobals: Radio technology switched. Now CDMA (0) is active.
01-10 14:12:20.282863  1299  1299 D ImsConfigManager: DYNAMIC_IMS_SWITCH_COMPLETE phoneId:0, simState:ABSENT
01-10 14:12:20.285025  1311  1311 D AudioTrack: set(): 0x74b7f82000, streamType 0, sampleRate 0, format 0x1, channelMask 0x1, frameCount 960, flags #4, notificationFrames 0, sessionId 0, transferType 1, uid -1, pid -1
01-10 14:12:20.285515  1311  1311 D AudioTrack: set: Create AudioTrackThread, tid = 1585
01-10 14:12:20.287701  1311  1311 D AudioTrack: mNotificationFramesReq 0, notificationFrames 1024
01-10 14:12:20.288524   524   524 D AudioFlinger: track(0xe9e43000): mIsOut 1, mFrameCount 960, mSampleRate 48000, mFormat 1, mChannelCount 1, mTrackCount 1, thread 0xe9c03980, sessionId 49
01-10 14:12:20.288675   524   524 D AudioFlinger: track(0xe9e43000): mFastIndex 1, mStreamType 0, mName 4097
01-10 14:12:20.289178  1311  1311 I AudioTrack: AUDIO_OUTPUT_FLAG_FAST successful; frameCount 960 -> 960
01-10 14:12:20.289213  1311  1311 W AudioTrack: Client adjusted notificationFrames from 1024 to 256 for frameCount 960
01-10 14:12:20.290258  1311  1311 D AudioTrack: createTrack_l: 0x74b7f82000, mCblk = 0x74a8af5000, mLatency = 72, mAfLatency = 52, frameCount = 960, mSampleRate = 48000, mFlags = 0x4, mReqFrameCount = 960, mNotificationFramesAct = 256
01-10 14:12:20.291944  1311  1311 D CallNotifier: CallNotifier: mSignalInfoToneGenerator created when toneplay
01-10 14:12:20.292024   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.298297  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.298374  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.298423  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.310835  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.310897  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.310928  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.311060   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.318225  1311  1322 I zygote64: Do partial code cache collection, code=20KB, data=30KB
01-10 14:12:20.318739  1311  1322 I zygote64: After code cache collection, code=17KB, data=29KB
01-10 14:12:20.318774  1311  1322 I zygote64: Increasing code cache capacity to 128KB
01-10 14:12:20.319878  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.319989  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.320048  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.334212   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.336755   943   943 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 14:12:20.338083   523   562 D AAL     : 01-10 02:12:20.149 BL= 377,ESS= 256, 01-10 02:12:20.187 BL= 376,ESS= 256, 01-10 02:12:20.243 BL= 375,ESS= 256, 01-10 02:12:20.281 BL= 374,ESS= 256, 01-10 02:12:20.337 BL= 373,ESS= 256, 
01-10 14:12:20.341261  1349  1349 D SimSelectService: onReceive action=android.intent.action.ACTION_SUBINFO_RECORD_UPDATED
01-10 14:12:20.341431  1349  1349 D UtilsExt: autoSanity: false buildType: user
01-10 14:12:20.341503   943  1000 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 14:12:20.341521  1349  1349 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 14:12:20.342958  1130  1284 D NetworkController: subscriptions is null
01-10 14:12:20.343718  1349  1349 D SimSelectService: sub info update, type = 4, subs = null
01-10 14:12:20.343796  1349  1349 D SimSelectService: extra value no change, return
01-10 14:12:20.344412  1130  1284 D NetworkController: updateMobileControllers detectedType: 4
01-10 14:12:20.353508   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.355978  1130  1284 D NetworkController: isEmergencyOnly No sims 
01-10 14:12:20.373029  1311  1311 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 14:12:20.374178  1311  1311 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 14:12:20.375724   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.394368   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.414533   537  1473 D AudioTrack: stop(): 0xe738a000, mState = 0
01-10 14:12:20.414627   537  1473 D AudioTrack: stop() called with 55902 frames delivered
01-10 14:12:20.414911   537  1473 D AudioTrack: audiotrack 0xe738a000 stop done
01-10 14:12:20.416072   398   398 I DisplayDevice: [Built-in Screen (type:0)] fps:26.986547,dur:1074.61,max:87.21,min:7.20
01-10 14:12:20.417249   398   398 I BufferQueue: [unnamed-398-3](this:0x7f7b6e2800,id:3,api:0,p:-1,c:-1) BufferQueue core=(398:/system/bin/surfaceflinger)
01-10 14:12:20.417274   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.417804   398   398 W GuiExt  : Cannot find GuiExtService
01-10 14:12:20.418006   398   398 I BufferQueueConsumer: [unnamed-398-3](this:0x7f7b6e2800,id:3,api:0,p:-1,c:398) connect(C): consumer=(398:/system/bin/surfaceflinger) controlledByApp=false
01-10 14:12:20.418086   398   398 I BufferQueueConsumer: [unnamed-398-3](this:0x7f7b6e2800,id:3,api:0,p:-1,c:398) setConsumerName: unnamed-398-3
01-10 14:12:20.418137   398   398 I BufferQueueConsumer: [StatusBar#0](this:0x7f7b6e2800,id:3,api:0,p:-1,c:398) setConsumerName: StatusBar#0
01-10 14:12:20.418199   398   398 I BufferQueueConsumer: [StatusBar#0](this:0x7f7b6e2800,id:3,api:0,p:-1,c:398) setDefaultBufferSize: width=720 height=48
01-10 14:12:20.423342  1130  1130 D Surface : Surface::allocateBuffers(this=0x74a7dab000)
01-10 14:12:20.435828   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.437166  1130  1130 D StatusBar: disable<e i a s b H!R!c s q >
01-10 14:12:20.441237  1130  1390 I zygote64: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 14:12:20.441577  1130  1390 I OpenGLRenderer: Initialized EGL, version 1.4
01-10 14:12:20.441631   943  1088 D WifiHandler.WifiService: Received message=69633d sendingUid=10021
01-10 14:12:20.441695  1130  1390 D OpenGLRenderer: Swap behavior 2
01-10 14:12:20.441824   943  1088 D WifiHandler.WifiService: Received message=69632d sendingUid=-1
01-10 14:12:20.445622  1311  1311 D OP20RoamingSettingsReceiver: Subinfo Record Update: -2
01-10 14:12:20.452418  1311  1322 I zygote64: Compiler allocated 5MB to compile void com.mediatek.internal.telephony.MtkServiceStateTracker.pollStateDone()
01-10 14:12:20.458131  1311  1311 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 14:12:20.458222  1311  1311 D ImsExternalCallTracker: refreshCallPullState
01-10 14:12:20.458830  1130  1390 D OpenGLRenderer: [init] completed
01-10 14:12:20.458901  1130  1390 D HWUIExtension: MTKProgramCache.init: enable enhancement 1
01-10 14:12:20.459267  1130  1390 I HWUIExtension: Get disable program binary service property (0)
01-10 14:12:20.459311  1130  1390 I HWUIExtension: Initializing program atlas...
01-10 14:12:20.459340   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.460625  1311  1311 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 14:12:20.460836  1130  1390 I ProgramBinary/Service: ProgramBinaryService client side disable debugging.
01-10 14:12:20.460926  1130  1390 I ProgramBinary/Service: ProgramBinaryService client side disable binary content debugging.
01-10 14:12:20.460941  1130  1390 D ProgramBinary/Service: BpProgramBinaryService.getReady
01-10 14:12:20.460963  1130  1390 D ProgramBinary/Service: zhiyin- 1 BpProgramBinaryService::getReady()
01-10 14:12:20.461220   569   634 D ProgramBinary/Service: zhiyin- ontransact 1 code 1
01-10 14:12:20.461317   569   634 D ProgramBinary/Service: zhiyin- ontransact 2 code 1
01-10 14:12:20.461341   569   634 D ProgramBinary/Service: zhiyin- ontransact 3 code 1
01-10 14:12:20.461419  1130  1390 D ProgramBinary/Service: zhiyin- 2 BpProgramBinaryService::getReady()
01-10 14:12:20.461450  1130  1390 D ProgramBinary/Service: BpProgramBinaryService.getProgramBinaryData
01-10 14:12:20.461519   569   634 D ProgramBinary/Service: zhiyin- ontransact 1 code 3
01-10 14:12:20.461772  1130  1390 I HWUIExtension: Program binary detail: Binary length is 188172, program map length is 104.
01-10 14:12:20.463558  1130  1390 I HWUIExtension: Succeeded to mmap program binaries. File descriptor is 92, and path is /dev/ashmem.
01-10 14:12:20.463666  1130  1390 I HWUIExtension: No need to use file discriptor anymore, close fd(92).
01-10 14:12:20.463819  1130  1390 D HWUIExtension: Dumper init 4 threads <0x74a6cef540>
01-10 14:12:20.463954  1130  1390 D HWUIExtension: <com.android.systemui> is running.
01-10 14:12:20.464046  1130  1390 D HWUIExtension: Initializing program cache from 0x0, size = -1
01-10 14:12:20.464549  1130  1390 D Surface : Surface::connect(this=0x74a7dab000,api=1)
01-10 14:12:20.465158   398   420 I BufferQueueProducer: [StatusBar#0](this:0x7f7b6e2800,id:3,api:1,p:1130,c:398) connect(P): api=1 producer=(1130:com.android.systemui) producerControlledByApp=true
01-10 14:12:20.467309  1130  1390 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 14:12:20.478039   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.483627  1311  1311 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 14:12:20.484920  1311  1311 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 14:12:20.484912  1130  1403 E WallpaperManager: /enterprise/wallpaper not exists
01-10 14:12:20.486956   398   398 I BufferQueue: [unnamed-398-4](this:0x7f74424800,id:4,api:0,p:-1,c:-1) BufferQueue core=(398:/system/bin/surfaceflinger)
01-10 14:12:20.487579   398   398 W GuiExt  : Cannot find GuiExtService
01-10 14:12:20.487952   398   398 I BufferQueueConsumer: [unnamed-398-4](this:0x7f74424800,id:4,api:0,p:-1,c:398) connect(C): consumer=(398:/system/bin/surfaceflinger) controlledByApp=false
01-10 14:12:20.488063   398   398 I BufferQueueConsumer: [unnamed-398-4](this:0x7f74424800,id:4,api:0,p:-1,c:398) setConsumerName: unnamed-398-4
01-10 14:12:20.488116   398   398 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x7f74424800,id:4,api:0,p:-1,c:398) setConsumerName: com.android.systemui.ImageWallpaper#0
01-10 14:12:20.488203   398   398 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x7f74424800,id:4,api:0,p:-1,c:398) setDefaultBufferSize: width=720 height=720
01-10 14:12:20.489265  1311  1311 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 14:12:20.490477  1311  1311 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 14:12:20.493307  1311  1311 D ExtensionManager: [sGttInfoExt] create ext instance: com.mediatek.phone.ext.DefaultGttInfoExt@eaad36d
01-10 14:12:20.493543  1311  1311 D CarrierConfigLoader: mHandler: 0 phoneId: 0
01-10 14:12:20.493767  1311  1311 D CarrierSvcBindHelper: mHandler: 0
01-10 14:12:20.493808  1311  1311 D CarrierSvcBindHelper: Rebinding if necessary for phoneId: 0
01-10 14:12:20.494617  1311  1311 D CarrierSvcBindHelper: No carrier app for: 0
01-10 14:12:20.497236  1311  1311 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 14:12:20.498715  1311  1311 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 14:12:20.501287   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.513879  1311  1322 I zygote64: Do partial code cache collection, code=54KB, data=62KB
01-10 14:12:20.514270  1311  1322 I zygote64: After code cache collection, code=54KB, data=62KB
01-10 14:12:20.514322  1311  1322 I zygote64: Increasing code cache capacity to 256KB
01-10 14:12:20.520733   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.521588  1311  1570 D CarrierConfigLoader: update config for phoneId: 0 simState: ABSENT
01-10 14:12:20.521819  1311  1570 D CarrierSvcBindHelper: update binding for phoneId: 0 simState: ABSENT
01-10 14:12:20.526578  1311  1311 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SIM_STATE_CHANGED
01-10 14:12:20.526744  1311  1311 D CdmaVolteServiceChecker: updateState, checking = false
01-10 14:12:20.527374  1311  1311 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 14:12:20.527549  1311  1311 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 14:12:20.532427  1311  1311 D PhoneGlobals: onSubscriptionsChanged start
01-10 14:12:20.534326  1311  1311 D TelephonyUtils: isHotSwapHanppened : false
01-10 14:12:20.534403  1311  1311 D PhoneGlobals: onSubscriptionsChanged end
01-10 14:12:20.535930  1130  1137 I zygote64: Do partial code cache collection, code=29KB, data=29KB
01-10 14:12:20.536187  1311  1311 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 14:12:20.538213  1130  1137 I zygote64: After code cache collection, code=29KB, data=29KB
01-10 14:12:20.538293  1130  1137 I zygote64: Increasing code cache capacity to 128KB
01-10 14:12:20.543051   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.543234  1130  1130 D SignalClusterView: hasCorrectSubs, subsInfo:[],--mPhoneStates:[]
01-10 14:12:20.562006   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.563197  1311  1311 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SERVICE_STATE
01-10 14:12:20.563358  1311  1311 D CdmaVolteServiceChecker: updateState, checking = false
01-10 14:12:20.564339  1311  1311 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 14:12:20.564542  1311  1311 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 14:12:20.583188   523   562 D AAL     : 01-10 02:12:20.375 BL= 372,ESS= 256, 01-10 02:12:20.451 BL= 371,ESS= 256, 01-10 02:12:20.488 BL= 370,ESS= 256, 01-10 02:12:20.545 BL= 369,ESS= 256, 01-10 02:12:20.583 BL= 368,ESS= 256, 
01-10 14:12:20.584985   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.587242  1130  1284 D NetworkController: isEmergencyOnly No sims 
01-10 14:12:20.597052  1311  1311 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 14:12:20.603720   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.608052  1311  1311 I zygote64: The ClassLoaderContext is a special shared library.
01-10 14:12:20.623329  1311  1311 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 14:12:20.626524   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.627520  1311  1311 D CarrierConfigLoader: mHandler: 0 phoneId: 0
01-10 14:12:20.627714  1311  1311 D CarrierSvcBindHelper: mHandler: 0
01-10 14:12:20.627771  1311  1311 D CarrierSvcBindHelper: Rebinding if necessary for phoneId: 0
01-10 14:12:20.628399  1311  1311 D CarrierSvcBindHelper: No carrier app for: 0
01-10 14:12:20.628485  1311  1311 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 14:12:20.628554  1311  1311 D ImsExternalCallTracker: refreshCallPullState
01-10 14:12:20.630905  1311  1311 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 14:12:20.644939   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.652235  1311  1311 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SERVICE_STATE
01-10 14:12:20.652481  1311  1311 D CdmaVolteServiceChecker: updateState, checking = false
01-10 14:12:20.653822  1311  1311 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 14:12:20.654166  1311  1311 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 14:12:20.660509   806   926 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 14:12:20.660678   806   926 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 14:12:20.660723   806   926 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 14:12:20.668557   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.674533  1311  1311 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only global URI.
01-10 14:12:20.687183   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.710135   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.728782   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.730264   537  1461 D NuPlayerDriver: notifyListener_l(0xe9aaf5b0), (2, 0, 0, -1), loop setting(0, 0)
01-10 14:12:20.731370   537  1473 D AudioTrack: pause(): 0xe738a000, mState = 1
01-10 14:12:20.731711   943   943 D MediaPlayer: handleMessage msg:(2, 0, 0)
01-10 14:12:20.733400   524   524 D APM_AudioPolicyManager: setForceUse() usage 1, config 10, mPhoneState 0
01-10 14:12:20.737718   377   800 D AudioALSAHardware: +routing createAudioPatch Mixer->2
01-10 14:12:20.738059   377   800 D AudioALSAStreamManager: +setParameters(), IOport = 13, keyValuePairs = routing=2
01-10 14:12:20.742874   377   800 D         : -updateDeviceInfoForVoiceWakeUp(), mIsUseHeadsetMic = 0, bIsUseHeadsetMic = 0
01-10 14:12:20.743046   377   800 W AudioALSAStreamManager: routingOutputDevice(), flag: 6, mPhoneCallSpeechOpen = 0, output_devices == current_output_devices(0x2), return
01-10 14:12:20.747447   377   800 D AudioALSAHardware: +routing createAudioPatch Mixer->2
01-10 14:12:20.747746   377   800 D AudioALSAStreamManager: +setParameters(), IOport = 21, keyValuePairs = routing=2
01-10 14:12:20.748010   377   800 D         : -updateDeviceInfoForVoiceWakeUp(), mIsUseHeadsetMic = 0, bIsUseHeadsetMic = 0
01-10 14:12:20.748117   377   800 W AudioALSAStreamManager: routingOutputDevice(), flag: 8, mPhoneCallSpeechOpen = 0, output_devices == current_output_devices(0x2), return
01-10 14:12:20.752107   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.753533  1130  1130 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 14:12:20.758895   524   798 D MtkAudioLoud: +close()
01-10 14:12:20.759105   524   798 D MtkAudioLoud: -close()
01-10 14:12:20.759183   524   798 E AudioFlinger_Threads: no wake lock to update, but system ready!
01-10 14:12:20.759907  1130  1130 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 14:12:20.770528   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.771508   524   701 D APM_AudioPolicyManager: stopOutput() output 13, stream 1, session 17
01-10 14:12:20.771690   524   701 V APM::AudioOutputDescriptor: changeRefCount() stream 1, count 0
01-10 14:12:20.781004  1311  1311 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 14:12:20.782303   943  1105 D AudioSystem: +setParameters(): A2dpSuspended=false 
01-10 14:12:20.783579   377   800 D AudioALSAHardware: +setParameters(): A2dpSuspended=false
01-10 14:12:20.784099   377   800 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "A2dpSuspended=false"
01-10 14:12:20.784184   377   800 D AudioALSAHardware: -setParameters(): A2dpSuspended=false 
01-10 14:12:20.785641   943  1105 D AudioService: setBluetoothScoOnInt : false, eventSource = resetBluetoothSco
01-10 14:12:20.785794  1311  1311 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 14:12:20.785869   943  1105 D AudioSystem: +setParameters(): BT_SCO=off 
01-10 14:12:20.786625   377   800 D AudioALSAHardware: +setParameters(): BT_SCO=off
01-10 14:12:20.787009   377   800 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "BT_SCO=off"
01-10 14:12:20.787081   377   800 D AudioALSAHardware: -setParameters(): BT_SCO=off 
01-10 14:12:20.788853   524   524 D APM_AudioPolicyManager: setForceUse() usage 0, config 0, mPhoneState 0
01-10 14:12:20.789445   524   524 D APM_AudioPolicyManager: setForceUse() usage 2, config 0, mPhoneState 0
01-10 14:12:20.793370  1550  1550 I PPL/PlatformManager: Bring service to foreground
01-10 14:12:20.793749   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.796735  1311  1311 I VvmSimStateTracker: android.intent.action.SIM_STATE_CHANGED
01-10 14:12:20.808583   543   610 I PPL/PPLAgent: checkCallerUidPermission(code:1,  uid:1000)
01-10 14:12:20.808754   543   610 I PPL/PPLAgent: OnTransact(1,16)
01-10 14:12:20.808772   543   610 I PPL/PPLAgent: readControlData enter
01-10 14:12:20.808796   543   610 W Parcel  : **** enforceInterface() expected 'PPLAgent' but read 'com.mediatek.internal.telephony.ppl.IPplAgent'
01-10 14:12:20.808831   543   610 I PPL/PPLAgent: enforceInterface fail
01-10 14:12:20.808853   543   610 I PPL/PPLAgent: readControlData enter
01-10 14:12:20.808938   543   610 D PPL/PPLAgent: open control data file error = No such file or directory
01-10 14:12:20.808963   543   610 I PPL/PPLAgent: readControlData exit
01-10 14:12:20.810036  1311  1311 D OP20RoamingSettingsReceiver: Subinfo Record Update: -2
01-10 14:12:20.810546  1550  1550 W PPL/ControlData: buildControlData: data is empty, return empty instance
01-10 14:12:20.810669  1550  1550 D PPL/PPLManager: mCache.status = 0
01-10 14:12:20.811067  1550  1550 D PPL/PPLService: onStartCommand(Intent { act=android.intent.action.SIM_STATE_CHANGED flg=0x5000010 cmp=com.mediatek.ppl/.PplService (has extras) })
01-10 14:12:20.811158  1550  1550 D PPL/PPLService: action is android.intent.action.SIM_STATE_CHANGED
01-10 14:12:20.811190  1550  1550 I PPL/PPLService: Privacy Protection Lock is disabled. Exit.
01-10 14:12:20.812275   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.814952  1311  1311 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 14:12:20.815972  1550  1550 D PPL/PlatformManager: Exec stopForeground with para true.
01-10 14:12:20.823168  1550  1550 I PPL/PlatformManager: Bring service to foreground
01-10 14:12:20.824650  1311  1311 I VvmSimStateTracker: android.intent.action.SIM_STATE_CHANGED
01-10 14:12:20.829273   543   610 I PPL/PPLAgent: checkCallerUidPermission(code:1,  uid:1000)
01-10 14:12:20.829331   543   610 I PPL/PPLAgent: OnTransact(1,16)
01-10 14:12:20.829343   543   610 I PPL/PPLAgent: readControlData enter
01-10 14:12:20.829363   543   610 W Parcel  : **** enforceInterface() expected 'PPLAgent' but read 'com.mediatek.internal.telephony.ppl.IPplAgent'
01-10 14:12:20.829435   543   610 I PPL/PPLAgent: enforceInterface fail
01-10 14:12:20.829454   543   610 I PPL/PPLAgent: readControlData enter
01-10 14:12:20.829496   543   610 D PPL/PPLAgent: open control data file error = No such file or directory
01-10 14:12:20.829511   543   610 I PPL/PPLAgent: readControlData exit
01-10 14:12:20.829483  1311  1311 D OP20RoamingSettingsReceiver: Subinfo Record Update: -2
01-10 14:12:20.829660  1550  1550 W PPL/ControlData: buildControlData: data is empty, return empty instance
01-10 14:12:20.829756  1550  1550 D PPL/PPLManager: mCache.status = 0
01-10 14:12:20.830029  1550  1550 D PPL/PPLService: onStartCommand(Intent { act=android.intent.action.SIM_STATE_CHANGED flg=0x5000010 cmp=com.mediatek.ppl/.PplService (has extras) })
01-10 14:12:20.830090  1550  1550 D PPL/PPLService: action is android.intent.action.SIM_STATE_CHANGED
01-10 14:12:20.830109  1550  1550 I PPL/PPLService: Privacy Protection Lock is disabled. Exit.
01-10 14:12:20.831541  1311  1311 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 14:12:20.833834  1550  1550 D PPL/PlatformManager: Exec stopForeground with para true.
01-10 14:12:20.835640   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.836876  1311  1311 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 14:12:20.843583  1311  1311 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 14:12:20.847508   523   562 D AAL     : 01-10 02:12:20.639 BL= 367,ESS= 256, 01-10 02:12:20.696 BL= 366,ESS= 256, 01-10 02:12:20.734 BL= 365,ESS= 256, 01-10 02:12:20.812 BL= 364,ESS= 256, 01-10 02:12:20.847 BL= 363,ESS= 256, 
01-10 14:12:20.853967   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.873065  1130  1130 D StatusBarKeyguardViewManager: show() is called.
01-10 14:12:20.877321   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.877370  1130  1130 D StatusBarKeyguardViewManager: reset() is called, mShowing = true ,mOccluded = falsehideBouncerWhenShowing = true
01-10 14:12:20.877422  1130  1130 D StatusBarKeyguardViewManager: showBouncerOrKeyguard() is called.
01-10 14:12:20.885568  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.885670  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.885703  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.886732  1130  1130 V KeyguardSecurityView: showPrimarySecurityScreen(securityMode=None)
01-10 14:12:20.886835  1130  1130 D VoiceWakeupManagerProxy: getInstance(...) is called.
01-10 14:12:20.886901  1130  1130 D KeyguardSecurityView: showSecurityScreen() - get oldview forInvalid, get newview forNone
01-10 14:12:20.887020  1130  1130 D KeyguardSecurityView: Before update, mCurrentSecuritySelection = NoneAfter update, mCurrentSecuritySelection = None
01-10 14:12:20.887205  1130  1130 D StatusBarKeyguardViewManager: setNeedsInput() - needsInput = false
01-10 14:12:20.888680  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.888751  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.888797  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.889736  1130  1130 D StatusBarKeyguardViewManager: needsFullscreenBouncer() is false,show "Notification Keyguard" view.
01-10 14:12:20.891999  1299  1321 I VT      : [VTC] notifyCallback
01-10 14:12:20.892266  1299  1321 D ImsVT Util: recordGet id = 0, size = 0
01-10 14:12:20.892381  1299  1321 I ImsVT   : [ID=0] [postEventFromNative]: 4014
01-10 14:12:20.892440  1299  1321 D ImsVT   : postEventFromNative : msg = SESSION_EVENT_GET_CAP
01-10 14:12:20.892477  1299  1321 D VT SRC  : [STC] [getAllCameraResolutions] Start
01-10 14:12:20.893178  1299  1321 I CameraManagerGlobal: Connecting to camera service
01-10 14:12:20.895543   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.896223  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.896343  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.896386  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.910683  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.910768  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.910798  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.912961  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.913038  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.913071  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.916648  1130  1130 D StatusBar: disable<e i a s b H R c s q >
01-10 14:12:20.917275  1299  1321 D VT SRC  : [STC] [getAllCameraResolutions] resolution size:1
01-10 14:12:20.917385  1299  1321 D VT SRC  : [STC] [getAllCameraResolutions] Finish
01-10 14:12:20.919124   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.919866  1299  1321 D ImsVT   : SIM state ABSENT
01-10 14:12:20.920070  1299  1321 I VT      : [JNI] Entering SetCameraParameters
01-10 14:12:20.920493   530   858 I VT      : [SRV] [OPERATION][ID=0] setCameraParameters
01-10 14:12:20.920614   530   858 I VT      : sim_id:0, major_sim_id:-1, sensorCnt:1
01-10 14:12:20.920640   530   858 I VT      : sensor[0]: id=0, width=4160, height=4160, degree=90, facing=1
01-10 14:12:20.920683   530   858 D [VT]ImsMa: [setSensorParameters]Line 946 [ID=0][enter]=======
01-10 14:12:20.920743   530   858 D [VT]ImsMa: [setSensorParameters]Line 965 [ID=0]we have 1 sensor mSensorInfos = 0xf059a090
01-10 14:12:20.920766   530   858 I [VT]ImsMa: [setSensorParameters]Line 979 tempLocal: 0xf059a090,index 0 W:4160, H:4160, D:90,F:1
01-10 14:12:20.920786   530   858 D [VT]ImsMa: [setSensorParameters]Line 1056 [ID=0]max w 4160,max h 4160, prefer 1
01-10 14:12:20.920855   530   858 I VT      : [SRV] getCurrentOperator start
01-10 14:12:20.921117   530   858 I VT      : [SRV] getCurrentOperator operatorPropetyString : persist.radio.sim.opid_-1
01-10 14:12:20.921143   530   858 I VT      : [SRV] getCurrentOperator multiPs : 1
01-10 14:12:20.921158   530   858 I VT      : [SRV] getCurrentOperator labOp : 0
01-10 14:12:20.921176   530   858 I VT      : [SRV] getCurrentOperator finish : SIM absent, return default op code = 8
01-10 14:12:20.921195   530   858 E VT      : [SRV]   [MAP OPERATION] [SIM ID=-1] setOperatorId (not found)
01-10 14:12:20.921224   530   858 D [VT]ImsMa: [getRtpRtcpCapability]Line 1196 [ID=0][enter]======= operatorID=8
01-10 14:12:20.921273   530   858 D [VT][RTP]IRTPController: getCapability,capArray 0xf0a3f858,pNumOfCap 0xf0a3f7eb,media type 0x1,
01-10 14:12:20.921320   530   858 D [VT][RTP]IRTPController: getCapability,create video capability
01-10 14:12:20.921376   530   858 D [VT][RTP]IRTPController: enable_avpf 2 operatorID=8 rtp_profile=3
01-10 14:12:20.921402   530   858 D [VT][RTP]IRTPController: 	 media(0x1),mime(0x1),profile(0x3),sampleRate(90000)
01-10 14:12:20.921414   530   858 D [VT][RTP]IRTPController: 	 ext_header_num:1
01-10 14:12:20.921428   530   858 D [VT][RTP]IRTPController: 	 ext_header[0]:id(7),uri(urn:3gpp:video-orientation)
01-10 14:12:20.921441   530   858 D [VT][RTP]IRTPController: 	 packetize_mode(3),rtcp_rsize(0)
01-10 14:12:20.921453   530   858 I [VT][RTP]IRTPController: getCapability,sizeof(1056)
01-10 14:12:20.921465   530   858 I [VT][RTP]IRTPController: getCapability,temp_size(128)
01-10 14:12:20.921478   530   858 I [VT][RTP]IRTPController: getCapability,3-id:4,3-param:5,sub:
01-10 14:12:20.921489   530   858 D [VT][RTP]IRTPController: 	 fb_num(6)
01-10 14:12:20.921505   530   858 D [VT][RTP]IRTPController: 	 Feedback[0]:fb_id(2),fb_param(1),fb_sub_param()
01-10 14:12:20.921521   530   858 D [VT][RTP]IRTPController: 	 Feedback[1]:fb_id(2),fb_param(2),fb_sub_param()
01-10 14:12:20.921538   530   858 D [VT][RTP]IRTPController: 	 Feedback[2]:fb_id(2),fb_param(3),fb_sub_param()
01-10 14:12:20.921554   530   858 D [VT][RTP]IRTPController: 	 Feedback[3]:fb_id(4),fb_param(5),fb_sub_param()
01-10 14:12:20.921570   530   858 D [VT][RTP]IRTPController: 	 Feedback[4]:fb_id(3),fb_param(1000),fb_sub_param()
01-10 14:12:20.921587   530   858 D [VT][RTP]IRTPController: 	 Feedback[5]:fb_id(4),fb_param(6),fb_sub_param()
01-10 14:12:20.921597   530   858 D [VT][RTP]IRTPController: getCapability 1 support HEVC
01-10 14:12:20.921620   530   858 I [VT][RTP]IRTPController: getCapability,cap array first item address:0xf059d000, cap num:2 rtp_profile(3)
01-10 14:12:20.921645   530   858 D [VT][MADebug]: [PrintRtpRtpCap]Line 46 ================RtpRtcpCap====================
01-10 14:12:20.921686   530   858 D [VT][MADebug]: [PrintRtpRtpCap]Line 47 media_type               1
01-10 14:12:20.921702   530   858 D [VT][MADebug]: [PrintRtpRtpCap]Line 48 mime_Type                4
01-10 14:12:20.921716   530   858 D [VT][MADebug]: [PrintRtpRtpCap]Line 49 rtp_profile              3
01-10 14:12:20.921731   530   858 D [VT][MADebug]: [PrintRtpRtpCap]Line 50 sample_rate              90000
01-10 14:12:20.921746   530   858 D [VT][MADebug]: [PrintRtpRtpCap]Line 51 packetize_mode           3
01-10 14:12:20.921760   530   858 D [VT][MADebug]: [PrintRtpRtpCap]Line 52 rtp_header_extension_num 1
01-10 14:12:20.921775   530   858 D [VT][MADebug]: [PrintRtpRtpCap]Line 53 rtcp_fb_param_num        6
01-10 14:12:20.921789   530   858 D [VT]ImsMa: [getRtpRtcpCapability]Line 1204 [ID=0][exit]=======
01-10 14:12:20.921833   530   858 I [VT]VcodecCap: [getSensorLevel] resolution = 4160 x 4160, level = 25
01-10 14:12:20.921942   530   858 I [VT]VcodecCap: [getVideoProperty] f:1,P:0,L:0,F:0,B:0,I:0
01-10 14:12:20.921962   530   858 I [VT]VcodecCap: pthread_mutex_init MediaProfileListLock
01-10 14:12:20.921996   530   858 I [VT]VcodecCap: createMediaProfile(): /system/vendor/etc/vilte/viLTE_media_profiles_op8.xml
01-10 14:12:20.922112  1130  1130 D NetworkController: isEmergencyOnly No sims 
01-10 14:12:20.922411   530   858 I [VT]VcodecCap: createH264DefaultMediaProfile() default profile table(op8), count = 21
01-10 14:12:20.922447   530   858 I [VT]VcodecCap: createHEVCDefaultMediaProfile() default profile table(op8)
01-10 14:12:20.922465   530   858 I [VT]VcodecCap: createH264QualtiyMediaProfile: default setting
01-10 14:12:20.922492   530   858 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_3, 640x480, 30 fps, 416 kbps, i period: 1)
01-10 14:12:20.922526   530   858 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_1_2, 320x240, 15 fps, 416 kbps, i period: 1)
01-10 14:12:20.922556   530   858 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_1_2, 320x240, 15 fps, 416 kbps, i period: 1)
01-10 14:12:20.922589   530   858 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_1_1, 320x240, 10 fps, 270 kbps, i period: 1)
01-10 14:12:20.922602   530   858 I [VT]VcodecCap: setFormat(1)
01-10 14:12:20.922567  1130  1130 D StatusBar: disable<e i a s b H R c s q >
01-10 14:12:20.922655   530   858 I [VT]VcodecCap: [getSensorLevel] resolution = 4160 x 4160, level = 25
01-10 14:12:20.922690   530   858 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=6(VIDEO_LEVEL_1_2), max_level=6(VIDEO_LEVEL_1_2)
01-10 14:12:20.923058   530   858 E libc    : Access denied finding property "mtk.vdec.log"
01-10 14:12:20.923444   530   858 I         : isVTService(/system/bin/vtservice)
01-10 14:12:20.923624   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:20.923630  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.923784  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.923833  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.923828   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.924451  1130  1130 V KeyguardSecurityView: showPrimarySecurityScreen(securityMode=None)
01-10 14:12:20.925696   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:20.926482  1130  1130 D StatusBarKeyguardViewManager: updateStates() - showing = true, mLastShowing = false
01-10 14:12:20.926482  1130  1130 D StatusBarKeyguardViewManager: updateStates() - occluded = falsemLastOccluded = false
01-10 14:12:20.926482  1130  1130 D StatusBarKeyguardViewManager: updateStates() - bouncerShowing = false, mLastBouncerShowing = false
01-10 14:12:20.926482  1130  1130 D StatusBarKeyguardViewManager: updateStates() - mFirstUpdate = true
01-10 14:12:20.926565  1130  1130 D StatusBarKeyguardViewManager: updateStates() - setBouncerShowing(false)
01-10 14:12:20.926752  1130  1130 D StatusBar: disable<e i a s b H R c s q >
01-10 14:12:20.928544   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:20.928975   530   858 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 14:12:20.929885   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:20.929980   530   858 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00c8d8d41e14d3505020207844237)
01-10 14:12:20.930250   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:20.930878   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.932352   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:20.932415   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:20.932923   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:20.933016   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.934416   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:20.934635  1130  1130 D KeyguardViewMediator: handle show call mKeyguardDisplayManager.show()
01-10 14:12:20.936574   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:20.936857   530   858 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 14:12:20.937340   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.937626   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:20.937721   530   858 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 14:12:20.938066   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:20.938736   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.940280   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:20.940352   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:20.940628   530   858 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00c, max_recv_level=12,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LADI2NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 14:12:20.940700   530   858 D [VT][MADebug]: [printCodecParam]Line 69 ================printCodecParam====================
01-10 14:12:20.940733   530   858 D [VT][MADebug]: [printCodecParam]Line 73 format   =  VIDEO_H264
01-10 14:12:20.940747   530   858 D [VT][MADebug]: [printCodecParam]Line 74 Width   =  240
01-10 14:12:20.940765   530   858 D [VT][MADebug]: [printCodecParam]Line 75 height   =  320
01-10 14:12:20.940780   530   858 D [VT][MADebug]: [printCodecParam]Line 76 frame-rate   =  15
01-10 14:12:20.940797   530   858 D [VT][MADebug]: [printH264CodecParam]Line 12 profile_level_id               =0x42c00c
01-10 14:12:20.940813   530   858 D [VT][MADebug]: [printH264CodecParam]Line 13 max_recv_level                 =12
01-10 14:12:20.940829   530   858 D [VT][MADebug]: [printH264CodecParam]Line 15 sprop_parameter_sets       =Z0LADI2NQeFNNQUCAgeEQjc=,aMpDyA==
01-10 14:12:20.940845   530   858 D [VT][MADebug]: [printH264CodecParam]Line 16 sprop_level_parameter_sets =
01-10 14:12:20.940861   530   858 D [VT][MADebug]: [printH264CodecParam]Line 26 video_b_as                     =0
01-10 14:12:20.940877   530   858 D [VT][MADebug]: [printH264CodecParam]Line 27 packetization_mode         =1
01-10 14:12:20.940896   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] codec_num = 1
01-10 14:12:20.940936   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] Save default local size W=320, H=240)
01-10 14:12:20.940957   530   858 D [VT]ImsMa: [getCodecParameterSets]Line 1145 [ID=0][enter]===informat 1 quality=0x1====
01-10 14:12:20.940997   530   858 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1 opID 8
01-10 14:12:20.941039   530   858 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1, vprofile:VIDEO_PROFILE_BASELINE, vlevel:VIDEO_LEVEL_3
01-10 14:12:20.941125   530   858 D [VT]ImsMa: [getCodecParameterSets]Line 1166 [ID=0] Numbers 7 
01-10 14:12:20.941168   530   858 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1 opID 8
01-10 14:12:20.941207   530   858 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1, vprofile:VIDEO_PROFILE_BASELINE, vlevel:VIDEO_LEVEL_3
01-10 14:12:20.941239   530   858 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=5(VIDEO_LEVEL_1_1), max_level=5(VIDEO_LEVEL_1_1)
01-10 14:12:20.941638   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:20.941756   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.943177   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:20.945395   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:20.945702   530   858 I VDO_LOG : Profile:66, Level:11, wfd=0, vilte=0, bitrate=270, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 14:12:20.946603   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:20.946706   530   858 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00b8d8d41e14d3505020207844237)
01-10 14:12:20.947034   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:20.947731   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.918000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:51): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_vdec_prop:s0" dev="tmpfs" ino=11722 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_vdec_prop:s0 tclass=file permissive=0
01-10 14:12:20.926000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:52): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:20.934000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:53): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:20.948839  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.948922  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.948958  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.951551  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 14:12:20.951699  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:20.951757  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:20.942000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:54): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:20.953050  1130  1284 I FlashlightTile: flashLightEnable,mState.value:----false,false
01-10 14:12:20.953739  1130  1130 D StatusBar: disable<e i a s b H R c s q >
01-10 14:12:20.954153  1130  1130 D StatusBar: disable<e i a s b H R c s q >
01-10 14:12:20.957153   943  1075 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 14:12:20.958772  1130  1130 I Choreographer: Skipped 45 frames!  The application may be doing too much work on its main thread.
01-10 14:12:20.960525   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:20.960598   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:20.960810   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:20.961096   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:20.962223   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.963733   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:20.966590   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:20.966853   530   858 I VDO_LOG : Profile:66, Level:11, wfd=0, vilte=0, bitrate=270, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 14:12:20.967581   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:20.967674   530   858 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 14:12:20.967900   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:20.966000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:55): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:20.968496   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.969978   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:20.970051   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:20.970256   530   858 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00b, max_recv_level=11,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAC42NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 14:12:20.970315   530   858 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=6(VIDEO_LEVEL_1_2), max_level=6(VIDEO_LEVEL_1_2)
01-10 14:12:20.970642   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:20.971806   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.973163  1130  1137 I zygote64: Do partial code cache collection, code=53KB, data=49KB
01-10 14:12:20.973233   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:20.973495  1130  1137 I zygote64: After code cache collection, code=53KB, data=49KB
01-10 14:12:20.973539  1130  1137 I zygote64: Increasing code cache capacity to 256KB
01-10 14:12:20.976063   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:20.976327   530   858 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 14:12:20.977005   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:20.977110   530   858 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00c8d8d41e14d3505020207844237)
01-10 14:12:20.977404   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:20.978023   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.979533   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:20.979595   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:20.979935   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:20.980094   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:20.981294   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.982882   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:20.986211   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:20.986434   530   858 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 14:12:20.974000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:56): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:20.987100   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:20.987225   530   858 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 14:12:20.982000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:57): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:20.987670   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:20.988430   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.990010   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:20.990080   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:20.990316   530   858 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00c, max_recv_level=12,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LADI2NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 14:12:20.990391   530   858 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=7(VIDEO_LEVEL_1_3), max_level=7(VIDEO_LEVEL_1_3)
01-10 14:12:20.990756   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:20.992043   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.993563   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:20.996365   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:20.996598   530   858 I VDO_LOG : Profile:66, Level:13, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 14:12:20.997190   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:20.997294   530   858 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00d8d8d41e14d3505020207844237)
01-10 14:12:20.997536   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:20.994000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:58): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:20.998032   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:20.999476   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:20.999546   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:21.000024   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:21.001144   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.002596   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:21.002706   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:21.005401   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:21.005635   530   858 I VDO_LOG : Profile:66, Level:13, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 14:12:21.006262   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:21.006352   530   858 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 14:12:21.006620   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:21.002000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:59): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:21.007183   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.008675   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:21.008751   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:21.008950   530   858 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00d, max_recv_level=13,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LADY2NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 14:12:21.009015   530   858 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=8(VIDEO_LEVEL_2), max_level=8(VIDEO_LEVEL_2)
01-10 14:12:21.009349   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:21.010504   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.011993   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:21.014673   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:21.014920   530   858 I VDO_LOG : Profile:66, Level:20, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=288, Height=352, BufW=288, BufH=352, NonRefP=0, f:3
01-10 14:12:21.015640   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:21.015730   530   858 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c0148d8d40905b4d41408081e1108dc0)
01-10 14:12:21.015961   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:21.014000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:60): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:21.016461   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.017903   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:21.017994   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:21.018486   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:21.019643   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.021094   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:21.021243   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:21.024083   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:21.024336   530   858 I VDO_LOG : Profile:66, Level:20, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=288, Height=352, BufW=288, BufH=352, NonRefP=0, f:3
01-10 14:12:21.025088   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:21.025185   530   858 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 14:12:21.025290   398   398 I BufferQueueConsumer: [StatusBar#0](this:0x7f7b6e2800,id:3,api:1,p:1130,c:398) setDefaultBufferSize: width=720 height=1280
01-10 14:12:21.025529   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:21.022000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:61): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:21.026221   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.027740   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:21.027804   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:21.028015   530   858 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c014, max_recv_level=20,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAFI2NQJBbTUFAgIHhEI3A,aMpDyA==,           sprop_level_parameter_sets=, framesize=288-352
01-10 14:12:21.028082   530   858 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=10(VIDEO_LEVEL_2_1), max_level=10(VIDEO_LEVEL_2_1)
01-10 14:12:21.028496   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:21.029689   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.030727  1130  1390 D Surface : Surface::disconnect(this=0x74a7dab000,api=1)
01-10 14:12:21.031076   398   420 I BufferQueueProducer: [StatusBar#0](this:0x7f7b6e2800,id:3,api:1,p:1130,c:398) disconnect(P): api 1
01-10 14:12:21.031285   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:21.031692   398   420 I BufferQueueConsumer: [StatusBar#0](this:0x7f7b6e2800,id:3,api:1,p:-1,c:398) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 14:12:21.032093  1130  1390 D Surface : Surface::connect(this=0x74a7dab000,api=1)
01-10 14:12:21.032746   398   421 I BufferQueueProducer: [StatusBar#0](this:0x7f7b6e2800,id:3,api:1,p:1130,c:398) connect(P): api=1 producer=(1130:com.android.systemui) producerControlledByApp=true
01-10 14:12:21.033903  1130  1390 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 14:12:21.034418   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:21.034654   530   858 I VDO_LOG : Profile:66, Level:21, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=320, Height=480, BufW=320, BufH=480, NonRefP=0, f:3
01-10 14:12:21.035319   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:21.035497   530   858 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c0158d8d40a07b4d41408081e1108dc0)
01-10 14:12:21.035779   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:21.034000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:62): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:21.036371   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.037845   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:21.037922   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:21.038387   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:21.039556   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.041024   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:21.043771   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:21.044000   530   858 I VDO_LOG : Profile:66, Level:21, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=320, Height=480, BufW=320, BufH=480, NonRefP=0, f:3
01-10 14:12:21.044678   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:21.044770   530   858 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 14:12:21.044818   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:21.045015   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:21.045718   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.042000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:63): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:21.046072  1130  1130 D StatusBar: disable<e i a s b H R c s q >
01-10 14:12:21.047178   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:21.047244   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:21.047462  1130  1130 W View    : requestLayout() improperly called by com.android.keyguard.CarrierText{60bd9e9 V.ED..... ..S...ID 32,0-452,80 #7f0a013f app:id/keyguard_carrier_text} during layout: running second layout pass
01-10 14:12:21.047500   530   858 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c015, max_recv_level=21,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAFY2NQKB7TUFAgIHhEI3A,aMpDyA==,           sprop_level_parameter_sets=, framesize=320-480
01-10 14:12:21.047571   530   858 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=12(VIDEO_LEVEL_2_2), max_level=12(VIDEO_LEVEL_2_2)
01-10 14:12:21.047899   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:21.049036   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.050474   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:21.053258   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:21.053489   530   858 I VDO_LOG : Profile:66, Level:22, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 14:12:21.054339   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:21.054450   530   858 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c0168d8d40f028d35050202078442370)
01-10 14:12:21.050000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:64): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:21.054709   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:21.055381   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.056936   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:21.057003   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:21.057494   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:21.058627   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.060107   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:21.063001   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:21.063246   530   858 I VDO_LOG : Profile:66, Level:22, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 14:12:21.063333   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:21.064087   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:21.064200   530   858 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 14:12:21.062000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:65): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:21.064557   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:21.065520   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.067220   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:21.067319   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:21.067653   530   858 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c016, max_recv_level=22,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAFo2NQPAo01BQICB4RCNw,aMpDyA==,           sprop_level_parameter_sets=, framesize=480-640
01-10 14:12:21.067761   530   858 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=13(VIDEO_LEVEL_3), max_level=13(VIDEO_LEVEL_3)
01-10 14:12:21.068194   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:21.069423   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.071005   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:21.074030   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:21.074310   530   858 I VDO_LOG : Profile:66, Level:30, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 14:12:21.075066   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:21.075227   530   858 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c01e8d8d40f028d35050202078442370)
01-10 14:12:21.070000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:66): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:21.075639   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:21.076380   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.077999   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:21.078075   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:21.078599   530   858 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 14:12:21.079823   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.081421   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 14:12:21.084518   530   858 I VDO_LOG : [tid: 858][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 14:12:21.084783   530   858 I VDO_LOG : Profile:66, Level:30, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 14:12:21.085397   530   858 I VDO_LOG : [tid: 858][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 14:12:21.085468   530   858 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 14:12:21.085771   530   858 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 14:12:21.082000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:67): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=11724 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 14:12:21.086461   530   858 I BWC     : emi_ddr_type_string_get is no longer available
01-10 14:12:21.086720   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:21.088042   530   858 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 14:12:21.087987   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:21.088101   530   858 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 14:12:21.088343   530   858 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c01e, max_recv_level=30,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAHo2NQPAo01BQICB4RCNw,aMpDyA==,           sprop_level_parameter_sets=, framesize=480-640
01-10 14:12:21.088411   530   858 D [VT]ImsMa: [getCodecParameterSets]Line 1187 [ID=0][exit]===Numbers 7 ===mGetVideoCodecLevelFmtpPtr 0xf05c8000=
01-10 14:12:21.088451   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] (H264) levelCapNumbers = 7 (need <= 32)
01-10 14:12:21.088494   530   858 D [VT]ImsMa: [getCodecParameterSets]Line 1145 [ID=0][enter]===informat 4 quality=0x1====
01-10 14:12:21.088527   530   858 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1 opID 8
01-10 14:12:21.088566   530   858 D [VT]ImsMa: [getCodecParameterSets]Line 1166 [ID=0] Numbers 0 
01-10 14:12:21.088603   530   858 D [VT]ImsMa: [getCodecParameterSets]Line 1187 [ID=0][exit]===Numbers 0 ===mGetVideoCodecLevelFmtpPtr 0x0=
01-10 14:12:21.088619   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] (H265) levelCapNumbers = 0 (need <= 32)
01-10 14:12:21.088652   530   858 D [VT]ImsMa: [getCodecBitrateTable]Line 1108 [ID=0][enter]operatorID 8=======
01-10 14:12:21.088669   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:21.088679   530   858 D [VT]ImsMa: [getCodecBitrateTable]Line 1111 [ID=0]tableCnt 21
01-10 14:12:21.088734   530   858 D [VT]ImsMa: [getCodecBitrateTable]Line 1128 [ID=0]tableCnt 21,mGetCodecBitrateTablePtr0xf05e1000
01-10 14:12:21.088752   530   858 D [VT]ImsMa: [getCodecBitrateTable]Line 1135 [ID=0][exit]count 21=mGetCodecBitrateTablePtr 0xf05e1000======
01-10 14:12:21.088766   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] bit rate table Cnt     = 21 (need <= 32)
01-10 14:12:21.088795   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] find match type = 1, count = 0
01-10 14:12:21.088812   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] extmap_num             = 1
01-10 14:12:21.088828   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] ext_id                 = 7
01-10 14:12:21.088840   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] direction              = 3
01-10 14:12:21.088854   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] ext_uri                = urn:3gpp:video-orientation
01-10 14:12:21.088865   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] cap.media_type         = 1
01-10 14:12:21.088878   530   858 I VT      : [SRV] [vt_rtp_codec_2_ua] cap.mime_Type          = 1
01-10 14:12:21.088899   530   858 I VT      : [SRV] [VT THREAD] VT_Send start, type = 101506, len:60076
01-10 14:12:21.088862   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:21.088862   812   812 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@0#5493
01-10 14:12:21.088862   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=24, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:21.088862   812   812 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@0#5518
01-10 14:12:21.088862   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:21.088932   530   858 I VT      : [SRV] [VT THREAD] VT_Send before type
01-10 14:12:21.088992   530   858 I VT      : [SRV] [VT THREAD] VT_Send before len
01-10 14:12:21.089006   530   858 I VT      : [SRV] [VT THREAD] VT_Send before data
01-10 14:12:21.089119   530   858 I VT      : [SRV] [VT THREAD] VT_Send end
01-10 14:12:21.089328  1299  1321 I VT      : [JNI] Leaving SetCameraParameters
01-10 14:12:21.089430   376   864 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] type : 101506
01-10 14:12:21.089644   376   864 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] len : 60076
01-10 14:12:21.089754   376   864 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] readblock ret: 1
01-10 14:12:21.089668   811   853 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 14:12:21.089775   376   864 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] write to IMCB
01-10 14:12:21.089811   811   853 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 14:12:21.089889   376   864 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] read from VTS
01-10 14:12:21.089876   811   853 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 14:12:21.089403   811   851 I VoLTE UA: Update acct[0] lte_attach_type = 1 (module/volte//volte_ua/src/call/acct.c:5557)
01-10 14:12:21.090452   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100034(0x000186C2), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:21.090452   812   812 I VoLTE IMCB: ENTER imcb_imc_rat_change_ind_handler()@0#5313
01-10 14:12:21.090452   812   812 I VoLTE IMCB: from rat type = 0, to ua rat = 8 imcb_rat_conv_to_ua()@0#124
01-10 14:12:21.090452   812   812 I VoLTE IMCB: from rat type = 1, to ua rat = 9 @0#124
01-10 14:12:21.090452   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10013(0x0000271D), len=192, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:21.090452   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:21.090549   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:21.091211   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100034(0x000186C2), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:21.091211   812   812 I VoLTE IMCB: ENTER imcb_imc_rat_change_ind_handler()@0#5313
01-10 14:12:21.091211   812   812 I VoLTE IMCB: from rat type = 0, to ua rat = 8 imcb_rat_conv_to_ua()@0#124
01-10 14:12:21.091211   812   812 I VoLTE IMCB: from rat type = 1, to ua rat = 9 @0#124
01-10 14:12:21.091211   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10013(0x0000271D), len=192, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:21.091211   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:21.091284  1130  1390 D HWUIExtension: MTKProgramCache.generateProgram: 1142461300744
01-10 14:12:21.095701   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=101506(0x00018C82), dst=VT1[7], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:21.095701   812   812 I VoLTE IMCB: ENTER imsvt_imcb_get_cap_rsp_handler()@0#6005
01-10 14:12:21.095701   812   812 I VoLTE IMCB: ENTER imcb_send_imc_vt_cap_query_rsp()@0#3157
01-10 14:12:21.095701   812   812 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:21.095701   812   812 I VoLTE IMCB: ENTER imcb_send_ua_vt_cap_setting()@0#3490
01-10 14:12:21.095701   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10023(0x00002727), len=60072, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:21.095701   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:21.104685  1130  1390 D HWUIExtension: MTKProgramCache.generateProgram: 562984313159683
01-10 14:12:21.105341   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:21.105368  1130  1390 D HWUIExtension: createProgram 0x0002000800000003, binary 0x75438793ac, length 5140, format 36705 within 556ns
01-10 14:12:21.107610  1130  1390 D HWUIExtension: MTKProgramCache.generateProgram: 562949953421313
01-10 14:12:21.108274  1130  1390 D HWUIExtension: createProgram 0x0002000000000001, binary 0x75438746c8, length 4944, format 36705 within 582ns
01-10 14:12:21.109855  1130  1390 D HWUIExtension: MTKProgramCache.generateProgram: 240518168576
01-10 14:12:21.111235  1130  1390 D HWUIExtension: createProgram 0x0000003800000000, binary 0x75438733fc, length 4812, format 36705 within 1281ns
01-10 14:12:21.111357   523   562 D AAL     : 01-10 02:12:20.903 BL= 362,ESS= 256, 01-10 02:12:20.941 BL= 361,ESS= 256, 01-10 02:12:21.016 BL= 360,ESS= 256, 01-10 02:12:21.055 BL= 359,ESS= 256, 01-10 02:12:21.111 BL= 358,ESS= 256, 
01-10 14:12:21.111995  1130  1390 D HWUIExtension: MTKProgramCache.generateProgram: 562984322596929
01-10 14:12:21.115069  1130  1390 D HWUIExtension: MTKProgramCache.generateProgram: 562984313159681
01-10 14:12:21.115963  1130  1390 D HWUIExtension: createProgram 0x0002000800000001, binary 0x754387cc84, length 5140, format 36705 within 766ns
01-10 14:12:21.121228  1311  1328 E MtkPhoneIntfMgrEx: [setLocationInfoWifiMac] pheonId:0
01-10 14:12:21.126304  1130  1130 D KeyguardUpdateMonitor: Phone# 0, state = NOT_READY
01-10 14:12:21.128421   484   501 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 14:12:21.132721   943   943 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 14:12:21.134098  1130  1130 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 14:12:21.135279   943  1000 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 14:12:21.136845   812   868 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 14:12:21.137574   812   812 I VoLTE IMCB: {{{{[process_msg] msg_id=100135(0x00018727), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 14:12:21.137574   812   812 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10024(0x00002728), len=2044, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 14:12:21.137574   812   812 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 14:12:21.140516  1349  1349 D SimSelectService: onReceive action=android.intent.action.ACTION_SUBINFO_RECORD_UPDATED
01-10 14:12:21.140541  1130  1284 D NetworkController: subscriptions is null
01-10 14:12:21.140557  1130  1130 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = NOT_READY
01-10 14:12:21.140603  1130  1130 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 14:12:21.140636  1130  1130 D KeyguardSecurityModel: mode current =None
01-10 14:12:21.140668  1349  1349 D UtilsExt: autoSanity: false buildType: user
01-10 14:12:21.140696  1130  1284 D NetworkController: signal callbacks count not equals, reset subInfo, old = 0, new = 1
01-10 14:12:21.140749  1349  1349 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 14:12:21.142488  1349  1349 D SimSelectService: sub info update, type = 4, subs = null
01-10 14:12:21.142606  1349  1349 D SimSelectService: extra value no change, return
01-10 14:12:21.145216  1130  1284 D WifiSignalController: mCurrentState.inetCondition = 0
01-10 14:12:21.145945  1130  1284 D NetworkController: isEmergencyOnly No sims 
01-10 14:12:21.146351  1130  1284 D NetworkController: updateMobileControllers detectedType: 4
01-10 14:12:21.146532   484   501 D skia    : SkJpegCodec::onGetPixels -
01-10 14:12:21.146862  1130  1130 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 14:12:21.148498   943   976 I WifiService: setCountryCode uid=1001
01-10 14:12:21.148714   943   976 D WifiCountryCode: Receive set country code request: cn
01-10 14:12:21.161028   398   420 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) queueBuffer: fps=24.08 dur=1038.08 max=45.54 min=37.40
01-10 14:12:21.161746  1130  1130 D Surface : Surface::connect(this=0x74a7dbc000,api=1)
01-10 14:12:21.162014   398   420 I BufferQueueProducer: [com.android.systemui.ImageWallpaper#0](this:0x7f74424800,id:4,api:1,p:1130,c:398) connect(P): api=1 producer=(1130:com.android.systemui) producerControlledByApp=true
01-10 14:12:21.162811  1130  1130 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 14:12:21.163624  1130  1130 D ImageWallpaper: inside loadTexture
01-10 14:12:21.171822   484   501 D Surface : Surface::disconnect(this=0x7997440000,api=1)
01-10 14:12:21.172376   398   420 I BufferQueueProducer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:484,c:398) disconnect(P): api 1
01-10 14:12:21.172498   398   420 I BufferQueueConsumer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:-1,c:398) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 14:12:21.176040   398   398 I BufferQueueConsumer: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:-1,c:-1) disconnect(C)
01-10 14:12:21.178445   398   398 I BufferQueue: [BootAnimation#0](this:0x7f74423000,id:1,api:1,p:-1,c:-1) ~BufferQueueCore
01-10 14:12:21.179316   484   484 I         : [MALI] @eglp_check_display_valid_and_initialized_and_retain: MALI_EGL_DISPLAY_INITIALIZED != dpy->state (EGL_NOT_INITIALIZED)
01-10 14:12:21.183312  1130  1130 D Surface : Surface::disconnect(this=0x74a7dbc000,api=1)
01-10 14:12:21.183780   398   420 I BufferQueueProducer: [com.android.systemui.ImageWallpaper#0](this:0x7f74424800,id:4,api:1,p:1130,c:398) disconnect(P): api 1
01-10 14:12:21.183964   398   420 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x7f74424800,id:4,api:1,p:-1,c:398) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 14:12:21.189959  1130  1130 D StatusBar: onNotificationPosted: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 14:12:21.191202   943  1272 D AlarmManagerService: Kernel timezone updated to -480 minutes west of GMT
01-10 14:12:21.191908  1130  1130 D StatusBar: onNotificationRemoved: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 14:12:21.192829   943   943 D NetworkTimeUpdateService: Received android.intent.action.NETWORK_SET_TIMEZONE
01-10 14:12:21.192906   943   943 D NetworkTimeUpdateService: mNitzReceiver Receive ACTION_NETWORK_SET_TIMEZONE
01-10 14:12:21.194548   548   882 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 14:12:21.198250  1130  1130 D StatusBar: onNotificationPosted: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 14:12:21.199163  1130  1130 D StatusBar: onNotificationRemoved: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
