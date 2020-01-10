----- timezone:GMT
01-10 16:57:09.266905   349   349 W auditd  : type=2000 audit(0.0:1): initialized
01-10 16:57:12.134000   349   349 I auditd  : type=1403 audit(0.0:2): policy loaded auid=4294967295 ses=4294967295
01-10 16:57:12.138000   349   349 W auditd  : type=1404 audit(0.0:3): enforcing=1 old_enforcing=0 auid=4294967295 ses=4294967295
01-10 16:57:13.810000   343   343 W e2fsck  : type=1400 audit(0.0:4): avc: denied { read } for name="mmcblk0p7" dev="tmpfs" ino=9517 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
01-10 16:57:13.810000   343   343 W e2fsck  : type=1400 audit(0.0:5): avc: denied { read write } for name="mmcblk0p7" dev="tmpfs" ino=9517 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
01-10 16:57:13.993438   350   350 I SELinux : SELinux: Loaded service_contexts from:
01-10 16:57:13.998946   350   350 I SELinux :     /system/etc/selinux/plat_service_contexts
01-10 16:57:14.056850   352   352 I SELinux : SELinux: Loaded service_contexts from:
01-10 16:57:14.058106   352   352 I SELinux :     /vendor/etc/selinux/vndservice_contexts
01-10 16:57:14.105534   361   361 I AEE_AED : Built Mar 23 2018 13:42:39
01-10 16:57:14.109012   361   361 I AEE_AED : socket server: android:aee_aed
01-10 16:57:14.113821   361   361 D AEE_AED : aed_get_force_config: -100000
01-10 16:57:14.118000   364   364 W teed    : type=1400 audit(0.0:6): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.118000   364   364 I chatty  : uid=1000(system) /vendor/bin/teed identical 2 lines
01-10 16:57:14.118000   364   364 W teed    : type=1400 audit(0.0:9): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.118000   364   364 W teed    : type=1400 audit(0.0:10): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.118000   364   364 W teed    : type=1400 audit(0.0:11): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.119374   361   361 I AEE_AED : aed_update_coredump_mode: persist.aee.core.dump disable
01-10 16:57:14.120017   364   364 D tkcore-teec: teed-version: 2.1p19
01-10 16:57:14.120017   364   364 D tkcore-teec: 
01-10 16:57:14.120017   364   364 D tkcore-teec: 
01-10 16:57:14.120219   364   364 D tkcore-teec: tz dev path: /dev/tkcoredrv
01-10 16:57:14.120258   364   364 D tkcore-teec: sdrpmb dev path: /dev/block/platform/bootdevice/by-name/sdrpmb
01-10 16:57:14.120288   364   364 D tkcore-teec: system ta path: /vendor/app/t6
01-10 16:57:14.120318   364   364 D tkcore-teec: sp ta path: /data/tee/t6
01-10 16:57:14.120346   364   364 D tkcore-teec: prot path: /vendor/protect_f/tee
01-10 16:57:14.124837   361   361 I AEE_AED : aed_update_coredump_mode: persist.aee.core.direct disable
01-10 16:57:14.128443   361   361 I AEE_AED : AED config
01-10 16:57:14.128443   361   361 I AEE_AED :   mode '4'
01-10 16:57:14.128443   361   361 I AEE_AED :   exp level '0
01-10 16:57:14.128443   361   361 I AEE_AED :   dal enable '0'
01-10 16:57:14.128443   361   361 I AEE_AED :   db count '4'
01-10 16:57:14.128443   361   361 I AEE_AED :   fatal db count '4'
01-10 16:57:14.128443   361   361 I AEE_AED :  db storage '2'
01-10 16:57:14.128443   361   361 I AEE_AED :   SMP Info => 1
01-10 16:57:14.128557   361   361 E AEE_AED : fail to open prebuild packages list: No such file or directory
01-10 16:57:14.131250   351   351 E hwservicemanager: BINDER_SET_INHERIT_FIFO_PRIO failed with error -1
01-10 16:57:14.134000   364   364 W tkearlyinit: type=1400 audit(0.0:12): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.134460   363   363 I AEE_AEDV: Built Mar 23 2018 13:42:46
01-10 16:57:14.135568   363   363 I AEE_AEDV: socket server: android:aee_aedv
01-10 16:57:14.136868   363   363 D AEE_AEDV: aed_get_force_config: -100000
01-10 16:57:14.137174   364   364 D tkcore-teec: SDRPMB: switching active to 0
01-10 16:57:14.137477   363   363 I AEE_AEDV: AED config
01-10 16:57:14.137477   363   363 I AEE_AEDV:   mode '4'
01-10 16:57:14.137477   363   363 I AEE_AEDV:   exp level '0
01-10 16:57:14.137477   363   363 I AEE_AEDV:   dal enable '0'
01-10 16:57:14.137477   363   363 I AEE_AEDV:   db count '4'
01-10 16:57:14.137477   363   363 I AEE_AEDV:   fatal db count '4'
01-10 16:57:14.137477   363   363 I AEE_AEDV:  db storage '2'
01-10 16:57:14.137477   363   363 I AEE_AEDV:   SMP Info => 1
01-10 16:57:14.137521   363   363 E AEE_AEDV: fail to open prebuild packages list: No such file or directory
01-10 16:57:14.154000   364   364 W tkearlyinit: type=1400 audit(0.0:13): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.158000   364   364 W teed    : type=1400 audit(0.0:14): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.158000   364   364 W teed    : type=1400 audit(0.0:15): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.158000   364   364 W teed    : type=1400 audit(0.0:16): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.158000   364   364 W teed    : type=1400 audit(0.0:17): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.158000   364   364 W teed    : type=1400 audit(0.0:18): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.158000   364   364 W teed    : type=1400 audit(0.0:19): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.158000   364   364 W tkuinit : type=1400 audit(0.0:20): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.158000   364   364 W tkuinit : type=1400 audit(0.0:21): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.159202   364   364 D tkcore-teec: SDRPMB: ready active_id=0 start_sect=8225 nr_sects=32768
01-10 16:57:14.160162   364   370 D tkcore-teec: <log_teeos> thread started
01-10 16:57:14.160376   364   364 D tkcore-teec: TEED-sub: created with PID<371>
01-10 16:57:14.160376   364   364 D tkcore-teec: 
01-10 16:57:14.160511   364   364 D tkcore-teec: tee_supp_fs_init bad statfs(/data/tee/) = -1
01-10 16:57:14.160511   364   364 D tkcore-teec: 
01-10 16:57:14.160572   364   370 D tkcore-teec: Wait for /data to be mounted.
01-10 16:57:14.160603   364   364 D tkcore-teec: error tee_supp_fs_init. Delay it.
01-10 16:57:14.160759   364   364 D tkcore-teec: teed listening on /dev/tkcoredrv
01-10 16:57:14.160776   364   369 D tkcore-teec: tee_userinit enter
01-10 16:57:14.160938   364   369 D tkcore-teec: DEVICE BRAND Datalogic MODEL MEMOR 10 PLATFORM mt6763
01-10 16:57:14.160938   364   369 D tkcore-teec: 
01-10 16:57:14.166740   365   365 D vndksupport: Loading /vendor/lib64/hw/android.hardware.keymaster@3.0-impl.so from current namespace instead of sphal namespace.
01-10 16:57:14.198603   365   365 I android.hardware.keymaster@3.0-impl: Fetching keymaster device name default
01-10 16:57:14.199066   365   365 D vndksupport: Loading /vendor/lib64/hw/keystore.mt6763.so from current namespace instead of sphal namespace.
01-10 16:57:14.216506   365   365 I android.hardware.keymaster@3.0-impl: Found keymaster2 module Keymaster TrustKernel HAL, version 200
01-10 16:57:14.222000   364   364 W teed    : type=1400 audit(0.0:22): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.222000   364   364 W teed    : type=1400 audit(0.0:23): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.223336   364   364 D tkcore-teec: load_ta: loading...
01-10 16:57:14.223336   364   364 D tkcore-teec: 
01-10 16:57:14.223570   364   364 D tkcore-teec: Attempt to load /vendor/app/t6/9ef77781-7bd5-4e39-965f20f6f211f46b.ta
01-10 16:57:14.230000   364   364 W teed    : type=1400 audit(0.0:24): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.230000   364   364 W teed    : type=1400 audit(0.0:25): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.231982   364   364 D tkcore-teec: load_ta() OK!!!
01-10 16:57:14.231982   364   364 D tkcore-teec: 
01-10 16:57:14.232716   364   364 D tkcore-teec: load_ta() done, res: 0x0
01-10 16:57:14.232716   364   364 D tkcore-teec: 
01-10 16:57:14.245407   356   356 I AEE_AED : Built Mar 23 2018 13:42:19
01-10 16:57:14.246551   356   356 I AEE_AED : socket server: android:aee_aed32
01-10 16:57:14.246884   356   356 D AEE_AED : aed_get_force_config: -100000
01-10 16:57:14.247403   356   356 I AEE_AED : AED config
01-10 16:57:14.247403   356   356 I AEE_AED :   mode '4'
01-10 16:57:14.247403   356   356 I AEE_AED :   exp level '0
01-10 16:57:14.247403   356   356 I AEE_AED :   dal enable '0'
01-10 16:57:14.247403   356   356 I AEE_AED :   db count '4'
01-10 16:57:14.247403   356   356 I AEE_AED :   fatal db count '4'
01-10 16:57:14.247403   356   356 I AEE_AED :  db storage '2'
01-10 16:57:14.247403   356   356 I AEE_AED :   SMP Info => 1
01-10 16:57:14.247498   356   356 E AEE_AED : fail to get prebuild packages: No such file or directory
01-10 16:57:14.247528   356   356 E AEE_AED : init_aed_setting: fail to open db history file 
01-10 16:57:14.247541   356   356 D AEE_AED : aee_exception_running_64: send req to debuggerd64
01-10 16:57:14.247671   356   356 D AEE_AED : aee:rttd_64Rtt waiting 64_daemon finish the job...
01-10 16:57:14.250442   362   362 I AEE_AEDV: Built Mar 23 2018 13:42:26
01-10 16:57:14.251615   362   362 I AEE_AEDV: socket server: android:aee_aedv32
01-10 16:57:14.252027   361   361 D AEE_AED : $===AEE===AEE===AEE===$
01-10 16:57:14.252125   361   361 D AEE_AED : p 0 poll events 1 revents 1
01-10 16:57:14.252204   361   361 D AEE_AED : requesting from: pid=356 cmd=9
01-10 16:57:14.252235   361   361 D AEE_AED : Go RTT_AEE_GET_EXCEPTION_RUNNING
01-10 16:57:14.252388   356   356 D AEE_AED : Rtt send 64 req done
01-10 16:57:14.252509   356   356 E AEE_AED : Can't remove file /data/aee_exp/temp: No such file or directory
01-10 16:57:14.254486   365   365 I KeymasterHAL: module.cpp:2130: Open session successfully
01-10 16:57:14.254720   365   365 D KeymasterHAL: module.cpp:1838: Forwarding configure
01-10 16:57:14.254759   365   365 D KeymasterHAL: module.cpp:241: Invoke cmdId 25 at vendor/mediatek/proprietary/trustzone/trustkernel/source/external/AndroidServices/keymaster_v2/module.cpp:1847
01-10 16:57:14.255147   362   362 D AEE_AEDV: aed_get_force_config: -100000
01-10 16:57:14.255653   362   362 I AEE_AEDV: AED config
01-10 16:57:14.255653   362   362 I AEE_AEDV:   mode '4'
01-10 16:57:14.255653   362   362 I AEE_AEDV:   exp level '0
01-10 16:57:14.255653   362   362 I AEE_AEDV:   dal enable '0'
01-10 16:57:14.255653   362   362 I AEE_AEDV:   db count '4'
01-10 16:57:14.255653   362   362 I AEE_AEDV:   fatal db count '4'
01-10 16:57:14.255653   362   362 I AEE_AEDV:  db storage '2'
01-10 16:57:14.255653   362   362 I AEE_AEDV:   SMP Info => 1
01-10 16:57:14.255708   362   362 E AEE_AEDV: fail to open prebuild packages list: No such file or directory
01-10 16:57:14.255748   362   362 E AEE_AEDV: init_aed_setting: fail to open db history file 
01-10 16:57:14.255783   362   362 D AEE_AEDV: aee_exception_running_64: send req to debuggerd64
01-10 16:57:14.255901   362   362 D AEE_AEDV: aee:vrttd_64Rtt waiting 64_daemon finish the job...
01-10 16:57:14.260504   365   365 I ServiceManagement: Removing namespace from process name android.hardware.keymaster@3.0-service to keymaster@3.0-s.
01-10 16:57:14.262031   365   365 I android.hardware.keymaster@3.0-service: Registration complete for android.hardware.keymaster@3.0::IKeymasterDevice/default.
01-10 16:57:14.276024   363   363 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 16:57:14.276096   363   363 D AEE_AEDV: p 0 poll events 1 revents 1
01-10 16:57:14.276157   363   363 D AEE_AEDV: requesting from: pid=362 cmd=9
01-10 16:57:14.276168   363   363 D AEE_AEDV: Go RTT_AEE_GET_EXCEPTION_RUNNING
01-10 16:57:14.276258   362   362 D AEE_AEDV: Rtt send 64 req done
01-10 16:57:14.276362   362   362 E AEE_AEDV: Can't remove file /data/vendor/mtklog/aee_exp/temp: No such file or directory
01-10 16:57:14.276485   362   362 E AEE_AEDV: Can't remove file /sdcard/mtklog/aee_exp/temp: No such file or directory
01-10 16:57:14.276522   362   362 E AEE_AEDV: Can't remove file /storage/ext_sd/mtklog/aee_exp/temp: No such file or directory
01-10 16:57:14.283169   362   362 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 16:57:14.283230   362   362 D AEE_AEDV: p 5 poll events 1 revents 1
01-10 16:57:14.283453   362   362 D AEE_AEDV: PPM cpu cores:8, online:8
01-10 16:57:14.284918   362   362 D AEE_AEDV: aed_main_fork_worker: generator 0xf0f955f0, worker 0xfffbcd58, recv_fd 0
01-10 16:57:14.285825   376   376 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 16:57:14.285900   376   376 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 16:57:14.285918   376   376 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 16:57:14.287666   376   376 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 16:57:14.287848   376   376 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 16:57:14.288626   376   376 W AEE_AEDV: ipanic heahder: magic:0, version:0, size:0, datas:0
01-10 16:57:14.288654   376   376 W AEE_AEDV: ipanic heahder: dhblk:0, blksize:0, partsize:0, bufsize:0
01-10 16:57:14.288723   376   376 W AEE_AEDV: aed_reboot_session, no valid ipanic header, ignored
01-10 16:57:14.288809   376   376 V ETM     : open etb_get_nr fail! , default etb_nr is 1 , (2, No such file or directory)
01-10 16:57:14.288908   376   376 V ETM     : open etb_length fail! (2, No such file or directory)
01-10 16:57:14.288949   376   376 V ETM     : open etb_length fail! (2, No such file or directory)
01-10 16:57:14.289614   376   376 I AEE_AEDV: wdt_status = 2, fiq_step=0, exception_type:0 
01-10 16:57:14.289750   376   376 I AEE_AEDV: powerup reason:wdt_by_pass_pwk
01-10 16:57:14.289750   376   376 I AEE_AEDV: 
01-10 16:57:14.289773   376   376 I AEE_AEDV: reboot_reason = 0
01-10 16:57:14.290039   376   376 E         : mrdump_support_user_load: null mrdump lk version
01-10 16:57:14.290100   376   376 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 16:57:14.290139   376   376 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 16:57:14.290167   376   376 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 16:57:14.291661   376   376 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 16:57:14.291732   376   376 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 16:57:14.292414   376   376 D AEE_AEDV: version(aabbccdd)
01-10 16:57:14.293509   362   362 D AEE_AEDV: clear ppm settings
01-10 16:57:14.293910   375   375 I /system/bin/tzdatacheck: timezone distro dir /data/misc/zoneinfo/current does not exist. No action required.
01-10 16:57:14.295227   362   362 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 16:57:14.453559   378   378 I ServiceManagement: Removing namespace from process name android.hidl.allocator@1.0-service to allocator@1.0-s.
01-10 16:57:14.473119   379   379 I         : [VT][SRV]before VTService_HiDL_instantiate
01-10 16:57:14.493688   379   379 I         : Registration complete for vendor.mediatek.hardware.videotelephony@1.0::IVideoTelephony/default.
01-10 16:57:14.512059   381   381 I ServiceManagement: Removing namespace from process name android.hardware.bluetooth@1.0-service-mediatek to bluetooth@1.0-s.
01-10 16:57:14.514000   364   364 W teed    : type=1400 audit(0.0:26): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.514051   381   381 I android.hardware.bluetooth@1.0-service-mediatek: Registration complete for android.hardware.bluetooth@1.0::IBluetoothHci/default.
01-10 16:57:14.514819   387   387 I GatekeeperHAL: Init device
01-10 16:57:14.526000   364   364 I chatty  : uid=1000(system) /vendor/bin/teed expire 2 lines
01-10 16:57:14.526000   364   364 W teed    : type=1400 audit(0.0:29): avc: denied { write } for name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:14.540359   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: allowing syscall: connect
01-10 16:57:14.540501   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: allowing syscall: fcntl
01-10 16:57:14.540553   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: allowing syscall: sendto
01-10 16:57:14.540591   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: allowing syscall: socket
01-10 16:57:14.540632   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: allowing syscall: writev
01-10 16:57:14.544881   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: logging seccomp filter failures
01-10 16:57:14.545618   384   384 I ServiceManagement: Removing namespace from process name android.hardware.configstore@1.0-service to configstore@1.0.
01-10 16:57:14.548311   387   387 I GatekeeperHAL: Open session successfully
01-10 16:57:14.549249   387   387 I ServiceManagement: Removing namespace from process name android.hardware.gatekeeper@1.0-service to gatekeeper@1.0-.
01-10 16:57:14.551089   387   387 I android.hardware.gatekeeper@1.0-service: Registration complete for android.hardware.gatekeeper@1.0::IGatekeeper/default.
01-10 16:57:14.568472   392   392 I ServiceManagement: Removing namespace from process name android.hardware.thermal@1.0-service to thermal@1.0-ser.
01-10 16:57:14.572786   382   382 I ServiceManagement: Removing namespace from process name android.hardware.broadcastradio@1.1-service to broadcastradio@.
01-10 16:57:14.577142   390   390 E         : light_open lights bluetooth failed: -22
01-10 16:57:14.577233   390   390 E         : Light passthrough failed to load legacy HAL.
01-10 16:57:14.579205   392   392 I android.hardware.thermal@1.0-service: Registration complete for android.hardware.thermal@1.0::IThermal/default.
01-10 16:57:14.590165   391   391 I ServiceManagement: Removing namespace from process name android.hardware.memtrack@1.0-service to memtrack@1.0-se.
01-10 16:57:14.590412   393   393 I ServiceManagement: Removing namespace from process name android.hardware.vibrator@1.0-service to vibrator@1.0-se.
01-10 16:57:14.591416   390   390 E         : light_open lights wifi failed: -22
01-10 16:57:14.591459   390   390 E         : Light passthrough failed to load legacy HAL.
01-10 16:57:14.592954   397   414 I vendor.mediatek.hardware.power@1.1-service: mtkPowerService - data:0x0
01-10 16:57:14.593615   391   391 I android.hardware.memtrack@1.0-service: Registration complete for android.hardware.memtrack@1.0::IMemtrack/default.
01-10 16:57:14.594734   393   393 I android.hardware.vibrator@1.0-service: Registration complete for android.hardware.vibrator@1.0::IVibrator/default.
01-10 16:57:14.598305   404   404 E ccci_fsd(0): md_fsd Ver:v2.2, CCCI Ver:6
01-10 16:57:14.598423   390   390 I ServiceManagement: Removing namespace from process name android.hardware.light@2.0-service-mediatek to light@2.0-servi.
01-10 16:57:14.601182   396   396 E MtkCodecService: MtkCodecService service create
01-10 16:57:14.602439   390   390 I android.hardware.light@2.0-service-mediatek: Registration complete for android.hardware.light@2.0::ILight/default.
01-10 16:57:14.604480   396   396 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.mtkcodecservice@1.1-service to mtkcodecservice.
01-10 16:57:14.607169   396   396 I vendor.mediatek.hardware.mtkcodecservice@1.0-service: Registration complete for vendor.mediatek.hardware.mtkcodecservice@1.1::IMtkCodecService/default.
01-10 16:57:14.607175   400   400 I lowmemorykiller: running re-execed
01-10 16:57:14.607389   406   406 I ccci_mdinit: (1):md_init ver:2.20, sub:0
01-10 16:57:14.607717   400   400 I lowmemorykiller: Using in-kernel low memory killer interface
01-10 16:57:14.615282   410   410 I wmt_loader: Can't open device node(/dev/wmtdetect) count(1)
01-10 16:57:14.618859   398   398 I vendor.nxp.nxpnfc@1.0-service: Registration complete for android.hardware.nfc@1.0::INfc/default.
01-10 16:57:14.619252   406   406 I ccci_mdinit: (1):[init.svc.gsm0710muxd][init.svc.ril-daemon-mtk][init.svc.emdlogger1][init.svc.ccci_fsd]
01-10 16:57:14.626321   388   388 I ServiceManagement: Removing namespace from process name android.hardware.graphics.allocator@2.0-service to allocator@2.0-s.
01-10 16:57:14.633987   405   405 E ccci_fsd(0): md_fsd Ver:v2.2, CCCI Ver:6
01-10 16:57:14.635691   388   388 I android.hardware.graphics.allocator@2.0-service: Registration complete for android.hardware.graphics.allocator@2.0::IAllocator/default.
01-10 16:57:14.636110   398   398 E         : HIDL_FETCH_INxpNfc
01-10 16:57:14.637133   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.health@1.0::IHealth/default in either framework or device manifest.
01-10 16:57:14.637665   383   383 I ServiceManagement: Removing namespace from process name android.hardware.cas@1.0-service to cas@1.0-service.
01-10 16:57:14.638948   398   398 I ServiceManagement: Removing namespace from process name vendor.nxp.nxpnfc@1.0-service to nxpnfc@1.0-serv.
01-10 16:57:14.640352   397   413 I libPerfService: perfservice ver:V7.0
01-10 16:57:14.640818   397   413 I libPerfService: checkDrvSupport hps failed: No such file or directory
01-10 16:57:14.640872   397   413 I libPerfService: checkDrvSupport cpufreq failed: No such file or directory
01-10 16:57:14.641675   397   413 I libPerfService: checkDrvSupport - perfmgr:1, ppm:1, ppmAll:1, acao:1, hmp:1, hps:0, hevc:0, fliper:0, sysfs:1, dvfs:1, turbo:1, fstb:1
01-10 16:57:14.641805   397   413 I libPerfService: getCputopoInfo - cpuNum:8, cluster:2, cputopoCluster:2
01-10 16:57:14.641990   397   413 I libPerfService: [cluster 0]: cpu:4, first:0, freq count:16, max_freq:1508000
01-10 16:57:14.642007   397   413 I libPerfService:   0: 338000
01-10 16:57:14.642016   397   413 I libPerfService:   1: 481000
01-10 16:57:14.642022   397   413 I libPerfService:   2: 624000
01-10 16:57:14.642030   397   413 I libPerfService:   3: 715000
01-10 16:57:14.642037   397   413 I libPerfService:   4: 793000
01-10 16:57:14.642043   397   413 I libPerfService:   5: 884000
01-10 16:57:14.642049   397   413 I libPerfService:   6: 1001000
01-10 16:57:14.642055   397   413 I libPerfService:   7: 1105000
01-10 16:57:14.642062   397   413 I libPerfService:   8: 1183000
01-10 16:57:14.642068   397   413 I libPerfService:   9: 1235000
01-10 16:57:14.642074   397   413 I libPerfService:   10: 1300000
01-10 16:57:14.642080   397   413 I libPerfService:   11: 1365000
01-10 16:57:14.642087   397   413 I libPerfService:   12: 1404000
01-10 16:57:14.642093   397   413 I libPerfService:   13: 1430000
01-10 16:57:14.642100   397   413 I libPerfService:   14: 1482000
01-10 16:57:14.642106   397   413 I libPerfService:   15: 1508000
01-10 16:57:14.642200   397   413 I libPerfService: [cluster 1]: cpu:4, first:4, freq count:16, max_freq:2002000
01-10 16:57:14.642215   397   413 I libPerfService:   0: 520000
01-10 16:57:14.642222   397   413 I libPerfService:   1: 715000
01-10 16:57:14.642228   397   413 I libPerfService:   2: 910000
01-10 16:57:14.642234   397   413 I libPerfService:   3: 1040000
01-10 16:57:14.642240   397   413 I libPerfService:   4: 1170000
01-10 16:57:14.642247   397   413 I libPerfService:   5: 1287000
01-10 16:57:14.642253   397   413 I libPerfService:   6: 1456000
01-10 16:57:14.642259   397   413 I libPerfService:   7: 1586000
01-10 16:57:14.642266   397   413 I libPerfService:   8: 1690000
01-10 16:57:14.642272   397   413 I libPerfService:   9: 1742000
01-10 16:57:14.642278   397   413 I libPerfService:   10: 1807000
01-10 16:57:14.642284   397   413 I libPerfService:   11: 1859000
01-10 16:57:14.642290   397   413 I libPerfService:   12: 1911000
01-10 16:57:14.642296   397   413 I libPerfService:   13: 1937000
01-10 16:57:14.642312   397   413 I libPerfService:   14: 1976000
01-10 16:57:14.642319   397   413 I libPerfService:   15: 2002000
01-10 16:57:14.642372   397   413 E libPerfService: Could not open '/sys/kernel/debug/fpsgo/fstb/fstb_soft_level'
01-10 16:57:14.642381   397   413 E libPerfService: error : 2, No such file or directory
01-10 16:57:14.642389   397   413 I libPerfService: pFstbDefaultFps:1 60-26 
01-10 16:57:14.642499   397   413 I libPerfService: nGpuFreqCount:2
01-10 16:57:14.652054   397   413 E libPerfService: No GiFT Tags
01-10 16:57:14.652124   397   413 I libPerfService: [init] nXmlPackNum:12 nXmlActivityNum:12 nXmlCmdNum:15 nXmlGiftTagNum:0 nXmlGiftAttrNum:0
01-10 16:57:14.652241   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:0 cmd:CMD_SET_CLUSTER_CPU_CORE_MIN pack:com.imangi.templerun2, activity:Common0 p1:0 p2:3 p3:0 p4:0
01-10 16:57:14.652279   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:1 cmd:CMD_SET_SPORTS_MODE pack:com.andromeda.androbench2, activity:Common1 p1:1 p2:0 p3:0 p4:0
01-10 16:57:14.652307   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:2 cmd:CMD_SET_SPORTS_MODE pack:com.futuremark.pcmark.android.benchmark, activity:Common2 p1:1 p2:0 p3:0 p4:0
01-10 16:57:14.652336   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:3 cmd:CMD_SET_SPORTS_MODE pack:com.antutu.ABenchMark, activity:Common3 p1:1 p2:0 p3:0 p4:0
01-10 16:57:14.652356   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:4 cmd:CMD_SET_SPORTS_MODE pack:com.antutu.benchmark.full, activity:Common4 p1:1 p2:0 p3:0 p4:0
01-10 16:57:14.652389   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:5 cmd:CMD_SET_SPORTS_MODE pack:com.primatelabs.geekbench, activity:Common5 p1:1 p2:0 p3:0 p4:0
01-10 16:57:14.652410   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:6 cmd:CMD_SET_SPORTS_MODE pack:com.aurorasoftworks.quadrant.ui.professional, activity:Common6 p1:1 p2:0 p3:0 p4:0
01-10 16:57:14.652436   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:7 cmd:CMD_SET_SPORTS_MODE pack:com.aurorasoftworks.quadrant.ui.advanced, activity:Common7 p1:1 p2:0 p3:0 p4:0
01-10 16:57:14.652586   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:8 cmd:CMD_SET_PACK_BOOST_TIMEOUT pack:com.tencent.tmgp.sgame, activity:Common8 p1:25 p2:0 p3:0 p4:0
01-10 16:57:14.652611   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:9 cmd:CMD_SET_FSTB_FPS pack:com.tencent.tmgp.sgame, activity:Common8 p1:60 p2:30 p3:0 p4:0
01-10 16:57:14.652629   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:10 cmd:CMD_SET_FBT_FLOOR_BOUND pack:com.tencent.tmgp.sgame, activity:Common8 p1:1 p2:0 p3:0 p4:0
01-10 16:57:14.652652   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:11 cmd:CMD_SET_FBT_KMIN pack:com.tencent.tmgp.sgame, activity:Common8 p1:10 p2:0 p3:0 p4:0
01-10 16:57:14.652867   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:12 cmd:CMD_SET_FSTB_FPS pack:com.gameloft.android.ANMP.GloftA8HM, activity:Common9 p1:30 p2:30 p3:0 p4:0
01-10 16:57:14.652898   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:13 cmd:CMD_SET_FSTB_FPS pack:com.happyelements.AndroidAnimal.qq, activity:Common10 p1:50 p2:26 p3:0 p4:0
01-10 16:57:14.652930   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:14 cmd:CMD_SET_FSTB_FPS pack:com.happyelements.AndroidAnimal, activity:Common11 p1:50 p2:26 p3:0 p4:0
01-10 16:57:14.653008   397   413 I libPerfService: [get_activity_totalnum]  total ture activity num :12
01-10 16:57:14.653027   397   413 I libPerfService: [init] nPackNum:12
01-10 16:57:14.653377   398   398 I vendor.nxp.nxpnfc@1.0-service: Registration complete for vendor.nxp.nxpnfc@1.0::INxpNfc/default.
01-10 16:57:14.657162   397   413 I libPerfService: CMD_SET_PPM_ROOT_CLUSTER doesn't have write permission!!!!
01-10 16:57:14.657236   397   413 I libPerfService: write of /proc/ppm/root_cluster failed: No such file or directory
01-10 16:57:14.657286   397   413 E libPerfService: Could not open '/proc/ppm/root_cluster'
01-10 16:57:14.657299   397   413 E libPerfService: error : 2, No such file or directory
01-10 16:57:14.657324   397   413 I libPerfService: CMD_SET_HPS_UP_THRESHOLD doesn't have write permission!!!!
01-10 16:57:14.657332   397   413 I libPerfService: write of /proc/hps/up_threshold failed: No such file or directory
01-10 16:57:14.657352   397   413 I libPerfService: CMD_SET_HPS_DOWN_THRESHOLD doesn't have write permission!!!!
01-10 16:57:14.657361   397   413 I libPerfService: write of /proc/hps/down_threshold failed: No such file or directory
01-10 16:57:14.657396   397   413 I libPerfService: CMD_SET_VCORE_BW_THRES doesn't have write permission!!!!
01-10 16:57:14.657408   397   413 I libPerfService: write of /proc/fliperfs/cg_threshold failed: No such file or directory
01-10 16:57:14.657455   397   413 I libPerfService: CMD_SET_VCORE_BW_ENABLED doesn't have write permission!!!!
01-10 16:57:14.657474   397   413 I libPerfService: write of /proc/fliperfs/cg_enable failed: No such file or directory
01-10 16:57:14.657699   397   413 I libPerfService: CMD_SET_HPS_RBOOST_THRESH doesn't have write permission!!!!
01-10 16:57:14.657725   397   413 I libPerfService: write of /proc/hps/rush_boost_threshold failed: No such file or directory
01-10 16:57:14.657795   397   413 I libPerfService: CMD_SET_PPM_HOLD_TIME_LL_ONLY doesn't have write permission!!!!
01-10 16:57:14.657811   397   413 I libPerfService: write of /proc/ppm/policy/hica_settings/LL_ONLY_to_ALL/capacity_hold_time failed: No such file or directory
01-10 16:57:14.658081   411   411 I wmt_launcher: get property(service.wcn.driver.ready) is no
01-10 16:57:14.658611   397   413 E libPerfService: Could not open '/proc/perfmgr/smart/native_is_running'
01-10 16:57:14.658647   397   413 E libPerfService: error : 2, No such file or directory
01-10 16:57:14.658679   397   413 E libPerfService: Could not open '/proc/perfmgr/smart/hps_check_duration'
01-10 16:57:14.658688   397   413 E libPerfService: error : 2, No such file or directory
01-10 16:57:14.658741   397   413 I libPerfService: [updateScnListfromXML] new activity from perf_app, num:0
01-10 16:57:14.660175   397   413 I libPerfService: [updateScnListfromXML] new activity from perf_app and whiteList, num:12
01-10 16:57:14.662484   386   386 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service.widevine to drm@1.0-service.
01-10 16:57:14.665079   386   386 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service.widevine to drm@1.0-service.
01-10 16:57:14.667047   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:12, param_1:0, param_2:4
01-10 16:57:14.667126   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:12, param_1:0, param_2:3000000
01-10 16:57:14.667141   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:12, param_1:1, param_2:4
01-10 16:57:14.667153   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:12, param_1:1, param_2:3000000
01-10 16:57:14.667166   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:12, param_1:1100, param_2:3000000
01-10 16:57:14.667202   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:11, param_1:0, param_2:4
01-10 16:57:14.667214   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:11, param_1:0, param_2:3000000
01-10 16:57:14.667225   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:11, param_1:1, param_2:4
01-10 16:57:14.667236   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:11, param_1:1, param_2:3000000
01-10 16:57:14.667248   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:11, param_1:1, param_2:3000000
01-10 16:57:14.667263   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:11, param_1:0, param_2:3000000
01-10 16:57:14.667277   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:11, param_1:1100, param_2:3000000
01-10 16:57:14.667292   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:8, param_1:0, param_2:4
01-10 16:57:14.667305   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:8, param_1:0, param_2:3000000
01-10 16:57:14.667318   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:8, param_1:1, param_2:4
01-10 16:57:14.667332   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:8, param_1:1, param_2:3000000
01-10 16:57:14.667343   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:8, param_1:1, param_2:3000000
01-10 16:57:14.667357   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:8, param_1:0, param_2:3000000
01-10 16:57:14.667371   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:8, param_1:1100, param_2:3000000
01-10 16:57:14.667385   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_FPSGO_ENABLE, scn:8, param_1:0, param_2:3000000
01-10 16:57:14.667398   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:10, param_1:0, param_2:4
01-10 16:57:14.667411   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:10, param_1:0, param_2:3000000
01-10 16:57:14.667423   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:10, param_1:1, param_2:4
01-10 16:57:14.667434   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:10, param_1:1, param_2:3000000
01-10 16:57:14.667446   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:10, param_1:1, param_2:3000000
01-10 16:57:14.667461   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:10, param_1:0, param_2:3000000
01-10 16:57:14.667476   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:10, param_1:1100, param_2:3000000
01-10 16:57:14.667490   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:14, param_1:0, param_2:4
01-10 16:57:14.667502   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:14, param_1:0, param_2:3000000
01-10 16:57:14.667514   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:14, param_1:1, param_2:4
01-10 16:57:14.667527   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:14, param_1:1, param_2:3000000
01-10 16:57:14.667539   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:14, param_1:1, param_2:3000000
01-10 16:57:14.667552   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:14, param_1:0, param_2:3000000
01-10 16:57:14.667566   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:14, param_1:1100, param_2:3000000
01-10 16:57:14.667581   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:13, param_1:0, param_2:4
01-10 16:57:14.667593   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:13, param_1:0, param_2:3000000
01-10 16:57:14.667610   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:13, param_1:1, param_2:4
01-10 16:57:14.667622   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:13, param_1:1, param_2:3000000
01-10 16:57:14.667650   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:13, param_1:1, param_2:3000000
01-10 16:57:14.667664   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:13, param_1:0, param_2:3000000
01-10 16:57:14.667679   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:13, param_1:1100, param_2:3000000
01-10 16:57:14.667692   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_FPSGO_ENABLE, scn:13, param_1:0, param_2:3000000
01-10 16:57:14.667708   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CPU_PERF_MODE, scn:18, param_1:1, param_2:3000000
01-10 16:57:14.672449   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.thermal@1.1::IThermal/default in either framework or device manifest.
01-10 16:57:14.672892   395   395 I DynamicFpsPolicy: try to new 1 refresh ranges
01-10 16:57:14.673353   402   402 W thermalserviced: Unable to get Thermal HAL V1.1, vendor thermal event notification not available
01-10 16:57:14.674272   395   395 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.dfps@1.0-service to dfps@1.0-servic.
01-10 16:57:14.680179   395   395 I vendor.mediatek.hardware.dfps@1.0-service: Registration complete for vendor.mediatek.hardware.dfps@1.0::IFpsPolicyService/default.
01-10 16:57:14.680893   395   417 I DynamicFpsPolicy: oldRequest: fps[0] mode[0] --> newRequest: fps[-1] mode[0] num[r:0|rs:0]
01-10 16:57:14.680998   395   417 I DynamicFpsPolicy: oldRequest: fps[-1] mode[0] --> newRequest: fps[-1] mode[0] num[r:0|rs:0]
01-10 16:57:14.709597   389   389 I hwcomposer: [HWC] FD resource: cur[4096]  max[4096]
01-10 16:57:14.709597   389   389 I hwcomposer:   
01-10 16:57:14.711123   389   389 I ServiceManagement: Removing namespace from process name android.hardware.graphics.composer@2.1-service to composer@2.1-se.
01-10 16:57:14.712565   389   389 I android.hardware.graphics.composer@2.1-service: Registration complete for android.hardware.graphics.composer@2.1::IComposer/default.
01-10 16:57:14.712916   385   385 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service to drm@1.0-service.
01-10 16:57:14.714061   385   385 I android.hardware.drm@1.0-service: Registration complete for android.hardware.drm@1.0::IDrmFactory/default.
01-10 16:57:14.715268   397   413 I libPerfService: [init] nFbcSupport:1
01-10 16:57:14.715376   397   413 I libPerfService: [init] nThmSupport:1
01-10 16:57:14.715456   397   413 I powerd  : [powerd_core_pre_init] gtCusHintTbl[0]:36
01-10 16:57:14.715523   397   413 I powerd  : [powerd_core_pre_init] gtCusHintTbl[1]:37
01-10 16:57:14.715534   397   413 I powerd  : [powerd_core_pre_init] gtCusHintTbl[2]:38
01-10 16:57:14.715547   397   413 I powerd  : [powerd_core_pre_init] i:12, j:0, walt scn:-1, t:-1, ud:0
01-10 16:57:14.715558   397   413 I powerd  : [powerd_core_pre_init] i:14, j:0, walt scn:-1, t:-1, ud:0
01-10 16:57:14.715568   397   413 I powerd  : [powerd_core_pre_init] i:16, j:0, walt scn:-1, t:-1, ud:0
01-10 16:57:14.715577   397   413 I powerd  : [powerd_core_pre_init] pboost_timeout: 0
01-10 16:57:14.715600   397   413 I vendor.mediatek.hardware.power@1.1-impl: mtkPowerManager - data:0x0
01-10 16:57:14.717561   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::maxFrameBufferAcquiredBuffers retrieved: 3
01-10 16:57:14.717776   385   385 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service to drm@1.0-service.
01-10 16:57:14.719203   385   385 I android.hardware.drm@1.0-service: Registration complete for android.hardware.drm@1.0::ICryptoFactory/default.
01-10 16:57:14.721630   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::startGraphicsAllocatorService retrieved: 0
01-10 16:57:14.722971   397   414 I MTKPowerHAL: power_open: enter; name=power
01-10 16:57:14.723117   397   414 I MTKPowerHAL: power_init
01-10 16:57:14.725061   397   414 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.power@1.1-service to power@1.1-servi.
01-10 16:57:14.727005   397   414 I vendor.mediatek.hardware.power@1.1-service: Registration complete for vendor.mediatek.hardware.power@1.1::IPower/default.
01-10 16:57:14.727260   401   401 I SurfaceFlinger: SurfaceFlinger is starting
01-10 16:57:14.727678   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::vsyncEventPhaseOffsetNs retrieved: 8300000
01-10 16:57:14.728283   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::vsyncSfEventPhaseOffsetNs retrieved: 8300000
01-10 16:57:14.728479   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasSyncFramework retrieved: 1
01-10 16:57:14.728634   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::useContextPriority retrieved: 0 (default)
01-10 16:57:14.728757   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::presentTimeOffsetFromVSyncNs retrieved: 0
01-10 16:57:14.728888   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::useHwcForRGBtoYUV retrieved: 1
01-10 16:57:14.729007   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::maxVirtualDisplaySize retrieved: 0 (default)
01-10 16:57:14.729125   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::useVrFlinger retrieved: 0 (default)
01-10 16:57:14.729163   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::maxFrameBufferAcquiredBuffers retrieved: 3
01-10 16:57:14.729271   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 16:57:14.752210   401   401 E DynamicFpsPolicy: FpsVsync link done
01-10 16:57:14.752911   395   423 I DynamicFpsPolicy: registerCallback: registerrr cb:1  target:1
01-10 16:57:14.753192   401   401 I SurfaceFlinger: FD resource: cur[4096]  max[4096]
01-10 16:57:14.753255   401   401 I SurfaceFlinger: Disabling backpressure propagation
01-10 16:57:14.753278   401   401 I SurfaceFlinger: Disabling Triple Buffering
01-10 16:57:14.759650   401   401 I SurfaceFlinger: SurfaceFlinger's main thread ready to run. Initializing graphics H/W...
01-10 16:57:14.759713   401   401 I SurfaceFlinger: Phase offest NS: 8300000
01-10 16:57:14.818612   380   380 I ServiceManagement: Removing namespace from process name android.hardware.audio@2.0-service-mediatek to audio@2.0-servi.
01-10 16:57:14.820235   380   380 I mtkaudiohalservice: Registration complete for android.hardware.audio@2.0::IDevicesFactory/default.
01-10 16:57:14.841573   380   380 I mtkaudiohalservice: Registration complete for android.hardware.audio.effect@2.0::IEffectsFactory/default.
01-10 16:57:14.842174   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.soundtrigger@2.0::ISoundTriggerHw/default in either framework or device manifest.
01-10 16:57:14.843582   380   380 E mtkaudiohalservice: Could not get passthrough implementation for android.hardware.soundtrigger@2.0::ISoundTriggerHw/default.
01-10 16:57:14.843667   380   380 E mtkaudiohalservice: Error while registering soundtrigger service: 1
01-10 16:57:14.915704   410   410 I wmt_loader: chip id from property:-1
01-10 16:57:14.958461   411   411 I wmt_launcher: get property(service.wcn.driver.ready) is no
01-10 16:57:15.015866   415   415 I STATUSD : 2606:main(): ignore
01-10 16:57:15.041476   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 16:57:15.042453   401   401 I SurfaceFlinger: EventThread Client Pid (401) created
01-10 16:57:15.045663   401   401 I SurfaceFlinger: EGL information:
01-10 16:57:15.045793   401   401 I SurfaceFlinger: vendor    : Android
01-10 16:57:15.045802   401   401 I SurfaceFlinger: version   : 1.4 Android META-EGL
01-10 16:57:15.045810   401   401 I SurfaceFlinger: extensions: EGL_KHR_get_all_proc_addresses EGL_ANDROID_presentation_time EGL_KHR_swap_buffers_with_damage EGL_ANDROID_get_native_client_buffer EGL_ANDROID_front_buffer_auto_refresh EGL_ANDROID_get_frame_timestamps EGL_KHR_image EGL_KHR_image_base EGL_KHR_gl_colorspace EGL_KHR_gl_texture_2D_image EGL_KHR_gl_texture_cubemap_image EGL_KHR_gl_renderbuffer_image EGL_KHR_fence_sync EGL_KHR_create_context EGL_KHR_config_attribs EGL_KHR_surfaceless_context EGL_EXT_create_context_robustness EGL_ANDROID_image_native_buffer EGL_KHR_wait_sync EGL_ANDROID_recordable EGL_KHR_partial_update EGL_KHR_mutable_render_buffer EGL_IMG_context_priority EGL_KHR_no_config_context 
01-10 16:57:15.045819   401   401 I SurfaceFlinger: Client API: OpenGL_ES
01-10 16:57:15.045828   401   401 I SurfaceFlinger: EGLSurface: 8-8-8-8, config=0x740b7c3008
01-10 16:57:15.047255   401   401 I SurfaceFlinger: OpenGL ES informations:
01-10 16:57:15.047361   401   401 I SurfaceFlinger: vendor    : ARM
01-10 16:57:15.047370   401   401 I SurfaceFlinger: renderer  : Mali-G71
01-10 16:57:15.047382   401   401 I SurfaceFlinger: version   : OpenGL ES 3.2 v1.r9p0-01rel0.83a3bc72fddd1868f17b698165c9be5c
01-10 16:57:15.047391   401   401 I SurfaceFlinger: extensions: GL_EXT_debug_marker GL_ARM_rgba8 GL_ARM_mali_shader_binary GL_OES_depth24 GL_OES_depth_texture GL_OES_depth_texture_cube_map GL_OES_packed_depth_stencil GL_OES_rgb8_rgba8 GL_EXT_read_format_bgra GL_OES_compressed_paletted_texture GL_OES_compressed_ETC1_RGB8_texture GL_OES_standard_derivatives GL_OES_EGL_image GL_OES_EGL_image_external GL_OES_EGL_image_external_essl3 GL_OES_EGL_sync GL_OES_texture_npot GL_OES_vertex_half_float GL_OES_required_internalformat GL_OES_vertex_array_object GL_OES_mapbuffer GL_EXT_texture_format_BGRA8888 GL_EXT_texture_rg GL_EXT_texture_type_2_10_10_10_REV GL_OES_fbo_render_mipmap GL_OES_element_index_uint GL_EXT_shadow_samplers GL_OES_texture_compression_astc GL_KHR_texture_compression_astc_ldr GL_KHR_texture_compression_astc_hdr GL_KHR_texture_compression_astc_sliced_3d GL_KHR_debug GL_EXT_occlusion_query_boolean GL_EXT_disjoint_timer_query GL_EXT_blend_minmax GL_EXT_discard_framebuffer GL_OES_get_program_binary GL_OES_texture_3D GL_EXT_texture_storage GL_EXT_multisamp
01-10 16:57:15.047399   401   401 I SurfaceFlinger: GL_MAX_TEXTURE_SIZE = 16384
01-10 16:57:15.047406   401   401 I SurfaceFlinger: GL_MAX_VIEWPORT_DIMS = 16384
01-10 16:57:15.057586   389   389 W hwcomposer: [EVENT] Start to listen uevent, addr.nl_pid(389)  
01-10 16:57:15.057769   389   389 W hwcomposer: [HWC] Register hotplug callback  
01-10 16:57:15.057803   389   389 W hwcomposer: [HWC] Register refresh callback  
01-10 16:57:15.057827   389   389 W hwcomposer: [HWC] Register vsync callback  
01-10 16:57:15.057880   389   389 I hwcomposer: [JOB] ui_mm_combined? 1  
01-10 16:57:15.058376   389   389 I hwcomposer: [DPY] get 0 density from drv, density calculated by physical dpi  
01-10 16:57:15.059358   389   389 W libc    : Unable to set property "ro.sf.lcd_density" to "300": error code: 0xb
01-10 16:57:15.059451   389   389 I hwcomposer: [DPY] setprop lcd_density 300  
01-10 16:57:15.059481   389   389 I hwcomposer: [DPY] fail to set ro.sf.lcd_density  
01-10 16:57:15.061032   389   389 E MDP     : DpAsyncBlitStream: unrecognizable user 0
01-10 16:57:15.061226   389   389 I hwcomposer: [DPY] Display Information:  
01-10 16:57:15.061272   389   389 I hwcomposer: [DPY] # fo current devices : 1  
01-10 16:57:15.061307   389   389 I hwcomposer: [DPY] ------------------------------------  
01-10 16:57:15.061334   389   389 I hwcomposer: [DPY] Device id   : 0  
01-10 16:57:15.061360   389   389 I hwcomposer: [DPY] Width       : 720  
01-10 16:57:15.061386   389   389 I hwcomposer: [DPY] Height      : 1280  
01-10 16:57:15.061426   389   389 I hwcomposer: [DPY] xdpi        : 294967.750000  
01-10 16:57:15.061455   389   389 I hwcomposer: [DPY] ydpi        : 295563.625000  
01-10 16:57:15.061481   389   389 I hwcomposer: [DPY] vsync       : 1  
01-10 16:57:15.061507   389   389 I hwcomposer: [DPY] refresh     : 18828845  
01-10 16:57:15.061533   389   389 I hwcomposer: [DPY] connected   : 1  
01-10 16:57:15.061560   389   389 I hwcomposer: [DPY] hwrotation  : 0  
01-10 16:57:15.061586   389   389 I hwcomposer: [DPY] subtype     : 0  
01-10 16:57:15.061625   389   389 I hwcomposer: [DPY] aspect      : 0.562, 1.778  
01-10 16:57:15.061657   389   389 I hwcomposer: [DPY] protrait    : [   0,   0, 720,1280]  
01-10 16:57:15.061685   389   389 I hwcomposer: [DPY] landscape   : [   0,   0, 720,1280]  
01-10 16:57:15.061710   389   389 I hwcomposer: [DPY] trigger_by_vsync: 0  
01-10 16:57:15.061736   389   389 I hwcomposer: [DPY] supportS3D  : 0  
01-10 16:57:15.061762   389   389 I hwcomposer: [DPY] density     : 320  
01-10 16:57:15.061800   389   389 I hwcomposer: [DPY] ro.sf.lcd_density : 320  
01-10 16:57:15.062799   401   401 I BufferQueue: [unnamed-401-0](this:0x7406bfd000,id:0,api:0,p:-1,c:-1) BufferQueue core=(401:/system/bin/surfaceflinger)
01-10 16:57:15.070242   401   401 W GuiExt  : Cannot find GuiExtService
01-10 16:57:15.070532   401   401 E GED     : ged_gpu_timestamp: GED_ERROR_FAIL eErr = 0, 7
01-10 16:57:15.072421   401   401 I BufferQueueConsumer: [unnamed-401-0](this:0x7406bfd000,id:0,api:0,p:-1,c:401) connect(C): consumer=(401:/system/bin/surfaceflinger) controlledByApp=false
01-10 16:57:15.072595   401   401 I BufferQueueConsumer: [unnamed-401-0](this:0x7406bfd000,id:0,api:0,p:-1,c:401) setConsumerName: unnamed-401-0
01-10 16:57:15.072630   401   401 I BufferQueueConsumer: [FrameBufferSurface_0](this:0x7406bfd000,id:0,api:0,p:-1,c:401) setConsumerName: FrameBufferSurface_0
01-10 16:57:15.072873   401   401 I BufferQueueConsumer: [FrameBufferSurface_0](this:0x7406bfd000,id:0,api:0,p:-1,c:401) setDefaultBufferSize: width=720 height=1280
01-10 16:57:15.073364   401   401 I BufferQueueProducer: [FrameBufferSurface_0](this:0x7406bfd000,id:0,api:1,p:401,c:401) connect(P): api=1 producer=(401:/system/bin/surfaceflinger) producerControlledByApp=false
01-10 16:57:15.114518   388   388 W gralloc : Failed to find GPU block configuration in libGLES_mali.so. Using static build configuration.
01-10 16:57:15.258878   411   411 I wmt_launcher: get property(service.wcn.driver.ready) is no
01-10 16:57:15.495500   410   410 I wmt_loader: external combo chip detected
01-10 16:57:15.497625   410   410 I wmt_loader: chipid (0x6630) detected
01-10 16:57:15.502896   410   410 I wmt_loader: set property(persist.mtk.wcn.combo.chipid) to 0x6630 succeed.
01-10 16:57:15.505536   410   410 I wmt_loader: do SDIO3.0 autok succeed
01-10 16:57:15.512282   389   389 I hwcomposer: [HWC] Display(0) SetPowerMode(2)  
01-10 16:57:15.514702   401   478 I SurfaceFlinger: [checkEnableBootAnim] boot reason = ''
01-10 16:57:15.515022   401   478 I boot    : mBootAnimationEnabled = 1
01-10 16:57:15.519963   401   478 I boot    : BOOTPROF:BootAnimation:Start:7036
01-10 16:57:15.526464   410   410 I wmt_loader: external combo chip power off succeed
01-10 16:57:15.544963   410   410 I wmt_loader: do kernel module init succeed: 0
01-10 16:57:15.546776   410   410 I wmt_loader: set property(service.wcn.driver.ready) to yes succeed
01-10 16:57:15.547600   389   389 W hwcomposer: [JOB] (0) SET/bypass/no_visible_layers  
01-10 16:57:15.559279   411   411 I wmt_launcher: get property(service.wcn.driver.ready) is yes
01-10 16:57:15.559525   411   411 I wmt_launcher: open device node succeed.(Node:/dev/stpwmt, fd:5) 
01-10 16:57:15.559565   411   411 I wmt_launcher: key:(persist.mtk.wcn.combo.chipid)-value:(0x6630),chip_id:0x6630
01-10 16:57:15.559577   411   411 I wmt_launcher: chip_id:0x6630
01-10 16:57:15.559599   411   411 I wmt_launcher: patch path:/vendor/firmware/
01-10 16:57:15.559628   411   411 I wmt_launcher: set chip_id(0x6630) to driver
01-10 16:57:15.562817   401   485 E GED     : SF restart
01-10 16:57:15.564599   411   411 I wmt_launcher: Info:key:mt6620.defAnt value:mt6620_ant_m3.cfg
01-10 16:57:15.564672   411   411 I wmt_launcher: Info:key:mt6628.defAnt value:mt6628_ant_m1.cfg
01-10 16:57:15.564686   411   411 I wmt_launcher: Info:key:mt6630.defAnt value:mt6630_ant_m1.cfg
01-10 16:57:15.564698   411   411 I wmt_launcher: Info:key:mt6632.defAnt value:mt6632_ant_m1.cfg
01-10 16:57:15.564712   411   411 I wmt_launcher: NULL is returned, eighter EOF or error maybe found
01-10 16:57:15.564743   411   411 I wmt_launcher: close /system/vendor/firmware/WMT.cfg succeed
01-10 16:57:15.564757   411   411 I wmt_launcher: index:2, chip_id:0x6630
01-10 16:57:15.564776   411   411 I wmt_launcher: chip_id(0x6630), default Mode(4), strlen(g_wmt_cfg_name)(17), g_wmt_cfg_name(mt6630_ant_m1.cfg)
01-10 16:57:15.572309   411   411 I wmt_launcher: create pwr on thread ok
01-10 16:57:15.572320   411   486 I wmt_launcher: enter power on connsys flow
01-10 16:57:15.572452   411   411 I wmt_launcher: get property(service.wcn.formeta.ready) failed iRet:0 or property is 
01-10 16:57:15.668397   411   411 I wmt_launcher: set property(service.wcn.formeta.ready) to yes succeed
01-10 16:57:16.334045   401   421 I SurfaceFlinger: [SF client] NEW(0x740b228000) for (481:/system/bin/bootanimation)
01-10 16:57:16.338378   401   401 I BufferQueue: [unnamed-401-1](this:0x740443d000,id:1,api:0,p:-1,c:-1) BufferQueue core=(401:/system/bin/surfaceflinger)
01-10 16:57:16.338689   401   401 W GuiExt  : Cannot find GuiExtService
01-10 16:57:16.338834   401   401 I BufferQueueConsumer: [unnamed-401-1](this:0x740443d000,id:1,api:0,p:-1,c:401) connect(C): consumer=(401:/system/bin/surfaceflinger) controlledByApp=false
01-10 16:57:16.338877   401   401 I BufferQueueConsumer: [unnamed-401-1](this:0x740443d000,id:1,api:0,p:-1,c:401) setConsumerName: unnamed-401-1
01-10 16:57:16.338967   401   401 I BufferQueueConsumer: [BootAnimation#0](this:0x740443d000,id:1,api:0,p:-1,c:401) setConsumerName: BootAnimation#0
01-10 16:57:16.339020   401   401 I BufferQueueConsumer: [BootAnimation#0](this:0x740443d000,id:1,api:0,p:-1,c:401) setDefaultBufferSize: width=720 height=1280
01-10 16:57:16.344482   389   389 W hwcomposer: [JOB] (0) SET/bypass/no_visible_layers  
01-10 16:57:16.434751   481   497 I /system/bin/bootanimation: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 16:57:16.435565   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) connect(P): api=1 producer=(481:/system/bin/bootanimation) producerControlledByApp=false
01-10 16:57:16.640496   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:1.829482,dur:1093.21,max:796.96,min:296.24
01-10 16:57:17.139996   516   516 I /system/bin/tzdatacheck: timezone distro dir /data/misc/zoneinfo/current does not exist. No action required.
01-10 16:57:17.256290   517   517 I bootstat: Service started: /system/bin/bootstat -r post_decrypt_time_elapsed 
01-10 16:57:17.680138   401   420 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=23.86 dur=1047.91 max=55.54 min=32.21
01-10 16:57:17.694792   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:23.714132,dur:1054.22,max:57.24,min:36.54
01-10 16:57:17.785207   529   529 I thermald: START+++++++++ 529
01-10 16:57:17.785348   529   529 I thermald: Success to write 529 to /proc/driver/thermal/clsd_pid
01-10 16:57:17.785384   529   529 I thermald: Success to write 529 to /proc/driver/thermal/clmutt_tmd_pid
01-10 16:57:17.785406   529   529 I thermald: Enter infinite loop
01-10 16:57:17.794000   544   544 W storaged: type=1400 audit(0.0:30): avc: denied { read } for path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=97 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
01-10 16:57:17.803272   523   549 E AALCust : Invalid LCM index -1, LCM count 1
01-10 16:57:17.803436   523   549 I AALCust : LCM index: 0/1
01-10 16:57:17.813334   542   542 I Netdiag : network_dignose_daemon doing
01-10 16:57:17.827129   542   561 I Netdiag : commandlistening threadStart doing
01-10 16:57:17.846871   551   551 I thermal_repeater: START+++++++++ 551
01-10 16:57:17.846873   553   553 I thermal_mgr: main argc 1.
01-10 16:57:17.847130   553   553 I thermal_mgr: argv[0] /vendor/bin/thermal_manager.
01-10 16:57:17.851127   551   551 I thermal_repeater: Success to write 551 to /proc/driver/thermal/clwmt_pid
01-10 16:57:17.851340   551   551 I thermal_repeater: Success to write 551 to /proc/driver/thermal/clmutt_tm_pid
01-10 16:57:17.851390   551   551 I thermal_repeater: RilRPC_init 
01-10 16:57:17.851701   551   551 I thermal_repeater: RilRPC_init dlopen fail: dlopen failed: library "librpcril.so" not found 
01-10 16:57:17.855326   554   554 I thermal_src: ta_main
01-10 16:57:17.857122   539   539 I MobileLogD: =====MOBILELOG START=======
01-10 16:57:17.894212   547   547 E android.hardware.sensors@1.0-service-mediatek: sensor hidl defaultPassthroughServiceImplementation start.
01-10 16:57:17.909919   553   553 I thermal_mgr: loadmtc thermal.conf
01-10 16:57:17.910100   553   553 I libMtcLoader: loadmtc
01-10 16:57:17.910564   553   553 I libMtcLoader: spa socket send fail!
01-10 16:57:17.924612   554   554 I thermal_src1: libthermal_algo_setup
01-10 16:57:17.925086   554   554 I thermal_src1: ta_daemon_init
01-10 16:57:17.925228   554   554 I thermal_src1: spa_init
01-10 16:57:17.940590   538   538 I         : [MET_LOG_D: drop_privs 2394]prctl success
01-10 16:57:17.940743   538   538 I         : [MET_LOG_D: drop_privs 2400]setgroups success
01-10 16:57:17.940766   538   538 I         : [MET_LOG_D: drop_privs 2406]setgid 2000 success
01-10 16:57:17.940789   538   538 I         : [MET_LOG_D: drop_privs 2412]setuid 2000 success
01-10 16:57:17.940844   553   553 I libMtcLoader: .tp.settings is opened.
01-10 16:57:17.965362   544   568 I ServiceManager: Waiting for service package_native...
01-10 16:57:17.974670   562   562 E         : [SYSENV]get_env_info():321 , env_buffer[0] : ed5aa600
01-10 16:57:17.982694   553   553 I libMtcLoader: readPolicy_formatV2
01-10 16:57:17.983549   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktscpu-sysrst!
01-10 16:57:17.983875   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktspmic-sysrst!
01-10 16:57:17.983980   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktsbattery-sysrst!
01-10 16:57:17.984052   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-shutdown01!
01-10 16:57:17.984120   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktscharger-sysrst!
01-10 16:57:17.984190   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktswmt-sysrst!
01-10 16:57:17.984261   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktsAP-sysrst!
01-10 16:57:17.984336   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-shutdown00!
01-10 16:57:17.984597   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-shutdown02!
01-10 16:57:17.984797   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown00!
01-10 16:57:17.984873   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown01!
01-10 16:57:17.984944   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown02!
01-10 16:57:17.985013   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown03!
01-10 16:57:17.985090   553   553 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown04!
01-10 16:57:17.986133   554   554 I thermal_src: ta_catm_init_flow
01-10 16:57:17.986259   554   554 I thermal_src: u_CATM_ON == -1, get catm init val
01-10 16:57:17.986354   554   554 I thermal_src: TTJ_D 13500,TT_H 500,TT_L 500,TT 4000,MAX_TT 800000,MIN_TT -800000,MIN_TTJ 65000,CATM_ON 2,TTJ 59000,MAX_TARGET_TJ 85000,TRIP_TPCB 43000,STEADY_TARGET_TPCB 46000
01-10 16:57:17.986376   554   554 I thermal_src: update param 4608,59000,71500,27648,-25600
01-10 16:57:18.011495   541   541 I Netd    : Netd 1.0 starting
01-10 16:57:18.019977   557   557 E agps    : [agps] ERR: [MAIN] mtk_agpsd is running ver=4.309.0
01-10 16:57:18.020188   557   557 E agps    : [agps] ERR: [MAIN] mtk_agpsd is for Android
01-10 16:57:18.030068   564   564 W libutils.threads: Thread (this=0x79bba6ce48): getTid() is undefined before run()
01-10 16:57:18.038391   543   543 I PPL/PPLAgent: PPLAgent created start
01-10 16:57:18.040454   543   543 E PPL/PPLAgent: failed to get entry for /ppl
01-10 16:57:18.040613   543   543 I PPL/PPLAgent: PPLAgent created end
01-10 16:57:18.043900   564   564 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.pq@2.0-service to pq@2.0-service.
01-10 16:57:18.051145   543   543 I PPL/PPLAgent: Registered to Service Manager. writeOnProtect=1, rawDataPart=0
01-10 16:57:18.051553   543   543 I PPL/PPLAgent: PPLAgent Service is now ready
01-10 16:57:18.059725   574   574 I /system/bin/tombstoned: tombstoned successfully initialized
01-10 16:57:18.071490   548   548 I camerahalserver: Camera HAL Server is starting..., ADV_CAM_SUPPORT(1)
01-10 16:57:18.072230   564   564 I vendor.mediatek.hardware.pq@2.0-service: Registration complete for vendor.mediatek.hardware.pq@2.0::IPictureQuality/default.
01-10 16:57:18.076766   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(149504) returning hidl_memory(0x75dd42b5f0, 149504)
01-10 16:57:18.113360   557   585 I MtkAgpsNative: Enter mtk_agps_up_init
01-10 16:57:18.113736   557   585 I MtkAgpsNative: [????] kal_create_mutex: name(tls_global) 
01-10 16:57:18.141387   569   569 I gatekeeperd: Starting gatekeeperd...
01-10 16:57:18.159598   557   585 E agps    : [agps] ERR: [Default] mtk_expat_xml_load() failed reason=[fopen() failed reason=[No such file or directory]]
01-10 16:57:18.159752   557   585 E agps    : [agps] ERR: [Default] mtk_expat_xml_load() failed reason=[fopen() failed reason=[No such file or directory]]
01-10 16:57:18.166409   557   585 E agps    : [agps] ERR: [MNL] sendto dest=[/data/agps_supl/agps_to_mnl] len=8 reason=[Connection refused]
01-10 16:57:18.166580   557   585 E agps    : [agps] ERR: [MNL] sendto dest=[/data/agps_supl/agps_to_mnl] len=48 reason=[Connection refused]
01-10 16:57:18.169086   534   534 I mediaserver: ServiceManager: 0xeb018f20
01-10 16:57:18.173961   557   585 E MtkAgpsNative: safe_write reason=[No such device]19
01-10 16:57:18.174468   557   585 E agps    : [agps] ERR: [CP] get_ccci_uart  open failed node=[/dev/ccci2_tty2] reason=[No such file or directory]
01-10 16:57:18.174657   557   585 E agps    : [agps] ERR: [CP] ccci_uart_2  open failed
01-10 16:57:18.184326   557   585 E mtk_socket: ERR: mtk_socket_connect_local() connect() failed reason=[Connection refused]111 for path=[mtk_lppe_socket_wlan]
01-10 16:57:18.184467   557   585 E mtk_socket: ERR: LPPeWlan_requestCapabilities() mtk_socket_client_connect() failed
01-10 16:57:18.184519   557   585 E mtk_socket: ERR: mtk_socket_connect_local() connect() failed reason=[Connection refused]111 for path=[mtk_lppe_socket_bt]
01-10 16:57:18.184545   557   585 E mtk_socket: ERR: LPPeBluetooth_requestCapabilities() mtk_socket_client_connect() failed
01-10 16:57:18.184595   557   585 E mtk_socket: ERR: mtk_socket_connect_local() connect() failed reason=[Connection refused]111 for path=[mtk_lppe_socket_sensor]
01-10 16:57:18.184625   557   585 E mtk_socket: ERR: LPPeSensor_requestCapabilities() mtk_socket_client_connect() failed
01-10 16:57:18.184669   557   585 E mtk_socket: ERR: mtk_socket_connect_local() connect() failed reason=[Connection refused]111 for path=[mtk_lppe_socket_network]
01-10 16:57:18.184693   557   585 E mtk_socket: ERR: LPPeNetwork_requestCapabilities() mtk_socket_client_connect() failed
01-10 16:57:18.184734   557   585 E mtk_socket: ERR: mtk_socket_connect_local() connect() failed reason=[Connection refused]111 for path=[mtk_lppe_socket_ipaddr]
01-10 16:57:18.184766   557   585 E mtk_socket: ERR: LPPeIpAddress_requestCapabilities() mtk_socket_client_connect() failed
01-10 16:57:18.184805   557   585 E mtk_socket: ERR: mtk_socket_connect_local() connect() failed reason=[Connection refused]111 for path=[mtk_lppe_socket_lbs]
01-10 16:57:18.184828   557   585 E mtk_socket: ERR: LPPeLbs_requestCapabilities() mtk_socket_client_connect() failed
01-10 16:57:18.184881   557   585 E mtk_socket: ERR: mtk_socket_connect_local() connect() failed reason=[Connection refused]111 for path=[mtk_lppe_socket_wlan]
01-10 16:57:18.184909   557   585 E mtk_socket: ERR: LPPeWlan_stopMeasurement() mtk_socket_client_connect() failed
01-10 16:57:18.184950   557   585 E mtk_socket: ERR: mtk_socket_connect_local() connect() failed reason=[Connection refused]111 for path=[mtk_lppe_socket_bt]
01-10 16:57:18.184972   557   585 E mtk_socket: ERR: LPPeBluetooth_stopMeasurement() mtk_socket_client_connect() failed
01-10 16:57:18.185018   557   585 E mtk_socket: ERR: mtk_socket_connect_local() connect() failed reason=[Connection refused]111 for path=[mtk_lppe_socket_sensor]
01-10 16:57:18.185047   557   585 E mtk_socket: ERR: LPPeSensor_stopMeasurement() mtk_socket_client_connect() failed
01-10 16:57:18.185087   557   585 E mtk_socket: ERR: mtk_socket_connect_local() connect() failed reason=[Connection refused]111 for path=[mtk_lppe_socket_network]
01-10 16:57:18.185115   557   585 E mtk_socket: ERR: LPPeNetwork_stopMeasurement() mtk_socket_client_connect() failed
01-10 16:57:18.187283   547   547 I Accelerometer: read div buf(/sys/class/sensor/m_acc_misc/accactive), mdiv 1000
01-10 16:57:18.189035   558   558 I NVRAM   : Registration complete for vendor.mediatek.hardware.nvram@1.0::INvram/default.
01-10 16:57:18.199058   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 16:57:18.202117   547   547 E Accelerometer: read bias: [0.000000, 0.000000, 0.000000]
01-10 16:57:18.202222   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 16:57:18.202431   547   547 E Accelerometer: read cali: [0, 0, 0]
01-10 16:57:18.203414   520   520 E mnl_linux: mnl_utl_load_property: Config is not set yet, ignore
01-10 16:57:18.204666   547   547 I Magnetic: misc path =/sys/class/sensor/m_mag_misc/
01-10 16:57:18.204881   547   547 I Magnetic: read div buf(/sys/class/sensor/m_mag_misc/magactive), mdiv_M 1024000
01-10 16:57:18.204980   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 16:57:18.205046   547   547 I Magnetic: read bias: [0.000000, 0.000000, 0.000000]
01-10 16:57:18.210135   547   547 I Proximity: misc path =/sys/class/sensor/m_ps_misc/
01-10 16:57:18.210287   547   547 I Proximity: read div buf(/sys/class/sensor/m_ps_misc/psactive), mdiv 100
01-10 16:57:18.210373   547   547 I Light   : misc path =/sys/class/sensor/m_als_misc/
01-10 16:57:18.210455   547   547 I Light   : read div buf(/sys/class/sensor/m_als_misc/alsactive),mdiv 100
01-10 16:57:18.210506   547   547 I Gyroscope: misc path =/sys/class/sensor/m_gyro_misc/
01-10 16:57:18.210567   547   547 I Gyroscope: read div buf(/sys/class/sensor/m_gyro_misc/gyroactive), mdiv 7506
01-10 16:57:18.210627   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 16:57:18.210680   547   547 I Gyroscope: read bias: [0.000000, 0.000000, 0.000000]
01-10 16:57:18.210710   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 16:57:18.210732   547   547 I Gyroscope: read cali: [0, 0, 0]
01-10 16:57:18.210750   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 16:57:18.210762   547   547 I Gyroscope: read temp: [0, 0, 0, 0, 0, 0]
01-10 16:57:18.212734   541   541 I Netd    : Creating child chains: 21.0ms
01-10 16:57:18.213003   541   541 I Netd    : Setting up OEM hooks: 0.3ms
01-10 16:57:18.219359   547   547 E Pressure: couldn't find sensor device , 0.1
01-10 16:57:18.219546   547   547 E Pressure: couldn't find input device ,0.1
01-10 16:57:18.219596   547   547 E HUMIDITY: couldn't find sensor device
01-10 16:57:18.219631   547   547 E HUMIDITY: couldn't find input device 
01-10 16:57:18.219655   547   547 E StepRecognize: couldn't find input device
01-10 16:57:18.219680   547   547 I StepRecognize: misc path =
01-10 16:57:18.233636   541   541 I Netd    : Setting up FirewallController hooks: 20.6ms
01-10 16:57:18.233672   547   547 E StepRecognize: open misc path /sys/class/sensor/m_step_c_misc/step_cactive fail 
01-10 16:57:18.233794   547   547 E Pedometer: couldn't find input device
01-10 16:57:18.233907   547   547 I Pedometer: misc path =
01-10 16:57:18.233941   547   547 E Pedometer: open misc path /sys/class/sensor/m_pedo_misc/pedoactive fail
01-10 16:57:18.234003   547   547 E Activity: couldn't find input device
01-10 16:57:18.234034   547   547 E Activity: couldn't find input device 
01-10 16:57:18.234065   547   547 E Situation: couldn't find input device
01-10 16:57:18.234090   547   547 I Situation: misc path =
01-10 16:57:18.234121   547   547 E Fusion  : open fusion misc path /sys/class/sensor/m_fusion_misc/fusionactive fail 
01-10 16:57:18.234171   547   547 I android.hardware.sensors@1.0-service-mediatek: sensor hidl load sensor module success.
01-10 16:57:18.235642   547   547 I ServiceManagement: Removing namespace from process name android.hardware.sensors@1.0-service-mediatek to sensors@1.0-ser.
01-10 16:57:18.237206   547   547 I android.hardware.sensors@1.0-service-mediatek: Registration complete for android.hardware.sensors@1.0::ISensors/default.
01-10 16:57:18.251290   563   563 E         : safe_sendto: safe_sendto() sendto() failed path=[mtk_hal2mnl] ret=-1 reason=[Connection refused]111
01-10 16:57:18.252848   541   541 I Netd    : Setting up NatController hooks: 19.2ms
01-10 16:57:18.261715   541   541 I Netd    : Setting up BandwidthController hooks: 8.9ms
01-10 16:57:18.261802   541   541 I Netd    : Setting up IdletimerController hooks: 0.1ms
01-10 16:57:18.264359   563   563 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.gnss@1.1-service to gnss@1.1-servic.
01-10 16:57:18.277507   541   541 I Netd    : Disabling bandwidth control: 15.6ms
01-10 16:57:18.279442   541   541 E Netd    : cannot find interface dummy0
01-10 16:57:18.280100   541   541 I Netd    : Initializing RouteController: 2.6ms
01-10 16:57:18.320165   536   536 I mediametrics: ServiceManager: 0x70e88316c0
01-10 16:57:18.329153   548   548 I mtkcam-devicemgr: [CameraDeviceManagerBase] "internal" this:0xe6e1a004 persist.mtkcam.aosp_hal_version: persist.mtkcam.aosp_hal_legacy:1 persist.mtkcam.aosp_hal_legacy:0
01-10 16:57:18.330854   563   563 I vendor.mediatek.hardware.gnss@1.1-service: Registration complete for vendor.mediatek.hardware.gnss@1.1::IMtkGnss/default.
01-10 16:57:18.331821   571   571 I ProgramBinary/Server: Get disable program binary service property (0)
01-10 16:57:18.331977   571   571 I ProgramBinary/Server: Program binary server is starting...
01-10 16:57:18.332508   571   571 I ProgramBinary/Service: ProgramBinaryService created.
01-10 16:57:18.332629   571   571 I ProgramBinary/Service: ProgramBinaryService init...
01-10 16:57:18.332652   571   571 I ProgramBinary/Service: ProgramBinaryService disable debugging.
01-10 16:57:18.332666   571   571 I ProgramBinary/Service: ProgramBinaryService disable binary content debugging.
01-10 16:57:18.344967   541   541 I Netd    : Registering NetdNativeService: 63.2ms
01-10 16:57:18.345427   541   541 I Netd    : Starting CommandListener: 0.5ms
01-10 16:57:18.347777   540   540 I advcamserver: ServiceManager: 0xea518ec0
01-10 16:57:18.347914   540   540 I advcam/AdvCamService: AdvCamService started (pid=540)
01-10 16:57:18.348104   571   571 I ProgramBinary/Server: Program binary service is added to service manager.
01-10 16:57:18.348203   571   571 I ProgramBinary/Server: Execute program_binary_builder.
01-10 16:57:18.348829   571   571 I ProgramBinary/Server: Parent process for handling binder: Pid of child is 649.
01-10 16:57:18.355901   541   541 I Netd    : Registering NetdHwService: 10.4ms
01-10 16:57:18.356033   541   541 I Netd    : Netd started in 381ms
01-10 16:57:18.356917   649   649 I ProgramBinary/Server: Child process for building program: Pid is 649.
01-10 16:57:18.359213   540   540 I mmsdk/MMSdkService: MMSdkService started (pid=540)
01-10 16:57:18.416327   643   643 I recovery: Recovery image already installed
01-10 16:57:18.451282   546   546 I /vendor/bin/hw/android.hardware.media.omx@1.0-service: mediacodecservice starting
01-10 16:57:18.466419   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: allowing syscall: clock_gettime
01-10 16:57:18.466642   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: allowing syscall: connect
01-10 16:57:18.466724   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: allowing syscall: fcntl64
01-10 16:57:18.466783   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: allowing syscall: socket
01-10 16:57:18.466839   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: allowing syscall: writev
01-10 16:57:18.467897   546   546 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[546]: logging seccomp filter failures
01-10 16:57:18.497945   546   546 W MediaCodecsXmlParser: unable to open media codecs configuration xml file: /data/misc/media/media_codecs_profiling_results.xml
01-10 16:57:18.498091   546   546 W MediaCodecsXmlParser: parseTopLevelXMLFile(/data/misc/media/media_codecs_profiling_results.xml) failed
01-10 16:57:18.498274   546   546 E MediaCodecsXmlParser: Cannot find the role for a decoder of type audio/x-ms-wma
01-10 16:57:18.500094   546   546 I ServiceManagement: Removing namespace from process name android.hardware.media.omx@1.0-service to omx@1.0-service.
01-10 16:57:18.512074   539   539 I MobileLogD: boot mode is 0
01-10 16:57:18.528286   521   521 I zygote64: option[0]=-Xzygote
01-10 16:57:18.528440   521   521 I zygote64: option[1]=-Xusetombstonedtraces
01-10 16:57:18.528468   521   521 I zygote64: option[2]=exit
01-10 16:57:18.528479   521   521 I zygote64: option[3]=vfprintf
01-10 16:57:18.528490   521   521 I zygote64: option[4]=sensitiveThread
01-10 16:57:18.528501   521   521 I zygote64: option[5]=-verbose:gc
01-10 16:57:18.528512   521   521 I zygote64: option[6]=-Xms4m
01-10 16:57:18.528522   521   521 I zygote64: option[7]=-Xmx256m
01-10 16:57:18.528534   521   521 I zygote64: option[8]=-XX:HeapGrowthLimit=128m
01-10 16:57:18.528546   521   521 I zygote64: option[9]=-Xusejit:true
01-10 16:57:18.528557   521   521 I zygote64: option[10]=-Xjitsaveprofilinginfo
01-10 16:57:18.528571   521   521 I zygote64: option[11]=-agentlib:jdwp=transport=dt_android_adb,suspend=n,server=y
01-10 16:57:18.528585   521   521 I zygote64: option[12]=-Ximage-compiler-option
01-10 16:57:18.528597   521   521 I zygote64: option[13]=--runtime-arg
01-10 16:57:18.528624   521   521 I zygote64: option[14]=-Ximage-compiler-option
01-10 16:57:18.528635   521   521 I zygote64: option[15]=-Xms64m
01-10 16:57:18.528647   521   521 I zygote64: option[16]=-Ximage-compiler-option
01-10 16:57:18.528658   521   521 I zygote64: option[17]=--runtime-arg
01-10 16:57:18.528669   521   521 I zygote64: option[18]=-Ximage-compiler-option
01-10 16:57:18.528679   521   521 I zygote64: option[19]=-Xmx64m
01-10 16:57:18.528691   521   521 I zygote64: option[20]=-Ximage-compiler-option
01-10 16:57:18.528703   521   521 I zygote64: option[21]=--image-classes=/system/etc/preloaded-classes
01-10 16:57:18.528714   521   521 I zygote64: option[22]=-Ximage-compiler-option
01-10 16:57:18.528727   521   521 I zygote64: option[23]=--compiled-classes=/system/etc/compiled-classes
01-10 16:57:18.528738   521   521 I zygote64: option[24]=-Ximage-compiler-option
01-10 16:57:18.528750   521   521 I zygote64: option[25]=--dirty-image-objects=/system/etc/dirty-image-objects
01-10 16:57:18.528762   521   521 I zygote64: option[26]=-Xcompiler-option
01-10 16:57:18.528776   521   521 I zygote64: option[27]=--runtime-arg
01-10 16:57:18.528789   521   521 I zygote64: option[28]=-Xcompiler-option
01-10 16:57:18.528800   521   521 I zygote64: option[29]=-Xms64m
01-10 16:57:18.528811   521   521 I zygote64: option[30]=-Xcompiler-option
01-10 16:57:18.528822   521   521 I zygote64: option[31]=--runtime-arg
01-10 16:57:18.528875   521   521 I zygote64: option[32]=-Xcompiler-option
01-10 16:57:18.528885   521   521 I zygote64: option[33]=-Xmx512m
01-10 16:57:18.528898   521   521 I zygote64: option[34]=-Ximage-compiler-option
01-10 16:57:18.528909   521   521 I zygote64: option[35]=--instruction-set-variant=cortex-a53
01-10 16:57:18.528920   521   521 I zygote64: option[36]=-Xcompiler-option
01-10 16:57:18.528932   521   521 I zygote64: option[37]=--instruction-set-variant=cortex-a53
01-10 16:57:18.528943   521   521 I zygote64: option[38]=-Ximage-compiler-option
01-10 16:57:18.528954   521   521 I zygote64: option[39]=--instruction-set-features=default
01-10 16:57:18.528985   521   521 I zygote64: option[40]=-Xcompiler-option
01-10 16:57:18.528998   521   521 I zygote64: option[41]=--instruction-set-features=default
01-10 16:57:18.529009   521   521 I zygote64: option[42]=-Duser.locale=zh-Hans-CN
01-10 16:57:18.529020   521   521 I zygote64: option[43]=--cpu-abilist=arm64-v8a
01-10 16:57:18.529035   521   521 I zygote64: option[44]=-Xfingerprint:Datalogic/dl35cn/dl35:8.1.0/1.07.15.20191227/1577435794:user/release-keys
01-10 16:57:18.534901   535   535 W /system/bin/mediaextractor: libminijail[535]: allowing syscall: connect
01-10 16:57:18.535184   535   535 W /system/bin/mediaextractor: libminijail[535]: allowing syscall: fcntl
01-10 16:57:18.535270   535   535 W /system/bin/mediaextractor: libminijail[535]: allowing syscall: sendto
01-10 16:57:18.535317   535   535 W /system/bin/mediaextractor: libminijail[535]: allowing syscall: socket
01-10 16:57:18.535366   535   535 W /system/bin/mediaextractor: libminijail[535]: allowing syscall: writev
01-10 16:57:18.535780   535   535 W /system/bin/mediaextractor: libminijail[535]: logging seccomp filter failures
01-10 16:57:18.539253   546   546 W MediaCodecsXmlParser: unable to open media codecs configuration xml file: /data/misc/media/media_codecs_profiling_results.xml
01-10 16:57:18.539425   546   546 W MediaCodecsXmlParser: parseTopLevelXMLFile(/data/misc/media/media_codecs_profiling_results.xml) failed
01-10 16:57:18.539722   546   546 I ServiceManagement: Removing namespace from process name android.hardware.media.omx@1.0-service to omx@1.0-service.
01-10 16:57:18.548168   546   546 I /vendor/bin/hw/android.hardware.media.omx@1.0-service: Treble OMX service created.
01-10 16:57:18.565739   539   539 I MobileLogD: set cur path: /data/log_temp/boot/
01-10 16:57:18.566524   539   539 I MobileLogD: ld_p type: 0, id: 0, log_name: main_log, rotate_size: 15728640
01-10 16:57:18.566744   539   539 I MobileLogD: ld_p type: 0, id: 1, log_name: radio_log, rotate_size: 5242880
01-10 16:57:18.567003   539   539 I MobileLogD: ld_p type: 0, id: 2, log_name: events_log, rotate_size: 5242880
01-10 16:57:18.567134   539   539 I MobileLogD: ld_p type: 0, id: 3, log_name: sys_log, rotate_size: 5242880
01-10 16:57:18.567233   539   539 I MobileLogD: ld_p type: 0, id: 4, log_name: crash_log, rotate_size: 3145728
01-10 16:57:18.567308   539   539 I MobileLogD: Read kernel log from kmsg
01-10 16:57:18.567395   539   539 I MobileLogD: ld_p type: 1, id: 6, log_name: kernel_log, rotate_size: 10485760
01-10 16:57:18.567544   539   539 I MobileLogD: ld_p type: 1, id: 7, log_name: atf_log, rotate_size: 10485760
01-10 16:57:18.567734   539   539 I MobileLogD: ld_p type: 1, id: 8, log_name: gz_log, rotate_size: 3145728
01-10 16:57:18.567825   539   539 E MobileLogD: open /proc/gz_log fail(No such file or directory)
01-10 16:57:18.568362   559   663 E HWMLIB  : gsensor_set_cali: set_cali err: -1
01-10 16:57:18.569405   559   664 E HWMLIB  : gyroscope_set_cali: set_cali err: -1
01-10 16:57:18.570298   559   665 E HWMLIB  : alsps_set_cali: set_cali err: -1
01-10 16:57:18.580381   527   527 I cameraserver: ServiceManager: 0xf3618f40
01-10 16:57:18.580550   527   527 I CameraService: CameraService started (pid=527)
01-10 16:57:18.601850   539   539 I MobileLogD: ld_p type: 1, id: 9, log_name: bsp_log, rotate_size: 5242880
01-10 16:57:18.655947   672   672 I MobileLogD: bsp ftrace buffer initializing...
01-10 16:57:18.683775   539   539 I MobileLogD: ld_p type: 1, id: 11, log_name: scp_log, rotate_size: 3145728
01-10 16:57:18.684806   539   539 E MobileLogD: open /dev/scp fail(No such file or directory)
01-10 16:57:18.689728   537   537 I mediaserver: ServiceManager: 0xef5d8740
01-10 16:57:18.691093   537   537 W BatteryNotifier: batterystats service unavailable!
01-10 16:57:18.707539   520   520 E mnld_uti: read_NVRAM: not 3332 UART port
01-10 16:57:18.707859   520   520 E gps_controlller: hasAlmanac: open file(/nvcfg/almanac.dat) fail
01-10 16:57:18.718777   401   580 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=15.40 dur=1038.78 max=100.09 min=35.94
01-10 16:57:18.720699   520   520 E mtk_lbs_utility: safe_sendto: safe_sendto() sendto() failed path=[mtk_mnl2hal] ret=-1 reason=[Connection refused]111
01-10 16:57:18.732065   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:15.425001,dur:1037.28,max:114.26,min:19.85
01-10 16:57:18.733700   557   585 E MtkAgpsNative: safe_write reason=[No such device]19
01-10 16:57:18.765322   524   524 I FastMixerState: sMaxFastTracks = 8
01-10 16:57:18.773034   539   539 I MobileLogD: ld_p type: 1, id: 12, log_name: scp_b_log, rotate_size: 3145728
01-10 16:57:18.773342   539   539 E MobileLogD: open /dev/scp_B fail(No such file or directory)
01-10 16:57:18.783638   524   524 W BatteryNotifier: batterystats service unavailable!
01-10 16:57:18.793815   524   524 I AudioFlinger: Using default 3000 mSec as standby time.
01-10 16:57:18.815643   524   524 E APM::Serializer: deserialize: Could not parse /odm/etc/audio_policy_configuration.xml document.
01-10 16:57:18.826541   406   406 I ccci_mdinit: (1):Gotten ret=0,nvram_init=Ready!
01-10 16:57:18.829200   406   406 I ccci_mdinit: (1):md_img_exist 0 0 0 0
01-10 16:57:18.846636   539   539 I MobileLogD: ld_p type: 1, id: 13, log_name: sspm_log, rotate_size: 3145728
01-10 16:57:18.852830   539   539 E MobileLogD: open tagmap done
01-10 16:57:18.853139   539   539 I MobileLogD: current folder size limited is 300 MB, factor is 1
01-10 16:57:18.853253   539   539 I MobileLogD: main_log, rotation size 15728640
01-10 16:57:18.853350   539   539 I MobileLogD: radio_log, rotation size 5242880
01-10 16:57:18.853438   539   539 I MobileLogD: events_log, rotation size 5242880
01-10 16:57:18.853527   539   539 I MobileLogD: sys_log, rotation size 5242880
01-10 16:57:18.853624   539   539 I MobileLogD: crash_log, rotation size 3145728
01-10 16:57:18.853725   539   539 I MobileLogD: kernel_log, rotation size 10485760
01-10 16:57:18.853864   539   539 I MobileLogD: atf_log, rotation size 10485760
01-10 16:57:18.853957   539   539 I MobileLogD: bsp_log, rotation size 5242880
01-10 16:57:18.854044   539   539 I MobileLogD: sspm_log, rotation size 3145728
01-10 16:57:18.854073   539   539 I MobileLogD: create dir /data/log_temp/boot/
01-10 16:57:18.858308   406   707 I ccci_mdinit: (1):Update time to md by ipc port fail(25)
01-10 16:57:18.887947   672   672 I MobileLogD: bsp ftrace buffer initialize done
01-10 16:57:18.908053   406   406 I ccci_mdinit: (1):Gotten ret=0,nvram_init=Ready!
01-10 16:57:18.913489   406   406 I ccci_mdinit: (1):USP_SBP:persist.mtk_usp_md_sbp_code not exist
01-10 16:57:18.913785   406   406 I ccci_mdinit: (1):get_cip_sbp_setting, file /custom/etc/firmware/CIP_MD_SBP NOT exists!
01-10 16:57:18.913900   406   406 I ccci_mdinit: (1):PRJ_SBP_ID:ro.mtk_md_sbp_custom_value not exist, using default value
01-10 16:57:18.916676   649   649 I ProgramBinary/Builder: Program binary builder is starting...
01-10 16:57:18.916885   649   649 I ProgramBinary/Builder: Build program consctruct.
01-10 16:57:18.916896   649   649 I ProgramBinary/Builder: Build program is running...
01-10 16:57:18.923968   404   404 E ccci_fsd(1): FS_OTP_init:otp_open failed, errno=2!
01-10 16:57:18.924103   404   404 E ccci_fsd(1): can't catch SIGKILL
01-10 16:57:18.946634   406   406 I ccci_mdinit: (1):SBP_SUB_ID:persist.operator.subid not exist
01-10 16:57:18.946716   406   406 I ccci_mdinit: (1):set md boot data:mdl=2 sbp=0 dbg_dump=-1 sbp_sub=0
01-10 16:57:18.946780   406   406 I ccci_mdinit: (1):start_service init.svc.ccci_fsd, current state:running, returned:7
01-10 16:57:18.949863   406   406 I ccci_mdinit: (1):wait_for_property:success(init.svc.ccci_fsd=running), loop:600
01-10 16:57:18.974847   544   568 I ServiceManager: Waiting for service package_native...
01-10 16:57:18.986860   575   575 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 16:57:18.987234   527   527 I CameraService: CameraService process starting
01-10 16:57:18.987898   575   575 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 16:57:18.988053   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -F oem_mobile 
01-10 16:57:18.988738   527   527 W BatteryNotifier: batterystats service unavailable!
01-10 16:57:18.993354   527   527 W BatteryNotifier: batterystats service unavailable!
01-10 16:57:18.998770   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.camera.provider@2.4::ICameraProvider/legacy/0 in either framework or device manifest.
01-10 16:57:19.009737   522   522 I zygote  : option[0]=-Xzygote
01-10 16:57:19.009830   522   522 I zygote  : option[1]=-Xusetombstonedtraces
01-10 16:57:19.009853   522   522 I zygote  : option[2]=exit
01-10 16:57:19.009873   522   522 I zygote  : option[3]=vfprintf
01-10 16:57:19.009892   522   522 I zygote  : option[4]=sensitiveThread
01-10 16:57:19.009910   522   522 I zygote  : option[5]=-verbose:gc
01-10 16:57:19.009929   522   522 I zygote  : option[6]=-Xms4m
01-10 16:57:19.009948   522   522 I zygote  : option[7]=-Xmx256m
01-10 16:57:19.009968   522   522 I zygote  : option[8]=-XX:HeapGrowthLimit=128m
01-10 16:57:19.009987   522   522 I zygote  : option[9]=-Xusejit:true
01-10 16:57:19.010008   522   522 I zygote  : option[10]=-Xjitsaveprofilinginfo
01-10 16:57:19.010031   522   522 I zygote  : option[11]=-agentlib:jdwp=transport=dt_android_adb,suspend=n,server=y
01-10 16:57:19.010052   522   522 I zygote  : option[12]=-Ximage-compiler-option
01-10 16:57:19.010071   522   522 I zygote  : option[13]=--runtime-arg
01-10 16:57:19.010091   522   522 I zygote  : option[14]=-Ximage-compiler-option
01-10 16:57:19.010110   522   522 I zygote  : option[15]=-Xms64m
01-10 16:57:19.010130   522   522 I zygote  : option[16]=-Ximage-compiler-option
01-10 16:57:19.010150   522   522 I zygote  : option[17]=--runtime-arg
01-10 16:57:19.010176   522   522 I zygote  : option[18]=-Ximage-compiler-option
01-10 16:57:19.010194   522   522 I zygote  : option[19]=-Xmx64m
01-10 16:57:19.010214   522   522 I zygote  : option[20]=-Ximage-compiler-option
01-10 16:57:19.010237   522   522 I zygote  : option[21]=--image-classes=/system/etc/preloaded-classes
01-10 16:57:19.010258   522   522 I zygote  : option[22]=-Ximage-compiler-option
01-10 16:57:19.010277   522   522 I zygote  : option[23]=--compiled-classes=/system/etc/compiled-classes
01-10 16:57:19.010297   522   522 I zygote  : option[24]=-Ximage-compiler-option
01-10 16:57:19.010318   522   522 I zygote  : option[25]=--dirty-image-objects=/system/etc/dirty-image-objects
01-10 16:57:19.010339   522   522 I zygote  : option[26]=-Xcompiler-option
01-10 16:57:19.010359   522   522 I zygote  : option[27]=--runtime-arg
01-10 16:57:19.010378   522   522 I zygote  : option[28]=-Xcompiler-option
01-10 16:57:19.010397   522   522 I zygote  : option[29]=-Xms64m
01-10 16:57:19.010415   522   522 I zygote  : option[30]=-Xcompiler-option
01-10 16:57:19.010433   522   522 I zygote  : option[31]=--runtime-arg
01-10 16:57:19.010452   522   522 I zygote  : option[32]=-Xcompiler-option
01-10 16:57:19.010470   522   522 I zygote  : option[33]=-Xmx512m
01-10 16:57:19.010492   522   522 I zygote  : option[34]=-Ximage-compiler-option
01-10 16:57:19.010514   522   522 I zygote  : option[35]=--instruction-set-variant=cortex-a53
01-10 16:57:19.010533   522   522 I zygote  : option[36]=-Xcompiler-option
01-10 16:57:19.010553   522   522 I zygote  : option[37]=--instruction-set-variant=cortex-a53
01-10 16:57:19.010573   522   522 I zygote  : option[38]=-Ximage-compiler-option
01-10 16:57:19.010592   522   522 I zygote  : option[39]=--instruction-set-features=default
01-10 16:57:19.010611   522   522 I zygote  : option[40]=-Xcompiler-option
01-10 16:57:19.010631   522   522 I zygote  : option[41]=--instruction-set-features=default
01-10 16:57:19.010653   522   522 I zygote  : option[42]=-Duser.locale=zh-Hans-CN
01-10 16:57:19.010673   522   522 I zygote  : option[43]=--cpu-abilist=armeabi-v7a,armeabi
01-10 16:57:19.010695   522   522 I zygote  : option[44]=-Xfingerprint:Datalogic/dl35cn/dl35:8.1.0/1.07.15.20191227/1577435794:user/release-keys
01-10 16:57:19.031088   575   575 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 16:57:19.031410   575   575 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 16:57:19.031565   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -F oem_mobile 
01-10 16:57:19.063098   351   351 E SELinux : avc:  denied  { find } for interface=android.hardware.configstore::ISurfaceFlingerConfigs sid=u:r:program_binary:s0 pid=649 scontext=u:r:program_binary:s0 tcontext=u:object_r:hal_configstore_ISurfaceFlingerConfigs:s0 tclass=hwservice_manager permissive=0
01-10 16:57:19.064856   649   649 I /system/bin/program_binary_builder: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0 (default)
01-10 16:57:19.065069   649   649 I ProgramBinary/Builder: EGL version 1.4
01-10 16:57:19.094869   726   726 I AEE_AED : Built Mar 23 2018 13:42:39
01-10 16:57:19.101469   727   727 I AEE_AEDV: Built Mar 23 2018 13:42:26
01-10 16:57:19.104398   727   727 I AEE_AEDV: socket server: android:aee_aedv32
01-10 16:57:19.104419   726   726 I AEE_AED : socket server: android:aee_aed
01-10 16:57:19.105280   727   727 I AEE_AEDV: AED config
01-10 16:57:19.105280   727   727 I AEE_AEDV:   mode '4'
01-10 16:57:19.105280   727   727 I AEE_AEDV:   exp level '0
01-10 16:57:19.105280   727   727 I AEE_AEDV:   dal enable '0'
01-10 16:57:19.105280   727   727 I AEE_AEDV:   db count '4'
01-10 16:57:19.105280   727   727 I AEE_AEDV:   fatal db count '4'
01-10 16:57:19.105280   727   727 I AEE_AEDV:  db storage '2'
01-10 16:57:19.105280   727   727 I AEE_AEDV:   SMP Info => 1
01-10 16:57:19.105283   726   726 I AEE_AED : AED config
01-10 16:57:19.105283   726   726 I AEE_AED :   mode '4'
01-10 16:57:19.105283   726   726 I AEE_AED :   exp level '0
01-10 16:57:19.105283   726   726 I AEE_AED :   dal enable '0'
01-10 16:57:19.105283   726   726 I AEE_AED :   db count '4'
01-10 16:57:19.105283   726   726 I AEE_AED :   fatal db count '4'
01-10 16:57:19.105283   726   726 I AEE_AED :  db storage '2'
01-10 16:57:19.105283   726   726 I AEE_AED :   SMP Info => 1
01-10 16:57:19.105806   575   575 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 16:57:19.106210   575   575 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 16:57:19.106398   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -X oem_mobile 
01-10 16:57:19.112104   727   727 E AEE_AEDV: aee:vrttd_64Rtt command connect 64_socket fail: Connection refused
01-10 16:57:19.112163   727   727 E AEE_AEDV: aee_exception_running_64: command failed
01-10 16:57:19.112181   727   727 E AEE_AEDV: init_aed_setting: Error: Can't get running exception 
01-10 16:57:19.112258   727   727 E AEE_AEDV: Can't remove file /data/vendor/mtklog/aee_exp/temp: No such file or directory
01-10 16:57:19.112391   727   727 E AEE_AEDV: Can't remove file /sdcard/mtklog/aee_exp/temp: No such file or directory
01-10 16:57:19.112431   727   727 E AEE_AEDV: Can't remove file /storage/ext_sd/mtklog/aee_exp/temp: No such file or directory
01-10 16:57:19.117228   749   749 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 16:57:19.117361   749   749 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 16:57:19.117381   749   749 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 16:57:19.118037   725   725 I AEE_AED : Built Mar 23 2018 13:42:19
01-10 16:57:19.118302   749   749 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 16:57:19.118490   749   749 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 16:57:19.119384   725   725 I AEE_AED : socket server: android:aee_aed32
01-10 16:57:19.120010   749   749 W AEE_AEDV: ipanic heahder: magic:0, version:0, size:0, datas:0
01-10 16:57:19.120065   749   749 W AEE_AEDV: ipanic heahder: dhblk:0, blksize:0, partsize:0, bufsize:0
01-10 16:57:19.120112   725   725 I AEE_AED : AED config
01-10 16:57:19.120112   725   725 I AEE_AED :   mode '4'
01-10 16:57:19.120112   725   725 I AEE_AED :   exp level '0
01-10 16:57:19.120112   725   725 I AEE_AED :   dal enable '0'
01-10 16:57:19.120112   725   725 I AEE_AED :   db count '4'
01-10 16:57:19.120112   725   725 I AEE_AED :   fatal db count '4'
01-10 16:57:19.120112   725   725 I AEE_AED :  db storage '2'
01-10 16:57:19.120112   725   725 I AEE_AED :   SMP Info => 1
01-10 16:57:19.120778   749   749 W AEE_AEDV: aed_reboot_session, no valid ipanic header, ignored
01-10 16:57:19.121591   749   749 I AEE_AEDV: wdt_status = 2, fiq_step=0, exception_type:0 
01-10 16:57:19.121793   749   749 I AEE_AEDV: powerup reason:wdt_by_pass_pwk
01-10 16:57:19.121793   749   749 I AEE_AEDV: 
01-10 16:57:19.121813   749   749 I AEE_AEDV: reboot_reason = 0
01-10 16:57:19.122029   749   749 E         : mrdump_support_user_load: null mrdump lk version
01-10 16:57:19.122109   749   749 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 16:57:19.122140   749   749 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 16:57:19.122157   749   749 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 16:57:19.122758   749   749 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 16:57:19.122833   749   749 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 16:57:19.127962   725   725 E AEE_AED : Can't remove file /data/aee_exp/temp: No such file or directory
01-10 16:57:19.129258   729   729 I AEE_AEDV: Built Mar 23 2018 13:42:46
01-10 16:57:19.130101   729   729 I AEE_AEDV: socket server: android:aee_aedv
01-10 16:57:19.130675   729   729 I AEE_AEDV: AED config
01-10 16:57:19.130675   729   729 I AEE_AEDV:   mode '4'
01-10 16:57:19.130675   729   729 I AEE_AEDV:   exp level '0
01-10 16:57:19.130675   729   729 I AEE_AEDV:   dal enable '0'
01-10 16:57:19.130675   729   729 I AEE_AEDV:   db count '4'
01-10 16:57:19.130675   729   729 I AEE_AEDV:   fatal db count '4'
01-10 16:57:19.130675   729   729 I AEE_AEDV:  db storage '2'
01-10 16:57:19.130675   729   729 I AEE_AEDV:   SMP Info => 1
01-10 16:57:19.162266   575   575 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 16:57:19.163784   575   575 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 16:57:19.164007   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -X oem_mobile 
01-10 16:57:19.306124   575   575 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 16:57:19.308535   575   575 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 16:57:19.308761   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -F oem_wifi 
01-10 16:57:19.345085   575   575 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 16:57:19.345810   575   575 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 16:57:19.345977   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -F oem_wifi 
01-10 16:57:19.378709   575   575 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 16:57:19.379350   575   575 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 16:57:19.379517   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -X oem_wifi 
01-10 16:57:19.422635   575   575 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 16:57:19.423497   575   575 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 16:57:19.423666   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -X oem_wifi 
01-10 16:57:19.429710   539   539 I MobileLogD: logd_sock: 19
01-10 16:57:19.431873   539   539 I MobileLogD: init debug
01-10 16:57:19.438492   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.438661   564   583 D PQTransition: onTransition: TRS: Mode2 (33)
01-10 16:57:19.438696   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.438774   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.439587   539   769 I MobileLogD: read thread 769
01-10 16:57:19.440039   539   769 E MobileLogD: /sys/kernel/debug/tracing/instances/bsp/trace_pipe is ready now, and open it.
01-10 16:57:19.444234   539   770 I MobileLogD: write thread 770
01-10 16:57:19.454103   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.457538   523   549 D AAL     : 01-10 04:57:19.381 BL= 987,ESS= 256, 01-10 04:57:19.400 BL= 988,ESS= 256, 01-10 04:57:19.419 BL= 989,ESS= 256, 01-10 04:57:19.438 BL= 990,ESS= 256, 01-10 04:57:19.457 BL= 991,ESS= 256, 
01-10 16:57:19.457870   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.457941   564   583 D PQTransition: onTransition: TRS: Mode2 (34)
01-10 16:57:19.458039   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.458116   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.461908   404   404 E ccci_fsd(1): FS_IsReadOnly: [error]fail on file: /vendor/nvdata/md/FAT9BC6FD43.log, error=2
01-10 16:57:19.474714   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.476026   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.476133   564   583 D PQTransition: onTransition: TRS: Mode2 (35)
01-10 16:57:19.476217   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.476321   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.482742   649   649 D HWUIExtension: 9 Program id 12, key 0x0002000800000001, offset 48260, binaryLength 5140 within 50654ns
01-10 16:57:19.483875   649   649 D HWUIExtension: 10 Program id 13, key 0x0000001800000000, offset 53400, binaryLength 4648 within 947ns
01-10 16:57:19.494671   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.494759   564   583 D PQTransition: onTransition: TRS: Mode2 (36)
01-10 16:57:19.494833   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.494893   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.495838   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.508634   771   771 D AEE_AED : Rtt command(type:0, file_path:3 arg0:539)
01-10 16:57:19.508978   771   771 D AEE_AED : aee:rttdRtt waiting daemon finish the job...
01-10 16:57:19.509702   725   725 D AEE_AED : $===AEE===AEE===AEE===$
01-10 16:57:19.509788   725   725 D AEE_AED : p 0 poll events 1 revents 1
01-10 16:57:19.509847   725   725 D AEE_AED : requesting from: pid=771 cmd=0
01-10 16:57:19.509906   725   725 E AEE_AED : switch AEE mode fail because of customer non-eng build
01-10 16:57:19.513575   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.513677   564   583 D PQTransition: onTransition: TRS: Mode2 (37)
01-10 16:57:19.513709   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.513810   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.515086   771   771 E AEE_AED : Rtt command read socket fail: Not a data message
01-10 16:57:19.515435   771   771 D AEE_AED : aee:rttd_64Rtt waiting 64_daemon finish the job...
01-10 16:57:19.516922   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.506000   771   771 W aee     : type=1400 audit(0.0:31): avc: denied { getattr } for path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=5378 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
01-10 16:57:19.526208   726   726 D AEE_AED : $===AEE===AEE===AEE===$
01-10 16:57:19.526320   726   726 D AEE_AED : p 0 poll events 1 revents 1
01-10 16:57:19.526393   726   726 D AEE_AED : requesting from: pid=771 cmd=0
01-10 16:57:19.526447   726   726 E AEE_AED : switch AEE mode fail because of customer non-eng build
01-10 16:57:19.526607   771   771 E AEE_AED : Rtt command read 64_socket fail: Not a data message
01-10 16:57:19.526721   771   771 D AEE_AED : switch AEE mode fail
01-10 16:57:19.529418   380   699 E AudioParamParser-vnd: audioTypeLoadParamUnitHash(), No paramUnit element found!
01-10 16:57:19.529873   530   530 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 16:57:19.532435   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.532534   564   583 D PQTransition: onTransition: TRS: Mode2 (38)
01-10 16:57:19.532570   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.532661   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.537594   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.539521   530   530 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base_mtk.so absent, libpq_cust_mtk.so absent
01-10 16:57:19.540148   530   530 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 16:57:19.540645   530   530 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 16:57:19.540782   530   530 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 16:57:19.541182   530   530 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 16:57:19.545988   530   530 I         : [VT][SRV]ServiceManager: 0xf1b1f8c0
01-10 16:57:19.546045   530   530 I         : [VT][SRV]before VTService_instantiate
01-10 16:57:19.546096   530   530 E VT      : [VTS] before addService
01-10 16:57:19.551233   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.551326   564   583 D PQTransition: onTransition: TRS: Mode2 (39)
01-10 16:57:19.551406   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.551734   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.551839   523   549 D AAL     : 01-10 04:57:19.477 BL= 992,ESS= 256, 01-10 04:57:19.494 BL= 993,ESS= 256, 01-10 04:57:19.515 BL= 994,ESS= 256, 01-10 04:57:19.532 BL= 995,ESS= 256, 01-10 04:57:19.551 BL= 996,ESS= 256, 
01-10 16:57:19.552870   649   649 D HWUIExtension: 11 Program id 14, key 0x0002001800500044, offset 58048, binaryLength 10924 within 68776ns
01-10 16:57:19.553644   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.554603   380   699 D AudioSmartPaController: initSmartPaAttribute(), spkType: int_lo_buf, isSmartPAUsed: 0, SmartPA dynamic detect: 0
01-10 16:57:19.554751   380   699 D AudioALSAHardwareResourceManager: AudioALSAHardwareResourceManager()
01-10 16:57:19.560540   380   699 D AudioALSACodecDeviceBase: AudioALSACodecDeviceBase()
01-10 16:57:19.560684   380   699 D AudioALSACodecDeviceOutEarphonePMIC: AudioALSACodecDeviceOutEarphonePMIC()
01-10 16:57:19.560788   380   699 D AudioALSACodecDeviceOutEarphonePMIC: DeviceDoDcCalibrate(), ctl Dctrim_Control_Switch = 2
01-10 16:57:19.560809   380   699 D AudioALSACodecDeviceOutEarphonePMIC: DeviceDoDcCalibrate(), dc trimmed
01-10 16:57:19.560877   380   699 D AudioALSACodecDeviceBase: AudioALSACodecDeviceBase()
01-10 16:57:19.560924   380   699 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: AudioALSACodecDeviceOutSpeakerEarphonePMIC()
01-10 16:57:19.560956   380   699 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: DeviceDoDcCalibrate()
01-10 16:57:19.560994   380   699 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: DeviceDoDcCalibrate(), can't get mixer control(Audio HPL_SPK Offset)
01-10 16:57:19.561012   380   699 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: DeviceDoDcCalibrate(), can't get mixer control(Audio HPR_SPK Offset)
01-10 16:57:19.570063   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.570133   564   583 D PQTransition: onTransition: TRS: Mode2 (40)
01-10 16:57:19.570196   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.570276   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.572530   380   699 D AudioALSADeviceConfigManager: TiXmlDeclaration version = 1.0, Encoding = UTF-8, Standalone = 
01-10 16:57:19.572606   380   699 D AudioALSADeviceConfigManager: GetVersion = 1.01
01-10 16:57:19.572617   380   699 D AudioALSADeviceConfigManager: +ParseInitSequence()
01-10 16:57:19.572630   380   699 D AudioALSADeviceConfigManager: valname = Audio_Speaker_class_Switch  valvalue = CLASSAB  
01-10 16:57:19.572667   380   699 D AudioALSADeviceConfigManager: -ParseInitSequence()
01-10 16:57:19.572682   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphone_output action = turnon
01-10 16:57:19.572705   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphone_output action = turnoff
01-10 16:57:19.572724   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = receiver_output action = turnon
01-10 16:57:19.572741   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = receiver_output action = turnoff
01-10 16:57:19.572757   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = two_in_one_speaker_output action = turnon
01-10 16:57:19.572783   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = two_in_one_speaker_output action = turnoff
01-10 16:57:19.572804   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = speaker_output action = turnon
01-10 16:57:19.572820   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = speaker_output action = turnoff
01-10 16:57:19.572835   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphoneSpeaker_output action = turnon
01-10 16:57:19.572855   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphoneSpeaker_output action = turnoff
01-10 16:57:19.572869   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_speaker_output action = turnon
01-10 16:57:19.572886   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_speaker_output action = turnoff
01-10 16:57:19.572900   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_headphoneSpeaker_output action = turnon
01-10 16:57:19.572923   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_headphoneSpeaker_output action = turnoff
01-10 16:57:19.572945   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = ext_speaker_output action = turnon
01-10 16:57:19.572963   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = ext_speaker_output action = turnoff
01-10 16:57:19.572978   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1 action = turnon
01-10 16:57:19.573009   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1 action = turnoff
01-10 16:57:19.573039   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1_Inverse action = turnon
01-10 16:57:19.573067   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1_Inverse action = turnoff
01-10 16:57:19.573089   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2 action = turnon
01-10 16:57:19.573116   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2 action = turnoff
01-10 16:57:19.573139   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2_Inverse action = turnon
01-10 16:57:19.573165   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2_Inverse action = turnoff
01-10 16:57:19.573187   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_SingleMic action = turnon
01-10 16:57:19.573209   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_SingleMic action = turnoff
01-10 16:57:19.573232   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_DualMic action = turnon
01-10 16:57:19.573257   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_DualMic action = turnoff
01-10 16:57:19.573291   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic action = turnon
01-10 16:57:19.573359   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic action = turnoff
01-10 16:57:19.573382   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic_Inverse action = turnon
01-10 16:57:19.573409   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic_Inverse action = turnoff
01-10 16:57:19.573432   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headset_mic_input action = turnon
01-10 16:57:19.573458   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headset_mic_input action = turnoff
01-10 16:57:19.573479   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = sidetone_switch action = turnon
01-10 16:57:19.573496   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = sidetone_switch action = turnoff
01-10 16:57:19.573511   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeACCMode action = setting
01-10 16:57:19.573527   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDCCMode action = setting
01-10 16:57:19.573544   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDMICMode action = setting
01-10 16:57:19.573560   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDCCECMDIFFMode action = setting
01-10 16:57:19.573576   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDCCECMSINGLEMode action = setting
01-10 16:57:19.573593   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeACCMode action = setting
01-10 16:57:19.573613   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDCCMode action = setting
01-10 16:57:19.573630   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDMICMode action = setting
01-10 16:57:19.573646   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDCCECMDIFFMode action = setting
01-10 16:57:19.573663   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDCCECMSINGLEMode action = setting
01-10 16:57:19.573680   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeACCMode action = setting
01-10 16:57:19.573697   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDCCMode action = setting
01-10 16:57:19.573713   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDMICMode action = setting
01-10 16:57:19.573730   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDCCECMDIFFMode action = setting
01-10 16:57:19.573747   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDCCECMSINGLEMode action = setting
01-10 16:57:19.573764   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeACCMode action = setting
01-10 16:57:19.573781   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDCCMode action = setting
01-10 16:57:19.573808   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDMICMode action = setting
01-10 16:57:19.573826   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDCCECMDIFFMode action = setting
01-10 16:57:19.573844   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDCCECMSINGLEMode action = setting
01-10 16:57:19.573862   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic_Setting_Inverse action = setting
01-10 16:57:19.573881   380   699 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic_Setting_NoInverse action = setting
01-10 16:57:19.574593   380   699 D AudioCustParamClient: AudioCustParamClient()
01-10 16:57:19.574676   380   699 D AudioCustParamClient: Init(), acpOpsInited(0)
01-10 16:57:19.574692   380   699 D AudioCustParamClient: Init(), init AcpOps struct
01-10 16:57:19.575094   380   699 D AudioCustParam: appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 16:57:19.575613   380   699 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 16:57:19.575701   380   699 D AudioUtility: PHONE_MIC_MODE defined!, mPhoneMicMode = 1
01-10 16:57:19.575744   380   699 D AudioUtility: HEADSET_MIC_MODE defined!, mHeadsetMicMode = 2
01-10 16:57:19.575776   380   699 D AudioALSADeviceConfigManager: ApplyDeviceSettingByName() DeviceName = Mic1TypeACCMode descriptor->DeviceStatusCounter = 0
01-10 16:57:19.575838   380   699 D AudioALSADeviceConfigManager: ApplyDeviceSettingByName() DeviceName = Mic2TypeACCMode descriptor->DeviceStatusCounter = 0
01-10 16:57:19.575985   380   699 D AudioMTKGainController: AudioMTKGainController contructor
01-10 16:57:19.576070   380   699 D AudioSpeechEnhanceInfo: getInstance()
01-10 16:57:19.576109   380   699 D AudioSpeechEnhanceInfo: AudioSpeechEnhanceInfo()
01-10 16:57:19.576272   380   699 D AudioSpeechEnhanceInfo: AudioSpeechEnhanceInfo(), mAudioCustParamClient(0xf48092e0)
01-10 16:57:19.576287   380   699 D AudioSpeechEnhanceInfo: PreLoadBesRecordParams+
01-10 16:57:19.576301   380   699 D NVRAM   : GetHdRecordSceneTableFromNV()
01-10 16:57:19.576888   380   699 D NVRAM   : length of g_NVRAM_BACKUP_DEVICE=44
01-10 16:57:19.576931   380   699 D NVRAM   : failed to get entry for /nvdata 
01-10 16:57:19.576943   380   699 D NVRAM   : failed to get nvdata path /nvdata 
01-10 16:57:19.577003   380   699 D NVRAM   : nvram_layout_callback will run!!!
01-10 16:57:19.577015   380   699 D NVRAM   : nvram_platform_log_block: 2
01-10 16:57:19.577026   380   699 D NVRAM   : nvram_platform_resv_block: 2
01-10 16:57:19.577037   380   699 D NVRAM   : nvram_platform_DM_block: 1
01-10 16:57:19.577048   380   699 D NVRAM   : nvram_platform_layout_version: 0
01-10 16:57:19.577061   380   699 D NVRAM   : nvram_platform_header_offset: 0
01-10 16:57:19.577071   380   699 D NVRAM   : g_i4CFG_File_Count: 51
01-10 16:57:19.577080   380   699 D NVRAM   : NVM_Init Max Lid: 78
01-10 16:57:19.577091   380   699 D NVRAM   : [NVRAM]: info nvram_gpt_flag =1
01-10 16:57:19.577102   380   699 D NVRAM   : [NVRAM]: info NVRAM Init Completed!
01-10 16:57:19.577259   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_Hd_Record_Scene_Table,LID:66
01-10 16:57:19.579372   380   699 D NVRAM   : NVM_CmpFileVerNo 66  
01-10 16:57:19.579491   380   699 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 16:57:19.579509   380   699 D NVRAM   : NVM_ProtectDataFile : 66 ++
01-10 16:57:19.579519   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:19.579542   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:137,size in table:135
01-10 16:57:19.580140   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.583909   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:19.583971   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:19.583989   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:19.584025   380   699 D NVRAM   : GetHdRecordSceneTableFromNV rec_size = 135 rec_num = 1
01-10 16:57:19.585618   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:19.585686   380   699 D NVRAM   : GetHdRecordSceneTableFromNV result = 135
01-10 16:57:19.585701   380   699 D NVRAM   : GetHdRecordParamFromNV()
01-10 16:57:19.585873   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_Hd_Record_Param,LID:65
01-10 16:57:19.585993   380   699 D NVRAM   : NVM_CmpFileVerNo 65  
01-10 16:57:19.586071   380   699 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 16:57:19.586089   380   699 D NVRAM   : NVM_ProtectDataFile : 65 ++
01-10 16:57:19.586102   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:19.586132   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:4056,size in table:4054
01-10 16:57:19.589285   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.589378   564   583 D PQTransition: onTransition: TRS: Mode2 (41)
01-10 16:57:19.589473   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.589562   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.594284   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:19.594366   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:19.594384   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:19.594415   380   699 D NVRAM   : GetHdRecordParamFromNV rec_size = 4054 rec_num = 1
01-10 16:57:19.596133   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:19.596219   380   699 D NVRAM   : GetHdRecordParamFromNV result = 4054
01-10 16:57:19.596442   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_VOIP_Param,LID:17
01-10 16:57:19.596568   380   699 D NVRAM   : NVM_CmpFileVerNo 17  
01-10 16:57:19.596623   380   699 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 16:57:19.596646   380   699 D NVRAM   : NVM_ProtectDataFile : 17 ++
01-10 16:57:19.596657   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:19.596680   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:1594,size in table:1592
01-10 16:57:19.600936   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:19.601014   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:19.601031   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:19.601071   380   699 D NVRAM   : GetAudioVoIPParamFromNV rec_size = 1592 rec_num = 1
01-10 16:57:19.602730   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:19.602823   380   699 D NVRAM   : GetAudioVoIPParamFromNV result = 1592
01-10 16:57:19.602859   380   699 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 16:57:19.602876   380   699 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 16:57:19.603199   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Sph_Dual_Mic,LID:59
01-10 16:57:19.603403   380   699 D NVRAM   : NVM_CmpFileVerNo 59  
01-10 16:57:19.603476   380   699 D NVRAM   : Load File Version: 002, NvRam File Version: 002
01-10 16:57:19.603499   380   699 D NVRAM   : NVM_ProtectDataFile : 59 ++
01-10 16:57:19.603509   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:19.603533   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:938,size in table:936
01-10 16:57:19.606462   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.607830   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.607929   564   583 D PQTransition: onTransition: TRS: Mode2 (42)
01-10 16:57:19.608051   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.608127   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.610167   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:19.610277   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:19.610297   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:19.610365   380   699 D NVRAM   : +GetDualMicSpeechParamFromNVRam audio_nvram_fd.lid = 59, rec_size=936, rec_num=1
01-10 16:57:19.612243   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:19.612335   380   699 D AudioSpeechEnhanceInfo: PreLoadBesRecordParams-
01-10 16:57:19.612512   380   699 D GainTableParamParser: getInstance()
01-10 16:57:19.612616   380   699 D GainTableParamParser: GainTableParamParser()
01-10 16:57:19.612637   380   699 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 16:57:19.613264   380   699 D GainTableParamParser: loadGainTableSpec()
01-10 16:57:19.613507   380   699 D GainTableParamParser: mSpec.audioBufferGainPreferMaxIdx = 18
01-10 16:57:19.613572   380   699 D GainTableParamParser: mSpec.audioBufLMixerName = Headset_PGAL_GAIN
01-10 16:57:19.613591   380   699 D GainTableParamParser: mSpec.audioBufRMixerName = Headset_PGAR_GAIN
01-10 16:57:19.613619   380   699 D GainTableParamParser: mSpec.voiceBufferGainPreferMaxIdx = 18
01-10 16:57:19.613651   380   699 D GainTableParamParser: mSpec.voiceBufMixerName = Handset_PGA_GAIN
01-10 16:57:19.613686   380   699 D GainTableParamParser: mSpec.lineoutBufferGainPreferMaxIdx = 18
01-10 16:57:19.613743   380   699 D GainTableParamParser: mSpec.spkAnaType = 3
01-10 16:57:19.613766   380   699 D GainTableParamParser: mSpec.spkLMixerName = Lineout_PGAL_GAIN
01-10 16:57:19.613781   380   699 D GainTableParamParser: mSpec.spkRMixerName = Lineout_PGAR_GAIN
01-10 16:57:19.613793   380   699 D GainTableParamParser: spk, db = -64, idx = 0
01-10 16:57:19.613805   380   699 D GainTableParamParser: spk, db = 0, idx = 1
01-10 16:57:19.613816   380   699 D GainTableParamParser: spk, db = 4, idx = 2
01-10 16:57:19.613826   380   699 D GainTableParamParser: spk, db = 5, idx = 3
01-10 16:57:19.613839   380   699 D GainTableParamParser: spk, db = 6, idx = 4
01-10 16:57:19.613849   380   699 D GainTableParamParser: spk, db = 7, idx = 5
01-10 16:57:19.613859   380   699 D GainTableParamParser: spk, db = 8, idx = 6
01-10 16:57:19.613870   380   699 D GainTableParamParser: spk, db = 9, idx = 7
01-10 16:57:19.613880   380   699 D GainTableParamParser: spk, db = 10, idx = 8
01-10 16:57:19.613890   380   699 D GainTableParamParser: spk, db = 11, idx = 9
01-10 16:57:19.613901   380   699 D GainTableParamParser: spk, db = 12, idx = 10
01-10 16:57:19.613913   380   699 D GainTableParamParser: spk, db = 13, idx = 11
01-10 16:57:19.613924   380   699 D GainTableParamParser: spk, db = 14, idx = 12
01-10 16:57:19.613935   380   699 D GainTableParamParser: spk, db = 15, idx = 13
01-10 16:57:19.613945   380   699 D GainTableParamParser: spk, db = 16, idx = 14
01-10 16:57:19.613956   380   699 D GainTableParamParser: spk, db = 17, idx = 15
01-10 16:57:19.613985   380   699 D GainTableParamParser: mSpec.ulPgaLMixerName = Audio_PGA1_Setting
01-10 16:57:19.613998   380   699 D GainTableParamParser: mSpec.ulPgaRMixerName = Audio_PGA2_Setting
01-10 16:57:19.614022   380   699 D GainTableParamParser: loadGainTableMapDl()
01-10 16:57:19.614182   380   699 W GainTableParamParser: error: get paramUnit fail, paramPath = Profile,HSSPK
01-10 16:57:19.614348   380   699 D GainTableParamParser: loadGainTableMapUl()
01-10 16:57:19.614578   380   699 D GainTableParamParser: loadGainTableHpImpedance()
01-10 16:57:19.614651   380   699 D GainTableParamParser: mSpec.hpImpEnable = 1
01-10 16:57:19.614674   380   699 D GainTableParamParser: mSpec.hpImpDefaultIdx = 1
01-10 16:57:19.614693   380   699 D GainTableParamParser: getSceneList()
01-10 16:57:19.614725   380   699 D AudioMTKGainController: allocateGainTable()
01-10 16:57:19.614815   380   699 D GainTableParamParser: getGainTableParam()
01-10 16:57:19.614871   380   699 D GainTableParamParser: updatePlaybackDigitalGain()
01-10 16:57:19.615461   649   649 D HWUIExtension: 12 Program id 15, key 0x0000001000000008, offset 68972, binaryLength 11256 within 62452ns
01-10 16:57:19.618257   380   699 D GainTableParamParser: updatePlaybackAnalogGain()
01-10 16:57:19.621772   380   699 D GainTableParamParser: updateSpeechVol()
01-10 16:57:19.621798   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.622160   380   699 W GainTableParamParser: 	continue, paramPath = Band,NB,Profile,USB,Network,GSM, mMapDlAnalogType[13] = -1
01-10 16:57:19.622537   380   699 W GainTableParamParser: 	continue, paramPath = Band,WB,Profile,USB,Network,GSM, mMapDlAnalogType[13] = -1
01-10 16:57:19.622876   380   699 W GainTableParamParser: 	continue, paramPath = Band,SWB,Profile,USB,Network,GSM, mMapDlAnalogType[13] = -1
01-10 16:57:19.623373   380   699 W GainTableParamParser: 	continue, paramPath = Band,NB,Profile,USB,Network,WCDMA, mMapDlAnalogType[13] = -1
01-10 16:57:19.623734   380   699 W GainTableParamParser: 	continue, paramPath = Band,WB,Profile,USB,Network,WCDMA, mMapDlAnalogType[13] = -1
01-10 16:57:19.624093   380   699 W GainTableParamParser: 	continue, paramPath = Band,SWB,Profile,USB,Network,WCDMA, mMapDlAnalogType[13] = -1
01-10 16:57:19.624446   380   699 W GainTableParamParser: 	continue, paramPath = Band,NB,Profile,USB,Network,VoLTE, mMapDlAnalogType[13] = -1
01-10 16:57:19.624772   380   699 W GainTableParamParser: 	continue, paramPath = Band,WB,Profile,USB,Network,VoLTE, mMapDlAnalogType[13] = -1
01-10 16:57:19.625096   380   699 W GainTableParamParser: 	continue, paramPath = Band,SWB,Profile,USB,Network,VoLTE, mMapDlAnalogType[13] = -1
01-10 16:57:19.625154   380   699 D GainTableParamParser: updateRecordVol()
01-10 16:57:19.626655   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.626739   564   583 D PQTransition: onTransition: TRS: Mode2 (43)
01-10 16:57:19.626860   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.626987   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.628234   380   699 D GainTableParamParser: updateVoIPVol()
01-10 16:57:19.628513   380   699 W GainTableParamParser: 	continue, paramPath = Scene,Default,Profile,USB, mMapDlAnalogType[13] = -1
01-10 16:57:19.628570   380   699 D GainTableParamParser: updateRingbackVol()
01-10 16:57:19.628816   380   699 D AudioMTKGainController: mMixer = 0xf485c000
01-10 16:57:19.628898   380   699 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 16:57:19.629483   380   699 D SpeechDriverFactory: SpeechDriverFactory(), isMD1Supported = 11
01-10 16:57:19.629542   380   699 D SpeechDriverFactory: Create SpeechDriverNormal for MODEM_1
01-10 16:57:19.629615   380   699 D         : CleanGainValueAndMuteStatus(), mUplinkMuteOn 0
01-10 16:57:19.637122   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.638736   380   699 D SpeechMessengerNormal: openCcciDriver(), ccci_md: 0, dev_name: "/dev/ccci_aud", mCcciDeviceHandler: 17
01-10 16:57:19.639364   380   699 D ccci_lib: mmap on /dev/ccci_raw_audio(19) for addr=0x8001b000, len=53248
01-10 16:57:19.639593   380   699 W SpeechMessengerNormal: checkModemReady(), modem_status 1 != MODEM_STATUS_READY
01-10 16:57:19.640104   380   699 D SpeechEnhancementController: mSpeechEnhancementMask: main_func = 0xffff, sub_func = 0xffffff9f
01-10 16:57:19.640199   380   699 D SpeechEnhancementController: GetBtHeadsetNrecOn(), mBtHeadsetNrecOn = 1
01-10 16:57:19.640773   380   699 W SpeechDriverFactory: Create SpeechDriverDummy for MODEM_2
01-10 16:57:19.640865   380   699 D         : CleanGainValueAndMuteStatus(), mUplinkMuteOn 0
01-10 16:57:19.640882   380   699 W SpeechDriverDummy: SpeechDriverDummy(), modem_index = 1
01-10 16:57:19.640917   380   699 W SpeechDriverFactory: Create SpeechDriverDummy for MODEM_EXTERNAL
01-10 16:57:19.640948   380   699 D         : CleanGainValueAndMuteStatus(), mUplinkMuteOn 0
01-10 16:57:19.640960   380   699 W SpeechDriverDummy: SpeechDriverDummy(), modem_index = 2
01-10 16:57:19.640992   380   699 D SpeechDriverFactory: -SpeechDriverFactory(), mActiveModemIndex = 0
01-10 16:57:19.641172   380   699 D AudioALSAFMController: AudioALSAFMController()
01-10 16:57:19.641300   380   699 D         : AudioALSAVoiceWakeUpController()
01-10 16:57:19.641332   380   699 D         : AudioALSAVoiceWakeUpController() , stream_attribute_target->BesRecord_Info.besrecord_enable 0
01-10 16:57:19.641517   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Voice_Recognize_Param,LID:15
01-10 16:57:19.642084   380   699 D NVRAM   : NVM_CmpFileVerNo 15  
01-10 16:57:19.642190   380   699 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 16:57:19.642225   380   699 D NVRAM   : NVM_ProtectDataFile : 15 ++
01-10 16:57:19.642239   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:19.642273   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:1548,size in table:1546
01-10 16:57:19.645690   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.645754   523   549 D AAL     : 01-10 04:57:19.570 BL= 997,ESS= 256, 01-10 04:57:19.589 BL= 998,ESS= 256, 01-10 04:57:19.608 BL= 999,ESS= 256, 01-10 04:57:19.626 BL=1000,ESS= 256, 01-10 04:57:19.645 BL=1001,ESS= 256, 
01-10 16:57:19.645816   564   583 D PQTransition: onTransition: TRS: Mode2 (44)
01-10 16:57:19.645878   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.645948   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.647104   380   781 W SpeechMessengerNormal: formatShareMemoryThread(), #0 checkModemReady fail...
01-10 16:57:19.647669   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:19.647742   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:19.647757   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:19.647785   380   699 D NVRAM   : GetVoiceRecogCustParamFromNV rec_size = 1546 rec_num = 1
01-10 16:57:19.648647   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:19.648737   380   699 D         : updateParamToKernel(), mVOW_CFG4 load = 0xffffffea
01-10 16:57:19.648758   380   699 D         : updateParamToKernel(), mVOW_CFG4 set = 0xffef, mVOW_CFG2=0x2323, mVOW_CFG3=0xa768
01-10 16:57:19.648779   380   699 E         : Error: Audio VOWCFG2 Data invalid value
01-10 16:57:19.648795   380   699 E         : Error: Audio VOWCFG3 Data invalid value
01-10 16:57:19.648810   380   699 E         : Error: Audio VOWCFG4 Data invalid value
01-10 16:57:19.648825   380   699 E         : Error: Audio VOW Periodic On Off Data invalid value
01-10 16:57:19.648839   380   699 D AudioALSAStreamManager: AudioALSAStreamManager()
01-10 16:57:19.649175   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_AudEnh_Control_Opt,LID:16
01-10 16:57:19.649470   380   699 D NVRAM   : NVM_CmpFileVerNo 16  
01-10 16:57:19.649593   380   699 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 16:57:19.649621   380   699 D NVRAM   : NVM_ProtectDataFile : 16 ++
01-10 16:57:19.649632   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:19.649686   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:6,size in table:4
01-10 16:57:19.654413   649   649 D HWUIExtension: 13 Program id 16, key 0x0002000000900041, offset 80228, binaryLength 5204 within 38833ns
01-10 16:57:19.655847   380   783 D SpeechDriverNormal: processModemControlMessage(), MD Alive, id: 0xafa0, param16: 0x0, param32: 0x0
01-10 16:57:19.656071   380   783 E SpeechMessengerNormal: sendSpeechMessage(), send msg failed!! modem not ready, id: 0x2fa0, param16: 0x0, param32: 0x0
01-10 16:57:19.658193   380   783 E SpeechDriverNormal: sendSpeechMessageToModem(), send msg failed!!, id: 0x2fa0, param16: 0x0, param32: 0x0
01-10 16:57:19.658630   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:19.658687   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:19.658705   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:19.658736   380   699 D NVRAM   : GetBesLoudnessControlOptionParamFromNV rec_size = 4 rec_num = 1
01-10 16:57:19.662428   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:19.662517   380   699 D AudioALSAStreamManager: AudioALSAStreamManager(), mBesLoudnessStatus [1] (From NvRam) 
01-10 16:57:19.662582   380   699 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 16:57:19.663086   380   699 D AudioALSAStreamManager: AudioALSAStreamManager() appHandleGetInstance
01-10 16:57:19.663134   380   699 D AudioALSAStreamManager: AudioALSAStreamManager() appHandleRegXmlChangedCb
01-10 16:57:19.663166   380   699 D AudioUtility: getPowerHal(), get PowerHal Service
01-10 16:57:19.663720   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.665258   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.665357   564   583 D PQTransition: onTransition: TRS: Mode2 (45)
01-10 16:57:19.665386   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.665478   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.667639   380   699 D AudioUtility: getPowerHal(), Link to death notification successfully
01-10 16:57:19.667739   380   699 D AudioALSAParamTuner: getInstance(), create AudioALSAParamTuner instance --
01-10 16:57:19.667783   380   699 D AudioALSAParamTuner: +AudioALSAParamTuner()
01-10 16:57:19.667810   380   699 D NVRAM   : GetVolumeVer1ParamFromNV 
01-10 16:57:19.667842   406   406 D ccci_mdinit: (1):set md status:mtk.md1.status=ready 
01-10 16:57:19.668001   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_ver1_Vol_custom,LID:64
01-10 16:57:19.668168   380   699 D NVRAM   : NVM_CmpFileVerNo 64  
01-10 16:57:19.668264   380   699 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 16:57:19.668288   380   699 D NVRAM   : NVM_ProtectDataFile : 64 ++
01-10 16:57:19.668300   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:19.668326   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:583,size in table:581
01-10 16:57:19.670311   406   406 D ccci_mdinit: (1):start all ccci up layer services
01-10 16:57:19.670461   406   406 I ccci_mdinit: (1):start_service init.svc.emdlogger1, but returned 0, maybe has no this property
01-10 16:57:19.674323   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:19.674435   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:19.674457   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:19.674496   380   699 D NVRAM   : GetVolumeVer1ParamFromNV rec_size = 581 rec_num = 1
01-10 16:57:19.681068   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:19.681191   380   699 D AudioMTKGainController: getMicGainDecimal(), micMode 1, gainDevice 0, micGainDecimal 152
01-10 16:57:19.681233   380   699 D AudioMTKGainController: getMicGainDecimal(), micMode 1, gainDevice 2, micGainDecimal 168
01-10 16:57:19.681267   380   699 D AudioALSAParamTuner: AudioALSAParamTuner(), AudioALSAParamTuner: default mic gain-mormal:168;handsfree:252, receiver gain:112, headset Gain:76
01-10 16:57:19.681296   380   699 D AudioALSAParamTuner: getInstance(), create AudioALSAParamTuner instance ++
01-10 16:57:19.681325   380   699 D AudioALSAHardware: AudioALSAHardware()
01-10 16:57:19.681415   380   699 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 16:57:19.682034   380   699 D AudioALSAHardware: AudioALSAHardware(), mAudioHalBtscoWB = 0
01-10 16:57:19.682140   380   699 D WCNChipController: WCNChipController()
01-10 16:57:19.682179   380   699 D WCNChipController: SetBTCurrentSamplingRateNumber(), mBTCurrentSamplingRateNumber: 8000 => 8000
01-10 16:57:19.682200   380   699 D AudioBTCVSDControl: +AudioBTCVSDControl
01-10 16:57:19.682244   380   699 D AudioBTCVSDControl: AudioBTCVSDControl constructor
01-10 16:57:19.683274   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.683369   564   583 D PQTransition: onTransition: TRS: Mode2 (46)
01-10 16:57:19.683406   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.683519   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.685335   406   406 I ccci_mdinit: (1):wait_for_property:success(init.svc.emdlogger1=running), loop:0
01-10 16:57:19.685479   406   406 D ccci_mdinit: (1):Current muxd: gsm0710muxd, rild:ril-daemon-mtk
01-10 16:57:19.685595   406   406 D ccci_mdinit: (1):system boot Mode: 48
01-10 16:57:19.685667   406   406 I ccci_mdinit: (1):start_service init.svc.gsm0710muxd, but returned 0, maybe has no this property
01-10 16:57:19.687411   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.702134   380   699 D AudioBTCVSDControl: BT_SCO_SET_TXState state=0x0
01-10 16:57:19.702176   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.702236   380   699 D AudioBTCVSDControl: BT_SCO_SET_RXState state=0x10
01-10 16:57:19.702250   380   699 D AudioBTCVSDControl: BT_SCO_CVSD_Init() allocate mBTSCOCVSDContext
01-10 16:57:19.702282   380   699 D AudioBTCVSDControl: -AudioBTCVSDControl
01-10 16:57:19.702264   564   583 D PQTransition: onTransition: TRS: Mode2 (47)
01-10 16:57:19.702315   380   699 D AudioBTCVSDControl: AudioBTCVSDControl getInstance()
01-10 16:57:19.702346   380   699 D AudioBTCVSDControl: BT_SCO_SetMode, mode=0, BTmode=0
01-10 16:57:19.702319   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.702373   380   699 D AudioALSASpeechPhoneCallController: setBTMode(), mBTMode: 0 => 0
01-10 16:57:19.702407   380   699 D AudioALSAHardware: -mAudioALSAHardware
01-10 16:57:19.702430   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.702432   380   699 D mtk_audio_hw_hal: gAudioHALRefCountByClient + 1
01-10 16:57:19.702532   406   406 I ccci_mdinit: (1):wait_for_property:success(init.svc.gsm0710muxd=running), loop:600
01-10 16:57:19.702592   406   406 D ccci_mdinit: (1):modem boot ready and deamon begin to run!
01-10 16:57:19.702618   406   406 D ccci_mdinit: (1):MD is release version
01-10 16:57:19.703347   380   699 D AudioALSAHardware: initCheck()
01-10 16:57:19.703775   380   699 D AudioALSAStreamManager: setMasterVolume(), volume = 1.000000
01-10 16:57:19.703878   380   699 D AudioMTKGainController: setNormalVolume(), mSceneIndex = 0, stream -1, devices 0x0, index -1, mode 0x0
01-10 16:57:19.703942   380   699 D SpeechParamParser: SpeechParamParser()
01-10 16:57:19.703979   380   699 D SpeechParamParser: Init()
01-10 16:57:19.703988   380   699 D SpeechParamParser: +InitAppParser()
01-10 16:57:19.703998   380   699 D SpeechParamParser: InitAppParser() appHandleGetInstance
01-10 16:57:19.704010   380   699 D SpeechParamParser: appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 16:57:19.704439   380   699 D SpeechParamParser: InitAppParser() appHandleRegXmlChangedCb
01-10 16:57:19.704543   380   699 D SpeechParamParser: InitSpeechNetwork(), i=0, sizeByteFromApp=2, supportBit=0xfff
01-10 16:57:19.704563   380   699 D SpeechParamParser: -InitSpeechNetwork(), total size byte=2
01-10 16:57:19.704577   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[0].name = GSM
01-10 16:57:19.704600   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[1].name = GSM
01-10 16:57:19.704613   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[2].name = GSM
01-10 16:57:19.704625   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[3].name = GSM
01-10 16:57:19.704637   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[4].name = GSM
01-10 16:57:19.704649   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[5].name = GSM
01-10 16:57:19.704662   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[6].name = GSM
01-10 16:57:19.704675   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[7].name = GSM
01-10 16:57:19.704687   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[8].name = GSM
01-10 16:57:19.704699   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[9].name = GSM
01-10 16:57:19.704715   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[10].name = GSM
01-10 16:57:19.704728   380   699 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[11].name = GSM
01-10 16:57:19.704778   380   699 E AudioMTKGainController: getGainDevice(), error, devices (0) not support, return GAIN_DEVICE_SPEAKER
01-10 16:57:19.704819   380   699 W AudioMTKGainController: error, stream -1 is invalid, use 3 instead
01-10 16:57:19.704833   380   699 W AudioMTKGainController: error, index -1 is invalid, use max 15 instead
01-10 16:57:19.704851   380   699 D AudioMTKGainController: setSpeakerGain(), gain = 9, spkAnaType = 3, spkLMixerName = Lineout_PGAL_GAIN, spkRMixerName = Lineout_PGAR_GAIN
01-10 16:57:19.705959   524   524 I AudioFlinger: loadHwModule() Loaded primary audio interface, handle 10
01-10 16:57:19.706105   524   524 I AudioFlinger: openOutput() this 0xf1e3e000, module 10 Device 2, SamplingRate 48000, Format 0x000003, Channels 3, flags 6
01-10 16:57:19.706324   380   699 D AudioALSAStreamManager: +openOutputStream()
01-10 16:57:19.706440   380   699 D AudioALSAStreamManager: openOutputStream(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, status = 0xd
01-10 16:57:19.706520   380   699 D AudioALSAStreamOut: AudioALSAStreamOut()
01-10 16:57:19.706556   380   699 D AudioALSAStreamOut: set(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, flags = 0x6
01-10 16:57:19.706606   380   699 D AudioALSASampleRateController: AudioALSASampleRateController()
01-10 16:57:19.706639   380   699 D AudioALSASampleRateController: +setPrimaryStreamOutSampleRate(), mPrimaryStreamOutSampleRate: 44100 => 48000
01-10 16:57:19.706652   380   699 D AudioALSASampleRateController: -setPrimaryStreamOutSampleRate(), mPrimaryStreamOutSampleRate: 48000
01-10 16:57:19.706690   380   699 D AudioALSAStreamOut: set(), mStreamAttributeSource.latency 10, mStreamAttributeSource.buffer_size =2048, channels 2.
01-10 16:57:19.708389   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.717628   787   787 I [BIP]   :  [BIP TASK] Init start (0)
01-10 16:57:19.718334   787   787 I [BIP]   :  [BIP KAL TIMER] timer init
01-10 16:57:19.718376   787   787 I [BIP]   :  [BIP KAL MSG] msg init, int_num = (20), ext_num = (20), name = (BIP)
01-10 16:57:19.718430   787   787 I [BIP]   :  [BIP TASK] Init end (0)
01-10 16:57:19.719054   787   787 I [BIP]   :  [BIP TASK] Init start (1)
01-10 16:57:19.720042   787   787 I [BIP]   :  [BIP AGENT] can open port, FD = (5)
01-10 16:57:19.720233   787   787 I [BIP]   :  [BIP AGENT] request INFO: ap_seq = 0, address is (0xb3852100)
01-10 16:57:19.720432   787   787 I [BIP]   :  [BIP AGENT] add header data in current buffer queue: ap_seq = (0), pkt_type = (0xffff0000), data_len = (0)
01-10 16:57:19.720515   787   787 I [BIP]   :  [BIP AGENT] the enqueue info. : need_to_write = (1), num_push = (1), num_pop = (0)
01-10 16:57:19.720578   787   787 I [BIP]   :  [BIP AGENT] start handshake!
01-10 16:57:19.720675   787   787 I [BIP]   :  [BIP AGENT] can write data now, FD = (5), write length = (12)
01-10 16:57:19.720749   787   787 I [BIP]   :  [BIP AGENT] the dequeue info. : ap_seq = (0), push_time = (1345304623), pop_time = (1345304850), num_push = (1), num_pop = (1)
01-10 16:57:19.721013   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.721104   564   583 D PQTransition: onTransition: TRS: Mode2 (48)
01-10 16:57:19.721141   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.721224   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.722905   787   787 I [BIP]   :  [BIP AGENT] can read data now, FD = (5), read length = (26)
01-10 16:57:19.723055   787   787 I [BIP]   :  [BIP AGENT]  1  0 ff ff     4B:pkt_type
01-10 16:57:19.723075   787   787 I [BIP]   :  [BIP AGENT]  0  0  0  0     4B:pkt_num
01-10 16:57:19.723091   787   787 I [BIP]   :  [BIP AGENT]  e  0  0  0     4B:pkt_data_len
01-10 16:57:19.723106   787   787 I [BIP]   :  [BIP AGENT]  0  0  0  0   2B2B:(src_mod, dest_mod)
01-10 16:57:19.723122   787   787 I [BIP]   :  [BIP AGENT]  0  0  0  0   2B2B:(sap_id, msg_id)
01-10 16:57:19.723138   787   787 I [BIP]   :  [BIP AGENT] dc  5  c  0 1B1B2B:(ref_count, lp_reserved, msg_len)
01-10 16:57:19.723153   787   787 I [BIP]   :  [BIP AGENT] 8e  5 3a 73   1B1B:(sim_id, bip_channel_id)
01-10 16:57:19.723168   787   787 I [BIP]   :  [BIP AGENT] 30  0  0  0     4B:bip_info pointer
01-10 16:57:19.723186   787   787 I [BIP]   :  [BIP AGENT] MD W/R buffer size = (1500)
01-10 16:57:19.723205   787   787 I [BIP]   :  [BIP AGENT] end handshake!
01-10 16:57:19.723461   787   787 I [BIP]   :  [BIP TASK] Init end (1)
01-10 16:57:19.723489   787   787 I [BIP]   :  [BIP TASK] Init start (2)
01-10 16:57:19.723528   787   787 I [BIP]   :  [BIP KAL TIMER] create timer info, timer[(0)] = (0xb387d15c), timer id = (0xb387d15c), inuse = (0), name = (BIP_NET_DATA)
01-10 16:57:19.724016   787   787 I [BIP]   :  [BIP WIFI] Init end
01-10 16:57:19.724145   787   787 I [BIP]   :  [BIP TASK] Init end (2)
01-10 16:57:19.724182   787   787 I [BIP]   :  [BIP TASK] Init start (3)
01-10 16:57:19.724238   787   787 I [BIP]   :  [BIP KAL TIMER] create timer info, timer[(1)] = (0xb387d1ac), timer id = (0xb387d1ac), inuse = (0), name = (BIP_UICC_SERVER_DATA)
01-10 16:57:19.724601   787   787 I [BIP]   :  [BIP UICC SERVER] init done
01-10 16:57:19.724649   787   787 I [BIP]   :  [BIP TASK] Init end (3)
01-10 16:57:19.724665   787   787 I [BIP]   :  [BIP TASK] Init start (4)
01-10 16:57:19.724987   787   787 I [BIP]   :  [BIP NL] init the link status of interface wlan0
01-10 16:57:19.725101   787   787 I [BIP]   :  [BIP NL] construct nl msg address f6215560
01-10 16:57:19.725695   787   787 I [BIP]   :  [BIP NL] destroy nl msg address f6215560
01-10 16:57:19.725748   787   787 I [BIP]   :  [BIP NL] init the addr status of interface wlan0
01-10 16:57:19.725768   787   787 I [BIP]   :  [BIP NL] construct nl msg address f6215560
01-10 16:57:19.725929   787   787 I [BIP]   :  [BIP NL] destroy nl msg address f6215560
01-10 16:57:19.725956   787   787 I [BIP]   :  [BIP NL] init the route status of interface wlan0
01-10 16:57:19.726013   787   787 I [BIP]   :  [BIP NL] construct nl msg address f6215560
01-10 16:57:19.726136   787   787 I [BIP]   :  [BIP NL] IPv4: *.*.*.*
01-10 16:57:19.726175   787   787 I chatty  : uid=0(root) /vendor/bin/bip identical 2 lines
01-10 16:57:19.726188   787   787 I [BIP]   :  [BIP NL] IPv4: *.*.*.*
01-10 16:57:19.726224   787   787 I [BIP]   :  [BIP NL] IPv6: *:*:*:*:*:*:*:*
01-10 16:57:19.726246   787   787 I [BIP]   :  [BIP NL] destroy nl msg address f6215560
01-10 16:57:19.726263   787   787 I [BIP]   :  [BIP NL] init the DNS status of interface wlan0
01-10 16:57:19.722000   787   787 W bip     : type=1400 audit(0.0:32): avc: denied { read } for name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=1189 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
01-10 16:57:19.734000   787   787 W bip     : type=1400 audit(0.0:33): avc: denied { read } for name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=1189 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
01-10 16:57:19.733527   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.735109   787   796 I [BIP]   :  [BIP AGENT] start read() now, FD = (5)
01-10 16:57:19.735996   787   787 E libc    : Access denied finding property "net.dns1"
01-10 16:57:19.737961   787   787 I [BIP]   :  [BIP NL] dns_server: dns type: 0, ipv4=*.*.*.*, ipv6=*:*:*:*:*:*:*:*
01-10 16:57:19.739847   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.739965   564   583 D PQTransition: onTransition: TRS: Mode2 (49)
01-10 16:57:19.740069   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.740196   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 16:57:19.740969   523   549 D AAL     : 01-10 04:57:19.664 BL=1002,ESS= 256, 01-10 04:57:19.683 BL=1003,ESS= 256, 01-10 04:57:19.702 BL=1004,ESS= 256, 01-10 04:57:19.721 BL=1005,ESS= 256, 01-10 04:57:19.740 BL=1006,ESS= 256, 
01-10 16:57:19.742978   787   787 E libc    : Access denied finding property "net.dns2"
01-10 16:57:19.743070   787   787 I [BIP]   :  [BIP NL] dns_server: dns type: 0, ipv4=*.*.*.*, ipv6=*:*:*:*:*:*:*:*
01-10 16:57:19.743245   787   787 I [BIP]   :  [BIP TASK] Init end (4)
01-10 16:57:19.743280   787   787 I [BIP]   :  [BIP KAL MSG] msg deq, type = (1)
01-10 16:57:19.743295   787   787 I [BIP]   :  [BIP KAL MSG] msg deq, type = (0)
01-10 16:57:19.743306   787   787 I [BIP]   :  [BIP KAL] BIP task suspend
01-10 16:57:19.743413   787   801 I [BIP]   :  [BIP NL] thread start
01-10 16:57:19.744263   790   790 D VoLTE IMSM: vold.decrypt = trigger_restart_framework (module/mdagent/volte_imsm_93/src/volte_imsm.c:348)
01-10 16:57:19.744452   790   790 D VoLTE IMSM: ro.vendor.md_prop_ver = 0 version = 0
01-10 16:57:19.744452   790   790 D VoLTE IMSM:  (module/mdagent/volte_imsm_93/src/volte_imsm.c:268)
01-10 16:57:19.744529   790   790 D VoLTE IMSM: service.nvram_init = Ready (module/mdagent/volte_imsm_93/src/volte_imsm.c:277)
01-10 16:57:19.744606   790   790 D VoLTE IMSM: check_user_load, is user (module/mdagent/volte_imsm_93/src/volte_imsm.c:383)
01-10 16:57:19.744626   790   790 D VoLTE IMSM: volte_imsm (module/mdagent/volte_imsm_93/src/volte_imsm.c:97)
01-10 16:57:19.748043   790   790 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xeff1a000 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 16:57:19.751624   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=22.27 dur=1032.85 max=68.96 min=29.90
01-10 16:57:19.752195   790   802 D VoLTE IMSM: monitor_wifi_tech: enter (module/mdagent/volte_imsm_93/src/wireless.c:453)
01-10 16:57:19.752250   790   790 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xeff1a5a0 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 16:57:19.752360   790   790 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xeff1a5c8 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 16:57:19.752452   790   790 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xeff1a5f0 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 16:57:19.752608   790   802 D VoLTE IMSM: send CTRL_CMD_GETFAMILY (module/mdagent/volte_imsm_93/src/wireless.c:472)
01-10 16:57:19.752729   790   790 E VoLTE IMSM: socket (volte_imsa1) error : Connection refused (111) (module/mdagent/volte_imsm_93/src/os_socket.c:280)
01-10 16:57:19.752845   790   807 D VoLTE IMSM: sim_id = 0, local sim_id = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 16:57:19.752878   790   807 D VoLTE IMSM: sim_id = 0 event queue = 0xeff1a000 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 16:57:19.752889   790   807 D VoLTE IMSM: INIT [0][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.752904   790   807 D VoLTE IMSM: INIT [0][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.752915   790   807 D VoLTE IMSM: INIT [0][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.752927   790   807 D VoLTE IMSM: INIT [0][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.752938   790   807 D VoLTE IMSM: INIT [0][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.752948   790   807 D VoLTE IMSM: INIT [0][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.752959   790   807 D VoLTE IMSM: INIT [0][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.752969   790   807 D VoLTE IMSM: INIT [0][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.752980   790   807 D VoLTE IMSM: INIT [0][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.752990   790   807 D VoLTE IMSM: INIT [0][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753000   790   807 D VoLTE IMSM: INIT [0][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753013   790   807 D VoLTE IMSM: INIT [0] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 16:57:19.753074   790   808 D VoLTE IMSM: sim_id = 1, local sim_id = 1 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 16:57:19.753091   790   808 D VoLTE IMSM: sim_id = 1 event queue = 0xeff1a5a0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 16:57:19.753103   790   808 D VoLTE IMSM: INIT [1][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753114   790   808 D VoLTE IMSM: INIT [1][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753124   790   808 D VoLTE IMSM: INIT [1][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753135   790   808 D VoLTE IMSM: INIT [1][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753145   790   808 D VoLTE IMSM: INIT [1][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753155   790   808 D VoLTE IMSM: INIT [1][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753165   790   808 D VoLTE IMSM: INIT [1][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753175   790   808 D VoLTE IMSM: INIT [1][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753185   790   808 D VoLTE IMSM: INIT [1][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753196   790   808 D VoLTE IMSM: INIT [1][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753210   790   808 D VoLTE IMSM: INIT [1][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753222   790   808 D VoLTE IMSM: INIT [1] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 16:57:19.753272   790   809 D VoLTE IMSM: sim_id = 2, local sim_id = 2 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 16:57:19.753286   790   809 D VoLTE IMSM: sim_id = 2 event queue = 0xeff1a5c8 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 16:57:19.753296   790   809 D VoLTE IMSM: INIT [2][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753307   790   809 D VoLTE IMSM: INIT [2][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753320   790   809 D VoLTE IMSM: INIT [2][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753330   790   809 D VoLTE IMSM: INIT [2][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753340   790   809 D VoLTE IMSM: INIT [2][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753351   790   809 D VoLTE IMSM: INIT [2][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753362   790   809 D VoLTE IMSM: INIT [2][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753372   790   809 D VoLTE IMSM: INIT [2][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753383   790   809 D VoLTE IMSM: INIT [2][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753393   790   809 D VoLTE IMSM: INIT [2][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753403   790   809 D VoLTE IMSM: INIT [2][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753417   790   809 D VoLTE IMSM: INIT [2] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 16:57:19.753537   790   810 D VoLTE IMSM: sim_id = 3, local sim_id = 3 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 16:57:19.753553   790   810 D VoLTE IMSM: sim_id = 3 event queue = 0xeff1a5f0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 16:57:19.753564   790   810 D VoLTE IMSM: INIT [3][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753575   790   810 D VoLTE IMSM: INIT [3][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753585   790   810 D VoLTE IMSM: INIT [3][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753597   790   810 D VoLTE IMSM: INIT [3][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753606   790   810 D VoLTE IMSM: INIT [3][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753621   790   810 D VoLTE IMSM: INIT [3][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753632   790   810 D VoLTE IMSM: INIT [3][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753644   790   810 D VoLTE IMSM: INIT [3][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753654   790   810 D VoLTE IMSM: INIT [3][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753664   790   810 D VoLTE IMSM: INIT [3][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753675   790   810 D VoLTE IMSM: INIT [3][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 16:57:19.753688   790   810 D VoLTE IMSM: INIT [3] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 16:57:19.754365   548   811 I DJobMgr : [watch_dogs_job] start WatchDog@DJobMgr
01-10 16:57:19.755235   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.756933   548   548 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 16:57:19.757517   649   649 D HWUIExtension: 14 Program id 17, key 0x0000081000000000, offset 85432, binaryLength 12020 within 102901ns
01-10 16:57:19.758763   564   583 D PQ      : ccorr table index=0
01-10 16:57:19.759064   564   583 D PQTransition: onTransition: TRS: Mode2 (50)
01-10 16:57:19.759187   564   583 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 16:57:19.759202   564   583 D PQTransition: CheckIfFinished: TRS: Finished
01-10 16:57:19.759231   564   583 D PQ      : [PQ_SERVICE]enablePQEvent: 1 -> 0
01-10 16:57:19.759364   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 3
01-10 16:57:19.760089   380   699 D NVRAM   : audioComFltCustParamInit Do nothing
01-10 16:57:19.760296   380   699 D NVRAM   : getPlaybackPostProcessParameterFromXML Type/Name [0]/[PlaybackACF]
01-10 16:57:19.760352   380   699 D NVRAM   : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 16:57:19.761018   380   699 D NVRAM   : bes_loudness_L_hpf_fc = 300
01-10 16:57:19.761063   380   699 D NVRAM   : bes_loudness_L_hpf_order = 2
01-10 16:57:19.761080   380   699 D NVRAM   : bes_loudness_L_lpf_fc = 10000
01-10 16:57:19.761094   380   699 D NVRAM   : bes_loudness_L_lpf_order = 1
01-10 16:57:19.761113   380   699 D NVRAM   : bes_loudness_R_hpf_fc = 0
01-10 16:57:19.761127   380   699 D NVRAM   : bes_loudness_R_hpf_order = 0
01-10 16:57:19.761141   380   699 D NVRAM   : bes_loudness_R_lpf_fc = 0
01-10 16:57:19.761154   380   699 D NVRAM   : bes_loudness_R_lpf_order = 0
01-10 16:57:19.761172   380   699 D NVRAM   : bes_loudness_Sep_LR_Filter = 0
01-10 16:57:19.761184   380   699 D NVRAM   : bes_loudness_WS_Gain_Max = 0
01-10 16:57:19.761198   380   699 D NVRAM   : bes_loudness_WS_Gain_Min = 0
01-10 16:57:19.761211   380   699 D NVRAM   : bes_loudness_Filter_First = 0
01-10 16:57:19.761224   380   699 D NVRAM   : bes_loudness_Num_Bands = 0
01-10 16:57:19.761237   380   699 D NVRAM   : bes_loudness_Flt_Bank_Order = 0
01-10 16:57:19.761255   380   699 D NVRAM   : DRC_Delay = 0
01-10 16:57:19.761269   380   699 D NVRAM   : Lim_Th = 0
01-10 16:57:19.761280   380   699 D NVRAM   : Lim_Gn = 0
01-10 16:57:19.761290   380   699 D NVRAM   : Lim_Const = 0
01-10 16:57:19.761301   380   699 D NVRAM   : Lim_Delay = 0
01-10 16:57:19.761313   380   699 D NVRAM   : SWIPRev = 0x520
01-10 16:57:19.761328   380   699 D NVRAM   : getPlaybackPostProcessParameterFromXML Parameter 0 returnValue 0
01-10 16:57:19.761382   380   699 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 0
01-10 16:57:19.761476   380   699 D AudioMTKFilterManager: +Init AudioMTKFilter_VibSpkAddTone
01-10 16:57:19.761530   380   699 D AudioMTKFilterManager: sampleRate [48000] channel [2] format [0x3] bufferSize [2048]
01-10 16:57:19.761548   380   699 D AudioMTKFilterManager: -Init AudioMTKFilter_VibSpkAddTone
01-10 16:57:19.761565   380   699 D AudioVIBSPKControl: +UniqueAudioVIBSPKControl
01-10 16:57:19.761604   380   699 D AudioVIBSPKControl: +UniqueAudioVIBSPKVsgGen
01-10 16:57:19.761618   380   699 D AudioVIBSPKControl: VsgGen constructor
01-10 16:57:19.761630   380   699 D AudioVIBSPKControl: -UniqueAudioVIBSPKVsgGen
01-10 16:57:19.761641   380   699 D AudioVIBSPKControl: VsgGen getInstance()
01-10 16:57:19.761650   380   699 D AudioVIBSPKControl: constructor
01-10 16:57:19.761662   380   699 D AudioVIBSPKControl: -UniqueAudioVIBSPKControl
01-10 16:57:19.761671   380   699 D AudioVIBSPKControl: getInstance()
01-10 16:57:19.761726   380   699 D AudioFtmBase: AudioFtmBase()
01-10 16:57:19.761813   380   699 D LoopbackManager: LoopbackManager(), isMD1Supported = 11
01-10 16:57:19.761847   380   699 D LoopbackManager: LoopbackManager(), mWorkingModemIndex = 0
01-10 16:57:19.761863   380   699 D AudioFtm: AudioFtm()
01-10 16:57:19.761900   380   699 D AudioFtm: mMixer = 0xf485c000
01-10 16:57:19.761914   380   699 D AudioFtm: GetVibSpkCalibrationStatus()
01-10 16:57:19.763653   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 16:57:19.764431   380   699 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 16:57:19.764541   380   699 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 16:57:19.764572   380   699 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 16:57:19.764591   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:19.764627   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 16:57:19.769344   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:19.769432   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:19.769450   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:19.769402   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:22.170828,dur:1037.40,max:75.01,min:18.26
01-10 16:57:19.772239   789   789 I EMDLOGGER1: 2018-03-13 previous mask value is 077
01-10 16:57:19.772408   789   789 D EMDLOGGER1: customized_mode = 0
01-10 16:57:19.772731   789   789 I EMDLOGGER1: PROP_ENABLE_DEBUG_LOG persist.logmuch.detect.mdlogger = 0 mEnableLogPrintTooMuch = 0
01-10 16:57:19.775099   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:19.775157   380   699 D AudioMTKFilterManager: VibSpkReadFrequency:9c
01-10 16:57:19.775220   380   699 D AudioVIBSPKControl: setParameters:bb80 9c f 5
01-10 16:57:19.775248   380   699 D AudioVIBSPKControl: VsgGenInit
01-10 16:57:19.775305   380   699 D MtkAudioBitConverter: +open(), format 0, CH 2, SR 48000
01-10 16:57:19.775482   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 16:57:19.775540   380   699 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 16:57:19.775610   380   699 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 16:57:19.775642   380   699 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 16:57:19.775657   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:19.775687   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 16:57:19.777147   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:19.777186   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:19.777205   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:19.779450   795   795 I VoLTE IMCB-CM: uid= 0, euid=0 #203
01-10 16:57:19.779725   795   795 I VoLTE IMCB-CM: get [0]permitted: FFFFFFFF, [1]permitted: 3F #223
01-10 16:57:19.779755   795   795 I VoLTE IMCB-CM: get [1]effective.CAP_WAKE_ALARM: 0, [1]permitted.CAP_WAKE_ALARM: 8 #227
01-10 16:57:19.779777   795   795 I VoLTE IMCB-CM: get [0]permitted: FFFFFFFF, [1]permitted: 3F #255
01-10 16:57:19.781509   789   789 D EMDLOGGER1: dllopen /system/lib64/libsysenv_system.so ok
01-10 16:57:19.781640   789   789 D         : [SYSENV]sysenv_get_with_area():429 , get env name=md1_ccb_cap_gear
01-10 16:57:19.781652   789   789 D         : [SYSENV]get_env_info():311 , initialize
01-10 16:57:19.781768   789   789 D         : [SYSENV]get_partition_count():107 , get_partition_count ret ptr: 38
01-10 16:57:19.781904   789   789 D         : [SYSENV]get_partition_path():158 , partition path = /dev/block/mmcblk0p3
01-10 16:57:19.781932   789   789 E         : [SYSENV]get_env_info():321 , env_buffer[0] : 86432740
01-10 16:57:19.782299   795   795 I VoLTE IMCB-CM: boottime_alarm_support = 1 #302
01-10 16:57:19.783545   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.784530   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:19.784875   380   699 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 3
01-10 16:57:19.785439   380   699 D AudioMTKFilterManager: mFixedParam 0
01-10 16:57:19.785832   380   699 D AudioALSAStreamManager: -openOutputStream(), out = 0xf487e400, status = 0x0, mStreamOutVector.size() = 1
01-10 16:57:19.787354   789   789 D         : [SYSENV]read_env_area():244 , read 16384 data from 20000 to 86432740
01-10 16:57:19.787622   789   789 D         : [SYSENV]get_env_info():348 , ENV initialize success
01-10 16:57:19.787887   789   789 E EMDLOGGER1: sysenv_get key md1_ccb_cap_gear valus is null
01-10 16:57:19.788374   794   794 I VoLTE UA: [Box]VoLTE UA is launched (module/volte//volte_ua/src/volte_service.c:79)
01-10 16:57:19.789156   524   524 D AudioFlinger_Threads: readOutputParameters_l, mNormalFrameCount 1024
01-10 16:57:19.789282   524   524 I AudioFlinger_Threads: HAL output buffer size 256 frames, normal sink buffer size 1024 frames
01-10 16:57:19.789868   794   794 E VoLTE IF_CH: Try to open stream socket failed, retry! name = volte_stack, times = 1, error = Connection refused (module/volte//volte_core/src/os/api_channel.c:208)
01-10 16:57:19.791949   380   699 E EffectsConfig: Failed to parse /vendor/etc/audio_effects.xml: Tinyxml2 error (3): /vendor/etc/audio_effects.xml (null)
01-10 16:57:19.792089   380   699 E EffectsFactoryConfigLoader: Failed to parse XML configuration file
01-10 16:57:19.792131   380   699 W EffectsFactory: Failed to load XML effect configuration, fallback to .conf
01-10 16:57:19.794759   789   789 I EMDLOGGER1: mkdir: Failed.[/data/mdlog/bootupLog/] errno=17
01-10 16:57:19.800912   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.802142   792   792 I VoLTE Stack: [Box]VoLTE Stack is launched (module/volte//volte_stack/src/volte_stack.c:114)
01-10 16:57:19.802420   792   792 I VoLTE Stack: flush ipsec SA&SP (module/volte//volte_stack/src/volte_stack.c:132)
01-10 16:57:19.802579   792   792 D setkey  : netlink receive msg status:20
01-10 16:57:19.802717   792   792 D setkey  : receive netlink message: 00000020 0x00000003 0x00000002
01-10 16:57:19.802828   792   792 D setkey  : flush_SA_SP_exist_xfrm <0 done
01-10 16:57:19.804687   792   792 I VoLTE Stack: [SIP] enter sip_init. MOD_SIP:65 (module/volte//volte_stack/src/sip/sip_main.c:226)
01-10 16:57:19.811057   789   789 I EMDLOGGER1: mkdir: access file ok
01-10 16:57:19.811053   792   819 I VoLTE Stack: create sip task, pid : 792 (module/volte//volte_stack/src/sip/sip_main.c:296)
01-10 16:57:19.811301   795   795 I VoLTE IMCB-CM: register ims_hif for vt #375
01-10 16:57:19.812143   792   792 I VoLTE IF_CH: server open stream socket (listen), name = volte_stack (module/volte//volte_core/src/os/api_channel.c:666)
01-10 16:57:19.812457   792   792 I VoLTE REG: REG init (module/volte//volte_stack/src/reg/reg.c:10234)
01-10 16:57:19.812624   792   792 I VoLTE REG: vtimer init (module/volte//volte_stack/src/reg/reg.c:10252)
01-10 16:57:19.812727   795   795 I VoLTE IMCB-CM: [ims_hif:0] init success, fd: 5 #422
01-10 16:57:19.812805   795   795 I VoLTE IMCB-CM: [ims_hif:1] init success, fd: 6 #422
01-10 16:57:19.812872   795   795 I VoLTE IMCB-CM: [ims_hif:2] init success, fd: 7 #422
01-10 16:57:19.812917   795   795 I VoLTE IMCB-CM: [ims_hif:3] init success, fd: 9 #422
01-10 16:57:19.812924   792   792 E VoLTE IF_CH: Try to open stream socket failed, retry! name = volte_stack, times = 1, error = Connection refused (module/volte//volte_core/src/os/api_channel.c:208)
01-10 16:57:19.813026   792   817 I VoLTE SOC: create soc task, pid : 792 (module/volte//volte_stack/src/soc/soc_data.c:555)
01-10 16:57:19.813116   792   818 I VoLTE SOC: create soc_connect_thread task, pid : 792 (module/volte//volte_stack/src/soc/soc_data.c:361)
01-10 16:57:19.813137   795   795 E VoLTE IF_CH: Try to open stream socket failed, retry! name = volte_ua, times = 1, error = Connection refused (module/volte//volte_core/src/os/api_channel.c:208)
01-10 16:57:19.818466   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.818714   792   822 I VoLTE IF_CH: Max connection is 36, name = volte_stack (module/volte//volte_core/src/os/api_channel.c:438)
01-10 16:57:19.832346   548   548 I mtkcam-devicemgr: [initialize] +
01-10 16:57:19.834551   523   549 D AAL     : 01-10 04:57:19.759 BL=1007,ESS= 256, 01-10 04:57:19.777 BL=1008,ESS= 256, 01-10 04:57:19.796 BL=1009,ESS= 256, 01-10 04:57:19.815 BL=1010,ESS= 256, 01-10 04:57:19.834 BL=1011,ESS= 256, 
01-10 16:57:19.835934   548   548 I mtkcam-module: [ModuleStore] ctor
01-10 16:57:19.836055   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x1 module_factory:0xe2f2f2cd register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/drv/register_HalSensor.cpp
01-10 16:57:19.836073   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x2 module_factory:0xe2f31565 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/drv/register_HwSyncDrv.cpp
01-10 16:57:19.836090   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x3 module_factory:0xe4ed48b1 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/drv/register_iopipe_CamIO_NormalPipe.cpp
01-10 16:57:19.836104   548   548 I mtkcam-module: [ShowLoading] loading (MODULE_GROUP_ID:0 MODULE_GROUP_COUNT:4 ...
01-10 16:57:19.836279   548   548 I mtkcam-module: [load] MtkCam_getModuleFactory_drv(0xe27b7e89) @ libmtkcam_modulefactory_drv.so
01-10 16:57:19.836332   548   548 D SeninfDrvImp: [SeninfDrvImp][SeninfDrvImp] 
01-10 16:57:19.836387   548   548 D SeninfDrvImp: [init][init]: Entry count 0 
01-10 16:57:19.840488   794   794 I VoLTE IF_CH: client open stream socket , name = volte_stack, retry -200 times (module/volte//volte_core/src/os/api_channel.c:221)
01-10 16:57:19.840601   792   822 I VoLTE IF_CH: Connection from 0.0.0.0:0 [name:volte_stack, fd:10, idx:0] (module/volte//volte_core/src/os/api_channel.c:529)
01-10 16:57:19.840817   794   794 I VoLTE IF_CH: ** channel create (0xf59b8900) (5) (module/volte//volte_core/src/os/api_channel.c:306)
01-10 16:57:19.841209   792   822 I VoLTE DISP: Parent channel id = 0x0 (module/volte//volte_stack/src/dispatcher/dispatcher.c:425)
01-10 16:57:19.841306   792   822 I VoLTE DISP: UA is connected (0xed137a08 - 0xecb00000 - 0 - 0x0), type = 303301893 (module/volte//volte_stack/src/dispatcher/dispatcher.c:427)
01-10 16:57:19.841906   548   548 D SeninfDrvImp: [init]Efuse Data:0x11f1018c= 0x8c631940, 0x11f10190= 0x7c208364, 0x11f101bc= 0x80000000
01-10 16:57:19.841968   548   548 D SeninfDrvImp: [init][init]: Exit count 1 
01-10 16:57:19.842170   548   548 D SeninfDrvImp: [setMclk1IODrivingCurrent]DrivingIdx(3), Reg(0x30000000)
01-10 16:57:19.843121   548   548 D SeninfDrvImp: [setMclk2IODrivingCurrent]DrivingIdx(3), Reg(0x00000003)
01-10 16:57:19.843235   548   548 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(0)
01-10 16:57:19.843265   548   548 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(0), SENINF_TG1_PH_CNT(0x80000001)
01-10 16:57:19.842898   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.844263   548   548 D SeninfDrvImp: [setMclk2][setTg2Phase]pcEn(1), clkPol(0), mMclk2User(1), TimestampClk(0), SENINF_TG2_PH_CNT(0x0)
01-10 16:57:19.844538   548   548 D ImgSensorDrv: [init][init] imgsensor_drv 1
01-10 16:57:19.844625   548   548 D ImgSensorDrv: [searchSensor]SENSOR search start 
01-10 16:57:19.848203   524   524 I BufferProvider: found effect "Multichannel Downmix To Stereo" from The Android Open Source Project
01-10 16:57:19.849560   524   524 I AudioFlinger: Using module 10 as the primary audio interface
01-10 16:57:19.849797   380   699 W AudioALSAStreamManager: setMode(), mAudioMode: 0 == 0, return
01-10 16:57:19.850164   380   699 D AudioALSAHardware: +getParameters(), key = GetBesLoudnessStatus
01-10 16:57:19.850352   380   699 D AudioALSAHardware: -getParameters(), return "GetBesLoudnessStatus=1"
01-10 16:57:19.850750   649   649 D HWUIExtension: 15 Program id 18, key 0x0002080800000001, offset 97452, binaryLength 12588 within 93055ns
01-10 16:57:19.851321   380   699 D AudioALSAHardware: +getParameters(), key = GetGainTableSceneCount
01-10 16:57:19.851487   380   699 D AudioALSAHardware: getParameters(), GetGainTableSceneCount, sceneCount = 1
01-10 16:57:19.851562   380   699 D AudioALSAHardware: -getParameters(), return "GetGainTableSceneCount=1"
01-10 16:57:19.852000   380   699 D AudioALSAHardware: +getParameters(), key = GetGainTableSceneTable
01-10 16:57:19.852177   380   699 D AudioALSAHardware: GetAudioData(), par1 = 0x103, len = 14240
01-10 16:57:19.852220   380   699 D AudioALSAHardware: GetAudioCommonData(), par1=0x103, len=14240
01-10 16:57:19.852258   380   699 D AudioALSAHardware: GetAudioEncodedBuffer(), before encode (), sz_in(14244), sz_out(18992)
01-10 16:57:19.852403   380   699 D AudioALSAHardware: GetAudioEncodedBuffer(), after encode (AAAAAP8SAAAAEBIAAAAEEgAAAAAQAAAAAA0AAAAACgAAAAAHAAAAAAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVgAAAAJTAAAAAlAAAAACTQAAAAJKAAAAAkcAAAACRAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAQEgAAAAQSAAAAABAAAAAADQAAAAAKAAAAAAcAAAAABAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
01-10 16:57:19.852511   380   699 D AudioALSAHardware: -getParameters(), return "GetGainTableSceneTable=AAAAAP8SAAAAEBIAAAAEEgAAAAAQAAAAAA0AAAAACgAAAAAHAAAAAAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVgAAAAJTAAAAAlAAAAACTQAAAAJKAAAAAkcAAAACRAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAQEgAAAAQSAAAAABAAAAAADQAAAAAKAAAAAAcAAAAABAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
01-10 16:57:19.852774   794   794 I VoLTE IF_CORE: volte_sip_stack_create, stack = 0xf59b9000, channel = 0xf59b8900 (module/volte//volte_ua/src/service/message.c:621) (module/volte//volte_core/src/interface/volte_stack.c:463)
01-10 16:57:19.852866   794   794 I VoLTE UA: Connect to VoLTE Stack (module/volte//volte_ua/src/service/message.c:626)
01-10 16:57:19.854112   380   699 D AudioALSAHardware: +getParameters(), key = GetGainTableNonSceneTable
01-10 16:57:19.854286   380   699 D AudioALSAHardware: GetAudioData(), par1 = 0x104, len = 12064
01-10 16:57:19.854317   380   699 D AudioALSAHardware: GetAudioCommonData(), par1=0x104, len=12064
01-10 16:57:19.854695   380   699 D AudioALSAHardware: GetAudioEncodedBuffer(), before encode (), sz_in(12068), sz_out(16092)
01-10 16:57:19.854868   380   699 D AudioALSAHardware: GetAudioEncodedBuffer(), after encode (AAAAAP8SAAAAKBIAAAAcEgAAABASAAAABBIAAAAAEAAAAAAMAAAAAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVwAAAAJTAAAAAk8AAAACSwAAAAJHAAAAAkMAAAACQAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAoEgAAABwSAAAAEBIAAAAEEgAAAAAQAAAAAAwAAAAABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAXAAGAABMAAYA
01-10 16:57:19.855136   380   699 D AudioALSAHardware: -getParameters(), return "GetGainTableNonSceneTable=AAAAAP8SAAAAKBIAAAAcEgAAABASAAAABBIAAAAAEAAAAAAMAAAAAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVwAAAAJTAAAAAk8AAAACSwAAAAJHAAAAAkMAAAACQAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAoEgAAABwSAAAAEBIAAAAEEgAAAAAQAAAAAAwAAAAABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgA
01-10 16:57:19.855264   524   834 I AudioFlinger_Threads: AudioFlinger's thread 0xf1483ac0 tid=834 ready to run
01-10 16:57:19.855454   524   834 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 16:57:19.855511   524   834 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()+
01-10 16:57:19.855535   524   834 D NVRAM   : audioComFltCustParamInit + 
01-10 16:57:19.855605   524   834 D NVRAM   : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-sys.so
01-10 16:57:19.855893   524   524 D AudioPolicyManagerCustomImpl: getGainTable, mGainTableSceneCount 1
01-10 16:57:19.856493   380   699 D AudioALSAHardware: +getParameters(), key = GetGainTableCurrentSceneIndex
01-10 16:57:19.856610   380   699 D AudioMTKGainController: getCurrentSceneIndex(), mSceneIndex = 0
01-10 16:57:19.856710   380   699 D AudioALSAHardware: getParameters(), GetGainTableCurrentSceneIndex, currentSceneIndex = 0
01-10 16:57:19.856798   380   699 D AudioALSAHardware: -getParameters(), return "GetGainTableCurrentSceneIndex=0"
01-10 16:57:19.857060   524   524 D AudioPolicyManagerCustomImpl: Using scene [0]/[1]
01-10 16:57:19.857269   524   704 D AudioSystem: +setParameters(): mono_output=0 
01-10 16:57:19.857525   524   524 W AudioFlinger: moveEffects() bad srcOutput 0
01-10 16:57:19.862060   404   404 W ccci_fsd(1): O: X://NA77_006, flag 0x700, ret 1
01-10 16:57:19.862388   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.863428   792   792 I VoLTE IF_CH: client open stream socket , name = volte_stack, retry -200 times (module/volte//volte_core/src/os/api_channel.c:221)
01-10 16:57:19.863494   792   822 I VoLTE IF_CH: Connection from 0.0.0.0:0 [name:volte_stack, fd:12, idx:1] (module/volte//volte_core/src/os/api_channel.c:529)
01-10 16:57:19.863807   792   792 I VoLTE IF_CH: ** channel create (0xed145940) (11) (module/volte//volte_core/src/os/api_channel.c:306)
01-10 16:57:19.863971   792   822 I VoLTE DISP: Reg UA is connected (0xed137a4c - 0xecb10020 - 1) and send VOLTE_RSP_SIPTX_IF_REG_READY (module/volte//volte_stack/src/dispatcher/dispatcher.c:421)
01-10 16:57:19.864056   792   822 I VoLTE DISP: Reg UA is connected (0xed137a4c - 0xecb10020 - 1) (module/volte//volte_stack/src/dispatcher/dispatcher.c:423)
01-10 16:57:19.864258   794   831 E VoLTE IF_CORE: type = 96012, response size error, size = 0 (module/volte//volte_core/src/interface/volte_stack.c:140)
01-10 16:57:19.864420   794   794 E VoLTE IF_CORE: volte_sip_stack_send_cmd, command error, type = 91034 (module/volte//volte_core/src/interface/volte_stack.c:549)
01-10 16:57:19.865802   794   794 I VoLTE IF_CH: server open stream socket (listen), name = volte_ua (module/volte//volte_core/src/os/api_channel.c:666)
01-10 16:57:19.871192   794   843 I VoLTE IF_CH: Max connection is 1, name = volte_ua (module/volte//volte_core/src/os/api_channel.c:438)
01-10 16:57:19.871987   404   404 W ccci_fsd(1): O: Y://NA77_006, flag 0x700, ret 1
01-10 16:57:19.875538   792   792 I VoLTE IF_CORE: volte_sip_stack_create, stack = 0xed14f050, channel = 0xed145940 (module/volte//volte_stack/src/reg/reg.c:10281) (module/volte//volte_core/src/interface/volte_stack.c:463)
01-10 16:57:19.875818   524   834 D AudioParamParser-sys: getDebugLevel(), debug level = -1
01-10 16:57:19.875851   792   792 I VoLTE REG: Init the Reg[0] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 16:57:19.875975   792   792 I VoLTE REG: *Reg[0] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 16:57:19.876007   792   792 I VoLTE_Auto_Testing: [0][reg] state/0/0/5/7
01-10 16:57:19.876062   792   792 I VoLTE REG: Init the Reg[1] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 16:57:19.876098   792   792 I VoLTE REG: *Reg[1] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 16:57:19.876111   792   792 I VoLTE_Auto_Testing: [0][reg] state/1/0/5/7
01-10 16:57:19.876145   792   792 I VoLTE REG: Init the Reg[2] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 16:57:19.876223   792   792 I VoLTE REG: *Reg[2] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 16:57:19.876239   792   792 I VoLTE_Auto_Testing: [0][reg] state/2/0/5/7
01-10 16:57:19.876272   792   792 I VoLTE REG: Init the Reg[3] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 16:57:19.876305   792   792 I VoLTE REG: *Reg[3] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 16:57:19.876316   792   792 I VoLTE_Auto_Testing: [0][reg] state/3/0/5/7
01-10 16:57:19.876352   792   792 I VoLTE REG: Init the Reg[4] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 16:57:19.876388   792   792 I VoLTE REG: *Reg[4] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 16:57:19.876399   792   792 I VoLTE_Auto_Testing: [0][reg] state/4/0/5/7
01-10 16:57:19.876431   792   792 I VoLTE REG: Init the Reg[5] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 16:57:19.876464   792   792 I VoLTE REG: *Reg[5] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 16:57:19.876476   792   792 I VoLTE_Auto_Testing: [0][reg] state/5/0/5/7
01-10 16:57:19.884657   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.888084   548   548 D ImgSensorDrv: [searchSensor]set sensor driver id =1
01-10 16:57:19.888187   548   548 D ImgSensorDrv: [searchSensor]found <0x30c8/s5k3l8_mipi_raw/SENSOR_DRVNAME_S5K3L8_MIPI_RAW>
01-10 16:57:19.888376   548   548 D ImgSensorDrv: [getInfo2]prv w=0x838,h=0x618
01-10 16:57:19.888403   548   548 D ImgSensorDrv: [getInfo2]cap w=0x1070,h=0xc30
01-10 16:57:19.888417   548   548 D ImgSensorDrv: [getInfo2]vd  w=0x1070,h=0xc30
01-10 16:57:19.888430   548   548 D ImgSensorDrv: [getInfo2]pre GrapX=0x0,GrapY=0x0
01-10 16:57:19.899598   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.900505   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.900830   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_COMMON not found
01-10 16:57:19.902047   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.903388   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_COMMON not found
01-10 16:57:19.905780   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.907026   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_COMMON not found
01-10 16:57:19.908084   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.909095   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_COMMON not found
01-10 16:57:19.909930   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.910631   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_COMMON not found
01-10 16:57:19.911456   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.912237   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_COMMON not found
01-10 16:57:19.913108   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.914192   795   795 I VoLTE IF_CH: client open stream socket , name = volte_ua, retry -200 times (module/volte//volte_core/src/os/api_channel.c:221)
01-10 16:57:19.914388   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_COMMON not found
01-10 16:57:19.914420   794   843 I VoLTE IF_CH: Connection from 0.0.0.0:0 [name:volte_ua, fd:11, idx:0] (module/volte//volte_core/src/os/api_channel.c:529)
01-10 16:57:19.915295   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.916052   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_COMMON not found
01-10 16:57:19.916790   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.917597   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_COMMON not found
01-10 16:57:19.918301   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.919125   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_COMMON not found
01-10 16:57:19.919968   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 16:57:19.920816   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_COMMON not found
01-10 16:57:19.921303   548   548 D ImgSensorDrv: [searchSensor]SENSOR search start 
01-10 16:57:19.926571   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.927541   649   649 D HWUIExtension: 16 Program id 19, key 0x0002080000d00041, offset 110040, binaryLength 12592 within 76613ns
01-10 16:57:19.928727   523   549 D AAL     : 01-10 04:57:19.853 BL=1012,ESS= 256, 01-10 04:57:19.871 BL=1013,ESS= 256, 01-10 04:57:19.891 BL=1014,ESS= 256, 01-10 04:57:19.909 BL=1015,ESS= 256, 01-10 04:57:19.928 BL=1016,ESS= 256, 
01-10 16:57:19.935291   795   795 I VoLTE IF_CH: ** channel create (0xe7498de0) (14) (module/volte//volte_core/src/os/api_channel.c:306)
01-10 16:57:19.935420   795   795 I VoLTE IMCB-CM: Send the init event to UA, max_acct=6 #54
01-10 16:57:19.935501   795   795 I VoLTE IMCB-CM: Connect to the UA, wait reg event (type 1) #217
01-10 16:57:19.937271   795   795 I VoLTE IMCB-CM: socket opened, fd = 17!! #122
01-10 16:57:19.937173   794   843 E VoLTE IF_SERVICE: volte_service_server_read, data = 0xf5091890, channel = 0xf59c4440, type = 0, callback is NULL (module/volte//volte_core/src/interface/volte_service.c:188)
01-10 16:57:19.937397   794   843 I VoLTE Service: UA account num = 6 (module/volte//volte_ua/src/service/service.c:108)
01-10 16:57:19.937447   794   843 E VoLTE UA: Stack channel is created (module/volte//volte_ua/src/service/message.c:609)
01-10 16:57:19.937547   794   843 I VoLTE Service: VoLTE Service is ready (module/volte//volte_ua/src/service/service.c:124)
01-10 16:57:19.938115   795   795 I VoLTE IMCB-1: {{{{imcb main start ... (NDK build 20161209)/2018/12/05 15:44:45 GMT +08:00/MOLY.LR12A.R2.MP.V58.16 main()@0#481
01-10 16:57:19.938115   795   795 I VoLTE IMCB-1: [process_msg] msg_id=101602(0x00018CE2), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 process_msg()@0#187
01-10 16:57:19.938115   795   795 I VoLTE IMCB-1: connection status change for module 2 as error_num 0 imcb_imcb_comm_error_handler()@0#797
01-10 16:57:19.938115   795   795 I VoLTE IMCB-1: connection status for modudle 2 @0#820
01-10 16:57:19.938115   795   795 I VoLTE IMCB-1: ENTER imcb_send_multiple_imc_va_connect_req()@0#3073
01-10 16:57:19.938115   795   795 I VoLTE IMCB-1: ENTER imcb_send_imc_va_connect_req()@0#3056
01-10 16:57:19.938115   795   795 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.938115   795   795 I VoLTE IMCB-1: ENTER imcb_send_imc_va_connect_req()@1#3056}}}}
01-10 16:57:19.938408   795   795 I VoLTE IMCB: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.938408   795   795 I VoLTE IMCB: ENTER imcb_send_imc_va_connect_req()@2#3056
01-10 16:57:19.938408   795   795 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 16:57:19.938408   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.942153   792   827 I VoLTE REG: Reg[0] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 16:57:19.942292   792   827 I VoLTE REG: Reg[1] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 16:57:19.942310   792   827 I VoLTE REG: Reg[2] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 16:57:19.942326   792   827 I VoLTE REG: Reg[3] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 16:57:19.942340   792   827 I VoLTE REG: Reg[4] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 16:57:19.942355   792   827 I VoLTE REG: Reg[5] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 16:57:19.942587   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:19.947541   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=20002(0x00004E22), dst=UA[3], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:19.947541   795   795 I VoLTE IMCB: EndofMessage @0#236}}}}
01-10 16:57:19.953290   790   790 E VoLTE IMSM: SOCK_Connect ok, fd = 5 (module/mdagent/volte_imsm_93/src/os_socket.c:305)
01-10 16:57:19.953599   790   790 D VoLTE IMSM: create imcb receiver[0], task_sock = 0xeff1f270 (module/mdagent/volte_imsm_93/src/request_handler.c:214)
01-10 16:57:19.953842   795   795 I VoLTE IMCB-2: {{{{[process_msg] msg_id=101602(0x00018CE2), dst=IMSA1[5], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:19.953842   795   795 I VoLTE IMCB-2: connection status change for module 5 as error_num 0 imcb_imcb_comm_error_handler()@0#797
01-10 16:57:19.953842   795   795 I VoLTE IMCB-2: ENTER imcb_send_multiple_imc_va_connect_req()@0#3073
01-10 16:57:19.953842   795   795 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@0#3056
01-10 16:57:19.953842   795   795 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.953842   795   795 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@1#3056
01-10 16:57:19.953842   795   795 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.953842   795   795 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@2#3056}}}}
01-10 16:57:19.954170   795   795 I VoLTE IMCB-1: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 16:57:19.954170   795   795 I VoLTE IMCB-1: ENTER imcb_send_multiple_imc_imsa_connect_req()@0#3041
01-10 16:57:19.954170   795   795 I VoLTE IMCB-1: ENTER imcb_send_imc_imsa_connect_req()@0#3025
01-10 16:57:19.954170   795   795 I VoLTE IMCB-1: imcb_verno:0x6c imcb_set_imsa_connect_req_to_imc_para()@0#871
01-10 16:57:19.954170   795   795 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.954170   795   795 I VoLTE IMCB-1: ENTER imcb_send_imc_imsa_connect_req()@1#3025
01-10 16:57:19.954170   795   795 I VoLTE IMCB-1: imcb_verno:0x6c imcb_set_imsa_connect_req_to_imc_para()@1#871}}}}
01-10 16:57:19.954506   795   795 I VoLTE IMCB-1: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.954506   795   795 I VoLTE IMCB-1: ENTER imcb_send_imc_imsa_connect_req()@2#3025
01-10 16:57:19.954506   795   795 I VoLTE IMCB-1: imcb_verno:0x6c imcb_set_imsa_connect_req_to_imc_para()@2#871
01-10 16:57:19.954506   795   795 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 16:57:19.954506   795   795 I VoLTE IMCB-1: ENTER imcb_send_multiple_imc_va_connect_req()@0#3073
01-10 16:57:19.954506   795   795 I VoLTE IMCB-1: ENTER imcb_send_imc_va_connect_req()@0#3056
01-10 16:57:19.954506   795   795 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.954506   795   795 I VoLTE IMCB-1: ENTER imcb_send_imc_va_connect_req()@1#3056}}}}
01-10 16:57:19.954679   795   795 I VoLTE IMCB: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.954679   795   795 I VoLTE IMCB: ENTER imcb_send_imc_va_connect_req()@2#3056
01-10 16:57:19.954679   795   795 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 16:57:19.954679   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.954707   795   846 I VoLTE IMCB-CM: Receive VOLTE_IND_REG_STATE, id = 5, and cause is VoLTE_Event_Reg_Cause_Channel_Bind #94
01-10 16:57:19.955722   790   790 D VoLTE IMSM: version check begin (module/mdagent/volte_imsm_93/src/volte_imsm.c:172)
01-10 16:57:19.955783   790   790 I VoLTE IMSMx: IMSM -> IMSMMD : [0] AP_ID_IMSM_GET_VERSION_REQ
01-10 16:57:19.956555   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:19.957084   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:19.957373   795   795 I VoLTE IMCB-0: {{{{[process_msg] msg_id=100008(0x000186A8), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:19.957373   795   795 I VoLTE IMCB-0: ENTER imcb_imc_ims_init_ind_handler()@0#3890
01-10 16:57:19.957373   795   795 I VoLTE IMCB-0: ENTER imcb_initial_sim()@0#770
01-10 16:57:19.957373   795   795 I VoLTE IMCB-0: ENTER imcb_send_imc_ims_reg_state_req()@0#2392
01-10 16:57:19.957373   795   795 I VoLTE IMCB-0: error ua rat type = 0 imcb_rat_conv_to_imc()@0#85
01-10 16:57:19.957373   795   795 I VoLTE IMCB-0: acct_id:0, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@0#203
01-10 16:57:19.957373   795   795 I VoLTE IMCB-0: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.957373   795   795 I VoLTE IMCB-0: ENTER imcb_send_imc_ims_reg_state_req()@0#2392
01-10 16:57:19.957373   795   795 I VoLTE IMCB-0: error ua rat type = 0 imcb_rat_conv_to_imc()@0#85}}}}
01-10 16:57:19.957644   795   795 I VoLTE IMCB: {{{{acct_id:1, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@0#203
01-10 16:57:19.957644   795   795 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.957644   795   795 I VoLTE IMCB: sim:0 initiated ! imcb_initial_sim()@0#779
01-10 16:57:19.957644   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.957774   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:19.958242   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100014(0x000186AE), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:19.958242   795   795 I VoLTE IMCB: ENTER imcb_imc_sim_query_ind_handler()@0#5241
01-10 16:57:19.958242   795   795 I VoLTE IMCB: Pure Mesage Send dest=IMSA1[5], msg_id=100508(0x0001889C), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.958242   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.958449   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:19.958495   790   849 I VoLTE IMSMx: IMCB -> IMSM : [0] SIM_QUERY_IND
01-10 16:57:19.958743   790   807 D VoLTE IMSM: ===> event queue = 0xeff1a000, sim_id = 0, request_id = 100508 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5177)
01-10 16:57:19.958850   790   807 D VoLTE IMSM: Receive IMCB sim_id=0 request_id=100508 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2386)
01-10 16:57:19.958868   790   807 D VoLTE IMSM: receive MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_IND, transaction_id = 1 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2886)
01-10 16:57:19.958861   795   795 I VoLTE IMCB-1: {{{{[process_msg] msg_id=100008(0x000186A8), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 16:57:19.958861   795   795 I VoLTE IMCB-1: ENTER imcb_imc_ims_init_ind_handler()@1#3890
01-10 16:57:19.958861   795   795 I VoLTE IMCB-1: ENTER imcb_initial_sim()@1#770
01-10 16:57:19.958861   795   795 I VoLTE IMCB-1: ENTER imcb_send_imc_ims_reg_state_req()@1#2392
01-10 16:57:19.958861   795   795 I VoLTE IMCB-1: error ua rat type = 0 imcb_rat_conv_to_imc()@1#85
01-10 16:57:19.958861   795   795 I VoLTE IMCB-1: acct_id:2, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@1#203
01-10 16:57:19.958861   795   795 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.958861   795   795 I VoLTE IMCB-1: ENTER imcb_send_imc_ims_reg_state_req()@1#2392
01-10 16:57:19.958861   795   795 I VoLTE IMCB-1: error ua rat type = 0 imcb_rat_conv_to_imc()@1#85}}}}
01-10 16:57:19.958889   790   807 D VoLTE IMSM: send MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_RSP, transaction_id = 1, sim_usim_type = 0, isim_type = 3, session_id = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2907)
01-10 16:57:19.958905   790   807 I VoLTE IMSMx: IMSM -> IMCB : [0] SIM_QUERY_RSP
01-10 16:57:19.959098   795   795 I VoLTE IMCB: {{{{acct_id:3, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@1#203
01-10 16:57:19.959098   795   795 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.959098   795   795 I VoLTE IMCB: sim:1 initiated ! imcb_initial_sim()@1#779
01-10 16:57:19.959098   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.959228   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:19.959653   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100014(0x000186AE), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 16:57:19.959653   795   795 I VoLTE IMCB: ENTER imcb_imc_sim_query_ind_handler()@1#5241
01-10 16:57:19.959653   795   795 I VoLTE IMCB: Pure Mesage Send dest=IMSA1[5], msg_id=16877724(0x0101889C), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.959653   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.959792   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:19.960106   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100509(0x0001889D), dst=IMSA1[5], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:19.960106   795   795 I VoLTE IMCB: ENTER imsa_imcb_sim_query_rsp_handler()@0#1081
01-10 16:57:19.960106   795   795 I VoLTE IMCB: transaction_id:1, sim_usim_type:0, isim_type:3, session_id:0 @0#1084
01-10 16:57:19.960106   795   795 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.960106   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.960541   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:19.960680   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100035(0x000186C3), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:19.960680   795   795 I VoLTE IMCB: ENTER imcb_imc_imsvops_notification_ind_handler()@0#5379
01-10 16:57:19.960680   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=12045(0x00002F0D), len=8, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.960680   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.960947   794   840 I VoLTE SMS: SMS[0] update is_vops = (0) (module/volte//volte_ua/src/sms/sms.c:2935)
01-10 16:57:19.961086   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:19.961191   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:19.961191   795   795 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@0#5493
01-10 16:57:19.961191   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=32, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.961191   795   795 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@0#5518
01-10 16:57:19.961191   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.961245   794   840 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 16:57:19.961276   794   840 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 16:57:19.961311   794   840 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 16:57:19.961313   790   849 I VoLTE IMSMx: IMCB -> IMSM : [1] SIM_QUERY_IND
01-10 16:57:19.961385   790   808 D VoLTE IMSM: ===> event queue = 0xeff1a5a0, sim_id = 1, request_id = 16877724 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5177)
01-10 16:57:19.961434   792   827 I VoLTE REG: rcs_feature = 0 (module/volte//volte_stack/src/reg/reg.c:3230)
01-10 16:57:19.961460   790   808 D VoLTE IMSM: Receive IMCB sim_id=1 request_id=100508 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2386)
01-10 16:57:19.961463   792   827 I VoLTE REG: rcs_state = 0 (module/volte//volte_stack/src/reg/reg.c:3233)
01-10 16:57:19.961482   790   808 D VoLTE IMSM: receive MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_IND, transaction_id = 2 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2886)
01-10 16:57:19.961506   790   808 D VoLTE IMSM: send MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_RSP, transaction_id = 2, sim_usim_type = 0, isim_type = 3, session_id = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2907)
01-10 16:57:19.961517   790   808 I VoLTE IMSMx: IMSM -> IMCB : [1] SIM_QUERY_RSP
01-10 16:57:19.961799   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:19.962210   794   840 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 16:57:19.962260   794   840 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 16:57:19.962268   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100118(0x00018716), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:19.962268   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:19.962268   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#248
01-10 16:57:19.962268   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.962486   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:19.963812   790   850 I VoLTE IMSMx: IMSMMD -> IMSM : [0] AP_ID_IMSM_GET_VERSION_CNF
01-10 16:57:19.963899   790   790 D VoLTE IMSM: AP version = 4, MD version = 4 (module/mdagent/volte_imsm_93/src/volte_imsm.c:180)
01-10 16:57:19.964003   790   790 I VoLTE IMSMx: IMSM -> IMSMMD : [0] AP_ID_SIMMNGR_SIM_INSERT_CHECK_REQ
01-10 16:57:19.963814   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100035(0x000186C3), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 16:57:19.963814   795   795 I VoLTE IMCB: ENTER imcb_imc_imsvops_notification_ind_handler()@1#5379
01-10 16:57:19.963814   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=12045(0x00002F0D), len=8, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.963814   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.964327   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100509(0x0001889D), dst=IMSA1[5], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 16:57:19.964327   795   795 I VoLTE IMCB: ENTER imsa_imcb_sim_query_rsp_handler()@1#1081
01-10 16:57:19.964327   795   795 I VoLTE IMCB: transaction_id:2, sim_usim_type:0, isim_type:3, session_id:0 @1#1084
01-10 16:57:19.964327   795   795 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.964327   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.964815   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 16:57:19.964815   795   795 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@1#5493
01-10 16:57:19.964815   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=32, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.964815   795   795 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@1#5518
01-10 16:57:19.964815   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.964879   790   850 I VoLTE IMSMx: IMSMMD -> IMSM : [0] AP_ID_SIMMNGR_SIM_INSERT_CHECK_CNF
01-10 16:57:19.965048   792   827 E VoLTE REG: invalid rcs information (module/volte//volte_stack/src/reg/reg.c:3221)
01-10 16:57:19.965031   790   807 D VoLTE IMSM: ===> event queue = 0xeff1a000, sim_id = 0, request_id = 800103 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5177)
01-10 16:57:19.965127   790   807 D VoLTE IMSM: MSG_ID_WRAP_MAL_IMSM_SIM_INSERT_CHECK_NOTIFY_IND, flag = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:4878)
01-10 16:57:19.965948   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100118(0x00018716), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 16:57:19.965948   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:19.965948   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#248
01-10 16:57:19.965948   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:19.967804   794   840 I VoLTE SMS: SMS[2] update is_vops = (0) (module/volte//volte_ua/src/sms/sms.c:2935)
01-10 16:57:19.967891   794   840 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 16:57:19.967917   794   840 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 16:57:19.967955   794   840 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 16:57:19.967982   794   840 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 16:57:19.968008   794   840 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 16:57:19.971763   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:19.976436   524   834 E AudioParamParser-sys: audioTypeLoadParamUnitHash(), No paramUnit element found!
01-10 16:57:19.976649   544   568 I ServiceManager: Waiting for service package_native...
01-10 16:57:19.995879   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.004530   380   699 D vndksupport: Loading /vendor/lib/hw/audio.primary.mt6763.so from current namespace instead of sphal namespace.
01-10 16:57:20.005436   380   699 D mtk_audio_hw_hal: gAudioHALRefCountByClient + 2
01-10 16:57:20.006356   380   699 D AudioALSAHardware: setAudioParameterChangedCallback(), add callback = 0x0xf4e9d1c9, cookie = 0x0xf4811230, callback size = 0->1
01-10 16:57:20.006598   524   834 D NVRAM   : audioComFltCustParamInit - callbackAudioCompFltCustParamXmlChanged
01-10 16:57:20.006665   524   834 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()-
01-10 16:57:20.006806   521   521 D Zygote  : begin preload
01-10 16:57:20.007050   521   521 I Zygote  : Installing ICU cache reference pinning...
01-10 16:57:20.007085   521   521 I Zygote  : Preloading ICU data...
01-10 16:57:20.007171   380   699 D AudioALSAHardware: +routing createAudioPatch Mixer->2
01-10 16:57:20.007241   380   699 D AudioALSAStreamManager: +setParameters(), IOport = 13, keyValuePairs = routing=2
01-10 16:57:20.007398   380   699 D         : -updateDeviceInfoForVoiceWakeUp(), mIsUseHeadsetMic = 0, bIsUseHeadsetMic = 0
01-10 16:57:20.007429   380   699 W AudioALSAStreamManager: routingOutputDevice(), flag: 6, mPhoneCallSpeechOpen = 0, output_devices == current_output_devices(0x2), return
01-10 16:57:20.008069   380   699 D AudioALSAStreamOut: standby(), flag 6
01-10 16:57:20.008182   380   699 D AudioALSAStreamOut: standbyStreamOut(), flag 6
01-10 16:57:20.008926   524   834 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 16:57:20.010900   380   699 D AudioALSAHardware: +getParameters(), key = GetSpeakerProtection
01-10 16:57:20.011495   380   699 D AudioALSAHardware: -getParameters(), return "GetSpeakerProtection=0"
01-10 16:57:20.012914   524   524 D AudioPolicyManagerCustomImpl: Not support GetSpeakerProtection
01-10 16:57:20.013041   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.013069   524   524 I AudioFlinger: openOutput() this 0xf1e3e000, module 10 Device 2, SamplingRate 48000, Format 0x000003, Channels 3, flags 8
01-10 16:57:20.013305   380   699 D AudioALSAStreamManager: +openOutputStream()
01-10 16:57:20.013413   380   699 D AudioALSAStreamManager: openOutputStream(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, status = 0x15
01-10 16:57:20.013442   380   699 D AudioALSAStreamOut: AudioALSAStreamOut()
01-10 16:57:20.013491   380   699 D AudioALSAStreamOut: set(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, flags = 0x8
01-10 16:57:20.013522   380   699 D AudioALSASampleRateController: +setPrimaryStreamOutSampleRate(), mPrimaryStreamOutSampleRate: 48000 => 48000
01-10 16:57:20.013558   380   699 W AudioALSASampleRateController: -setPrimaryStreamOutSampleRate(), sample_rate == mPrimaryStreamOutSampleRate, return
01-10 16:57:20.013593   380   699 D AudioALSAStreamOut: reduce hal buffer size 40960 -> 16384
01-10 16:57:20.013635   380   699 D AudioALSAStreamOut: set(), mStreamAttributeSource.latency 128, mStreamAttributeSource.buffer_size =16384, channels 2.
01-10 16:57:20.013682   380   699 D NVRAM   : getPlaybackPostProcessParameterFromXML Type/Name [0]/[PlaybackACF]
01-10 16:57:20.013773   380   699 D NVRAM   : bes_loudness_L_hpf_fc = 300
01-10 16:57:20.014340   380   699 D NVRAM   : bes_loudness_L_hpf_order = 2
01-10 16:57:20.014403   380   699 D NVRAM   : bes_loudness_L_lpf_fc = 10000
01-10 16:57:20.014420   380   699 D NVRAM   : bes_loudness_L_lpf_order = 1
01-10 16:57:20.014440   380   699 D NVRAM   : bes_loudness_R_hpf_fc = 0
01-10 16:57:20.014454   380   699 D NVRAM   : bes_loudness_R_hpf_order = 0
01-10 16:57:20.014468   380   699 D NVRAM   : bes_loudness_R_lpf_fc = 0
01-10 16:57:20.014482   380   699 D NVRAM   : bes_loudness_R_lpf_order = 0
01-10 16:57:20.014498   380   699 D NVRAM   : bes_loudness_Sep_LR_Filter = 0
01-10 16:57:20.014512   380   699 D NVRAM   : bes_loudness_WS_Gain_Max = 0
01-10 16:57:20.014528   380   699 D NVRAM   : bes_loudness_WS_Gain_Min = 0
01-10 16:57:20.014542   380   699 D NVRAM   : bes_loudness_Filter_First = 0
01-10 16:57:20.014556   380   699 D NVRAM   : bes_loudness_Num_Bands = 0
01-10 16:57:20.014579   380   699 D NVRAM   : bes_loudness_Flt_Bank_Order = 0
01-10 16:57:20.014597   380   699 D NVRAM   : DRC_Delay = 0
01-10 16:57:20.014612   380   699 D NVRAM   : Lim_Th = 0
01-10 16:57:20.014630   380   699 D NVRAM   : Lim_Gn = 0
01-10 16:57:20.014641   380   699 D NVRAM   : Lim_Const = 0
01-10 16:57:20.014653   380   699 D NVRAM   : Lim_Delay = 0
01-10 16:57:20.014665   380   699 D NVRAM   : SWIPRev = 0x520
01-10 16:57:20.014682   380   699 D NVRAM   : getPlaybackPostProcessParameterFromXML Parameter 0 returnValue 0
01-10 16:57:20.014721   380   699 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 0
01-10 16:57:20.014804   380   699 D AudioMTKFilterManager: +Init AudioMTKFilter_VibSpkAddTone
01-10 16:57:20.014857   380   699 D AudioMTKFilterManager: sampleRate [48000] channel [2] format [0x3] bufferSize [16384]
01-10 16:57:20.014872   380   699 D AudioMTKFilterManager: -Init AudioMTKFilter_VibSpkAddTone
01-10 16:57:20.014887   380   699 D AudioVIBSPKControl: getInstance()
01-10 16:57:20.015023   380   699 D AudioFtm: GetVibSpkCalibrationStatus()
01-10 16:57:20.015206   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 16:57:20.015277   380   699 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 16:57:20.015352   380   699 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 16:57:20.015385   380   699 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 16:57:20.015399   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:20.015429   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 16:57:20.016966   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:20.017039   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:20.017059   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:20.021299   649   649 D HWUIExtension: 17 Program id 20, key 0x0002080000900041, offset 122632, binaryLength 12848 within 93612ns
01-10 16:57:20.022905   523   549 D AAL     : 01-10 04:57:19.947 BL=1017,ESS= 256, 01-10 04:57:19.966 BL=1018,ESS= 256, 01-10 04:57:19.987 BL=1019,ESS= 256, 01-10 04:57:20.004 BL=1020,ESS= 256, 01-10 04:57:20.022 BL=1021,ESS= 256, 
01-10 16:57:20.023627   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:20.023695   380   699 D AudioMTKFilterManager: VibSpkReadFrequency:9c
01-10 16:57:20.023771   380   699 D AudioVIBSPKControl: setParameters:bb80 9c f 5
01-10 16:57:20.023836   380   699 D MtkAudioBitConverter: +open(), format 0, CH 2, SR 48000
01-10 16:57:20.024068   380   699 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 16:57:20.024145   380   699 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 16:57:20.024215   380   699 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 16:57:20.024243   380   699 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 16:57:20.024257   380   699 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:20.024287   380   699 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 16:57:20.025777   380   699 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:20.025843   380   699 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:20.025867   380   699 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:20.028824   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.034699   380   699 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:20.034813   380   699 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 3
01-10 16:57:20.034988   380   699 D AudioMTKFilterManager: mFixedParam 0
01-10 16:57:20.035121   380   699 D AudioALSAStreamManager: -openOutputStream(), out = 0xf487e800, status = 0x0, mStreamOutVector.size() = 2
01-10 16:57:20.037257   524   524 I AudioFlinger_Threads: HAL output buffer size 2048 frames, normal sink buffer size 2048 frames
01-10 16:57:20.038371   524   704 D AudioSystem: +setParameters(): mono_output=0 
01-10 16:57:20.040340   524   854 I AudioFlinger_Threads: AudioFlinger's thread 0xf0e836c0 tid=854 ready to run
01-10 16:57:20.040517   524   854 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 16:57:20.040551   524   854 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()+
01-10 16:57:20.040564   524   854 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()-
01-10 16:57:20.041433   380   699 D AudioALSAHardware: +routing createAudioPatch Mixer->2
01-10 16:57:20.041644   380   699 D AudioALSAStreamManager: +setParameters(), IOport = 21, keyValuePairs = routing=2
01-10 16:57:20.041781   380   699 D         : -updateDeviceInfoForVoiceWakeUp(), mIsUseHeadsetMic = 0, bIsUseHeadsetMic = 0
01-10 16:57:20.041810   380   699 W AudioALSAStreamManager: routingOutputDevice(), flag: 8, mPhoneCallSpeechOpen = 0, output_devices == current_output_devices(0x2), return
01-10 16:57:20.043948   380   699 D AudioALSAStreamOut: standby(), flag 8
01-10 16:57:20.044064   380   699 D AudioALSAStreamOut: standbyStreamOut(), flag 8
01-10 16:57:20.044492   524   854 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 16:57:20.047807   530   530 E VT      : [VTS] after addService 0
01-10 16:57:20.048122   530   530 I VT      : [SRV] [VT THREAD] VT_Connect start
01-10 16:57:20.048148   530   530 I VT      : [VT] [DISPATCHER] VTMsgDispatcher Constuctor
01-10 16:57:20.048171   530   530 I VT      : [VT] [DISPATCHER] VTMsgDispatcher init
01-10 16:57:20.048688   530   530 I VT      : [SRV] [VT THREAD] VT_Connect finish
01-10 16:57:20.048784   530   530 W VT      : [SRV] [VTCoreHelper] VTCoreHelper create
01-10 16:57:20.048811   530   530 I VT      : [SRV] [OPERATION][ID=1000] VTMALStub (VTMALStub)
01-10 16:57:20.048829   530   530 I VT      : [SRV] [OPERATION][ID=1000] VTMALStub (sim_id = 0)
01-10 16:57:20.048869   530   530 I VT      : [SRV] [CALL FLOW] create ( : )
01-10 16:57:20.048793   575   575 I NetdagentController: Initializing iptables: 1955.7ms
01-10 16:57:20.048914   530   530 W AVSync  : VTAVSync enter!!!
01-10 16:57:20.049383   530   857 I VT      : [SRV] [VT THREAD] VT_Bind start
01-10 16:57:20.049652   380   793 D AudioALSAStreamManager: openInputStream(), devices = 0x80000004, format = 0x1, channels = 0xc, sampleRate = 48000, status = 14, acoustics = 0x0
01-10 16:57:20.049738   380   793 D AudioALSAStreamIn: AudioALSAStreamIn()
01-10 16:57:20.049781   380   793 D AudioALSAStreamIn: set(), devices = 0x80000004, format = 0x1, channels = 0xc, sampleRate = 48000, acoustics = 0x0, flags = 0
01-10 16:57:20.049793   380   793 D AudioALSAStreamIn: CheckBesRecordInfo()
01-10 16:57:20.049805   380   793 D AudioSpeechEnhanceInfo: GetBesRecScene() -1
01-10 16:57:20.049840   380   793 D AudioSpeechEnhanceInfo: IsBesRecTuningEnable()- 0
01-10 16:57:20.049868   380   793 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 16:57:20.049897   380   793 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 16:57:20.049907   380   793 D AudioSpeechEnhanceInfo: IsAPDMNRTuningEnable(), 0
01-10 16:57:20.049940   380   793 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 16:57:20.049987   380   793 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 16:57:20.050013   380   793 D AudioSpeechEnhanceInfo: GetForceMagiASRState(), feature_support=1a097c57, 400, mForceMagiASR=0
01-10 16:57:20.050045   380   793 D AudioSpeechEnhanceInfo: GetForceAECRecState(), mForceAECRec=0
01-10 16:57:20.050073   380   793 D AudioALSAStreamIn: set() done, sampleRate = 48000, num_channels = 2, buffer_size=3840, tempDebugflag = 0
01-10 16:57:20.050109   380   793 D AudioALSAStreamManager: -openInputStream(), in = 0xf5362000, status = 0x0, mStreamInVector.size() = 1
01-10 16:57:20.050151   380   793 D AudioALSAStreamIn: +setParameters(): input_source=1
01-10 16:57:20.050215   380   793 D AudioALSAStreamIn: -setParameters(): input_source=1 
01-10 16:57:20.055052   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.055886   530   530 W AVSync  : open /dev/ccci_imsdc done, fd=14
01-10 16:57:20.056024   530   530 I AVSync  : CCCI status:MD ready
01-10 16:57:20.056099   530   530 I AVSync  : avInit, st 2b1cff1dc, int=b, frac=92e4a3cb
01-10 16:57:20.056328   530   530 W VT      : [SRV] [VTCoreHelper] VTCoreHelper init
01-10 16:57:20.056410   530   530 I VT      : [SRV]   [MAP OPERATION]  clearElement ()
01-10 16:57:20.056451   530   530 I chatty  : uid=1000(system) /system/bin/vtservice identical 3 lines
01-10 16:57:20.056464   530   530 I VT      : [SRV]   [MAP OPERATION]  clearElement ()
01-10 16:57:20.056486   530   530 I VT      : [SRV] [CALL FLOW][ID=1000] create (User ID is :  : )
01-10 16:57:20.056527   530   530 I         : [VT][SRV]after VTService_instantiate
01-10 16:57:20.056742   530   860 W AVSync  : [AVSYNC] downlink_thread() entry
01-10 16:57:20.056909   530   860 E AVSync  : g_fd_avsync =14
01-10 16:57:20.057629   530   857 I VT      : [SRV] [THREAD] get hild success
01-10 16:57:20.058121   379   379 D VT HIDL : [IVT] configureFmqMode
01-10 16:57:20.058254   379   379 I VT HIDL : [IVT] configureFmqMode, getInstance wait client
01-10 16:57:20.058453   379   379 D VT HIDL : [IVT] configureFmqSyncRead
01-10 16:57:20.059257   524   859 I AudioFlinger_Threads: AudioFlinger's thread 0xf0d030c0 tid=859 ready to run
01-10 16:57:20.059305   379   379 D VT HIDL : [IVT] configureFmqSyncRead success
01-10 16:57:20.059343   379   379 D VT HIDL : [IVT] configureFmqSyncRead, evFlagWordPtr init done
01-10 16:57:20.059560   379   379 I VT HIDL : [IVT] configureFmqSyncRead, getInstance wait client
01-10 16:57:20.059770   380   793 D AudioALSAStreamManager: +closeInputStream(), in = 0xf5362000, size() = 1
01-10 16:57:20.059931   380   793 D AudioALSAStreamIn: ~AudioALSAStreamIn()
01-10 16:57:20.060008   380   793 D AudioALSAStreamManager: -closeInputStream(), mStreamInVector.size() = 0
01-10 16:57:20.063084   379   379 D VT HIDL : [IVT] configureFmqSyncWrite
01-10 16:57:20.063508   379   379 D VT HIDL : [IVT] configureFmqSyncWrite success
01-10 16:57:20.063569   379   379 D VT HIDL : [IVT] configureFmqSyncWrite, evFlagWordPtr init done
01-10 16:57:20.063700   379   379 D VT HIDL : [IVT] initialization
01-10 16:57:20.063855   379   379 D VT HIDL : [IVT] isImsVideoCallon : True
01-10 16:57:20.064054   379   379 D VT HIDL : [IVT] isImsVideoCallon : True
01-10 16:57:20.064205   530   857 I VT      : [SRV] [VT THREAD] VT_Bind start finish
01-10 16:57:20.067103   379   863 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] start
01-10 16:57:20.067148   379   863 D VT HIDL : [IVT] getInstance
01-10 16:57:20.067163   379   863 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] read from VTS
01-10 16:57:20.067378   379   864 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] start
01-10 16:57:20.067414   379   864 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1
01-10 16:57:20.067716   379   864 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 fd = -1
01-10 16:57:20.067809   379   864 D VT HIDL : [IVT] isIMCBrun : True
01-10 16:57:20.071492   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.079309   523   549 D AAL     : 01-10 04:57:20.041 BL=1022,ESS= 256, 01-10 04:57:20.060 BL=1023,ESS= 256, 
01-10 16:57:20.087814   524   524 I bt_a2dp_hw: adev_open:  adev_open in A2dp_hw module
01-10 16:57:20.087999   524   524 I AudioFlinger: loadHwModule() Loaded a2dp audio interface, handle 18
01-10 16:57:20.088782   380   793 D vndksupport: Loading /vendor/lib/hw/audio.usb.mt6763.so from current namespace instead of sphal namespace.
01-10 16:57:20.090384   649   649 D HWUIExtension: 18 Program id 21, key 0x0002080800000003, offset 135480, binaryLength 12588 within 68908ns
01-10 16:57:20.096852   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.112776   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.122020   649   649 D HWUIExtension: 19 Program id 22, key 0x0000000800500040, offset 148068, binaryLength 4496 within 31501ns
01-10 16:57:20.122986   649   649 D HWUIExtension: 20 Program id 23, key 0x0000000000000001, offset 152564, binaryLength 4944 within 821ns
01-10 16:57:20.123713   649   649 D HWUIExtension: 21 Program id 24, key 0x0000000800000000, offset 157508, binaryLength 4420 within 614ns
01-10 16:57:20.123832   521   521 I Zygote  : Preloading classes...
01-10 16:57:20.124424   649   649 D HWUIExtension: 22 Program id 25, key 0x0000000000500040, offset 161928, binaryLength 4496 within 616ns
01-10 16:57:20.138548   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.139729   548   548 D ImgSensorDrv: [searchSensor]set sensor driver id =2
01-10 16:57:20.139819   548   548 D ImgSensorDrv: [searchSensor]found <0x7750/ov7251/SENSOR_DRVNAME_OV7251_MIPI_RAW>
01-10 16:57:20.140618   521   521 I SystemServiceRegistry: regMtkService start
01-10 16:57:20.141022   521   521 I SystemServiceRegistry: setMtkSystemServiceName start
01-10 16:57:20.142004   521   521 I MtkSystemServiceRegistry: setMtkSystemServiceName start names{class android.hardware.location.ContextHubManager=contexthub, class android.media.midi.MidiManager=midi, class android.app.KeyguardManager=keyguard, class android.nfc.NfcManager=nfc, class android.view.textservice.TextServicesManager=textservices, class android.hardware.usb.UsbManager=usb, class android.net.NetworkScoreManager=network_score, class android.media.projection.MediaProjectionManager=media_projection, class android.os.storage.StorageManager=storage, class android.os.Vibrator=vibrator, class android.view.textclassifier.TextClassificationManager=textclassification, class android.hardware.hdmi.HdmiControlManager=hdmi_control, class android.net.EthernetManager=ethernet, class android.app.UiModeManager=uimode, class android.companion.CompanionDeviceManager=companiondevice, class android.bluetooth.BluetoothManager=bluetooth, class android.app.timezone.RulesManager=timezone, class android.os.DropBoxManager=dropbox, class android.media.session.MediaSessionManager=media_session, class android.content.ClipboardManager=clipboard, class android.hardware.display.DisplayManager=display, class android.os.RecoverySystem=recovery, class android.net.wifi.RttManager=rttmanager, class android.media.AudioManager=audio, class android.app.admin.DevicePolicyManager=device_policy, class android.app.SearchManager=search, class android.app.ActivityManager=activity, class android.app.AppOpsManager=appops, class android.content.pm.LauncherApps=launcherapps, class android.hardware.camera2.CameraManager=camera, class android.appwidget.AppWidgetManager=appwidget, class android.app.WallpaperManager=wallpaper, class android.app.job.JobScheduler=jobscheduler, class android.app.DownloadManager=download, class android.content.pm.ShortcutManager=shortcut, class android.net.lowpan.LowpanManager=lowpan, class android.net.wifi.aware.WifiAwareManager=wifiaware, class android.app.AlarmManager=alarm, class android.os.PowerManager=power, class android.net.IpSecManager=ipsec, class android.app.usage.NetworkStatsManager=netstats, class android.os.health.SystemHealthManager=systemhealth, class android.hardware.radio.RadioManager=broadcastradio, class android.media.MediaRouter=media_router, class android.net.ConnectivityManager=connectivity, class android.telecom.TelecomManager=telecom, class android.os.IncidentManager=incident, class android.app.StatusBarManager=statusbar, class android.hardware.SensorManager=sensor, class android.telephony.euicc.EuiccManager=euicc_service, class android.view.accessibility.CaptioningManager=captioning, class android.app.usage.UsageStatsManager=usagestats, class android.view.inputmethod.InputMethodManager=input_method, class android.hardware.ConsumerIrManager=consumer_ir, class android.service.persistentdata.PersistentDataBlockManager=persistent_data_block, class android.net.wifi.WifiManager=wifi, class android.print.PrintManager=print, class android.telephony.CarrierConfigManager=carrier_config, class android.media.tv.TvInputManager=tv_input, class android.app.trust.TrustManager=trust, class android.os.UserManager=user, class android.location.CountryDetector=country_detector, class android.text.ClipboardManager=clipboard, class android.location.LocationManager=location, class android.net.wifi.WifiScanner=wifiscanner, class android.net.wifi.p2p.WifiP2pManager=wifip2p, interface android.view.WindowManager=window, class android.view.accessibility.AccessibilityManager=accessibility, class android.net.NetworkPolicyManager=netpolicy, class android.os.BatteryManager=batterymanager, class android.view.autofill.AutofillManager=autofill, class android.app.NotificationManager=notification, class android.net.nsd.NsdManager=servicediscovery, class android.accounts.AccountManager=account, class android.hardware.SerialManager=serial, class android.app.VrManager=vrmanager, class android.telephony.SubscriptionManager=telephony_subscription_service, class android.os.HardwarePropertiesManager=hardware_properties, class android.content.RestrictionsManage
01-10 16:57:20.142170   521   521 I SystemServiceRegistry: registerAllMtkService start
01-10 16:57:20.142257   521   521 I MtkSystemServiceRegistry: registerAllService start
01-10 16:57:20.149950   548   548 D ImgSensorDrv: [getInfo2]prv w=0x280,h=0x1e0
01-10 16:57:20.150054   548   548 D ImgSensorDrv: [getInfo2]cap w=0x280,h=0x1e0
01-10 16:57:20.150067   548   548 D ImgSensorDrv: [getInfo2]vd  w=0x280,h=0x1e0
01-10 16:57:20.150081   548   548 D ImgSensorDrv: [getInfo2]pre GrapX=0x0,GrapY=0x0
01-10 16:57:20.158786   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.162855   649   649 D HWUIExtension: 23 Program id 26, key 0x0002000000d00041, offset 166424, binaryLength 5148 within 38308ns
01-10 16:57:20.164377   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_LENS_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.166718   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SENSOR_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.170551   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_TUNING_3A_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.174504   557   627 D agps    : [agps] WARNING: [CP] cp2_fd_1_req_sim_num_timeout
01-10 16:57:20.174756   557   585 D agps    : [agps][n][CP] [MD_1] write  sim_info_req  gsm_disabled=[0] umts_disabled=[0] lte_disabled=[0] lppe_enable=[1] lppe_network_location_disable=[0] reject_non911_nilr_enable=[0] battery_percentage=[100]
01-10 16:57:20.175276   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FLASHLIGHT_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.175905   557   585 D agps    : [agps][n][CP] [MD_1] read  sim_info_rsp  sim_number=2 md_type=0 (0=fdd, 1=tdd) ecid=1 otdoa=0 band_num=0
01-10 16:57:20.176009   557   585 E agps    : [agps] ERR: [CP] band_num is not ready  retry=0
01-10 16:57:20.177382   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.178106   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_COMMON not found
01-10 16:57:20.178846   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.179657   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_COMMON not found
01-10 16:57:20.180359   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_CAMERA_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.180315   380   793 D modules.usbaudio.audio_hal: [USB_AUD] adev_open
01-10 16:57:20.180908   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.181088   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_CAMERA_COMMON not found
01-10 16:57:20.181846   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.182739   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_COMMON not found
01-10 16:57:20.183661   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.184638   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_COMMON not found
01-10 16:57:20.185409   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.186076   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_COMMON not found
01-10 16:57:20.186704   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.187469   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_COMMON not found
01-10 16:57:20.188200   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.188942   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_COMMON not found
01-10 16:57:20.189768   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.190605   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_COMMON not found
01-10 16:57:20.191604   524   524 I AudioFlinger: loadHwModule() Loaded usb audio interface, handle 26
01-10 16:57:20.191672   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.192207   380   699 D vndksupport: Loading /vendor/lib/hw/audio.r_submix.mt6763.so from current namespace instead of sphal namespace.
01-10 16:57:20.192468   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_COMMON not found
01-10 16:57:20.193217   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.193936   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_COMMON not found
01-10 16:57:20.194681   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 16:57:20.195480   548   548 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_COMMON not found
01-10 16:57:20.197037   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.197419   548   548 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(0)
01-10 16:57:20.197614   548   548 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(0), SENINF_TG1_PH_CNT(0x1)
01-10 16:57:20.197941   548   548 D SeninfDrvImp: [setMclk2][setTg2Phase]pcEn(0), clkPol(0), mMclk2User(0), TimestampClk(0), SENINF_TG2_PH_CNT(0x0)
01-10 16:57:20.198193   548   548 D SeninfDrvImp: [uninit][uninit]: 1 
01-10 16:57:20.198318   548   548 D SeninfDrvImp: [uninit][uninit]: 0, mfd(8) 
01-10 16:57:20.202138   548   548 D ImgSensorDrv: [uninit][uninit] imgsensor_drv 0
01-10 16:57:20.202232   380   699 I r_submix: adev_open(name=audio_hw_if)
01-10 16:57:20.202450   548   548 I mtkcam-devicemgr: pHalSensorList:0xe2f703e8 searchSensors:1 queryNumberOfSensors:2
01-10 16:57:20.203448   380   699 I r_submix: adev_init_check()
01-10 16:57:20.204220   380   699 W DeviceHAL: Device set_master_mute: Function not implemented
01-10 16:57:20.204439   524   524 I AudioFlinger: loadHwModule() Loaded r_submix audio interface, handle 34
01-10 16:57:20.204723   380   699 D r_submix: adev_open_input_stream(addr=0)
01-10 16:57:20.204840   380   699 D r_submix: submix_audio_device_create_pipe_l(addr=0, idx=9)
01-10 16:57:20.204858   380   699 D r_submix:   now using address 0 for route 9
01-10 16:57:20.215615   524   869 I AudioFlinger_Threads: AudioFlinger's thread 0xf0d03e00 tid=869 ready to run
01-10 16:57:20.216359   380   699 D r_submix: adev_close_input_stream()
01-10 16:57:20.216434   380   699 D r_submix: submix_audio_device_release_pipe_l(idx=9) addr=0
01-10 16:57:20.216471   380   699 D r_submix: submix_audio_device_destroy_pipe_l(): pipe destroyed
01-10 16:57:20.216639   524   524 E EffectsConfig: Failed to parse /vendor/etc/audio_effects.xml: Tinyxml2 error (3): /vendor/etc/audio_effects.xml (null)
01-10 16:57:20.216736   524   524 W AudioPolicyEffects: Failed to load XML effect configuration, fallback to .conf
01-10 16:57:20.217907   524   524 D audioserver: AudioPolicyService init done
01-10 16:57:20.219023   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.soundtrigger@2.0::ISoundTriggerHw/default in either framework or device manifest.
01-10 16:57:20.219678   524   524 E SoundTriggerHwService: could not read implementation properties
01-10 16:57:20.220293   524   524 D audioserver: SoundTriggerHwService init done
01-10 16:57:20.222466   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.223589   649   649 D HWUIExtension: 24 Program id 27, key 0x000201080000000b, offset 171572, binaryLength 11808 within 59686ns
01-10 16:57:20.224385   649   649 D HWUIExtension: 25 Program id 28, key 0x0000001800500040, offset 183380, binaryLength 4792 within 676ns
01-10 16:57:20.228051   649   649 I ProgramBinary/Builder: ProgramEntry # 0: key 0x0000000000000000, offset      0, binaryLength 4420, format 36705 --> 0x4d 0x50 0x42 0x31 0x3c 0x11 0x00 0x00 0x02 0x00
01-10 16:57:20.228220   649   649 I ProgramBinary/Builder: ProgramEntry # 1: key 0x0000001000500040, offset   4420, binaryLength 4792, format 36705 --> 0x4d 0x50 0x42 0x31 0xb0 0x12 0x00 0x00 0x02 0x00
01-10 16:57:20.228239   649   649 I ProgramBinary/Builder: ProgramEntry # 2: key 0x0000003800000000, offset   9212, binaryLength 4812, format 36705 --> 0x4d 0x50 0x42 0x31 0xc4 0x12 0x00 0x00 0x02 0x00
01-10 16:57:20.228254   649   649 I ProgramBinary/Builder: ProgramEntry # 3: key 0x0002000000000001, offset  14024, binaryLength 4944, format 36705 --> 0x4d 0x50 0x42 0x31 0x48 0x13 0x00 0x00 0x02 0x00
01-10 16:57:20.228269   649   649 I ProgramBinary/Builder: ProgramEntry # 4: key 0x0002000000000003, offset  18968, binaryLength 4944, format 36705 --> 0x4d 0x50 0x42 0x31 0x48 0x13 0x00 0x00 0x02 0x00
01-10 16:57:20.228285   649   649 I ProgramBinary/Builder: ProgramEntry # 5: key 0x0002000000500041, offset  23912, binaryLength 5148, format 36705 --> 0x4d 0x50 0x42 0x31 0x14 0x14 0x00 0x00 0x02 0x00
01-10 16:57:20.228303   649   649 I ProgramBinary/Builder: ProgramEntry # 6: key 0x0000001000000000, offset  29060, binaryLength 4648, format 36705 --> 0x4d 0x50 0x42 0x31 0x20 0x12 0x00 0x00 0x02 0x00
01-10 16:57:20.228322   649   649 I ProgramBinary/Builder: ProgramEntry # 7: key 0x0002000800000003, offset  33708, binaryLength 5140, format 36705 --> 0x4d 0x50 0x42 0x31 0x0c 0x14 0x00 0x00 0x02 0x00
01-10 16:57:20.228337   649   649 I ProgramBinary/Builder: ProgramEntry # 8: key 0x0000010000000008, offset  38848, binaryLength 9412, format 36705 --> 0x4d 0x50 0x42 0x31 0xbc 0x24 0x00 0x00 0x02 0x00
01-10 16:57:20.228351   649   649 I ProgramBinary/Builder: ProgramEntry # 9: key 0x0002000800000001, offset  48260, binaryLength 5140, format 36705 --> 0x4d 0x50 0x42 0x31 0x0c 0x14 0x00 0x00 0x02 0x00
01-10 16:57:20.228369   649   649 I ProgramBinary/Builder: ProgramEntry #10: key 0x0000001800000000, offset  53400, binaryLength 4648, format 36705 --> 0x4d 0x50 0x42 0x31 0x20 0x12 0x00 0x00 0x02 0x00
01-10 16:57:20.228382   649   649 I ProgramBinary/Builder: ProgramEntry #11: key 0x0002001800500044, offset  58048, binaryLength 10924, format 36705 --> 0x4d 0x50 0x42 0x31 0xa4 0x2a 0x00 0x00 0x02 0x00
01-10 16:57:20.228399   649   649 I ProgramBinary/Builder: ProgramEntry #12: key 0x0000001000000008, offset  68972, binaryLength 11256, format 36705 --> 0x4d 0x50 0x42 0x31 0xf0 0x2b 0x00 0x00 0x02 0x00
01-10 16:57:20.228413   649   649 I ProgramBinary/Builder: ProgramEntry #13: key 0x0002000000900041, offset  80228, binaryLength 5204, format 36705 --> 0x4d 0x50 0x42 0x31 0x4c 0x14 0x00 0x00 0x02 0x00
01-10 16:57:20.228428   649   649 I ProgramBinary/Builder: ProgramEntry #14: key 0x0000081000000000, offset  85432, binaryLength 12020, format 36705 --> 0x4d 0x50 0x42 0x31 0xec 0x2e 0x00 0x00 0x02 0x00
01-10 16:57:20.228442   649   649 I ProgramBinary/Builder: ProgramEntry #15: key 0x0002080800000001, offset  97452, binaryLength 12588, format 36705 --> 0x4d 0x50 0x42 0x31 0x24 0x31 0x00 0x00 0x02 0x00
01-10 16:57:20.228456   649   649 I ProgramBinary/Builder: ProgramEntry #16: key 0x0002080000d00041, offset 110040, binaryLength 12592, format 36705 --> 0x4d 0x50 0x42 0x31 0x28 0x31 0x00 0x00 0x02 0x00
01-10 16:57:20.228469   649   649 I ProgramBinary/Builder: ProgramEntry #17: key 0x0002080000900041, offset 122632, binaryLength 12848, format 36705 --> 0x4d 0x50 0x42 0x31 0x28 0x32 0x00 0x00 0x02 0x00
01-10 16:57:20.228487   649   649 I ProgramBinary/Builder: ProgramEntry #18: key 0x0002080800000003, offset 135480, binaryLength 12588, format 36705 --> 0x4d 0x50 0x42 0x31 0x24 0x31 0x00 0x00 0x02 0x00
01-10 16:57:20.228502   649   649 I ProgramBinary/Builder: ProgramEntry #19: key 0x0000000800500040, offset 148068, binaryLength 4496, format 36705 --> 0x4d 0x50 0x42 0x31 0x88 0x11 0x00 0x00 0x02 0x00
01-10 16:57:20.228516   649   649 I ProgramBinary/Builder: ProgramEntry #20: key 0x0000000000000001, offset 152564, binaryLength 4944, format 36705 --> 0x4d 0x50 0x42 0x31 0x48 0x13 0x00 0x00 0x02 0x00
01-10 16:57:20.228530   649   649 I ProgramBinary/Builder: ProgramEntry #21: key 0x0000000800000000, offset 157508, binaryLength 4420, format 36705 --> 0x4d 0x50 0x42 0x31 0x3c 0x11 0x00 0x00 0x02 0x00
01-10 16:57:20.228545   649   649 I ProgramBinary/Builder: ProgramEntry #22: key 0x0000000000500040, offset 161928, binaryLength 4496, format 36705 --> 0x4d 0x50 0x42 0x31 0x88 0x11 0x00 0x00 0x02 0x00
01-10 16:57:20.228560   649   649 I ProgramBinary/Builder: ProgramEntry #23: key 0x0002000000d00041, offset 166424, binaryLength 5148, format 36705 --> 0x4d 0x50 0x42 0x31 0x14 0x14 0x00 0x00 0x02 0x00
01-10 16:57:20.228575   649   649 I ProgramBinary/Builder: ProgramEntry #24: key 0x000201080000000b, offset 171572, binaryLength 11808, format 36705 --> 0x4d 0x50 0x42 0x31 0x18 0x2e 0x00 0x00 0x02 0x00
01-10 16:57:20.228588   649   649 I ProgramBinary/Builder: ProgramEntry #25: key 0x0000001800500040, offset 183380, binaryLength 4792, format 36705 --> 0x4d 0x50 0x42 0x31 0xb0 0x12 0x00 0x00 0x02 0x00
01-10 16:57:20.228664   649   649 I ProgramBinary/Builder: Build program succeeded.
01-10 16:57:20.231154   649   649 I ProgramBinary/Builder: Build program result is sending to server...
01-10 16:57:20.231386   649   649 I ProgramBinary/Service: ProgramBinaryService client side disable debugging.
01-10 16:57:20.231460   649   649 I ProgramBinary/Service: ProgramBinaryService client side disable binary content debugging.
01-10 16:57:20.231486   649   649 D ProgramBinary/Service: BpProgramBinaryService.setProgramBinaryData
01-10 16:57:20.231786   571   571 D ProgramBinary/Service: zhiyin- ontransact 1 code 4
01-10 16:57:20.232188   649   649 D ProgramBinary/Service: BpProgramBuilderService.setReady
01-10 16:57:20.232327   571   571 D ProgramBinary/Service: zhiyin- ontransact 1 code 2
01-10 16:57:20.232495   649   649 I ProgramBinary/Builder: Build program result: Build is Successful & Send is Successful.
01-10 16:57:20.232617   649   649 I ProgramBinary/Builder: Program binary builder ended!
01-10 16:57:20.232626   649   649 I ProgramBinary/Builder: Build program desctruct.
01-10 16:57:20.238555   649   649 I         : [MALI] @eglp_check_display_valid_and_initialized_and_retain: MALI_EGL_DISPLAY_INITIALIZED != dpy->state (EGL_NOT_INITIALIZED)
01-10 16:57:20.238675   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.264354   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.280745   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.306319   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.322543   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.348271   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.364275   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.389836   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.406278   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.431702   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.435552   548   548 D AAALOGTAG:  3alog = 0, default = 0
01-10 16:57:20.436768   548   548 I mtkcam-module: [ModuleStore] ctor
01-10 16:57:20.436924   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10001 module_factory:0xdc33bb6d register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_Hal3A.cpp
01-10 16:57:20.436943   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10002 module_factory:0xdc40c281 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_HalFlash.cpp
01-10 16:57:20.436961   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10003 module_factory:0xdc33bb71 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_IspMgrIf.cpp
01-10 16:57:20.436978   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10005 module_factory:0xdc3ebdad register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_SwNR.cpp
01-10 16:57:20.436993   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10006 module_factory:0xdba575e9 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_DngInfo.cpp
01-10 16:57:20.437008   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10007 module_factory:0xdcc92791 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_NvBufUtil.cpp
01-10 16:57:20.437022   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10008 module_factory:0xdd7c4c91 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_LscTable.cpp
01-10 16:57:20.437036   548   548 I mtkcam-module: [dump_module] [registered] module_id:0x0x10009 module_factory:0xdc9e4f2d register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_lcs_hal.cpp
01-10 16:57:20.437055   548   548 I mtkcam-module: [ShowLoading] loading (MODULE_GROUP_ID:1 MODULE_GROUP_COUNT:10 ...
01-10 16:57:20.437331   548   548 I mtkcam-module: [load] MtkCam_getModuleFactory_aaa(0xdcb9bfe9) @ libmtkcam_modulefactory_aaa.so
01-10 16:57:20.437421   548   548 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(0)
01-10 16:57:20.437505   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(1), size(1039536)
01-10 16:57:20.438317   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(2), size(1039536)
01-10 16:57:20.439106   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(4), size(1039536)
01-10 16:57:20.439806   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(8), size(1039536)
01-10 16:57:20.440492   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(1), size(96504)
01-10 16:57:20.440656   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(2), size(96504)
01-10 16:57:20.440774   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(4), size(96504)
01-10 16:57:20.440868   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(8), size(96504)
01-10 16:57:20.440959   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(1), size(1050652)
01-10 16:57:20.441716   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(2), size(1050652)
01-10 16:57:20.442401   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(4), size(1050652)
01-10 16:57:20.443211   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(8), size(1050652)
01-10 16:57:20.443920   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(1), size(157704)
01-10 16:57:20.444121   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(2), size(157704)
01-10 16:57:20.444262   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(4), size(157704)
01-10 16:57:20.444391   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(8), size(157704)
01-10 16:57:20.444510   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(1), size(336868)
01-10 16:57:20.444730   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(2), size(336868)
01-10 16:57:20.445035   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(4), size(336868)
01-10 16:57:20.445287   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(8), size(336868)
01-10 16:57:20.445566   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(1), size(5120)
01-10 16:57:20.445636   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(2), size(5120)
01-10 16:57:20.445657   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(4), size(5120)
01-10 16:57:20.445678   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(8), size(5120)
01-10 16:57:20.445697   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(1), size(70520)
01-10 16:57:20.445767   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(2), size(70520)
01-10 16:57:20.445823   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(4), size(70520)
01-10 16:57:20.445883   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(8), size(70520)
01-10 16:57:20.445941   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(1), size(80)
01-10 16:57:20.445956   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(2), size(80)
01-10 16:57:20.445969   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(4), size(80)
01-10 16:57:20.445983   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(8), size(80)
01-10 16:57:20.445996   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(1), size(54000)
01-10 16:57:20.446052   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(2), size(54000)
01-10 16:57:20.446107   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(4), size(54000)
01-10 16:57:20.446160   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(8), size(54000)
01-10 16:57:20.446282   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(1), size(80)
01-10 16:57:20.446301   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(2), size(80)
01-10 16:57:20.446314   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(4), size(80)
01-10 16:57:20.446341   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(8), size(80)
01-10 16:57:20.446355   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(1), size(42928)
01-10 16:57:20.446399   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(2), size(42928)
01-10 16:57:20.446445   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(4), size(42928)
01-10 16:57:20.446493   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(8), size(42928)
01-10 16:57:20.446535   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(1), size(4096)
01-10 16:57:20.446560   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(2), size(4096)
01-10 16:57:20.446577   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(4), size(4096)
01-10 16:57:20.446594   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(8), size(4096)
01-10 16:57:20.446610   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(1), size(22400)
01-10 16:57:20.446643   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(2), size(22400)
01-10 16:57:20.446686   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(4), size(22400)
01-10 16:57:20.446711   548   548 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(8), size(22400)
01-10 16:57:20.446779   548   548 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.446998   548   548 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(0), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 16:57:20.447055   548   548 W NvramDrv: [readDefaultData:735] CAMERA_NVRAM_DATA_ISP
01-10 16:57:20.448786   548   548 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.448943   548   548 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(2), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.448979   548   548 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(2), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 16:57:20.448988   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.449012   548   548 W NvramDrv: [readDefaultData:743] CAMERA_NVRAM_DATA_SHADING
01-10 16:57:20.451158   548   548 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.451300   548   548 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.451328   548   548 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(1), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 16:57:20.451365   548   548 W NvramDrv: [readDefaultData:739] CAMERA_NVRAM_DATA_3A
01-10 16:57:20.468113   548   548 I mtkcam-devicemgr: [logLocked] Physical Devices: # 1
01-10 16:57:20.468231   548   548 I mtkcam-devicemgr: [logLocked] --
01-10 16:57:20.468242   548   548 I mtkcam-devicemgr: [logLocked]   [00] -> orientation(wanted/setup)=( 90/90 ) BACK  hasFlashUnit:1 SENSOR_DRVNAME_S5K3L8_MIPI_RAW [PhysEnumDevice:0xe74a1730]
01-10 16:57:20.468252   548   548 I mtkcam-devicemgr: [logLocked] --
01-10 16:57:20.468264   548   548 I mtkcam-devicemgr: [logLocked] Virtual Devices: # 1
01-10 16:57:20.468272   548   548 I mtkcam-devicemgr: [logLocked] --
01-10 16:57:20.468280   548   548 I mtkcam-devicemgr: [logLocked]   [device@1.0/internal/0] -> 00 torchModeStatus:AVAILABLE_OFF hasFlashUnit:1 [VirtEnumDevice:0xe74fc718 IVirtualDevice:0xe74a1e50]
01-10 16:57:20.468288   548   548 I mtkcam-devicemgr: [logLocked] --
01-10 16:57:20.468295   548   548 I mtkcam-devicemgr: [logLocked] Open Devices: # 0 (multi-opened maximum: # 2)
01-10 16:57:20.468303   548   548 I mtkcam-devicemgr: [logLocked] --
01-10 16:57:20.468313   548   548 I mtkcam-devicemgr: [initialize] -
01-10 16:57:20.468327   548   548 I mtkcam-camprovider: [createICameraProvider_V2_4] + internal/0
01-10 16:57:20.468356   548   548 I mtkcam-camprovider: [initialize] +
01-10 16:57:20.468505   548   548 I mtkcam-camprovider: [initialize] -
01-10 16:57:20.468533   548   548 I mtkcam-camprovider: [createICameraProvider_V2_4] - internal/0 provider:0xe74ab860 manager:0xe6e1a004
01-10 16:57:20.472080   548   548 I camerahalserver: Registration complete for android.hardware.camera.provider@2.4::ICameraProvider/internal/0.
01-10 16:57:20.473589   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.473614   548   548 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.advcam@1.0-impl.so from current namespace instead of sphal namespace.
01-10 16:57:20.473717   522   522 I zygote  : Explicit concurrent copying GC freed 181(8KB) AllocSpace objects, 0(0B) LOS objects, 98% free, 23KB/1559KB, paused 85us total 6.089ms
01-10 16:57:20.476615   548   548 I AdvCamControl_impl: IAdvCamControl  into HIDL_FETCH_IAdvCamControl
01-10 16:57:20.479366   548   548 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.advcam@1.0::IAdvCamControl/internal/0.
01-10 16:57:20.479921   522   522 I zygote  : Explicit concurrent copying GC freed 5(32KB) AllocSpace objects, 0(0B) LOS objects, 98% free, 23KB/1559KB, paused 66us total 5.737ms
01-10 16:57:20.480658   548   548 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.lomoeffect@1.0-impl.so from current namespace instead of sphal namespace.
01-10 16:57:20.481185   522   522 I zygote  : Global filter of size 170 installed
01-10 16:57:20.482613   522   522 I Zygote  : Accepting command socket connections
01-10 16:57:20.486223   548   548 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.lomoeffect@1.0::ILomoEffect/internal/0.
01-10 16:57:20.487629   548   548 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.ccap@1.0-impl.so from current namespace instead of sphal namespace.
01-10 16:57:20.490329   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.493442   548   548 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.ccap@1.0::ICCAPControl/internal/0.
01-10 16:57:20.494664   548   548 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.callbackclient@1.0-impl.so from current namespace instead of sphal namespace.
01-10 16:57:20.500520   548   548 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.callbackclient@1.0::IMtkCallbackClient/internal/0.
01-10 16:57:20.501430   527   716 I CameraProviderManager: Connecting to new camera provider: internal/0, isRemote? 1
01-10 16:57:20.503259   527   716 I CameraProviderManager: Enumerating new camera device: device@1.0/internal/0
01-10 16:57:20.505511   548   875 I mtkcam-dev1: [createSpecificCameraDevice1] APP_MODE_NAME_DEFAULT
01-10 16:57:20.510148   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_REG: pid:548, uid:1047
01-10 16:57:20.510586   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnReg hdl:39
01-10 16:57:20.511220   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnEnable hdl:39, timeout:1000
01-10 16:57:20.511506   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_ENABLE: hdl:39, timeout:1000
01-10 16:57:20.511577   397   413 I libPerfService: perfUserScnEnable - handle:39
01-10 16:57:20.512726   397   413 I libPerfService: 39: legacy set freq: 1508000 -1 2002000 -1
01-10 16:57:20.513500   548   875 I mtkcam-dev1: [createSpecificCameraDevice1] - 0xe5c30600
01-10 16:57:20.513573   548   875 I mtkcam-dev1: 0[CameraDevice1Base::open] +
01-10 16:57:20.513899   548   875 I mtkcam-devicemgr: [attachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 16:57:20.513
01-10 16:57:20.514447   548   878 D SeninfDrvImp: [init][init]: Entry count 0 
01-10 16:57:20.515300   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.519698   548   878 D SeninfDrvImp: [init]Efuse Data:0x11f1018c= 0x8c631940, 0x11f10190= 0x7c208364, 0x11f101bc= 0x80000000
01-10 16:57:20.519797   548   878 D SeninfDrvImp: [init][init]: Exit count 1 
01-10 16:57:20.519867   548   878 D ImgSensorDrv: [init][init] imgsensor_drv 1
01-10 16:57:20.519989   548   878 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11)
01-10 16:57:20.520048   548   878 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11), SENINF_TG1_PH_CNT(0x80000005)
01-10 16:57:20.520343   548   878 D SeninfDrvImp: [setMclk1IODrivingCurrent]DrivingIdx(3), Reg(0x30000000)
01-10 16:57:20.520825   548   875 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_AE,0),srIdxNum(0)
01-10 16:57:20.520891   548   875 I Drv/HWsync: Drv/HWsync[init] mAECyclePeriod(3)
01-10 16:57:20.520904   548   875 I Drv/HWsync: Drv/HWsync[init] -
01-10 16:57:20.520991   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.521049   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.521068   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.521088   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.521118   548   875 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(4), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 16:57:20.521145   548   875 W NvramDrv: [readDefaultData:755] CAMERA_DATA_AE_PLINETABLE
01-10 16:57:20.521464   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.521554   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.524487   548   875 D LaserDrv: LaserDrv()
01-10 16:57:20.524663   548   875 D LaserDrv: Device error opening : No such file or directory
01-10 16:57:20.525281   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.525350   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.532163   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.557174   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.567947   379   864 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Fail to connect . retry count: 1
01-10 16:57:20.568294   379   864 D VT HIDL : [IVT] isIMCBrun : True
01-10 16:57:20.574562   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.598960   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.607277   548   878 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(0)
01-10 16:57:20.607560   548   878 I Drv/HWsync: Drv/HWsync[init] -
01-10 16:57:20.615796   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.617263   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.617499   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.617534   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.617558   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(2), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.617578   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.617599   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.617629   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.617653   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(6), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.617688   548   875 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(6), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 16:57:20.617741   548   875 W NvramDrv: [readDefaultData:772] CAMERA_DATA_TSF_TABLE
01-10 16:57:20.618554   548   875 D CAM_CUS_MSDK: CAM_CUS_MSDK GetCameraCalData(MainSensorIdx=30c8) Enter
01-10 16:57:20.618700   548   875 D CAM_CUS_MSDK: CAM_CUS_MSDK SensorId != pstSensorInitFunc[0].SensorId=258 
01-10 16:57:20.618721   548   875 D CAM_CUS_MSDK: CAM_CUS_MSDK SensorId == pstSensorInitFunc[1].SensorId=30c8 
01-10 16:57:20.618740   548   875 D CAM_CUS_MSDK: CAM_CUS_MSDK Enter! GetCameraCalData(MainSensorIdx=30c8) Enter
01-10 16:57:20.618763   548   875 D CAM_CUS_MSDK: CAM_CUS_MSDK pstSensorInitFunc(MainSensorIdx=30c8) Enter
01-10 16:57:20.618782   548   875 I CamCalCamCal: ver1017~ pCamCalData->sensorID=30c8
01-10 16:57:20.618818   548   875 I CamCalCamCal: ver1017~ pCamCalData->deviceID=1
01-10 16:57:20.624458   548   875 I CamCalCamCal: ver1017~ lsc table_size 1868
01-10 16:57:20.640810   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.643960   409   409 I [WFCA]  : CCCI status:MD ready
01-10 16:57:20.644140   409   409 I [WFCA]  : Init imsx:/dev/ccci_imsa, 3
01-10 16:57:20.644172   409   409 I [WFCA]  : Init IPC MDM ringbuf
01-10 16:57:20.644194   409   409 I [WFCA]  : open ipc wfca
01-10 16:57:20.644498   409   409 I [WFCA]  : open ipc wfca_rds
01-10 16:57:20.644594   409   881 I [WFCA]  : listen_fd thread created
01-10 16:57:20.644654   409   409 I [WFCA]  : open ipc MDM_rtp_OTA_msg_ctrl
01-10 16:57:20.644682   409   882 I [WFCA]  : listen thread created
01-10 16:57:20.644727   409   409 I [WFCA]  : unix_socket: MDM_rtp_OTA_msg_ctrl
01-10 16:57:20.644962   409   883 I [WFCA]  : MDM ctrl thread created
01-10 16:57:20.648552   409   409 I [WFCA]  : CCCI status:MD ready
01-10 16:57:20.648700   409   409 I [WFCA]  : Init imsx:/dev/ccci_imsa, 3
01-10 16:57:20.648785   409   409 I [WFCA]  : WFCA Reset success
01-10 16:57:20.657572   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.682728   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.700450   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.724315   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.727069   548   875 I CamCalCamCal: ver1017~ ======================SingleLsc Data==================
01-10 16:57:20.727275   548   875 I CamCalCamCal: ver1017~ [1st] = 2, 8, 4c, 7 
01-10 16:57:20.727296   548   875 I CamCalCamCal: ver1017~ [1st] = SensorLSC(1)?MTKLSC(2)?  2 
01-10 16:57:20.727312   548   875 I CamCalCamCal: ver1017~ CapIspReg =0x30000000, 0xd04bd037, 0x40000000, 0x4d0041, 0x20202020
01-10 16:57:20.727334   548   875 I CamCalCamCal: ver1017~ RETURN = 0x0 
01-10 16:57:20.727350   548   875 I CamCalCamCal: ver1017~ ======================SingleLsc Data==================
01-10 16:57:20.727420   548   875 D CAM_CUS_MSDK: CAM_CUS_MSDK Done! GetCameraCalData(MainSensorIdx=30c8) Enter
01-10 16:57:20.728017   548   875 D gma_core: [GmaCore] constructor, sensor dev:1
01-10 16:57:20.728099   548   884 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:20.728212   548   875 D lce_core: [LceCore] constructor, sensor dev:1
01-10 16:57:20.726000   548   548 W HwBinder:548_2: type=1400 audit(0.0:34): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:20.733101   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.733813   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.734086   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 16:57:20.734217   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 16:57:20.734231   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 16:57:20.734243   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 16:57:20.734712   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.735214   548   875 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:20.736356   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.737030   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.737274   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 16:57:20.737376   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 16:57:20.737389   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 16:57:20.737400   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 16:57:20.737918   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.738289   548   875 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:20.739006   380   781 D SpeechMessengerNormal: formatShareMemory(), mShareMemory: 0xf5d42000, ap_flag: 0x1, md_flag: 0x1, struct_checksum: 124
01-10 16:57:20.739191   380   781 D SpeechMessengerNormal: formatShareMemory(), [sph_param] offset: 128, size: 12288, [ap_data] offset: 12416, size: 8192, [md_data] offset: 20608, size: 32608
01-10 16:57:20.739209   380   781 D SpeechMessengerNormal: formatShareMemoryThread(), terminated
01-10 16:57:20.739457   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.740041   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.740240   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 16:57:20.740325   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 16:57:20.740338   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 16:57:20.740349   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 16:57:20.740823   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.741025   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.741300   548   875 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:20.742565   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.743519   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.743862   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 16:57:20.744022   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 16:57:20.744055   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 16:57:20.744067   548   875 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 16:57:20.744584   548   875 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 16:57:20.745068   548   875 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:20.745402   548   875 D AppTsf  : [AppTsf] constructor
01-10 16:57:20.745541   548   875 D tsf_core: [TsfCore] constructor
01-10 16:57:20.745581   789   789 D ccci_lib: read info:[modem num]:1
01-10 16:57:20.745581   789   789 D ccci_lib: [modem en]:1-0-0-0-0
01-10 16:57:20.745581   789   789 D ccci_lib: [MTK_ECCCI_C2K]:1
01-10 16:57:20.745581   789   789 D ccci_lib: [ccci_drv_ver]:V2
01-10 16:57:20.745581   789   789 D ccci_lib: total:71
01-10 16:57:20.745671   789   789 D ccci_lib: parse_info name:modem num
01-10 16:57:20.745707   789   789 D EMDLOGGER1: initUSBPortMappingFile get current port is 1
01-10 16:57:20.745941   789   789 D EMDLOGGER1: Get auto start mode: 2
01-10 16:57:20.745970   789   789 D EMDLOGGER1: getSavedLoggingMode(): mode = 2
01-10 16:57:20.748422   548   875 W aaa_state_mgr: [StateCommon::transitState] StateUninit --> StateInit
01-10 16:57:20.748519   548   887 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.748677   548   887 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(7), sensorDev(1), p(0x0), bForceRead(1) +
01-10 16:57:20.748711   548   887 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(7), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 16:57:20.748748   548   887 W NvramDrv: [readDefaultData:779] CAMERA_DATA_PDC_TABLE
01-10 16:57:20.749000   548   887 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 16:57:20.751825   548   875 I FlashAlgM: FlashAlgM 2
01-10 16:57:20.754569   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.754731   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(5), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:20.754765   548   875 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(5), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 16:57:20.754827   548   875 W NvramDrv: [readDefaultData:760] CAMERA_NVRAM_DATA_STROBE cust_fillDefaultStrobeNVRam
01-10 16:57:20.754865   548   875 D flash_custom.cpp: devid main id1
01-10 16:57:20.756065   548   875 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_SENSOR_DRVNAME_S5K3L8_MIPI_RAW
01-10 16:57:20.755995   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=23.90 dur=1004.33 max=51.86 min=31.76
01-10 16:57:20.759590   548   875 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_FLASHLIGHT
01-10 16:57:20.761045   404   404 W ccci_fsd(1): O: X://NA77_006, flag 0x700, ret 1
01-10 16:57:20.762015   548   875 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_AFLAMP
01-10 16:57:20.762841   548   875 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_CAMERASHOT
01-10 16:57:20.763358   404   404 W ccci_fsd(1): O: Y://NA77_006, flag 0x700, ret 1
01-10 16:57:20.763956   548   875 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_SENINDEPFEATURE
01-10 16:57:20.765422   405   405 E ccci_fsd(3): fail to open /dev/ccci3_fs: 2
01-10 16:57:20.766468   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.767135   548   875 I MtkCam/ParamsManager: [Feature::initFeatures_NoWarningCorrection] (fgIsLowMem, memory_total_in_byte, getpagesize)=(0, 2992164864, 4096)
01-10 16:57:20.768552   548   875 I MtkCam/ParamsManager: [updateDefaultParams2_ByQuery] cap(4208,3120),fov(67,49)
01-10 16:57:20.768842   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.768921   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0xdd0919d8), bForceRead(0) +
01-10 16:57:20.768936   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.768951   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0xdd58be48), bForceRead(0) +
01-10 16:57:20.768963   548   875 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:20.768977   548   875 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0xdcc977ac), bForceRead(0) +
01-10 16:57:20.769008   548   875 D LensMCU : LensMCU[isSupportLens][CurrSensorDev]0x0001 [CurrSensorId]0x30c8
01-10 16:57:20.770017   548   875 I MtkCam/FrameController: [FrameController][prvcb] - miLogLevel(1), max delay(30000000), max sleep(1000000000 ns), min sleep(200 us), adj sleep(250000 ns)
01-10 16:57:20.774332   527   716 W CameraProviderManager: Camera provider internal/0 says an unknown camera device@1.0/internal/0 now has torch status 0. Curious.
01-10 16:57:20.774681   548   875 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:0
01-10 16:57:20.774869   548   875 I mtkcam-dev1: 0[CameraDevice1Base::open] Add new cameraId 0 - 0xe5c30600
01-10 16:57:20.775002   548   875 I mtkcam-dev1: 0[CameraDevice1Base::open] -
01-10 16:57:20.777330   548   874 I mtkcam-dev1: 0[CameraDevice1Base::close] +
01-10 16:57:20.777341   548   887 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 16:57:20.777493   548   887 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 16:57:20.777505   548   887 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 16:57:20.777514   548   887 I MtkCam/Utils: onCreate#03 pc 000f5949  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+348)
01-10 16:57:20.777522   548   887 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 16:57:20.777530   548   887 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 16:57:20.777539   548   887 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 16:57:20.777547   548   887 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 16:57:20.777571   548   887 E MtkCam/IonHeap: PDC_tbl_1@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 16:57:20.777648   548   887 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 16:57:20.778301   548   874 I MtkCam/CamClient: (874)[uninit] + getStrongCount(1)
01-10 16:57:20.782797   885   885 I [epdg_wo]: [DMN] starting WI-FI OFFLOAD DAEMON
01-10 16:57:20.783408   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.784967   885   885 I [epdg_wo]: [IKE] IKEv2 Daemon stopped
01-10 16:57:20.785234   885   885 I [epdg_wo]: [NID] create post_routing chain
01-10 16:57:20.785342   885   885 I [epdg_wo]: [NID] netutils supported
01-10 16:57:20.789094   548   874 W MtkCam/CamClient/FDClient: (874)[stopFaceDetection] FD was not running
01-10 16:57:20.789278   548   874 I MtkCam/CamClient: (874)[uninit] - getStrongCount(1)
01-10 16:57:20.789649   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 16:57:20.790387   548   874 W aaa_state_mgr: [StateCommon::transitState] StateInit --> StateUninit
01-10 16:57:20.790505   548   874 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_AE,2),srIdxNum(1)
01-10 16:57:20.790585   548   874 I Drv/HWsync: Drv/HWsync[uninit] mAECyclePeriod(-1)
01-10 16:57:20.790598   548   874 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 16:57:20.790655   397   413 I libPerfService: 39: legacy set freq: -1 -1 -1 -1
01-10 16:57:20.790702   548   874 E MtkCam/SensorProviderService: (874)[doDisableSensor] NULL value! (doDisableSensor){#412:vendor/mediatek/proprietary/hardware/mtkcam/utils/sys/SensorProvider/SensorProviderService.cpp}
01-10 16:57:20.790771   548   874 E MtkCam/SensorProviderService: (874)[doDisableSensor] NULL value! (doDisableSensor){#412:vendor/mediatek/proprietary/hardware/mtkcam/utils/sys/SensorProvider/SensorProviderService.cpp}
01-10 16:57:20.797741   548   887 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 16:57:20.797845   548   887 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 16:57:20.797859   548   887 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 16:57:20.797869   548   887 I MtkCam/Utils: onCreate#03 pc 000f5983  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+406)
01-10 16:57:20.797877   548   887 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 16:57:20.797884   548   887 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 16:57:20.797892   548   887 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 16:57:20.797901   548   887 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 16:57:20.797925   548   887 E MtkCam/IonHeap: PDC_tbl_2@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 16:57:20.798005   548   887 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 16:57:20.805868   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:24.121815,dur:1036.41,max:57.23,min:37.08
01-10 16:57:20.808063   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.811688   789   789 D EMDLOGGER1: MAL_Init
01-10 16:57:20.814289   789   789 D ccci_lib: mmap on /dev/ccci_ccb_dhl(5) for addr=0x7c000000, len=2097152
01-10 16:57:20.814511   548   887 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 16:57:20.814580   548   887 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 16:57:20.814591   548   887 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 16:57:20.814601   548   887 I MtkCam/Utils: onCreate#03 pc 000f59bd  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+464)
01-10 16:57:20.814608   548   887 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 16:57:20.814616   548   887 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 16:57:20.814624   548   887 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 16:57:20.814635   548   887 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 16:57:20.814657   548   887 E MtkCam/IonHeap: PDC_tbl_3@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 16:57:20.814733   548   887 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 16:57:20.817618   789   789 D ccci_lib: ccb_info_len=20
01-10 16:57:20.818705   789   789 D ccci_lib: new ccb_ctrl mmap on /dev/ccci_ccb_ctrl(6) for addr=0x80018000, len=4096
01-10 16:57:20.820984   789   789 D ccci_lib: register user57 md0: base=0x7486200000, len=2097152, ctrl_base=0x7486f8f000, ctrl_offset=0
01-10 16:57:20.821046   789   789 D ccci_lib: register user57 md0 DL0, pattern=ddbbccaa, dl_page=0x7486200000
01-10 16:57:20.821069   789   789 D ccci_lib: register user57 md0 UL0, pattern=ddbbccaa, ul_page=0x7486208000
01-10 16:57:20.821084   789   789 D ccci_lib: register user57 md0 DL1, pattern=ddbbccaa, dl_page=0x7486210000
01-10 16:57:20.821003   521   521 E ActivityRecognitionHardware: activity_recognition HAL is deprecated. class_init is effectively a no-op
01-10 16:57:20.821098   789   789 D ccci_lib: register user57 md0 UL1, pattern=ddbbccaa, ul_page=0x748622e000
01-10 16:57:20.821126   789   789 D ccci_lib: register user57 md0 DL2, pattern=ddbbccaa, dl_page=0x748622e080
01-10 16:57:20.821140   789   789 D ccci_lib: register user57 md0 UL2, pattern=ddbbccaa, ul_page=0x7486237080
01-10 16:57:20.821153   789   789 D ccci_lib: register user57 md0 DL3, pattern=ddbbccaa, dl_page=0x748623f080
01-10 16:57:20.821174   789   789 D ccci_lib: register user57 md0 UL3, pattern=ddbbccaa, ul_page=0x7486247080
01-10 16:57:20.821194   789   789 D ccci_lib: register user57 md0 DL4, pattern=ddbbccaa, dl_page=0x7486247100
01-10 16:57:20.821207   789   789 D ccci_lib: register user57 md0 UL4, pattern=ddbbccaa, ul_page=0x748624f100
01-10 16:57:20.821220   789   789 D ccci_lib: register user57 md0 DL5, pattern=ddbbccaa, dl_page=0x748624f180
01-10 16:57:20.821234   789   789 D ccci_lib: register user57 md0 UL5, pattern=ddbbccaa, ul_page=0x748626f180
01-10 16:57:20.821247   789   789 D ccci_lib: register user57 md0 DL6, pattern=ddbbccaa, dl_page=0x748626f200
01-10 16:57:20.821259   789   789 D ccci_lib: register user57 md0 UL6, pattern=ddbbccaa, ul_page=0x748626f280
01-10 16:57:20.821272   789   789 D ccci_lib: register user57 md0 DL7, pattern=ddbbccaa, dl_page=0x748626f300
01-10 16:57:20.821283   789   789 D ccci_lib: register user57 md0 UL7, pattern=ddbbccaa, ul_page=0x748626f380
01-10 16:57:20.821296   789   789 D ccci_lib: register user57 md0 DL8, pattern=ddbbccaa, dl_page=0x748626f400
01-10 16:57:20.821309   789   789 D ccci_lib: register user57 md0 UL8, pattern=ddbbccaa, ul_page=0x748626f480
01-10 16:57:20.821323   789   789 D ccci_lib: register user57 md0 DL9, pattern=ddbbccaa, dl_page=0x748626f500
01-10 16:57:20.821335   789   789 D ccci_lib: register user57 md0 UL9, pattern=ddbbccaa, ul_page=0x748626f580
01-10 16:57:20.821348   789   789 D ccci_lib: register user57 md0 DL10, pattern=ddbbccaa, dl_page=0x748626f600
01-10 16:57:20.821360   789   789 D ccci_lib: register user57 md0 UL10, pattern=ddbbccaa, ul_page=0x748626f680
01-10 16:57:20.821372   789   789 D ccci_lib: register user57 md0 DL11, pattern=ddbbccaa, dl_page=0x748626f700
01-10 16:57:20.821384   789   789 D ccci_lib: register user57 md0 UL11, pattern=ddbbccaa, ul_page=0x748626f780
01-10 16:57:20.821396   789   789 D ccci_lib: register user57 md0 DL12, pattern=ddbbccaa, dl_page=0x748626f800
01-10 16:57:20.821409   789   789 D ccci_lib: register user57 md0 UL12, pattern=ddbbccaa, ul_page=0x748626f880
01-10 16:57:20.821423   789   789 D ccci_lib: register user57 md0 DL13, pattern=ddbbccaa, dl_page=0x748626f900
01-10 16:57:20.821435   789   789 D ccci_lib: register user57 md0 UL13, pattern=ddbbccaa, ul_page=0x748626f980
01-10 16:57:20.821447   789   789 D ccci_lib: register user57 md0 DL14, pattern=ddbbccaa, dl_page=0x748626fa00
01-10 16:57:20.821460   789   789 D ccci_lib: register user57 md0 UL14, pattern=ddbbccaa, ul_page=0x748626fa80
01-10 16:57:20.821472   789   789 D ccci_lib: register user57 md0 DL15, pattern=ddbbccaa, dl_page=0x748626fb00
01-10 16:57:20.821486   789   789 D ccci_lib: register user57 md0 UL15, pattern=ddbbccaa, ul_page=0x748626fb80
01-10 16:57:20.821503   789   789 D ccci_lib: register user57 md0 DL16, pattern=ddbbccaa, dl_page=0x748626fc00
01-10 16:57:20.821516   789   789 D ccci_lib: register user57 md0 UL16, pattern=ddbbccaa, ul_page=0x748626fc80
01-10 16:57:20.821529   789   789 D ccci_lib: register user57 md0 DL17, pattern=ddbbccaa, dl_page=0x748626fd00
01-10 16:57:20.821627   789   789 D ccci_lib: register user57 md0 UL17, pattern=ddbbccaa, ul_page=0x748626ff80
01-10 16:57:20.821657   789   789 I EMDLOGGER1: MAL_ccb_Init: CCB is ready
01-10 16:57:20.823959   789   789 D ccci_lib: mmap on /dev/ccci_raw_dhl(7) for addr=0x7c200000, len=20971520
01-10 16:57:20.824604   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.825764   789   909 I EMDLOGGER1: mdlog_ccb_ctrl_reader_thread started
01-10 16:57:20.826022   789   789 D ccci_lib: write done of user57 buffer0: OK, i=1 write=1, alloc=1, free=0, len=16
01-10 16:57:20.826398   789   789 D ccci_lib: write done of user57 buffer0: OK, i=2 write=2, alloc=2, free=1, len=12
01-10 16:57:20.828574   789   789 D ccci_lib: write done of user57 buffer0: OK, i=3 write=3, alloc=3, free=2, len=16
01-10 16:57:20.828872   789   789 D EMDLOGGER1: Main: getSavedGPSLocation support_gps_location: 1
01-10 16:57:20.829026   789   789 D EMDLOGGER1: Not set property: persist.mtklog.mdlog.mdsilrbt
01-10 16:57:20.829964   789   910 D EMDLOGGER1: runListener
01-10 16:57:20.830050   789   789 D EMDLOGGER1: Success to setup socket local server
01-10 16:57:20.830067   789   789 I EMDLOGGER1: MDL: START Logging, mode=2 Gear Id when Reset=0
01-10 16:57:20.830079   789   789 D EMDLOGGER1: startMDLogging: Create starter thread
01-10 16:57:20.830090   789   789 D EMDLOGGER1: startLoggingThreadFun: curr_mode=0, new_mode=2
01-10 16:57:20.830100   789   789 I EMDLOGGER1: ------>Init SD logging mode<------
01-10 16:57:20.830175   789   789 D EMDLOGGER1: Init MDEngine: OK
01-10 16:57:20.830220   789   789 D EMDLOGGER1: MAL_ccb_QueryMDInfo : Send MAL_QueryMDInfo
01-10 16:57:20.830261   789   789 D ccci_lib: write done of user57 buffer0: OK, i=4 write=4, alloc=4, free=3, len=12
01-10 16:57:20.830661   789   789 D EMDLOGGER1: Init LogWritter: OK
01-10 16:57:20.830741   789   789 D EMDLOGGER1: OKOKOK >Init SD logging mode< OKOKOK
01-10 16:57:20.830754   789   789 D EMDLOGGER1: MDCommEngine.start: mode=2
01-10 16:57:20.830794   789   789 D EMDLOGGER1: LogWriter: Logging is started
01-10 16:57:20.832848   548   887 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 16:57:20.832908   548   887 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 16:57:20.832918   548   887 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 16:57:20.832925   548   887 I MtkCam/Utils: onCreate#03 pc 000f59f3  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+518)
01-10 16:57:20.832934   548   887 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 16:57:20.832942   548   887 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 16:57:20.832950   548   887 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 16:57:20.832959   548   887 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 16:57:20.832979   548   887 E MtkCam/IonHeap: PDC_tbl_4@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 16:57:20.833022   548   887 E isp_mgr_bnr: [PDC_tbl_1] ImageBufferHeap create fail (setBPCIBuf){#727:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/isp_mgr/isp_mgr_bnr.cpp}
01-10 16:57:20.833684   548   874 D AppTsf  : [TsfExit] TsfExit
01-10 16:57:20.833749   548   874 D AppTsf  : [~AppTsf] destructor
01-10 16:57:20.833772   548   874 D tsf_core: [~TsfCore] destructor
01-10 16:57:20.835164   548   874 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(1)
01-10 16:57:20.835264   548   874 I Drv/HWsync: Drv/HWsync[uninit] idx(0,remain_0),tg(0)
01-10 16:57:20.835282   548   874 W Drv/HWsync: Drv/HWsync[uninit] WARNING: wtginf, sindex(0x0),tg(0x0)
01-10 16:57:20.835292   548   874 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 16:57:20.835396   548   874 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11)
01-10 16:57:20.835447   548   874 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11), SENINF_TG1_PH_CNT(0x5)
01-10 16:57:20.835905   789   789 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 16:57:20.835988   789   789 D EMDLOGGER1: ccb_ioctl: fd 5, req 80044322, ret 0
01-10 16:57:20.836001   789   789 I EMDLOGGER1: MAL_ccb_GetModemSuffix: suffix 1_ulwctg_n
01-10 16:57:20.836138   789   789 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 16:57:20.836178   789   789 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 16:57:20.836246   789   789 D ccci_lib: write done of user57 buffer0: OK, i=5 write=5, alloc=5, free=4, len=12
01-10 16:57:20.836556   789   789 I EMDLOGGER1: MAL_ccb_QueryMDTime: MD time is 25648
01-10 16:57:20.837141   789   789 I EMDLOGGER1: Creating compressor thread
01-10 16:57:20.837464   789   912 I EMDLOGGER1: thrLogBufferWriter started
01-10 16:57:20.837581   789   789 D EMDLOGGER1: Check SD card status
01-10 16:57:20.840299   789   789 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 16:57:20.840413   789   789 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 16:57:20.840452   789   789 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 16:57:20.840485   789   789 E EMDLOGGER1: Failed to get the SD card status: /mnt/sdcard, errno=2
01-10 16:57:20.840496   789   789 D EMDLOGGER1: Failed to init logwriter: SD card status can't be got or is full.
01-10 16:57:20.840505   789   789 D EMDLOGGER1: Init LogWriter: SD card is not ready, record log on Nand
01-10 16:57:20.840513   789   789 D EMDLOGGER1: Create log file on Nand
01-10 16:57:20.841600   548   874 D ImgSensorDrv: [uninit][uninit] imgsensor_drv 0
01-10 16:57:20.842493   548   874 D SeninfDrvImp: [uninit][uninit]: 1 
01-10 16:57:20.842721   548   874 D SeninfDrvImp: [uninit][uninit]: 0, mfd(16) 
01-10 16:57:20.849190   548   874 I mtkcam-devicemgr: [detachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 16:57:20.513
01-10 16:57:20.849663   527   716 W CameraProviderManager: Camera provider internal/0 says an unknown camera device@1.0/internal/0 now has torch status 1. Curious.
01-10 16:57:20.849921   548   874 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:1
01-10 16:57:20.850043   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.850070   548   874 I mtkcam-dev1: 0[CameraDevice1Base::close] Del cameraId 0 - 0xe5c30600, this - 0xe5c30600
01-10 16:57:20.850164   548   874 I mtkcam-dev1: 0[CameraDevice1Base::close] -
01-10 16:57:20.850428   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:39
01-10 16:57:20.850843   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:39
01-10 16:57:20.850980   397   413 I libPerfService: perfUserUnregScn - handle:39
01-10 16:57:20.851108   527   716 I CameraProviderManager: Camera provider internal/0 ready with 1 camera devices
01-10 16:57:20.851236   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 16:57:20.852573   527   716 I CameraService: onDeviceStatusChanged: Status changed for cameraId=0, newStatus=1
01-10 16:57:20.852696   527   716 E CameraService: onDeviceStatusChanged: State transition to the same status 0x1 not allowed
01-10 16:57:20.853020   789   789 D EMDLOGGER1: Open log file /data/mdlog/bootupLog/mdlog1/MDLog1_2020_0110_165720_data.muxz.tmp.
01-10 16:57:20.853122   789   789 D ccci_lib: write done of user57 buffer0: OK, i=6 write=6, alloc=6, free=5, len=12
01-10 16:57:20.853414   789   789 D EMDLOGGER1: MALCTL_NOTIFY_AP_LOG_FILE_CREATE : /data/mdlog/bootupLog/mdlog1/MDLog1_2020_0110_165720_data.muxz.tmp
01-10 16:57:20.853431   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:-1
01-10 16:57:20.853845   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:-1
01-10 16:57:20.853889   397   413 I libPerfService: perfUserUnregScn - handle:-1
01-10 16:57:20.853978   789   789 D EMDLOGGER1: MAL_ccb_OnLoggingStart mode = 2
01-10 16:57:20.853995   789   925 I EMDLOGGER1: Started Waiting SD card thread.
01-10 16:57:20.854022   789   925 D EMDLOGGER1: Check SD card status
01-10 16:57:20.854040   789   789 D EMDLOGGER1: MAL_ccb_OnLoggingStart: Send SPLM_A2M_RESET_SPLM_STATE. mdlog_logging_mode = 1
01-10 16:57:20.854074   789   789 D ccci_lib: write done of user57 buffer0: OK, i=7 write=7, alloc=7, free=6, len=16
01-10 16:57:20.854111   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:-1
01-10 16:57:20.854452   789   789 D ccci_lib: write done of user57 buffer0: OK, i=8 write=8, alloc=8, free=7, len=16
01-10 16:57:20.855391   789   789 D EMDLOGGER1: MAL_ccb_OnLoggingStart: Send SPLM_A2M_AP_LOGGING_IS_READY, mdlog_logging_mode = 1
01-10 16:57:20.855489   789   789 D ccci_lib: write done of user57 buffer0: OK, i=9 write=9, alloc=9, free=8, len=16
01-10 16:57:20.857269   789   926 I EMDLOGGER1: Modem log reader thread started
01-10 16:57:20.857466   789   927 I EMDLOGGER1: Modem log writer thread started
01-10 16:57:20.857711   789   928 I EMDLOGGER1: Comm monitor thread started!
01-10 16:57:20.858900   789   789 D ccci_lib: write done of user57 buffer2: OK, i=1 write=1, alloc=1, free=0, len=1016
01-10 16:57:20.859067   789   789 D ccci_lib: write done of user57 buffer2: OK, i=2 write=2, alloc=2, free=0, len=8
01-10 16:57:20.859093   789   789 D ccci_lib: write done of user57 buffer2: OK, i=3 write=3, alloc=3, free=0, len=1016
01-10 16:57:20.859113   789   789 D ccci_lib: write done of user57 buffer2: OK, i=4 write=4, alloc=4, free=0, len=8
01-10 16:57:20.859138   789   789 D ccci_lib: write done of user57 buffer2: OK, i=5 write=5, alloc=5, free=0, len=1016
01-10 16:57:20.859159   789   789 D ccci_lib: write done of user57 buffer2: OK, i=6 write=6, alloc=6, free=0, len=8
01-10 16:57:20.859196   789   789 D ccci_lib: write done of user57 buffer2: OK, i=7 write=7, alloc=7, free=0, len=1016
01-10 16:57:20.859218   789   789 D ccci_lib: write done of user57 buffer2: OK, i=8 write=8, alloc=8, free=0, len=8
01-10 16:57:20.859253   789   789 D ccci_lib: write done of user57 buffer2: OK, i=9 write=9, alloc=9, free=0, len=1016
01-10 16:57:20.859290   789   789 D ccci_lib: write done of user57 buffer2: OK, i=10 write=10, alloc=10, free=0, len=8
01-10 16:57:20.859315   789   789 D ccci_lib: write done of user57 buffer2: OK, i=11 write=11, alloc=11, free=0, len=1016
01-10 16:57:20.859337   789   789 D ccci_lib: write done of user57 buffer2: OK, i=12 write=12, alloc=12, free=0, len=8
01-10 16:57:20.859362   789   789 D ccci_lib: write done of user57 buffer2: OK, i=13 write=13, alloc=13, free=0, len=1016
01-10 16:57:20.859384   789   789 D ccci_lib: write done of user57 buffer2: OK, i=14 write=14, alloc=14, free=0, len=8
01-10 16:57:20.859416   789   789 D ccci_lib: write done of user57 buffer2: OK, i=15 write=15, alloc=15, free=0, len=1016
01-10 16:57:20.859439   789   789 D ccci_lib: write done of user57 buffer2: OK, i=16 write=16, alloc=16, free=0, len=8
01-10 16:57:20.859464   789   789 D ccci_lib: write done of user57 buffer2: OK, i=17 write=17, alloc=17, free=1, len=1016
01-10 16:57:20.859489   789   789 D ccci_lib: write done of user57 buffer2: OK, i=18 write=18, alloc=18, free=1, len=8
01-10 16:57:20.859545   789   789 D ccci_lib: write done of user57 buffer2: OK, i=19 write=19, alloc=19, free=1, len=410
01-10 16:57:20.859671   789   789 E EMDLOGGER1: filter size: 9634 Bytes
01-10 16:57:20.859731   789   789 E EMDLOGGER1: filter modified time:2009-01-01 07:00:00
01-10 16:57:20.859744   789   789 E EMDLOGGER1: filter path:/system/vendor/firmware/catcher_filter_1_ulwctg_n.bin
01-10 16:57:20.859754   789   789 D EMDLOGGER1: passFilter: filter successfully sent
01-10 16:57:20.860326   789   789 I EMDLOGGER1: create log recycle thread for data folder log after MAL_start pass
01-10 16:57:20.860663   789   789 D EMDLOGGER1: Start MDEngine: done. mode = 2
01-10 16:57:20.860704   789   789 I EMDLOGGER1: Success to start logging in SD Mode!
01-10 16:57:20.860716   789   789 D EMDLOGGER1: startLoggingThread result is 1
01-10 16:57:20.860728   789   789 D EMDLOGGER1: startLoggingThread: inform auto start done
01-10 16:57:20.860825   789   789 E EMDLOGGER1: System is not ready then can not auto Start intent.
01-10 16:57:20.860865   789   789 D EMDLOGGER1: Normal boot 1
01-10 16:57:20.861037   789   789 D EMDLOGGER1: Open servFifoFd FIFO -1
01-10 16:57:20.866820   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.867000   789   925 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 16:57:20.867198   789   925 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 16:57:20.867253   789   925 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 16:57:20.868558   521   521 W Zygote  : Class not found for preloading: android.icu.impl.number.Parse
01-10 16:57:20.868746   789   931 I EMDLOGGER1: Detect filter thread started!
01-10 16:57:20.882863   521   521 I zygote64: Thread[1,tid=521,Native,Thread*=0x73d3ac3a00,peer=0x12c01fb8,"main"] recursive attempt to load library "/system/lib64/libmedia_jni.so"
01-10 16:57:20.883453   521   521 D MtpDeviceJNI: register_android_mtp_MtpDevice
01-10 16:57:20.884981   521   521 I zygote64: Thread[1,tid=521,Native,Thread*=0x73d3ac3a00,peer=0x12c01fb8,"main"] recursive attempt to load library "/system/lib64/libmedia_jni.so"
01-10 16:57:20.885788   521   521 I zygote64: Thread[1,tid=521,Native,Thread*=0x73d3ac3a00,peer=0x12c01fb8,"main"] recursive attempt to load library "/system/lib64/libmedia_jni.so"
01-10 16:57:20.891863   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.908629   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.913780   521   521 D MtkSettingsProviderExt: Global moveToSecure
01-10 16:57:20.916051   521   521 D MtkSettingsProviderExt: Secure moveToGlobal
01-10 16:57:20.917480   521   521 D MtkSettingsProviderExt: System moveToSecure
01-10 16:57:20.917754   521   521 D MtkSettingsProviderExt: System moveToGlobal
01-10 16:57:20.918539   521   521 D MtkSettingsProviderExt: putInPublicSettings
01-10 16:57:20.933511   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.950227   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:20.975676   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:20.977349   544   568 I ServiceManager: Waiting for service package_native...
01-10 16:57:20.992332   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.003877   523   549 D AAL     : 01-10 04:57:20.938 BL=1022,ESS= 256, 01-10 04:57:20.946 BL=1021,ESS= 256, 01-10 04:57:20.965 BL=1022,ESS= 256, 01-10 04:57:20.984 BL=1023,ESS= 256, 01-10 04:57:21.003 BL=1022,ESS= 256, 
01-10 16:57:21.017328   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.034203   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.059384   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.060386   521   521 I Zygote  : ...preloaded 4715 classes in 937ms.
01-10 16:57:21.060601   521   521 I zygote64: VMRuntime.preloadDexCaches starting
01-10 16:57:21.068546   379   864 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Fail to connect . retry count: 2
01-10 16:57:21.068964   379   864 D VT HIDL : [IVT] isIMCBrun : True
01-10 16:57:21.076106   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.097677   523   549 D AAL     : 01-10 04:57:21.022 BL=1021,ESS= 256, 01-10 04:57:21.041 BL=1020,ESS= 256, 01-10 04:57:21.059 BL=1019,ESS= 256, 01-10 04:57:21.078 BL=1018,ESS= 256, 01-10 04:57:21.097 BL=1017,ESS= 256, 
01-10 16:57:21.101191   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.118432   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.143352   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.160037   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.166401   521   521 I zygote64: VMRuntime.preloadDexCaches strings total=360436 before=13118 after=13118
01-10 16:57:21.166488   521   521 I zygote64: VMRuntime.preloadDexCaches types total=30514 before=6502 after=6516
01-10 16:57:21.166507   521   521 I zygote64: VMRuntime.preloadDexCaches fields total=142505 before=5834 after=5892
01-10 16:57:21.166522   521   521 I zygote64: VMRuntime.preloadDexCaches methods total=267782 before=12265 after=12328
01-10 16:57:21.166535   521   521 I zygote64: VMRuntime.preloadDexCaches finished
01-10 16:57:21.169909   885   885 I [epdg_wo]: [C3I] wo_ccci_open: status:MD ready
01-10 16:57:21.170021   885   885 I [epdg_wo]: [WOA] Open /dev/ccci_woa successfully (fd:5); wait adpt ready...
01-10 16:57:21.170109   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=1](13)
01-10 16:57:21.185285   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.191984   523   549 D AAL     : 01-10 04:57:21.116 BL=1016,ESS= 256, 01-10 04:57:21.135 BL=1015,ESS= 256, 01-10 04:57:21.154 BL=1014,ESS= 256, 01-10 04:57:21.172 BL=1013,ESS= 256, 01-10 04:57:21.191 BL=1012,ESS= 256, 
01-10 16:57:21.201993   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.227408   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.244199   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.269150   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.286040   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.286226   523   549 D AAL     : 01-10 04:57:21.210 BL=1011,ESS= 256, 01-10 04:57:21.229 BL=1010,ESS= 256, 01-10 04:57:21.248 BL=1009,ESS= 256, 01-10 04:57:21.267 BL=1008,ESS= 256, 01-10 04:57:21.286 BL=1007,ESS= 256, 
01-10 16:57:21.311219   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.328039   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.353618   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.356766   521   521 I Zygote  : Preloading resources...
01-10 16:57:21.370603   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.380060   521   521 W Resources: Preloaded drawable resource #0x1080264 (android:drawable/dialog_background_material) that varies with configuration!!
01-10 16:57:21.380507   523   549 D AAL     : 01-10 04:57:21.305 BL=1006,ESS= 256, 01-10 04:57:21.323 BL=1005,ESS= 256, 01-10 04:57:21.342 BL=1004,ESS= 256, 01-10 04:57:21.361 BL=1003,ESS= 256, 01-10 04:57:21.380 BL=1002,ESS= 256, 
01-10 16:57:21.394974   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.403234   521   521 I Zygote  : ...preloaded 64 resources in 46ms.
01-10 16:57:21.408829   521   521 W Resources: Preloaded color resource #0x1060053 (android:color/btn_default_material_dark) that varies with configuration!!
01-10 16:57:21.409873   521   521 I Zygote  : ...preloaded 41 resources in 4ms.
01-10 16:57:21.411891   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.435293   930   930 D         : [SYSENV]sysenv_get_with_area():429 , get env name=msim_config
01-10 16:57:21.435381   930   930 D         : [SYSENV]get_env_info():311 , initialize
01-10 16:57:21.435571   930   930 D         : [SYSENV]get_partition_count():107 , get_partition_count ret ptr: 38
01-10 16:57:21.435717   930   930 D         : [SYSENV]get_partition_path():158 , partition path = /dev/block/mmcblk0p3
01-10 16:57:21.435767   930   930 E         : [SYSENV]get_env_info():321 , env_buffer[1] : 838455c0
01-10 16:57:21.436555   930   930 D         : [SYSENV]read_env_area():244 , read 16384 data from 24000 to 838455c0
01-10 16:57:21.436815   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.436853   930   930 W         : [SYSENV]get_env_info():352 , Incorrect sig, probably sysenv is still empty
01-10 16:57:21.453965   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.460953   521   521 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 16:57:21.465999   521   521 D libEGL  : loaded /vendor/lib64/egl/libGLES_mali.so
01-10 16:57:21.474993   523   549 D AAL     : 01-10 04:57:21.399 BL=1001,ESS= 256, 01-10 04:57:21.418 BL=1000,ESS= 256, 01-10 04:57:21.437 BL= 999,ESS= 256, 01-10 04:57:21.455 BL= 998,ESS= 256, 01-10 04:57:21.474 BL= 997,ESS= 256, 
01-10 16:57:21.478662   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.495831   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.507521   521   521 I Zygote  : Preloading shared libraries...
01-10 16:57:21.520789   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.527858   795   795 I VoLTE IMCB-2: {{{{[process_msg] msg_id=101602(0x00018CE2), dst=VT1[7], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:21.527858   795   795 I VoLTE IMCB-2: connection status change for module 7 as error_num 0 imcb_imcb_comm_error_handler()@0#797
01-10 16:57:21.527858   795   795 I VoLTE IMCB-2: ENTER imcb_send_multiple_imc_imsvt_connect_req()@0#4072
01-10 16:57:21.527858   795   795 I VoLTE IMCB-2: CHECK: is_connect 0 imcb_send_imc_imsvt_connect_req()@0#4060
01-10 16:57:21.527858   795   795 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:21.527858   795   795 I VoLTE IMCB-2: CHECK: is_connect 0 imcb_send_imc_imsvt_connect_req()@1#4060
01-10 16:57:21.527858   795   795 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248}}}}
01-10 16:57:21.528273   795   795 I VoLTE IMCB-2: {{{{CHECK: is_connect 0 imcb_send_imc_imsvt_connect_req()@2#4060
01-10 16:57:21.528273   795   795 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 16:57:21.528273   795   795 I VoLTE IMCB-2: ENTER imcb_send_multiple_imc_imsvt_connect_req()@0#4072
01-10 16:57:21.528273   795   795 I VoLTE IMCB-2: CHECK: is_connect 1 imcb_send_imc_imsvt_connect_req()@0#4060
01-10 16:57:21.528273   795   795 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:21.528273   795   795 I VoLTE IMCB-2: CHECK: is_connect 1 imcb_send_imc_imsvt_connect_req()@1#4060
01-10 16:57:21.528273   795   795 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248}}}}
01-10 16:57:21.528396   795   795 I VoLTE IMCB: {{{{CHECK: is_connect 1 imcb_send_imc_imsvt_connect_req()@2#4060
01-10 16:57:21.528396   795   795 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 16:57:21.528396   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:21.529904   521   521 I Zygote  : Uninstalled ICU cache reference pinning...
01-10 16:57:21.531852   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:21.532171   521   521 I Zygote  : Installed AndroidKeyStoreProvider in 2ms.
01-10 16:57:21.532551   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100038(0x000186C6), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:21.532551   795   795 I VoLTE IMCB: ENTER imcb_imc_vt_cap_query_ind_handler()@0#5407
01-10 16:57:21.532551   795   795 I VoLTE IMCB: ENTER imcb_send_imsvt_get_cap_req()@0#4089
01-10 16:57:21.532551   795   795 I VoLTE IMCB: Pure Mesage Send dest=VT1[7], msg_id=101505(0x00018C81), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:21.532551   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:21.532903   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:21.535321   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100038(0x000186C6), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 16:57:21.535321   795   795 I VoLTE IMCB: ENTER imcb_imc_vt_cap_query_ind_handler()@1#5407
01-10 16:57:21.535321   795   795 I VoLTE IMCB: ENTER imcb_send_imsvt_get_cap_req()@1#4089
01-10 16:57:21.535321   795   795 I VoLTE IMCB: Pure Mesage Send dest=VT1[7], msg_id=101505(0x00018C81), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 16:57:21.535321   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:21.535413   548   879 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 16:57:21.538325   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.539377   557   585 D agps    : [agps][n][RIL] rilp_init_handler = 0
01-10 16:57:21.539603   557   585 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_RE_INIT_RPC
01-10 16:57:21.546081   521   521 I Zygote  : Warmed up JCA providers in 14ms.
01-10 16:57:21.546166   521   521 D Zygote  : end preload
01-10 16:57:21.557037   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:21.557773   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:21.557773   795   795 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@0#5493
01-10 16:57:21.557773   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=24, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:21.557773   795   795 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@0#5518
01-10 16:57:21.557773   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:21.558062   794   840 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 16:57:21.558181   794   840 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 16:57:21.558153   792   827 I VoLTE REG: rcs_feature = 0 (module/volte//volte_stack/src/reg/reg.c:3230)
01-10 16:57:21.558223   794   840 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 16:57:21.558236   792   827 I VoLTE REG: rcs_state = 0 (module/volte//volte_stack/src/reg/reg.c:3233)
01-10 16:57:21.562595   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.563915   521   521 I zygote64: Explicit concurrent copying GC freed 16168(799KB) AllocSpace objects, 2(56KB) LOS objects, 75% free, 1501KB/5MB, paused 101us total 17.421ms
01-10 16:57:21.569160   379   864 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Fail to connect . retry count: 3
01-10 16:57:21.569182   523   549 D AAL     : 01-10 04:57:21.494 BL= 996,ESS= 256, 01-10 04:57:21.512 BL= 995,ESS= 256, 01-10 04:57:21.531 BL= 994,ESS= 256, 01-10 04:57:21.550 BL= 993,ESS= 256, 01-10 04:57:21.569 BL= 992,ESS= 256, 
01-10 16:57:21.569608   379   864 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Success fd: 10
01-10 16:57:21.569652   379   864 I VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 initialize communication
01-10 16:57:21.569666   379   864 D VT HIDL : [IVT] getInstance
01-10 16:57:21.569681   379   864 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] read from IMCB
01-10 16:57:21.579379   521   521 I zygote64: Explicit concurrent copying GC freed 2260(112KB) AllocSpace objects, 0(0B) LOS objects, 75% free, 1420KB/5MB, paused 46us total 13.426ms
01-10 16:57:21.580575   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.581704   521   521 I zygote64: Global filter of size 170 installed
01-10 16:57:21.604361   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.614993   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:21.615605   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100109(0x0001870D), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:21.615605   795   795 I VoLTE IMCB: ENTER imcb_imc_ussd_urc_status_ind_handler()@0#5365
01-10 16:57:21.615605   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=16002(0x00003E82), len=8, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:21.615605   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:21.615717   794   843 E VoLTE Service: Error message type, type = 16002, len = 8 (module/volte//volte_ua/src/service/service.c:1118)
01-10 16:57:21.622114   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.629181   521   521 I Zygote  : System server process 987 has been created
01-10 16:57:21.632591   521   521 I Zygote  : Accepting command socket connections
01-10 16:57:21.646242   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.649549   987   987 I Zygote  : Process: zygote socket zygote_secondary opened, supported ABIS: armeabi-v7a,armeabi
01-10 16:57:21.663876   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.664488   523   549 D AAL     : 01-10 04:57:21.587 BL= 991,ESS= 256, 01-10 04:57:21.606 BL= 990,ESS= 256, 01-10 04:57:21.625 BL= 989,ESS= 256, 01-10 04:57:21.644 BL= 988,ESS= 256, 01-10 04:57:21.664 BL= 987,ESS= 256, 
01-10 16:57:21.687941   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.705061   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.728488   548   884 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:21.726000   548   548 W HwBinder:548_2: type=1400 audit(0.0:35): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:21.729810   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.740720   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:21.747331   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.758018   523   549 D AAL     : 01-10 04:57:21.682 BL= 986,ESS= 256, 01-10 04:57:21.701 BL= 985,ESS= 256, 01-10 04:57:21.719 BL= 984,ESS= 256, 01-10 04:57:21.738 BL= 983,ESS= 256, 01-10 04:57:21.757 BL= 982,ESS= 256, 
01-10 16:57:21.758555   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=23.94 dur=1002.61 max=43.54 min=39.27
01-10 16:57:21.759522   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:21.761221   987   987 I chatty  : uid=1000 system_server identical 1 line
01-10 16:57:21.767781   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:21.771770   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.785114   364   370 D tkcore-teec: New pos: 76017
01-10 16:57:21.785776   364   370 D tkcore-teec: Logging started
01-10 16:57:21.789036   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.782000   364   364 W teed    : type=1400 audit(0.0:36): avc: denied { write } for name="/" dev="dm-2" ino=2 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:21.813116   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:21.813608   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.831062   789   910 E EMDLOGGER1: select timeout
01-10 16:57:21.831128   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.852343   523   549 D AAL     : 01-10 04:57:21.776 BL= 981,ESS= 256, 01-10 04:57:21.795 BL= 980,ESS= 256, 01-10 04:57:21.814 BL= 979,ESS= 256, 01-10 04:57:21.833 BL= 978,ESS= 256, 01-10 04:57:21.852 BL= 977,ESS= 256, 
01-10 16:57:21.855609   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.862124   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:23.667128,dur:1056.32,max:57.04,min:37.28
01-10 16:57:21.873051   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.897302   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.915197   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.939286   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.946453   523   549 D AAL     : 01-10 04:57:21.870 BL= 976,ESS= 256, 01-10 04:57:21.889 BL= 975,ESS= 256, 01-10 04:57:21.908 BL= 974,ESS= 256, 01-10 04:57:21.927 BL= 973,ESS= 256, 01-10 04:57:21.946 BL= 972,ESS= 256, 
01-10 16:57:21.956672   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:21.981144   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:21.998828   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.023103   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.035654   379   864 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] read from IMCB done
01-10 16:57:22.035788   379   864 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (status = 0)
01-10 16:57:22.035825   379   864 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (efGroup = -205418008)
01-10 16:57:22.035859   379   864 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (type)
01-10 16:57:22.035924   379   864 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (len)
01-10 16:57:22.035949   379   864 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (buffer)
01-10 16:57:22.035978   379   864 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] read from IMCB
01-10 16:57:22.036033   530   857 I VT      : [SRV] [VT THREAD] [VT_HIDL_Thread] msg_type : 101505
01-10 16:57:22.036149   530   857 I VT      : [SRV] [VT THREAD] [VT_HIDL_Thread] recv_length : 4
01-10 16:57:22.036178   530   857 I VT      : [SRV] [VT THREAD] [VT_HIDL_Thread] outBuffer
01-10 16:57:22.036196   530   857 I VT      : [VT] [DISPATCHER] VTMsgDispatcher dispatchMessage
01-10 16:57:22.036565   530   855 I VT      : [VT] [PRI HDLR] VTPriMsgHdlr onMessageReceived
01-10 16:57:22.036622   530   855 I VT      : [VT] [PRI HDLR] VTPriMsgHdlr dispatch normal message
01-10 16:57:22.036741   530   856 I VT      : [VT] [HDLR] VTMsgHdlr onMessageReceived
01-10 16:57:22.036774   530   856 I VT      : [VT] [HDLR] VTMsgHdlr handle normal message
01-10 16:57:22.036843   530   856 W VT      : [SRV] [OPERATION][ID=0] vt_callback (MSG_ID_WRAP_IMSVT_IMCB_GET_CAP_IND)
01-10 16:57:22.036892   530   856 I VT      : [SRV] [MA NOTIFY] Get camera capability (id = 0) (arg1 = 0, arg2 = 0, arg3 = 0)
01-10 16:57:22.036907   530   856 I VT      : [SRV] [MA NOTIFY]                   (obj1 = , obj2 = )
01-10 16:57:22.036922   530   856 I VT      : [VTS] gVTSClient == NULL
01-10 16:57:22.040668   523   549 D AAL     : 01-10 04:57:21.965 BL= 971,ESS= 256, 01-10 04:57:21.984 BL= 970,ESS= 256, 01-10 04:57:22.005 BL= 969,ESS= 256, 01-10 04:57:22.022 BL= 968,ESS= 256, 01-10 04:57:22.040 BL= 967,ESS= 256, 
01-10 16:57:22.040934   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.064943   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.083081   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.106842   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.125343   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.135058   523   549 D AAL     : 01-10 04:57:22.059 BL= 966,ESS= 256, 01-10 04:57:22.078 BL= 965,ESS= 256, 01-10 04:57:22.097 BL= 964,ESS= 256, 01-10 04:57:22.116 BL= 963,ESS= 256, 01-10 04:57:22.134 BL= 962,ESS= 256, 
01-10 16:57:22.135211   404   404 W ccci_fsd(1): O: X://ST33_004, flag 0x700, ret 1
01-10 16:57:22.137634   404   404 W ccci_fsd(1): O: Y://ST33_004, flag 0x700, ret 1
01-10 16:57:22.148560   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.167250   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.170505   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:1,0](15)
01-10 16:57:22.170683   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=1](13)
01-10 16:57:22.175077   557   627 D agps    : [agps] WARNING: [CP] cp2_fd_1_req_sim_num_timeout
01-10 16:57:22.175305   557   585 D agps    : [agps][n][CP] [MD_1] write  sim_info_req  gsm_disabled=[0] umts_disabled=[0] lte_disabled=[0] lppe_enable=[1] lppe_network_location_disable=[0] reject_non911_nilr_enable=[0] battery_percentage=[100]
01-10 16:57:22.179385   557   585 D agps    : [agps][n][CP] [MD_1] read  sim_info_rsp  sim_number=2 md_type=0 (0=fdd, 1=tdd) ecid=1 otdoa=0 band_num=11
01-10 16:57:22.179495   557   585 D agps    : [agps][n][CP] i=0  support_band=1
01-10 16:57:22.179570   557   585 D agps    : [agps][n][CP] i=1  support_band=3
01-10 16:57:22.179620   557   585 D agps    : [agps][n][CP] i=2  support_band=5
01-10 16:57:22.179642   557   585 D agps    : [agps][n][CP] i=3  support_band=7
01-10 16:57:22.179676   557   585 D agps    : [agps][n][CP] i=4  support_band=8
01-10 16:57:22.179697   557   585 D agps    : [agps][n][CP] i=5  support_band=20
01-10 16:57:22.179733   557   585 D agps    : [agps][n][CP] i=6  support_band=28
01-10 16:57:22.179761   557   585 D agps    : [agps][n][CP] i=7  support_band=38
01-10 16:57:22.179774   557   585 D agps    : [agps][n][CP] i=8  support_band=39
01-10 16:57:22.179788   557   585 D agps    : [agps][n][CP] i=9  support_band=40
01-10 16:57:22.179802   557   585 D agps    : [agps][n][CP] i=10  support_band=41
01-10 16:57:22.179830   557   585 D agps    : [agps][n][CP] index=[0]  support_lpp_otdoa_nbr_cell_list=[0] support_supl_flow_ind=[1] support_location_settings=[1] support_cp_lppe=[0]
01-10 16:57:22.180231   557   585 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[0]
01-10 16:57:22.180248   557   611 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_LBS_CAPABILITY_UPDATE_REQ]
01-10 16:57:22.180324   557   611 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_PEER_EUTRAN_BAND_UPDATE_CNF]
01-10 16:57:22.180446   557   585 D agps    : [agps][n][AGPS] [MNL] write  agps_settings_sync  sib8_16=[1], gps=[1] glonass=[1] beidou=[1] galileo=[1] agps=[1] aglonass=[1] abeidou=[0] agalileo=[0]
01-10 16:57:22.180826   520   693 D MNLD    : agps_settings_sync: agps setting, sib8_16_enable = 1, gps_sat_en = 1, glonass_sat_en = 1,         beidou_sat_en = 1, galileo_sat_en = 1, a_glonass_sat_en = 1,         a_gps_satellite_enable = 1, a_beidou_satellite_enable = 0, a_galileo_satellite_enable = 0, lppe_enable=1
01-10 16:57:22.181537   520   693 D MNLD    : agps_settings_sync: mnl stop, mnld send pmtk764 to agpsd
01-10 16:57:22.181601   520   693 D MNLD    : get_agnss_capability: MNLD_PMTK764: $PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 16:57:22.181601   520   693 D MNLD    : , agps_cap:1, aglonass_cap:1, abeidou_cap:0, agalileo_cap:0, lppe_support:1
01-10 16:57:22.181671   557   585 D agps    : [agps][n][AGPS] [MNL] read  agps_settings_ack  gps=[1] glonass=[1] beidou=[1] galileo=[0]
01-10 16:57:22.181832   557   585 D agps    : [agps][n][AGPS] [MNL] read  pmtk=[$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 16:57:22.181832   557   585 D agps    : ]
01-10 16:57:22.181863   557   585 D agps    : [agps][n][AGPS] gnss_num=2
01-10 16:57:22.181910   557   585 D agps    : [agps][n][CP] [MD_1] write  pmtk [$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 16:57:22.181910   557   585 D agps    : ]
01-10 16:57:22.190507   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.206995   987   987 D MtkCam/Utils: ###### get camera log property =-1
01-10 16:57:22.209479   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.212484   987   987 D aaa_log : ###### get hal3a log level =-1
01-10 16:57:22.229020   523   549 D AAL     : 01-10 04:57:22.153 BL= 961,ESS= 256, 01-10 04:57:22.172 BL= 960,ESS= 256, 01-10 04:57:22.191 BL= 959,ESS= 256, 01-10 04:57:22.210 BL= 958,ESS= 256, 01-10 04:57:22.228 BL= 957,ESS= 256, 
01-10 16:57:22.232290   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.244966   531   560 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 16:57:22.251795   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.274043   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.287482   404   404 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 16:57:22.293639   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.295843   404   404 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 16:57:22.307536   404   404 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 16:57:22.309782   404   404 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 16:57:22.312186   404   404 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 16:57:22.314002   404   404 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 16:57:22.315960   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.316851   404   404 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 16:57:22.319096   404   404 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 16:57:22.321516   404   404 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 16:57:22.323215   404   404 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 16:57:22.323541   523   549 D AAL     : 01-10 04:57:22.248 BL= 956,ESS= 256, 01-10 04:57:22.266 BL= 955,ESS= 256, 01-10 04:57:22.285 BL= 954,ESS= 256, 01-10 04:57:22.304 BL= 953,ESS= 256, 01-10 04:57:22.323 BL= 952,ESS= 256, 
01-10 16:57:22.336371   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.357758   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.373316   987  1006 E BluetoothAdapter: Bluetooth binder is null
01-10 16:57:22.378441   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.395618   987  1006 I PowerManagerService-JNI: Loaded power HAL service
01-10 16:57:22.399733   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.417777   523   549 D AAL     : 01-10 04:57:22.343 BL= 951,ESS= 256, 01-10 04:57:22.361 BL= 950,ESS= 256, 01-10 04:57:22.380 BL= 949,ESS= 256, 01-10 04:57:22.399 BL= 948,ESS= 256, 01-10 04:57:22.417 BL= 947,ESS= 256, 
01-10 16:57:22.420423   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.441489   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.462538   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.483554   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.491276   987   987 I AES     : load Exception Log jni
01-10 16:57:22.496947   987   987 W zygote64: Failed to remove /acct/uid_0/pid_304: Device or resource busy
01-10 16:57:22.497130   987   987 W zygote64: Failed to remove /acct/uid_0/pid_366: Device or resource busy
01-10 16:57:22.497185   987   987 W zygote64: Failed to remove /acct/uid_0/pid_399: Device or resource busy
01-10 16:57:22.497212   987   987 W zygote64: Failed to remove /acct/uid_0/pid_400: Device or resource busy
01-10 16:57:22.497244   987   987 W zygote64: Failed to remove /acct/uid_0/pid_402: Device or resource busy
01-10 16:57:22.497271   987   987 W zygote64: Failed to remove /acct/uid_0/pid_403: Device or resource busy
01-10 16:57:22.497308   987   987 W zygote64: Failed to remove /acct/uid_0/pid_409: Device or resource busy
01-10 16:57:22.497458   987   987 W zygote64: Failed to remove /acct/uid_0/pid_521: Device or resource busy
01-10 16:57:22.497489   987   987 W zygote64: Failed to remove /acct/uid_0/pid_522: Device or resource busy
01-10 16:57:22.497518   987   987 W zygote64: Failed to remove /acct/uid_0/pid_531: Device or resource busy
01-10 16:57:22.497546   987   987 W zygote64: Failed to remove /acct/uid_0/pid_538: Device or resource busy
01-10 16:57:22.497575   987   987 W zygote64: Failed to remove /acct/uid_0/pid_539: Device or resource busy
01-10 16:57:22.497602   987   987 W zygote64: Failed to remove /acct/uid_0/pid_541: Device or resource busy
01-10 16:57:22.497632   987   987 W zygote64: Failed to remove /acct/uid_0/pid_542: Device or resource busy
01-10 16:57:22.497660   987   987 W zygote64: Failed to remove /acct/uid_0/pid_543: Device or resource busy
01-10 16:57:22.497688   987   987 W zygote64: Failed to remove /acct/uid_0/pid_544: Device or resource busy
01-10 16:57:22.497720   987   987 W zygote64: Failed to remove /acct/uid_0/pid_550: Device or resource busy
01-10 16:57:22.497782   987   987 W zygote64: Failed to remove /acct/uid_0/pid_559: Device or resource busy
01-10 16:57:22.497878   987   987 W zygote64: Failed to remove /acct/uid_0/pid_725: Device or resource busy
01-10 16:57:22.497906   987   987 W zygote64: Failed to remove /acct/uid_0/pid_726: Device or resource busy
01-10 16:57:22.497932   987   987 W zygote64: Failed to remove /acct/uid_0/pid_727: Device or resource busy
01-10 16:57:22.497960   987   987 W zygote64: Failed to remove /acct/uid_0/pid_729: Device or resource busy
01-10 16:57:22.497989   987   987 W zygote64: Failed to remove /acct/uid_0/pid_787: Device or resource busy
01-10 16:57:22.498018   987   987 W zygote64: Failed to remove /acct/uid_0/pid_790: Device or resource busy
01-10 16:57:22.498048   987   987 W zygote64: Failed to remove /acct/uid_0/pid_791: Device or resource busy
01-10 16:57:22.498074   987   987 W zygote64: Failed to remove /acct/uid_0/pid_792: Device or resource busy
01-10 16:57:22.498101   987   987 W zygote64: Failed to remove /acct/uid_0/pid_794: Device or resource busy
01-10 16:57:22.498129   987   987 W zygote64: Failed to remove /acct/uid_0/pid_795: Device or resource busy
01-10 16:57:22.498156   987   987 W zygote64: Failed to remove /acct/uid_0/pid_885: Device or resource busy
01-10 16:57:22.498191   987   987 W zygote64: Failed to remove /acct/uid_0: Permission denied
01-10 16:57:22.498310   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_350: Device or resource busy
01-10 16:57:22.498338   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_351: Device or resource busy
01-10 16:57:22.498365   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_352: Device or resource busy
01-10 16:57:22.498424   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_364: Device or resource busy
01-10 16:57:22.498452   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_365: Device or resource busy
01-10 16:57:22.498513   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_378: Device or resource busy
01-10 16:57:22.498542   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_379: Device or resource busy
01-10 16:57:22.498573   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_384: Device or resource busy
01-10 16:57:22.498601   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_387: Device or resource busy
01-10 16:57:22.498628   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_388: Device or resource busy
01-10 16:57:22.498656   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_389: Device or resource busy
01-10 16:57:22.498684   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_390: Device or resource busy
01-10 16:57:22.498713   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_391: Device or resource busy
01-10 16:57:22.498740   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_392: Device or resource busy
01-10 16:57:22.498766   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_393: Device or resource busy
01-10 16:57:22.498793   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_395: Device or resource busy
01-10 16:57:22.498821   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_396: Device or resource busy
01-10 16:57:22.498847   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_397: Device or resource busy
01-10 16:57:22.498877   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_401: Device or resource busy
01-10 16:57:22.498905   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_406: Device or resource busy
01-10 16:57:22.499029   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_411: Device or resource busy
01-10 16:57:22.499128   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_523: Device or resource busy
01-10 16:57:22.499158   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_526: Device or resource busy
01-10 16:57:22.499190   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_529: Device or resource busy
01-10 16:57:22.499219   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_530: Device or resource busy
01-10 16:57:22.499249   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_547: Device or resource busy
01-10 16:57:22.499278   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_551: Device or resource busy
01-10 16:57:22.499305   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_554: Device or resource busy
01-10 16:57:22.499333   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_555: Device or resource busy
01-10 16:57:22.499361   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_556: Device or resource busy
01-10 16:57:22.499388   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_558: Device or resource busy
01-10 16:57:22.499418   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_562: Device or resource busy
01-10 16:57:22.499448   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_563: Device or resource busy
01-10 16:57:22.499478   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_564: Device or resource busy
01-10 16:57:22.499506   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_569: Device or resource busy
01-10 16:57:22.499533   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_571: Device or resource busy
01-10 16:57:22.499560   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_572: Device or resource busy
01-10 16:57:22.499591   987   987 W zygote64: Failed to remove /acct/uid_1000/pid_575: Device or resource busy
01-10 16:57:22.499628   987   987 W zygote64: Failed to remove /acct/uid_1000: Permission denied
01-10 16:57:22.499702   987   987 W zygote64: Failed to remove /acct/uid_1001/pid_404: Device or resource busy
01-10 16:57:22.499768   987   987 W zygote64: Failed to remove /acct/uid_1001/pid_408: Device or resource busy
01-10 16:57:22.499796   987   987 W zygote64: Failed to remove /acct/uid_1001/pid_415: Device or resource busy
01-10 16:57:22.499823   987   987 W zygote64: Failed to remove /acct/uid_1001/pid_930: Device or resource busy
01-10 16:57:22.499843   987   987 W zygote64: Failed to remove /acct/uid_1001: Permission denied
01-10 16:57:22.499897   987   987 W zygote64: Failed to remove /acct/uid_1002/pid_381: Device or resource busy
01-10 16:57:22.499917   987   987 W zygote64: Failed to remove /acct/uid_1002: Permission denied
01-10 16:57:22.499965   987   987 W zygote64: Failed to remove /acct/uid_1003/pid_481: Device or resource busy
01-10 16:57:22.499985   987   987 W zygote64: Failed to remove /acct/uid_1003: Permission denied
01-10 16:57:22.500039   987   987 W zygote64: Failed to remove /acct/uid_1010/pid_394: Device or resource busy
01-10 16:57:22.500068   987   987 W zygote64: Failed to remove /acct/uid_1010/pid_545: Device or resource busy
01-10 16:57:22.500094   987   987 W zygote64: Failed to remove /acct/uid_1010/pid_566: Device or resource busy
01-10 16:57:22.500116   987   987 W zygote64: Failed to remove /acct/uid_1010: Permission denied
01-10 16:57:22.500170   987   987 W zygote64: Failed to remove /acct/uid_1013/pid_383: Device or resource busy
01-10 16:57:22.500196   987   987 W zygote64: Failed to remove /acct/uid_1013/pid_385: Device or resource busy
01-10 16:57:22.500223   987   987 W zygote64: Failed to remove /acct/uid_1013/pid_386: Device or resource busy
01-10 16:57:22.500250   987   987 W zygote64: Failed to remove /acct/uid_1013/pid_534: Device or resource busy
01-10 16:57:22.500278   987   987 W zygote64: Failed to remove /acct/uid_1013/pid_536: Device or resource busy
01-10 16:57:22.500304   987   987 W zygote64: Failed to remove /acct/uid_1013/pid_537: Device or resource busy
01-10 16:57:22.500324   987   987 W zygote64: Failed to remove /acct/uid_1013: Permission denied
01-10 16:57:22.500371   987   987 W zygote64: Failed to remove /acct/uid_1017/pid_532: Device or resource busy
01-10 16:57:22.500392   987   987 W zygote64: Failed to remove /acct/uid_1017: Permission denied
01-10 16:57:22.500440   987   987 W zygote64: Failed to remove /acct/uid_1019/pid_528: Device or resource busy
01-10 16:57:22.500461   987   987 W zygote64: Failed to remove /acct/uid_1019: Permission denied
01-10 16:57:22.500512   987   987 W zygote64: Failed to remove /acct/uid_1021/pid_520: Device or resource busy
01-10 16:57:22.500545   987   987 W zygote64: Failed to remove /acct/uid_1021/pid_557: Device or resource busy
01-10 16:57:22.500566   987   987 W zygote64: Failed to remove /acct/uid_1021: Permission denied
01-10 16:57:22.500613   987   987 W zygote64: Failed to remove /acct/uid_1027/pid_398: Device or resource busy
01-10 16:57:22.500633   987   987 W zygote64: Failed to remove /acct/uid_1027: Permission denied
01-10 16:57:22.500687   987   987 W zygote64: Failed to remove /acct/uid_1036/pid_349: Device or resource busy
01-10 16:57:22.500788   987   987 W zygote64: Failed to remove /acct/uid_1036: Permission denied
01-10 16:57:22.500837   987   987 W zygote64: Failed to remove /acct/uid_1040/pid_535: Device or resource busy
01-10 16:57:22.500859   987   987 W zygote64: Failed to remove /acct/uid_1040: Permission denied
01-10 16:57:22.500910   987   987 W zygote64: Failed to remove /acct/uid_1041/pid_380: Device or resource busy
01-10 16:57:22.500940   987   987 W zygote64: Failed to remove /acct/uid_1041/pid_382: Device or resource busy
01-10 16:57:22.500968   987   987 W zygote64: Failed to remove /acct/uid_1041/pid_524: Device or resource busy
01-10 16:57:22.500990   987   987 W zygote64: Failed to remove /acct/uid_1041: Permission denied
01-10 16:57:22.501039   987   987 W zygote64: Failed to remove /acct/uid_1046/pid_546: Device or resource busy
01-10 16:57:22.501061   987   987 W zygote64: Failed to remove /acct/uid_1046: Permission denied
01-10 16:57:22.501111   987   987 W zygote64: Failed to remove /acct/uid_1047/pid_527: Device or resource busy
01-10 16:57:22.501141   987   987 W zygote64: Failed to remove /acct/uid_1047/pid_540: Device or resource busy
01-10 16:57:22.501176   987   987 W zygote64: Failed to remove /acct/uid_1047/pid_548: Device or resource busy
01-10 16:57:22.501198   987   987 W zygote64: Failed to remove /acct/uid_1047: Permission denied
01-10 16:57:22.501254   987   987 W zygote64: Failed to remove /acct/uid_1058/pid_574: Device or resource busy
01-10 16:57:22.501277   987   987 W zygote64: Failed to remove /acct/uid_1058: Permission denied
01-10 16:57:22.501330   987   987 W zygote64: Failed to remove /acct/uid_2000/pid_425: Device or resource busy
01-10 16:57:22.501361   987   987 W zygote64: Failed to remove /acct/uid_2000/pid_789: Device or resource busy
01-10 16:57:22.501382   987   987 W zygote64: Failed to remove /acct/uid_2000: Permission denied
01-10 16:57:22.505163   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.511830   523   549 D AAL     : 01-10 04:57:22.436 BL= 946,ESS= 256, 01-10 04:57:22.455 BL= 945,ESS= 256, 01-10 04:57:22.474 BL= 944,ESS= 256, 01-10 04:57:22.494 BL= 943,ESS= 256, 01-10 04:57:22.511 BL= 942,ESS= 256, 
01-10 16:57:22.525233   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.535777   548   879 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 16:57:22.547434   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.567302   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.589901   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.600600   987   987 W System.err: java.io.FileNotFoundException: /proc/cpu_loading/onoff (No such file or directory)
01-10 16:57:22.600977   987   987 W System.err: 	at java.io.FileOutputStream.open0(Native Method)
01-10 16:57:22.601017   987   987 W System.err: 	at java.io.FileOutputStream.open(FileOutputStream.java:287)
01-10 16:57:22.601032   987   987 W System.err: 	at java.io.FileOutputStream.<init>(FileOutputStream.java:223)
01-10 16:57:22.601045   987   987 W System.err: 	at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
01-10 16:57:22.601064   987   987 W System.err: 	at com.mediatek.duraspeed.utils.FileUtilsController.writeStringToFile(FileUtilsController.java:319)
01-10 16:57:22.601079   987   987 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedInternalManager.stopObserving(DuraSpeedInternalManager.java:563)
01-10 16:57:22.601095   987   987 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedInternalManager.enableCpuObserving(DuraSpeedInternalManager.java:165)
01-10 16:57:22.601113   987   987 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedInternalManager.<init>(DuraSpeedInternalManager.java:145)
01-10 16:57:22.601127   987   987 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedService.startDuraSpeedService(DuraSpeedService.java:145)
01-10 16:57:22.601140   987   987 W System.err: 	at com.mediatek.server.am.AmsExtImpl.startDuraSpeedService(AmsExtImpl.java:495)
01-10 16:57:22.601153   987   987 W System.err: 	at com.android.server.am.ActivityManagerService.start(ActivityManagerService.java:2923)
01-10 16:57:22.601168   987   987 W System.err: 	at com.android.server.am.ActivityManagerService.-wrap11(Unknown Source:0)
01-10 16:57:22.601183   987   987 W System.err: 	at com.android.server.am.ActivityManagerService$Lifecycle.onStart(ActivityManagerService.java:2709)
01-10 16:57:22.601197   987   987 W System.err: 	at com.android.server.SystemServiceManager.startService(SystemServiceManager.java:124)
01-10 16:57:22.601212   987   987 W System.err: 	at com.android.server.SystemServiceManager.startService(SystemServiceManager.java:111)
01-10 16:57:22.601228   987   987 W System.err: 	at com.android.server.SystemServer.startBootstrapServices(SystemServer.java:566)
01-10 16:57:22.601241   987   987 W System.err: 	at com.android.server.SystemServer.run(SystemServer.java:428)
01-10 16:57:22.601253   987   987 W System.err: 	at com.android.server.SystemServer.main(SystemServer.java:299)
01-10 16:57:22.601265   987   987 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 16:57:22.601279   987   987 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 16:57:22.601299   987   987 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:837)
01-10 16:57:22.606150   523   549 D AAL     : 01-10 04:57:22.530 BL= 941,ESS= 256, 01-10 04:57:22.549 BL= 940,ESS= 256, 01-10 04:57:22.568 BL= 939,ESS= 256, 01-10 04:57:22.587 BL= 938,ESS= 256, 01-10 04:57:22.606 BL= 937,ESS= 256, 
01-10 16:57:22.607636   987   987 E libsuspend: Error opening dlservice!!
01-10 16:57:22.607976   987   987 I libsuspend: Selected wakeup count
01-10 16:57:22.608273   397   414 I vendor.mediatek.hardware.power@1.1-impl: setInteractive Restore All
01-10 16:57:22.608914   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_RESTORE_ALL
01-10 16:57:22.609012   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.626503   401   421 I SurfaceFlinger: EventThread Client Pid (987) created
01-10 16:57:22.628150   401   421 I SurfaceFlinger: EventThread Client Pid (987) created
01-10 16:57:22.632648   401   401 D SurfaceFlinger: Set power mode=2, type=0 flinger=0x740b660000
01-10 16:57:22.632989   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.650981   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.654844   390   390 D lights  : write_int open fd=7
01-10 16:57:22.655225   564   583 D PQ      : ccorr table index=0
01-10 16:57:22.655452   564   583 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 1
01-10 16:57:22.655672   390   390 D lights  : write_int open fd=7
01-10 16:57:22.662535   523   549 D AAL     : onBacklightChanged: 1023/1023 -> 409/1023(phy:1637/4095)
01-10 16:57:22.675199   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.692932   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.700424   523   549 D AAL     : 01-10 04:57:22.624 BL= 936,ESS= 256, 01-10 04:57:22.643 BL= 935,ESS= 256, 01-10 04:57:22.662 BL= 911,ESS= 256, 01-10 04:57:22.681 BL= 887,ESS= 256, 01-10 04:57:22.700 BL= 862,ESS= 256, 
01-10 16:57:22.717796   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.729310   548   884 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:22.726000   548   548 W HwBinder:548_2: type=1400 audit(0.0:38): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:22.734801   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.760593   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.771707   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=23.69 dur=1013.16 max=43.28 min=41.05
01-10 16:57:22.776645   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.794706   523   549 D AAL     : 01-10 04:57:22.719 BL= 838,ESS= 256, 01-10 04:57:22.739 BL= 814,ESS= 256, 01-10 04:57:22.756 BL= 790,ESS= 256, 01-10 04:57:22.775 BL= 766,ESS= 256, 01-10 04:57:22.794 BL= 742,ESS= 256, 
01-10 16:57:22.803012   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.818573   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.845223   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.860388   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.861930   550   550 D NVRAM   : length of g_NVRAM_BACKUP_DEVICE=44
01-10 16:57:22.862102   550   550 D NVRAM   : failed to get entry for /nvdata 
01-10 16:57:22.862118   550   550 D NVRAM   : failed to get nvdata path /nvdata 
01-10 16:57:22.862232   550   550 D NVRAM   : nvram_layout_callback will run!!!
01-10 16:57:22.862259   550   550 D NVRAM   : nvram_platform_log_block: 2
01-10 16:57:22.862273   550   550 D NVRAM   : nvram_platform_resv_block: 2
01-10 16:57:22.862286   550   550 D NVRAM   : nvram_platform_DM_block: 1
01-10 16:57:22.862299   550   550 D NVRAM   : nvram_platform_layout_version: 0
01-10 16:57:22.862312   550   550 D NVRAM   : nvram_platform_header_offset: 0
01-10 16:57:22.862327   550   550 D NVRAM   : g_i4CFG_File_Count: 51
01-10 16:57:22.862338   550   550 D NVRAM   : NVM_Init Max Lid: 78
01-10 16:57:22.862353   550   550 D NVRAM   : [NVRAM]: info nvram_gpt_flag =1
01-10 16:57:22.862377   550   550 D NVRAM   : [NVRAM]: info NVRAM Init Completed!
01-10 16:57:22.862550   550   550 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/APCFG/APRDCL/FG,LID:76
01-10 16:57:22.863139   550   550 D NVRAM   : NVM_CmpFileVerNo 76  
01-10 16:57:22.863252   550   550 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 16:57:22.863292   550   550 D NVRAM   : NVM_ProtectDataFile : 76 ++
01-10 16:57:22.863311   550   550 D NVRAM   : iCustomBeginLID = 51
01-10 16:57:22.863342   550   550 D NVRAM   : NVM_CheckFileSize:stat_size:26,size in table:24
01-10 16:57:22.863756   550   550 D NVRAM   : NVM_CheckFile: File is correct!
01-10 16:57:22.863781   550   550 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 16:57:22.863798   550   550 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 16:57:22.865894   550   550 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 16:57:22.877718   789   925 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 16:57:22.877871   789   925 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 16:57:22.877919   789   925 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 16:57:22.878512   987   987 D Cta_PermRecordsController: readState() BEGIN
01-10 16:57:22.887777   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.889130   523   549 D AAL     : 01-10 04:57:22.813 BL= 718,ESS= 256, 01-10 04:57:22.832 BL= 694,ESS= 256, 01-10 04:57:22.851 BL= 670,ESS= 256, 01-10 04:57:22.870 BL= 646,ESS= 256, 01-10 04:57:22.888 BL= 622,ESS= 256, 
01-10 16:57:22.902172   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.908334   987   987 D Cta_PermRecordsController: readState() END
01-10 16:57:22.919752   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:23.639259,dur:1057.56,max:58.59,min:35.83
01-10 16:57:22.929692   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.934783   987   987 D PackageManager: No files in app dir /custom/framework
01-10 16:57:22.943903   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:22.972051   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:22.983672   523   549 D AAL     : 01-10 04:57:22.907 BL= 599,ESS= 256, 01-10 04:57:22.927 BL= 575,ESS= 256, 01-10 04:57:22.945 BL= 551,ESS= 256, 01-10 04:57:22.964 BL= 528,ESS= 256, 01-10 04:57:22.983 BL= 504,ESS= 256, 
01-10 16:57:22.985763   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.014720   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.027947   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.056393   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.070093   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.077558   523   549 D AAL     : 01-10 04:57:23.002 BL= 481,ESS= 256, 01-10 04:57:23.020 BL= 457,ESS= 256, 01-10 04:57:23.039 BL= 434,ESS= 256, 01-10 04:57:23.058 BL= 411,ESS= 256, 01-10 04:57:23.077 BL= 387,ESS= 256, 
01-10 16:57:23.097550   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.111976   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.138174   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.154103   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.171088   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=0](13)
01-10 16:57:23.171282   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:0,0](15)
01-10 16:57:23.171351   885   885 I [epdg_wo]: [WOA] Daemon & Adpt are ready.
01-10 16:57:23.171373   885   885 I [epdg_wo]: [SKT] external server socket[wod_action]-fd:-1 init successfully
01-10 16:57:23.171393   885   885 I [epdg_wo]: [SKT] external server socket[wod_sim]-fd:-1 init successfully
01-10 16:57:23.171743   885   885 I [epdg_wo]: [SKT] external server socket[wod_ipsec]-fd:6 init successfully
01-10 16:57:23.171827   885   885 I [epdg_wo]: [DMN] WI-FI OFFLOAD DAEMON started
01-10 16:57:23.172063   885   885 I [epdg_wo]: [CFG] Reset settings[0] to default
01-10 16:57:23.172123   885   885 I [epdg_wo]: [CFG] Reset settings[1] to default
01-10 16:57:23.172538   885   885 D [epdg_wo]: [DSC] epdg discoverer state: [NOT_INIT] -> [IS_READY]
01-10 16:57:23.172597   885   885 D [epdg_wo]: [DSC] epdg discoverer state: [NOT_INIT] -> [IS_READY]
01-10 16:57:23.172748   885  1035 I [epdg_wo]: [DNS] Handle DNS Cmd Loop: dns_handler 660 
01-10 16:57:23.172765   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:1,1](15)
01-10 16:57:23.172843   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=0](13)
01-10 16:57:23.172876   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:0,1](15)
01-10 16:57:23.177617   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp=0,0,"",""](15)
01-10 16:57:23.177698   885   885 I [epdg_wo]: [CFG] Reset settings[0] to default
01-10 16:57:23.177737   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp:0,0](9)
01-10 16:57:23.177833   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset=***](15)
01-10 16:57:23.177916   885   885 I [epdg_wo]: [CFG] cfg0: epdg_fqdn=[***],ikev2if=[wlan0],select_info=[***],epdg_identifier=[***],retry_vector=[],
01-10 16:57:23.177935   885   885 I [epdg_wo]: [CFG] cfg0: ike_algo=[],
01-10 16:57:23.177954   885   885 I [epdg_wo]: [CFG] cfg0: esp_algo=[],
01-10 16:57:23.178274   885   885 I [epdg_wo]: [CFG] cfg0: ike_rekey_timer=[81000],esp_rekey_timer=[81000],rekey_margin=[32400],dpd_timer=[120],keep_timer=[20],esp_setup_time=[15],pdn_setup_time=[295],cert_used=[1],urlcert=[0],ocsp=[0],nocert=[1],skip_check_cert=[0],noid=[1],force_tsi_64=[1],force_tsi_full=[1],use_cfg_vip=[0],reauth_addr=[0],dpd_no_reply=[0],pre_post_ping=[0],log_level=[1],wdrv_keep_alive=[1],fragment=[0],mobike=[0],oos=[7],retrans_to=[2],retrans_tries=[4],retrans_base=[1],mtu=[1280],mss4_off=[68],mss6_off=[88],cust_pcscf_4=[20],cust_pcscf_6=[21],cust_imei_cp=[0],port=[10500],port_natt=[14500],cpa_nm=[0],cpa_dns4=[1],cpa_dns6=[1],no_ic=[0],no_eap=[0],ike_dscp=[0],IDi=[0],IDr=[0],leftauth=[0],eap=[0],fastreauth=[0],dns_timer=[0],dns_type=[3],dns_max_count=[254],dns_cache=[1],redirect=[0],max_redirects=[5],redirect_loop_detect=[300],detach_soft_timer=[3],detach_hard_timer=[300],
01-10 16:57:23.178380   885   885 I [epdg_wo]: [CFG] cfg0: fdpd_retrans_to=[1],fdpd_retrans_tries=[2],fdpd_retrans_base=[1],certreq_critical=[0],pcscf_restore=[0],liveness_check=[0],device_identity=[0],abort_mode=[0],ho_ip_disc=[0],emerg_epdg=[0],try_epdg_policy=[0],imei_format=[0],
01-10 16:57:23.178445   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset:0,"",-1](15)
01-10 16:57:23.178596   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp=1,0,"",""](15)
01-10 16:57:23.178672   885   885 I [epdg_wo]: [CFG] Reset settings[1] to default
01-10 16:57:23.178735   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp:1,0](9)
01-10 16:57:23.178843   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset=***](15)
01-10 16:57:23.178978   885   885 I [epdg_wo]: [CFG] cfg1: epdg_fqdn=[***],ikev2if=[wlan0],select_info=[***],epdg_identifier=[***],retry_vector=[],
01-10 16:57:23.179023   885   885 I [epdg_wo]: [CFG] cfg1: ike_algo=[],
01-10 16:57:23.179042   885   885 I [epdg_wo]: [CFG] cfg1: esp_algo=[],
01-10 16:57:23.179282   885   885 I [epdg_wo]: [CFG] cfg1: ike_rekey_timer=[81000],esp_rekey_timer=[81000],rekey_margin=[32400],dpd_timer=[120],keep_timer=[20],esp_setup_time=[15],pdn_setup_time=[295],cert_used=[1],urlcert=[0],ocsp=[0],nocert=[1],skip_check_cert=[0],noid=[1],force_tsi_64=[1],force_tsi_full=[1],use_cfg_vip=[0],reauth_addr=[0],dpd_no_reply=[0],pre_post_ping=[0],log_level=[1],wdrv_keep_alive=[1],fragment=[0],mobike=[0],oos=[7],retrans_to=[2],retrans_tries=[4],retrans_base=[1],mtu=[1280],mss4_off=[68],mss6_off=[88],cust_pcscf_4=[20],cust_pcscf_6=[21],cust_imei_cp=[0],port=[10500],port_natt=[14500],cpa_nm=[0],cpa_dns4=[1],cpa_dns6=[1],no_ic=[0],no_eap=[0],ike_dscp=[0],IDi=[0],IDr=[0],leftauth=[0],eap=[0],fastreauth=[0],dns_timer=[0],dns_type=[3],dns_max_count=[254],dns_cache=[1],redirect=[0],max_redirects=[5],redirect_loop_detect=[300],detach_soft_timer=[3],detach_hard_timer=[300],
01-10 16:57:23.179335   885   885 I [epdg_wo]: [CFG] cfg1: fdpd_retrans_to=[1],fdpd_retrans_tries=[2],fdpd_retrans_base=[1],certreq_critical=[0],pcscf_restore=[0],liveness_check=[0],device_identity=[0],abort_mode=[0],ho_ip_disc=[0],emerg_epdg=[0],try_epdg_policy=[0],imei_format=[0],
01-10 16:57:23.179368   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset:1,"",-1](15)
01-10 16:57:23.179454   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim=***](19)
01-10 16:57:23.179517   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim:0,0](9)
01-10 16:57:23.179589   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim=***](19)
01-10 16:57:23.179627   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim:1,0](9)
01-10 16:57:23.179912   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.195957   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.221107   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.226688   987   987 D PackageManager: No files in app dir /vendor/priv-app
01-10 16:57:23.237559   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.226000   987   987 W system_server: type=1400 audit(0.0:39): avc: denied { getattr } for path="/vendor/app/t6" dev="dm-1" ino=31 scontext=u:r:system_server:s0 tcontext=u:object_r:tkcore_systa_dir:s0 tclass=dir permissive=0
01-10 16:57:23.262061   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.274273   987   987 D PackageManager: No files in app dir /vendor/plugin
01-10 16:57:23.274491   987   987 D PackageManager: No files in app dir /custom/app
01-10 16:57:23.274561   987   987 D PackageManager: No files in app dir /custom/plugin
01-10 16:57:23.274597   987   987 D PackageManager: No files in app dir /oem/app
01-10 16:57:23.279392   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.283944   987   987 D PackageManager: No files in app dir /data/app-private
01-10 16:57:23.284963   523   549 D AAL     : 01-10 04:57:23.096 BL= 364,ESS= 256, 01-10 04:57:23.134 BL= 363,ESS= 256, 01-10 04:57:23.191 BL= 362,ESS= 256, 01-10 04:57:23.228 BL= 361,ESS= 256, 01-10 04:57:23.284 BL= 360,ESS= 256, 
01-10 16:57:23.302712   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.312804   531   560 I SELinux : SELinux: Loaded file_contexts
01-10 16:57:23.321197   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.344000   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.363234   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.385443   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.404976   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.426839   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.447100   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.467855   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.488803   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.509114   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.511414   523   549 D AAL     : 01-10 04:57:23.322 BL= 359,ESS= 256, 01-10 04:57:23.379 BL= 358,ESS= 256, 01-10 04:57:23.417 BL= 357,ESS= 256, 01-10 04:57:23.473 BL= 356,ESS= 256, 01-10 04:57:23.511 BL= 355,ESS= 256, 
01-10 16:57:23.531037   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.536205   548   879 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 16:57:23.550604   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.572748   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.592164   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.614746   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.633811   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.656574   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.675334   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.698571   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.714202   531   531 D installd: Found valid user 10
01-10 16:57:23.716494   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.729713   548   884 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:23.726000   548   548 W HwBinder:548_2: type=1400 audit(0.0:40): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:23.740437   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.756508   523   549 D AAL     : 01-10 04:57:23.567 BL= 354,ESS= 256, 01-10 04:57:23.605 BL= 353,ESS= 256, 01-10 04:57:23.662 BL= 352,ESS= 256, 01-10 04:57:23.699 BL= 351,ESS= 256, 01-10 04:57:23.756 BL= 350,ESS= 256, 
01-10 16:57:23.758231   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.782402   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.796990   531   531 W installd: Ignoring /data/data/com.android.webview/lib with unexpected GID 0 instead of 10070
01-10 16:57:23.799579   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.806002   987   987 E PackageManager: There should probably be a verifier, but, none were found
01-10 16:57:23.811454   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=24.04 dur=1039.80 max=43.85 min=37.76
01-10 16:57:23.811949   531   531 W installd: Ignoring /data/data/com.svox.pico/lib with unexpected GID 0 instead of 10059
01-10 16:57:23.817164   531   531 W installd: Ignoring /data/data/com.mediatek.webview/lib with unexpected GID 0 instead of 10056
01-10 16:57:23.824452   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.841475   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.850865   531   531 W installd: Ignoring /data/data/com.gears42.surefox/lib with unexpected GID 0 instead of 10030
01-10 16:57:23.866319   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.882817   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.908194   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.919098   987   987 I zygote64: Explicit concurrent copying GC freed 15206(733KB) AllocSpace objects, 9(372KB) LOS objects, 42% free, 4MB/8MB, paused 251us total 70.945ms
01-10 16:57:23.922016   987   987 D FallbackCategoryProvider: Found 1 fallback categories
01-10 16:57:23.924559   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.950079   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.952873   400   400 I lowmemorykiller: ActivityManager connected
01-10 16:57:23.956227   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:24.118624,dur:1036.54,max:57.95,min:35.93
01-10 16:57:23.962298   987  1055 D SensorService: nuSensorService starting...
01-10 16:57:23.966403   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:23.969999   547   547 D Sensors_Init:  sSensorList addr =0x754f0b9008, module addr =0x754f0b9218
01-10 16:57:23.970319   547   547 D Sensors_Init:  ARRAY_SIZE(sSensorList) =5 SENSORS_NUM=5 MAX_NUM_SENSOR=5 
01-10 16:57:23.971014   987  1055 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 16:57:23.971474   547  1056 I Accelerometer: enable: handle:0, en:0
01-10 16:57:23.972085   987  1055 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 16:57:23.972360   547   547 I Magnetic: enable: handle:1, en:0 
01-10 16:57:23.974417   987  1055 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 16:57:23.974779   547  1056 I Gyroscope: enable: handle:3, en:0
01-10 16:57:23.976342   987  1055 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 16:57:23.976685   547   547 I Light   : enable: handle:4, en:0 
01-10 16:57:23.978739   987  1055 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 16:57:23.979732   547  1056 I Proximity: enable: handle:7, en:0 
01-10 16:57:23.982699   523   549 D AAL     : 01-10 04:57:23.794 BL= 349,ESS= 256, 01-10 04:57:23.850 BL= 348,ESS= 256, 01-10 04:57:23.888 BL= 347,ESS= 256, 01-10 04:57:23.944 BL= 346,ESS= 256, 01-10 04:57:23.982 BL= 345,ESS= 256, 
01-10 16:57:23.990279   987  1058 D SensorService: nuSensorService thread starting...
01-10 16:57:23.992627   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:23.994469   987  1057 D SensorService: new thread SensorEventAckReceiver
01-10 16:57:24.008603   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.019570   531   531 W installd: Ignoring /data/user/10/com.android.webview/lib with unexpected GID 0 instead of 1010070
01-10 16:57:24.027388   987   998 D BatteryService: mPlugType = 2, mIsTemperatureWarningState = false
01-10 16:57:24.034215   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.034599   390   390 D lights  : set_led_state colorRGB=FF00FF00, onMS=0, offMS=0
01-10 16:57:24.034688   390   390 D lights  : blink_green, level=255, onMS=0, offMS=0
01-10 16:57:24.035640   390   390 D lights  : write_int open fd=7
01-10 16:57:24.048496   531   531 W installd: Ignoring /data/user/10/com.svox.pico/lib with unexpected GID 0 instead of 1010059
01-10 16:57:24.050202   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.050815   531   531 W installd: Ignoring /data/user/10/com.mediatek.webview/lib with unexpected GID 0 instead of 1010056
01-10 16:57:24.060770   531   531 W installd: Ignoring /data/user/10/com.gears42.surefox/lib with unexpected GID 0 instead of 1010030
01-10 16:57:24.071605   987   987 D DL-DeviceManager: parseRebootType: file not found, fallback to RESET
01-10 16:57:24.076460   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.078268   987  1001 I Zygote  : Process: zygote socket zygote opened, supported ABIS: arm64-v8a
01-10 16:57:24.090144   987  1001 I Zygote  : Process: zygote socket zygote_secondary opened, supported ABIS: armeabi-v7a,armeabi
01-10 16:57:24.090892   522   522 I Zygote  : Lazily preloading resources.
01-10 16:57:24.091135   522   522 D Zygote  : begin preload
01-10 16:57:24.091171   522   522 I Zygote  : Installing ICU cache reference pinning...
01-10 16:57:24.091186   522   522 I Zygote  : Preloading ICU data...
01-10 16:57:24.092607   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.110203   522   522 I Zygote  : Preloading classes...
01-10 16:57:24.118238   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.122736   522   522 I SystemServiceRegistry: regMtkService start
01-10 16:57:24.123461   522   522 I SystemServiceRegistry: setMtkSystemServiceName start
01-10 16:57:24.125995   522   522 I MtkSystemServiceRegistry: setMtkSystemServiceName start names{class android.hardware.location.ContextHubManager=contexthub, class android.app.KeyguardManager=keyguard, class android.nfc.NfcManager=nfc, class android.view.textservice.TextServicesManager=textservices, class android.hardware.usb.UsbManager=usb, class android.net.NetworkScoreManager=network_score, class android.media.projection.MediaProjectionManager=media_projection, class android.os.HardwarePropertiesManager=hardware_properties, class android.os.storage.StorageManager=storage, class android.os.Vibrator=vibrator, class android.view.textclassifier.TextClassificationManager=textclassification, class android.hardware.hdmi.HdmiControlManager=hdmi_control, class android.net.EthernetManager=ethernet, class android.hardware.radio.RadioManager=broadcastradio, class android.app.UiModeManager=uimode, class android.companion.CompanionDeviceManager=companiondevice, class android.bluetooth.BluetoothManager=bluetooth, class android.app.timezone.RulesManager=timezone, class android.os.DropBoxManager=dropbox, class android.media.session.MediaSessionManager=media_session, class android.content.ClipboardManager=clipboard, class android.hardware.display.DisplayManager=display, class android.os.RecoverySystem=recovery, class android.net.wifi.RttManager=rttmanager, class android.media.AudioManager=audio, class android.app.admin.DevicePolicyManager=device_policy, class android.app.SearchManager=search, class android.app.ActivityManager=activity, class android.app.AppOpsManager=appops, class android.content.pm.LauncherApps=launcherapps, class android.hardware.camera2.CameraManager=camera, class android.appwidget.AppWidgetManager=appwidget, class android.app.WallpaperManager=wallpaper, class android.app.job.JobScheduler=jobscheduler, class android.media.midi.MidiManager=midi, class android.app.DownloadManager=download, class android.content.pm.ShortcutManager=shortcut, class android.net.lowpan.LowpanManager=lowpan, class android.net.wifi.aware.WifiAwareManager=wifiaware, class android.app.AlarmManager=alarm, class android.os.PowerManager=power, class android.net.IpSecManager=ipsec, class android.app.usage.NetworkStatsManager=netstats, class android.os.health.SystemHealthManager=systemhealth, class android.media.MediaRouter=media_router, class android.net.ConnectivityManager=connectivity, class android.telecom.TelecomManager=telecom, class android.os.IncidentManager=incident, class android.app.StatusBarManager=statusbar, class android.hardware.SensorManager=sensor, class android.telephony.euicc.EuiccManager=euicc_service, class android.view.accessibility.CaptioningManager=captioning, class android.app.usage.UsageStatsManager=usagestats, class android.view.inputmethod.InputMethodManager=input_method, class android.hardware.ConsumerIrManager=consumer_ir, class android.service.persistentdata.PersistentDataBlockManager=persistent_data_block, class android.net.wifi.WifiManager=wifi, class android.print.PrintManager=print, class android.telephony.CarrierConfigManager=carrier_config, class android.media.tv.TvInputManager=tv_input, class android.app.trust.TrustManager=trust, class android.os.UserManager=user, class android.location.CountryDetector=country_detector, class android.text.ClipboardManager=clipboard, class android.location.LocationManager=location, class android.net.wifi.WifiScanner=wifiscanner, class android.net.wifi.p2p.WifiP2pManager=wifip2p, interface android.view.WindowManager=window, class android.view.accessibility.AccessibilityManager=accessibility, class android.net.NetworkPolicyManager=netpolicy, class android.os.BatteryManager=batterymanager, class android.view.autofill.AutofillManager=autofill, class android.app.NotificationManager=notification, class android.net.nsd.NsdManager=servicediscovery, class android.accounts.AccountManager=account, class android.hardware.SerialManager=serial, class android.app.VrManager=vrmanager, class android.telephony.SubscriptionManager=telephony_subscription_service, class android.content.RestrictionsManage
01-10 16:57:24.126228   522   522 I SystemServiceRegistry: registerAllMtkService start
01-10 16:57:24.126364   522   522 I MtkSystemServiceRegistry: registerAllService start
01-10 16:57:24.129569   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:24.134695   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.160129   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.176295   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.202111   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.202519   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:24.208091   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:24.218272   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.228048   523   549 D AAL     : 01-10 04:57:24.039 BL= 344,ESS= 256, 01-10 04:57:24.076 BL= 343,ESS= 256, 01-10 04:57:24.133 BL= 342,ESS= 256, 01-10 04:57:24.171 BL= 341,ESS= 256, 01-10 04:57:24.227 BL= 340,ESS= 256, 
01-10 16:57:24.238752   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.ir@1.0::IConsumerIr/default in either framework or device manifest.
01-10 16:57:24.244264   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.255161   987   987 D AlarmManagerService: Kernel timezone updated to -480 minutes west of GMT
01-10 16:57:24.255265   406   707 D ccci_mdinit: (1):save_timezone++
01-10 16:57:24.260451   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.271399   987   987 D AES     : AEEIOCTL_RT_MON_Kick IOCTL,cmd= 2147774474, lParam=0. 
01-10 16:57:24.286031   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.302516   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.304773   401   421 I SurfaceFlinger: [SF client] NEW(0x740b2280c0) for (987:system_server)
01-10 16:57:24.322644   401   421 I SurfaceFlinger: EventThread Client Pid (987) created
01-10 16:57:24.323609   401   421 I chatty  : uid=1000(system) Binder:401_2 identical 1 line
01-10 16:57:24.327799   401   421 I SurfaceFlinger: EventThread Client Pid (987) created
01-10 16:57:24.327830   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.328285   401   421 I SurfaceFlinger: EventThread Client Pid (987) created
01-10 16:57:24.344033   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.360441   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.vr@1.0::IVr/default in either framework or device manifest.
01-10 16:57:24.360653   987   987 W VrManagerService: init_native: Could not open IVr interface
01-10 16:57:24.363038   548   879 E /vendor/bin/hw/camerahalserver: Could not unregister service notification for android.frameworks.sensorservice@1.0::ISensorManager/default.
01-10 16:57:24.369027   987  1077 I zygote64: hidl_ssvc_poll started.
01-10 16:57:24.369762   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.371051   547   547 I Gyroscope: batch: handle:3, flag:0,samplingPeriodNs:20000000 maxBatchReportLatencyNs:0
01-10 16:57:24.371556   547   547 I Gyroscope: enable: handle:3, en:1
01-10 16:57:24.371664   987  1079 D EventHub: No input device configuration file found for device 'mtk-kpd'.
01-10 16:57:24.373468   547   547 E Gyroscope: MPE_gyr_calib_read 0.000246 -0.005214 -0.000687,0.000000 0.000000 0.000000,0.000246 -0.005214 -0.000687
01-10 16:57:24.376618   987  1079 W EventHub: Unable to disable kernel key repeat for /dev/input/event2: Function not implemented
01-10 16:57:24.376728   987  1079 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 16:57:24.376756   987  1079 I EventHub: New device: id=1, fd=117, path='/dev/input/event2', name='mtk-kpd', classes=0x1, configuration='', keyLayout='/system/usr/keylayout/mtk-kpd.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 16:57:24.377030   987  1079 D EventHub: No input device configuration file found for device 'STM VL53L0 proximity sensor'.
01-10 16:57:24.377092   987  1079 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 16:57:24.377119   987  1079 I EventHub: New device: id=2, fd=118, path='/dev/input/event3', name='STM VL53L0 proximity sensor', classes=0x800, configuration='', keyLayout='', keyCharacterMap='', builtinKeyboard=false, 
01-10 16:57:24.377411   987  1079 D EventHub: No input device configuration file found for device 'tp-kpd'.
01-10 16:57:24.382196   987  1079 W EventHub: Unable to disable kernel key repeat for /dev/input/event6: Function not implemented
01-10 16:57:24.382318   987  1079 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 16:57:24.382346   987  1079 I EventHub: New device: id=3, fd=119, path='/dev/input/event6', name='tp-kpd', classes=0x1, configuration='', keyLayout='/system/usr/keylayout/Generic.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 16:57:24.382606   987  1079 D EventHub: No input device configuration file found for device 'scan-keys'.
01-10 16:57:24.385601   987  1079 W EventHub: Unable to disable kernel key repeat for /dev/input/event1: Function not implemented
01-10 16:57:24.385726   987  1079 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 16:57:24.385751   987  1079 I EventHub: New device: id=4, fd=120, path='/dev/input/event1', name='scan-keys', classes=0x1, configuration='', keyLayout='/system/usr/keylayout/scan-keys.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 16:57:24.385744   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.386004   987  1079 D EventHub: No input device configuration file found for device 'low_g'.
01-10 16:57:24.399363   522   522 E ActivityRecognitionHardware: activity_recognition HAL is deprecated. class_init is effectively a no-op
01-10 16:57:24.412046   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.426314   522   522 W Zygote  : Class not found for preloading: android.icu.impl.number.Parse
01-10 16:57:24.428215   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.435299   987  1079 D EventHub: No input device configuration file found for device 'mtk-tpd'.
01-10 16:57:24.435689   987  1079 E filemap : mmap(0,4096) failed: No such device
01-10 16:57:24.439825   987  1079 W EventHub: Unable to disable kernel key repeat for /dev/input/event5: Function not implemented
01-10 16:57:24.440026   987  1079 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 16:57:24.440054   987  1079 I EventHub: New device: id=6, fd=122, path='/dev/input/event5', name='mtk-tpd', classes=0x15, configuration='', keyLayout='/system/usr/keylayout/Generic.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 16:57:24.440431   987  1079 D EventHub: No input device configuration file found for device 'ACCDET'.
01-10 16:57:24.441654   522   522 I zygote  : Thread[1,tid=522,Native,Thread*=0xe70da000,peer=0x12dc0088,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
01-10 16:57:24.442113   522   522 D MtpDeviceJNI: register_android_mtp_MtpDevice
01-10 16:57:24.442738   522   522 I zygote  : Thread[1,tid=522,Native,Thread*=0xe70da000,peer=0x12dc0088,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
01-10 16:57:24.443218   987  1079 W EventHub: Unable to disable kernel key repeat for /dev/input/event0: Function not implemented
01-10 16:57:24.443277   987  1079 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 16:57:24.443303   987  1079 I EventHub: New device: id=7, fd=123, path='/dev/input/event0', name='ACCDET', classes=0x81, configuration='', keyLayout='/system/usr/keylayout/ACCDET.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 16:57:24.443494   522   522 I zygote  : Thread[1,tid=522,Native,Thread*=0xe70da000,peer=0x12dc0088,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
01-10 16:57:24.447223   987  1079 I InputReader: Device added: id=-1, name='Virtual', sources=0x00000301
01-10 16:57:24.447502   987  1079 I InputReader: Device added: id=7, name='ACCDET', sources=0x80000101
01-10 16:57:24.448446   987  1079 I InputReader:   Touch device 'mtk-tpd' could not query the properties of its associated display.  The device will be inoperable until the display size becomes available.
01-10 16:57:24.448573   987  1079 I InputReader: Device added: id=6, name='mtk-tpd', sources=0x00001103
01-10 16:57:24.448681   987  1079 I InputReader: Device added: id=4, name='scan-keys', sources=0x00000101
01-10 16:57:24.448733   987  1079 I InputReader: Device added: id=3, name='tp-kpd', sources=0x00000101
01-10 16:57:24.448791   987  1079 I InputReader: Device added: id=2, name='STM VL53L0 proximity sensor', sources=0x00004002
01-10 16:57:24.453887   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.454136   523   549 D AAL     : 01-10 04:57:24.265 BL= 339,ESS= 256, 01-10 04:57:24.322 BL= 338,ESS= 256, 01-10 04:57:24.359 BL= 337,ESS= 256, 01-10 04:57:24.416 BL= 336,ESS= 256, 01-10 04:57:24.454 BL= 335,ESS= 256, 
01-10 16:57:24.454989   987  1079 I InputReader: Reconfiguring input devices.  changes=0x00000080
01-10 16:57:24.455130   987  1079 I InputReader: Device reconfigured: id=6, name='mtk-tpd', size 720x1280, orientation 0, mode 1, display id 0
01-10 16:57:24.455312   987  1079 I InputReader: Device added: id=1, name='mtk-kpd', sources=0x00000101
01-10 16:57:24.456036   987  1079 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 16:57:24.468874   522   522 D MtkSettingsProviderExt: Global moveToSecure
01-10 16:57:24.470845   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.471315   522   522 D MtkSettingsProviderExt: Secure moveToGlobal
01-10 16:57:24.473574   522   522 D MtkSettingsProviderExt: System moveToSecure
01-10 16:57:24.473979   522   522 D MtkSettingsProviderExt: System moveToGlobal
01-10 16:57:24.474903   522   522 D MtkSettingsProviderExt: putInPublicSettings
01-10 16:57:24.487434   987  1079 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 16:57:24.493506   531   560 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 16:57:24.493627   531   560 E installd: Failed to enable USRQUOTA on /dev/block/dm-2: File exists
01-10 16:57:24.493649   531   560 E installd: Failed to enable GRPQUOTA on /dev/block/dm-2: File exists
01-10 16:57:24.494405   531   560 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 16:57:24.494476   531   560 E installd: Failed to enable USRQUOTA on /dev/block/dm-2: File exists
01-10 16:57:24.494498   531   560 E installd: Failed to enable GRPQUOTA on /dev/block/dm-2: File exists
01-10 16:57:24.496313   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.505541   547   547 W hw-IPCThreadState: All binder threads in pool (2 threads) busy for 134 ms
01-10 16:57:24.505963   548   879 W libutils.threads: Thread (this=0xe74b7200): don't call join() from this Thread object's thread. It's a guaranteed deadlock!
01-10 16:57:24.506468   547   547 I Gyroscope: enable: handle:3, en:0
01-10 16:57:24.513273   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.537636   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.553624   987   987 I zygote64: Looking for service android.hardware.oemlock@1.0::IOemLock/default
01-10 16:57:24.555516   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.oemlock@1.0::IOemLock/default in either framework or device manifest.
01-10 16:57:24.555775   987   987 E zygote64: service android.hardware.oemlock@1.0::IOemLock declares transport method EMPTY but framework expects hwbinder.
01-10 16:57:24.556666   987   987 I zygote64: Looking for service android.hardware.oemlock@1.0::IOemLock/default
01-10 16:57:24.557430   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.oemlock@1.0::IOemLock/default in either framework or device manifest.
01-10 16:57:24.557609   987   987 E zygote64: service android.hardware.oemlock@1.0::IOemLock declares transport method EMPTY but framework expects hwbinder.
01-10 16:57:24.558442   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.575895   987  1080 I PackageManager: No secure containers found
01-10 16:57:24.583719   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.599715   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.619245   547   547 W hw-IPCThreadState: All binder threads in pool (2 threads) busy for 113 ms
01-10 16:57:24.625635   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.641160   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.653991   522   522 I Zygote  : ...preloaded 4715 classes in 544ms.
01-10 16:57:24.654163   522   522 I zygote  : VMRuntime.preloadDexCaches starting
01-10 16:57:24.661441   523   549 D AAL     : 01-10 04:57:24.472 BL= 336,ESS= 256, 01-10 04:57:24.510 BL= 337,ESS= 256, 01-10 04:57:24.567 BL= 338,ESS= 256, 01-10 04:57:24.604 BL= 339,ESS= 256, 01-10 04:57:24.661 BL= 340,ESS= 256, 
01-10 16:57:24.667675   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.680120   987  1080 W StorageManagerService: No primary storage defined yet; hacking together a stub
01-10 16:57:24.681889   987  1080 W StorageManagerService: No primary storage defined yet; hacking together a stub
01-10 16:57:24.683555   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.709483   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.724919   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.730289   548   884 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:24.726000   548   548 W HwBinder:548_2: type=1400 audit(0.0:41): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:24.741736   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:24.743084   987   987 D MtkFakeNtpTrustedTime: creating MtkFakeNtpTrustedTime using null
01-10 16:57:24.745505   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:24.751358   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.766555   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.766698   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:24.768207   987   987 D MtkFakeNtpTrustedTime: creating MtkFakeNtpTrustedTime using null
01-10 16:57:24.774183   522   522 I zygote  : VMRuntime.preloadDexCaches strings total=360436 before=13118 after=13118
01-10 16:57:24.774273   522   522 I zygote  : VMRuntime.preloadDexCaches types total=30514 before=6502 after=6516
01-10 16:57:24.774301   522   522 I zygote  : VMRuntime.preloadDexCaches fields total=142505 before=5834 after=5892
01-10 16:57:24.774331   522   522 I zygote  : VMRuntime.preloadDexCaches methods total=267782 before=12265 after=12328
01-10 16:57:24.774359   522   522 I zygote  : VMRuntime.preloadDexCaches finished
01-10 16:57:24.793131   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.808651   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.817087   987   987 D WifiApConfigStore: 2G band allowed channels are:0
01-10 16:57:24.820187   401   420 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=23.79 dur=1008.67 max=55.83 min=29.56
01-10 16:57:24.835075   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.850446   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.870848   522   522 I Zygote  : Preloading resources...
01-10 16:57:24.876864   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.888157   523   549 D AAL     : 01-10 04:57:24.699 BL= 341,ESS= 256, 01-10 04:57:24.755 BL= 342,ESS= 256, 01-10 04:57:24.793 BL= 343,ESS= 256, 01-10 04:57:24.850 BL= 344,ESS= 256, 01-10 04:57:24.887 BL= 345,ESS= 256, 
01-10 16:57:24.889749   789   925 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 16:57:24.890146   789   925 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 16:57:24.890301   789   925 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 16:57:24.892570   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.894068   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:24.895893   522   522 W Resources: Preloaded drawable resource #0x1080264 (android:drawable/dialog_background_material) that varies with configuration!!
01-10 16:57:24.898634   987   987 D MtkIpRunningState: Initialize MtkIpRunningState
01-10 16:57:24.901306   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:24.903028   987   987 D MtkIpStoppedState: Initialize MtkIpStoppedState
01-10 16:57:24.903606   987  1091 D MtkIpStoppedState: enter
01-10 16:57:24.906219   987   987 D WifiStateMachine: Initialize MtkL2ConnectedState
01-10 16:57:24.908828   987  1090 E HalDeviceManager: isSupported: called but mServiceManager is null!?
01-10 16:57:24.909171   987  1090 I WifiNative-wlan0: Vendor HAL not supported, Ignore stop...
01-10 16:57:24.909442   987  1090 D WificondControl: tearing down interfaces in wificond
01-10 16:57:24.909768   987  1091 E IpManager.wlan0: ERROR Failed to disable IPv6: java.lang.IllegalStateException: command '1 interface ipv6 wlan0 disable' failed with '400 1 Failed to change IPv6 state (No such file or directory)'
01-10 16:57:24.912554   541   647 D CommandListener: Clearing all IP addresses on wlan0
01-10 16:57:24.918003   987   987 D WifiController: isAirplaneModeOn = false, isWifiEnabled = false, isScanningAvailable = false
01-10 16:57:24.918883   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.924974   987   987 I WifiService: getVerboseLoggingLevel uid=1000
01-10 16:57:24.925595   987   987 E SupplicantStaIfaceHal: Can't call setDebugParams, ISupplicant is null
01-10 16:57:24.925901   987   987 W WifiDiags: Failed to start packet fate monitoring
01-10 16:57:24.927023   987   987 I WifiService: Registering wifi
01-10 16:57:24.931969   987   987 I WifiScanningService: Creating wifiscanner
01-10 16:57:24.934465   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.936340   987   987 I WifiScanningService: Publishing wifiscanner
01-10 16:57:24.940736   987   987 I RttService: Creating rttmanager
01-10 16:57:24.943916   987   987 I RttService: Starting rttmanager
01-10 16:57:24.947765   522   522 I Zygote  : ...preloaded 64 resources in 76ms.
01-10 16:57:24.954605   522   522 W Resources: Preloaded color resource #0x1060053 (android:color/btn_default_material_dark) that varies with configuration!!
01-10 16:57:24.956060   522   522 I Zygote  : ...preloaded 41 resources in 7ms.
01-10 16:57:24.958065   987   987 I WifiP2pService: Registering wifip2p
01-10 16:57:24.960662   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:24.962554   987   987 I EthernetServiceImpl: Creating EthernetConfigStore
01-10 16:57:24.965376   987   987 E IpConfigStore: Error opening configuration file: java.io.FileNotFoundException: /data/misc/ethernet/ipconfig.txt (No such file or directory)
01-10 16:57:24.965618   987   987 W EthernetConfigStore: No Ethernet configuration found. Using default.
01-10 16:57:24.965743   987   987 I EthernetServiceImpl: Read stored IP configuration: IP assignment: DHCP
01-10 16:57:24.965743   987   987 I EthernetServiceImpl: Proxy settings: NONE
01-10 16:57:24.972063   987   987 I EthernetService: Registering service ethernet
01-10 16:57:24.976050   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:24.977739   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:24.993835   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:26.989309,dur:1037.45,max:58.81,min:18.79
01-10 16:57:25.002397   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.017818   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.043146   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:25.044206   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.047829   987   987 D MtkIPv6TetheringCoordinator: MtkIPv6TetheringCoordinator
01-10 16:57:25.048102   987   987 D Tethering: MtkIPv6TetheringCoordinator is loaded
01-10 16:57:25.053279   987   987 D Tethering: getMtkTethering is loaded
01-10 16:57:25.059701   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.086057   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.101621   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.117520   522   522 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 16:57:25.127954   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.132987   523   549 D AAL     : 01-10 04:57:24.944 BL= 346,ESS= 256, 01-10 04:57:24.982 BL= 347,ESS= 256, 01-10 04:57:25.038 BL= 348,ESS= 256, 01-10 04:57:25.076 BL= 349,ESS= 256, 01-10 04:57:25.132 BL= 350,ESS= 256, 
01-10 16:57:25.143496   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.169834   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.176290   987   987 W TelecomManager: Telecom Service not found.
01-10 16:57:25.177492   524   524 D PermissionCache: checking android.permission.MODIFY_AUDIO_SETTINGS for uid=1000 => granted (972 us)
01-10 16:57:25.177598   524   524 D APM_AudioPolicyManager: setForceUse() usage 4, config 0, mPhoneState 0
01-10 16:57:25.177863   524   710 D APM_AudioPolicyManager: setForceUse() usage 3, config 8, mPhoneState 0
01-10 16:57:25.178572   524   710 D APM_AudioPolicyManager: setForceUse() usage 6, config 0, mPhoneState 0
01-10 16:57:25.179412   524   834 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 16:57:25.179464   524   854 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 16:57:25.181844   380   699 D AudioALSAStreamManager: setMicMute(), mMicMute: 0 => 0
01-10 16:57:25.184113   380   699 D AudioALSAStreamManager: +SetInputMute(), 0
01-10 16:57:25.184559   380   699 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 16:57:25.184763   380   793 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 16:57:25.185266   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.201272   987   987 D AudioService: applyDeviceVolumemStreamType:3,device:2
01-10 16:57:25.201943   987   987 D AudioService: applyDeviceVolumemStreamType:3,device:1073741824
01-10 16:57:25.202161   987   987 D AudioService: applyDeviceVolumemStreamType:9,device:2
01-10 16:57:25.202311   987   987 D AudioService: applyDeviceVolumemStreamType:9,device:1073741824
01-10 16:57:25.202406   987   987 D AudioService: applyDeviceVolumemStreamType:10,device:2
01-10 16:57:25.202503   987   987 D AudioService: applyDeviceVolumemStreamType:10,device:1073741824
01-10 16:57:25.211909   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.227617   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.245958   987   987 I zygote64: Looking for service android.hidl.manager@1.0::IServiceManager/default
01-10 16:57:25.248700   987   987 I zygote64: Starting thread pool.
01-10 16:57:25.251650   987   987 I zygote64: Looking for service android.hardware.usb@1.0::IUsb/default
01-10 16:57:25.252302   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.usb@1.0::IUsb/default in either framework or device manifest.
01-10 16:57:25.252628   987   987 E zygote64: service android.hardware.usb@1.0::IUsb declares transport method EMPTY but framework expects hwbinder.
01-10 16:57:25.253680   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.264303   987   987 D HardwarePropertiesManagerService-JNI: Link to death notification successful
01-10 16:57:25.269385   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.278558   522   522 D libEGL  : loaded /vendor/lib/egl/libGLES_mali.so
01-10 16:57:25.295563   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.310999   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.314645   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.contexthub@1.0::IContexthub/default in either framework or device manifest.
01-10 16:57:25.314892   987  1054 E ContextHubService: Could not load context hub hal
01-10 16:57:25.315045   987  1054 W ContextHubService: No Context Hub Module present
01-10 16:57:25.317438   987   987 D NtpTrustedTime: getServer:[time.android.com]
01-10 16:57:25.337266   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.352719   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.359174   523   549 D AAL     : 01-10 04:57:25.170 BL= 351,ESS= 256, 01-10 04:57:25.227 BL= 352,ESS= 256, 01-10 04:57:25.264 BL= 353,ESS= 256, 01-10 04:57:25.321 BL= 354,ESS= 256, 01-10 04:57:25.359 BL= 355,ESS= 256, 
01-10 16:57:25.361718   987   987 W BackgroundDexOptService: SysProp pm.dexopt.downgrade_after_inactive_days not set
01-10 16:57:25.366181   522   522 I Zygote  : Preloading shared libraries...
01-10 16:57:25.377143   987   987 V MediaRouter: Adding route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 16:57:25.379234   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.381477   987   987 V MediaRouter: Selecting route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 16:57:25.394882   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.395302   522   522 I Zygote  : Uninstalled ICU cache reference pinning...
01-10 16:57:25.397795   522   522 I Zygote  : Installed AndroidKeyStoreProvider in 2ms.
01-10 16:57:25.411900   522   522 I Zygote  : Warmed up JCA providers in 14ms.
01-10 16:57:25.412010   522   522 D Zygote  : end preload
01-10 16:57:25.416612   987   987 I WindowManager: SAFE MODE not enabled
01-10 16:57:25.421157   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.433875   987   987 D OmadmService: OmadmService() ... constructor
01-10 16:57:25.434872   987   987 I debug   : [getDefaultDmManager]The binder is null
01-10 16:57:25.435124   987   987 D @M_OmadmService: IOmadm.getService
01-10 16:57:25.435636   987   987 I zygote64: Looking for service vendor.mediatek.hardware.omadm@1.0::IOmadm/omadm
01-10 16:57:25.436584   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.437790   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry vendor.mediatek.hardware.omadm@1.0::IOmadm/omadm in either framework or device manifest.
01-10 16:57:25.438191   987   987 E zygote64: service vendor.mediatek.hardware.omadm@1.0::IOmadm declares transport method EMPTY but framework expects hwbinder.
01-10 16:57:25.438842   987   987 D @M_OmadmService: mOmadmProxy getService/setResponseFunctions: java.util.NoSuchElementException
01-10 16:57:25.448250   987   987 I zygote64: Looking for service vendor.mediatek.hardware.power@1.1::IPower/default
01-10 16:57:25.452522   987   987 I zygote64: Starting thread pool.
01-10 16:57:25.463351   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.478720   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.483387   987   987 I zygote64: Looking for service android.hardware.weaver@1.0::IWeaver/default
01-10 16:57:25.485360   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.weaver@1.0::IWeaver/default in either framework or device manifest.
01-10 16:57:25.485770   987   987 E zygote64: service android.hardware.weaver@1.0::IWeaver declares transport method EMPTY but framework expects hwbinder.
01-10 16:57:25.505049   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.520539   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.524002   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:25.525864   987   987 D MtkIpConnectivityMetrics: MtkIpConnectivityMetrics is created:true
01-10 16:57:25.536047   987   987 D WifiAsyncChannel.WifiService: sendMessageSynchronously.send message=131207
01-10 16:57:25.537964   987  1090 D WifiStateMachine:  InitialState !CMD_INITIALIZE uid=1000 rt=17055/17055 0 0
01-10 16:57:25.538151   987  1090 D WifiStateMachine:  DefaultState !CMD_INITIALIZE uid=1000 rt=17055/17055 0 0
01-10 16:57:25.538281   987  1090 D HalDeviceManager: initIServiceManagerIfNecessary
01-10 16:57:25.538418   987  1090 I zygote64: Looking for service android.hidl.manager@1.0::IServiceManager/default
01-10 16:57:25.540985   987  1090 I zygote64: Starting thread pool.
01-10 16:57:25.544134   987  1090 D HalDeviceManager: isSupportedInternal
01-10 16:57:25.544221   987  1074 D HalDeviceManager: IWifi registration notification: fqName=android.hardware.wifi@1.0::IWifi, name=default, preexisting=true
01-10 16:57:25.545522   987  1074 D HalDeviceManager: initIWifiIfNecessary
01-10 16:57:25.545522   987  1090 D HalDeviceManager: initIWifiIfNecessary
01-10 16:57:25.546228   987  1074 I zygote64: Looking for service android.hardware.wifi@1.0::IWifi/default
01-10 16:57:25.547001   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.548354   987  1074 I zygote64: Starting thread pool.
01-10 16:57:25.552104   987  1074 D HalDeviceManager: stopWifi
01-10 16:57:25.552988   987  1074 D HalDeviceManager: dispatchAllDestroyedListeners
01-10 16:57:25.554832   987   987 D WifiAsyncChannel.WifiService: sendMessageSynchronously.recv message=131207 sendingUid=1000
01-10 16:57:25.555828   987   987 D MtkOpExtManager: initialize: android.app.ContextImpl@3c6c415
01-10 16:57:25.556794   987   987 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:25.556917   987   987 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:25.557082   987   987 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:25.557082   987   987 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:Op01WifiService.apk:com.mediatek.op.wifi.Op01WifiOperatorFactory:com.mediatek.server.wifi.op01)
01-10 16:57:25.557082   987   987 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP09_null_null:Op09WifiService.apk:com.mediatek.op.wifi.Op09WifiOperatorFactory:com.mediatek.server.wifi.op09)
01-10 16:57:25.559950   987   987 D MtkOpExtManager: initialize done
01-10 16:57:25.560157   987   987 I WifiScanningService: Starting wifiscanner
01-10 16:57:25.560358   987  1089 D WifiController: Enter ApStaDisabledState mScreenOff=false
01-10 16:57:25.560714   987  1090 D WifiStateMachine:  InitialState !CMD_STOP_SUPPLICANT rt=17077/17077 0 0
01-10 16:57:25.560879   987  1090 D WifiStateMachine:  DefaultState !CMD_STOP_SUPPLICANT rt=17077/17077 0 0
01-10 16:57:25.562380   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.563600   987   987 I RttService: Registering rttmanager
01-10 16:57:25.566174   987   987 I EthernetServiceImpl: Starting Ethernet service
01-10 16:57:25.569851   987   987 D Ethernet: Registering NetworkFactory
01-10 16:57:25.581013   524   710 D PermissionCache: checking android.permission.CAPTURE_AUDIO_HOTWORD for uid=1000 => granted (270 us)
01-10 16:57:25.583100   987   987 D ContextHubSystemService: onBootPhase: PHASE_SYSTEM_SERVICES_READY
01-10 16:57:25.587680   987  1114 D Ethernet: got request NetworkRequest [ TRACK_DEFAULT id=3, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:25.588009   987  1114 D Ethernet: got request NetworkRequest [ REQUEST id=1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:25.588950   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.592536   987   987 I zygote64: Looking for service android.hardware.configstore@1.0::ISurfaceFlingerConfigs/default
01-10 16:57:25.596791   987   987 I zygote64: Starting thread pool.
01-10 16:57:25.597679   987  1115 I WifiService: getWifiApEnabledState uid=1000
01-10 16:57:25.598083   987  1115 I WifiService: getWifiApEnabledState uid=1000
01-10 16:57:25.604400   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.620531   401   420 I SurfaceFlinger: EventThread Client Pid (987) created
01-10 16:57:25.621803   401   420 I SurfaceFlinger: EventThread Client Pid (987) created
01-10 16:57:25.623416   523   549 D AAL     : 01-10 04:57:25.415 BL= 356,ESS= 256, 01-10 04:57:25.472 BL= 357,ESS= 256, 01-10 04:57:25.528 BL= 358,ESS= 256, 01-10 04:57:25.566 BL= 359,ESS= 256, 01-10 04:57:25.623 BL= 360,ESS= 256, 
01-10 16:57:25.628439   987  1019 W DefaultPermGrantPolicy: Unknown package:com.google.android.apps.assistant
01-10 16:57:25.630777   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.645983   987  1010 D WifiP2pService: getMessenger: uid=1000, binder=android.os.Binder@2ee642a, messenger=android.os.Messenger@481a21b
01-10 16:57:25.646485   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.646572   987  1010 D HalDeviceManager: createIface: ifaceType=2
01-10 16:57:25.646871   987  1010 D HalDeviceManager: getAllChipInfo
01-10 16:57:25.648944   987  1010 D HalDeviceManager: getChipIds=[]
01-10 16:57:25.649147   987  1010 E HalDeviceManager: Should have at least 1 chip!
01-10 16:57:25.649270   987  1010 E HalDeviceManager: createIface: no chip info found
01-10 16:57:25.649306   987  1010 D HalDeviceManager: stopWifi
01-10 16:57:25.650281   987  1010 D HalDeviceManager: dispatchAllDestroyedListeners
01-10 16:57:25.650439   987  1090 D ManagerStatusListenerProxy: ListenerProxy.handleMessage: what=0
01-10 16:57:25.650692   987  1090 D HalDeviceManager: isWifiStart
01-10 16:57:25.651594   987  1090 I WifiVendorHal: Device Manager onStatusChanged. isReady(): true, isStarted(): false
01-10 16:57:25.672575   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.687942   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.714574   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.727506   987  1098 I MtkTethering: Intent:Intent { act=android.intent.action.LOCALE_CHANGED flg=0x51200010 }
01-10 16:57:25.729982   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.726000   548   548 W HwBinder:548_2: type=1400 audit(0.0:42): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:25.731044   548   884 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:25.736229   987  1098 D Tethering: sendTetherStateChangedBroadcast avail=[] local_only=[] tether=[] error=[]
01-10 16:57:25.736344   987   987 D BatteryService: mPlugType = 2, mIsTemperatureWarningState = false
01-10 16:57:25.737035   987  1098 I MtkTethering: Intent:Intent { act=android.net.conn.TETHER_STATE_CHANGED flg=0x24000010 (has extras) }
01-10 16:57:25.737737   987  1098 I MtkTethering: showTetheredNotification:false:0
01-10 16:57:25.737852   987  1098 I MtkTethering: Ignore
01-10 16:57:25.741422   987  1096 D WifiHandler.WifiP2pService: Received message=139323d sendingUid=1000
01-10 16:57:25.743151   987  1096 D WifiAsyncChannel.WifiP2pService: replyToMessage recvdMessage=139323 sendingUid=1000 sentMessage=139324
01-10 16:57:25.757419   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.773244   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.776264   987  1010 W AlarmManager: Unrecognized alarm listener com.mediatek.server.display.MtkWifiDisplayController$1@ad41185
01-10 16:57:25.798277   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.813828   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.825833   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=23.86 dur=1005.66 max=44.77 min=38.77
01-10 16:57:25.840436   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.849637   523   549 D AAL     : 01-10 04:57:25.660 BL= 361,ESS= 256, 01-10 04:57:25.717 BL= 362,ESS= 256, 01-10 04:57:25.755 BL= 363,ESS= 256, 01-10 04:57:25.811 BL= 364,ESS= 256, 01-10 04:57:25.849 BL= 365,ESS= 256, 
01-10 16:57:25.852506   987   987 E PowerHalManagerImpl: <checkWetherSupport> sHasChecked: false
01-10 16:57:25.852960   987   987 I PowerHalManagerImpl: <checkWetherSupport> clazz: class com.mediatek.powerhalwrapper.PowerHalWrapper
01-10 16:57:25.853308   987   987 I PowerHalManagerImpl: <checkWetherSupport> methodSetRotationBoost: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setRotationBoost(int)
01-10 16:57:25.853389   987   987 I PowerHalManagerImpl: <checkWetherSupport> methodSetFpsGo: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setFpsGo(boolean)
01-10 16:57:25.853442   987   987 I PowerHalManagerImpl: <checkWetherSupport> methodSetInstallationBoost: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setInstallationBoost(boolean)
01-10 16:57:25.853508   987   987 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostResume: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostResume(java.lang.String,java.lang.String)
01-10 16:57:25.853556   987   987 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostNotify: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostNotify(int,java.lang.String,java.lang.String)
01-10 16:57:25.853614   987   987 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostProcessCreate: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostProcessCreate(java.lang.String,java.lang.String)
01-10 16:57:25.853683   987   987 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostStop: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostStop()
01-10 16:57:25.853754   987   987 I PowerHalManagerImpl: <checkWetherSupport> methodSetSpeedDownload: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setSpeedDownload(int)
01-10 16:57:25.853799   987   987 D PowerHalManagerImpl: <checkWetherSupport> sIsMtkPowerHalExist: true
01-10 16:57:25.853984   987   987 E PowerHalWrapper: PowerHalWrapper
01-10 16:57:25.854091   987   987 I zygote64: Looking for service vendor.mediatek.hardware.power@1.1::IPower/default
01-10 16:57:25.855975   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.856266   987   987 I zygote64: Starting thread pool.
01-10 16:57:25.858224   987   987 E PowerHalWrapper: DeathRecipient
01-10 16:57:25.858522   789   928 I EMDLOGGER1: MDL rate:152 KB/s, full count:0
01-10 16:57:25.859823   987   987 E PowerHalWrapper: pextpeak_period: 0
01-10 16:57:25.882249   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.891088   987   987 E BitmapFactory: Unable to decode stream: java.io.FileNotFoundException: /data/system/users/0/wallpaper_orig (No such file or directory)
01-10 16:57:25.897862   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.924500   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.925982   987  1108 D AudioSystem: +setParameters(): A2dpSuspended=false 
01-10 16:57:25.927105   380   699 D AudioALSAHardware: +setParameters(): A2dpSuspended=false
01-10 16:57:25.927526   380   699 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "A2dpSuspended=false"
01-10 16:57:25.927589   380   699 D AudioALSAHardware: -setParameters(): A2dpSuspended=false 
01-10 16:57:25.928972   987  1108 D AudioService: setBluetoothScoOnInt : false, eventSource = resetBluetoothSco
01-10 16:57:25.929143   987  1108 D AudioSystem: +setParameters(): BT_SCO=off 
01-10 16:57:25.930075   380   699 D AudioALSAHardware: +setParameters(): BT_SCO=off
01-10 16:57:25.930256   380   699 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "BT_SCO=off"
01-10 16:57:25.930272   380   699 D AudioALSAHardware: -setParameters(): BT_SCO=off 
01-10 16:57:25.939944   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.940106   987  1008 W TelecomManager: Telecom Service not found.
01-10 16:57:25.951470   987  1055 D WebViewLibraryLoader: Setting new address space to 125701040
01-10 16:57:25.951570   524   710 I AudioFlinger: systemReady
01-10 16:57:25.966123   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:25.972392   987  1143 V NuMediaExtractor: setDataSource fd=129 (/system/media/audio/ui/Effect_Tick.ogg), offset=0, length=5136
01-10 16:57:25.974562   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:25.974569  1137  1137 W /system/bin/sdcard: Device explicitly enabled sdcardfs
01-10 16:57:25.975105   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:25.981802   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:25.982082   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:25.982382   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:25.988726   987   987 W NetworkManagement: setDataSaverMode(): already false
01-10 16:57:25.990364   535   668 V APEExtractor: getAPEInfo not ape 20484
01-10 16:57:25.990570   535   668 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:25.991912   987  1006 I WifiService: requestActivityInfo uid=1000
01-10 16:57:25.992023   987  1006 I WifiService: reportActivityInfo uid=1000
01-10 16:57:25.992064   987  1006 I WifiService: getSupportedFeatures uid=1000
01-10 16:57:25.992098   987  1006 D WifiAsyncChannel.WifiService: sendMessageSynchronously.send message=131133
01-10 16:57:25.992341   987  1090 D WifiStateMachine:  InitialState !CMD_GET_SUPPORTED_FEATURES uid=1000 rt=17509/17509 0 0
01-10 16:57:25.992396   987  1090 D WifiStateMachine:  DefaultState !CMD_GET_SUPPORTED_FEATURES uid=1000 rt=17509/17509 0 0
01-10 16:57:25.992415   987  1090 D HalDeviceManager: isWifiStart
01-10 16:57:25.993120   987  1006 D WifiAsyncChannel.WifiService: sendMessageSynchronously.recv message=131133 sendingUid=1000
01-10 16:57:25.994343   987  1143 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 16:57:26.003993   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:22.766674,dur:1010.25,max:88.94,min:7.47
01-10 16:57:26.008040   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.011194   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.012311   546   657 I OMXMaster: makeComponentInstance(OMX.google.aac.decoder) in omx@1.0-service process
01-10 16:57:26.020463  1119  1119 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:26.023723   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.024454   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.025136   546  1159 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.ADPCM.MS) in omx@1.0-service process
01-10 16:57:26.034038   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.034587   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.ADPCM.DVI) in omx@1.0-service process
01-10 16:57:26.041213   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.041773   546  1159 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.ALAC) in omx@1.0-service process
01-10 16:57:26.045090   546  1159 D MtkOmxAlacDec: MtkOmxAlacDec::MtkOmxAlacDec this= 0xe8e08000
01-10 16:57:26.045234   546  1159 D MtkOmxAlacDec: MtkOmxComponentCreate mCompHandle(0xe8e08000)
01-10 16:57:26.045254   546  1159 D MtkOmxAlacDec: MtkOmxAlacDec::InitAudioParams(ALAC)
01-10 16:57:26.047051   546  1159 D MtkOmxAlacDec: +MtkOmxAlacDec::~MtkOmxAlacDec this= 0xe8e08000
01-10 16:57:26.047131   546  1159 D MtkOmxAlacDec: -MtkOmxAlacDec::~MtkOmxAlacDec this= 0xe8e08000
01-10 16:57:26.049261   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.049732   546   656 I OMXMaster: makeComponentInstance(OMX.google.amrnb.decoder) in omx@1.0-service process
01-10 16:57:26.049754   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.058858   987  1008 W TelecomManager: Telecom Service not found.
01-10 16:57:26.064026   987  1086 W NetworkManagement: setDataSaverMode(): already false
01-10 16:57:26.064708   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.065198   546   656 I OMXMaster: makeComponentInstance(OMX.google.amrwb.decoder) in omx@1.0-service process
01-10 16:57:26.065513   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.074838   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.075400   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.APE) in omx@1.0-service process
01-10 16:57:26.084945   546   656 D MtkOmxApeDec: APE component create
01-10 16:57:26.085226   546   656 D MtkOmxApeDec: new BpMtkCodec
01-10 16:57:26.085243   546   656 D BpMtkCodecService: BpMtkCodecService ctor
01-10 16:57:26.090125   546   656 D BpMtkCodecService: BpMtkCodecService get getService Done
01-10 16:57:26.090202   546   656 D BpMtkCodecService: mtk.codecservice success
01-10 16:57:26.090220   546   656 D BpMtkCodecService: BpMtkCodecService::create
01-10 16:57:26.090466   396   396 E MtkCodecService: mtkcodecservice create
01-10 16:57:26.092727   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.095455   546   656 D MtkOmxApeDec: create:0
01-10 16:57:26.096243   546   656 D MtkOmxApeDec: InitAudioParams:out_size:5184
01-10 16:57:26.096218   987   987 D PermissionMonitor: Monitoring
01-10 16:57:26.098142  1170  1170 V WebViewLibraryLoader: RelroFileCreator (64bit = false),  32-bit lib: /system/app/webview/webview.apk!/lib/armeabi-v7a/libwebviewchromium.so, 64-bit lib: /system/app/webview/webview.apk!/lib/arm64-v8a/libwebviewchromium.so
01-10 16:57:26.099274   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(12288) returning hidl_memory(0x75dd42b5f0, 12288)
01-10 16:57:26.106523  1119  1119 I LatinIME: Hardware accelerated drawing: true
01-10 16:57:26.108461   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.109639   987   987 D PermissionMonitor: Users: 2, Apps: 80
01-10 16:57:26.111672   546   656 D MtkOmxApeDec: [MtkOmxApeDec] Get HIDL input memory success.
01-10 16:57:26.113045  1187  1187 V WebViewLibraryLoader: RelroFileCreator (64bit = true),  32-bit lib: /system/app/webview/webview.apk!/lib/armeabi-v7a/libwebviewchromium.so, 64-bit lib: /system/app/webview/webview.apk!/lib/arm64-v8a/libwebviewchromium.so
01-10 16:57:26.114169   546   656 D MtkOmxApeDec: ~dtor+ this= 0xe93d7000
01-10 16:57:26.114247   546   656 D MtkOmxApeDec: close handle
01-10 16:57:26.114261   546   656 D MtkOmxApeDec: call MtkCodec destroy+
01-10 16:57:26.114281   546   656 D BpMtkCodecService: BpMtkCodecService::Destroy
01-10 16:57:26.114317   523   549 D AAL     : 01-10 04:57:25.906 BL= 366,ESS= 256, 01-10 04:57:25.943 BL= 367,ESS= 256, 01-10 04:57:26.020 BL= 368,ESS= 256, 01-10 04:57:26.076 BL= 369,ESS= 256, 01-10 04:57:26.114 BL= 370,ESS= 256, 
01-10 16:57:26.114609   396   396 E MtkCodecService: mtkcodecservice Destory
01-10 16:57:26.115091   546   656 D MtkOmxApeDec: call MtkCodec destroy-
01-10 16:57:26.115356   546   656 D BpMtkCodecService: ~BpMtkCodecService
01-10 16:57:26.118382   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.118797   546   656 I OMXMaster: makeComponentInstance(OMX.google.flac.decoder) in omx@1.0-service process
01-10 16:57:26.130641  1131  1131 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:26.133939   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.134356   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.G711.ALAW) in omx@1.0-service process
01-10 16:57:26.134589   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.150004   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.156313   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.157152   546  1159 I OMXMaster: makeComponentInstance(OMX.google.g711.alaw.decoder) in omx@1.0-service process
01-10 16:57:26.159949   987  1212 D AES     : AEEIOCTL_RT_MON_Kick IOCTL,cmd= 2147774474, lParam=300. 
01-10 16:57:26.162185   390   390 D lights  : set_led_state colorRGB=FF00FF00, onMS=0, offMS=0
01-10 16:57:26.162340   390   390 D lights  : blink_green, level=0, onMS=0, offMS=0
01-10 16:57:26.162835   390   390 D lights  : write_int open fd=7
01-10 16:57:26.163183   390   390 D lights  : blink_green, level=255, onMS=0, offMS=0
01-10 16:57:26.163832   390   390 D lights  : write_int open fd=7
01-10 16:57:26.176777   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.192681   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.193472   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.193974   546  1159 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.G711.MLAW) in omx@1.0-service process
01-10 16:57:26.201514   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.201814   546   656 I OMXMaster: makeComponentInstance(OMX.google.g711.mlaw.decoder) in omx@1.0-service process
01-10 16:57:26.207334   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.207764   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.GSM) in omx@1.0-service process
01-10 16:57:26.209817   987   987 D GnssLocationProvider: Link to death notification successful
01-10 16:57:26.209984   563   563 W MtkGnssHAL_GnssInterface: getExtensionXtra GnssXtra interface not implemented by HAL
01-10 16:57:26.210678   563   563 W MtkGnssHAL_GnssInterface: getExtensionGnssDebug: GnssDebug interface is not implemented by HAL
01-10 16:57:26.210851   563   563 W MtkGnssHAL_GnssInterface: getExtensionGnssConfiguration GnssConfiguration interface not implemented by GNSS HAL
01-10 16:57:26.211398   563   563 D vndksupport: Loading /vendor/lib64/hw/flp.mt6763.so from current namespace instead of sphal namespace.
01-10 16:57:26.218646   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.233212   563   563 D         : mtk_flp_get_flp_interface
01-10 16:57:26.235795   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.239025   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.239643   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.MP3) in omx@1.0-service process
01-10 16:57:26.243787  1170  1170 I zygote  : System.exit called, status: 0
01-10 16:57:26.244012  1170  1170 I AndroidRuntime: VM exiting with result code 0, cleanup skipped.
01-10 16:57:26.246647   987   987 I GnssLocationProvider: WakeLock acquired by sendMessage(INITIALIZE_HANDLER, 0, null)
01-10 16:57:26.248092   563   563 D hal2mnl : hal2mnl_set_server: hal2mnl_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 16:57:26.248772   520   693 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 16:57:26.248951   520   693 D MNLD    : hal_set_server: hal_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 16:57:26.249530   987   987 D MtkLocationExt: MtkLocationExt GnssLocationProvider()
01-10 16:57:26.250018   557   585 D agps    : [agps][n][AGPS] [MNL] read  set_server  type=1 hostname=[supl.google.com] port=7275 aosp_profile_enable=0
01-10 16:57:26.251162   987   987 D MtkLocationExt: add GPS time sync handler and looper
01-10 16:57:26.252263   987   987 D GnssLocationProvider: mMtkGnssProvider = com.mediatek.location.MtkLocationExt$GnssLocationProvider@4af425d
01-10 16:57:26.252842   563   563 D         : gpshal_gpscbs_save: Use GpsCallbacks
01-10 16:57:26.253032   987   987 D GnssLocationProvider: gnssSetCapabilitesCb: 65536u
01-10 16:57:26.253407   987   987 D GnssLocationProvider: gnssSetSystemInfoCb: yearOfHw=2015
01-10 16:57:26.253914   563   563 D         : socket_bind_udp: fd=8
01-10 16:57:26.253977   563   563 D         : socket_bind_udp: path=mtk_mnl2hal
01-10 16:57:26.254239   563   563 D hal2mnl : hal2mnl_gps_init: hal2mnl_gps_init
01-10 16:57:26.254412   520   693 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 16:57:26.254489   520   693 W MNLD    : hal_gps_init: hal_gps_init
01-10 16:57:26.254501   520   693 D MNL2AGPS: mnl2agps_gps_init: mnl2agps_gps_init
01-10 16:57:26.255152   987   987 E GnssLocationProvider: Unable to initialize GNSS Xtra interface
01-10 16:57:26.255240   557   585 D agps    : [agps][n][AGPS] [MNL] read  gps_init
01-10 16:57:26.255295   557   585 D agps    : [agps][n][CDMA] cdma_mgr_sync_gps_setting(): 1
01-10 16:57:26.255310   557   585 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_SET_PRIVACY_MODE
01-10 16:57:26.255452   557   585 D agps    : [agps][n][CDMA] check_low_power_mode(): old=0, new=0
01-10 16:57:26.255497   557   585 D agps    : [agps] WARNING: [AGPS] agps2_mgr_aireplane_mode_from_c2k() flight_mode_state=[0] flight_mode_power_off_md=[1] is_cp_run=[0]
01-10 16:57:26.255521   557   585 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 16:57:26.256580   563   563 E GFC_INF : mtk_geo_set_project_config: mtk_flp_set_project_config - open fd fail! 2 (No such file or directory)
01-10 16:57:26.256521   563  1230 D GFC_INF : mnl2gfchal_jni_thread: mtk_gfc_hal_jni_thread, Create
01-10 16:57:26.256629   563   563 D         : mtk_hal_geofence_init: init geofence, cb function : fca760c8
01-10 16:57:26.257267   520   693 D MNLD    : mnld_main_thread: gfc2mnl_hdlr msg
01-10 16:57:26.257359   520   693 D         : mtk_gfc_controller_process: MNLD_FLP_TYPE_FLP_ATTACH
01-10 16:57:26.257378   520   693 D         : gfc2mnl_hdlr: [GFC2MNLD]data from gfc: type=0xc8, session_id=0, len=0,read_len = 12
01-10 16:57:26.257400   520   693 D         : mnl_gfc_dump_buf: [GFC2MNLD]data from gfc: data=200,  0,  0,  0,  0,  0,  0,  0,
01-10 16:57:26.257423   520   693 D         : mnl_gfc_dump_buf: [GFC2MNLD]data from gfc: data=  0,  0,  0,  0,
01-10 16:57:26.257433   520   693 D MNLD    : mnld_gfc_attach: mnld_gfc_attach
01-10 16:57:26.257443   520   693 D         : mnld_gfc_attach_done: mnld_gfc_attach_done
01-10 16:57:26.257453   520   693 D         : mnl2gfc_hdlr: MNL_STATUS_ATTACH_DONE
01-10 16:57:26.257464   520   693 D MNLD    : mnld_gfc_attach: Send attach done to GFC succeed
01-10 16:57:26.257479   520   693 D         : mnld_gfc_session_update: mnld_gfc_session_update,id=1,type=1
01-10 16:57:26.257491   520   693 D         : mnl2gfc_hdlr: SESSION_UPDATE 1 support 1 mode 2
01-10 16:57:26.257503   520   693 D         : mtk_gfc_set_sys_mode: mtk_gfc_set_sys_mode success = 1
01-10 16:57:26.257513   520   693 D         : mnl2gfc_hdlr: SESSION_UPDATE: set ap mode
01-10 16:57:26.257771   563   563 E VzwDebugInterface: init: Vzw debug init, to set callback
01-10 16:57:26.258124   563   563 D hal2mnl : hal2mnl_gps_cleanup: hal2mnl_gps_cleanup
01-10 16:57:26.258464   520   693 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 16:57:26.258539   520   693 W MNLD    : hal_gps_cleanup: hal_gps_cleanup
01-10 16:57:26.258557   520   693 D MNL2AGPS: mnl2agps_gps_cleanup: mnl2agps_gps_cleanup
01-10 16:57:26.259119   557   585 D agps    : [agps][n][AGPS] [MNL] read  gps_cleanup
01-10 16:57:26.259196   557   585 D agps    : [agps][n][CDMA] cdma_mgr_sync_gps_setting(): 0
01-10 16:57:26.259210   557   585 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_SET_PRIVACY_MODE
01-10 16:57:26.259320   557   585 D agps    : [agps][n][CDMA] check_low_power_mode(): old=0, new=0
01-10 16:57:26.259359   557   585 D agps    : [agps] WARNING: [AGPS] agps2_mgr_aireplane_mode_from_c2k() flight_mode_state=[0] flight_mode_power_off_md=[1] is_cp_run=[0]
01-10 16:57:26.259378   557   585 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[0]
01-10 16:57:26.259465   987  1005 W zygote64: kill(-1170, 9) failed: No such process
01-10 16:57:26.259540   987  1005 I zygote64: Successfully killed process cgroup uid 1037 pid 1170 in 0ms
01-10 16:57:26.260398   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.261955   987   987 D LocationProviderProxy-network: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 16:57:26.262902   987   987 D LocationProviderProxy-network: bindBestPackage for com.android.location.service.v3.NetworkLocationProvider :  found 0, no new best component
01-10 16:57:26.263382   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.263761   546  1159 I OMXMaster: makeComponentInstance(OMX.google.mp3.decoder) in omx@1.0-service process
01-10 16:57:26.264275   987   987 D LocationProviderProxy-fused: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 16:57:26.265344   987   987 D LocationProviderProxy-fused: bindBestPackage for com.android.location.service.FusedLocationProvider :  found 1, new best component: ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService}
01-10 16:57:26.265594   987   987 D LocationProviderProxy-fused: binding ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService} (v0) (u0)
01-10 16:57:26.272035   987   987 D GeocoderProxy: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 16:57:26.273057   987   987 D GeocoderProxy: bindBestPackage for com.android.location.service.GeocodeProvider :  found 0, no new best component
01-10 16:57:26.275493   987   987 D GeofenceProxy: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 16:57:26.275980   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.276712  1119  1119 W InputAttributes: No editor info for this field. Bug?
01-10 16:57:26.278463   987   987 E ActivityRecognitionHardware: activity_recognition HAL is deprecated. is_supported is effectively a no-op
01-10 16:57:26.278590   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.279104   546  1159 I OMXMaster: makeComponentInstance(OMX.google.opus.decoder) in omx@1.0-service process
01-10 16:57:26.279720   987   987 D ActivityRecognitionProxy: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 16:57:26.280767   987   987 E ActivityRecognitionProxy: ServiceWatcher could not start.
01-10 16:57:26.281677   987   987 D LocationManagerService: updateProvidersLocked provider:fused changesMade: true isEnabled:false shouldBeEnabled:true
01-10 16:57:26.282094   987   987 D LocationManagerService: updateProvidersLocked provider:network changesMade: true isEnabled:false shouldBeEnabled:false
01-10 16:57:26.282387   987   987 I GnssLocationProvider: WakeLock acquired by sendMessage(ENABLE, 1, null)
01-10 16:57:26.282475   987   987 D LocationManagerService: updateProvidersLocked provider:gps changesMade: true isEnabled:false shouldBeEnabled:true
01-10 16:57:26.282590   987   987 D LocationManagerService: updateProvidersLocked provider:passive changesMade: true isEnabled:true shouldBeEnabled:true
01-10 16:57:26.283314  1131  1131 V SystemUIService: Starting SystemUI services for user 0.
01-10 16:57:26.284343   987   987 D MtkLocationExt: MtkLocationExt LocationManagerService()
01-10 16:57:26.284610   987   987 D LocationManagerService: mMtkLocationManagerService = com.mediatek.location.MtkLocationExt$LocationManagerService@d8b79d7
01-10 16:57:26.284865   987   987 D LocationManagerService: checkCtaSupport = true
01-10 16:57:26.290489   987  1002 D LocationManagerService: request 3cc863 passive Request[POWER_NONE passive fastest=0] from android(1000 foreground [whitelisted])
01-10 16:57:26.291466   987  1114 D Ethernet: got request NetworkRequest [ TRACK_DEFAULT id=6, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:26.291876   987  1002 I GnssLocationProvider: WakeLock released by handleMessage(INITIALIZE_HANDLER, 0, null)
01-10 16:57:26.295122   987   987 I CommonTimeManagementService: No common time service detected on this platform.  Common time services will be unavailable.
01-10 16:57:26.297334   987  1079 I InputReader: Reconfiguring input devices.  changes=0x00000020
01-10 16:57:26.302406   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.309286   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.310389   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.RAW) in omx@1.0-service process
01-10 16:57:26.311082  1187  1187 I zygote64: System.exit called, status: 0
01-10 16:57:26.311197  1187  1187 I AndroidRuntime: VM exiting with result code 0, cleanup skipped.
01-10 16:57:26.313941  1119  1236 I LatinIME:LogUtils: Dictionary info: dictionary = UserHistoryDictionary.en_US ; version = 1578016041 ; date = 1578104338
01-10 16:57:26.317432   987  1079 I InputReader: Reconfiguring input devices.  changes=0x00000010
01-10 16:57:26.315964  1119  1236 I LatinIME:LogUtils: Dictionary info: dictionary = userunigram.en_US ; version = 1578646646 ; date = ?
01-10 16:57:26.318737   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.322722  1131  1131 V MediaRouter: Adding route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 16:57:26.324422   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.325243   546   656 I OMXMaster: makeComponentInstance(OMX.google.raw.decoder) in omx@1.0-service process
01-10 16:57:26.334685   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.334769   987  1005 W zygote64: kill(-1187, 9) failed: No such process
01-10 16:57:26.335027   987  1005 I zygote64: Successfully killed process cgroup uid 1037 pid 1187 in 0ms
01-10 16:57:26.335160   546   656 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 16:57:26.336247  1131  1131 V MediaRouter: Selecting route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 16:57:26.344375   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.344504   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.344866   546   656 I OMXMaster: makeComponentInstance(OMX.google.aac.encoder) in omx@1.0-service process
01-10 16:57:26.359555  1119  1236 I LatinIME:LogUtils: Dictionary info: dictionary = main:en ; version = 54 ; date = 1414726273
01-10 16:57:26.360428   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.364503   563   563 W MtkGnssHAL_GnssInterface: setCallback called more than once. Unexpected unless test.
01-10 16:57:26.364857   987  1002 D GnssLocationProvider: gnssSetCapabilitesCb: 65536u
01-10 16:57:26.365363   987  1002 D GnssLocationProvider: gnssSetSystemInfoCb: yearOfHw=2015
01-10 16:57:26.365539   563   563 D         : gpshal_gpscbs_save: Use GpsCallbacks
01-10 16:57:26.365581   563   563 D hal2mnl : hal2mnl_gps_init: hal2mnl_gps_init
01-10 16:57:26.365950   520   693 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 16:57:26.366048   520   693 W MNLD    : hal_gps_init: hal_gps_init
01-10 16:57:26.366029   987  1002 E GnssLocationProvider: Unable to initialize GNSS Xtra interface
01-10 16:57:26.366062   520   693 D MNL2AGPS: mnl2agps_gps_init: mnl2agps_gps_init
01-10 16:57:26.367020   557   585 D agps    : [agps][n][AGPS] [MNL] read  gps_init
01-10 16:57:26.367081   557   585 D agps    : [agps][n][CDMA] cdma_mgr_sync_gps_setting(): 1
01-10 16:57:26.367096   557   585 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_SET_PRIVACY_MODE
01-10 16:57:26.367580   563   563 E GFC_INF : hal2_geofence_init: geofence init before
01-10 16:57:26.367635   563   563 D         : mtk_hal_geofence_init: init geofence, cb function : fca760c8
01-10 16:57:26.367883   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.368067   557   585 D agps    : [agps][n][CDMA] check_low_power_mode(): old=0, new=0
01-10 16:57:26.368491   557   585 D agps    : [agps] WARNING: [AGPS] agps2_mgr_aireplane_mode_from_c2k() flight_mode_state=[0] flight_mode_power_off_md=[1] is_cp_run=[0]
01-10 16:57:26.368483   546   656 I OMXMaster: makeComponentInstance(OMX.google.amrnb.encoder) in omx@1.0-service process
01-10 16:57:26.368534   557   585 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 16:57:26.369794   563   563 E VzwDebugInterface: init: Vzw debug init, to set callback
01-10 16:57:26.370064   563   563 D hal2mnl : hal2mnl_set_server: hal2mnl_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 16:57:26.370462   520   693 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 16:57:26.370572   520   693 D MNLD    : hal_set_server: hal_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 16:57:26.370877   563   563 D         : mtk_flp_init
01-10 16:57:26.371108   563   563 E         : mtk_flp_init: mtkFlpCallbacks.set_thread_event_cb
01-10 16:57:26.371136   563   563 E         : mtk_flp_init: mtkFlpCallbacks.flp_capabilities_cb
01-10 16:57:26.371341   557   585 D agps    : [agps][n][AGPS] [MNL] read  set_server  type=1 hostname=[supl.google.com] port=7275 aosp_profile_enable=0
01-10 16:57:26.371151   563   563 D GnssHAL_GnssBatchingInterface: flpCapabilitiesCb capabilities 1
01-10 16:57:26.372098   563   563 D         : init_timer_id: timer create ok
01-10 16:57:26.372568   563  1254 D         : mnl2flphal_jni_thread: mtk_flp_hal_jni_thread, Create
01-10 16:57:26.372830   520   693 D MNLD    : mnld_main_thread: flp2mnl_hdlr msg
01-10 16:57:26.372916   520   693 D flpint  : mtk_flp2mnl_process: MNLD_FLP_TYPE_FLP_ATTACH
01-10 16:57:26.373028   520   693 D flpmain : mnl_flp_dump_buf: [FLP2MNLD]data from flp: data=200,  0,  0,  0,  0,  0,  0,  0,
01-10 16:57:26.373072   520   693 D flpmain : mnl_flp_dump_buf: [FLP2MNLD]data from flp: data=  0,  0,  0,  0,
01-10 16:57:26.373101   520   693 D MNLD    : mnld_flp_attach: mnld_flp_attach
01-10 16:57:26.373140   520   693 D flpmain : mnld_flp_attach_done: mnld_flp_attach_done
01-10 16:57:26.373172   520   693 D flpint  : mnl2flp_hdlr: MNL_STATUS_ATTACH_DONE
01-10 16:57:26.373188   987  1002 I GnssLocationProvider: WakeLock released by handleMessage(ENABLE, 1, null)
01-10 16:57:26.373203   520   693 D MNLD    : mnld_flp_attach: Send attach done to FLP succeed
01-10 16:57:26.373236   520   693 D flpmain : mnld_flp_session_update: mnld_flp_session_update,id=1,type=1
01-10 16:57:26.373270   520   693 D flpint  : mnl2flp_hdlr: SESSION_UPDATE 1 support 1 mode 2
01-10 16:57:26.373302   520   693 D flpmain : mtk_flp_set_sys_mode: mtk_flp_set_sys_mode success = 1
01-10 16:57:26.373333   520   693 D flpint  : mnl2flp_hdlr: SESSION_UPDATE: set ap mode
01-10 16:57:26.377192   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.377697   546   656 I OMXMaster: makeComponentInstance(OMX.google.amrwb.encoder) in omx@1.0-service process
01-10 16:57:26.386456   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.387249   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.388060   546   656 I OMXMaster: makeComponentInstance(OMX.google.flac.encoder) in omx@1.0-service process
01-10 16:57:26.396225   523   549 D AAL     : 01-10 04:57:26.189 BL= 371,ESS= 256, 01-10 04:57:26.226 BL= 372,ESS= 256, 01-10 04:57:26.303 BL= 373,ESS= 256, 01-10 04:57:26.339 BL= 374,ESS= 256, 01-10 04:57:26.396 BL= 375,ESS= 256, 
01-10 16:57:26.396315   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.396804   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.AVC) in omx@1.0-service process
01-10 16:57:26.402374   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.412014  1131  1131 W SoundPool: Use of stream types is deprecated for operations other than volume control
01-10 16:57:26.412137  1131  1131 W SoundPool: See the documentation of SoundPool() for what to use instead with android.media.AudioAttributes to qualify your playback use case
01-10 16:57:26.416603  1131  1263 V NuMediaExtractor: setDataSource fd=44 (/system/media/audio/ui/Lock.ogg), offset=0, length=8308
01-10 16:57:26.417689  1131  1131 D KeyguardDialogManager: DialogSequenceManager DialogSequenceManager()
01-10 16:57:26.419595   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/1131/cmdline]
01-10 16:57:26.424354   543   587 I PPL/PPLAgent: checkCallerUidPermission(code:3,  uid:10021)
01-10 16:57:26.424497   543   587 E PPL/PPLAgent: checkCallerUidPermission Fail! (code:3,  uid:10021)
01-10 16:57:26.424782  1131  1131 I AntiTheftManager: PplCheckLocked, the lock flag is:false
01-10 16:57:26.425019  1131  1131 D AntiTheftManager: getInstance(...) is called.
01-10 16:57:26.425078  1131  1131 D AntiTheftManager: getInstance(...) create one.
01-10 16:57:26.425858   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/1131/cmdline]
01-10 16:57:26.425917  1131  1131 D AntiTheftManager: AntiTheftManager() is called.
01-10 16:57:26.426233  1131  1131 D AntiTheftManager: mDismissable is 0 before
01-10 16:57:26.426289  1131  1131 D AntiTheftManager: mDismissable is 0 after
01-10 16:57:26.426371  1131  1131 D AntiTheftManager: MTK_PRIVACY_PROTECTION_LOCK is enabled.
01-10 16:57:26.426411  1131  1131 D AntiTheftManager: mDismissable is 0 before
01-10 16:57:26.426432  1131  1131 D AntiTheftManager: mDismissable is 2 after
01-10 16:57:26.428101  1131  1131 D VoiceWakeupManagerProxy: getInstance(...) is called.
01-10 16:57:26.428110   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.428172  1131  1131 D VoiceWakeupManagerProxy: getInstance(...) create one.
01-10 16:57:26.428217  1131  1131 D VoiceWakeupManagerProxy: constructor is called.
01-10 16:57:26.428836  1131  1131 E VoiceWakeupManagerProxy: createVoiceWakeupManagerInstance error
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: java.lang.ClassNotFoundException: com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManager
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at java.lang.Class.classForName(Native Method)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at java.lang.Class.forName(Class.java:453)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at java.lang.Class.forName(Class.java:378)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManagerProxy.createVoiceWakeupManagerInstance(VoiceWakeupManagerProxy.java:40)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManagerProxy.getInstance(VoiceWakeupManagerProxy.java:33)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at com.android.systemui.keyguard.KeyguardViewMediator.setupLocked(KeyguardViewMediator.java:933)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at com.android.systemui.keyguard.KeyguardViewMediator.start(KeyguardViewMediator.java:948)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at com.android.systemui.SystemUIApplication.startServicesIfNeeded(SystemUIApplication.java:215)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at com.android.systemui.SystemUIApplication.startServicesIfNeeded(SystemUIApplication.java:164)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at com.android.systemui.SystemUIService.onCreate(SystemUIService.java:33)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread.handleCreateService(ActivityThread.java:3380)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread.-wrap4(Unknown Source:0)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1711)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at android.os.Looper.loop(Looper.java:164)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: Caused by: java.lang.ClassNotFoundException: Didn't find class "com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManager" on path: DexPathList[[zip file "/system/priv-app/MtkSystemUI/MtkSystemUI.apk"],nativeLibraryDirectories=[/system/priv-app/MtkSystemUI/lib/arm64, /system/lib64, /vendor/lib64, /system/lib64, /vendor/lib64]]
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:125)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 16:57:26.429708  1131  1131 E VoiceWakeupManagerProxy: 	... 19 more
01-10 16:57:26.430297   987   987 E libdevice_genetic: VSCAN_LEFT_TRIGGER 
01-10 16:57:26.433364  1131  1131 D RemoteLockManager: getInstance(...) is called.
01-10 16:57:26.433397  1131  1131 D RemoteLockManager: getInstance(...) create one.
01-10 16:57:26.433466   535   668 V APEExtractor: getAPEInfo not ape 20483
01-10 16:57:26.433917   535   668 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:26.434480  1131  1131 D RemoteLockManager: RemoteLockManager() is called.
01-10 16:57:26.438009  1131  1263 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 16:57:26.441811   546   656 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 16:57:26.442869   546   656 D MtkOmxVdecEx: [0xe93e1000] MtkOmxVdec::MtkOmxVdec this= 0xE93E1000
01-10 16:57:26.443114   546   656 D MtkOmxVdecEx: [0xe93e1000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.443848   546   656 D MtkOmxVdecEx: [0xe93e1000] MtkOmxComponentCreate mCompHandle(0xE93E1004)
01-10 16:57:26.443908   546   656 D MtkOmxVdecEx: [0xe93e1000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.AVC)
01-10 16:57:26.444370   546   656 I         : isVTService(media.codec)
01-10 16:57:26.444390   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.445600   546   656 D MtkOmxVdecEx: [0xe93e1000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 16:57:26.446422   987   987 E libdevice_genetic: VSCAN_RIGHT_TRIGGER 
01-10 16:57:26.446593   546  1270 D MtkOmxVdecEx: [0xe93e1000] MtkOmxVdecDecodeThread created pVdec=0xE93E1000, tid=1270
01-10 16:57:26.450675   546  1269 D MtkOmxVdecEx: [0xe93e1000] MtkOmxVdecThread created pVdec=0xE93E1000, tid=1269
01-10 16:57:26.450762   546  1271 D MtkOmxVdecEx: [0xe93e1000] MtkOmxVdecConvertThread created pVdec=0xE93E1000, tid=1271
01-10 16:57:26.460472   987   987 E libdevice_genetic: VSCAN_PISTOL_TRIGGER 
01-10 16:57:26.469888   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.475675   987   987 E libdevice_battery: battery_min_temperature: temperature not in range
01-10 16:57:26.483242   987   987 E DL-KSParserFactory: Error while retrieving KSType file
01-10 16:57:26.483440   987   987 W System.err: java.io.FileNotFoundException: /enterprise/imported/type (Permission denied)
01-10 16:57:26.483667   987   987 W System.err: 	at java.io.FileInputStream.open0(Native Method)
01-10 16:57:26.483714   987   987 W System.err: 	at java.io.FileInputStream.open(FileInputStream.java:200)
01-10 16:57:26.483741   987   987 W System.err: 	at java.io.FileInputStream.<init>(FileInputStream.java:150)
01-10 16:57:26.483756   987   987 W System.err: 	at java.io.FileInputStream.<init>(FileInputStream.java:103)
01-10 16:57:26.483770   987   987 W System.err: 	at java.io.FileReader.<init>(FileReader.java:58)
01-10 16:57:26.483784   987   987 W System.err: 	at com.datalogic.server.KSParserFactory.getType(KSParserFactory.java:39)
01-10 16:57:26.483803   987   987 W System.err: 	at com.datalogic.server.KSParserFactory.createKSParser(KSParserFactory.java:19)
01-10 16:57:26.483823   987   987 W System.err: 	at com.datalogic.server.WifiConfDecryptManager.importExternalKeystore(WifiConfDecryptManager.java:262)
01-10 16:57:26.483839   987   987 W System.err: 	at com.datalogic.server.WifiConfDecryptManager.setupKeyStore(WifiConfDecryptManager.java:232)
01-10 16:57:26.483860   987   987 W System.err: 	at com.datalogic.server.WifiConfDecryptManager.init(WifiConfDecryptManager.java:151)
01-10 16:57:26.483874   987   987 W System.err: 	at com.datalogic.server.CryptoManager.systemReady(CryptoManager.java:46)
01-10 16:57:26.483890   987   987 W System.err: 	at com.android.server.SystemServer.lambda$-com_android_server_SystemServer_85408(SystemServer.java:2117)
01-10 16:57:26.483905   987   987 W System.err: 	at com.android.server.-$Lambda$T7cKu_OKm_Fk2kBNthmo_uUJTSo$1.$m$0(Unknown Source:146)
01-10 16:57:26.483926   987   987 W System.err: 	at com.android.server.-$Lambda$T7cKu_OKm_Fk2kBNthmo_uUJTSo$1.run(Unknown Source:0)
01-10 16:57:26.483941   987   987 W System.err: 	at com.android.server.am.ActivityManagerService.systemReady(ActivityManagerService.java:14428)
01-10 16:57:26.483956   987   987 W System.err: 	at com.android.server.SystemServer.startOtherServices(SystemServer.java:1875)
01-10 16:57:26.483969   987   987 W System.err: 	at com.android.server.SystemServer.run(SystemServer.java:434)
01-10 16:57:26.484002   987   987 W System.err: 	at com.android.server.SystemServer.main(SystemServer.java:299)
01-10 16:57:26.484017   987   987 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 16:57:26.484032   987   987 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 16:57:26.484046   987   987 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:837)
01-10 16:57:26.484156   987   987 E DL-KSParserFactory: Unknown keystore type
01-10 16:57:26.484326   557   584 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_AGPS_INIT
01-10 16:57:26.485303   546  1159 E OMXNodeInstance: getParameter(0xe93e1004:MTK.DECODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.485503   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.485538   537   676 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 16:57:26.486154   546  1159 E OMXNodeInstance: getParameter(0xe93e1004:MTK.DECODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.486490   546  1159 E OMXNodeInstance: getExtensionIndex(0xe93e1004:MTK.DECODER.AVC, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.486645   546  1159 E MtkOmxVdecEx: [0xe93e1000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.486744   546  1159 E OMXNodeInstance: setParameter(0xe93e1004:MTK.DECODER.AVC, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.487036   546  1159 D MtkOmxVdecEx: [0xe93e1000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.487339   546  1270 D MtkOmxVdecEx: [0xe93e1000] MtkOmxVdecDecodeThread terminated pVdec=0xE93E1000
01-10 16:57:26.487438   546  1269 D MtkOmxVdecEx: [0xe93e1000] MtkOmxVdecThread terminated
01-10 16:57:26.487605   546  1271 D MtkOmxVdecEx: [0xe93e1000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.478000   987   987 W system_server: type=1400 audit(0.0:43): avc: denied { search } for name="/" dev="mmcblk0p7" ino=2 scontext=u:r:system_server:s0 tcontext=u:object_r:enterprise_file:s0 tclass=dir permissive=0
01-10 16:57:26.497628   546  1159 D MtkOmxVdecEx: [0xe93e1000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.497695   546  1159 D MtkOmxVdecEx: [0xe93e1000] ~MtkOmxVdec this= 0xE93E1000
01-10 16:57:26.497921   546  1272 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.501036   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.501359   546   656 I OMXMaster: makeComponentInstance(OMX.google.h264.decoder) in omx@1.0-service process
01-10 16:57:26.510144   546  1290 E OMXNodeInstance: getExtensionIndex(0xe93af3c0:google.h264.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.510455   546  1159 E OMXNodeInstance: getExtensionIndex(0xe93af3c0:google.h264.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.512055   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.513459   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.514075   546  1290 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.DIVX) in omx@1.0-service process
01-10 16:57:26.515132   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.515303   546  1290 D MtkOmxVdecEx: [0xe8e17000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.515824   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxComponentCreate mCompHandle(0xE8E17004)
01-10 16:57:26.515868   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.DIVX)
01-10 16:57:26.516588   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 16:57:26.519230   546  1291 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread created pVdec=0xE8E17000, tid=1291
01-10 16:57:26.523358   546   656 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.DIVX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.523565   537   676 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 16:57:26.524066   546   656 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.DIVX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.524341   546   656 E OMXNodeInstance: getExtensionIndex(0xe8e17004:MTK.DECODER.DIVX, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.524488   546   656 E MtkOmxVdecEx: [0xe8e17000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.524587   546   656 E OMXNodeInstance: setParameter(0xe8e17004:MTK.DECODER.DIVX, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.524846   546   656 D MtkOmxVdecEx: [0xe8e17000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.525122   546  1291 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread terminated
01-10 16:57:26.525660   546  1292 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread created pVdec=0xE8E17000, tid=1292
01-10 16:57:26.527233   546  1292 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread terminated pVdec=0xE8E17000
01-10 16:57:26.527506   546  1293 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread created pVdec=0xE8E17000, tid=1293
01-10 16:57:26.527548   546  1293 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.533363   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.535029  1131  1131 I vol.Events: writeEvent collection_started
01-10 16:57:26.535309   546   656 D MtkOmxVdecEx: [0xe8e17000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.535381   546   656 D MtkOmxVdecEx: [0xe8e17000] ~MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.535586   546  1294 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.539338   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.539971   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.DIVX3) in omx@1.0-service process
01-10 16:57:26.540777   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.540948   546   656 D MtkOmxVdecEx: [0xe8e17000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.541404   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxComponentCreate mCompHandle(0xE8E17004)
01-10 16:57:26.541458   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.DIVX3)
01-10 16:57:26.542250   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 16:57:26.542694   546  1319 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread created pVdec=0xE8E17000, tid=1319
01-10 16:57:26.542792   546  1320 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread created pVdec=0xE8E17000, tid=1320
01-10 16:57:26.542855   546  1321 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread created pVdec=0xE8E17000, tid=1321
01-10 16:57:26.549595   546   656 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.DIVX3, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.549788   537   676 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 16:57:26.550282   546   656 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.DIVX3, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.550714   546   656 E OMXNodeInstance: getExtensionIndex(0xe8e17004:MTK.DECODER.DIVX3, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.550899   546   656 E MtkOmxVdecEx: [0xe8e17000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.551049   546   656 E OMXNodeInstance: setParameter(0xe8e17004:MTK.DECODER.DIVX3, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.551318   546   656 D MtkOmxVdecEx: [0xe8e17000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.551530   546  1321 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.551530   546  1320 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread terminated pVdec=0xE8E17000
01-10 16:57:26.551563   546  1319 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread terminated
01-10 16:57:26.553666   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.561760   546   656 D MtkOmxVdecEx: [0xe8e17000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.561861   546   656 D MtkOmxVdecEx: [0xe8e17000] ~MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.562073   546  1322 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.564561   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.565037   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.H263) in omx@1.0-service process
01-10 16:57:26.565918   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.566066   546   656 D MtkOmxVdecEx: [0xe8e17000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.566561   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxComponentCreate mCompHandle(0xE8E17004)
01-10 16:57:26.566599   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.H263)
01-10 16:57:26.567235   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 16:57:26.567691   546  1325 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread created pVdec=0xE8E17000, tid=1325
01-10 16:57:26.567865   546  1326 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread created pVdec=0xE8E17000, tid=1326
01-10 16:57:26.567926   546  1327 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread created pVdec=0xE8E17000, tid=1327
01-10 16:57:26.569418   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.576094   546   656 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.576360   537   676 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 16:57:26.577024   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.577475   546  1290 E OMXNodeInstance: getExtensionIndex(0xe8e17004:MTK.DECODER.H263, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.577637   546  1290 E MtkOmxVdecEx: [0xe8e17000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.577707   546  1290 E OMXNodeInstance: setParameter(0xe8e17004:MTK.DECODER.H263, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.577912   546  1290 D MtkOmxVdecEx: [0xe8e17000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.578127   546  1326 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread terminated pVdec=0xE8E17000
01-10 16:57:26.578141   546  1327 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.578171   546  1325 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread terminated
01-10 16:57:26.588345   546  1290 D MtkOmxVdecEx: [0xe8e17000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.588426   546  1290 D MtkOmxVdecEx: [0xe8e17000] ~MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.588593   546  1328 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.590752   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.591202   546  1290 I OMXMaster: makeComponentInstance(OMX.google.h263.decoder) in omx@1.0-service process
01-10 16:57:26.595483   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.597334   546  1290 E OMXNodeInstance: getExtensionIndex(0xe982ad80:google.h263.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.597596   546  1290 E OMXNodeInstance: getExtensionIndex(0xe982ad80:google.h263.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.600675   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.601097   546  1290 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.HEVC) in omx@1.0-service process
01-10 16:57:26.601824   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.601989   546  1290 D MtkOmxVdecEx: [0xe8e17000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.602462   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxComponentCreate mCompHandle(0xE8E17004)
01-10 16:57:26.602519   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.HEVC)
01-10 16:57:26.603028   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 16:57:26.603512   546  1332 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread created pVdec=0xE8E17000, tid=1332
01-10 16:57:26.603897   546  1333 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread created pVdec=0xE8E17000, tid=1333
01-10 16:57:26.604075   546  1334 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread created pVdec=0xE8E17000, tid=1334
01-10 16:57:26.606772   397   414 I vendor.mediatek.hardware.power@1.1-impl: PowerHint hint:8, data:1
01-10 16:57:26.609119   397   413 I libPerfService: 8: legacy set freq: 1508000 -1 2002000 -1
01-10 16:57:26.611101   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.612754   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.612915   537   676 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 16:57:26.613329   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.613616   546  1290 E OMXNodeInstance: getExtensionIndex(0xe8e17004:MTK.DECODER.HEVC, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.613756   546   656 E MtkOmxVdecEx: [0xe8e17000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.613827   546   656 E OMXNodeInstance: setParameter(0xe8e17004:MTK.DECODER.HEVC, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.614070   546   656 D MtkOmxVdecEx: [0xe8e17000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.614364   546  1333 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread terminated pVdec=0xE8E17000
01-10 16:57:26.614385   546  1332 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread terminated
01-10 16:57:26.614593   546  1334 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.614664   546   656 D MtkOmxVdecEx: [0xe8e17000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.614688   546   656 D MtkOmxVdecEx: [0xe8e17000] ~MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.614882   546  1335 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.617185   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.617586   546   656 I OMXMaster: makeComponentInstance(OMX.google.hevc.decoder) in omx@1.0-service process
01-10 16:57:26.626092   546   656 E OMXNodeInstance: getExtensionIndex(0xe93af000:google.hevc.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.626274   546   656 E OMXNodeInstance: getExtensionIndex(0xe93af000:google.hevc.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.628861   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.629246   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.MPEG2) in omx@1.0-service process
01-10 16:57:26.629919   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.630065   546   656 D MtkOmxVdecEx: [0xe8e17000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.630463   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxComponentCreate mCompHandle(0xE8E17004)
01-10 16:57:26.630512   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.MPEG2)
01-10 16:57:26.631210   546   656 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 16:57:26.631632   546  1344 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread created pVdec=0xE8E17000, tid=1344
01-10 16:57:26.631716   546  1345 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread created pVdec=0xE8E17000, tid=1345
01-10 16:57:26.631765   546  1346 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread created pVdec=0xE8E17000, tid=1346
01-10 16:57:26.632462   546   656 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.MPEG2, ParamVideoProfileLevelQuerySupported(0x600000f)) ERROR: BadParameter(0x80001005)
01-10 16:57:26.633067   546   656 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.MPEG2, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.633179   537   676 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 16:57:26.633667   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.MPEG2, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.633921   546  1290 E OMXNodeInstance: getExtensionIndex(0xe8e17004:MTK.DECODER.MPEG2, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.634063   546  1290 E MtkOmxVdecEx: [0xe8e17000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.634150   546  1290 E OMXNodeInstance: setParameter(0xe8e17004:MTK.DECODER.MPEG2, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.634360   546  1290 D MtkOmxVdecEx: [0xe8e17000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.634555   546  1345 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread terminated pVdec=0xE8E17000
01-10 16:57:26.634555   546  1346 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.634591   546  1344 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread terminated
01-10 16:57:26.637126   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.639587  1195  1195 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 16:57:26.641979   523   549 D AAL     : 01-10 04:57:26.433 BL= 376,ESS= 256, 01-10 04:57:26.491 BL= 377,ESS= 256, 01-10 04:57:26.529 BL= 378,ESS= 256, 01-10 04:57:26.603 BL= 379,ESS= 256, 01-10 04:57:26.641 BL= 380,ESS= 256, 
01-10 16:57:26.643859  1195  1195 D AndroidRuntime: >>>>>> START com.android.internal.os.WebViewZygoteInit uid 1053 <<<<<<
01-10 16:57:26.644869   546  1290 D MtkOmxVdecEx: [0xe8e17000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.644925   546  1290 D MtkOmxVdecEx: [0xe8e17000] ~MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.645081   546  1347 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.647146   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.647515   546  1290 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.MPEG4) in omx@1.0-service process
01-10 16:57:26.648046   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.648156   546  1290 D MtkOmxVdecEx: [0xe8e17000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.648517   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxComponentCreate mCompHandle(0xE8E17004)
01-10 16:57:26.648552   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.MPEG4)
01-10 16:57:26.649091   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 16:57:26.649273  1195  1195 I /system/bin/webview_zygote32: option[0]=-Xzygote
01-10 16:57:26.649344  1195  1195 I /system/bin/webview_zygote32: option[1]=-Xusetombstonedtraces
01-10 16:57:26.649361  1195  1195 I /system/bin/webview_zygote32: option[2]=exit
01-10 16:57:26.649377  1195  1195 I /system/bin/webview_zygote32: option[3]=vfprintf
01-10 16:57:26.649392  1195  1195 I /system/bin/webview_zygote32: option[4]=sensitiveThread
01-10 16:57:26.649407  1195  1195 I /system/bin/webview_zygote32: option[5]=-verbose:gc
01-10 16:57:26.649421  1195  1195 I /system/bin/webview_zygote32: option[6]=-Xms4m
01-10 16:57:26.649436  1195  1195 I /system/bin/webview_zygote32: option[7]=-Xmx256m
01-10 16:57:26.649454  1195  1195 I /system/bin/webview_zygote32: option[8]=-XX:HeapGrowthLimit=128m
01-10 16:57:26.649470  1195  1195 I /system/bin/webview_zygote32: option[9]=-Xusejit:true
01-10 16:57:26.649489  1195  1195 I /system/bin/webview_zygote32: option[10]=-Xjitsaveprofilinginfo
01-10 16:57:26.649506  1195  1195 I /system/bin/webview_zygote32: option[11]=-agentlib:jdwp=transport=dt_android_adb,suspend=n,server=y
01-10 16:57:26.649522  1195  1195 I /system/bin/webview_zygote32: option[12]=-Ximage-compiler-option
01-10 16:57:26.649553  1195  1195 I /system/bin/webview_zygote32: option[13]=--runtime-arg
01-10 16:57:26.649570  1195  1195 I /system/bin/webview_zygote32: option[14]=-Ximage-compiler-option
01-10 16:57:26.649585  1195  1195 I /system/bin/webview_zygote32: option[15]=-Xms64m
01-10 16:57:26.649614  1195  1195 I /system/bin/webview_zygote32: option[16]=-Ximage-compiler-option
01-10 16:57:26.649631  1195  1195 I /system/bin/webview_zygote32: option[17]=--runtime-arg
01-10 16:57:26.649646  1195  1195 I /system/bin/webview_zygote32: option[18]=-Ximage-compiler-option
01-10 16:57:26.649667  1195  1195 I /system/bin/webview_zygote32: option[19]=-Xmx64m
01-10 16:57:26.649683  1195  1195 I /system/bin/webview_zygote32: option[20]=-Ximage-compiler-option
01-10 16:57:26.649699  1195  1195 I /system/bin/webview_zygote32: option[21]=--image-classes=/system/etc/preloaded-classes
01-10 16:57:26.649722  1195  1195 I /system/bin/webview_zygote32: option[22]=-Ximage-compiler-option
01-10 16:57:26.649738  1195  1195 I /system/bin/webview_zygote32: option[23]=--compiled-classes=/system/etc/compiled-classes
01-10 16:57:26.649754  1195  1195 I /system/bin/webview_zygote32: option[24]=-Ximage-compiler-option
01-10 16:57:26.649780  1195  1195 I /system/bin/webview_zygote32: option[25]=--dirty-image-objects=/system/etc/dirty-image-objects
01-10 16:57:26.649796  1195  1195 I /system/bin/webview_zygote32: option[26]=-Xcompiler-option
01-10 16:57:26.649823  1195  1195 I /system/bin/webview_zygote32: option[27]=--runtime-arg
01-10 16:57:26.649839  1195  1195 I /system/bin/webview_zygote32: option[28]=-Xcompiler-option
01-10 16:57:26.649854  1195  1195 I /system/bin/webview_zygote32: option[29]=-Xms64m
01-10 16:57:26.649880  1195  1195 I /system/bin/webview_zygote32: option[30]=-Xcompiler-option
01-10 16:57:26.649895  1195  1195 I /system/bin/webview_zygote32: option[31]=--runtime-arg
01-10 16:57:26.649911  1195  1195 I /system/bin/webview_zygote32: option[32]=-Xcompiler-option
01-10 16:57:26.649937  1195  1195 I /system/bin/webview_zygote32: option[33]=-Xmx512m
01-10 16:57:26.649954  1195  1195 I /system/bin/webview_zygote32: option[34]=-Ximage-compiler-option
01-10 16:57:26.649971  1195  1195 I /system/bin/webview_zygote32: option[35]=--instruction-set-variant=cortex-a53
01-10 16:57:26.649962   546  1357 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread created pVdec=0xE8E17000, tid=1357
01-10 16:57:26.649986  1195  1195 I /system/bin/webview_zygote32: option[36]=-Xcompiler-option
01-10 16:57:26.650002  1195  1195 I /system/bin/webview_zygote32: option[37]=--instruction-set-variant=cortex-a53
01-10 16:57:26.650020  1195  1195 I /system/bin/webview_zygote32: option[38]=-Ximage-compiler-option
01-10 16:57:26.650049  1195  1195 I /system/bin/webview_zygote32: option[39]=--instruction-set-features=default
01-10 16:57:26.650065  1195  1195 I /system/bin/webview_zygote32: option[40]=-Xcompiler-option
01-10 16:57:26.650082  1195  1195 I /system/bin/webview_zygote32: option[41]=--instruction-set-features=default
01-10 16:57:26.650099  1195  1195 I /system/bin/webview_zygote32: option[42]=-Duser.locale=zh-Hans-CN
01-10 16:57:26.650116  1195  1195 I /system/bin/webview_zygote32: option[43]=--cpu-abilist=armeabi-v7a,armeabi
01-10 16:57:26.650135  1195  1195 I /system/bin/webview_zygote32: option[44]=-Xfingerprint:Datalogic/dl35cn/dl35:8.1.0/1.07.15.20191227/1577435794:user/release-keys
01-10 16:57:26.651095   546  1358 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread created pVdec=0xE8E17000, tid=1358
01-10 16:57:26.651624   546  1359 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread created pVdec=0xE8E17000, tid=1359
01-10 16:57:26.652884   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.653664   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.653809   537   676 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 16:57:26.654197   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.654419   546  1290 E OMXNodeInstance: getExtensionIndex(0xe8e17004:MTK.DECODER.MPEG4, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.654551   546  1290 E MtkOmxVdecEx: [0xe8e17000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.654625   546  1290 E OMXNodeInstance: setParameter(0xe8e17004:MTK.DECODER.MPEG4, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.654833   546  1290 D MtkOmxVdecEx: [0xe8e17000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.655121   546  1359 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.655131   546  1358 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread terminated pVdec=0xE8E17000
01-10 16:57:26.655442   546  1357 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread terminated
01-10 16:57:26.656197  1195  1195 W /system/bin/webview_zygote32: Could not reserve sentinel fault page
01-10 16:57:26.665395   546  1290 D MtkOmxVdecEx: [0xe8e17000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.665507   546  1290 D MtkOmxVdecEx: [0xe8e17000] ~MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.665738   546  1360 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.670081   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.670429   546  1290 I OMXMaster: makeComponentInstance(OMX.google.mpeg4.decoder) in omx@1.0-service process
01-10 16:57:26.672478   546  1290 E OMXNodeInstance: getExtensionIndex(0xe982ad80:google.mpeg4.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.672721   546  1290 E OMXNodeInstance: getExtensionIndex(0xe982ad80:google.mpeg4.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.673845   397   414 I vendor.mediatek.hardware.power@1.1-impl: notifyAppState pack:com.android.settings, act:com.android.settings.FallbackHome, pid:1339, state:1
01-10 16:57:26.674542   397   413 I libPerfService: [smart_table_init] open file fail
01-10 16:57:26.674650   397   413 I libPerfService: [smart_table_init] open file fail
01-10 16:57:26.676463   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.676938   546  1290 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.VPX) in omx@1.0-service process
01-10 16:57:26.677514   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.677687   546  1290 D MtkOmxVdecEx: [0xe8e17000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.678093   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxComponentCreate mCompHandle(0xE8E17004)
01-10 16:57:26.678139   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.VPX)
01-10 16:57:26.679661   987  1002 D LocationProviderProxy-network: bindBestPackage for com.android.location.service.v3.NetworkLocationProvider :  found 0, no new best component
01-10 16:57:26.680557   546  1366 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread created pVdec=0xE8E17000, tid=1366
01-10 16:57:26.680525   395   423 D DynamicFpsPolicy: regInfo: 18d00000001
01-10 16:57:26.680627   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.680979   397   413 I libPerfService: [perfNotifyAppState] foreground:com.android.settings, pid:1339
01-10 16:57:26.681173   987  1002 D LocationProviderProxy-fused: bindBestPackage for com.android.location.service.FusedLocationProvider :  found 1, new best component: ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService}
01-10 16:57:26.682214   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.682455   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:26.682041   987  1002 D GeocoderProxy: bindBestPackage for com.android.location.service.GeocodeProvider :  found 0, no new best component
01-10 16:57:26.683078   546  1367 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread created pVdec=0xE8E17000, tid=1367
01-10 16:57:26.683281   546  1368 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread created pVdec=0xE8E17000, tid=1368
01-10 16:57:26.683592   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.684757   546  1290 E OMXNodeInstance: getExtensionIndex(0xe8e17004:MTK.DECODER.VPX, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.685097   546  1290 E MtkOmxVdecEx: [0xe8e17000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.685243   546  1290 E OMXNodeInstance: setParameter(0xe8e17004:MTK.DECODER.VPX, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.688229   546  1290 D MtkOmxVdecEx: [0xe8e17000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.688538   546  1367 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread terminated pVdec=0xE8E17000
01-10 16:57:26.688538   546  1368 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.690754   546  1366 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread terminated
01-10 16:57:26.692826  1131  1317 I vol.Events: writeEvent external_ringer_mode_changed vibrate
01-10 16:57:26.693160  1131  1317 I vol.Events: writeEvent internal_ringer_mode_changed vibrate
01-10 16:57:26.696017   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.696893  1339  1339 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:26.698788   546  1290 D MtkOmxVdecEx: [0xe8e17000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.698893   546  1290 D MtkOmxVdecEx: [0xe8e17000] ~MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.699218   546  1369 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.702155   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.702688   546  1290 I OMXMaster: makeComponentInstance(OMX.google.vp8.decoder) in omx@1.0-service process
01-10 16:57:26.716901  1297  1297 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:26.717903   546  1290 E OMXNodeInstance: getExtensionIndex(0xe982ad80:google.vp8.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.718378   546  1290 E OMXNodeInstance: getExtensionIndex(0xe982ad80:google.vp8.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.718489  1339  1339 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:26.720655   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.720982   546  1290 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.VP9) in omx@1.0-service process
01-10 16:57:26.721670   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.721847   546  1290 D MtkOmxVdecEx: [0xe8e17000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.722296   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxComponentCreate mCompHandle(0xE8E17004)
01-10 16:57:26.722345   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.VP9)
01-10 16:57:26.722482   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.728992  1281  1281 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:26.731075   546  1375 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread created pVdec=0xE8E17000, tid=1375
01-10 16:57:26.731215   546  1376 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread created pVdec=0xE8E17000, tid=1376
01-10 16:57:26.731283   546  1377 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread created pVdec=0xE8E17000, tid=1377
01-10 16:57:26.731556   548   884 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:26.730000   548   548 W HwBinder:548_2: type=1400 audit(0.0:44): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:26.741448   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.750425   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.VP9, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.750690   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:26.751447   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.VP9, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.751899   546  1290 E OMXNodeInstance: getExtensionIndex(0xe8e17004:MTK.DECODER.VP9, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.752142   546  1290 E MtkOmxVdecEx: [0xe8e17000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.752255   546  1290 E OMXNodeInstance: setParameter(0xe8e17004:MTK.DECODER.VP9, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.752569   546  1290 D MtkOmxVdecEx: [0xe8e17000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.752817   546  1376 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread terminated pVdec=0xE8E17000
01-10 16:57:26.752825   546  1377 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.752858   546  1375 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread terminated
01-10 16:57:26.760039  1281  1281 D ImsConfigProvider: [onCreate] User locked, register receiver for BOOT_COMPLETED
01-10 16:57:26.763276   546  1290 D MtkOmxVdecEx: [0xe8e17000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.763359   546  1290 D MtkOmxVdecEx: [0xe8e17000] ~MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.764190   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.764225   546  1378 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.766458   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.766867   546  1290 I OMXMaster: makeComponentInstance(OMX.google.vp9.decoder) in omx@1.0-service process
01-10 16:57:26.769112   546  1290 E OMXNodeInstance: getExtensionIndex(0xe982ad80:google.vp9.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.769309   546  1290 E OMXNodeInstance: getExtensionIndex(0xe982ad80:google.vp9.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.772495   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.772903   546  1290 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.VC1) in omx@1.0-service process
01-10 16:57:26.773616   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.773765   546  1290 D MtkOmxVdecEx: [0xe8e17000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.774172   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxComponentCreate mCompHandle(0xE8E17004)
01-10 16:57:26.774212   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.VC1)
01-10 16:57:26.774897   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 16:57:26.776033   546  1387 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread created pVdec=0xE8E17000, tid=1387
01-10 16:57:26.776326   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.VC1, ParamVideoProfileLevelQuerySupported(0x600000f)) ERROR: BadParameter(0x80001005)
01-10 16:57:26.776989   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.VC1, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.777121   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:26.777668   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.VC1, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.777972   546  1290 E OMXNodeInstance: getExtensionIndex(0xe8e17004:MTK.DECODER.VC1, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.778190   546  1290 E MtkOmxVdecEx: [0xe8e17000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.778282   546  1290 E OMXNodeInstance: setParameter(0xe8e17004:MTK.DECODER.VC1, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.778522   546  1290 D MtkOmxVdecEx: [0xe8e17000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.778757   546  1387 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread terminated
01-10 16:57:26.779057   546  1388 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread created pVdec=0xE8E17000, tid=1388
01-10 16:57:26.779102   546  1388 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread terminated pVdec=0xE8E17000
01-10 16:57:26.779709   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.783118   546  1389 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread created pVdec=0xE8E17000, tid=1389
01-10 16:57:26.783217   546  1389 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.788940   546  1290 D MtkOmxVdecEx: [0xe8e17000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.789036   546  1290 D MtkOmxVdecEx: [0xe8e17000] ~MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.789261   546  1390 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.794159  1297  1297 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:26.794742   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.796138   546  1290 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.XVID) in omx@1.0-service process
01-10 16:57:26.796892   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.797080   546  1290 D MtkOmxVdecEx: [0xe8e17000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 16:57:26.797527   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxComponentCreate mCompHandle(0xE8E17004)
01-10 16:57:26.797579   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.XVID)
01-10 16:57:26.798209   546  1290 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 16:57:26.798610   546  1394 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread created pVdec=0xE8E17000, tid=1394
01-10 16:57:26.798624   546  1393 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread created pVdec=0xE8E17000, tid=1393
01-10 16:57:26.798805   546  1395 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread created pVdec=0xE8E17000, tid=1395
01-10 16:57:26.805965   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.809837   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.XVID, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.810159   537   676 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 16:57:26.810776   546  1290 E OMXNodeInstance: getParameter(0xe8e17004:MTK.DECODER.XVID, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.811963   546   656 E OMXNodeInstance: getExtensionIndex(0xe8e17004:MTK.DECODER.XVID, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.812215   546   656 E MtkOmxVdecEx: [0xe8e17000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 16:57:26.812329   546   656 E OMXNodeInstance: setParameter(0xe8e17004:MTK.DECODER.XVID, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 16:57:26.814073   546   656 D MtkOmxVdecEx: [0xe8e17000] +MtkOmxVdec::ComponentDeInit
01-10 16:57:26.814416   546  1395 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecConvertThread terminated
01-10 16:57:26.814416   546  1394 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecDecodeThread terminated pVdec=0xE8E17000
01-10 16:57:26.814834   546  1393 D MtkOmxVdecEx: [0xe8e17000] MtkOmxVdecThread terminated
01-10 16:57:26.822076   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.824897   546   656 D MtkOmxVdecEx: [0xe8e17000] -MtkOmxVdec::ComponentDeInit
01-10 16:57:26.824991   546   656 D MtkOmxVdecEx: [0xe8e17000] ~MtkOmxVdec this= 0xE8E17000
01-10 16:57:26.825203   546  1396 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.827938   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.828318   546  1290 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.AVC) in omx@1.0-service process
01-10 16:57:26.830675  1281  1281 I zygote64: Looking for service vendor.mediatek.hardware.radio@2.0::IRadio/imsrild1
01-10 16:57:26.833780   546  1290 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::MtkOmxVenc this= 0xE985D800
01-10 16:57:26.834402   546  1290 D MtkOmxVenc: [0xe985d800] dump flag=0x0
01-10 16:57:26.834538   546  1290 D MtkOmxVenc: [0xe985d800] MtkOmxComponentCreate mCompHandle(0xE985D804)
01-10 16:57:26.834573   546  1290 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.AVC)
01-10 16:57:26.834618   546  1290 E MtkOmxVenc: [0xe985d800] bufk = 0
01-10 16:57:26.834649   546  1290 D MtkOmxVenc: [0xe985d800] uDefaultAVCProfileType 2
01-10 16:57:26.834666   546  1290 D MtkOmxVenc: [0xe985d800] uDefaultAVCLevelType 4
01-10 16:57:26.834681   546  1290 D MtkOmxVenc: [0xe985d800] uDefaultAVCProfileType 2
01-10 16:57:26.835516   546  1290 D MtkOmxVenc: [0xe985d800] uDefaultAVCProfileType 2
01-10 16:57:26.835572   546  1290 D MtkOmxVenc: [0xe985d800] uDefaultAVCLevelType 4
01-10 16:57:26.835590   546  1290 D MtkOmxVenc: [0xe985d800] uDefaultAVCProfileType 2
01-10 16:57:26.835741   546  1290 D MtkOmxVenc: [0xe985d800] InitSecEncParams svp support: 0, type: 0
01-10 16:57:26.835773   546  1290 D MtkOmxVenc: [0xe985d800] ComponentInit init sec 2 mIsSecureInst 0
01-10 16:57:26.838716   401   580 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=23.70 dur=1012.81 max=52.68 min=33.78
01-10 16:57:26.839833   546  1400 D MtkOmxVenc: [0xe985d800] MtkOmxVencConvertThread created pVenc=0xE985D800, tid=1400
01-10 16:57:26.840198  1339  1339 I SurfaceFactory: [static] sSurfaceFactory = com.mediatek.view.impl.SurfaceFactoryImpl@90b4a99
01-10 16:57:26.840877  1297  1297 D TelephonyProvider: Version: [1376520]
01-10 16:57:26.840942  1281  1281 I zygote64: Starting thread pool.
01-10 16:57:26.843059   546  1398 D MtkOmxVenc: [0xe985d800] MtkOmxVencThread created pVenc=0xE985D800
01-10 16:57:26.843183   546  1399 D MtkOmxVenc: [0xe985d800] MtkOmxVencEncodeThread created pVenc=0xE985D800, tid=1399
01-10 16:57:26.845141  1297  1297 D TelephonyProvider: DatabaseHelper: guestUser=false
01-10 16:57:26.847848   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.848114   401   580 I SurfaceFlinger: EventThread Client Pid (1339) created
01-10 16:57:26.850032   401   580 I SurfaceFlinger: EventThread Client Pid (1339) created
01-10 16:57:26.850557  1297  1297 D TelephonyProvider: dbh.onOpen: ok, queried table=siminfo
01-10 16:57:26.851929  1339  1339 D WindowClient: Add to mViews: DecorView@37d420c[FallbackHome], this = android.view.WindowManagerGlobal@7bcf755
01-10 16:57:26.852603  1297  1297 D TelephonyProvider: dbh.onOpen: ok, queried table=carriers
01-10 16:57:26.853017  1339  1339 D OpenGLRenderer: Dumper init 4 threads <0x73c8905780>
01-10 16:57:26.853239  1339  1339 D OpenGLRenderer: <com.android.settings> is running.
01-10 16:57:26.855456   401   580 I SurfaceFlinger: EventThread Client Pid (1339) created
01-10 16:57:26.856045  1339  1405 D OpenGLRenderer: HWUI GL Pipeline
01-10 16:57:26.856559   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 16:57:26.856634   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 16:57:26.856660   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 16:57:26.856683   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 16:57:26.856705   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 16:57:26.856731   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 16:57:26.856857   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.857255   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:26.858596   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.862831  1339  1339 D ViewRootImpl[FallbackHome]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 16:57:26.863151   537   676 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 16:57:26.863801   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.868725   546   656 D MtkOmxVenc: [0xe985d800] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 16:57:26.869312   401   580 I SurfaceFlinger: [SF client] NEW(0x740b228300) for (987:system_server)
01-10 16:57:26.870523   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.871004   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:26.871638   546   656 D MtkOmxVenc: [0xe985d800] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 16:57:26.871786  1339  1339 V PhoneWindow: DecorView setVisiblity: visibility = 0, Parent = ViewRoot{f8f656a com.android.settings/com.android.settings.FallbackHome,ident = 0}, this = DecorView@37d420c[FallbackHome]
01-10 16:57:26.872890   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.873143   537   676 W OMXUtils: do not know color format 0x6 = 6
01-10 16:57:26.873555   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.873724   537   676 W OMXUtils: do not know color format 0xb = 11
01-10 16:57:26.874145   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.874247   537   676 W OMXUtils: do not know color format 0x10 = 16
01-10 16:57:26.874686   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.874808   537   676 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 16:57:26.875197   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.875288   537   676 W OMXUtils: do not know color format 0xf = 15
01-10 16:57:26.875379   546   656 D MtkOmxVenc: [0xe985d800] uGetIsNoTHWSolution0
01-10 16:57:26.875774   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.876755   546   656 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 16:57:26.876952   546   656 D MtkOmxVenc: [0xe985d800] +MtkOmxVenc::ComponentDeInit
01-10 16:57:26.877049   546  1399 D MtkOmxVenc: [0xe985d800] MtkOmxVencEncodeThread terminated pVenc=0xE985D800
01-10 16:57:26.877238   546  1400 D MtkOmxVenc: [0xe985d800] MtkOmxVencConvertThread terminated pVenc=0xE985D800
01-10 16:57:26.877350   546  1398 D MtkOmxVenc: [0xe985d800] MtkOmxVencThread terminated
01-10 16:57:26.877835   546   656 D MtkOmxVenc: [0xe985d800] -MtkOmxVenc::ComponentDeInit
01-10 16:57:26.877921   546   656 D MtkOmxVenc: [0xe985d800] ~MtkOmxVenc this= 0xE985D800
01-10 16:57:26.878176   546   656 D PQ      : [PQ][PQSessionManager] PQSessionManager()... 
01-10 16:57:26.878301   546   656 D PQ      : [PQ][PQSessionManager] m_PQSupport = 2 
01-10 16:57:26.878491   546  1401 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.881297   987  1324 I SurfaceFactory: [static] sSurfaceFactory = com.mediatek.view.impl.SurfaceFactoryImpl@68e85e0
01-10 16:57:26.882051   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.882710   546   656 I OMXMaster: makeComponentInstance(OMX.google.h264.encoder) in omx@1.0-service process
01-10 16:57:26.885861  1281  1281 D ImsConfigStorage: ImsConfigStorage() on phone 0
01-10 16:57:26.889350   401   401 I BufferQueue: [unnamed-401-2](this:0x740443e800,id:2,api:0,p:-1,c:-1) BufferQueue core=(401:/system/bin/surfaceflinger)
01-10 16:57:26.889658   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.889682   401   401 W GuiExt  : Cannot find GuiExtService
01-10 16:57:26.889859   401   401 I BufferQueueConsumer: [unnamed-401-2](this:0x740443e800,id:2,api:0,p:-1,c:401) connect(C): consumer=(401:/system/bin/surfaceflinger) controlledByApp=false
01-10 16:57:26.889932   401   401 I BufferQueueConsumer: [unnamed-401-2](this:0x740443e800,id:2,api:0,p:-1,c:401) setConsumerName: unnamed-401-2
01-10 16:57:26.889981   401   401 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x740443e800,id:2,api:0,p:-1,c:401) setConsumerName: com.android.settings/com.android.settings.FallbackHome#0
01-10 16:57:26.890036   401   401 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x740443e800,id:2,api:0,p:-1,c:401) setDefaultBufferSize: width=720 height=1280
01-10 16:57:26.890900   537   676 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 16:57:26.894209  1297  1297 D CarrierProvider: onCreate
01-10 16:57:26.896899   789   925 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 16:57:26.897087   789   925 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 16:57:26.897151   789   925 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 16:57:26.897992  1339  1339 D Surface : Surface::allocateBuffers(this=0x73c8993000)
01-10 16:57:26.905192   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.906348   523   549 D AAL     : 01-10 04:57:26.697 BL= 381,ESS= 256, 01-10 04:57:26.735 BL= 382,ESS= 256, 01-10 04:57:26.792 BL= 383,ESS= 256, 01-10 04:57:26.830 BL= 384,ESS= 256, 01-10 04:57:26.906 BL= 385,ESS= 256, 
01-10 16:57:26.907213   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.907775  1339  1405 I zygote64: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 16:57:26.907953   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.H263) in omx@1.0-service process
01-10 16:57:26.908068  1339  1405 I OpenGLRenderer: Initialized EGL, version 1.4
01-10 16:57:26.908184  1339  1405 D OpenGLRenderer: Swap behavior 2
01-10 16:57:26.919502   546   656 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::MtkOmxVenc this= 0xE985D800
01-10 16:57:26.920005   546   656 D MtkOmxVenc: [0xe985d800] dump flag=0x0
01-10 16:57:26.920123   546   656 D MtkOmxVenc: [0xe985d800] MtkOmxComponentCreate mCompHandle(0xE985D804)
01-10 16:57:26.920154   546   656 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.H263)
01-10 16:57:26.921998  1339  1405 D OpenGLRenderer: [init] completed
01-10 16:57:26.922075  1339  1405 D HWUIExtension: MTKProgramCache.init: enable enhancement 1
01-10 16:57:26.922203  1339  1405 I HWUIExtension: Get disable program binary service property (0)
01-10 16:57:26.922229  1339  1405 I HWUIExtension: Initializing program atlas...
01-10 16:57:26.922576   546   656 E MtkOmxVenc: [0xe985d800] [ERROR] Unsupported H263 Level
01-10 16:57:26.923181  1339  1405 I ProgramBinary/Service: ProgramBinaryService client side disable debugging.
01-10 16:57:26.923273  1339  1405 I ProgramBinary/Service: ProgramBinaryService client side disable binary content debugging.
01-10 16:57:26.923289  1339  1405 D ProgramBinary/Service: BpProgramBinaryService.getReady
01-10 16:57:26.923312  1339  1405 D ProgramBinary/Service: zhiyin- 1 BpProgramBinaryService::getReady()
01-10 16:57:26.923516   571   571 D ProgramBinary/Service: zhiyin- ontransact 1 code 1
01-10 16:57:26.923607   571   571 D ProgramBinary/Service: zhiyin- ontransact 2 code 1
01-10 16:57:26.923628   571   571 D ProgramBinary/Service: zhiyin- ontransact 3 code 1
01-10 16:57:26.923772  1339  1405 D ProgramBinary/Service: zhiyin- 2 BpProgramBinaryService::getReady()
01-10 16:57:26.923815  1339  1405 D ProgramBinary/Service: BpProgramBinaryService.getProgramBinaryData
01-10 16:57:26.923904   571   571 D ProgramBinary/Service: zhiyin- ontransact 1 code 3
01-10 16:57:26.924277  1339  1405 I HWUIExtension: Program binary detail: Binary length is 188172, program map length is 104.
01-10 16:57:26.924441  1339  1405 I HWUIExtension: Succeeded to mmap program binaries. File descriptor is 66, and path is /dev/ashmem.
01-10 16:57:26.924502  1339  1405 I HWUIExtension: No need to use file discriptor anymore, close fd(66).
01-10 16:57:26.924687  1339  1405 D HWUIExtension: Dumper init 4 threads <0x73cb5fa6c0>
01-10 16:57:26.924862  1339  1405 D HWUIExtension: <com.android.settings> is running.
01-10 16:57:26.924938  1339  1405 D HWUIExtension: Initializing program cache from 0x0, size = -1
01-10 16:57:26.925560  1339  1405 D Surface : Surface::connect(this=0x73c8993000,api=1)
01-10 16:57:26.926252   401   580 I BufferQueueProducer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x740443e800,id:2,api:1,p:1339,c:401) connect(P): api=1 producer=(1339:com.android.settings) producerControlledByApp=true
01-10 16:57:26.926310   546   656 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 16:57:26.926356   546   656 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 16:57:26.926379   546   656 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 16:57:26.926401   546   656 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 16:57:26.926423   546   656 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 16:57:26.926447   546   656 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 16:57:26.926470   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.926662   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:26.927053   546  1424 D MtkOmxVenc: [0xe985d800] MtkOmxVencThread created pVenc=0xE985D800
01-10 16:57:26.927212   546  1425 D MtkOmxVenc: [0xe985d800] MtkOmxVencEncodeThread created pVenc=0xE985D800, tid=1425
01-10 16:57:26.927274   546  1426 D MtkOmxVenc: [0xe985d800] MtkOmxVencConvertThread created pVenc=0xE985D800, tid=1426
01-10 16:57:26.927859   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.928234  1339  1405 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 16:57:26.929116   537   676 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 16:57:26.931718   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.934736   546   656 D MtkOmxVenc: [0xe985d800] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 16:57:26.935663   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.935880   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:26.936220   546   656 D MtkOmxVenc: [0xe985d800] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 16:57:26.936605   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.936827   537   676 W OMXUtils: do not know color format 0x6 = 6
01-10 16:57:26.937660   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.939109   537   676 W OMXUtils: do not know color format 0xb = 11
01-10 16:57:26.939243  1281  1281 D ImsConfigProvider: getSimState() for checking whether broadcast phoneId: 0, Sim state: null
01-10 16:57:26.939451  1281  1281 D ImsConfigStorage: updateFeature: VoLTE initial value:1 for phoneId:0
01-10 16:57:26.939538   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.939656   537   676 W OMXUtils: do not know color format 0x10 = 16
01-10 16:57:26.939901   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.939970   537   676 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 16:57:26.940237   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.940314   537   676 W OMXUtils: do not know color format 0xf = 15
01-10 16:57:26.940731   546   656 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 16:57:26.940877   546   656 D MtkOmxVenc: [0xe985d800] +MtkOmxVenc::ComponentDeInit
01-10 16:57:26.940962   546  1426 D MtkOmxVenc: [0xe985d800] MtkOmxVencConvertThread terminated pVenc=0xE985D800
01-10 16:57:26.940962   546  1425 D MtkOmxVenc: [0xe985d800] MtkOmxVencEncodeThread terminated pVenc=0xE985D800
01-10 16:57:26.941173   546  1424 D MtkOmxVenc: [0xe985d800] MtkOmxVencThread terminated
01-10 16:57:26.941268   546   656 D MtkOmxVenc: [0xe985d800] -MtkOmxVenc::ComponentDeInit
01-10 16:57:26.941301   546   656 D MtkOmxVenc: [0xe985d800] ~MtkOmxVenc this= 0xE985D800
01-10 16:57:26.941498   546  1427 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:26.944526   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.944952   546   656 I OMXMaster: makeComponentInstance(OMX.google.h263.encoder) in omx@1.0-service process
01-10 16:57:26.950736   546   656 I SoftMPEG4Encoder: Construct SoftMPEG4Encoder
01-10 16:57:26.952494  1297  1297 I ImsResolver: Initializing cache and binding.
01-10 16:57:26.953046   397   414 I vendor.mediatek.hardware.power@1.1-impl: PowerHint hint:8, data:0
01-10 16:57:26.953371  1281  1281 D ImsConfigProvider: getSimState() for checking whether broadcast phoneId: 0, Sim state: null
01-10 16:57:26.953576  1281  1281 D ImsConfigStorage: updateFeature: ViLTE initial value:0 for phoneId:0
01-10 16:57:26.955481   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.957487   537   676 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 16:57:26.958854   546   656 E OMXNodeInstance: getConfig(0xe982aa80:google.h263.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
01-10 16:57:26.961175   987  1010 I ActivityManager: Displayed com.android.settings/.FallbackHome: +338ms
01-10 16:57:26.962120   397   413 I libPerfService: 10: legacy set freq: -1 -1 -1 -1
01-10 16:57:26.963198   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:26.964298   546   656 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.HEVC) in omx@1.0-service process
01-10 16:57:26.965523   987  1079 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 16:57:26.966736   546   656 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::MtkOmxVenc this= 0xE985D800
01-10 16:57:26.967614   546   656 D MtkOmxVenc: [0xe985d800] dump flag=0x0
01-10 16:57:26.967729   546   656 D MtkOmxVenc: [0xe985d800] MtkOmxComponentCreate mCompHandle(0xE985D804)
01-10 16:57:26.967766   546   656 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.HEVC)
01-10 16:57:26.967808   546   656 E MtkOmxVenc: [0xe985d800] bufk = 0
01-10 16:57:26.967835   546   656 D MtkOmxVenc: [0xe985d800] uIsHEVCSWPlatform 0
01-10 16:57:26.968288   546   656 D MtkOmxVenc: [0xe985d800] uIsHEVCSWPlatform 0
01-10 16:57:26.973112  1131  1317 I vol.Events: writeEvent level_changed STREAM_VOICE_CALL 4
01-10 16:57:26.974249   546  1433 D MtkOmxVenc: [0xe985d800] MtkOmxVencEncodeThread created pVenc=0xE985D800, tid=1433
01-10 16:57:26.974789   546  1434 D MtkOmxVenc: [0xe985d800] MtkOmxVencConvertThread created pVenc=0xE985D800, tid=1434
01-10 16:57:26.975276   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:26.976587  1281  1281 D ImsConfigProvider: getSimState() for checking whether broadcast phoneId: 0, Sim state: null
01-10 16:57:26.976802  1281  1281 D ImsConfigStorage: updateFeature: VoWIFI initial value:0 for phoneId:0
01-10 16:57:26.976966  1131  1317 I vol.Events: writeEvent level_changed STREAM_SYSTEM 15
01-10 16:57:26.978007  1131  1317 I vol.Events: writeEvent mute_changed STREAM_SYSTEM true
01-10 16:57:26.980385  1131  1317 I vol.Events: writeEvent level_changed STREAM_RING 15
01-10 16:57:26.981419  1131  1317 I vol.Events: writeEvent mute_changed STREAM_RING true
01-10 16:57:26.981420   987   987 D RttService: SCAN_AVAILABLE : 1
01-10 16:57:26.981419   987  1094 I WifiScanningService: wifi driver unloaded
01-10 16:57:26.981814   987  1095 D RttService: DefaultState got{ when=0 what=160513 target=com.android.internal.util.StateMachine$SmHandler }
01-10 16:57:26.982890  1131  1317 I vol.Events: writeEvent level_changed STREAM_MUSIC 13
01-10 16:57:26.983428   546  1432 D MtkOmxVenc: [0xe985d800] MtkOmxVencThread created pVenc=0xE985D800
01-10 16:57:26.985193   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 16:57:26.985284   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 16:57:26.985310   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 16:57:26.985334   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 16:57:26.985359   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 16:57:26.985385   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 16:57:26.985411   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.985626   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:26.986144   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.986280   537   676 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 16:57:26.986682   546  1290 D MtkOmxVenc: [0xe985d800] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 16:57:26.987270   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.987450   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:26.987776   546  1290 D MtkOmxVenc: [0xe985d800] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 16:57:26.988256   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.988417   537   676 W OMXUtils: do not know color format 0x6 = 6
01-10 16:57:26.989501   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.989893   537   676 W OMXUtils: do not know color format 0xb = 11
01-10 16:57:26.991002   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.991327   537   676 W OMXUtils: do not know color format 0x10 = 16
01-10 16:57:26.991706   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:26.992323  1131  1317 I vol.Events: writeEvent level_changed STREAM_ALARM 8
01-10 16:57:26.993040  1297  1297 I zygote64: Looking for service android.hardware.radio.deprecated@1.0::IOemHook/slot1
01-10 16:57:26.995855  1297  1297 I zygote64: Starting thread pool.
01-10 16:57:26.996630  1131  1317 I vol.Events: writeEvent level_changed STREAM_BLUETOOTH_SCO 7
01-10 16:57:26.998489   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.998783   537   676 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 16:57:26.999372   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:26.999484   537   676 W OMXUtils: do not know color format 0xf = 15
01-10 16:57:26.999787   546  1290 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 16:57:26.999983   546  1290 D MtkOmxVenc: [0xe985d800] +MtkOmxVenc::ComponentDeInit
01-10 16:57:27.000116   546  1434 D MtkOmxVenc: [0xe985d800] MtkOmxVencConvertThread terminated pVenc=0xE985D800
01-10 16:57:27.000129   546  1433 D MtkOmxVenc: [0xe985d800] MtkOmxVencEncodeThread terminated pVenc=0xE985D800
01-10 16:57:27.000183   546  1432 D MtkOmxVenc: [0xe985d800] MtkOmxVencThread terminated
01-10 16:57:27.000812   546  1290 D MtkOmxVenc: [0xe985d800] -MtkOmxVenc::ComponentDeInit
01-10 16:57:27.000873   546  1290 D MtkOmxVenc: [0xe985d800] ~MtkOmxVenc this= 0xE985D800
01-10 16:57:27.001373   546  1435 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:27.004479   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:27.004888   546  1290 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.MPEG4) in omx@1.0-service process
01-10 16:57:27.007589   546  1290 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::MtkOmxVenc this= 0xE985D800
01-10 16:57:27.008865   546  1290 D MtkOmxVenc: [0xe985d800] dump flag=0x0
01-10 16:57:27.009070   546  1290 D MtkOmxVenc: [0xe985d800] MtkOmxComponentCreate mCompHandle(0xE985D804)
01-10 16:57:27.009110   546  1290 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.MPEG4)
01-10 16:57:27.009288   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:30.834787,dur:1005.36,max:87.79,min:1.90
01-10 16:57:27.009996   546  1444 D MtkOmxVenc: [0xe985d800] MtkOmxVencConvertThread created pVenc=0xE985D800, tid=1444
01-10 16:57:27.012721   401   421 I SurfaceFlinger: EventThread Client Pid (1131) created
01-10 16:57:27.013229   546  1443 D MtkOmxVenc: [0xe985d800] MtkOmxVencEncodeThread created pVenc=0xE985D800, tid=1443
01-10 16:57:27.013686   401   421 I SurfaceFlinger: EventThread Client Pid (1131) created
01-10 16:57:27.015841   546  1290 E MtkOmxVenc: [0xe985d800] QueryVideoProfileLevel(1) fail, profile(16384)/level(16)
01-10 16:57:27.015890   546  1442 D MtkOmxVenc: [0xe985d800] MtkOmxVencThread created pVenc=0xE985D800
01-10 16:57:27.016318   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 16:57:27.016385   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 16:57:27.016412   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 16:57:27.016435   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 16:57:27.016460   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 16:57:27.016487   546  1290 E MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 16:57:27.016520   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.016701   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:27.017098   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.017669   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.017974   537   676 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 16:57:27.017959   537  1274 E DrmMtkUtil/DrmUtil: checkDcf: not dcf type, dcf version value [79]
01-10 16:57:27.018105   537  1274 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 16:57:27.018149   537  1274 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:
01-10 16:57:27.018751   537  1274 D NuPlayerDriver: NuPlayerDriver(0xef5af540) created, clientPid(987)
01-10 16:57:27.019602   546  1290 D MtkOmxVenc: [0xe985d800] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 16:57:27.019756  1281  1281 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:27.019879  1281  1281 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:27.020112  1281  1281 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:27.020112  1281  1281 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP08_null_null:OP08Ims.apk:com.mediatek.op08.ims.Op08ImsServiceCustomizationFactory:com.mediatek.op08.ims)
01-10 16:57:27.020112  1281  1281 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP18_null_null:OP18Ims.jar:com.mediatek.op18.ims.Op18ImsServiceCustomizationFactory:null)
01-10 16:57:27.020112  1281  1281 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP12_null_null:OP12Ims.apk:com.mediatek.op12.ims.Op12ImsServiceCustomizationFactory:com.mediatek.op12.ims)
01-10 16:57:27.020112  1281  1281 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP112_null_null:OP112Ims.apk:com.mediatek.op112.ims.Op112ImsServiceCustomizationFactory:com.mediatek.op112.ims)
01-10 16:57:27.020783   987   996 I zygote64: Background concurrent copying GC freed 92219(4MB) AllocSpace objects, 18(632KB) LOS objects, 42% free, 8MB/14MB, paused 317us total 206.839ms
01-10 16:57:27.021990   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.022225   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:27.024132   546  1290 D MtkOmxVenc: [0xe985d800] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 16:57:27.024824   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.025467  1131  1131 I SurfaceFactory: [static] sSurfaceFactory = com.mediatek.view.impl.SurfaceFactoryImpl@7606f37
01-10 16:57:27.026038   537   676 W OMXUtils: do not know color format 0x6 = 6
01-10 16:57:27.026648   546  1290 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.027117   537   676 W OMXUtils: do not know color format 0xb = 11
01-10 16:57:27.028901  1281  1281 D ImsVT Util: multiIMSSupportNum:1
01-10 16:57:27.029153  1281  1281 D ImsVT Util: Getprop [persist.mtk.vilte.enable][0]=false
01-10 16:57:27.029417  1281  1281 D ImsVT Util: Getprop [persist.mtk.viwifi.enable][0]=false
01-10 16:57:27.029474   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.029635   537   676 W OMXUtils: do not know color format 0x10 = 16
01-10 16:57:27.030087  1281  1448 D ImsVT Util: setContextAndInitRefVTPInternal(), context =com.mediatek.ims.ImsApp@fc49e4f
01-10 16:57:27.030100   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.030253   537   676 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 16:57:27.030276  1131  1131 D WindowClient: Add to mViews: com.android.systemui.stackdivider.DividerView{dba2dc2 I.E...... ......I. 0,0-0,0}, this = android.view.WindowManagerGlobal@842c7d3
01-10 16:57:27.030773   546   656 E OMXNodeInstance: getParameter(0xe985d804:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.031007   537   676 W OMXUtils: do not know color format 0xf = 15
01-10 16:57:27.031281  1281  1448 D VT SRC  : [STC] [setContext] context:com.mediatek.ims.ImsApp@fc49e4f
01-10 16:57:27.031436   546   656 D MtkOmxVenc: [0xe985d800] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 16:57:27.031594   546   656 D MtkOmxVenc: [0xe985d800] +MtkOmxVenc::ComponentDeInit
01-10 16:57:27.031706   546  1443 D MtkOmxVenc: [0xe985d800] MtkOmxVencEncodeThread terminated pVenc=0xE985D800
01-10 16:57:27.031733   546  1442 D MtkOmxVenc: [0xe985d800] MtkOmxVencThread terminated
01-10 16:57:27.031713  1281  1448 D ImsVT Util: setContextAndInitRefVTP, register FeatureValueReceiver
01-10 16:57:27.031886   546  1444 D MtkOmxVenc: [0xe985d800] MtkOmxVencConvertThread terminated pVenc=0xE985D800
01-10 16:57:27.031986  1131  1131 D OpenGLRenderer: Dumper init 4 threads <0x73ba094640>
01-10 16:57:27.032054   546   656 D MtkOmxVenc: [0xe985d800] -MtkOmxVenc::ComponentDeInit
01-10 16:57:27.032078   546   656 D MtkOmxVenc: [0xe985d800] ~MtkOmxVenc this= 0xE985D800
01-10 16:57:27.032262  1131  1131 D OpenGLRenderer: <com.android.systemui> is running.
01-10 16:57:27.032318   546  1445 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:27.032512   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.034386  1281  1448 D ImsVT Util: setContextAndInitRefVTP, register SimStateReceiver
01-10 16:57:27.035612   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:27.036174   546   656 I OMXMaster: makeComponentInstance(OMX.google.mpeg4.encoder) in omx@1.0-service process
01-10 16:57:27.037060   537  1450 D GenericSource: FileSource remote
01-10 16:57:27.037559   530   856 I VT      : [VTS] gVTSClient == NULL
01-10 16:57:27.037711   546   656 I SoftMPEG4Encoder: Construct SoftMPEG4Encoder
01-10 16:57:27.040134   401   421 I SurfaceFlinger: EventThread Client Pid (1131) created
01-10 16:57:27.040531   537   676 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 16:57:27.040900  1131  1451 D OpenGLRenderer: HWUI GL Pipeline
01-10 16:57:27.040913   546  1290 E OMXNodeInstance: getConfig(0xe982aa80:google.mpeg4.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
01-10 16:57:27.043493  1281  1448 D ImsVT Util: setContextAndInitRefVTPInternal(), ViLTE on, do natvie init
01-10 16:57:27.044231   535   668 V APEExtractor: getAPEInfo not ape 20482
01-10 16:57:27.044405   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:27.044440   535   668 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.045190   546  1290 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.VPX) in omx@1.0-service process
01-10 16:57:27.046654  1131  1131 D ViewRootImpl[DockedStackDivider]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 16:57:27.047157  1297  1297 I zygote64: Looking for service vendor.mediatek.hardware.radio@2.0::IRadio/slot1
01-10 16:57:27.048036  1281  1281 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:27.048098   546  1290 D MtkOmxVenc: [0xe985e400] MtkOmxVenc::MtkOmxVenc this= 0xE985E400
01-10 16:57:27.048621   546  1290 D MtkOmxVenc: [0xe985e400] dump flag=0x0
01-10 16:57:27.048695  1297  1297 I zygote64: Starting thread pool.
01-10 16:57:27.048765   546  1290 D MtkOmxVenc: [0xe985e400] MtkOmxComponentCreate mCompHandle(0xE985E404)
01-10 16:57:27.048802   546  1290 D MtkOmxVenc: [0xe985e400] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.VPX)
01-10 16:57:27.048861   546  1290 E MtkOmxVenc: [0xe985e400] bufk = 0
01-10 16:57:27.049162   546  1454 D MtkOmxVenc: [0xe985e400] MtkOmxVencThread created pVenc=0xE985E400
01-10 16:57:27.049262   546  1455 D MtkOmxVenc: [0xe985e400] MtkOmxVencEncodeThread created pVenc=0xE985E400, tid=1455
01-10 16:57:27.049311   546  1456 D MtkOmxVenc: [0xe985e400] MtkOmxVencConvertThread created pVenc=0xE985E400, tid=1456
01-10 16:57:27.049392   537  1447 D NuPlayerDriver: notifyListener_l(0xef5af540), (1, 0, 0, -1), loop setting(0, 0)
01-10 16:57:27.052239   546   656 E MtkOmxVenc: [0xe985e400] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 16:57:27.052262   401   421 I SurfaceFlinger: [SF client] NEW(0x740b228180) for (987:system_server)
01-10 16:57:27.052319   546   656 E MtkOmxVenc: [0xe985e400] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 16:57:27.052343   546   656 E MtkOmxVenc: [0xe985e400] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 16:57:27.052367   546   656 E MtkOmxVenc: [0xe985e400] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 16:57:27.052389   546   656 E MtkOmxVenc: [0xe985e400] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 16:57:27.052414   546   656 E MtkOmxVenc: [0xe985e400] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 16:57:27.052439   546   656 E OMXNodeInstance: getParameter(0xe985e404:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.052654   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:27.053231   546   656 E OMXNodeInstance: getParameter(0xe985e404:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.053368   537   676 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 16:57:27.053689   546   656 D MtkOmxVenc: [0xe985e400] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 16:57:27.053732   987   987 D Ringtone: Successfully created local player
01-10 16:57:27.053831   987   987 W Ringtone: Use of stream types is deprecated for operations other than volume control
01-10 16:57:27.053858   987   987 W Ringtone: See the documentation of setStreamType() for what to use instead with android.media.AudioAttributes to qualify your playback use case
01-10 16:57:27.054154   546   656 E OMXNodeInstance: getParameter(0xe985e404:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.054279   537  1268 D NuPlayerDriver: reset(0xef5af540) at state 4
01-10 16:57:27.054314   537   676 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 16:57:27.054419   537  1268 D NuPlayerDriver: notifyListener_l(0xef5af540), (8, 0, 0, -1), loop setting(0, 0)
01-10 16:57:27.054525   537  1268 D GenericSource: disconnect: mDataSource 0xed9f6640 mHttpSource 0x0
01-10 16:57:27.054992   546   656 D MtkOmxVenc: [0xe985e400] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 16:57:27.055274   537  1447 D NuPlayerDriver: notifyResetComplete(0xef5af540)
01-10 16:57:27.055668   537  1268 D NuPlayerDriver: reset(0xef5af540) at state 0
01-10 16:57:27.055641   546   656 E OMXNodeInstance: getParameter(0xe985e404:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.055955   537   676 W OMXUtils: do not know color format 0x6 = 6
01-10 16:57:27.056698   546   656 E OMXNodeInstance: getParameter(0xe985e404:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.056988   537   676 W OMXUtils: do not know color format 0xb = 11
01-10 16:57:27.057767   987   987 V MediaPlayer: resetDrmState:  mDrmInfo=null mDrmProvisioningThread=null mPrepareDrmInProgress=false mActiveDrmScheme=false
01-10 16:57:27.057849   987   987 V MediaPlayer: cleanDrmObj: mDrmObj=null mDrmSessionId=null
01-10 16:57:27.058365   987   987 V MediaPlayer: resetDrmState:  mDrmInfo=null mDrmProvisioningThread=null mPrepareDrmInProgress=false mActiveDrmScheme=false
01-10 16:57:27.058417   987   987 V MediaPlayer: cleanDrmObj: mDrmObj=null mDrmSessionId=null
01-10 16:57:27.058632   546   656 E OMXNodeInstance: getParameter(0xe985e404:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.059449   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.061253   537  1268 E DrmMtkUtil/DrmUtil: checkDcf: not dcf type, dcf version value [79]
01-10 16:57:27.061398   537  1268 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 16:57:27.061438   537  1268 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:
01-10 16:57:27.061531   537  1268 D NuPlayerDriver: NuPlayerDriver(0xef5af5b0) created, clientPid(987)
01-10 16:57:27.064572   537   676 W OMXUtils: do not know color format 0x10 = 16
01-10 16:57:27.065230   546  1290 E OMXNodeInstance: getParameter(0xe985e404:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.065376   537   676 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 16:57:27.065774   546  1290 E OMXNodeInstance: getParameter(0xe985e404:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 16:57:27.066659   537   676 W OMXUtils: do not know color format 0xf = 15
01-10 16:57:27.067433   546  1290 D MtkOmxVenc: [0xe985e400] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 16:57:27.067599   546  1290 D MtkOmxVenc: [0xe985e400] +MtkOmxVenc::ComponentDeInit
01-10 16:57:27.067670   546  1455 D MtkOmxVenc: [0xe985e400] MtkOmxVencEncodeThread terminated pVenc=0xE985E400
01-10 16:57:27.067691   546  1456 D MtkOmxVenc: [0xe985e400] MtkOmxVencConvertThread terminated pVenc=0xE985E400
01-10 16:57:27.067718   546  1454 D MtkOmxVenc: [0xe985e400] MtkOmxVencThread terminated
01-10 16:57:27.068079   546  1290 D MtkOmxVenc: [0xe985e400] -MtkOmxVenc::ComponentDeInit
01-10 16:57:27.068129   546  1290 D MtkOmxVenc: [0xe985e400] ~MtkOmxVenc this= 0xE985E400
01-10 16:57:27.068346   546  1457 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 16:57:27.069787   537  1462 D GenericSource: FileSource remote
01-10 16:57:27.071740   537   676 I OMXClient: Treble IOmx obtained
01-10 16:57:27.073173   546  1290 I OMXMaster: makeComponentInstance(OMX.google.vp8.encoder) in omx@1.0-service process
01-10 16:57:27.074127  1297  1297 W System.err: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 16:57:27.074541  1297  1297 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 16:57:27.074596  1297  1297 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 16:57:27.074610  1297  1297 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 16:57:27.074630  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.getRilOp(MtkRIL.java:467)
01-10 16:57:27.074643  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.<init>(MtkRIL.java:377)
01-10 16:57:27.074658  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkTelephonyComponentFactory.makeRil(MtkTelephonyComponentFactory.java:188)
01-10 16:57:27.074674  1297  1297 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhone(PhoneFactory.java:206)
01-10 16:57:27.074693  1297  1297 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhones(PhoneFactory.java:131)
01-10 16:57:27.074707  1297  1297 W System.err: 	at com.android.phone.PhoneGlobals.onCreate(PhoneGlobals.java:370)
01-10 16:57:27.074719  1297  1297 W System.err: 	at com.android.phone.PhoneApp.onCreate(PhoneApp.java:43)
01-10 16:57:27.074733  1297  1297 W System.err: 	at android.app.Instrumentation.callApplicationOnCreate(Instrumentation.java:1119)
01-10 16:57:27.074750  1297  1297 W System.err: 	at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5781)
01-10 16:57:27.074766  1297  1297 W System.err: 	at android.app.ActivityThread.-wrap1(Unknown Source:0)
01-10 16:57:27.074779  1297  1297 W System.err: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1690)
01-10 16:57:27.074792  1297  1297 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 16:57:27.074803  1297  1297 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 16:57:27.074816  1297  1297 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 16:57:27.074831  1297  1297 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 16:57:27.074844  1297  1297 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 16:57:27.074858  1297  1297 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 16:57:27.074860   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.075221  1297  1297 W System.err: Caused by: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 16:57:27.075264  1297  1297 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 16:57:27.075286  1297  1297 W System.err: 	at java.lang.BootClassLoader.findClass(ClassLoader.java:1355)
01-10 16:57:27.075308  1297  1297 W System.err: 	at java.lang.BootClassLoader.loadClass(ClassLoader.java:1415)
01-10 16:57:27.075322  1297  1297 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 16:57:27.075334  1297  1297 W System.err: 	... 20 more
01-10 16:57:27.075413  1297  1297 W System.err: Caused by: java.lang.NoClassDefFoundError: Class not found using the boot class loader; no stack trace available
01-10 16:57:27.075999  1195  1195 E DrmMtkUtil/SecureTimer: open proc/uptime failed: [Permission denied].
01-10 16:57:27.077358   987  1213 I WifiService: getVerboseLoggingLevel uid=10021
01-10 16:57:27.081229   535   535 V APEExtractor: getAPEInfo not ape 20482
01-10 16:57:27.081338   535   535 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.074000  1195  1195 W main    : type=1400 audit(0.0:45): avc: denied { open } for path="/proc/uptime" dev="proc" ino=4026532104 scontext=u:r:webview_zygote:s0 tcontext=u:object_r:proc:s0 tclass=file permissive=0
01-10 16:57:27.086208   537  1461 D NuPlayerDriver: notifyListener_l(0xef5af5b0), (1, 0, 0, -1), loop setting(0, 0)
01-10 16:57:27.088970  1281  1448 I VT      : [JNI] Entering InitRefVTP
01-10 16:57:27.089021  1281  1448 I VT      : [JNI] Entering native_init
01-10 16:57:27.089196  1281  1448 E VT      : [JNI] native_init (g_client == 0)
01-10 16:57:27.089256  1281  1448 I VT      : [VTC] before getVTService
01-10 16:57:27.089666   987   987 D Ringtone: Successfully created local player
01-10 16:57:27.090886   987  1324 I WifiService: getWifiServiceMessenger uid=10021
01-10 16:57:27.093477   537   676 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 16:57:27.094582   546  1290 E OMXNodeInstance: getConfig(0xe982aa80:google.vp8.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
01-10 16:57:27.095051  1281  1448 I VT      : [VTC] after getVTService
01-10 16:57:27.095095  1281  1448 I VT      : [VTC] Add DeathNotifier
01-10 16:57:27.096520   987  1008 W TelecomManager: Telecom Service not found.
01-10 16:57:27.096676   530   861 I ServiceManager: Waiting for service phone...
01-10 16:57:27.098952   987  1008 W TelecomManager: Telecom Service not found.
01-10 16:57:27.100045  1281  1281 D WfoService: onCreate()
01-10 16:57:27.100271  1281  1281 D WfoService: WfoService new MWIService
01-10 16:57:27.101226   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.102520   987  1153 I OMXClient: Treble IOmx obtained
01-10 16:57:27.103206   546  1290 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 16:57:27.103505  1195  1195 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base_mtk.so absent, libpq_cust_mtk.so absent
01-10 16:57:27.104247  1195  1195 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 16:57:27.104297  1131  1265 I OMXClient: Treble IOmx obtained
01-10 16:57:27.104827  1195  1195 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 16:57:27.104936   546  1290 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 16:57:27.104958  1195  1195 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 16:57:27.105334   987  1153 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x73b2228800
01-10 16:57:27.105396  1195  1195 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 16:57:27.105943   546   656 E OMXNodeInstance: getConfig(0xe982aa80:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 16:57:27.107378  1131  1265 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x73d3a82c00
01-10 16:57:27.108146   546  1290 E OMXNodeInstance: getConfig(0xe982ae40:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 16:57:27.109516  1131  1131 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:27.109593  1131  1131 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:27.109685   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.109972  1131  1131 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:27.109972  1131  1131 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP03_null_SEGDEFAULT:OP03SystemUI.apk:com.mediatek.op03.systemui.Op03SystemUICustomizationFactory:com.mediatek.op03.systemui)
01-10 16:57:27.109972  1131  1131 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07SystemUI.apk:com.mediatek.op07.systemui.OP07SystemUICustomizationFactory:com.mediatek.op07.systemui)
01-10 16:57:27.109972  1131  1131 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP18_null_SEGDEFAULT:OP18SystemUI.apk:com.mediatek.op18.systemui.Op18SystemUICustomizationFactory:com.mediatek.op18.systemui)
01-10 16:57:27.109972  1131  1131 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP01_null_null:OP01SystemUI.apk:com.mediatek.systemui.op01.Op01SystemUICustomizationFactory:com.mediatek.systemui.op01)
01-10 16:57:27.109972  1131  1131 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP02_null_null:OP02SystemUI.apk:com.mediatek.systemui.op02.Op02SystemUICustomizationFactory:com.mediatek.systemui.op02)
01-10 16:57:27.109972  1131  1131 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09SystemUI.apk:com.mediatek.systemui.op09.Op09SystemUICustomizationFactory:com.mediatek.systemui.op09)
01-10 16:57:27.109972  1131  1131 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP09_null_SEGC:OP09ClipSystemUI.apk:com.mediatek.systemui.op09clip.Op09SystemUICustomizationFactory:com.mediatek.systemui.op09clip)
01-10 16:57:27.109972  1131  1131 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP08_null_null:OP08SystemUI.apk:com.mediatek.op08.systemui.Op08SystemUICustomizationFactory:com.mediatek.op08.systemui)
01-10 16:57:27.109972  1131  1131 E OperatorCustomizationFactoryLoader: 8: OperatorFactoryInfo(OP20_null_null:OP20SystemUI.apk:com.mediatek.op20.systemui.Op20SystemUICustomizationFactory:com.mediatek.op20.systemui)
01-10 16:57:27.110447   987   998 I WifiService: getWifiEnabledState uid=1001
01-10 16:57:27.111624  1281  1281 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 16:57:27.113639   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.119343   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:27.120155   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.126626   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 5 lines
01-10 16:57:27.127726   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.128146   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.129944   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.129925  1131  1371 D NetworkController: subscriptions is null
01-10 16:57:27.131656   523   549 D AAL     : 01-10 04:57:26.943 BL= 386,ESS= 256, 01-10 04:57:27.000 BL= 387,ESS= 256, 01-10 04:57:27.037 BL= 388,ESS= 256, 01-10 04:57:27.093 BL= 389,ESS= 256, 01-10 04:57:27.131 BL= 390,ESS= 256, 
01-10 16:57:27.132133   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.133225   987  1324 I WifiService: getWifiEnabledState uid=1001
01-10 16:57:27.136688   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.136705  1281  1281 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:27.136796  1281  1281 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:27.136959  1281  1281 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:27.136959  1281  1281 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP07_null_null:OP07Wos.apk:com.mediatek.op07.wfo.Op07WosCustomizationFactory:com.mediatek.op07.wfo)
01-10 16:57:27.136959  1281  1281 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP08_null_null:OP08Wos.apk:com.mediatek.op08.wfo.Op08WosCustomizationFactory:com.mediatek.op08.wfo)
01-10 16:57:27.137711  1281  1281 D DefaultWosExt: DefaultWosExt constructor
01-10 16:57:27.139871  1297  1297 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:27.140086  1297  1297 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:27.140365  1297  1297 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:27.140365  1297  1297 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP18_null_null:OP18Ims.jar:com.mediatek.op18.ims.Op18ImsCustomizationFactory:null)
01-10 16:57:27.140365  1297  1297 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP15_null_null:OP15Ims.jar:com.mediatek.op15.ims.Op15ImsCustomizationFactory:null)
01-10 16:57:27.141264   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.145735   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 6 lines
01-10 16:57:27.146865   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.151980   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.156991   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.160343   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 16:57:27.161263   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.161499  1281  1281 D WfoService: onStartCommand()
01-10 16:57:27.161634  1281  1281 D WfoService: Service starting for intent null
01-10 16:57:27.170497  1297  1477 D PowerSM : mDesiredModemPower: true mCurrentModemPower: true
01-10 16:57:27.170797  1281  1281 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 16:57:27.175651  1131  1131 D WindowClient: Add to mViews: com.android.systemui.assist.AssistOrbContainer{560dc40 G.E...... ......I. 0,0-0,0}, this = android.view.WindowManagerGlobal@842c7d3
01-10 16:57:27.176919  1281  1281 D WfoService: onStartCommand()
01-10 16:57:27.177064  1281  1281 D WfoService: Service starting for intent null
01-10 16:57:27.177183   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.178008   987  1143 V NuMediaExtractor: setDataSource fd=194 (/system/media/audio/ui/KeypressStandard.ogg), offset=0, length=5837
01-10 16:57:27.179808   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:27.180315   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:27.182508   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 16:57:27.182782   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 16:57:27.185979  1131  1131 D ViewRootImpl[AssistPreviewPanel]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 16:57:27.186134   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:27.186620   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:27.193968   535  1460 V APEExtractor: getAPEInfo not ape 20483
01-10 16:57:27.194128   535  1460 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.197781   987  1143 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 16:57:27.208306   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.208967   987  1484 I OMXClient: Treble IOmx obtained
01-10 16:57:27.209322   546  1159 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 16:57:27.211328   987  1484 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x73afeac000
01-10 16:57:27.211637  1297  1297 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:27.211676   987   987 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:27.211716   987   987 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:27.211716  1297  1297 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:27.211779   987   987 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:27.211779   987   987 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(null_null_null:OPTelecomCommon.apk:com.mediatek.op.telecom.CommonTelecomCustomizationFactory:com.mediatek.op.telecom)
01-10 16:57:27.211805   546  1159 E OMXNodeInstance: getConfig(0xe982ac60:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 16:57:27.211972  1297  1297 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:27.211972  1297  1297 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01Telephony.jar:com.mediatek.op01.telephony.Op01TelephonyCustomizationFactory:null)
01-10 16:57:27.211972  1297  1297 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02Telephony.jar:com.mediatek.op02.telephony.Op02TelephonyCustomizationFactory:null)
01-10 16:57:27.211972  1297  1297 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP08_null_null:OP08Telephony.jar:com.mediatek.op08.telephony.Op08TelephonyCustomizationFactory:null)
01-10 16:57:27.211972  1297  1297 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09ATelephony.jar:com.mediatek.op09a.telephony.Op09ATelephonyCustomizationFactory:null)
01-10 16:57:27.211972  1297  1297 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP09_null_SEGC:OP09CTelephony.jar:com.mediatek.op09c.telephony.Op09CTelephonyCustomizationFactory:null)
01-10 16:57:27.211972  1297  1297 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP12_null_null:OP12Telephony.jar:com.mediatek.op12.telephony.Op12TelephonyCustomizationFactory:null)
01-10 16:57:27.211972  1297  1297 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP07_null_null:OP07Telephony.jar:com.mediatek.op07.telephony.Op07TelephonyCustomizationFactory:null)
01-10 16:57:27.211972  1297  1297 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP18_null_null:OP18Telephony.jar:com.mediatek.op18.telephony.Op18TelephonyCustomizationFactory:null)
01-10 16:57:27.212012   987   987 I CommonTelecomCustomizationUtils: return default CommonTelecomCustomizationFactoryBase
01-10 16:57:27.214771   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.222591   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 6 lines
01-10 16:57:27.223337   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.228494  1131  1263 V NuMediaExtractor: setDataSource fd=45 (/system/media/audio/ui/Unlock.ogg), offset=0, length=7853
01-10 16:57:27.229655   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/1131/cmdline]
01-10 16:57:27.232704   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/1131/cmdline]
01-10 16:57:27.234155   531   560 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 16:57:27.234422   531   560 E installd: Failed to enable USRQUOTA on /dev/block/dm-2: File exists
01-10 16:57:27.234505   531   560 E installd: Failed to enable GRPQUOTA on /dev/block/dm-2: File exists
01-10 16:57:27.234531   531   560 D installd: Found storage mount /data/media at /mnt/runtime/default/emulated
01-10 16:57:27.235605  1297  1297 D @M_MtkDupSmsFilter: call constructor
01-10 16:57:27.237358   535  1460 V APEExtractor: getAPEInfo not ape 20482
01-10 16:57:27.237506   535  1460 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.238632   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.239601   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:27.240962  1131  1263 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 16:57:27.247027  1131  1492 I OMXClient: Treble IOmx obtained
01-10 16:57:27.247650   546  1159 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 16:57:27.248325   987   987 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:27.250111  1131  1492 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x73ba128400
01-10 16:57:27.251791   546  1159 E OMXNodeInstance: getConfig(0xe982acc0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 16:57:27.255572   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.257451   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 16:57:27.258513   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.258550   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.259793   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.263955   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 3 lines
01-10 16:57:27.264694   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.265787  1131  1131 D StatusBar: disable<e i a s b h r c s q >
01-10 16:57:27.275633   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.277675   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 16:57:27.281809   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.283034   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.288154   987  1143 V NuMediaExtractor: setDataSource fd=195 (/system/media/audio/ui/KeypressSpacebar.ogg), offset=0, length=5952
01-10 16:57:27.289160   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:27.289442   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:27.291196   987   987 E WiredAccessoryManager: No state change.
01-10 16:57:27.293149   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:27.293356   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:27.299504   535  1460 V APEExtractor: getAPEInfo not ape 20483
01-10 16:57:27.299640   535  1460 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.302029   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.305788   987  1079 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 16:57:27.308781  1297  1297 D IntentBroadcaster: Broadcasting and adding intent for rebroadcast: android.intent.action.SIM_STATE_CHANGED NOT_READY for slotId 0
01-10 16:57:27.308808   987  1143 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 16:57:27.310981  1339  1405 D Surface : Surface::disconnect(this=0x73c8993000,api=1)
01-10 16:57:27.311630   401   420 I BufferQueueProducer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x740443e800,id:2,api:1,p:1339,c:401) disconnect(P): api 1
01-10 16:57:27.312479   987  1067 D CTA_BootReceiverPolicy: initBootIntentFilterList() - add monitored intent = android.intent.action.BOOT_COMPLETED
01-10 16:57:27.312551   401   420 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x740443e800,id:2,api:1,p:-1,c:401) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 16:57:27.314572   987  1067 D Cta_ReceiverRecordHelper: storeDir = /data/data/com.mediatek.security
01-10 16:57:27.315034   987  1067 D Cta_ReceiverRecordHelper: initReceiverCache() at User(0)
01-10 16:57:27.315164   987  1067 D Cta_ReceiverRecordHelper: getPackageListReceivingSpecifiedIntent() find activities receiving intent = android.intent.action.BOOT_COMPLETED
01-10 16:57:27.315186   987  1502 I OMXClient: Treble IOmx obtained
01-10 16:57:27.315551   546   656 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 16:57:27.317575   987  1502 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x73c8867400
01-10 16:57:27.318139   987  1067 D Cta_ReceiverRecordHelper: initReceiverCache() at User(10)
01-10 16:57:27.318351   987  1067 D Cta_ReceiverRecordHelper: getPackageListReceivingSpecifiedIntent() find activities receiving intent = android.intent.action.BOOT_COMPLETED
01-10 16:57:27.319416   546   656 E OMXNodeInstance: getConfig(0xe982ac60:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 16:57:27.321577   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.322551   987  1067 D Cta_ReceiverRecordHelper: loadDataFromFileToCache()
01-10 16:57:27.323545   987  1067 I Cta_ReceiverRecordHelper: No existing /data/data/com.mediatek.security/bootreceiver.xml; starting empty
01-10 16:57:27.323654   987  1067 D Cta_ReceiverRecordHelper: resetAllReceiverRecords()
01-10 16:57:27.324078   987  1067 D Cta_ReceiverController: init ReceiverRecordHelper done.
01-10 16:57:27.324887   987  1067 D Cta_ReceiverController: startMonitor(Normal Bootup Start)
01-10 16:57:27.327983  1281  1281 D ImsConfigReceiver: Update LatestSimState, phoneId = 0, state = NOT_READY
01-10 16:57:27.328885   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.328885  1281  1281 D ImsConfigReceiver: Sim state changed, event = NOT_READY, reset broadcast flag
01-10 16:57:27.329531  1281  1281 D ImsVT Util: Received ACTION_SIM_STATE_CHANGED, slotId:0, simState:NOT_READY
01-10 16:57:27.331428  1339  1339 V PhoneWindow: DecorView setVisiblity: visibility = 4, Parent = ViewRoot{f8f656a com.android.settings/com.android.settings.FallbackHome,ident = 0}, this = DecorView@37d420c[FallbackHome]
01-10 16:57:27.331725   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.341059   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 4 lines
01-10 16:57:27.342155   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.343809   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.345676   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.361684   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.366657   401   401 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x740443e800,id:2,api:1,p:-1,c:-1) disconnect(C)
01-10 16:57:27.367242   401   401 I BufferQueue: [com.android.settings/com.android.settings.FallbackHome#0](this:0x740443e800,id:2,api:1,p:-1,c:-1) ~BufferQueueCore
01-10 16:57:27.367242   380   699 D AudioALSAStreamManager: setMicMute(), mMicMute: 0 => 0
01-10 16:57:27.368800  1131  1263 V NuMediaExtractor: setDataSource fd=46 (/system/media/audio/ui/Trusted.ogg), offset=0, length=5713
01-10 16:57:27.369886   380   699 D AudioALSAStreamManager: +SetInputMute(), 0
01-10 16:57:27.370232   380   699 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 16:57:27.370526   380   699 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 16:57:27.371222   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/1131/cmdline]
01-10 16:57:27.375826   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/1131/cmdline]
01-10 16:57:27.379540   535  1460 V APEExtractor: getAPEInfo not ape 20483
01-10 16:57:27.379649   535  1460 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.380685   987   987 D AudioService: applyDeviceVolumemStreamType:3,device:2
01-10 16:57:27.381103   987   987 D AudioService: applyDeviceVolumemStreamType:3,device:1073741824
01-10 16:57:27.381358   987   987 D AudioService: applyDeviceVolumemStreamType:9,device:2
01-10 16:57:27.381524   987   987 D AudioService: applyDeviceVolumemStreamType:9,device:1073741824
01-10 16:57:27.383123   987   987 D AudioService: applyDeviceVolumemStreamType:10,device:2
01-10 16:57:27.383484   987   987 D AudioService: applyDeviceVolumemStreamType:10,device:1073741824
01-10 16:57:27.383949  1131  1263 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 16:57:27.384857   987  1143 V NuMediaExtractor: setDataSource fd=196 (/system/media/audio/ui/KeypressDelete.ogg), offset=0, length=5832
01-10 16:57:27.385740   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:27.385759   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.385973   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:27.389012   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:27.389274  1131  1508 I OMXClient: Treble IOmx obtained
01-10 16:57:27.389303   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:27.389723   546  1159 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 16:57:27.392031  1131  1508 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x73cb4d3000
01-10 16:57:27.392649   546  1159 E OMXNodeInstance: getConfig(0xe982ac60:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 16:57:27.395595   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.395797   523   549 D AAL     : 01-10 04:57:27.207 BL= 391,ESS= 256, 01-10 04:57:27.225 BL= 390,ESS= 256, 01-10 04:57:27.303 BL= 389,ESS= 256, 01-10 04:57:27.339 BL= 388,ESS= 256, 01-10 04:57:27.395 BL= 387,ESS= 256, 
01-10 16:57:27.396864   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.397658   535  1460 V APEExtractor: getAPEInfo not ape 20482
01-10 16:57:27.397757   535  1460 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.398081   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.399050   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.399269   987  1089 D WifiController: ApStaDisabledState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 16:57:27.399368   987  1089 D WifiController: DefaultState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 16:57:27.399514  1297  1297 W System.err: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 16:57:27.399787  1297  1297 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 16:57:27.399836  1297  1297 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 16:57:27.399851  1297  1297 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 16:57:27.399866  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.getRilOp(MtkRIL.java:467)
01-10 16:57:27.399879  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.registerForModulation(MtkRIL.java:1452)
01-10 16:57:27.399906  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkServiceStateTracker.updatePhoneType(MtkServiceStateTracker.java:503)
01-10 16:57:27.399938  1297  1297 W System.err: 	at com.android.internal.telephony.ServiceStateTracker.<init>(ServiceStateTracker.java:634)
01-10 16:57:27.399960  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkServiceStateTracker.<init>(MtkServiceStateTracker.java:429)
01-10 16:57:27.399986  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkTelephonyComponentFactory.makeServiceStateTracker(MtkTelephonyComponentFactory.java:193)
01-10 16:57:27.400008  1297  1297 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.<init>(GsmCdmaPhone.java:249)
01-10 16:57:27.400025  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.<init>(MtkGsmCdmaPhone.java:393)
01-10 16:57:27.400048  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.<init>(MtkGsmCdmaPhone.java:432)
01-10 16:57:27.400062  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkTelephonyComponentFactory.makePhone(MtkTelephonyComponentFactory.java:181)
01-10 16:57:27.400086  1297  1297 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhone(PhoneFactory.java:224)
01-10 16:57:27.400106  1297  1297 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhones(PhoneFactory.java:131)
01-10 16:57:27.400130  1297  1297 W System.err: 	at com.android.phone.PhoneGlobals.onCreate(PhoneGlobals.java:370)
01-10 16:57:27.400144  1297  1297 W System.err: 	at com.android.phone.PhoneApp.onCreate(PhoneApp.java:43)
01-10 16:57:27.400173  1297  1297 W System.err: 	at android.app.Instrumentation.callApplicationOnCreate(Instrumentation.java:1119)
01-10 16:57:27.400191  1297  1297 W System.err: 	at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5781)
01-10 16:57:27.400204  1297  1297 W System.err: 	at android.app.ActivityThread.-wrap1(Unknown Source:0)
01-10 16:57:27.400218  1297  1297 W System.err: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1690)
01-10 16:57:27.400231  1297  1297 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 16:57:27.400243  1297  1297 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 16:57:27.400260  1297  1297 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 16:57:27.400272  1297  1297 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 16:57:27.400287  1297  1297 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 16:57:27.400301  1297  1297 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 16:57:27.400631  1297  1297 W System.err: Caused by: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 16:57:27.400943  1297  1297 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 16:57:27.400996  1297  1297 W System.err: 	at java.lang.BootClassLoader.findClass(ClassLoader.java:1355)
01-10 16:57:27.401012  1297  1297 W System.err: 	at java.lang.BootClassLoader.loadClass(ClassLoader.java:1415)
01-10 16:57:27.401026  1297  1297 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 16:57:27.401058  1297  1297 W System.err: 	... 27 more
01-10 16:57:27.401103  1297  1297 W System.err: Caused by: java.lang.NoClassDefFoundError: Class not found using the boot class loader; no stack trace available
01-10 16:57:27.401413   987  1143 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 16:57:27.401744   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.404113   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 16:57:27.405027   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.406282   987  1511 I OMXClient: Treble IOmx obtained
01-10 16:57:27.406725   546   656 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 16:57:27.409128   987  1511 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x73b584a800
01-10 16:57:27.409671   546   656 E OMXNodeInstance: getConfig(0xe982acc0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 16:57:27.410365   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.412701   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.421982   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 10 lines
01-10 16:57:27.422285   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.429843   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.433079  1131  1514 I SecurityController: e.getMessage() = could not bind to KeyChainService
01-10 16:57:27.448148   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.449502  1131  1131 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:27.449648  1131  1131 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:27.450020  1131  1131 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:27.450020  1131  1131 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01SystemUI.apk:com.mediatek.keyguard.op01.Op01KeyguardCustomizationFactory:com.mediatek.systemui.op01)
01-10 16:57:27.450020  1131  1131 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02SystemUI.apk:com.mediatek.keyguard.op02.Op02KeyguardCustomizationFactory:com.mediatek.systemui.op02)
01-10 16:57:27.450020  1131  1131 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07SystemUI.apk:com.mediatek.op07.keyguard.Op07KeyguardCustomizationFactory:com.mediatek.op07.systemui)
01-10 16:57:27.450020  1131  1131 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09SystemUI.apk:com.mediatek.keyguard.op09.Op09KeyguardCustomizationFactory:com.mediatek.systemui.op09)
01-10 16:57:27.450020  1131  1131 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP09_null_SEGC:OP09ClipSystemUI.apk:com.mediatek.keyguard.op09clip.Op09KeyguardCustomizationFactory:com.mediatek.systemui.op09clip)
01-10 16:57:27.455554   987   987 D MediaPlayer: handleMessage msg:(1, 0, 0)
01-10 16:57:27.457368   987  1089 D WifiController: ApStaDisabledState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 16:57:27.457456   987  1143 V NuMediaExtractor: setDataSource fd=197 (/system/media/audio/ui/KeypressReturn.ogg), offset=0, length=6246
01-10 16:57:27.457534   987  1089 D WifiController: DefaultState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 16:57:27.458284   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:27.458660   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:27.460899   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:27.461395   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:27.465395   535  1481 V APEExtractor: getAPEInfo not ape 20481
01-10 16:57:27.465500   535  1481 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.468679   987  1143 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 16:57:27.471609   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.473771   987   987 D MediaSessionService: Global priority session is changed from null to com.android.server.telecom/HeadsetMediaButton (userId=0)
01-10 16:57:27.477663   987  1529 I OMXClient: Treble IOmx obtained
01-10 16:57:27.478150   546  1290 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 16:57:27.480301   987  1529 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x73aefdf400
01-10 16:57:27.481420   546  1290 E OMXNodeInstance: getConfig(0xe982acc0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 16:57:27.482800   987   987 D LocationProviderProxy-fused: ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService} connected
01-10 16:57:27.484103   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.486198   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 16:57:27.487260   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.488773   987   987 D MtkEapSimUtility: onReceive ACTION_SIM_STATE_CHANGED iccState: NOT_READY, simSlot: 0
01-10 16:57:27.490574   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.490714   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.492322   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.493849   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 16:57:27.495144   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.499864  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:27.500056  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:27.500172  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:27.504325   987   987 I FusedLocation: engine started (com.android.location.fused)
01-10 16:57:27.514116   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.521685  1515  1515 D PPL/PlatformManager: SIM_NUMBER=1
01-10 16:57:27.523326   987  1104 D NotificationSQLiteLog: Pruned event entries: 8
01-10 16:57:27.532942   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.533580  1515  1515 I PPL/PlatformManager: Bring service to foreground
01-10 16:57:27.549117   543   587 I PPL/PPLAgent: checkCallerUidPermission(code:1,  uid:1000)
01-10 16:57:27.549243   543   587 I PPL/PPLAgent: OnTransact(1,16)
01-10 16:57:27.549279   543   587 I PPL/PPLAgent: readControlData enter
01-10 16:57:27.549314   543   587 W Parcel  : **** enforceInterface() expected 'PPLAgent' but read 'com.mediatek.internal.telephony.ppl.IPplAgent'
01-10 16:57:27.549342   543   587 I PPL/PPLAgent: enforceInterface fail
01-10 16:57:27.549368   543   587 I PPL/PPLAgent: readControlData enter
01-10 16:57:27.550078   543   587 D PPL/PPLAgent: open control data file error = No such file or directory
01-10 16:57:27.550165   543   587 I PPL/PPLAgent: readControlData exit
01-10 16:57:27.550474  1515  1515 W PPL/ControlData: buildControlData: data is empty, return empty instance
01-10 16:57:27.550691  1515  1515 D PPL/PPLManager: mCache.status = 0
01-10 16:57:27.551678  1515  1515 D PPL/PPLService: onStartCommand(Intent { act=android.intent.action.SIM_STATE_CHANGED flg=0x5000010 cmp=com.mediatek.ppl/.PplService (has extras) })
01-10 16:57:27.551862  1515  1515 D PPL/PPLService: action is android.intent.action.SIM_STATE_CHANGED
01-10 16:57:27.551919  1515  1515 I PPL/PPLService: Privacy Protection Lock is disabled. Exit.
01-10 16:57:27.552448  1131  1131 I CameraManagerGlobal: Connecting to camera service
01-10 16:57:27.556132   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.556878   527   720 I CameraService: CameraService::connect call (PID -1 "cameraserver", camera ID 0) for HAL version default and Camera API version 1
01-10 16:57:27.557848  1515  1515 D PPL/PlatformManager: Exec stopForeground with para true.
01-10 16:57:27.562533   527   720 I CameraService: onTorchStatusChangedLocked: Torch status changed for cameraId=0, newStatus=0
01-10 16:57:27.562810   987  1143 V NuMediaExtractor: setDataSource fd=198 (/system/media/audio/ui/KeypressInvalid.ogg), offset=0, length=9847
01-10 16:57:27.563464   527   720 I CameraHardwareInterface: Opening camera 0
01-10 16:57:27.563678   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:27.563926   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:27.564286   537   676 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 16:57:27.564366   537   676 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:cX�
01-10 16:57:27.564455   537   676 D NuPlayerDriver: NuPlayerDriver(0xed2031c0) created, clientPid(527)
01-10 16:57:27.565113   548   874 I mtkcam-dev1: [createSpecificCameraDevice1] APP_MODE_NAME_DEFAULT
01-10 16:57:27.567573   528   712 D DrmMtkUtil: getProcessName() : path : [/proc/987/cmdline]
01-10 16:57:27.567915   528   712 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 16:57:27.569716   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_REG: pid:548, uid:1047
01-10 16:57:27.570202   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnReg hdl:39
01-10 16:57:27.570895   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnEnable hdl:39, timeout:1000
01-10 16:57:27.571260   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_ENABLE: hdl:39, timeout:1000
01-10 16:57:27.571352   397   413 I libPerfService: perfUserScnEnable - handle:39
01-10 16:57:27.572847   397   413 I libPerfService: 39: legacy set freq: 1508000 -1 2002000 -1
01-10 16:57:27.573052   535  1481 V APEExtractor: getAPEInfo not ape 20483
01-10 16:57:27.573154   535  1481 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.573926   548   874 I mtkcam-dev1: [createSpecificCameraDevice1] - 0xe5c30600
01-10 16:57:27.574018   548   874 I mtkcam-dev1: 0[CameraDevice1Base::open] +
01-10 16:57:27.574508   548   874 I mtkcam-devicemgr: [attachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 16:57:27.574
01-10 16:57:27.575615   548   874 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_AE,0),srIdxNum(0)
01-10 16:57:27.575605   548  1544 D SeninfDrvImp: [init][init]: Entry count 0 
01-10 16:57:27.575689   548   874 I Drv/HWsync: Drv/HWsync[init] mAECyclePeriod(3)
01-10 16:57:27.575722   548   874 I Drv/HWsync: Drv/HWsync[init] -
01-10 16:57:27.575784   548   874 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:27.576119   548   874 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0xdd0919d8), bForceRead(0) +
01-10 16:57:27.576141   548   874 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:27.576161   548   874 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0xdd58be48), bForceRead(0) +
01-10 16:57:27.576346   548   874 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:27.576368   548   874 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:27.576599   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.576821   987  1143 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 16:57:27.577308   548   874 D LaserDrv: Device error opening : No such file or directory
01-10 16:57:27.577830   548   874 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:27.577909   548   874 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 16:57:27.580477   548   874 D AppTsf  : [AppTsf] constructor
01-10 16:57:27.580581   548   874 D tsf_core: [TsfCore] constructor
01-10 16:57:27.583644   548   874 W aaa_state_mgr: [StateCommon::transitState] StateUninit --> StateInit
01-10 16:57:27.583856   535  1460 V APEExtractor: getAPEInfo not ape 20483
01-10 16:57:27.583948   548   874 D flash_tuning_custom.cpp: paraIdx=0 aeSceneInd =2
01-10 16:57:27.583998   548   874 D flash_tuning_custom.cpp: copyTuningPara main yTarget=188
01-10 16:57:27.584118   535  1460 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.584889   548  1544 D SeninfDrvImp: [init]Efuse Data:0x11f1018c= 0x8c631940, 0x11f10190= 0x7c208364, 0x11f101bc= 0x80000000
01-10 16:57:27.585018   548  1544 D SeninfDrvImp: [init][init]: Exit count 1 
01-10 16:57:27.585112   548  1544 D ImgSensorDrv: [init][init] imgsensor_drv 1
01-10 16:57:27.585283   548  1544 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11)
01-10 16:57:27.585341   548  1544 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11), SENINF_TG1_PH_CNT(0x80000005)
01-10 16:57:27.585629   548  1544 D SeninfDrvImp: [setMclk1IODrivingCurrent]DrivingIdx(3), Reg(0x30000000)
01-10 16:57:27.586302   548   874 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:27.586412   548   874 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(5), sensorDev(1), p(0xdd6d4dd8), bForceRead(0) +
01-10 16:57:27.587101   547   547 I Gyroscope: batch: handle:3, flag:0,samplingPeriodNs:20000000 maxBatchReportLatencyNs:0
01-10 16:57:27.587685   547   547 I Gyroscope: enable: handle:3, en:1
01-10 16:57:27.588034   548   874 I MtkCam/ParamsManager: [updateDefaultParams2_ByQuery] cap(4208,3120),fov(67,49)
01-10 16:57:27.588092   547   547 E Gyroscope: MPE_gyr_calib_read 0.000246 -0.005214 -0.000687,0.000000 0.000000 0.000000,0.000246 -0.005214 -0.000687
01-10 16:57:27.588357   548   874 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:27.588492   548   874 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0xdd0919d8), bForceRead(0) +
01-10 16:57:27.588509   548   874 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:27.588524   548   874 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0xdd58be48), bForceRead(0) +
01-10 16:57:27.588535   548   874 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:27.588550   548   874 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0xdcc977ac), bForceRead(0) +
01-10 16:57:27.588601   548   874 D LensMCU : LensMCU[isSupportLens][CurrSensorDev]0x0001 [CurrSensorId]0x30c8
01-10 16:57:27.589236   987  1545 I OMXClient: Treble IOmx obtained
01-10 16:57:27.589686   548   874 I MtkCam/FrameController: [FrameController][prvcb] - miLogLevel(1), max delay(30000000), max sleep(1000000000 ns), min sleep(200 us), adj sleep(250000 ns)
01-10 16:57:27.589673   546  1159 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 16:57:27.591086   548  1548 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 16:57:27.591207   548  1548 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(7), sensorDev(1), p(0x0), bForceRead(1) +
01-10 16:57:27.591234   548  1548 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(7), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 16:57:27.591259   548  1548 W NvramDrv: [readDefaultData:779] CAMERA_DATA_PDC_TABLE
01-10 16:57:27.591436   548  1548 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 16:57:27.591961   987  1545 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x73aff4cc00
01-10 16:57:27.593063   546  1159 E OMXNodeInstance: getConfig(0xe982acc0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 16:57:27.595642   537  1542 D NuPlayerDriver: notifyListener_l(0xed2031c0), (1, 0, 0, -1), loop setting(0, 0)
01-10 16:57:27.595793   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.595789   527   720 I CameraProviderManager: Camera device device@1.0/internal/0 torch status is now NOT_AVAILABLE
01-10 16:57:27.595941   527   720 I CameraService: onTorchStatusChangedLocked: Torch status changed for cameraId=0, newStatus=0
01-10 16:57:27.596101   548   874 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:0
01-10 16:57:27.596242   548   874 I mtkcam-dev1: 0[CameraDevice1Base::open] Add new cameraId 0 - 0xe5c30600
01-10 16:57:27.596556   548   874 I mtkcam-dev1: 0[CameraDevice1Base::open] -
01-10 16:57:27.596737   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.597772   537   676 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 16:57:27.597925   537   676 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:@��
01-10 16:57:27.598059   537   676 D NuPlayerDriver: NuPlayerDriver(0xed2032a0) created, clientPid(527)
01-10 16:57:27.598152   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.600859   548   874 I mtkcam-dev1: 0[CameraDevice1Base::stopPreview] +
01-10 16:57:27.600990   548   874 W MtkCam/CamClient/FDClient: (874)[stopFaceDetection] FD was not running
01-10 16:57:27.601109   548   874 W MtkCam/RecordClient: (874)[stopPreview] Preview has been stopped
01-10 16:57:27.601155   548   874 I mtkcam-dev1: 0[CameraDevice1Base::stopPreview] -
01-10 16:57:27.601918   548   874 I mtkcam-dev1: 0[CameraDevice1Base::cancelPicture] +
01-10 16:57:27.602012   548   874 I mtkcam-dev1: 0[CameraDevice1Base::cancelPicture] - status(7)
01-10 16:57:27.602333   548   874 I mtkcam-dev1: 0[CameraDevice1Base::close] +
01-10 16:57:27.608118   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.608371   535  1481 V APEExtractor: getAPEInfo not ape 20481
01-10 16:57:27.608487   535  1481 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.609186   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.609810   548  1548 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 16:57:27.609954   548  1548 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 16:57:27.609968   548  1548 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 16:57:27.609980   548  1548 I MtkCam/Utils: onCreate#03 pc 000f5949  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+348)
01-10 16:57:27.609990   548  1548 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 16:57:27.610001   548  1548 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 16:57:27.610010   548  1548 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 16:57:27.610020   548  1548 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 16:57:27.610048   548  1548 E MtkCam/IonHeap: PDC_tbl_1@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 16:57:27.610155   548  1548 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 16:57:27.612155   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.614077   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 16:57:27.615344   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.616303   537  1556 D NuPlayerDriver: notifyListener_l(0xed2032a0), (1, 0, 0, -1), loop setting(0, 0)
01-10 16:57:27.618433   537   676 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 16:57:27.618611   537   676 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:�@��
01-10 16:57:27.618599   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.618768   537   676 D NuPlayerDriver: NuPlayerDriver(0xed203700) created, clientPid(527)
01-10 16:57:27.626228   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.627564   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 16:57:27.628623   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.628908   548  1548 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 16:57:27.629067   548  1548 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 16:57:27.629082   548  1548 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 16:57:27.629092   548  1548 I MtkCam/Utils: onCreate#03 pc 000f5983  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+406)
01-10 16:57:27.629101   548  1548 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 16:57:27.629109   548  1548 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 16:57:27.629116   548  1548 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 16:57:27.629125   548  1548 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 16:57:27.629157   548  1548 E MtkCam/IonHeap: PDC_tbl_2@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 16:57:27.629259   548  1548 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 16:57:27.629488   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x75dd42b5f0, 32768)
01-10 16:57:27.631241   535  1460 V APEExtractor: getAPEInfo not ape 20482
01-10 16:57:27.631403   535  1460 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 16:57:27.636219   537  1560 D NuPlayerDriver: notifyListener_l(0xed203700), (1, 0, 0, -1), loop setting(0, 0)
01-10 16:57:27.640573   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.642440   523   549 D AAL     : 01-10 04:57:27.433 BL= 386,ESS= 256, 01-10 04:57:27.489 BL= 385,ESS= 256, 01-10 04:57:27.527 BL= 384,ESS= 256, 01-10 04:57:27.584 BL= 383,ESS= 256, 01-10 04:57:27.642 BL= 382,ESS= 256, 
01-10 16:57:27.645270   987   987 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 16:57:27.645817   548  1548 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 16:57:27.645939   548  1548 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 16:57:27.645952   548  1548 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 16:57:27.645962   548  1548 I MtkCam/Utils: onCreate#03 pc 000f59bd  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+464)
01-10 16:57:27.645969   548  1548 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 16:57:27.645980   548  1548 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 16:57:27.645988   548  1548 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 16:57:27.645996   548  1548 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 16:57:27.646019   548  1548 E MtkCam/IonHeap: PDC_tbl_3@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 16:57:27.646103   548  1548 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 16:57:27.647904   987  1002 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 16:57:27.660430   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.663891   548  1548 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 16:57:27.663988   548  1548 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 16:57:27.664001   548  1548 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 16:57:27.664011   548  1548 I MtkCam/Utils: onCreate#03 pc 000f59f3  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+518)
01-10 16:57:27.664021   548  1548 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 16:57:27.664035   548  1548 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 16:57:27.664043   548  1548 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 16:57:27.664053   548  1548 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 16:57:27.664082   548  1548 E MtkCam/IonHeap: PDC_tbl_4@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 16:57:27.664166   548  1548 E isp_mgr_bnr: [PDC_tbl_1] ImageBufferHeap create fail (setBPCIBuf){#727:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/isp_mgr/isp_mgr_bnr.cpp}
01-10 16:57:27.669364   524   710 D APM_AudioPolicyManager: setForceUse() usage 0, config 0, mPhoneState 0
01-10 16:57:27.669705   524   710 D APM_AudioPolicyManager: setForceUse() usage 2, config 0, mPhoneState 0
01-10 16:57:27.670028   524   710 D APM_AudioPolicyManager: setForceUse() usage 3, config 8, mPhoneState 0
01-10 16:57:27.670254   524   710 D APM_AudioPolicyManager: setForceUse() usage 6, config 0, mPhoneState 0
01-10 16:57:27.681999   548  1544 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(0)
01-10 16:57:27.682144   548  1544 I Drv/HWsync: Drv/HWsync[init] -
01-10 16:57:27.682572   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.683133   548   874 I MtkCam/CamClient: (874)[uninit] + getStrongCount(1)
01-10 16:57:27.693625   548   874 W MtkCam/CamClient/FDClient: (874)[stopFaceDetection] FD was not running
01-10 16:57:27.693880   548   874 I MtkCam/CamClient: (874)[uninit] - getStrongCount(1)
01-10 16:57:27.694278   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 16:57:27.695165   397   413 I libPerfService: 39: legacy set freq: -1 -1 -1 -1
01-10 16:57:27.699229   547   547 W hw-IPCThreadState: All binder threads in pool (2 threads) busy for 112 ms
01-10 16:57:27.701077   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.702367   547   547 I Accelerometer: batch: handle:0, flag:0,samplingPeriodNs:20000000 maxBatchReportLatencyNs:0
01-10 16:57:27.702996   548   874 W aaa_state_mgr: [StateCommon::transitState] StateInit --> StateUninit
01-10 16:57:27.703145   547   547 I Accelerometer: enable: handle:0, en:1
01-10 16:57:27.703236   548   874 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_AE,2),srIdxNum(1)
01-10 16:57:27.703290   548   874 I Drv/HWsync: Drv/HWsync[uninit] mAECyclePeriod(-1)
01-10 16:57:27.703301   548   874 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 16:57:27.703390   547   547 E         : settings file open failed: -2 (No such file or directory)
01-10 16:57:27.703439   547   547 E Accelerometer: MPE_acc_read_data_fail
01-10 16:57:27.724386   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.731999   548   884 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:27.736543  1297  1297 D ImsExternalCallTracker: Registering: Handler (com.mediatek.internal.telephony.imsphone.MtkImsPhone) {7704da7}
01-10 16:57:27.730000   548   548 W HwBinder:548_2: type=1400 audit(0.0:46): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:27.743056   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.744652   547  1056 I Accelerometer: enable: handle:0, en:0
01-10 16:57:27.759180  1297  1297 D OpImsPhoneCallTrackerBase: initRtt call to op base
01-10 16:57:27.766445   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.770812  1297  1562 W Binder  : Binder call failed.
01-10 16:57:27.770812  1297  1562 W Binder  : java.lang.NullPointerException: Attempt to get length of null array
01-10 16:57:27.770812  1297  1562 W Binder  : 	at com.android.internal.telephony.SubscriptionMonitor$1.onSubscriptionsChanged(SubscriptionMonitor.java:113)
01-10 16:57:27.770812  1297  1562 W Binder  : 	at com.android.internal.telephony.IOnSubscriptionsChangedListener$Stub.onTransact(IOnSubscriptionsChangedListener.java:48)
01-10 16:57:27.770812  1297  1562 W Binder  : 	at android.os.Binder.execTransact(Binder.java:697)
01-10 16:57:27.776700  1297  1297 D PhoneSwitcherNetworkRequstListener: Registering NetworkFactory
01-10 16:57:27.784142   547   547 I Gyroscope: enable: handle:3, en:0
01-10 16:57:27.785123   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.808386   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.809419  1131  1371 D NetworkController: subscriptions is null
01-10 16:57:27.817383  1131  1371 D NetworkController: subscriptions is null
01-10 16:57:27.818855  1131  1371 D NetworkController: updateMobileControllers detectedType: 4
01-10 16:57:27.818857  1297  1564 I MTKDefaultSmsSimSettings: oldSmsDefaultSIM1
01-10 16:57:27.819136  1297  1564 I MTKDefaultSmsSimSettings: subInfos == null, return
01-10 16:57:27.821039   987   987 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 16:57:27.825700  1297  1569 W CallerInfoCache: cursor is null
01-10 16:57:27.827050   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.828572   987  1002 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 16:57:27.828781  1131  1371 D NetworkController: subscriptions is null
01-10 16:57:27.830261  1131  1371 D NetworkController: updateMobileControllers detectedType: 4
01-10 16:57:27.832894  1131  1371 D NetworkController: isEmergencyOnly No sims 
01-10 16:57:27.833278  1297  1297 E MtkPhoneIntfMgrEx: [updateUserCustomizedEccList] mUserCustomizedEccList: []
01-10 16:57:27.833404  1297  1297 E MtkPhoneIntfMgrEx: publish: com.mediatek.phone.MtkPhoneInterfaceManagerEx@dce6516
01-10 16:57:27.838082  1131  1371 D NetworkController: isEmergencyOnly No sims 
01-10 16:57:27.840953   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=22.95 dur=1002.28 max=62.03 min=35.26
01-10 16:57:27.850270   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.858269  1297  1297 D CarrierConfigLoader: CarrierConfigLoader has started
01-10 16:57:27.869105   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.872362  1297  1297 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 16:57:27.879342  1297  1297 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:27.879439  1297  1297 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01TeleService.apk:com.mediatek.op01.phone.plugin.Op01PhoneCustomizationFactory:com.mediatek.op01.phone.plugin)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02TeleService.apk:com.mediatek.phone.op02.plugin.Op02PhoneCustomizationFactory:com.mediatek.phone.op02.plugin)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP03_null_null:OP03TeleService.apk:com.mediatek.op03.phone.Op03PhoneCustomizationFactory:com.mediatek.op03.phone)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP05_null_null:OP05TeleService.apk:com.mediatek.op05.phone.Op05PhoneCustomizationFactory:com.mediatek.op05.phone)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP06_null_null:OP06TeleService.apk:com.mediatek.op06.phone.Op06PhoneCustomizationFactory:com.mediatek.op06.phone)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07TeleService.apk:com.mediatek.op07.phone.OP07PhoneCustomizationFactory:com.mediatek.op07.phone)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP08_null_null:OP08TeleService.apk:com.mediatek.op08.phone.Op08PhoneCustomizationFactory:com.mediatek.op08.phone)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09TeleService.apk:com.mediatek.phone.op09.plugin.Op09PhoneCustomizationFactory:com.mediatek.phone.op09.plugin)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 8: OperatorFactoryInfo(OP09_null_SEGC:OP09ClibTeleService.apk:com.mediatek.phone.op09Clib.plugin.Op09ClibPhoneCustomizationFactory:com.mediatek.phone.op09Clib.plugin)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 9: OperatorFactoryInfo(OP11_null_null:OP11TeleService.apk:com.mediatek.op11.phone.Op11PhoneCustomizationFactory:com.mediatek.op11.phone)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 10: OperatorFactoryInfo(OP12_null_null:OP12TeleService.apk:com.mediatek.op12.phone.Op12PhoneCustomizationFactory:com.mediatek.op12.phone)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 11: OperatorFactoryInfo(OP15_null_null:OP15TeleService.apk:com.mediatek.op15.phone.Op15PhoneCustomizationFactory:com.mediatek.op15.phone)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 12: OperatorFactoryInfo(OP16_null_null:OP16TeleService.apk:com.mediatek.op16.phone.Op16PhoneCustomizationFactory:com.mediatek.op16.phone)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 13: OperatorFactoryInfo(OP18_null_null:OP18TeleService.apk:com.mediatek.op18.phone.Op18PhoneCustomizationFactory:com.mediatek.op18.phone)
01-10 16:57:27.880118  1297  1297 E OperatorCustomizationFactoryLoader: 14: OperatorFactoryInfo(OP112_null_null:OP112TeleService.apk:com.mediatek.op112.phone.Op112PhoneCustomizationFactory:com.mediatek.op112.phone)
01-10 16:57:27.880899  1297  1297 D ExtensionManager: [sSsRoamingServiceExt] create ext instance: com.mediatek.phone.ext.DefaultSsRoamingServiceExt@521e8f0
01-10 16:57:27.884517  1297  1297 D CdmaVolteServiceChecker: updateState, checking = false
01-10 16:57:27.885838  1297  1297 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 16:57:27.885951  1297  1297 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 16:57:27.886026  1297  1297 D PhoneGlobals: registerSubInfoRecordIntent
01-10 16:57:27.887239  1297  1573 D PhoneGlobals: Start Sim Select Service
01-10 16:57:27.892295   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.892958  1339  1339 D UtilsExt: file in /vendor/etc/disableapplist.txt does not exist!
01-10 16:57:27.894434  1297  1297 W ImsPhoneCallTracker: ImsManager is null when setting TTY mode
01-10 16:57:27.896971  1339  1339 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:27.897144  1339  1339 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:27.897280  1297  1297 D ExtensionManager: [sDigitsUtilExt] create ext instance: com.mediatek.phone.ext.DefaultDigitsUtilExt@c3e198f
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01Settings.apk:com.mediatek.settings.op01.Op01SettingsCustomizationFactory:com.mediatek.settings.op01)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02Settings.apk:com.mediatek.settings.op02.Op02SettingsCustomizationFactory:com.mediatek.settings.op02)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP03_null_SEGDEFAULT:OP03Settings.apk:com.mediatek.op03.settings.OP03SettingsCustomizationFactory:com.mediatek.op03.settings)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP06_null_SEGDEFAULT:OP06Settings.apk:com.mediatek.op06.settings.Op06SettingsCustomizationFactory:com.mediatek.op06.settings)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07Settings.apk:com.mediatek.op07.settings.OP07SettingsCustomizationFactory:com.mediatek.op07.settings)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP08_null_SEGDEFAULT:OP08Settings.apk:com.mediatek.op08.settings.Op08SettingsCustomizationFactory:com.mediatek.op08.settings)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09AlibSettings.apk:com.mediatek.settings.op09alib.Op09AlibSettingsCustomizationFactory:com.mediatek.settings.op09alib)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP09_null_SEGC:OP09ClibSettings.apk:com.mediatek.settings.op09clib.Op09ClibSettingsCustomizationFactory:com.mediatek.settings.op09clib)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 8: OperatorFactoryInfo(OP12_null_null:OP12Settings.apk:com.mediatek.op12.settings.Op12SettingsCustomizationFactory:com.mediatek.op12.settings)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 9: OperatorFactoryInfo(OP16_null_SEGDEFAULT:OP16Settings.apk:com.mediatek.op16.settings.Op16SettingsCustomizationFactory:com.mediatek.op16.settings)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 10: OperatorFactoryInfo(OP18_null_SEGDEFAULT:OP18Settings.apk:com.mediatek.op18.settings.OP18SettingsCustomizationFactory:com.mediatek.op18.settings)
01-10 16:57:27.898737  1339  1339 E OperatorCustomizationFactoryLoader: 11: OperatorFactoryInfo(OP20_null_SEGDEFAULT:OP20Settings.apk:com.mediatek.op20.settings.OP20SettingsCustomizationFactory:com.mediatek.op20.settings)
01-10 16:57:27.900063  1339  1339 D UtilsExt: [getSimManagementExt] create ext instance: com.mediatek.settings.ext.DefaultSimManagementExt@eb66e36
01-10 16:57:27.901199   548   874 D AppTsf  : [TsfExit] TsfExit
01-10 16:57:27.901330   548   874 D AppTsf  : [~AppTsf] destructor
01-10 16:57:27.901370   548   874 D tsf_core: [~TsfCore] destructor
01-10 16:57:27.902763  1339  1339 D SimSelectService: onCreate
01-10 16:57:27.903080  1297  1297 W System.err: java.lang.ClassNotFoundException: cn.richinfo.dm.CtmApplication
01-10 16:57:27.903359  1297  1297 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 16:57:27.903385  1297  1297 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 16:57:27.903398  1297  1297 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 16:57:27.903420  1297  1297 W System.err: 	at com.mediatek.phone.ext.ExtensionManager.initPhoneHelper(ExtensionManager.java:287)
01-10 16:57:27.903435  1297  1297 W System.err: 	at com.android.phone.PhoneApp.onCreate(PhoneApp.java:48)
01-10 16:57:27.903451  1297  1297 W System.err: 	at android.app.Instrumentation.callApplicationOnCreate(Instrumentation.java:1119)
01-10 16:57:27.903465  1297  1297 W System.err: 	at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5781)
01-10 16:57:27.903488  1297  1297 W System.err: 	at android.app.ActivityThread.-wrap1(Unknown Source:0)
01-10 16:57:27.903502  1297  1297 W System.err: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1690)
01-10 16:57:27.903515  1297  1297 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 16:57:27.903527  1297  1297 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 16:57:27.903540  1297  1297 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 16:57:27.903556  1297  1297 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 16:57:27.903571  1297  1297 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 16:57:27.903584  1297  1297 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 16:57:27.903751  1297  1297 W System.err: Caused by: java.lang.ClassNotFoundException: Didn't find class "cn.richinfo.dm.CtmApplication" on path: DexPathList[[zip file "/system/priv-app/MtkTeleService/MtkTeleService.apk"],nativeLibraryDirectories=[/system/priv-app/MtkTeleService/lib/arm64, /system/lib64, /vendor/lib64, /system/lib64, /vendor/lib64]]
01-10 16:57:27.903775  1297  1297 W System.err: 	at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:125)
01-10 16:57:27.903788  1297  1297 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
01-10 16:57:27.903802  1297  1297 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 16:57:27.903814  1297  1297 W System.err: 	... 15 more
01-10 16:57:27.904066  1339  1339 D SimSelectService: onReceive action=android.intent.action.ACTION_SUBINFO_RECORD_UPDATED
01-10 16:57:27.904522  1339  1339 D UtilsExt: autoSanity: false buildType: user
01-10 16:57:27.905180   523   549 D AAL     : 01-10 04:57:27.697 BL= 381,ESS= 256, 01-10 04:57:27.735 BL= 380,ESS= 256, 01-10 04:57:27.791 BL= 379,ESS= 256, 01-10 04:57:27.829 BL= 378,ESS= 256, 01-10 04:57:27.905 BL= 377,ESS= 256, 
01-10 16:57:27.906479   548   874 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(1)
01-10 16:57:27.906604   548   874 I Drv/HWsync: Drv/HWsync[uninit] idx(0,remain_0),tg(0)
01-10 16:57:27.906625   548   874 W Drv/HWsync: Drv/HWsync[uninit] WARNING: wtginf, sindex(0x0),tg(0x0)
01-10 16:57:27.906638   548   874 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 16:57:27.906755   548   874 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11)
01-10 16:57:27.906810   548   874 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11), SENINF_TG1_PH_CNT(0x5)
01-10 16:57:27.906895  1339  1339 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 16:57:27.907011  1297  1297 D ImsResolver: maybeAddedImsService, packageName: null
01-10 16:57:27.911236   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.911724  1339  1339 D SimSelectService: sub info update, type = 4, subs = null
01-10 16:57:27.911886  1339  1339 D SimSelectService: extra value no change, return
01-10 16:57:27.912406   548   874 D ImgSensorDrv: [uninit][uninit] imgsensor_drv 0
01-10 16:57:27.912657   548   874 D SeninfDrvImp: [uninit][uninit]: 1 
01-10 16:57:27.912965   548   874 D SeninfDrvImp: [uninit][uninit]: 0, mfd(16) 
01-10 16:57:27.915161  1297  1297 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 16:57:27.916892   548   874 I mtkcam-devicemgr: [detachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 16:57:27.574
01-10 16:57:27.917309   527   720 I CameraProviderManager: Camera device device@1.0/internal/0 torch status is now AVAILABLE_OFF
01-10 16:57:27.917373   527   720 I CameraService: onTorchStatusChangedLocked: Torch status changed for cameraId=0, newStatus=1
01-10 16:57:27.917572   548   874 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:1
01-10 16:57:27.917730   548   874 I mtkcam-dev1: 0[CameraDevice1Base::close] Del cameraId 0 - 0xe5c30600, this - 0xe5c30600
01-10 16:57:27.917788   548   874 I mtkcam-dev1: 0[CameraDevice1Base::close] -
01-10 16:57:27.918030   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:39
01-10 16:57:27.918517   527   720 I CameraHardwareInterface: Destroying camera 0
01-10 16:57:27.918700   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:39
01-10 16:57:27.918815   397   413 I libPerfService: perfUserUnregScn - handle:39
01-10 16:57:27.919122   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 16:57:27.919693   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:-1
01-10 16:57:27.920046   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:-1
01-10 16:57:27.920126   397   413 I libPerfService: perfUserUnregScn - handle:-1
01-10 16:57:27.920410   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:-1
01-10 16:57:27.920736   527   720 I CameraService: disconnect: Disconnected client for camera 0 for PID 527
01-10 16:57:27.920864   527   720 V DL-NativeProxy: Resume requested start
01-10 16:57:27.921257   527   720 W DL-NativeProxy: Cannot connect to the scanner service
01-10 16:57:27.921296   527   720 W DL-NativeProxy: Cannot resume scanner, service is not alive
01-10 16:57:27.921327   527   720 W CameraService: camera_interop: suspendResume failure on dlservice module, error -2147483648
01-10 16:57:27.921667   537   676 D NuPlayerDriver: reset(0xed2031c0) at state 4
01-10 16:57:27.921830   537   676 D NuPlayerDriver: notifyListener_l(0xed2031c0), (8, 0, 0, -1), loop setting(0, 0)
01-10 16:57:27.921859   537   676 D GenericSource: disconnect: mDataSource 0xed99a540 mHttpSource 0x0
01-10 16:57:27.922278   537  1542 D NuPlayerDriver: notifyResetComplete(0xed2031c0)
01-10 16:57:27.924505   537   676 D NuPlayerDriver: reset(0xed2032a0) at state 4
01-10 16:57:27.924632   537   676 D NuPlayerDriver: notifyListener_l(0xed2032a0), (8, 0, 0, -1), loop setting(0, 0)
01-10 16:57:27.924657   537   676 D GenericSource: disconnect: mDataSource 0xed99a640 mHttpSource 0x0
01-10 16:57:27.924901   537  1556 D NuPlayerDriver: notifyResetComplete(0xed2032a0)
01-10 16:57:27.925933   537  1268 D NuPlayerDriver: reset(0xed203700) at state 4
01-10 16:57:27.926106   537  1268 D NuPlayerDriver: notifyListener_l(0xed203700), (8, 0, 0, -1), loop setting(0, 0)
01-10 16:57:27.926148   537  1268 D GenericSource: disconnect: mDataSource 0xed99a740 mHttpSource 0x0
01-10 16:57:27.926379   537  1560 D NuPlayerDriver: notifyResetComplete(0xed203700)
01-10 16:57:27.934183   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.943567  1297  1297 D IntentBroadcaster: Broadcasting and adding intent for rebroadcast: android.intent.action.SIM_STATE_CHANGED UNKNOWN for slotId 0
01-10 16:57:27.945636   987   987 D MtkEapSimUtility: onReceive ACTION_SIM_STATE_CHANGED iccState: UNKNOWN, simSlot: 0
01-10 16:57:27.946867  1281  1281 D ImsConfigReceiver: Update LatestSimState, phoneId = 0, state = UNKNOWN
01-10 16:57:27.947120  1281  1281 D ImsConfigReceiver: Sim state changed, event = UNKNOWN, reset broadcast flag
01-10 16:57:27.947377  1281  1281 D ImsVT Util: Received ACTION_SIM_STATE_CHANGED, slotId:0, simState:UNKNOWN
01-10 16:57:27.953040   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.952568  1131  1371 D NetworkController: subscriptions is null
01-10 16:57:27.956193  1297  1297 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 16:57:27.960301  1297  1297 W System.err: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 16:57:27.960498  1297  1297 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 16:57:27.960536  1297  1297 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 16:57:27.960550  1297  1297 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 16:57:27.960564  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.getRilOp(MtkRIL.java:467)
01-10 16:57:27.960614  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.unregisterForModulation(MtkRIL.java:1461)
01-10 16:57:27.960643  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkServiceStateTracker.updatePhoneType(MtkServiceStateTracker.java:536)
01-10 16:57:27.960659  1297  1297 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.switchPhoneType(GsmCdmaPhone.java:414)
01-10 16:57:27.960689  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.switchPhoneType(MtkGsmCdmaPhone.java:580)
01-10 16:57:27.960706  1297  1297 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.switchVoiceRadioTech(GsmCdmaPhone.java:3321)
01-10 16:57:27.960721  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.switchVoiceRadioTech(MtkGsmCdmaPhone.java:667)
01-10 16:57:27.960745  1297  1297 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.phoneObjectUpdater(GsmCdmaPhone.java:3295)
01-10 16:57:27.960787  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.phoneObjectUpdater(MtkGsmCdmaPhone.java:5503)
01-10 16:57:27.960807  1297  1297 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.handleMessage(GsmCdmaPhone.java:2243)
01-10 16:57:27.960824  1297  1297 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.handleMessage(MtkGsmCdmaPhone.java:2128)
01-10 16:57:27.960839  1297  1297 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 16:57:27.960853  1297  1297 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 16:57:27.960867  1297  1297 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 16:57:27.960886  1297  1297 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 16:57:27.960985  1297  1297 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 16:57:27.961006  1297  1297 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 16:57:27.961304  1297  1297 W System.err: Caused by: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 16:57:27.961372  1297  1297 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 16:57:27.961399  1297  1297 W System.err: 	at java.lang.BootClassLoader.findClass(ClassLoader.java:1355)
01-10 16:57:27.961423  1297  1297 W System.err: 	at java.lang.BootClassLoader.loadClass(ClassLoader.java:1415)
01-10 16:57:27.961439  1297  1297 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 16:57:27.961451  1297  1297 W System.err: 	... 20 more
01-10 16:57:27.961508  1297  1297 W System.err: Caused by: java.lang.NoClassDefFoundError: Class not found using the boot class loader; no stack trace available
01-10 16:57:27.975988   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:27.977996  1297  1297 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 16:57:27.978998  1297  1297 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 16:57:27.994876   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:27.999277  1297  1297 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 16:57:28.000436  1297  1297 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 16:57:28.006857  1281  1314 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 16:57:28.015950  1131  1149 D Camera  : Camera release.
01-10 16:57:28.017591   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.025031   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 16:57:28.025198   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 16:57:28.031905  1297  1297 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 16:57:28.032823  1297  1297 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 16:57:28.032918   557   585 D agps    : [agps][n][CP] [MD_1] read  md_modem_reboot_ind_hdlr
01-10 16:57:28.033099   557   585 D agps    : [agps][n][CP] [MD_1] write  sim_info_req  gsm_disabled=[0] umts_disabled=[0] lte_disabled=[0] lppe_enable=[1] lppe_network_location_disable=[0] reject_non911_nilr_enable=[0] battery_percentage=[100]
01-10 16:57:28.033173   557   585 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 16:57:28.033206   557   585 D agps    : [agps] WARNING: [LPPe] lppe_mgr_start_capabilities_sync()
01-10 16:57:28.033794   556   653 D lbs_hidl_service: [1.05][mtk_lppe_socket_wlan] handleSocketEvent() ret=[12]
01-10 16:57:28.033912   556   653 D lbs_hidl_service: [1.05][mtk_lppe_socket_bt] handleSocketEvent() ret=[12]
01-10 16:57:28.033937   556   653 D lbs_hidl_service: [1.05][mtk_lppe_socket_sensor] handleSocketEvent() ret=[12]
01-10 16:57:28.033961   556   653 D lbs_hidl_service: [1.05][mtk_lppe_socket_network] handleSocketEvent() ret=[12]
01-10 16:57:28.033982   556   653 D lbs_hidl_service: [1.05][mtk_lppe_socket_ipaddr] handleSocketEvent() ret=[12]
01-10 16:57:28.034002   556   653 D lbs_hidl_service: [1.05][mtk_lppe_socket_lbs] handleSocketEvent() ret=[12]
01-10 16:57:28.036487   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.039072  1281  1314 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 16:57:28.043479   557   585 D agps    : [agps][n][CP] [MD_1] read  sim_info_rsp  sim_number=2 md_type=0 (0=fdd, 1=tdd) ecid=1 otdoa=0 band_num=11
01-10 16:57:28.043555   557   585 D agps    : [agps][n][CP] i=0  support_band=1
01-10 16:57:28.043586   557   585 D agps    : [agps][n][CP] i=1  support_band=3
01-10 16:57:28.043601   557   585 D agps    : [agps][n][CP] i=2  support_band=5
01-10 16:57:28.043615   557   585 D agps    : [agps][n][CP] i=3  support_band=7
01-10 16:57:28.043628   557   585 D agps    : [agps][n][CP] i=4  support_band=8
01-10 16:57:28.043654   557   585 D agps    : [agps][n][CP] i=5  support_band=20
01-10 16:57:28.043668   557   585 D agps    : [agps][n][CP] i=6  support_band=28
01-10 16:57:28.043693   557   585 D agps    : [agps][n][CP] i=7  support_band=38
01-10 16:57:28.043707   557   585 D agps    : [agps][n][CP] i=8  support_band=39
01-10 16:57:28.043732   557   585 D agps    : [agps][n][CP] i=9  support_band=40
01-10 16:57:28.043747   557   585 D agps    : [agps][n][CP] i=10  support_band=41
01-10 16:57:28.043785   557   585 D agps    : [agps][n][CP] index=[0]  support_lpp_otdoa_nbr_cell_list=[0] support_supl_flow_ind=[1] support_location_settings=[1] support_cp_lppe=[0]
01-10 16:57:28.043874   557   585 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 16:57:28.043885   557   611 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_LBS_CAPABILITY_UPDATE_REQ]
01-10 16:57:28.043930   557   611 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_PEER_EUTRAN_BAND_UPDATE_CNF]
01-10 16:57:28.044104   557   585 D agps    : [agps][n][AGPS] [MNL] write  agps_settings_sync  sib8_16=[1], gps=[1] glonass=[1] beidou=[1] galileo=[1] agps=[1] aglonass=[1] abeidou=[0] agalileo=[0]
01-10 16:57:28.044393   520   693 D MNLD    : agps_settings_sync: agps setting, sib8_16_enable = 1, gps_sat_en = 1, glonass_sat_en = 1,         beidou_sat_en = 1, galileo_sat_en = 1, a_glonass_sat_en = 1,         a_gps_satellite_enable = 1, a_beidou_satellite_enable = 0, a_galileo_satellite_enable = 0, lppe_enable=1
01-10 16:57:28.045291   520   693 D MNLD    : agps_settings_sync: mnl stop, mnld send pmtk764 to agpsd
01-10 16:57:28.045374   520   693 D MNLD    : get_agnss_capability: MNLD_PMTK764: $PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 16:57:28.045374   520   693 D MNLD    : , agps_cap:1, aglonass_cap:1, abeidou_cap:0, agalileo_cap:0, lppe_support:1
01-10 16:57:28.045386   557   585 D agps    : [agps][n][AGPS] [MNL] read  agps_settings_ack  gps=[1] glonass=[1] beidou=[1] galileo=[0]
01-10 16:57:28.045629   557   585 D agps    : [agps][n][AGPS] [MNL] read  pmtk=[$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 16:57:28.045629   557   585 D agps    : ]
01-10 16:57:28.045653   557   585 D agps    : [agps][n][AGPS] gnss_num=2
01-10 16:57:28.045697   557   585 D agps    : [agps][n][CP] [MD_1] write  pmtk [$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 16:57:28.045697   557   585 D agps    : ]
01-10 16:57:28.052761   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 16:57:28.052887   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 16:57:28.057992   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:24.793615,dur:1048.66,max:88.51,min:7.19
01-10 16:57:28.059571   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.078565   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.097914  1297  1297 I VvmSimStateTracker: android.intent.action.SIM_STATE_CHANGED
01-10 16:57:28.098982  1281  1448 I VT      : [JNI] Leaving InitRefVTP
01-10 16:57:28.101310   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.110271  1281  1281 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 16:57:28.111544  1131  1131 D QSTileHost: loadTileSpecs() default tile list: wifi,bt,dnd,flashlight,rotation,battery,cell,airplane,cast
01-10 16:57:28.118640  1131  1371 W Tile.BluetoothTile: Error in handleSetListening
01-10 16:57:28.118640  1131  1371 W Tile.BluetoothTile: java.lang.NullPointerException: Attempt to invoke interface method 'void com.android.systemui.statusbar.policy.BluetoothController.addCallback(java.lang.Object)' on a null object reference
01-10 16:57:28.118640  1131  1371 W Tile.BluetoothTile: 	at com.android.systemui.qs.tiles.BluetoothTile.handleSetListening(BluetoothTile.java:81)
01-10 16:57:28.118640  1131  1371 W Tile.BluetoothTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:468)
01-10 16:57:28.118640  1131  1371 W Tile.BluetoothTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 16:57:28.118640  1131  1371 W Tile.BluetoothTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 16:57:28.118640  1131  1371 W Tile.BluetoothTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 16:57:28.120358   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.124967  1297  1576 E MtkPhoneIntfMgrEx: [setWifiSignalLevel] pheonId:0, rssi:0, snr:60
01-10 16:57:28.125441   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 16:57:28.125554   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 16:57:28.131056  1297  1576 E MtkPhoneIntfMgrEx: [setWifiEnabled] pheonId:0, ifName:wlan0, isEnabled:0
01-10 16:57:28.131295  1131  1371 W Tile.BluetoothTile: Error in handleRefreshState
01-10 16:57:28.131295  1131  1371 W Tile.BluetoothTile: java.lang.NullPointerException: Attempt to invoke interface method 'boolean com.android.systemui.statusbar.policy.BluetoothController.isBluetoothEnabled()' on a null object reference
01-10 16:57:28.131295  1131  1371 W Tile.BluetoothTile: 	at com.android.systemui.qs.tiles.BluetoothTile.handleUpdateState(BluetoothTile.java:122)
01-10 16:57:28.131295  1131  1371 W Tile.BluetoothTile: 	at com.android.systemui.qs.tiles.BluetoothTile.handleUpdateState(BluetoothTile.java:120)
01-10 16:57:28.131295  1131  1371 W Tile.BluetoothTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl.handleRefreshState(QSTileImpl.java:289)
01-10 16:57:28.131295  1131  1371 W Tile.BluetoothTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:447)
01-10 16:57:28.131295  1131  1371 W Tile.BluetoothTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 16:57:28.131295  1131  1371 W Tile.BluetoothTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 16:57:28.131295  1131  1371 W Tile.BluetoothTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 16:57:28.136199  1297  1576 E MtkPhoneIntfMgrEx: [setWifiAssociated] pheonId:0, ifName:wlan0, associated:false, ssid:, apMac:
01-10 16:57:28.140366  1297  1576 E MtkPhoneIntfMgrEx: [setWifiIpAddress] pheonId:0, ifName:wlan0, ipv4Addr:, ipv6Addr:
01-10 16:57:28.140551  1297  1297 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: No UICC
01-10 16:57:28.143278   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.143444   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wowifi=***](28)
01-10 16:57:28.143531   885   885 D [epdg_wo]: [DBG] wifi->prev_ssid= de-associcated
01-10 16:57:28.143811   885   885 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wowifi:0,0](10)
01-10 16:57:28.144273  1131  1131 D LocalBluetoothProfileManager: Adding local MAP profile
01-10 16:57:28.146387  1131  1131 D BluetoothMap: Create BluetoothMap proxy object
01-10 16:57:28.149881   523   549 D AAL     : 01-10 04:57:27.942 BL= 376,ESS= 256, 01-10 04:57:27.999 BL= 375,ESS= 256, 01-10 04:57:28.057 BL= 374,ESS= 256, 01-10 04:57:28.112 BL= 373,ESS= 256, 01-10 04:57:28.149 BL= 372,ESS= 256, 
01-10 16:57:28.155606  1297  1297 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 16:57:28.155674  1297  1297 D ImsExternalCallTracker: refreshCallPullState
01-10 16:57:28.155829  1131  1131 D LocalBluetoothProfileManager: LocalBluetoothProfileManager construction complete
01-10 16:57:28.161201  1131  1371 W Tile.DndTile: Error in handleSetListening
01-10 16:57:28.161201  1131  1371 W Tile.DndTile: java.lang.NullPointerException: Attempt to invoke interface method 'void com.android.systemui.statusbar.policy.ZenModeController.addCallback(java.lang.Object)' on a null object reference
01-10 16:57:28.161201  1131  1371 W Tile.DndTile: 	at com.android.systemui.qs.tiles.DndTile.handleSetListening(DndTile.java:239)
01-10 16:57:28.161201  1131  1371 W Tile.DndTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:468)
01-10 16:57:28.161201  1131  1371 W Tile.DndTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 16:57:28.161201  1131  1371 W Tile.DndTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 16:57:28.161201  1131  1371 W Tile.DndTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 16:57:28.162349   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.171127  1131  1371 W Tile.CellularTile: Error in handleSetListening
01-10 16:57:28.171127  1131  1371 W Tile.CellularTile: java.lang.NullPointerException: Attempt to invoke interface method 'void com.android.systemui.statusbar.policy.NetworkController.addCallback(com.android.systemui.statusbar.policy.NetworkController$SignalCallback)' on a null object reference
01-10 16:57:28.171127  1131  1371 W Tile.CellularTile: 	at com.android.systemui.qs.tiles.CellularTile.handleSetListening(CellularTile.java:120)
01-10 16:57:28.171127  1131  1371 W Tile.CellularTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:468)
01-10 16:57:28.171127  1131  1371 W Tile.CellularTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 16:57:28.171127  1131  1371 W Tile.CellularTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 16:57:28.171127  1131  1371 W Tile.CellularTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 16:57:28.171439  1131  1131 I DefaultQuickSettingsPlugin: customizeDisplayDataUsage, return isDisplay = false
01-10 16:57:28.177474  1131  1371 W Tile.CastTile: Error in handleRefreshState
01-10 16:57:28.177474  1131  1371 W Tile.CastTile: java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Set com.android.systemui.statusbar.policy.CastController.getCastDevices()' on a null object reference
01-10 16:57:28.177474  1131  1371 W Tile.CastTile: 	at com.android.systemui.qs.tiles.CastTile.handleUpdateState(CastTile.java:196)
01-10 16:57:28.177474  1131  1371 W Tile.CastTile: 	at com.android.systemui.qs.tiles.CastTile.handleUpdateState(CastTile.java:191)
01-10 16:57:28.177474  1131  1371 W Tile.CastTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl.handleRefreshState(QSTileImpl.java:289)
01-10 16:57:28.177474  1131  1371 W Tile.CastTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:447)
01-10 16:57:28.177474  1131  1371 W Tile.CastTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 16:57:28.177474  1131  1371 W Tile.CastTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 16:57:28.177474  1131  1371 W Tile.CastTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 16:57:28.177790  1297  1297 D PhoneSwitcherNetworkRequstListener: got request NetworkRequest [ TRACK_DEFAULT id=3, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:28.178281  1297  1297 D PhoneSwitcherNetworkRequstListener: got request NetworkRequest [ TRACK_DEFAULT id=6, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:28.178519  1297  1297 D PhoneSwitcherNetworkRequstListener: got request NetworkRequest [ REQUEST id=1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:28.180416  1297  1297 D TelephonyDebugService: TelephonyDebugService()
01-10 16:57:28.185060   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.187903  1297  1297 D CarrierConfigLoader: mHandler: 12 phoneId: 0
01-10 16:57:28.190539  1297  1297 D PhoneGlobals: onSubscriptionsChanged start
01-10 16:57:28.192868  1297  1297 D TelephonyUtils: isHotSwapHanppened : false
01-10 16:57:28.193010  1297  1297 D PhoneGlobals: onSubscriptionsChanged end
01-10 16:57:28.193216  1297  1297 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SERVICE_STATE
01-10 16:57:28.193288  1297  1297 D CdmaVolteServiceChecker: updateState, checking = false
01-10 16:57:28.193829  1297  1297 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 16:57:28.193934  1297  1297 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 16:57:28.194126  1297  1297 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SIM_STATE_CHANGED
01-10 16:57:28.194165  1297  1297 D CdmaVolteServiceChecker: updateState, checking = false
01-10 16:57:28.194787  1297  1297 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 16:57:28.194900  1297  1297 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 16:57:28.197172  1297  1297 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: No UICC
01-10 16:57:28.202260  1131  1451 D OpenGLRenderer: profile bars disabled
01-10 16:57:28.202573  1131  1451 D OpenGLRenderer: ambientRatio = 1.50
01-10 16:57:28.204093   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.204703  1131  1131 D WindowClient: Add to mViews: com.android.systemui.statusbar.phone.StatusBarWindowView{130c760 V.E...... ......I. 0,0-0,0}, this = android.view.WindowManagerGlobal@842c7d3
01-10 16:57:28.205868  1131  1131 D ViewRootImpl[StatusBar]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 16:57:28.214954  1131  1131 D StatusBar: disable<e i a s b h r c s q >
01-10 16:57:28.218663  1297  1297 D OpenGLRenderer: HWUI GL Pipeline
01-10 16:57:28.221672  1297  1297 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 16:57:28.221827  1297  1297 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 16:57:28.221976  1297  1297 I zygote64: Deoptimizing java.lang.Object com.mediatek.common.util.OperatorCustomizationFactoryLoader.loadFactory(android.content.Context, java.util.List, int) due to JIT inline cache
01-10 16:57:28.222232  1297  1297 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 16:57:28.222232  1297  1297 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(null_null_null:OPTeleServiceCommon.apk:com.mediatek.op.phone.plugin.CommonPhoneCustomizationFactory:com.mediatek.op.phone.plugin)
01-10 16:57:28.222740  1297  1297 D ExtensionManager: [sRttUtilExt] create ext instance: com.mediatek.phone.ext.DefaultRttUtilExt@df2d495
01-10 16:57:28.226991   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.235995  1131  1131 D PhoneStatusBarPolicy: registerAlarmClockChanged:0
01-10 16:57:28.246077   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.247200  1297  1563 D CarrierConfigLoader: update config for phoneId: 0 simState: UNKNOWN
01-10 16:57:28.247209  1297  1297 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SIM_STATE_CHANGED
01-10 16:57:28.247315  1297  1297 D CdmaVolteServiceChecker: updateState, checking = false
01-10 16:57:28.247422  1297  1563 D CarrierSvcBindHelper: update binding for phoneId: 0 simState: UNKNOWN
01-10 16:57:28.248027  1297  1297 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 16:57:28.248160  1297  1297 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 16:57:28.252104  1297  1297 D IntentBroadcaster: Broadcasting and adding intent for rebroadcast: android.intent.action.SIM_STATE_CHANGED ABSENT for slotId 0
01-10 16:57:28.254050   987   987 D MtkEapSimUtility: onReceive ACTION_SIM_STATE_CHANGED iccState: ABSENT, simSlot: 0
01-10 16:57:28.254229   987   987 D MtkEapSimUtility: resetting networks because SIM0 was removed
01-10 16:57:28.254507   987  1090 D WifiStateMachine:  InitialState !CMD_RESET_SIM_NETWORKS rt=19771/19771 0 0
01-10 16:57:28.254599   987  1090 D WifiStateMachine:  DefaultState !CMD_RESET_SIM_NETWORKS rt=19771/19771 0 0
01-10 16:57:28.256427  1281  1281 D ImsConfigReceiver: Update LatestSimState, phoneId = 0, state = ABSENT
01-10 16:57:28.256556  1281  1281 D ImsConfigReceiver: Sim state changed, event = ABSENT, check for ECC flag
01-10 16:57:28.256636  1281  1281 D ImsConfigReceiver: Sim state changed, event = ABSENT, reset broadcast flag
01-10 16:57:28.259266  1281  1281 D ImsVT Util: Received ACTION_SIM_STATE_CHANGED, slotId:0, simState:ABSENT
01-10 16:57:28.259774  1297  1297 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 16:57:28.260008  1281  1281 D ImsConfigManager: DYNAMIC_IMS_SWITCH_TRIGGER phoneId:0, simState:ABSENT
01-10 16:57:28.260185  1281  1281 D ImsConfigManager: get MtkImsConfigImpl of phone 0
01-10 16:57:28.260553  1281  1281 W ImsConfigManager: setImsResCapability to volte only w/o SIM on phone 0
01-10 16:57:28.260876  1297  1297 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 16:57:28.262563  1281  1281 D ImsConfigStorage: updateResource() comparing: curValue: 1, value:1
01-10 16:57:28.263420  1131  1131 D StatusBar: heads up is enabled
01-10 16:57:28.263417  1131  1371 D NetworkController: subscriptions is null
01-10 16:57:28.268736   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.277130  1281  1281 D ImsConfigStorage: updateResource() comparing: curValue: 0, value:0
01-10 16:57:28.288059   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.288476  1281  1281 D ImsConfigStorage: updateResource() comparing: curValue: 0, value:0
01-10 16:57:28.290287  1131  1131 W SystemUIService: Initialization of com.android.systemui.SystemBars took 1233 ms
01-10 16:57:28.297698  1297  1297 D PhoneGlobals: Radio technology switched. Now CDMA (0) is active.
01-10 16:57:28.298727  1281  1281 D ImsConfigManager: DYNAMIC_IMS_SWITCH_COMPLETE phoneId:0, simState:ABSENT
01-10 16:57:28.300712  1297  1297 D AudioTrack: set(): 0x73c8973000, streamType 0, sampleRate 0, format 0x1, channelMask 0x1, frameCount 960, flags #4, notificationFrames 0, sessionId 0, transferType 1, uid -1, pid -1
01-10 16:57:28.301253  1297  1297 D AudioTrack: set: Create AudioTrackThread, tid = 1579
01-10 16:57:28.302144  1297  1297 D AudioTrack: mNotificationFramesReq 0, notificationFrames 1024
01-10 16:57:28.302236  1131  1131 D StorageNotification: Notifying about private volume: VolumeInfo{private}:
01-10 16:57:28.302236  1131  1131 D StorageNotification:     type=PRIVATE diskId=null partGuid=null mountFlags=0 mountUserId=-1 
01-10 16:57:28.302236  1131  1131 D StorageNotification:     state=MOUNTED 
01-10 16:57:28.302236  1131  1131 D StorageNotification:     fsType=null fsUuid=null fsLabel=null 
01-10 16:57:28.302236  1131  1131 D StorageNotification:     path=/data internalPath=null 
01-10 16:57:28.303737   524   710 D AudioFlinger: track(0xf16ed200): mIsOut 1, mFrameCount 960, mSampleRate 48000, mFormat 1, mChannelCount 1, mTrackCount 0, thread 0xf1483ac0, sessionId 49
01-10 16:57:28.303927   524   710 D AudioFlinger: track(0xf16ed200): mFastIndex 1, mStreamType 0, mName 4096
01-10 16:57:28.304693  1297  1297 I AudioTrack: AUDIO_OUTPUT_FLAG_FAST successful; frameCount 960 -> 960
01-10 16:57:28.304758  1297  1297 W AudioTrack: Client adjusted notificationFrames from 1024 to 256 for frameCount 960
01-10 16:57:28.304914  1297  1297 D AudioTrack: createTrack_l: 0x73c8973000, mCblk = 0x73b94f3000, mLatency = 72, mAfLatency = 52, frameCount = 960, mSampleRate = 48000, mFlags = 0x4, mReqFrameCount = 960, mNotificationFramesAct = 256
01-10 16:57:28.305608  1297  1297 D CallNotifier: CallNotifier: mSignalInfoToneGenerator created when toneplay
01-10 16:57:28.310607   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.329528   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.332746  1297  1305 I zygote64: Do partial code cache collection, code=20KB, data=30KB
01-10 16:57:28.333196  1297  1305 I zygote64: After code cache collection, code=17KB, data=29KB
01-10 16:57:28.333241  1297  1305 I zygote64: Increasing code cache capacity to 128KB
01-10 16:57:28.338548   401   580 I SurfaceFlinger: EventThread Client Pid (1131) created
01-10 16:57:28.339968   401   580 I SurfaceFlinger: EventThread Client Pid (1131) created
01-10 16:57:28.350639   987   987 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 16:57:28.352791   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.355161  1339  1339 D SimSelectService: onReceive action=android.intent.action.ACTION_SUBINFO_RECORD_UPDATED
01-10 16:57:28.355550  1339  1339 D UtilsExt: autoSanity: false buildType: user
01-10 16:57:28.355658  1339  1339 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 16:57:28.357856   987  1002 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 16:57:28.358296  1339  1339 D SimSelectService: sub info update, type = 4, subs = null
01-10 16:57:28.358407  1339  1339 D SimSelectService: extra value no change, return
01-10 16:57:28.361114  1131  1371 D NetworkController: subscriptions is null
01-10 16:57:28.362692  1131  1371 D NetworkController: updateMobileControllers detectedType: 4
01-10 16:57:28.368975  1131  1371 D NetworkController: isEmergencyOnly No sims 
01-10 16:57:28.371489   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.385389  1131  1507 D KeyguardViewMediator: lockedOrMissing is false, requireSim=false, antiTheftLocked=false remoteLocked = false
01-10 16:57:28.389577  1297  1297 D OP20RoamingSettingsReceiver: Subinfo Record Update: -2
01-10 16:57:28.394154   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.397092  1297  1297 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 16:57:28.397948  1297  1297 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 16:57:28.402416  1131  1131 I Choreographer: Skipped 71 frames!  The application may be doing too much work on its main thread.
01-10 16:57:28.409487  1131  1507 D KeyguardViewMediator: onBootCompleted() is called
01-10 16:57:28.413031   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.428533  1131  1131 D ViewRootImpl[StatusBar]: changeCanvasOpacity: opaque=true
01-10 16:57:28.434487   523   549 D AAL     : 01-10 04:57:28.226 BL= 371,ESS= 256, 01-10 04:57:28.262 BL= 370,ESS= 256, 01-10 04:57:28.319 BL= 369,ESS= 256, 01-10 04:57:28.357 BL= 368,ESS= 256, 01-10 04:57:28.434 BL= 367,ESS= 256, 
01-10 16:57:28.436112   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.454804   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.478086   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.487951  1297  1297 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 16:57:28.488017  1297  1297 D ImsExternalCallTracker: refreshCallPullState
01-10 16:57:28.488065  1297  1305 I zygote64: Compiler allocated 5MB to compile void com.mediatek.internal.telephony.MtkServiceStateTracker.pollStateDone()
01-10 16:57:28.489677  1297  1297 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 16:57:28.497203   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.512225  1297  1297 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 16:57:28.515324  1297  1297 I chatty  : uid=1001(radio) com.android.phone identical 2 lines
01-10 16:57:28.516090  1297  1297 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 16:57:28.518062  1297  1297 D ExtensionManager: [sGttInfoExt] create ext instance: com.mediatek.phone.ext.DefaultGttInfoExt@5062676
01-10 16:57:28.518261  1297  1297 D CarrierConfigLoader: mHandler: 0 phoneId: 0
01-10 16:57:28.518480  1297  1297 D CarrierSvcBindHelper: mHandler: 0
01-10 16:57:28.518595  1297  1297 D CarrierSvcBindHelper: Rebinding if necessary for phoneId: 0
01-10 16:57:28.519307  1297  1297 D CarrierSvcBindHelper: No carrier app for: 0
01-10 16:57:28.519895   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.521936  1297  1297 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 16:57:28.522694  1297  1297 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 16:57:28.531659  1131  1131 D SignalClusterView: hasCorrectSubs, subsInfo:[],--mPhoneStates:[]
01-10 16:57:28.538676   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.540050  1297  1564 D CarrierConfigLoader: update config for phoneId: 0 simState: ABSENT
01-10 16:57:28.540282  1297  1564 D CarrierSvcBindHelper: update binding for phoneId: 0 simState: ABSENT
01-10 16:57:28.544978  1297  1297 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SIM_STATE_CHANGED
01-10 16:57:28.545119  1297  1297 D CdmaVolteServiceChecker: updateState, checking = false
01-10 16:57:28.545265  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 16:57:28.545770  1297  1297 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 16:57:28.545902  1297  1297 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 16:57:28.548531  1297  1297 D PhoneGlobals: onSubscriptionsChanged start
01-10 16:57:28.550524  1297  1297 D TelephonyUtils: isHotSwapHanppened : false
01-10 16:57:28.550702  1297  1297 D PhoneGlobals: onSubscriptionsChanged end
01-10 16:57:28.551338  1297  1305 I zygote64: Do partial code cache collection, code=54KB, data=62KB
01-10 16:57:28.551631  1297  1305 I zygote64: After code cache collection, code=54KB, data=62KB
01-10 16:57:28.551709  1297  1305 I zygote64: Increasing code cache capacity to 256KB
01-10 16:57:28.552640  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 16:57:28.553185  1297  1297 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 16:57:28.562082   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.581036   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.584574  1297  1297 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SERVICE_STATE
01-10 16:57:28.584731  1297  1297 D CdmaVolteServiceChecker: updateState, checking = false
01-10 16:57:28.585497  1297  1297 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 16:57:28.585612  1297  1297 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 16:57:28.587304   559   559 D NVRAM   : NVRAM daemon sync start !
01-10 16:57:28.595637  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:28.595694  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:28.595738  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:28.600775   559   559 D NVRAM   : NVRAM daemon sync end !
01-10 16:57:28.600853   559   559 D NVRAM   : NVRAM daemon exits !
01-10 16:57:28.602494  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:28.602575  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:28.602610  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:28.603908   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.603948  1297  1297 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:28.610894  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:28.611060  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:28.611103  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:28.620233  1297  1297 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 16:57:28.622704   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.645290   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.653070  1131  1371 D NetworkController: isEmergencyOnly No sims 
01-10 16:57:28.659124  1297  1297 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 16:57:28.660721  1297  1297 D CarrierConfigLoader: mHandler: 0 phoneId: 0
01-10 16:57:28.660863  1297  1297 D CarrierSvcBindHelper: mHandler: 0
01-10 16:57:28.660908  1297  1297 D CarrierSvcBindHelper: Rebinding if necessary for phoneId: 0
01-10 16:57:28.661604  1297  1297 D CarrierSvcBindHelper: No carrier app for: 0
01-10 16:57:28.661735  1297  1297 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 16:57:28.661806  1297  1297 D ImsExternalCallTracker: refreshCallPullState
01-10 16:57:28.663486  1297  1297 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 16:57:28.663659   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.687152   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.688856   401   401 I BufferQueue: [unnamed-401-3](this:0x740443e800,id:3,api:0,p:-1,c:-1) BufferQueue core=(401:/system/bin/surfaceflinger)
01-10 16:57:28.689514   401   401 W GuiExt  : Cannot find GuiExtService
01-10 16:57:28.689820   401   401 I BufferQueueConsumer: [unnamed-401-3](this:0x740443e800,id:3,api:0,p:-1,c:401) connect(C): consumer=(401:/system/bin/surfaceflinger) controlledByApp=false
01-10 16:57:28.689934   401   401 I BufferQueueConsumer: [unnamed-401-3](this:0x740443e800,id:3,api:0,p:-1,c:401) setConsumerName: unnamed-401-3
01-10 16:57:28.689990   401   401 I BufferQueueConsumer: [StatusBar#0](this:0x740443e800,id:3,api:0,p:-1,c:401) setConsumerName: StatusBar#0
01-10 16:57:28.690045   401   401 I BufferQueueConsumer: [StatusBar#0](this:0x740443e800,id:3,api:0,p:-1,c:401) setDefaultBufferSize: width=720 height=48
01-10 16:57:28.693619  1297  1297 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only global URI.
01-10 16:57:28.695359  1131  1131 D Surface : Surface::allocateBuffers(this=0x73b8db7000)
01-10 16:57:28.697425   523   549 D AAL     : 01-10 04:57:28.489 BL= 366,ESS= 256, 01-10 04:57:28.526 BL= 365,ESS= 256, 01-10 04:57:28.583 BL= 364,ESS= 256, 01-10 04:57:28.643 BL= 363,ESS= 256, 01-10 04:57:28.697 BL= 362,ESS= 256, 
01-10 16:57:28.705396   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.705790  1131  1451 I zygote64: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 16:57:28.706103  1131  1451 I OpenGLRenderer: Initialized EGL, version 1.4
01-10 16:57:28.706218  1131  1451 D OpenGLRenderer: Swap behavior 2
01-10 16:57:28.708357  1131  1131 D StatusBar: disable<e i a s b H!R!c s q >
01-10 16:57:28.712235   987  1089 D WifiHandler.WifiService: Received message=69633d sendingUid=10021
01-10 16:57:28.712591   987  1089 D WifiHandler.WifiService: Received message=69632d sendingUid=-1
01-10 16:57:28.721348  1131  1451 D OpenGLRenderer: [init] completed
01-10 16:57:28.721505  1131  1451 D HWUIExtension: MTKProgramCache.init: enable enhancement 1
01-10 16:57:28.721712  1131  1451 I HWUIExtension: Get disable program binary service property (0)
01-10 16:57:28.721741  1131  1451 I HWUIExtension: Initializing program atlas...
01-10 16:57:28.723010  1131  1451 I ProgramBinary/Service: ProgramBinaryService client side disable debugging.
01-10 16:57:28.723139  1131  1451 I ProgramBinary/Service: ProgramBinaryService client side disable binary content debugging.
01-10 16:57:28.723154  1131  1451 D ProgramBinary/Service: BpProgramBinaryService.getReady
01-10 16:57:28.723181  1131  1451 D ProgramBinary/Service: zhiyin- 1 BpProgramBinaryService::getReady()
01-10 16:57:28.723407   571   571 D ProgramBinary/Service: zhiyin- ontransact 1 code 1
01-10 16:57:28.723493   571   571 D ProgramBinary/Service: zhiyin- ontransact 2 code 1
01-10 16:57:28.723521   571   571 D ProgramBinary/Service: zhiyin- ontransact 3 code 1
01-10 16:57:28.723687  1131  1451 D ProgramBinary/Service: zhiyin- 2 BpProgramBinaryService::getReady()
01-10 16:57:28.723738  1131  1451 D ProgramBinary/Service: BpProgramBinaryService.getProgramBinaryData
01-10 16:57:28.723828   571   571 D ProgramBinary/Service: zhiyin- ontransact 1 code 3
01-10 16:57:28.724123  1131  1451 I HWUIExtension: Program binary detail: Binary length is 188172, program map length is 104.
01-10 16:57:28.724312  1131  1451 I HWUIExtension: Succeeded to mmap program binaries. File descriptor is 92, and path is /dev/ashmem.
01-10 16:57:28.724365  1131  1451 I HWUIExtension: No need to use file discriptor anymore, close fd(92).
01-10 16:57:28.724512  1131  1451 D HWUIExtension: Dumper init 4 threads <0x73b83e4f00>
01-10 16:57:28.724662  1131  1451 D HWUIExtension: <com.android.systemui> is running.
01-10 16:57:28.724752  1131  1451 D HWUIExtension: Initializing program cache from 0x0, size = -1
01-10 16:57:28.725293  1131  1451 D Surface : Surface::connect(this=0x73b8db7000,api=1)
01-10 16:57:28.725951   401   420 I BufferQueueProducer: [StatusBar#0](this:0x740443e800,id:3,api:1,p:1131,c:401) connect(P): api=1 producer=(1131:com.android.systemui) producerControlledByApp=true
01-10 16:57:28.728572  1131  1451 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 16:57:28.728844   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.730000   548   548 W HwBinder:548_2: type=1400 audit(0.0:47): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:28.732491   548   884 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:28.737487  1131  1472 E WallpaperManager: /enterprise/wallpaper not exists
01-10 16:57:28.742643   401   401 I BufferQueue: [unnamed-401-4](this:0x7404455800,id:4,api:0,p:-1,c:-1) BufferQueue core=(401:/system/bin/surfaceflinger)
01-10 16:57:28.743151   401   401 W GuiExt  : Cannot find GuiExtService
01-10 16:57:28.743397   401   401 I BufferQueueConsumer: [unnamed-401-4](this:0x7404455800,id:4,api:0,p:-1,c:401) connect(C): consumer=(401:/system/bin/surfaceflinger) controlledByApp=false
01-10 16:57:28.743476   401   401 I BufferQueueConsumer: [unnamed-401-4](this:0x7404455800,id:4,api:0,p:-1,c:401) setConsumerName: unnamed-401-4
01-10 16:57:28.743522   401   401 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x7404455800,id:4,api:0,p:-1,c:401) setConsumerName: com.android.systemui.ImageWallpaper#0
01-10 16:57:28.743575   401   401 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x7404455800,id:4,api:0,p:-1,c:401) setDefaultBufferSize: width=720 height=720
01-10 16:57:28.747034   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.770596   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.782491  1131  1140 I zygote64: Do partial code cache collection, code=29KB, data=29KB
01-10 16:57:28.785076  1131  1140 I zygote64: After code cache collection, code=29KB, data=29KB
01-10 16:57:28.785134  1131  1140 I zygote64: Increasing code cache capacity to 128KB
01-10 16:57:28.788802   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.788883  1131  1131 D SignalClusterView: hasCorrectSubs, subsInfo:[],--mPhoneStates:[]
01-10 16:57:28.799373  1297  1297 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 16:57:28.800551  1297  1297 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SERVICE_STATE
01-10 16:57:28.800639  1297  1297 D CdmaVolteServiceChecker: updateState, checking = false
01-10 16:57:28.801276  1297  1297 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 16:57:28.801410  1297  1297 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 16:57:28.809651  1297  1297 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 16:57:28.812543   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.815272  1515  1515 I PPL/PlatformManager: Bring service to foreground
01-10 16:57:28.816884  1297  1297 I VvmSimStateTracker: android.intent.action.SIM_STATE_CHANGED
01-10 16:57:28.819959  1297  1297 D OP20RoamingSettingsReceiver: Subinfo Record Update: -2
01-10 16:57:28.821583   543   587 I PPL/PPLAgent: checkCallerUidPermission(code:1,  uid:1000)
01-10 16:57:28.821720   543   587 I PPL/PPLAgent: OnTransact(1,16)
01-10 16:57:28.821741   543   587 I PPL/PPLAgent: readControlData enter
01-10 16:57:28.821767   543   587 W Parcel  : **** enforceInterface() expected 'PPLAgent' but read 'com.mediatek.internal.telephony.ppl.IPplAgent'
01-10 16:57:28.821803   543   587 I PPL/PPLAgent: enforceInterface fail
01-10 16:57:28.821826   543   587 I PPL/PPLAgent: readControlData enter
01-10 16:57:28.821916   543   587 D PPL/PPLAgent: open control data file error = No such file or directory
01-10 16:57:28.821954   543   587 I PPL/PPLAgent: readControlData exit
01-10 16:57:28.822248  1515  1515 W PPL/ControlData: buildControlData: data is empty, return empty instance
01-10 16:57:28.822385  1515  1515 D PPL/PPLManager: mCache.status = 0
01-10 16:57:28.822787  1515  1515 D PPL/PPLService: onStartCommand(Intent { act=android.intent.action.SIM_STATE_CHANGED flg=0x5000010 cmp=com.mediatek.ppl/.PplService (has extras) })
01-10 16:57:28.822894  1515  1515 D PPL/PPLService: action is android.intent.action.SIM_STATE_CHANGED
01-10 16:57:28.822969  1515  1515 I PPL/PPLService: Privacy Protection Lock is disabled. Exit.
01-10 16:57:28.823654  1297  1297 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 16:57:28.825579  1515  1515 D PPL/PlatformManager: Exec stopForeground with para true.
01-10 16:57:28.831535  1515  1515 I PPL/PlatformManager: Bring service to foreground
01-10 16:57:28.832021   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.832102  1297  1297 I VvmSimStateTracker: android.intent.action.SIM_STATE_CHANGED
01-10 16:57:28.837278  1297  1297 D OP20RoamingSettingsReceiver: Subinfo Record Update: -2
01-10 16:57:28.839553   543   587 I PPL/PPLAgent: checkCallerUidPermission(code:1,  uid:1000)
01-10 16:57:28.839653   543   587 I PPL/PPLAgent: OnTransact(1,16)
01-10 16:57:28.839672   543   587 I PPL/PPLAgent: readControlData enter
01-10 16:57:28.839700   543   587 W Parcel  : **** enforceInterface() expected 'PPLAgent' but read 'com.mediatek.internal.telephony.ppl.IPplAgent'
01-10 16:57:28.840018   543   587 I PPL/PPLAgent: enforceInterface fail
01-10 16:57:28.840052   543   587 I PPL/PPLAgent: readControlData enter
01-10 16:57:28.840012  1297  1297 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 16:57:28.840117   543   587 D PPL/PPLAgent: open control data file error = No such file or directory
01-10 16:57:28.840146   543   587 I PPL/PPLAgent: readControlData exit
01-10 16:57:28.841042  1515  1515 W PPL/ControlData: buildControlData: data is empty, return empty instance
01-10 16:57:28.841280  1515  1515 D PPL/PPLManager: mCache.status = 0
01-10 16:57:28.841874  1515  1515 D PPL/PPLService: onStartCommand(Intent { act=android.intent.action.SIM_STATE_CHANGED flg=0x5000010 cmp=com.mediatek.ppl/.PplService (has extras) })
01-10 16:57:28.842025  1515  1515 D PPL/PPLService: action is android.intent.action.SIM_STATE_CHANGED
01-10 16:57:28.842058  1515  1515 I PPL/PPLService: Privacy Protection Lock is disabled. Exit.
01-10 16:57:28.845614  1515  1515 D PPL/PlatformManager: Exec stopForeground with para true.
01-10 16:57:28.845956   401   580 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) queueBuffer: fps=23.88 dur=1005.08 max=45.31 min=38.23
01-10 16:57:28.851542  1297  1297 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 16:57:28.854415   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.854861  1297  1297 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 16:57:28.872809   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.896052   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.907974   789   925 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 16:57:28.908391   789   925 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 16:57:28.908449   789   925 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 16:57:28.914029   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.923061   523   549 D AAL     : 01-10 04:57:28.734 BL= 361,ESS= 256, 01-10 04:57:28.791 BL= 360,ESS= 256, 01-10 04:57:28.828 BL= 359,ESS= 256, 01-10 04:57:28.885 BL= 358,ESS= 256, 01-10 04:57:28.922 BL= 357,ESS= 256, 
01-10 16:57:28.933728   987  1108 D AudioSystem: +setParameters(): A2dpSuspended=false 
01-10 16:57:28.934496   380   699 D AudioALSAHardware: +setParameters(): A2dpSuspended=false
01-10 16:57:28.934881   380   699 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "A2dpSuspended=false"
01-10 16:57:28.934984   380   699 D AudioALSAHardware: -setParameters(): A2dpSuspended=false 
01-10 16:57:28.935897   987  1108 D AudioService: setBluetoothScoOnInt : false, eventSource = resetBluetoothSco
01-10 16:57:28.936073   987  1108 D AudioSystem: +setParameters(): BT_SCO=off 
01-10 16:57:28.936483   380   699 D AudioALSAHardware: +setParameters(): BT_SCO=off
01-10 16:57:28.936766   380   699 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "BT_SCO=off"
01-10 16:57:28.936838   380   699 D AudioALSAHardware: -setParameters(): BT_SCO=off 
01-10 16:57:28.937842   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.937859   524   710 D APM_AudioPolicyManager: setForceUse() usage 0, config 0, mPhoneState 0
01-10 16:57:28.938140   524   710 D APM_AudioPolicyManager: setForceUse() usage 2, config 0, mPhoneState 0
01-10 16:57:28.955682   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:28.958239  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 16:57:28.964548  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 16:57:28.979917   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:28.997869   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:29.021562   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:29.038806  1281  1309 I VT      : [VTC] notifyCallback
01-10 16:57:29.039187  1281  1309 D ImsVT Util: recordGet id = 0, size = 0
01-10 16:57:29.039251   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:29.039388  1281  1309 I ImsVT   : [ID=0] [postEventFromNative]: 4014
01-10 16:57:29.039465  1281  1309 D ImsVT   : postEventFromNative : msg = SESSION_EVENT_GET_CAP
01-10 16:57:29.039520  1281  1309 D VT SRC  : [STC] [getAllCameraResolutions] Start
01-10 16:57:29.040591  1281  1309 I CameraManagerGlobal: Connecting to camera service
01-10 16:57:29.059197  1131  1131 D StatusBarKeyguardViewManager: show() is called.
01-10 16:57:29.063315  1131  1131 D StatusBarKeyguardViewManager: reset() is called, mShowing = true ,mOccluded = falsehideBouncerWhenShowing = true
01-10 16:57:29.063403  1131  1131 D StatusBarKeyguardViewManager: showBouncerOrKeyguard() is called.
01-10 16:57:29.063570   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:29.064562  1281  1309 D VT SRC  : [STC] [getAllCameraResolutions] resolution size:1
01-10 16:57:29.064750  1281  1309 D VT SRC  : [STC] [getAllCameraResolutions] Finish
01-10 16:57:29.064819   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:27.810345,dur:1006.82,max:88.31,min:5.36
01-10 16:57:29.066638  1281  1309 D ImsVT   : SIM state ABSENT
01-10 16:57:29.066805  1281  1309 I VT      : [JNI] Entering SetCameraParameters
01-10 16:57:29.067235   530   856 I VT      : [SRV] [OPERATION][ID=0] setCameraParameters
01-10 16:57:29.067340   530   856 I VT      : sim_id:0, major_sim_id:-1, sensorCnt:1
01-10 16:57:29.067364   530   856 I VT      : sensor[0]: id=0, width=4160, height=4160, degree=90, facing=1
01-10 16:57:29.067410   530   856 D [VT]ImsMa: [setSensorParameters]Line 946 [ID=0][enter]=======
01-10 16:57:29.067462   530   856 D [VT]ImsMa: [setSensorParameters]Line 965 [ID=0]we have 1 sensor mSensorInfos = 0xf159b078
01-10 16:57:29.067483   530   856 I [VT]ImsMa: [setSensorParameters]Line 979 tempLocal: 0xf159b078,index 0 W:4160, H:4160, D:90,F:1
01-10 16:57:29.067509   530   856 D [VT]ImsMa: [setSensorParameters]Line 1056 [ID=0]max w 4160,max h 4160, prefer 1
01-10 16:57:29.067562   530   856 I VT      : [SRV] getCurrentOperator start
01-10 16:57:29.067813   530   856 I VT      : [SRV] getCurrentOperator operatorPropetyString : persist.radio.sim.opid_-1
01-10 16:57:29.067835   530   856 I VT      : [SRV] getCurrentOperator multiPs : 1
01-10 16:57:29.067849   530   856 I VT      : [SRV] getCurrentOperator labOp : 0
01-10 16:57:29.067867   530   856 I VT      : [SRV] getCurrentOperator finish : SIM absent, return default op code = 8
01-10 16:57:29.067893   530   856 E VT      : [SRV]   [MAP OPERATION] [SIM ID=-1] setOperatorId (not found)
01-10 16:57:29.067911   530   856 D [VT]ImsMa: [getRtpRtcpCapability]Line 1196 [ID=0][enter]======= operatorID=8
01-10 16:57:29.067957   530   856 D [VT][RTP]IRTPController: getCapability,capArray 0xf1834858,pNumOfCap 0xf18347eb,media type 0x1,
01-10 16:57:29.068001   530   856 D [VT][RTP]IRTPController: getCapability,create video capability
01-10 16:57:29.068051   530   856 D [VT][RTP]IRTPController: enable_avpf 2 operatorID=8 rtp_profile=3
01-10 16:57:29.068076   530   856 D [VT][RTP]IRTPController: 	 media(0x1),mime(0x1),profile(0x3),sampleRate(90000)
01-10 16:57:29.068089   530   856 D [VT][RTP]IRTPController: 	 ext_header_num:1
01-10 16:57:29.068102   530   856 D [VT][RTP]IRTPController: 	 ext_header[0]:id(7),uri(urn:3gpp:video-orientation)
01-10 16:57:29.068116   530   856 D [VT][RTP]IRTPController: 	 packetize_mode(3),rtcp_rsize(0)
01-10 16:57:29.068127   530   856 I [VT][RTP]IRTPController: getCapability,sizeof(1056)
01-10 16:57:29.068139   530   856 I [VT][RTP]IRTPController: getCapability,temp_size(128)
01-10 16:57:29.068152   530   856 I [VT][RTP]IRTPController: getCapability,3-id:4,3-param:5,sub:
01-10 16:57:29.068162   530   856 D [VT][RTP]IRTPController: 	 fb_num(6)
01-10 16:57:29.068178   530   856 D [VT][RTP]IRTPController: 	 Feedback[0]:fb_id(2),fb_param(1),fb_sub_param()
01-10 16:57:29.068195   530   856 D [VT][RTP]IRTPController: 	 Feedback[1]:fb_id(2),fb_param(2),fb_sub_param()
01-10 16:57:29.068211   530   856 D [VT][RTP]IRTPController: 	 Feedback[2]:fb_id(2),fb_param(3),fb_sub_param()
01-10 16:57:29.068227   530   856 D [VT][RTP]IRTPController: 	 Feedback[3]:fb_id(4),fb_param(5),fb_sub_param()
01-10 16:57:29.068254   530   856 D [VT][RTP]IRTPController: 	 Feedback[4]:fb_id(3),fb_param(1000),fb_sub_param()
01-10 16:57:29.068272   530   856 D [VT][RTP]IRTPController: 	 Feedback[5]:fb_id(4),fb_param(6),fb_sub_param()
01-10 16:57:29.068282   530   856 D [VT][RTP]IRTPController: getCapability 1 support HEVC
01-10 16:57:29.068305   530   856 I [VT][RTP]IRTPController: getCapability,cap array first item address:0xf15b7000, cap num:2 rtp_profile(3)
01-10 16:57:29.068324   530   856 D [VT][MADebug]: [PrintRtpRtpCap]Line 46 ================RtpRtcpCap====================
01-10 16:57:29.068366   530   856 D [VT][MADebug]: [PrintRtpRtpCap]Line 47 media_type               1
01-10 16:57:29.068382   530   856 D [VT][MADebug]: [PrintRtpRtpCap]Line 48 mime_Type                4
01-10 16:57:29.068396   530   856 D [VT][MADebug]: [PrintRtpRtpCap]Line 49 rtp_profile              3
01-10 16:57:29.068411   530   856 D [VT][MADebug]: [PrintRtpRtpCap]Line 50 sample_rate              90000
01-10 16:57:29.068426   530   856 D [VT][MADebug]: [PrintRtpRtpCap]Line 51 packetize_mode           3
01-10 16:57:29.068449   530   856 D [VT][MADebug]: [PrintRtpRtpCap]Line 52 rtp_header_extension_num 1
01-10 16:57:29.068464   530   856 D [VT][MADebug]: [PrintRtpRtpCap]Line 53 rtcp_fb_param_num        6
01-10 16:57:29.068479   530   856 D [VT]ImsMa: [getRtpRtcpCapability]Line 1204 [ID=0][exit]=======
01-10 16:57:29.068522   530   856 I [VT]VcodecCap: [getSensorLevel] resolution = 4160 x 4160, level = 25
01-10 16:57:29.068631   530   856 I [VT]VcodecCap: [getVideoProperty] f:1,P:0,L:0,F:0,B:0,I:0
01-10 16:57:29.068652   530   856 I [VT]VcodecCap: pthread_mutex_init MediaProfileListLock
01-10 16:57:29.068685   530   856 I [VT]VcodecCap: createMediaProfile(): /system/vendor/etc/vilte/viLTE_media_profiles_op8.xml
01-10 16:57:29.068976   530   856 I [VT]VcodecCap: createH264DefaultMediaProfile() default profile table(op8), count = 21
01-10 16:57:29.069006   530   856 I [VT]VcodecCap: createHEVCDefaultMediaProfile() default profile table(op8)
01-10 16:57:29.069023   530   856 I [VT]VcodecCap: createH264QualtiyMediaProfile: default setting
01-10 16:57:29.069050   530   856 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_3, 640x480, 30 fps, 416 kbps, i period: 1)
01-10 16:57:29.069083   530   856 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_1_2, 320x240, 15 fps, 416 kbps, i period: 1)
01-10 16:57:29.069116   530   856 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_1_2, 320x240, 15 fps, 416 kbps, i period: 1)
01-10 16:57:29.069140   530   856 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_1_1, 320x240, 10 fps, 270 kbps, i period: 1)
01-10 16:57:29.069158   530   856 I [VT]VcodecCap: setFormat(1)
01-10 16:57:29.069208   530   856 I [VT]VcodecCap: [getSensorLevel] resolution = 4160 x 4160, level = 25
01-10 16:57:29.069248   530   856 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=6(VIDEO_LEVEL_1_2), max_level=6(VIDEO_LEVEL_1_2)
01-10 16:57:29.069587   530   856 E libc    : Access denied finding property "mtk.vdec.log"
01-10 16:57:29.069891   530   856 I         : isVTService(/system/bin/vtservice)
01-10 16:57:29.070031   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.070193   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.070638  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:29.070727  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.070767  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.072015   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.074578   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.075010   530   856 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 16:57:29.075926   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.076024   530   856 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00c8d8d41e14d3505020207844237)
01-10 16:57:29.076308   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.076817   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.078170   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.078201   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.078553   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.078621   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.079930   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.081130   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:29.081773   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.082073   530   856 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 16:57:29.082989   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.083089   530   856 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 16:57:29.083355   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.083911   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.085294   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.085320   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.085461   530   856 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00c, max_recv_level=12,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LADI2NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 16:57:29.085510   530   856 D [VT][MADebug]: [printCodecParam]Line 69 ================printCodecParam====================
01-10 16:57:29.085542   530   856 D [VT][MADebug]: [printCodecParam]Line 73 format   =  VIDEO_H264
01-10 16:57:29.085556   530   856 D [VT][MADebug]: [printCodecParam]Line 74 Width   =  240
01-10 16:57:29.085570   530   856 D [VT][MADebug]: [printCodecParam]Line 75 height   =  320
01-10 16:57:29.085586   530   856 D [VT][MADebug]: [printCodecParam]Line 76 frame-rate   =  15
01-10 16:57:29.085603   530   856 D [VT][MADebug]: [printH264CodecParam]Line 12 profile_level_id               =0x42c00c
01-10 16:57:29.085620   530   856 D [VT][MADebug]: [printH264CodecParam]Line 13 max_recv_level                 =12
01-10 16:57:29.085635   530   856 D [VT][MADebug]: [printH264CodecParam]Line 15 sprop_parameter_sets       =Z0LADI2NQeFNNQUCAgeEQjc=,aMpDyA==
01-10 16:57:29.085650   530   856 D [VT][MADebug]: [printH264CodecParam]Line 16 sprop_level_parameter_sets =
01-10 16:57:29.085666   530   856 D [VT][MADebug]: [printH264CodecParam]Line 26 video_b_as                     =0
01-10 16:57:29.085682   530   856 D [VT][MADebug]: [printH264CodecParam]Line 27 packetization_mode         =1
01-10 16:57:29.085700   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] codec_num = 1
01-10 16:57:29.085738   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] Save default local size W=320, H=240)
01-10 16:57:29.085758   530   856 D [VT]ImsMa: [getCodecParameterSets]Line 1145 [ID=0][enter]===informat 1 quality=0x1====
01-10 16:57:29.085795   530   856 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1 opID 8
01-10 16:57:29.085834   530   856 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1, vprofile:VIDEO_PROFILE_BASELINE, vlevel:VIDEO_LEVEL_3
01-10 16:57:29.085881   530   856 D [VT]ImsMa: [getCodecParameterSets]Line 1166 [ID=0] Numbers 7 
01-10 16:57:29.085919   530   856 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1 opID 8
01-10 16:57:29.085956   530   856 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1, vprofile:VIDEO_PROFILE_BASELINE, vlevel:VIDEO_LEVEL_3
01-10 16:57:29.085983   530   856 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=5(VIDEO_LEVEL_1_1), max_level=5(VIDEO_LEVEL_1_1)
01-10 16:57:29.086302   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.086391   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.087720   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.089563   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.089849   530   856 I VDO_LOG : Profile:66, Level:11, wfd=0, vilte=0, bitrate=270, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 16:57:29.090683   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.090786   530   856 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00b8d8d41e14d3505020207844237)
01-10 16:57:29.091110   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.091615   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.093043   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.093085   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.093600   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.094404  1131  1131 V KeyguardSecurityView: showPrimarySecurityScreen(securityMode=None)
01-10 16:57:29.094540  1131  1131 D VoiceWakeupManagerProxy: getInstance(...) is called.
01-10 16:57:29.066000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:48): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_vdec_prop:s0" dev="tmpfs" ino=1138 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_vdec_prop:s0 tclass=file permissive=0
01-10 16:57:29.074000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:49): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.082000   530   530 I chatty  : uid=1000(system) /system/bin/vtservice identical 1 line
01-10 16:57:29.086000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:51): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.094611  1131  1131 D KeyguardSecurityView: showSecurityScreen() - get oldview forInvalid, get newview forNone
01-10 16:57:29.094713  1131  1131 D KeyguardSecurityView: Before update, mCurrentSecuritySelection = NoneAfter update, mCurrentSecuritySelection = None
01-10 16:57:29.094884  1131  1131 D StatusBarKeyguardViewManager: setNeedsInput() - needsInput = false
01-10 16:57:29.096162  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:29.096211  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.096240  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.097256  1131  1131 D StatusBarKeyguardViewManager: needsFullscreenBouncer() is false,show "Notification Keyguard" view.
01-10 16:57:29.103648  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:29.103726  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.103757  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.105307   481   497 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 16:57:29.105796   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.107202   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.109820   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.110030   530   856 I VDO_LOG : Profile:66, Level:11, wfd=0, vilte=0, bitrate=270, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 16:57:29.110701   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.110783   530   856 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 16:57:29.111034   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.106000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:52): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.111647   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.113039   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.113090   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.113265   530   856 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00b, max_recv_level=11,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAC42NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 16:57:29.113315   530   856 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=6(VIDEO_LEVEL_1_2), max_level=6(VIDEO_LEVEL_1_2)
01-10 16:57:29.113577   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.114664   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.116120   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.116766  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:29.116828  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.116865  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.118751   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.119006   530   856 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 16:57:29.119703   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.119801   530   856 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00c8d8d41e14d3505020207844237)
01-10 16:57:29.119967  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:29.120018   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.120020  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.120066  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.118000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:53): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.120549   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.121961   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.122017   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.122441   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.122682   481   497 D skia    : SkJpegCodec::onGetPixels -
01-10 16:57:29.123612   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.125125   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.125582  1131  1131 D StatusBar: disable<e i a s b H R c s q >
01-10 16:57:29.128123   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.128419   530   856 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 16:57:29.129272   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.129364   530   856 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 16:57:29.129583   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.126000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:54): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.130162   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.131781   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.131886   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.132174   530   856 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00c, max_recv_level=12,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LADI2NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 16:57:29.132296   530   856 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=7(VIDEO_LEVEL_1_3), max_level=7(VIDEO_LEVEL_1_3)
01-10 16:57:29.132791   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.133684  1131  1131 D NetworkController: isEmergencyOnly No sims 
01-10 16:57:29.133986   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.134063  1131  1131 D StatusBar: disable<e i a s b H R c s q >
01-10 16:57:29.134302  1131  1371 I FlashlightTile: flashLightEnable,mState.value:----false,false
01-10 16:57:29.135466  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:29.135543  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.135573  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.135864   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.136183  1131  1131 V KeyguardSecurityView: showPrimarySecurityScreen(securityMode=None)
01-10 16:57:29.138660   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.138816  1131  1131 D StatusBarKeyguardViewManager: updateStates() - showing = true, mLastShowing = false
01-10 16:57:29.138816  1131  1131 D StatusBarKeyguardViewManager: updateStates() - occluded = falsemLastOccluded = false
01-10 16:57:29.138816  1131  1131 D StatusBarKeyguardViewManager: updateStates() - bouncerShowing = false, mLastBouncerShowing = false
01-10 16:57:29.138816  1131  1131 D StatusBarKeyguardViewManager: updateStates() - mFirstUpdate = true
01-10 16:57:29.138902   530   856 I VDO_LOG : Profile:66, Level:13, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 16:57:29.138981  1131  1131 D StatusBarKeyguardViewManager: updateStates() - setBouncerShowing(false)
01-10 16:57:29.139223  1131  1131 D StatusBar: disable<e i a s b H R c s q >
01-10 16:57:29.139635   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.139732   530   856 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00d8d8d41e14d3505020207844237)
01-10 16:57:29.139954   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.138000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:55): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.140499   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.141928   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.141997   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.142454   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.143586   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.145010   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.147332  1131  1131 D KeyguardViewMediator: handle show call mKeyguardDisplayManager.show()
01-10 16:57:29.147841   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.148072   530   856 I VDO_LOG : Profile:66, Level:13, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 16:57:29.148806   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.148920   530   856 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 16:57:29.149222   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.146000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:56): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.149801   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.151225   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.151291   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.151468   530   856 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00d, max_recv_level=13,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LADY2NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 16:57:29.151523   530   856 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=8(VIDEO_LEVEL_2), max_level=8(VIDEO_LEVEL_2)
01-10 16:57:29.151785   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.152845   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.154239   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.156915   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.157150   530   856 I VDO_LOG : Profile:66, Level:20, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=288, Height=352, BufW=288, BufH=352, NonRefP=0, f:3
01-10 16:57:29.158110   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.158199   530   856 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c0148d8d40905b4d41408081e1108dc0)
01-10 16:57:29.158252  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:29.158313  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.158375  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.158434   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.154000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:57): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.159091   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.160521   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.160586   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.160999   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.161325  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 16:57:29.161370  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.161404  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.162058   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.162879  1131  1131 D StatusBar: disable<e i a s b H R c s q >
01-10 16:57:29.163279  1131  1131 D StatusBar: disable<e i a s b H R c s q >
01-10 16:57:29.163446   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.166105   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.166335   530   856 I VDO_LOG : Profile:66, Level:20, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=288, Height=352, BufW=288, BufH=352, NonRefP=0, f:3
01-10 16:57:29.166589   987  1079 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 16:57:29.167176  1131  1131 I Choreographer: Skipped 39 frames!  The application may be doing too much work on its main thread.
01-10 16:57:29.167258   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.167307   530   856 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 16:57:29.167520   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.166000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:58): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.167947   523   549 D AAL     : 01-10 04:57:28.979 BL= 356,ESS= 256, 01-10 04:57:29.017 BL= 355,ESS= 256, 01-10 04:57:29.075 BL= 354,ESS= 256, 01-10 04:57:29.111 BL= 353,ESS= 256, 01-10 04:57:29.167 BL= 352,ESS= 256, 
01-10 16:57:29.167986   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.169457   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.169514   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.169695   530   856 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c014, max_recv_level=20,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAFI2NQJBbTUFAgIHhEI3A,aMpDyA==,           sprop_level_parameter_sets=, framesize=288-352
01-10 16:57:29.169746   530   856 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=10(VIDEO_LEVEL_2_1), max_level=10(VIDEO_LEVEL_2_1)
01-10 16:57:29.170021   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.170127   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.171505   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.173103   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.173337   530   856 I VDO_LOG : Profile:66, Level:21, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=320, Height=480, BufW=320, BufH=480, NonRefP=0, f:3
01-10 16:57:29.174106   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.174204   530   856 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c0158d8d40a07b4d41408081e1108dc0)
01-10 16:57:29.174424   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.170000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:59): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.174984   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.176408   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.176459   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.176863   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.177910   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.178709  1131  1140 I zygote64: Do partial code cache collection, code=53KB, data=49KB
01-10 16:57:29.179224  1131  1140 I zygote64: After code cache collection, code=53KB, data=49KB
01-10 16:57:29.179259  1131  1140 I zygote64: Increasing code cache capacity to 256KB
01-10 16:57:29.179320   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.181900   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.182142   530   856 I VDO_LOG : Profile:66, Level:21, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=320, Height=480, BufW=320, BufH=480, NonRefP=0, f:3
01-10 16:57:29.182826   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.182985   530   856 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 16:57:29.183202   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.182000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:60): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.183713   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.185116   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.185185   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.185366   530   856 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c015, max_recv_level=21,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAFY2NQKB7TUFAgIHhEI3A,aMpDyA==,           sprop_level_parameter_sets=, framesize=320-480
01-10 16:57:29.185415   530   856 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=12(VIDEO_LEVEL_2_2), max_level=12(VIDEO_LEVEL_2_2)
01-10 16:57:29.185687   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.186792   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.188194   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.190816   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.191167   530   856 I VDO_LOG : Profile:66, Level:22, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 16:57:29.192056   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.192162   530   856 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c0168d8d40f028d35050202078442370)
01-10 16:57:29.192401   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.190000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:61): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.192968   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.194441   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.194522   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.195116   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.196272   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.197807   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.200652   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.200929   530   856 I VDO_LOG : Profile:66, Level:22, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 16:57:29.201549   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.201693   530   856 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 16:57:29.201923   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.198000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:62): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.202546   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.204003   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.204067   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.204254   530   856 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c016, max_recv_level=22,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAFo2NQPAo01BQICB4RCNw,aMpDyA==,           sprop_level_parameter_sets=, framesize=480-640
01-10 16:57:29.204307   530   856 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=13(VIDEO_LEVEL_3), max_level=13(VIDEO_LEVEL_3)
01-10 16:57:29.204592   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.205733   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.207164   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.209808   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.210022   530   856 I VDO_LOG : Profile:66, Level:30, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 16:57:29.210664   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.210761   530   856 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c01e8d8d40f028d35050202078442370)
01-10 16:57:29.211045   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.206000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:63): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.211645   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.213047   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.213102   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.213521   530   856 I VDO_LOG : [eValInit] pid = 0x212, driver type = 0x5
01-10 16:57:29.213893   401   401 I BufferQueueConsumer: [StatusBar#0](this:0x740443e800,id:3,api:1,p:1131,c:401) setDefaultBufferSize: width=720 height=1280
01-10 16:57:29.214576   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.216099   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 16:57:29.218247  1131  1451 D Surface : Surface::disconnect(this=0x73b8db7000,api=1)
01-10 16:57:29.218534   401   420 I BufferQueueProducer: [StatusBar#0](this:0x740443e800,id:3,api:1,p:1131,c:401) disconnect(P): api 1
01-10 16:57:29.218813   530   856 I VDO_LOG : [tid: 856][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 16:57:29.219120   530   856 I VDO_LOG : Profile:66, Level:30, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 16:57:29.219306   401   420 I BufferQueueConsumer: [StatusBar#0](this:0x740443e800,id:3,api:1,p:-1,c:401) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 16:57:29.219711  1131  1451 D Surface : Surface::connect(this=0x73b8db7000,api=1)
01-10 16:57:29.219785   530   856 I VDO_LOG : [tid: 856][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 16:57:29.219855   530   856 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 16:57:29.218000   530   530 W /system/bin/vtservice: type=1400 audit(0.0:64): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=1140 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 16:57:29.220093   530   856 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 16:57:29.220216   401   580 I BufferQueueProducer: [StatusBar#0](this:0x740443e800,id:3,api:1,p:1131,c:401) connect(P): api=1 producer=(1131:com.android.systemui) producerControlledByApp=true
01-10 16:57:29.220685   530   856 I BWC     : emi_ddr_type_string_get is no longer available
01-10 16:57:29.221185  1131  1451 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 16:57:29.222211   530   856 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 16:57:29.222307   530   856 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 16:57:29.222515   530   856 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c01e, max_recv_level=30,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAHo2NQPAo01BQICB4RCNw,aMpDyA==,           sprop_level_parameter_sets=, framesize=480-640
01-10 16:57:29.222607   530   856 D [VT]ImsMa: [getCodecParameterSets]Line 1187 [ID=0][exit]===Numbers 7 ===mGetVideoCodecLevelFmtpPtr 0xf15da000=
01-10 16:57:29.222667   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] (H264) levelCapNumbers = 7 (need <= 32)
01-10 16:57:29.222725   530   856 D [VT]ImsMa: [getCodecParameterSets]Line 1145 [ID=0][enter]===informat 4 quality=0x1====
01-10 16:57:29.222779   530   856 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1 opID 8
01-10 16:57:29.222833   530   856 D [VT]ImsMa: [getCodecParameterSets]Line 1166 [ID=0] Numbers 0 
01-10 16:57:29.222887   530   856 D [VT]ImsMa: [getCodecParameterSets]Line 1187 [ID=0][exit]===Numbers 0 ===mGetVideoCodecLevelFmtpPtr 0x0=
01-10 16:57:29.222973   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] (H265) levelCapNumbers = 0 (need <= 32)
01-10 16:57:29.223025   530   856 D [VT]ImsMa: [getCodecBitrateTable]Line 1108 [ID=0][enter]operatorID 8=======
01-10 16:57:29.223075   530   856 D [VT]ImsMa: [getCodecBitrateTable]Line 1111 [ID=0]tableCnt 21
01-10 16:57:29.223124   530   856 D [VT]ImsMa: [getCodecBitrateTable]Line 1128 [ID=0]tableCnt 21,mGetCodecBitrateTablePtr0xf15f3000
01-10 16:57:29.223168   530   856 D [VT]ImsMa: [getCodecBitrateTable]Line 1135 [ID=0][exit]count 21=mGetCodecBitrateTablePtr 0xf15f3000======
01-10 16:57:29.223183   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] bit rate table Cnt     = 21 (need <= 32)
01-10 16:57:29.223235   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] find match type = 1, count = 0
01-10 16:57:29.223253   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] extmap_num             = 1
01-10 16:57:29.223286   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] ext_id                 = 7
01-10 16:57:29.223298   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] direction              = 3
01-10 16:57:29.223310   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] ext_uri                = urn:3gpp:video-orientation
01-10 16:57:29.223322   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] cap.media_type         = 1
01-10 16:57:29.223333   530   856 I VT      : [SRV] [vt_rtp_codec_2_ua] cap.mime_Type          = 1
01-10 16:57:29.223371   530   856 I VT      : [SRV] [VT THREAD] VT_Send start, type = 101506, len:60076
01-10 16:57:29.223405   530   856 I VT      : [SRV] [VT THREAD] VT_Send before type
01-10 16:57:29.223484   530   856 I VT      : [SRV] [VT THREAD] VT_Send before len
01-10 16:57:29.223524   530   856 I VT      : [SRV] [VT THREAD] VT_Send before data
01-10 16:57:29.223617   530   856 I VT      : [SRV] [VT THREAD] VT_Send end
01-10 16:57:29.223579   379   863 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] type : 101506
01-10 16:57:29.223676   379   863 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] len : 60076
01-10 16:57:29.223782   379   863 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] readblock ret: 1
01-10 16:57:29.223777  1281  1309 I VT      : [JNI] Leaving SetCameraParameters
01-10 16:57:29.223805   379   863 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] write to IMCB
01-10 16:57:29.223926   379   863 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] read from VTS
01-10 16:57:29.226459   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=101506(0x00018C82), dst=VT1[7], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:29.226459   795   795 I VoLTE IMCB: ENTER imsvt_imcb_get_cap_rsp_handler()@0#6005
01-10 16:57:29.226459   795   795 I VoLTE IMCB: ENTER imcb_send_imc_vt_cap_query_rsp()@0#3157
01-10 16:57:29.226459   795   795 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:29.226459   795   795 I VoLTE IMCB: ENTER imcb_send_ua_vt_cap_setting()@0#3490
01-10 16:57:29.226459   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10023(0x00002727), len=60072, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:29.226459   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:29.230900  1131  1131 D StatusBar: disable<e i a s b H R c s q >
01-10 16:57:29.232166  1131  1131 W View    : requestLayout() improperly called by com.android.keyguard.CarrierText{d116282 V.ED..... ..S...ID 32,0-404,80 #7f0a013f app:id/keyguard_carrier_text} during layout: running second layout pass
01-10 16:57:29.251056   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:29.251169   795   848 I chatty  : uid=1000(system) /vendor/bin/volte_imcb identical 1 line
01-10 16:57:29.251203   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:29.251707   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:29.251707   795   795 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@0#5493
01-10 16:57:29.251707   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=24, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:29.251707   795   795 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@0#5518
01-10 16:57:29.251707   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:29.252367   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100034(0x000186C2), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:29.252367   795   795 I VoLTE IMCB: ENTER imcb_imc_rat_change_ind_handler()@0#5313
01-10 16:57:29.252367   795   795 I VoLTE IMCB: from rat type = 0, to ua rat = 8 imcb_rat_conv_to_ua()@0#124
01-10 16:57:29.252367   795   795 I VoLTE IMCB: from rat type = 1, to ua rat = 9 @0#124
01-10 16:57:29.252367   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10013(0x0000271D), len=192, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:29.252367   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:29.253043   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100034(0x000186C2), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:29.253043   795   795 I VoLTE IMCB: ENTER imcb_imc_rat_change_ind_handler()@0#5313
01-10 16:57:29.253043   795   795 I VoLTE IMCB: from rat type = 0, to ua rat = 8 imcb_rat_conv_to_ua()@0#124
01-10 16:57:29.253043   795   795 I VoLTE IMCB: from rat type = 1, to ua rat = 9 @0#124
01-10 16:57:29.253043   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10013(0x0000271D), len=192, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:29.253043   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:29.253344   794   840 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 16:57:29.253453   794   840 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 16:57:29.253493   794   840 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 16:57:29.254190   794   838 I VoLTE UA: Update acct[0] lte_attach_type = 1 (module/volte//volte_ua/src/call/acct.c:5557)
01-10 16:57:29.269735  1131  1451 D HWUIExtension: MTKProgramCache.generateProgram: 1142461300744
01-10 16:57:29.274294  1131  1451 D HWUIExtension: MTKProgramCache.generateProgram: 562984313159683
01-10 16:57:29.274689  1131  1451 D HWUIExtension: createProgram 0x0002000800000003, binary 0x7454e1b3ac, length 5140, format 36705 within 321ns
01-10 16:57:29.275792  1131  1451 D HWUIExtension: MTKProgramCache.generateProgram: 562949953421345
01-10 16:57:29.277467  1131  1451 D HWUIExtension: MTKProgramCache.generateProgram: 562949953421313
01-10 16:57:29.277924  1131  1451 D HWUIExtension: createProgram 0x0002000000000001, binary 0x7454e166c8, length 4944, format 36705 within 397ns
01-10 16:57:29.279041  1131  1451 D HWUIExtension: MTKProgramCache.generateProgram: 240518168576
01-10 16:57:29.280356  1131  1451 D HWUIExtension: createProgram 0x0000003800000000, binary 0x7454e153fc, length 4812, format 36705 within 1259ns
01-10 16:57:29.280822  1131  1451 D HWUIExtension: MTKProgramCache.generateProgram: 562984322596929
01-10 16:57:29.281433  1297  1505 E MtkPhoneIntfMgrEx: [setLocationInfoWifiMac] pheonId:0
01-10 16:57:29.282590  1131  1451 D HWUIExtension: MTKProgramCache.generateProgram: 562984313159681
01-10 16:57:29.283212  1131  1451 D HWUIExtension: createProgram 0x0002000800000001, binary 0x7454e1ec84, length 5140, format 36705 within 502ns
01-10 16:57:29.300507   795   848 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 16:57:29.301545   795   795 I VoLTE IMCB: {{{{[process_msg] msg_id=100135(0x00018727), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 16:57:29.301545   795   795 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10024(0x00002728), len=2044, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 16:57:29.301545   795   795 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 16:57:29.305148  1131  1131 D Surface : Surface::connect(this=0x73b8db9000,api=1)
01-10 16:57:29.305483   987   987 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 16:57:29.307116   401  1598 I BufferQueueProducer: [com.android.systemui.ImageWallpaper#0](this:0x7404455800,id:4,api:1,p:1131,c:401) connect(P): api=1 producer=(1131:com.android.systemui) producerControlledByApp=true
01-10 16:57:29.307772  1339  1339 D SimSelectService: onReceive action=android.intent.action.ACTION_SUBINFO_RECORD_UPDATED
01-10 16:57:29.307935  1339  1339 D UtilsExt: autoSanity: false buildType: user
01-10 16:57:29.308056  1339  1339 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 16:57:29.308223  1131  1131 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 16:57:29.309164  1131  1131 D ImageWallpaper: inside loadTexture
01-10 16:57:29.310483  1339  1339 D SimSelectService: sub info update, type = 4, subs = null
01-10 16:57:29.310543  1339  1339 D SimSelectService: extra value no change, return
01-10 16:57:29.314366   987  1002 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 16:57:29.316038  1131  1371 D NetworkController: subscriptions is null
01-10 16:57:29.316266  1131  1371 D NetworkController: signal callbacks count not equals, reset subInfo, old = 0, new = 1
01-10 16:57:29.317373  1131  1371 D WifiSignalController: mCurrentState.inetCondition = 0
01-10 16:57:29.319580   987  1318 I WifiService: setCountryCode uid=1001
01-10 16:57:29.319786   987  1318 D WifiCountryCode: Receive set country code request: cn
01-10 16:57:29.323328  1131  1371 D NetworkController: isEmergencyOnly No sims 
01-10 16:57:29.323712  1131  1371 D NetworkController: updateMobileControllers detectedType: 4
01-10 16:57:29.328193  1131  1131 D Surface : Surface::disconnect(this=0x73b8db9000,api=1)
01-10 16:57:29.328559   401  1598 I BufferQueueProducer: [com.android.systemui.ImageWallpaper#0](this:0x7404455800,id:4,api:1,p:1131,c:401) disconnect(P): api 1
01-10 16:57:29.328670   401  1598 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x7404455800,id:4,api:1,p:-1,c:401) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 16:57:29.334165  1131  1131 D KeyguardUpdateMonitor: Phone# 0, state = NOT_READY
01-10 16:57:29.339164  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 16:57:29.343280  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = NOT_READY
01-10 16:57:29.343343  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.343395  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.348642  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 16:57:29.353178  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 16:57:29.356200   987  1318 D AlarmManagerService: Kernel timezone updated to -480 minutes west of GMT
01-10 16:57:29.357904   987   987 D NetworkTimeUpdateService: Received android.intent.action.NETWORK_SET_TIMEZONE
01-10 16:57:29.358000   987   987 D NetworkTimeUpdateService: mNitzReceiver Receive ACTION_NETWORK_SET_TIMEZONE
01-10 16:57:29.358288   481   497 D Surface : Surface::disconnect(this=0x7791440000,api=1)
01-10 16:57:29.358643  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = NOT_READY
01-10 16:57:29.358691  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.358737  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.358805   401  1598 I BufferQueueProducer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:481,c:401) disconnect(P): api 1
01-10 16:57:29.359075   401  1598 I BufferQueueConsumer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:-1,c:401) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 16:57:29.364215  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 16:57:29.364586   481   481 I         : [MALI] @eglp_check_display_valid_and_initialized_and_retain: MALI_EGL_DISPLAY_INITIALIZED != dpy->state (EGL_NOT_INITIALIZED)
01-10 16:57:29.365092   401   401 I BufferQueueConsumer: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:-1,c:-1) disconnect(C)
01-10 16:57:29.366861   401   401 I BufferQueue: [BootAnimation#0](this:0x740443d000,id:1,api:1,p:-1,c:-1) ~BufferQueueCore
01-10 16:57:29.370564  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 16:57:29.372546  1131  1371 D NetworkController: isEmergencyOnly No sims 
01-10 16:57:29.376804  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = NOT_READY
01-10 16:57:29.376854  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.376899  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.379195  1297  1297 D PhoneGlobals: onSubscriptionsChanged start
01-10 16:57:29.380234  1297  1297 D TelephonyUtils: isHotSwapHanppened : false
01-10 16:57:29.380309  1297  1297 D PhoneGlobals: onSubscriptionsChanged end
01-10 16:57:29.381557  1297  1297 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 16:57:29.382042  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 16:57:29.382723  1131  1131 D StatusBar: onNotificationPosted: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 16:57:29.383424  1131  1131 D StatusBar: onNotificationRemoved: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 16:57:29.383971  1131  1131 D StatusBar: onNotificationPosted: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 16:57:29.384211  1131  1131 D StatusBar: onNotificationRemoved: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 16:57:29.394439   523   549 D AAL     : 01-10 04:57:29.205 BL= 351,ESS= 256, 01-10 04:57:29.262 BL= 350,ESS= 256, 01-10 04:57:29.299 BL= 349,ESS= 256, 01-10 04:57:29.356 BL= 348,ESS= 256, 01-10 04:57:29.394 BL= 347,ESS= 256, 
01-10 16:57:29.401289  1297  1297 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SERVICE_STATE
01-10 16:57:29.401344  1297  1297 D CdmaVolteServiceChecker: updateState, checking = false
01-10 16:57:29.401858  1297  1297 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 16:57:29.401952  1297  1297 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 16:57:29.403419  1297  1297 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 16:57:29.403717  1297  1297 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 16:57:29.403759  1297  1297 D ImsExternalCallTracker: refreshCallPullState
01-10 16:57:29.404895  1297  1297 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 16:57:29.408272  1131  1131 D KeyguardUpdateMonitor: Phone# 0, state = ABSENT
01-10 16:57:29.412585  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.420446  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = ABSENT
01-10 16:57:29.420521  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.420554  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.426559  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.432151  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.436045  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = ABSENT
01-10 16:57:29.436110  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.436155  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.441541  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.445197  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.448500  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = ABSENT
01-10 16:57:29.448559  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.448588  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.453046  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.475337  1131  1131 I zygote64: Deoptimizing void com.android.systemui.qs.tileimpl.QSIconViewImpl.onMeasure(int, int) due to JIT inline cache
01-10 16:57:29.534498   401   401 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x7404455800,id:4,api:1,p:-1,c:401) setDefaultBufferSize: width=2048 height=1280
01-10 16:57:29.540142  1131  1131 D Surface : Surface::connect(this=0x73b8db9000,api=1)
01-10 16:57:29.540447   401   580 I BufferQueueProducer: [com.android.systemui.ImageWallpaper#0](this:0x7404455800,id:4,api:1,p:1131,c:401) connect(P): api=1 producer=(1131:com.android.systemui) producerControlledByApp=true
01-10 16:57:29.540998  1131  1131 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 16:57:29.541311  1131  1131 D ImageWallpaper: inside loadTexture
01-10 16:57:29.553267  1131  1131 D Surface : Surface::disconnect(this=0x73b8db9000,api=1)
01-10 16:57:29.553423   401   401 W BufferQueueDump: [com.android.systemui.ImageWallpaper#0] [addBuffer] slot(0) acquired, seems to be abnormal, just update ...
01-10 16:57:29.553574   401   420 I BufferQueueProducer: [com.android.systemui.ImageWallpaper#0](this:0x7404455800,id:4,api:1,p:1131,c:401) disconnect(P): api 1
01-10 16:57:29.553909   401   420 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x7404455800,id:4,api:1,p:-1,c:401) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 16:57:29.559114  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.563695  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = ABSENT
01-10 16:57:29.563736  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.563783  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.567650  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.574741  1131  1131 D SignalClusterView: hasCorrectSubs, subsInfo:[],--mPhoneStates:[]
01-10 16:57:29.574831  1131  1131 D SignalClusterView: hasCorrectSubs, subsInfo:[],--mPhoneStates:[]
01-10 16:57:29.575773  1131  1131 D StatusBar: addNotification key=0|com.mediatek.ppl|1|null|1000
01-10 16:57:29.579745  1131  1131 W System  : ClassLoader referenced unknown path: 
01-10 16:57:29.586492   401   420 I SurfaceFlinger: [SF client] DEL(0x740b228000) for (481:/system/bin/bootanimation)
01-10 16:57:29.587821  1131  1131 D StatusBar: No peeking: unimportant notification: 0|com.mediatek.ppl|1|null|1000
01-10 16:57:29.588245  1131  1131 W StatusBar: removeNotification for unknown key: 0|com.mediatek.ppl|1|null|1000
01-10 16:57:29.588297  1131  1131 D StatusBar: removeNotification key=0|com.mediatek.ppl|1|null|1000 old=null
01-10 16:57:29.588928  1131  1131 D StatusBar: addNotification key=0|com.mediatek.ppl|1|null|1000
01-10 16:57:29.592059  1131  1131 D StatusBar: No peeking: unimportant notification: 0|com.mediatek.ppl|1|null|1000
01-10 16:57:29.592283  1131  1131 W StatusBar: removeNotification for unknown key: 0|com.mediatek.ppl|1|null|1000
01-10 16:57:29.592315  1131  1131 D StatusBar: removeNotification key=0|com.mediatek.ppl|1|null|1000 old=null
01-10 16:57:29.608759   401   420 I SurfaceFlinger: Boot is finished (14883 ms)
01-10 16:57:29.618029   401   420 D         : SF watch dog change threshold from 800 --> 500.
01-10 16:57:29.625441   987  1010 D LocationManagerService: request 65eed23 passive Request[POWER_NONE passive fastest=+30m0s0ms] from android(1000 foreground [whitelisted])
01-10 16:57:29.626251  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.630157   390   390 D lights  : write_int open fd=7
01-10 16:57:29.631687   390   390 D lights  : write_int open fd=7
01-10 16:57:29.633296  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = ABSENT
01-10 16:57:29.633338  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.633374  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.639233   523   549 D AAL     : onBacklightChanged: 409/1023 -> 405/1023(phy:1621/4095)
01-10 16:57:29.641768  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.648073  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.649158   390   390 D lights  : write_int open fd=7
01-10 16:57:29.649795   390   390 D lights  : write_int open fd=7
01-10 16:57:29.653502  1131  1131 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = ABSENT
01-10 16:57:29.653560  1131  1131 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 16:57:29.653595  1131  1131 D KeyguardSecurityModel: mode current =None
01-10 16:57:29.657708  1607  1607 I bootstat: Service started: /system/bin/bootstat --record_boot_complete 
01-10 16:57:29.658101   523   549 D AAL     : onBacklightChanged: 405/1023 -> 389/1023(phy:1557/4095)
01-10 16:57:29.658489   523   549 D AAL     : 01-10 04:57:29.451 BL= 346,ESS= 256, 01-10 04:57:29.488 BL= 345,ESS= 256, 01-10 04:57:29.545 BL= 344,ESS= 256, 01-10 04:57:29.582 BL= 343,ESS= 256, 01-10 04:57:29.658 BL= 331,ESS= 256, 
01-10 16:57:29.660816  1131  1131 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 16:57:29.660997  1606  1606 D AEE_AEDV: Rtt command(type:0, file_path: arg0:0)
01-10 16:57:29.661238  1606  1606 D AEE_AEDV: aee:vrttdRtt waiting daemon finish the job...
01-10 16:57:29.664601   727   727 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 16:57:29.664688   727   727 D AEE_AEDV: p 0 poll events 1 revents 1
01-10 16:57:29.664764   727   727 D AEE_AEDV: requesting from: pid=1606 cmd=13
01-10 16:57:29.664777   727   727 D AEE_AEDV: Got RTT_AEE_REINIT
01-10 16:57:29.665323  1606  1606 D AEE_AEDV: Rtt send req done
01-10 16:57:29.665608  1606  1606 D AEE_AEDV: aee:vrttd_64Rtt waiting 64_daemon finish the job...
01-10 16:57:29.666478   729   729 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 16:57:29.666549   729   729 D AEE_AEDV: p 0 poll events 1 revents 1
01-10 16:57:29.666654   729   729 D AEE_AEDV: requesting from: pid=1606 cmd=13
01-10 16:57:29.666668   729   729 D AEE_AEDV: Got RTT_AEE_REINIT
01-10 16:57:29.667333  1606  1606 D AEE_AEDV: Rtt send 64 req done
01-10 16:57:29.667585   390   390 D lights  : write_int open fd=7
01-10 16:57:29.667689  1605  1605 D AEE_AED : Rtt command(type:0, file_path: arg0:0)
01-10 16:57:29.667940  1605  1605 D AEE_AED : aee:rttdRtt waiting daemon finish the job...
01-10 16:57:29.668286   390   390 D lights  : write_int open fd=7
01-10 16:57:29.668692   725   725 D AEE_AED : $===AEE===AEE===AEE===$
01-10 16:57:29.668763   725   725 D AEE_AED : p 0 poll events 1 revents 1
01-10 16:57:29.668837   725   725 D AEE_AED : requesting from: pid=1605 cmd=13
01-10 16:57:29.668861   725   725 D AEE_AED : Got RTT_AEE_REINIT
01-10 16:57:29.669406  1605  1605 D AEE_AED : Rtt send req done
01-10 16:57:29.669599  1605  1605 D AEE_AED : aee:rttd_64Rtt waiting 64_daemon finish the job...
01-10 16:57:29.670172   726   726 D AEE_AED : $===AEE===AEE===AEE===$
01-10 16:57:29.670239   726   726 D AEE_AED : p 0 poll events 1 revents 1
01-10 16:57:29.670299   726   726 D AEE_AED : requesting from: pid=1605 cmd=13
01-10 16:57:29.670325   726   726 D AEE_AED : Got RTT_AEE_REINIT
01-10 16:57:29.670690  1605  1605 D AEE_AED : Rtt send 64 req done
01-10 16:57:29.677049   523   549 D AAL     : onBacklightChanged: 389/1023 -> 377/1023(phy:1509/4095)
01-10 16:57:29.678352  1131  1140 I zygote64: Do full code cache collection, code=126KB, data=92KB
01-10 16:57:29.679035  1131  1140 I zygote64: After code cache collection, code=91KB, data=54KB
01-10 16:57:29.680097  1608  1608 I bootstat: Service started: /system/bin/bootstat --record_boot_reason 
01-10 16:57:29.681401  1608  1608 I bootstat: Unknown boot reason: wdt_by_pass_pwk
01-10 16:57:29.686175   390   390 D lights  : write_int open fd=7
01-10 16:57:29.686689   390   390 D lights  : write_int open fd=7
01-10 16:57:29.695778   523   549 D AAL     : onBacklightChanged: 377/1023 -> 365/1023(phy:1461/4095)
01-10 16:57:29.696384  1609  1609 I bootstat: Service started: /system/bin/bootstat --record_time_since_factory_reset 
01-10 16:57:29.705115   390   390 D lights  : write_int open fd=7
01-10 16:57:29.705575   390   390 D lights  : write_int open fd=7
01-10 16:57:29.713453  1611  1611 I bootstat: Service started: /system/bin/bootstat -l 
01-10 16:57:29.714594   523   549 D AAL     : onBacklightChanged: 365/1023 -> 349/1023(phy:1397/4095)
01-10 16:57:29.724010   390   390 D lights  : write_int open fd=7
01-10 16:57:29.724519   390   390 D lights  : write_int open fd=7
01-10 16:57:29.730000   548   548 W HwBinder:548_2: type=1400 audit(0.0:65): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 16:57:29.733536   523   549 D AAL     : onBacklightChanged: 349/1023 -> 337/1023(phy:1349/4095)
01-10 16:57:29.733732   548   884 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 16:57:29.742808   390   390 D lights  : write_int open fd=7
01-10 16:57:29.743399   390   390 D lights  : write_int open fd=7
01-10 16:57:29.752306   523   549 D AAL     : onBacklightChanged: 337/1023 -> 325/1023(phy:1301/4095)
01-10 16:57:29.762239   390   390 D lights  : write_int open fd=7
01-10 16:57:29.762654   390   390 D lights  : write_int open fd=7
01-10 16:57:29.771749   523   549 D AAL     : 01-10 04:57:29.677 BL= 320,ESS= 256, 01-10 04:57:29.696 BL= 309,ESS= 256, 01-10 04:57:29.714 BL= 297,ESS= 256, 01-10 04:57:29.733 BL= 286,ESS= 256, 01-10 04:57:29.771 BL= 274,ESS= 256, 
01-10 16:57:29.771833   523   549 D AAL     : onBacklightChanged: 325/1023 -> 309/1023(phy:1237/4095)
01-10 16:57:29.780477   390   390 D lights  : write_int open fd=7
01-10 16:57:29.781038   390   390 D lights  : write_int open fd=7
01-10 16:57:29.786883  1612  1616 E GED Service: main_gas: pid=1612
01-10 16:57:29.787298  1612  1616 D GasService: version=2.00
01-10 16:57:29.787336  1612  1616 D GasService: tid=1616
01-10 16:57:29.787339   401   580 I SurfaceFlinger: Adjust vsync offset: -8000000
01-10 16:57:29.788502  1612  1618 D GasService: GAS thread starting...
01-10 16:57:29.790076   523   549 D AAL     : onBacklightChanged: 309/1023 -> 297/1023(phy:1189/4095)
01-10 16:57:29.793093   987  1213 E TouchFilter: setTouchFilter LOG Enable prameter: 0
01-10 16:57:29.793229   987  1213 D EventHub: Event Hub Touch Filter log is disabled
01-10 16:57:29.793269   987  1213 D EventHub: Event Hub Touch Filter is enabled
01-10 16:57:29.801791   390   390 D lights  : write_int open fd=7
01-10 16:57:29.802449   390   390 D lights  : write_int open fd=7
01-10 16:57:29.808914   523   549 D AAL     : onBacklightChanged: 297/1023 -> 281/1023(phy:1125/4095)
01-10 16:57:29.820723   390   390 D lights  : write_int open fd=7
01-10 16:57:29.821230   390   390 D lights  : write_int open fd=7
01-10 16:57:29.827723   523   549 D AAL     : onBacklightChanged: 281/1023 -> 265/1023(phy:1061/4095)
01-10 16:57:29.839765   390   390 D lights  : write_int open fd=7
01-10 16:57:29.840301   390   390 D lights  : write_int open fd=7
01-10 16:57:29.846632   523   549 D AAL     : onBacklightChanged: 265/1023 -> 253/1023(phy:1012/4095)
01-10 16:57:29.847075   523   549 D AAL     : 01-10 04:57:29.772 BL= 263,ESS= 256, 01-10 04:57:29.791 BL= 251,ESS= 256, 01-10 04:57:29.809 BL= 240,ESS= 256, 01-10 04:57:29.828 BL= 227,ESS= 256, 01-10 04:57:29.847 BL= 215,ESS= 256, 
01-10 16:57:29.850749  1621  1621 I adbd    : dlroot ===checkroot===, [ro.secureboot]: 49  ==bEnableroot:0
01-10 16:57:29.850998  1621  1621 I chatty  : uid=0(root) /system/bin/adbd identical 1 line
01-10 16:57:29.851051  1621  1621 I adbd    : dlroot ===checkroot===, [ro.secureboot]: 49  ==bEnableroot:0
01-10 16:57:29.851565  1621  1622 I adbd    : initializing functionfs
01-10 16:57:29.851616  1621  1622 I adbd    : opening control endpoint /dev/usb-ffs/adb/ep0
01-10 16:57:29.859125   390   390 D lights  : write_int open fd=7
01-10 16:57:29.859765   390   390 D lights  : write_int open fd=7
01-10 16:57:29.865506   523   549 D AAL     : onBacklightChanged: 253/1023 -> 241/1023(phy:964/4095)
01-10 16:57:29.874093   987  1090 D WifiStateMachine:  InitialState !CMD_BOOT_COMPLETED rt=21391/21391 0 0
01-10 16:57:29.874192   987  1090 D WifiStateMachine:  DefaultState !CMD_BOOT_COMPLETED rt=21391/21391 0 0
01-10 16:57:29.877996   390   390 D lights  : write_int open fd=7
01-10 16:57:29.878463   987  1090 D WifiConfigStore: Reading from stores completed in 2 ms.
01-10 16:57:29.878738   390   390 D lights  : write_int open fd=7
01-10 16:57:29.884362   523   549 D AAL     : onBacklightChanged: 241/1023 -> 225/1023(phy:900/4095)
01-10 16:57:29.885833   987  1090 D WifiConfigManager: clearInternalData: Clearing all internal data
01-10 16:57:29.886094   987  1090 V WifiConfigManager: Clearing last selected network
01-10 16:57:29.886216   987  1090 V WifiConfigManager: Adding network from shared store "maidu_sslink_5g"WPA_PSK
01-10 16:57:29.887087  1621  1621 I ADB_SERVICES: g_pending_list length=1
01-10 16:57:29.887263   987  1090 V WifiConfigManager: Adding network from shared store "Internet"NONE
01-10 16:57:29.887862   987  1090 V WifiConfigManager: Adding network from shared store "CISCO-EAP"WPA_EAP
01-10 16:57:29.896330   390   390 D lights  : write_int open fd=7
01-10 16:57:29.896971   390   390 D lights  : write_int open fd=7
01-10 16:57:29.903408   523   549 D AAL     : onBacklightChanged: 225/1023 -> 213/1023(phy:852/4095)
01-10 16:57:29.910077   987  1090 D WIFI    : Registering NetworkFactory
01-10 16:57:29.910368   987  1090 D WIFI_UT : Registering NetworkFactory
01-10 16:57:29.910674   987  1090 D WifiStateMachine:  InitialState !CMD_CHANNEL_HALF_CONNECTED rt=21427/21427 0 0
01-10 16:57:29.910772   987  1090 D WifiStateMachine:  DefaultState !CMD_CHANNEL_HALF_CONNECTED rt=21427/21427 0 0
01-10 16:57:29.911052   987  1090 D WifiStateMachine:  InitialState !CMD_USER_UNLOCK rt=21428/21428 0 0
01-10 16:57:29.911104   987  1090 D WifiStateMachine:  DefaultState !CMD_USER_UNLOCK rt=21428/21428 0 0
01-10 16:57:29.911169   987  1090 V WifiConfigManager: Handling user unlock for 0
01-10 16:57:29.911273   987  1090 V WifiConfigManager: Loading from store after user switch/unlock for 0
01-10 16:57:29.920000   390   390 D lights  : write_int open fd=7
01-10 16:57:29.922038   523   549 D AAL     : onBacklightChanged: 213/1023 -> 201/1023(phy:804/4095)
01-10 16:57:29.923904   987  1090 D WifiConfigStore: Reading from user store completed in 2 ms.
01-10 16:57:29.924901   390   390 D lights  : write_int open fd=7
01-10 16:57:29.934603   390   390 I chatty  : uid=1000(system) light@2.0-servi identical 1 line
01-10 16:57:29.935573   390   390 D lights  : write_int open fd=7
01-10 16:57:29.937709   987  1003 I SELinux : SELinux: Loaded file_contexts
01-10 16:57:29.940894   523   549 D AAL     : onBacklightChanged: 201/1023 -> 185/1023(phy:740/4095)
01-10 16:57:29.941395   523   549 D AAL     : 01-10 04:57:29.865 BL= 205,ESS= 256, 01-10 04:57:29.884 BL= 193,ESS= 256, 01-10 04:57:29.903 BL= 181,ESS= 256, 01-10 04:57:29.922 BL= 172,ESS= 256, 01-10 04:57:29.941 BL= 161,ESS= 256, 
01-10 16:57:29.949055   987  1090 D WifiConfigStore: Writing to stores completed in 21 ms.
01-10 16:57:29.949287   987  1090 D WifiStateMachine:  InitialState !CMD_ENABLE_P2P rt=21466/21466 0 0
01-10 16:57:29.949363   987  1090 D WifiStateMachine:  DefaultState !CMD_ENABLE_P2P rt=21466/21466 0 0
01-10 16:57:29.949446   987  1090 D WIFI    : got request NetworkRequest [ TRACK_DEFAULT id=3, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:29.949545   987  1090 D WIFI    : got request NetworkRequest [ TRACK_DEFAULT id=6, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:29.949593   987  1090 D WIFI    : got request NetworkRequest [ REQUEST id=1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:29.949647   987  1090 D WIFI_UT : got request NetworkRequest [ TRACK_DEFAULT id=3, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:29.949712   987  1090 D WIFI_UT : got request NetworkRequest [ TRACK_DEFAULT id=6, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:29.949759   987  1090 D WIFI_UT : got request NetworkRequest [ REQUEST id=1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 16:57:29.953574   390   390 D lights  : write_int open fd=7
01-10 16:57:29.955563   390   390 D lights  : write_int open fd=7
01-10 16:57:29.959794   523   549 D AAL     : onBacklightChanged: 185/1023 -> 173/1023(phy:692/4095)
01-10 16:57:29.972206   390   390 D lights  : write_int open fd=7
01-10 16:57:29.972754   390   390 D lights  : write_int open fd=7
01-10 16:57:29.978661   523   549 D AAL     : onBacklightChanged: 173/1023 -> 156/1023(phy:624/4095)
01-10 16:57:29.985566  1119  1119 I InputAttributes: InputType.TYPE_NULL is specified
01-10 16:57:29.993008   390   390 D lights  : write_int open fd=7
01-10 16:57:29.993786   390   390 D lights  : write_int open fd=7
01-10 16:57:29.997455   523   549 D AAL     : onBacklightChanged: 156/1023 -> 144/1023(phy:576/4095)
01-10 16:57:30.001900  1119  1236 I LatinIME:LogUtils: Dictionary info: dictionary = UserHistoryDictionary.ar ; version = 1578646650 ; date = ?
01-10 16:57:30.003228  1119  1236 I LatinIME:LogUtils: Dictionary info: dictionary = userunigram.ar ; version = 1578646650 ; date = ?
01-10 16:57:30.005624  1624  1624 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:30.021644   390   390 D lights  : write_int open fd=7
01-10 16:57:30.028359   390   390 I chatty  : uid=1000(system) light@2.0-servi identical 2 lines
01-10 16:57:30.028988   390   390 D lights  : write_int open fd=7
01-10 16:57:30.035177   523   549 D AAL     : onBacklightChanged: 144/1023 -> 116/1023(phy:464/4095)
01-10 16:57:30.035816   523   549 D AAL     : 01-10 04:57:29.960 BL= 149,ESS= 256, 01-10 04:57:29.979 BL= 136,ESS= 256, 01-10 04:57:29.997 BL= 124,ESS= 256, 01-10 04:57:30.017 BL= 123,ESS= 256, 01-10 04:57:30.035 BL= 113,ESS= 256, 
01-10 16:57:30.047981   390   390 D lights  : write_int open fd=7
01-10 16:57:30.048692   390   390 D lights  : write_int open fd=7
01-10 16:57:30.054080   523   549 D AAL     : onBacklightChanged: 116/1023 -> 104/1023(phy:416/4095)
01-10 16:57:30.065827   390   390 D lights  : write_int open fd=7
01-10 16:57:30.066824   390   390 D lights  : write_int open fd=7
01-10 16:57:30.066758   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:30.939936,dur:1001.94,max:213.57,min:16.73
01-10 16:57:30.072898   523   549 D AAL     : onBacklightChanged: 104/1023 -> 88/1023(phy:352/4095)
01-10 16:57:30.084869   390   390 D lights  : write_int open fd=7
01-10 16:57:30.086056   390   390 D lights  : write_int open fd=7
01-10 16:57:30.091802   523   549 D AAL     : onBacklightChanged: 88/1023 -> 76/1023(phy:304/4095)
01-10 16:57:30.105674   390   390 D lights  : write_int open fd=7
01-10 16:57:30.106600   390   390 D lights  : write_int open fd=7
01-10 16:57:30.110580   523   549 D AAL     : onBacklightChanged: 76/1023 -> 64/1023(phy:256/4095)
01-10 16:57:30.121640   987   996 I zygote64: Background concurrent copying GC freed 40472(2MB) AllocSpace objects, 27(1240KB) LOS objects, 37% free, 10MB/16MB, paused 264us total 119.351ms
01-10 16:57:30.123059   390   390 D lights  : write_int open fd=7
01-10 16:57:30.123762   390   390 D lights  : write_int open fd=7
01-10 16:57:30.126586  1297  1667 E MtkPhoneIntfMgrEx: [setWifiEnabled] pheonId:0, ifName:wlan0, isEnabled:0
01-10 16:57:30.129456   523   549 D AAL     : onBacklightChanged: 64/1023 -> 48/1023(phy:192/4095)
01-10 16:57:30.130993   523   549 D AAL     : 01-10 04:57:30.055 BL= 102,ESS= 256, 01-10 04:57:30.073 BL=  90,ESS= 256, 01-10 04:57:30.092 BL=  79,ESS= 256, 01-10 04:57:30.111 BL=  66,ESS= 256, 01-10 04:57:30.130 BL=  54,ESS= 256, 
01-10 16:57:30.131945  1642  1642 I zygote64: The ClassLoaderContext is a special shared library.
01-10 16:57:30.143007   390   390 D lights  : write_int open fd=7
01-10 16:57:30.144245   390   390 D lights  : write_int open fd=7
01-10 16:57:30.148320   523   549 D AAL     : onBacklightChanged: 48/1023 -> 40/1023(phy:160/4095)
01-10 16:57:30.158348   987  1003 D Cta_ReceiverRecordHelper: updateReceiverCache()
01-10 16:57:30.158571   987  1003 D Cta_ReceiverRecordHelper: updateReceiverCache() at User(0)
01-10 16:57:30.158702   987  1003 D Cta_ReceiverRecordHelper: getPackageListReceivingSpecifiedIntent() find activities receiving intent = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.163778  1621  1622 I adbd    : functionfs successfully initialized
01-10 16:57:30.163963  1621  1622 I adbd    : registering usb transport
01-10 16:57:30.165163  1621  1695 I ADB_SERVICES: (null): starting write_transport thread, reading from fd 19
01-10 16:57:30.165630  1621  1696 I ADB_SERVICES: (null): starting read_transport thread on fd 19, SYNC online (2)
01-10 16:57:30.165811  1621  1621 I ADB_SERVICES: recv: SYNC 00000001 00000002 0000 
01-10 16:57:30.167290   987  1003 D Cta_ReceiverRecordHelper: getPackageListReceivingSpecifiedIntent() add com.mediatek.camera in the list
01-10 16:57:30.167475   987  1003 D Cta_ReceiverRecordHelper: addReceiverRecord() with com.mediatek.camera at User(0) enabled: true
01-10 16:57:30.167761   987  1003 D Cta_ReceiverRecordHelper: updateReceiverCache() at User(10)
01-10 16:57:30.167865   987  1003 D Cta_ReceiverRecordHelper: getPackageListReceivingSpecifiedIntent() find activities receiving intent = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170196   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.mediatek.ppl has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170337   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.mediatek.security has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170376   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.gears42.surelock has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170402   987  1003 D Cta_ReceiverController: filterReceiver() - package = android has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170429   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.dialer has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170453   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.settings has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170487   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.datalogic.softspot has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170512   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.gears42.surefox has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170542   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.mediatek.mtklogger has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170573   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.calendar has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170598   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.contacts has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170632   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.deskclock has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170656   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.dialer has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170683   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.dialer has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170715   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.email has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170740   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.gallery3d has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170764   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.managedprovisioning has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170794   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.mms has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170844   987  1003 I chatty  : uid=1000(system) ActivityManager identical 2 lines
01-10 16:57:30.170882   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.mms has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170934   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.onetimeinitializer has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170963   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.packageinstaller has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.170988   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.phone has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.171045   987  1003 I chatty  : uid=1000(system) ActivityManager identical 2 lines
01-10 16:57:30.171069   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.phone has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.171093   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.providers.calendar has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.171118   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.providers.downloads has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.171142   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.providers.media has action = android.intent.action.BOOT_COMPLETED
01-10 16:57:30.171166   987  1003 D Cta_ReceiverController: filterReceiver() - package = com.android.providers.media has action = android.intent.action.BOOT_COMPLETED
