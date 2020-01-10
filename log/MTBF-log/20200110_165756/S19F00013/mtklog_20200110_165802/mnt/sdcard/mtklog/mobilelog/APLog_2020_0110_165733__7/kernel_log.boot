----- timezone:GMT
<6>[    0.000000] -(0)[0:swapper]Booting Linux on physical CPU 0x0
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpuset
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpu
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpuacct
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys schedtune
<5>[    0.000000] -(0)[0:swapper]Linux version 4.4.95+ (jenkins@blqsrv820) (gcc version 6.3.1 20170109 (Linaro GCC 6.3-2017.02) ) #2 SMP PREEMPT Fri Dec 27 10:20:58 CET 2019
<6>[    0.000000] -(0)[0:swapper]Boot CPU: AArch64 Processor [410fd034]
<5>[    0.000000] -(0)[0:swapper]mrdump_get_cb: mrdump_cbaddr=0x000000000011e000, mrdump_cbsize=0x0000000000002000
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-9-ccci   :   0x7c000000 - 0x7d5fffff (0x1600000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-7-ccci   :   0x80000000 - 0x800fffff (0x100000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-6-SPM-reserved   :   0x77ff0000 - 0x77ffffff (0x10000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-5-framebuffer   :   0x7f220000 - 0x7feaffff (0xc90000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-4-tee-reserved   :   0xeeb00000 - 0xeff3ffff (0x1440000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-3-SPM-reserved   :   0x7feb0000 - 0x7febffff (0x10000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-2-SSPM-reserved   :   0x7fec0000 - 0x7ff7ffff (0xc0000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]atf-reserved-memory@44610000   :   0x54600000 - 0x5463ffff (0x40000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]reserve-memory-sspm_share   :   0x9ff80000 - 0x9fffffff (0x80000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-sspm_share, compatible id mediatek,reserve-memory-sspm_share
<6>[    0.000000] -(0)[0:swapper]Reserved memory: failed to allocate memory for node 'zone-movable-cma-memory'
<3>[    0.000000] -(0)[0:swapper][dram_dummy_read_reserve_mem_of_init] dram_rank0_addr = 0x0000000077fef000, size = 0x1000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-dram_r0_dummy_read, compatible id reserve-memory-dram_r0_dummy_read
<1>[    0.000000] -(0)[0:swapper][PHY layout]consys-reserve-memory   :   0xafe00000 - 0xafffffff (0x200000)
<6>[    0.000000] -(0)[0:swapper][CONNADP]reserve_memory_consys_fn: name: consys-reserve-memory, base: 0xafe00000, size: 0x200000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node consys-reserve-memory, compatible id mediatek,consys-reserve-memory
<3>[    0.000000] -(0)[0:swapper][dram_dummy_read_reserve_mem_of_init] dram_rank1_addr = 0x00000000eeaff000, size = 0x1000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-dram_r1_dummy_read, compatible id reserve-memory-dram_r1_dummy_read
<6>[    0.000000] -(0)[0:swapper][memblock]mediatek,pstore: 0x54410000 - 0x544f0000 (0xe0000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node pstore-reserved-memory@54410000, compatible id mediatek,pstore
<6>[    0.000000] -(0)[0:swapper][memblock]mediatek,minirdump: 0x544f0000 - 0x54500000 (0x10000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node minirdump-reserved-memory@544f0000, compatible id mediatek,minirdump
<5>[    0.000000] -(0)[0:swapper] mrdump region start = 0x0000000054000000 size =0x0000000000080000 is reserved already
<5>[    0.000000] -(0)[0:swapper] mrdump region start = 0x000000004489da80 size =0x0000000000001697 is reserved already
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x40000000 - 0x545fffff (0x14600000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x54640000 - 0x77feffff (0x239b0000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x78000000 - 0x7bffffff (0x4000000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x7d600000 - 0x7f21ffff (0x1c20000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x7ff80000 - 0x7fffffff (0x80000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x80100000 - 0x9ff7ffff (0x1fe80000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0xa0000000 - 0xafdfffff (0xfe00000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0xb0000000 - 0xeeafffff (0x3eb00000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0xeff40000 - 0xffffffff (0x100c0000)
<7>[    0.000000] -(0)[0:swapper]On node 0 totalpages: 771216
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 12288 pages used for memmap
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 0 pages reserved
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 771216 pages, LIFO batch:31
<6>[    0.000000] -(0)[0:swapper]psci: probing for conduit method from DT.
<6>[    0.000000] -(0)[0:swapper]psci: PSCIv1.0 detected in firmware.
<6>[    0.000000] -(0)[0:swapper]psci: Using standard PSCI v0.2 function IDs
<6>[    0.000000] -(0)[0:swapper]psci: Trusted OS migration not required
<6>[    0.000000] -(0)[0:swapper]psci: SMC Calling Convention v1.1
<6>[    0.000000] -(0)[0:swapper]PERCPU: Embedded 23 pages/cpu @ffffffc0bfe7c000 s54680 r8192 d31336 u94208
<7>[    0.000000] -(0)[0:swapper]pcpu-alloc: s54680 r8192 d31336 u94208 alloc=23*4096
<7>[    0.000000] -(0)[0:swapper]pcpu-alloc: [0] 0 [0] 1 [0] 2 [0] 3 [0] 4 [0] 5 [0] 6 [0] 7 
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM errata 855873
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM erratum 845719
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM erratum 855872
<6>[    0.000000] -(0)[0:swapper]Built 1 zonelists in Zone order, mobility grouping on.  Total pages: 758928
<6>[    0.000000] -(0)[0:swapper][cpu_ntf] <00>ffffff8008198188 (page_alloc_cpu_notify)
<5>[    0.000000] Kernel command line: console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6763 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=orange bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=0 bootprof.pl_t=4682 bootprof.lk_t=7367 bootprof.logo_t=1226 boot_reason=4 androidboot.serialno=S19F00013 androidboot.secureboot=49 androidboot.specialid=0 dlconfig_tof_offset=0 dlconfig_tof_x_talk=0 config_data_tof_offset_cali_flag=0 config_data_tof_xtalk_cali_flag=0 config_data_cp_index=0 config_data_charge_current=0 config_data_charge_termination_current=0 config_data_charge_voltage=0 config_data_recharge_threshold=0 config_data_precharge_current=0 config_data_pid_target_temperature=0 config_data_battery_profile_id=0 cmdline_power_on_flag=1 power_key_flag=0 power_on_threshold=<6>[    0.000000] -(0)[0:swapper]PID hash table entries: 4096 (order: 3, 32768 bytes)
<6>[    0.000000] -(0)[0:swapper]Dentry cache hash table entries: 524288 (order: 10, 4194304 bytes)
<6>[    0.000000] -(0)[0:swapper]Inode-cache hash table entries: 262144 (order: 9, 2097152 bytes)
<6>[    0.000000] -(0)[0:swapper]software IO TLB [mem 0xffe33000-0xffe73000] (0MB) mapped at [ffffffc0bfe33000-ffffffc0bfe72fff]
<6>[    0.000000] -(0)[0:swapper]Memory: 2729796K/3084864K available (11960K kernel code, 1714K rwdata, 4688K rodata, 5152K init, 4633K bss, 355068K reserved, 0K cma-reserved)
<5>[    0.000000] -(0)[0:swapper]Virtual kernel memory layout:
<5>[    0.000000]     modules : 0xffffff8000000000 - 0xffffff8008000000   (   128 MB)
<5>[    0.000000]     vmalloc : 0xffffff8008000000 - 0xffffffbdbfff0000   (   246 GB)
<5>[    0.000000]       .init : 0xffffff80090c9000 - 0xffffff80095d1000   (  5152 KB)
<5>[    0.000000]       .text : 0xffffff8008080000 - 0xffffff8008c2f000   ( 11964 KB)
<5>[    0.000000]     .rodata : 0xffffff8008c2f000 - 0xffffff80090c9000   (  4712 KB)
<5>[    0.000000]       .data : 0xffffff80095d1000 - 0xffffff800977db08   (  1715 KB)
<5>[    0.000000]     vmemmap : 0xffffffbdc0000000 - 0xffffffbfc0000000   (     8 GB maximum)
<5>[    0.000000]               0xffffffbdc0000000 - 0xffffffbdc3000000   (    48 MB actual)
<5>[    0.000000]     fixed   : 0xffffffbffe7fd000 - 0xffffffbffec00000   (  4108 KB)
<5>[    0.000000]     PCI I/O : 0xffffffbffee00000 - 0xffffffbfffe00000   (    16 MB)
<6>[    0.000000] -(0)[0:swapper][cpu_ntf] <00>ffffff80081d70b0 (slab_cpuup_callback)
<6>[    0.000000] -(0)[0:swapper]SLUB: HWalign=64, Order=0-0, MinObjects=0, CPUs=8, Nodes=1
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff80080eecd8 (sched_ilb_notifier)
<4>[    0.000000] -(0)[0:swapper/0]Initializing HMP scheduler:
<6>[    0.000000] -(0)[0:swapper/0]Preemptible hierarchical RCU implementation.
<6>[    0.000000] -(0)[0:swapper/0]	Build-time adjustment of leaf fanout to 64.
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008115b40 (rcu_cpu_notify)
<4>[    0.000000] -(0)[0:swapper/0]
<4>[    0.000000] -(0)[0:swapper/0]**********************************************************
<4>[    0.000000] -(0)[0:swapper/0]**   NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE   **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]** trace_printk() being used. Allocating extra memory.  **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]** This means that this is a DEBUG kernel and it is     **
<4>[    0.000000] -(0)[0:swapper/0]** unsafe for production use.                           **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]** If you see this message and you are not debugging    **
<4>[    0.000000] -(0)[0:swapper/0]** the kernel, report this immediately to your vendor!  **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]**   NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE   **
<4>[    0.000000] -(0)[0:swapper/0]**********************************************************
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008366fc0 (radix_tree_callback)
<6>[    0.000000] -(0)[0:swapper/0]NR_IRQS:64 nr_irqs:64 0
<6>[    0.000000] -(0)[0:swapper/0]GIC: Using split EOI/Deactivate mode
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008392118 (gic_secondary_init)
<4>[    0.000000] -(0)[0:swapper/0]### gic-v3 init done. ###
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff80084564e0 (gic_sched_hotplug_callback)
<5>[    0.000000] -(0)[0:swapper/0]### gic-v3 scheduled pm init done ###
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff800811eae8 (timer_cpu_notify)
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008120670 (hrtimer_cpu_notify)
<3>[    0.000000] -(0)[0:swapper/0]mtk_infracfg_ao_init: infra mfg debug: 050000f2
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_init:arch_timer_rate(0xc65d40),PHYS_SECURE_PPI=1,PHYS_NONSECURE_PPI=2,VIRT_PPI=3,HYP_PPI=4
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_init:arch_timer_c3stop=1
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:arch_timer_rate(0xc65d40),arch_timer_use_virtual=0
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:request_percpu_irq PHYS_SECURE_PPI err=0
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:request_percpu_irq PHYS_NONSECURE_PPI err=0
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff800895d000 (arch_timer_cpu_notify)
<6>[    0.000000] -(0)[0:swapper/0]Architected cp15 timer(s) running at 13.00MHz (phys).
<6>[    0.000000] -(0)[0:swapper/0]clocksource: arch_sys_counter: mask: 0xffffffffffffff max_cycles: 0x2ff89eacb, max_idle_ns: 440795202429 ns
<6>[    0.000000] -(0)[0:swapper/0]sched_clock: 56 bits at 13MHz, resolution 76ns, wraps every 4398046511101ns
<6>[    0.000054] -(0)[0:swapper/0][mtk_gpt] base=0xffffff8009c0e000, irq=5
<6>[    0.000066] -(0)[0:swapper/0][mtk_gpt] gpt1, base=0xffffff8009c0e010
<6>[    0.000074] -(0)[0:swapper/0][mtk_gpt] gpt2, base=0xffffff8009c0e020
<6>[    0.000082] -(0)[0:swapper/0][mtk_gpt] gpt3, base=0xffffff8009c0e030
<6>[    0.000090] -(0)[0:swapper/0][mtk_gpt] gpt4, base=0xffffff8009c0e040
<6>[    0.000098] -(0)[0:swapper/0][mtk_gpt] gpt5, base=0xffffff8009c0e050
<6>[    0.000106] -(0)[0:swapper/0][mtk_gpt] gpt6, base=0xffffff8009c0e060
<6>[    0.000143] -(0)[0:swapper/0][mtk_gpt] gpt1: clkdiv=1, cmp=128, hz=250, freq=32000
<6>[    0.000159] -(0)[0:swapper/0][mtk_gpt] acao clkevt, freq=32000
<6>[    0.001137] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008135700 (hotplug_cfd)
<6>[    0.134899] .(0)[0:swapper/0]console [ttyMT0] enabled
<3>[    0.135599] .(0)[0:swapper/0]ram_console: buffer start: 0xffffff8009c16000, size: 0x800
<3>[    0.136862] .(0)[0:swapper/0]pmic & external buck: 0xff
<3>[    0.137534] .(0)[0:swapper/0]ram_console: CPU notifier status: 18, 65, 0x0, 6729571524
<3>[    0.138553] .(0)[0:swapper/0]ram_console: CPU HPS footprint: 1566, 0x0, 11, 3827
<3>[    0.139516] .(0)[0:swapper/0]ram_console: last init function: 0xffffff8000dee090
<6>[    0.140595] .(0)[0:swapper/0]Calibrating delay loop (skipped), value calculated using timer frequency.. 26.00 BogoMIPS (lpj=52000)
<6>[    0.141861] .(0)[0:swapper/0]pid_max: default: 32768 minimum: 301
<6>[    0.142717] .(0)[0:swapper/0][cpu_ntf] <00>ffffff80082193a8 (buffer_cpu_notify)
<6>[    0.143663] .(0)[0:swapper/0]Security Framework initialized
<6>[    0.144383] .(0)[0:swapper/0]SELinux:  Initializing.
<7>[    0.145070] .(0)[0:swapper/0]SELinux:  Starting in permissive mode
<6>[    0.145113] .(0)[0:swapper/0]Mount-cache hash table entries: 8192 (order: 4, 65536 bytes)
<6>[    0.146160] .(0)[0:swapper/0]Mountpoint-cache hash table entries: 8192 (order: 4, 65536 bytes)
<6>[    0.147571] .(0)[0:swapper/0][cpu_ntf] <00>ffffff800819e0a8 (ratelimit_handler)
<6>[    0.148835] .(0)[0:swapper/0]Initializing cgroup subsys freezer
<6>[    0.149607] .(0)[0:swapper/0]Initializing cgroup subsys debug
<6>[    0.150377] .(0)[0:swapper/0][cpu_ntf] <00>ffffff80080a21c8 (smpboot_thread_call)
<6>[    0.151464] -(0)[0:swapper/0]init_heavy_tlb start.
<4>[    0.152088] -(0)[0:swapper/0]init_heavy_tlb: cpu=0 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.153245] -(0)[0:swapper/0]init_heavy_tlb: cpu=1 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.154405] -(0)[0:swapper/0]init_heavy_tlb: cpu=2 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.155566] -(0)[0:swapper/0]init_heavy_tlb: cpu=3 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.156726] -(0)[0:swapper/0]init_heavy_tlb: cpu=4 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<4>[    0.157898] -(0)[0:swapper/0]init_heavy_tlb: cpu=5 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<4>[    0.159069] -(0)[0:swapper/0]init_heavy_tlb: cpu=6 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<4>[    0.160240] -(0)[0:swapper/0]init_heavy_tlb: cpu=7 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<6>[    0.161563] .(0)[1:swapper/0]ASID allocator initialised with 65536 entries
<6>[    0.162454] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080a7918 (cpu_callback)
<6>[    0.165477] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080bf1b8 (workqueue_cpu_up_callback)
<6>[    0.166504] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080bf510 (workqueue_cpu_down_callback)
<6>[    0.177555] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d64f8 (migration_call)
<6>[    0.178463] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d1950 (sched_cpu_active)
<6>[    0.179394] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d1918 (sched_cpu_inactive)
<6>[    0.181583] .(0)[1:swapper/0][cpu_ntf] <00>ffffff800817e6f0 (hotplug_event_notify)
<6>[    0.187100] .(0)[1:swapper/0][cpu_ntf] <00>ffffff800841d300 (cpu_hotplug_cb_notifier)
<6>[    0.188116] .(0)[1:swapper/0]CPU Hotplug Low Power Notification
<3>[    0.188893] .(0)[1:swapper/0]BOOTPROF:       188.892538: ON
<1>[    0.190103] .(0)[1:swapper/0]init_get_max_DRAM_size done. phone_dram_sz: 0xc0000000, kernel_mem_sz: 0xc0000000
<3>[    0.191441] .(0)[1:swapper/0]tag_devinfo_data size:200, HRID size:4
<3>[    0.192246] .(0)[1:swapper/0][devinfo][SegCode] Segment Code=0x11
<5>[    0.193072] .(0)[1:swapper/0]log_store: sram header address 0xffffff8009c18f00.
<5>[    0.194020] .(0)[1:swapper/0]log_store printk log buff addr:0x41787cc4, size 0x80000. buff flag 0x427.
<5>[    0.195205] .(0)[1:swapper/0]sram_dram_buff sig 0x5678ef90
<5>[    0.195921] .(0)[1:swapper/0]sram_dram_buff flag 0x427
<5>[    0.196594] .(0)[1:swapper/0]sram_dram_buff add 0x7ff80000
<5>[    0.197309] .(0)[1:swapper/0]sram_dram_buff size 0x40000
<5>[    0.198004] .(0)[1:swapper/0]sram_dram_buff offsize 0x20
<5>[    0.198710] .(0)[1:swapper/0]sram_dram_buff point 0x2a160
<6>[    0.221574] .(0)[1:swapper/0]Brought up 8 CPUs
<6>[    0.222160] .(0)[1:swapper/0]SMP: Total of 8 processors activated.
<6>[    0.222982] .(0)[1:swapper/0]CPU features: detected feature: GIC system register CPU interface
<6>[    0.224084] .(0)[1:swapper/0]CPU: All CPU(s) started at EL2
<6>[    0.224862] -(0)[10:migration/0]alternatives: patching kernel code
<6>[    0.228780] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080c8cb8 (sched_domains_numa_masks_update)
<6>[    0.229876] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080daf30 (cpuset_cpu_active)
<6>[    0.230816] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080dafa8 (cpuset_cpu_inactive)
<6>[    0.231781] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d2ec0 (hotplug_hrtick)
<6>[    0.233026] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80083dea78 (device_hotplug_notifier)
<1>[    0.260219] .(0)[1:swapper/0][PHY layout]tee_reserved_mem   :   0xeff00000 - 0xeff3ffff (0x40000)
<1>[    0.261396] .(0)[1:swapper/0][debug]available DRAM size = 0xc0000000
<1>[    0.261396] [PHY layout]FB (dt) :  0x7f220000 - 0x7feaffff  (0xc90000)
<1>[    0.263235] .(0)[1:swapper/0]
<1>[    0.263235]  register_restart_handler- 0xffffff8009bb6fd0, Notify call: - 0xffffff80088f4698
<1>[    0.264718] .(0)[1:swapper/0]ARCH_RESET register mtk_restart_handler  ok!!!!
<6>[    0.267541] .(0)[1:swapper/0]clocksource: jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 7645041785100000 ns
<6>[    0.268984] .(0)[1:swapper/0]futex hash table entries: 2048 (order: 6, 262144 bytes)
<6>[    0.270522] .(1)[1:swapper/0]pinctrl core: initialized pinctrl subsystem
<4>[    0.271878] .(1)[1:swapper/0][PLAT DBG INFO] 0xd8a3: 0x11d80c(ffffff8009c1a80c), 64
<4>[    0.272877] .(1)[1:swapper/0][PLAT DBG INFO] 0xe31c: 0x11d84c(ffffff8009c1c84c), 16
<4>[    0.273857] .(1)[1:swapper/0][PLAT DBG INFO] 0x0: 0x0(          (null)), 0
<6>[    0.275115] .(1)[1:swapper/0]mtk_wdt_get_base_addr: compatible node found: toprgu
<6>[    0.276433] .(1)[1:swapper/0]NET: Registered protocol family 16
<6>[    0.278874] .(1)[1:swapper/0]ramoops: using module parameters
<3>[    0.279713] .(1)[1:swapper/0]ramoops: pstore:address is 0x54410000, size is 0xe0000, console_size is 0x40000, pmsg_size is 0x10000
<6>[    0.339124] .(4)[1:swapper/0]console [pstore-1] enabled
<6>[    0.339890] .(4)[1:swapper/0]pstore: Registered ramoops as persistent store backend
<6>[    0.340881] .(4)[1:swapper/0]ramoops: attached 0xe0000@0x54410000, ecc: 0/0
<3>[    0.341784] .(4)[1:swapper/0]BOOTPROF:       341.783615:probe: probe=platform_drv_probe drv=ramoops(ffffff800961f198)    62.061000ms
<3>[    0.343320] .(4)[1:swapper/0]BOOTPROF:       343.320154:initcall: ramoops_init    64.441154ms
<6>[    0.344765] .(4)[1:swapper/0][EMI] dram_type(1)
<6>[    0.345364] .(4)[1:swapper/0][EMI] ch_num(1)
<6>[    0.345916] .(4)[1:swapper/0][EMI] rk_num(2)
<6>[    0.346482] .(4)[1:swapper/0][EMI] rank0_size(0x10)
<6>[    0.346881] [EMI] rank1_size(0x8)<4>[    0.347466] .(4)[1:swapper/0]PWRAP reg: 0xffffff8009d96000,  irq: 12
<4>[    0.348341] -(1)[0:swapper/1]------------[ cut here ]------------
<3>[    0.348565] .(4)[1:swapper/0][DRAMC] dram info dram rank number = 2
<3>[    0.348569] .(4)[1:swapper/0][DRAMC] dram info dram rank0 base = 0x77fef000
<3>[    0.348572] .(4)[1:swapper/0][DRAMC] dram info dram rank1 base = 0xeeaff000
<3>[    0.348576] .(4)[1:swapper/0][DRAMC]find dt_scan_dram_info
<6>[    0.348698] .(4)[1:swapper/0]mtk_wdt_init ok
<4>[    0.353022] -(1)[0:swapper/1]WARNING: CPU: 1 PID: 0 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/drivers/misc/mediatek/pmic_wrap/mt6763/pwrap_hal.c:1485 mt_pmic_wrap_irq+0x118/0x1a0()
<4>[    0.355130] -(1)[0:swapper/1]Modules linked in:
<4>[    0.355510] -(1)[0:swapper/1]CPU: 1 PID: 0 Comm: swapper/1 Not tainted 4.4.95+ #2
<4>[    0.356473] -(1)[0:swapper/1]Hardware name: MT6763V/B (DT)
<4>[    0.357191] -(1)[0:swapper/1]Call trace:
<4>[    0.357709] -(1)[0:swapper/1][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    0.358600] -(1)[0:swapper/1][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    0.359444] -(1)[0:swapper/1][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    0.360291] -(1)[0:swapper/1][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    0.361245] -(1)[0:swapper/1][<ffffff80080a1d10>] warn_slowpath_null+0x18/0x20
<4>[    0.362178] -(1)[0:swapper/1][<ffffff8008534168>] mt_pmic_wrap_irq+0x118/0x1a0
<4>[    0.363111] -(1)[0:swapper/1][<ffffff800810ab5c>] handle_irq_event_percpu+0x6c/0x250
<4>[    0.364109] -(1)[0:swapper/1][<ffffff800810ad88>] handle_irq_event+0x48/0x78
<4>[    0.365020] -(1)[0:swapper/1][<ffffff800810e9b8>] handle_fasteoi_irq+0xb8/0x1b0
<4>[    0.365963] -(1)[0:swapper/1][<ffffff8008109fbc>] generic_handle_irq+0x24/0x38
<4>[    0.366896] -(1)[0:swapper/1][<ffffff800810a304>] __handle_domain_irq+0xac/0x280
<4>[    0.367851] -(1)[0:swapper/1][<ffffff8008081960>] gic_handle_irq+0xe8/0x19c
<4>[    0.368751] -(1)[0:swapper/1]Exception stack(0xffffffc0401c3ce0 to 0xffffffc0401c3e10)
<4>[    0.369774] -(1)[0:swapper/1]3ce0: ffffff800914c018 0000000000000000 00000040b6d47000 0000000000000000
<4>[    0.370967] -(1)[0:swapper/1]3d00: 00000040b6d47000 00000000000000c0 00000000fffedb43 0000000000000000
<4>[    0.372160] -(1)[0:swapper/1]3d20: ffffffc0401b2930 ffffffc0401c3e80 00000000000008d0 0000000000000000
<4>[    0.373353] -(1)[0:swapper/1]3d40: 0000000000000001 3065783020736920 6e6f63202c303030 ffffff80897852de
<4>[    0.374546] -(1)[0:swapper/1]3d60: 0000000000000007 0000000000000001 0000000000000001 ffffff8009712ac8
<4>[    0.375739] -(1)[0:swapper/1]3d80: ffffff8009712000 ffffff800914c000 ffffff800914c018 ffffff80095dbf58
<4>[    0.376932] -(1)[0:swapper/1]3da0: 0000000000000000 0000000000000000 ffffff80091517e0 ffffffc0401b2000
<4>[    0.378124] -(1)[0:swapper/1]3dc0: ffffff8008c36000 ffffffc0401c3f10 ffffff8008085a24 ffffffc0401c3f10
<4>[    0.379318] -(1)[0:swapper/1]3de0: ffffff8008085a28 0000000060000045 ffffffc0401b2000 ffffff80080ee520
<4>[    0.380510] -(1)[0:swapper/1]3e00: ffffffffffffffff ffffff8008c24890
<4>[    0.381333] -(1)[0:swapper/1][<ffffff8008084878>] el1_irq+0xb8/0x130
<4>[    0.382157] -(1)[0:swapper/1][<ffffff8008085a28>] arch_cpu_idle+0x38/0x138
<4>[    0.383046] -(1)[0:swapper/1][<ffffff80080f5e44>] cpu_startup_entry+0x1dc/0x358
<4>[    0.383990] -(1)[0:swapper/1][<ffffff8008090254>] secondary_start_kernel+0x24c/0x400
<4>[    0.384988] -(1)[0:swapper/1][<0000000040c2903c>] 0x40c2903c
<4>[    0.385732] -(1)[0:swapper/1]---[ end trace 911ba04329a1ff36 ]---
<6>[    0.393484] .(4)[1:swapper/0]cpuidle: using governor menu
<3>[    0.394184] .(4)[1:swapper/0]BOOTPROF:       394.184692:initcall: init_menu    45.474846ms
<6>[    0.401528] .(4)[1:swapper/0]cpuidle: using governor mtk_menu
<3>[    0.403025] .(4)[1:swapper/0]Power/swap IDLE BLOCKING INFO SETTING FAIL (type:3)
<6>[    0.405051] .(4)[1:swapper/0]vdso: 2 pages (1 code @ ffffff8008c35000, 1 data @ ffffff80095d9000)
<6>[    0.406224] .(4)[1:swapper/0]hw-breakpoint: found 6 breakpoint and 4 watchpoint registers.
<6>[    0.407442] .(4)[1:swapper/0]DMA: preallocated 256 KiB pool for atomic allocations
<4>[    0.408533] .(4)[1:swapper/0][EIC] no built in eint hw deb property
<4>[    0.409338] .(4)[1:swapper/0][EIC] builtin_mapping: spec=11, len=21
<4>[    0.410152] .(4)[1:swapper/0][EIC] debtime_setting: entry=10, spec=0, len=20
<5>[    0.411592] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: cluster_num = 2
<5>[    0.412506] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: ppm cluster 0 -> core_num = 4, cpu_id = 0
<5>[    0.413708] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: ppm cluster 1 -> core_num = 4, cpu_id = 4
<5>[    0.414914] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: done!
<5>[    0.415856] .(4)[1:swapper/0][Power/PPM] @ppm_main_pdrv_probe: ppm probe done!
<5>[    0.416800] .(4)[1:swapper/0][Power/PPM] ppm_profile_init done
<5>[    0.417548] .(4)[1:swapper/0][Power/PPM] ppm driver init done!
<4>[    0.418477] .(4)[1:swapper/0]### CIRQ init done. ###
<4>[    0.419526] .(4)[1:swapper/0][DISP]init_log_buffer success
<5>[    0.420453] .(4)[1:swapper/0]
<5>[    0.420453]  MTK_SIP_KERNEL_WDT - 0xffffff80087d9d70
<5>[    0.421500] .(4)[1:swapper/0]
<5>[    0.421500]  atf_aee_debug_virt_addr = 0xffffff8009df0000
<5>[    0.425271] .(4)[1:swapper/0]mrdump_cblock_init: done.
<3>[    0.425986] .(4)[1:swapper/0]mrdump_platform_init: MT-RAMDUMP init failed, lk version  not matched.
<1>[    0.427161] .(4)[1:swapper/0]mrdump_wd_dram_reserved_mode: DDR Reserved Mode ready or not? (yes)
<6>[    0.428335] .(4)[1:swapper/0]mtk_wdt_swsysret_config: before set wdt_sys_val =8000
<6>[    0.429303] .(4)[1:swapper/0]mtk_wdt_swsysret_config: after set wdt_sys_val =8000,wdt_sys_val=88008000
<6>[    0.430496] .(4)[1:swapper/0]mtk_rgu_dram_reserved: MTK_WDT_MODE(0xdd)
<1>[    0.431341] .(4)[1:swapper/0]mrdump_wd_dram_reserved_mode: DDR reserved mode enabled
<6>[    0.432346] .(4)[1:swapper/0]mrdump_hw_init: init_done.
<5>[    0.433071] .(4)[1:swapper/0]mirdump: reserved 544f0000+3000->ffffff8009dfb000
<4>[    0.439753] .(4)[1:swapper/0]mt6763 pinctrl probe
<4>[    0.440738] .(4)[1:swapper/0]mtk_pctrl_init------ ok
<6>[    0.441724] .(4)[1:swapper/0]mtk wdt driver probe ..
<6>[    0.442965] .(4)[1:swapper/0]ext_debugkey_eint=-1
<6>[    0.446352] .(4)[1:swapper/0][EMI] module probe.
<6>[    0.447090] .(4)[1:swapper/0][EMI DBG] INFRACFG_BASE@ ffffff8009e20000
<6>[    0.447952] .(4)[1:swapper/0][EMI DBG] INFRA_AO_BASE@ ffffff8009e22000
<6>[    0.448837] .(4)[1:swapper/0][EMI DBG] PERICFG_BASE@ ffffff8009e24000
<6>[    0.449661] .(4)[1:swapper/0][EMI] get CEN_EMI_BASE @ ffffff8009e18000
<6>[    0.450507] .(4)[1:swapper/0][EMI] get EMI_MPU_BASE @ ffffff8009e1a000
<6>[    0.451353] .(4)[1:swapper/0][EMI] get CH0_EMI_BASE @ ffffff8009e1c000
<6>[    0.452199] .(4)[1:swapper/0][EMI] get CH1_EMI_BASE @ ffffff8009e1e000
<6>[    0.453074] .(4)[1:swapper/0][MPU] initialize EMI MPU
<6>[    0.453741] .(4)[1:swapper/0][MPU] get MPU IRQ: 47
<7>[    0.457491] .(4)[1:swapper/0][DRAMC] module probe.
<4>[    0.457550] .(4)[1:swapper/0][DRAMC]get DRAMC_AO_CHA_BASE_ADDR @ ffffff8009e28000
<4>[    0.458504] .(4)[1:swapper/0][DRAMC]get DRAMC_AO_CHB_BASE_ADDR @ ffffff8009e2c000
<4>[    0.459469] .(4)[1:swapper/0][DRAMC]get DDRPHY_AO_CHA_BASE_ADDR @ ffffff8009e34000
<4>[    0.460445] .(4)[1:swapper/0][DRAMC]get DDRPHY_AO_CHB_BASE_ADDR @ ffffff8009e38000
<4>[    0.461437] .(4)[1:swapper/0][DRAMC]get DRAMC_NAO_CHA_BASE_ADDR @ ffffff8009e30000
<4>[    0.462402] .(4)[1:swapper/0][DRAMC]get DRAMC_NAO_CHB_BASE_ADDR @ ffffff8009e32000
<4>[    0.463378] .(4)[1:swapper/0][DRAMC]get DDRPHY_NAO_CHA_BASE_ADDR @ ffffff80083e0528
<4>[    0.464365] .(4)[1:swapper/0][DRAMC]get DDRPHY_NAO_CHB_BASE_ADDR @ ffffffc04015ba80
<4>[    0.465470] .(4)[1:swapper/0][DRAMC]get SLEEP_BASE_ADDR @ ffffff8009e3c000
<6>[    0.466420] .(4)[1:swapper/0][DRAMC]get SYS_TIMER_BASE_ADDR @ ffffff8009e3e000
<3>[    0.467342] .(4)[1:swapper/0][DRAMC Driver] dram type =1
<3>[    0.468036] .(4)[1:swapper/0][DRAMC Driver] Channel num =1
<3>[    0.468752] .(4)[1:swapper/0][DRAMC Driver] cbt mode =0
<3>[    0.469436] .(4)[1:swapper/0][DRAMC Driver] Dram Data Rate = 1866
<3>[    0.470246] .(4)[1:swapper/0][DRAMC Driver] shuffle_status = 0
<3>[    0.471000] .(4)[1:swapper/0][DRAMC Driver] dram can support DFS
<6>[    0.472479] .(4)[1:swapper/0]SSPM is ready to service IPI
<4>[    0.477809] .(4)[1:swapper/0]disp driver(1) disp_probe begin
<4>[    0.487507] .(4)[1:swapper/0]disp driver(1) disp_probe end
<3>[    0.511672] .(4)[1:swapper/0]BOOTPROF:       511.671693:initcall: arm64_device_init    75.820539ms
<4>[    0.512828] .(4)[1:swapper/0][pid=1]g_mmdvfs_step_util init with lp3
<4>[    0.513643] .(4)[1:swapper/0][pid=1]g_mmdvfs_step_util init
<3>[    0.517054] .(4)[1:swapper/0]systracker probe
<3>[    0.517628] .(4)[1:swapper/0]of_iomap for systracker @ 0xffffff8009e64000
<3>[    0.518501] .(4)[1:swapper/0][systracker] bus_dbg_con is in infra
<3>[    0.519326] .(4)[1:swapper/0]systracker_platform_probe_default:113: irq # 52
<6>[    0.539931] .(4)[1:swapper/0][cpu_ntf] <00>ffffff8008347730 (blk_cpu_notify)
<6>[    0.540852] .(4)[1:swapper/0][cpu_ntf] <00>ffffff8008347fa0 (blk_iopoll_cpu_notify)
<6>[    0.541838] .(4)[1:swapper/0][cpu_ntf] <00>ffffff800834e618 (blk_mq_main_cpu_notify)
<6>[    0.542829] .(4)[1:swapper/0][cpu_ntf] <00>ffffff800834b5d8 (blk_mq_queue_reinit_notify)
<6>[    0.544367] .(4)[1:swapper/0]mcdi_sysram_base = ffffff8009e68000
<4>[    0.546442] .(4)[1:swapper/0][M4U] mau_start_monitor [0], start=0x0, end=0xfffff, write: 1, port_mask=0xffffffff, larb_mask=0xffffffff
<4>[    0.548010] .(4)[1:swapper/0][M4U] mau_start_monitor [1], start=0x0, end=0xfffff, write: 0, port_mask=0xffffffff, larb_mask=0xffffffff
<4>[    0.550510] .(4)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.551280] .(4)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<6>[    0.556982] .(4)[1:swapper/0]mt6370_init (2.0.1_MTK): initializing...
<6>[    0.557912] .(4)[1:swapper/0]usb_type_c node found...
<6>[    0.558592] .(4)[1:swapper/0]tcpc_class_init (2.0.8_MTK)
<6>[    0.559276] .(4)[1:swapper/0]SVDM supported mode [0]: name = DisplayPort, svid = 0xff01
<6>[    0.560319] .(4)[1:swapper/0]SVDM supported mode [1]: name = Direct Charge, svid = 0x29cf
<6>[    0.561360] .(4)[1:swapper/0]dpm_check_supported_modes : found "disorder"...
<6>[    0.562282] .(4)[1:swapper/0]TCPC class init OK
<6>[    0.562874] .(4)[1:swapper/0]pd_dbg_info_init
<5>[    0.563549] .(4)[1:swapper/0][CMDQ]Register 1 monitor task CB (cmdq_mdp_start_task_atomic_virtual,cmdq_mdp_finish_task_atomic_virtual)
<5>[    0.565484] .(4)[1:swapper/0][CMDQ][CMDQ] platform_dev dev:ffffffc05f769810 PA:0x0000000010238000 VA:ffffff8009e82000 irqId:60 irqSecId:61 clk gce:0xffffffc05ec1c680 timer:0xffffffc05ec1c780
<5>[    0.567626] .(4)[1:swapper/0][CMDQ]set dma mask result: 0
<5>[    0.568375] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mmsys_config): 0xffffff8009e84000
<5>[    0.569361] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rdma0): 0xffffff8009e86000
<5>[    0.570295] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rsz0): 0xffffff8009e88000
<5>[    0.571216] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rsz1): 0xffffff8009e8a000
<5>[    0.572139] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_wdma0): 0xffffff8009e8c000
<5>[    0.573071] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_wrot0): 0xffffff8009e8e000
<5>[    0.574018] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_tdshp0): 0xffffff8009e90000
<5>[    0.574964] .(4)[1:swapper/0][CMDQ]DEV: VA ref(disp_color0): 0xffffff8009e92000
<5>[    0.575927] .(4)[1:swapper/0][CMDQ]DEV: VA ref(venc): 0xffffff8009e94000
<5>[    0.578346] .(4)[1:swapper/0][CMDQ]DEV: PA ref(mm_mutex): start = 0x0000000014016000
<5>[    0.579343] .(4)[1:swapper/0][CMDQ]free CPR size:544 thread:16
<5>[    0.581699] .(4)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x0, count: 64, Name: Fake SPR
<5>[    0.582863] .(4)[1:swapper/0][CMDQ]CPR for thread allocated, thread:16 free:1920
<5>[    0.583808] .(4)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x40, count: 10, Name: Delay CPR
<4>[    0.584990] .(4)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.585780] .(4)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<3>[    0.586742] .(4)[1:swapper/0]BOOTPROF:       586.742385:probe: probe=platform_drv_probe drv=mtk_cmdq(ffffff80096727d0)    21.352000ms
<3>[    0.589101] .(4)[1:swapper/0]BOOTPROF:       589.100847:initcall: cmdq_init    25.550539ms
<5>[    0.592588] .(4)[1:swapper/0][ccci0/util]opt_md2_support using default
<5>[    0.593526] .(4)[1:swapper/0][ccci0/util]opt_md5_support using default
<5>[    0.594450] .(4)[1:swapper/0][ccci0/util]opt_irat_support using default
<1>[    0.595759] .(4)[1:swapper/0][PHY layout]ccci_md0 at LK  :  0xb0000000 - 0xbf7fffff  (0xf800000)
<6>[    0.623010] .(4)[1:swapper/0]Freeing modem memory: 175936K from phys b3c30000
<6>[    0.623932] .(4)[1:swapper/0]free_reserved_memory: 0xb3c30000 ~ 0xbe800000
<6>[    0.625206] .(4)[1:swapper/0]Freeing modem memory: 1408K from phys b16a0000
<6>[    0.626096] .(4)[1:swapper/0]free_reserved_memory: 0xb16a0000 ~ 0xb1800000
<6>[    0.627182] .(4)[1:swapper/0]Freeing modem memory: 320K from phys b15b0000
<6>[    0.628060] .(4)[1:swapper/0]free_reserved_memory: 0xb15b0000 ~ 0xb1600000
<6>[    0.629129] .(4)[1:swapper/0]Freeing modem memory: 64K from phys b3bd0000
<6>[    0.629997] .(4)[1:swapper/0]free_reserved_memory: 0xb3bd0000 ~ 0xb3be0000
<6>[    0.631051] .(4)[1:swapper/0]Freeing modem memory: 64K from phys b3bf0000
<6>[    0.631917] .(4)[1:swapper/0]free_reserved_memory: 0xb3bf0000 ~ 0xb3c00000
<6>[    0.634179] .(4)[1:swapper/0]Freeing modem memory: 8192K from phys bf800000
<6>[    0.635069] .(4)[1:swapper/0]free_reserved_memory: 0xbf800000 ~ 0xc0000000
<1>[    0.636437] .(4)[1:swapper/0][PHY layout]ccci_share_mem at LK  :  0x80000000 - 0x800fffff  (0x100000)
<5>[    0.637670] .(4)[1:swapper/0][ccci0/util]Using default META MD setting[0][0]
<3>[    0.638858] .(4)[1:swapper/0]BOOTPROF:       638.857847:initcall: ccci_util_init    46.844385ms
<3>[    0.640681] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init message queue list succeed
<3>[    0.641744] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init active queue list succeed
<3>[    0.642776] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init user information list succeed
<3>[    0.643910] .(4)[1:swapper/0][CONN_MD_DMP][I]conn_md_dmp_init:alloc memory for msg log system done, size:0x00000430
<3>[    0.645234] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:conn_md_dmp_init succeed
<3>[    0.646309] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:create conn_md_thread succeed, wakeup it
<6>[    0.647459] .(4)[1:swapper/0]Init Richtek RegMap 1.1.13_G
<5>[    0.648395] .(4)[1:swapper/0]SCSI subsystem initialized
<6>[    0.649225] .(4)[1:swapper/0]usbcore: registered new interface driver usbfs
<6>[    0.650147] .(4)[1:swapper/0]usbcore: registered new interface driver hub
<6>[    0.651157] .(4)[1:swapper/0]usbcore: registered new device driver usb
<6>[    0.654230] .(4)[1:swapper/0]mt_charger_probe
<6>[    0.654992] .(4)[1:swapper/0]Advanced Linux Sound Architecture Driver Initialized.
<6>[    0.656344] .(4)[1:swapper/0][cpu_ntf] <00>ffffff8008a6f7a0 (dev_cpu_callback)
<4>[    0.657554] .(4)[1:swapper/0]------------[ cut here ]------------
<4>[    0.658335] .(4)[1:swapper/0]WARNING: CPU: 4 PID: 1 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/net/wireless/reg.c:523 regulatory_init+0xb0/0x174()
<4>[    0.660078] .(4)[1:swapper/0]db.txt is empty, you should update it...
<4>[    0.660660] Modules linked in:.(4)[1:swapper/0]
<4>[    0.661279] -(4)[1:swapper/0]CPU: 4 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #2
<4>[    0.662395] -(4)[1:swapper/0]Hardware name: MT6763V/B (DT)
<4>[    0.663112] -(4)[1:swapper/0]Call trace:
<4>[    0.663631] -(4)[1:swapper/0][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    0.664521] -(4)[1:swapper/0][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    0.665367] -(4)[1:swapper/0][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    0.666213] -(4)[1:swapper/0][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    0.667167] -(4)[1:swapper/0][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    0.668089] -(4)[1:swapper/0][<ffffff8009129e1c>] regulatory_init+0xb0/0x174
<4>[    0.669000] -(4)[1:swapper/0][<ffffff8009129cec>] cfg80211_init+0x74/0xf4
<4>[    0.669879] -(4)[1:swapper/0][<ffffff8008081d48>] do_one_initcall+0xd8/0x208
<4>[    0.670790] -(4)[1:swapper/0][<ffffff80090c9bcc>] kernel_init_freeable+0x188/0x234
<4>[    0.671766] -(4)[1:swapper/0][<ffffff8008c21a68>] kernel_init+0x10/0x108
<4>[    0.672634] -(4)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.673546] .(4)[1:swapper/0]---[ end trace 911ba04329a1ff37 ]---
<6>[    0.673659] .(1)[6:kworker/u16:0]power_supply usb: power_supply_changed
<6>[    0.673682] .(1)[6:kworker/u16:0]power_supply ac: power_supply_changed
<6>[    0.673692] .(1)[6:kworker/u16:0]power_supply charger: power_supply_changed
<3>[    0.673849] .(1)[13:kworker/1:0]power_supply charger: driver failed to report `charge_type' property: -22
<3>[    0.678332] .(5)[1:swapper/0]BOOTPROF:       678.331385:initcall: cfg80211_init    20.954693ms
<6>[    0.680656] .(5)[1:swapper/0]clocksource: Switched to clocksource arch_sys_counter
<3>[    0.703097] .(5)[1:swapper/0]BOOTPROF:       703.096385:initcall: event_trace_init    19.346462ms
<6>[    0.706176] .(5)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    0.706890] .(5)[1:swapper/0][Power/cpufreq] DVFS - @(Record)cpuhvfs_pvt_tbl_create----->(ffffff8009eeec10)
<6>[    0.713335] .(5)[1:swapper/0][regulator_register] pass to register vs1, min_uV:1200000 max_uV:2787500
<6>[    0.714650] .(5)[1:swapper/0][regulator_register] pass to register vmodem, min_uV:500000 max_uV:1293750
<6>[    0.715975] .(5)[1:swapper/0][regulator_register] pass to register vcore, min_uV:500000 max_uV:1293750
<6>[    0.717299] .(5)[1:swapper/0][regulator_register] pass to register vproc, min_uV:500000 max_uV:1293750
<6>[    0.718605] .(5)[1:swapper/0][regulator_register] pass to register vs2, min_uV:1200000 max_uV:2787500
<6>[    0.719902] .(5)[1:swapper/0][regulator_register] pass to register vpa, min_uV:500000 max_uV:3650000
<6>[    0.728683] .(5)[1:swapper/0]****[mt6356_auxadc_init] BAT TEMP = 814, MTS_ADC = 0x45da
<3>[    0.729708] .(5)[1:swapper/0][mt_idle_ntf] <00>ffffff80085175e0 (pmic_auxadc_notify_call)
<3>[    0.732119] .(5)[1:swapper/0]BOOTPROF:       732.118693:probe: probe=platform_drv_probe drv=mt-pmic(ffffff8009660df0)    23.552154ms
<3>[    0.733679] .(5)[1:swapper/0]BOOTPROF:       733.679232:initcall: pmic_mt_init    25.518462ms
<5>[    0.734793] .(5)[1:swapper/0] pimix = 170
<5>[    0.735317] .(5)[1:swapper/0][MUSB]usb20_init 1801: usb20 init
<5>[    0.736543] .(5)[1:swapper/0][MUSB]mt_usb_probe 1705: init connection_work
<5>[    0.737436] .(5)[1:swapper/0][MUSB]mt_usb_probe 1708: keep musb->power & mtk_usb_power in the samae value
<5>[    0.738722] .(5)[1:swapper/0][MUSB]mt_usb_probe 1736: USB probe done!
<6>[    0.739547] .(5)[1:swapper/0][D][Factory Ext Data](_factory_ext_set_callback): (id=4)+
<6>[    0.740567] .(5)[1:swapper/0][D][Factory Ext Data](_get_factory_ext_item_impl): (id=4)+
<6>[    0.741608] .(5)[1:swapper/0][D][Factory Ext Data](_factory_ext_set_callback): (id=5)+
<6>[    0.742616] .(5)[1:swapper/0][D][Factory Ext Data](_get_factory_ext_item_impl): (id=5)+
<6>[    0.743647] .(5)[1:swapper/0][D][Factory Ext Data](_factory_ext_set_callback): (id=6)+
<6>[    0.744675] .(5)[1:swapper/0][D][Factory Ext Data](_get_factory_ext_item_impl): (id=6)+
<5>[    0.746459] .(5)[1:swapper/0][MUSB]usb20_init 1816: usb20 init ret:0
<7>[    0.747283] .(5)[1:swapper/0][BLOCK_TAG] DRAM: 0x0000000040000000 - 0x0000000100000000, size: 0xc0000000
<3>[    0.747748] .(5)[1:swapper/0][ION]ion_init()
<3>[    0.748805] .(5)[1:swapper/0][ION]ion_drv_probe() heap_nr=9
<3>[    0.749600] .(5)[1:swapper/0]ion_heap_create: Heap type is disabled: 1
<3>[    0.750436] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_system_contig_heap type 1 base 0 size 0
<3>[    0.752162] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.753036] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap type 13 base 0 size 0
<3>[    0.754241] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.755109] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_prot type 13 base 0 size 0
<3>[    0.756378] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.757254] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_2d_fr type 13 base 0 size 0
<3>[    0.758525] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.759393] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_wfd type 13 base 0 size 0
<4>[    0.761045] .(5)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.761828] .(5)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<3>[    0.762647] .(5)[1:swapper/0][ION]ion_init fd register notifer fail
<3>[    0.763455] .(5)[1:swapper/0]BOOTPROF:       763.454616:initcall: ion_init    15.702384ms
<6>[    0.764604] .(5)[1:swapper/0]NET: Registered protocol family 2
<6>[    0.765760] .(5)[1:swapper/0]TCP established hash table entries: 32768 (order: 6, 262144 bytes)
<6>[    0.767057] .(5)[1:swapper/0]TCP bind hash table entries: 32768 (order: 7, 524288 bytes)
<6>[    0.768488] .(5)[1:swapper/0]TCP: Hash tables configured (established 32768 bind 32768)
<6>[    0.769601] .(5)[1:swapper/0]UDP hash table entries: 2048 (order: 4, 65536 bytes)
<6>[    0.770627] .(5)[1:swapper/0]UDP-Lite hash table entries: 2048 (order: 4, 65536 bytes)
<6>[    0.771877] .(5)[1:swapper/0]NET: Registered protocol family 1
<6>[    0.773424] .(5)[1:swapper/0][Power/clkbuf]clk_buf_dump_dts_log: PMIC_CLK_BUF?_STATUS=2 1 1 2 0 0 1
<6>[    0.774577] .(5)[1:swapper/0][Power/clkbuf]clk_buf_dump_dts_log: PMIC_CLK_BUF?_DRV_CURR=-1 -1 -1 -1 -1 -1 -1
<6>[    0.775873] .(5)[1:swapper/0][Power/clkbuf]clk_buf_dump_clkbuf_log DCXO_CW00=0x4e1d, CW02=0x3aee, CW11=0xb800, CW14=0x82b5, CW16=0x9455, top_spi_con1=0x0
<6>[    0.777680] .(5)[1:swapper/0][Power/clkbuf]clk_buf_ctrl_internal: id=6, onoff=0
<6>[    0.778662] .(5)[1:swapper/0][Power/clkbuf]clk_buf_ctrl_internal: id=2, onoff=0, DCXO_ENABLE=0x2, pwrap_dcxo_en_flag=0x2
<6>[    0.780239] .(5)[1:swapper/0]Unpacking initramfs...
<6>[    0.818379] .(5)[1:swapper/0]Freeing initrd memory: 1104K
<3>[    0.819103] .(5)[1:swapper/0]BOOTPROF:       819.103155:initcall: populate_rootfs    39.043692ms
<4>[    0.820241] .(5)[1:swapper/0]TrustKernel TEE Driver initialization
<6>[    0.821125] .(5)[1:swapper/0]platform is bL: 1
<6>[    0.822048] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800878ba10 (tee_cpu_callback)
<4>[    0.824287] .(5)[1:swapper/0]tkcoreos-rev: 0.8.7-gp
<4>[    0.825112] .(5)[1:swapper/0][TKCORE] [    0.000000]: <0>INF TKCore:init_teecore:98: teecore: init ctors
<4>[    0.825112] [    0.000000]: <0>INF TKCore:init_teecore:102: teecore: init time source
<4>[    0.825112] [    5.274209]: <0>INF TKCore:init_teecore:106: teecore: init calls
<4>[    0.825112] [    5.275025]: <0>DBG TKCore:call_initcalls:5
<6>[    0.825135] .(5)[1:swapper/0]tkcore_log_irq: 20
<6>[    0.825214] .(5)[1:swapper/0]TKCore misc: Register the misc device "tkcoredrv" (id=0,minor=61)
<6>[    0.826516] .(5)[1:swapper/0][cpu_ntf] <00>ffffff80089a1b60 (cpu_pmu_notify)
<6>[    0.828173] .(5)[1:swapper/0]hw perfevents: enabled with armv8_pmuv3 PMU driver, 7 counters available
<6>[    0.831564] .(5)[1:swapper/0]audit: initializing netlink subsys (disabled)
<5>[    0.831625] .(5)[1:swapper/0]audit: type=2000 audit(0.784:1): initialized
<6>[    0.831939] .(5)[1:swapper/0][cpu_ntf] <00>ffffff80081a46c0 (cpu_callback)
<4>[    0.834660] [TKCORE] 8: service addr: 0xf00002a0
<4>[    0.834660] [    5.275906]: <0>DBG TKCore:call_initcalls:58: service addr: 0xf00002a4
<4>[    0.834660] [    5.276859]: <0>DBG TKCore:thread_enable_vfp:1311: Enable VFP in kernel with no context and IRQ disabled
<4>[    0.834660] [    5.278129]: <0>DBG TKCore:call_initcalls:<5>[    0.836002] .(5)[1:swapper/0]VFS: Disk quotas dquot_6.6.0
<6>[    0.836093] .(5)[1:swapper/0]VFS: Dquot-cache hash table entries: 512 (order 0, 4096 bytes)
<6>[    0.837066] .(5)[1:swapper/0]Registering sdcardfs 0.1
<6>[    0.837254] .(5)[1:swapper/0]fuse init (API version 7.23)
<7>[    0.837560] .(5)[1:swapper/0]SELinux:  Registering netfilter hooks
<6>[    0.841423] .(5)[1:swapper/0]io scheduler noop registered
<6>[    0.841432] .(5)[1:swapper/0]io scheduler deadline registered
<6>[    0.841563] .(5)[1:swapper/0]io scheduler cfq registered (default)
<6>[    0.841599] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800838ac88 (percpu_counter_hotcpu_callback)
<4>[    0.844845] .(5)[1:swapper/0]Unable to detect cache hierarchy from DT for CPU 0
<4>[    0.845812] .(5)[1:swapper/0][TKCORE] 58: service addr: 0xf00002a8
<4>[    0.845812] [    5.279071]: <0>DBG TKCore:call_initcalls:58: service addr: 0xf00002ac
<4>[    0.845812] [    5.279957]: <0>INF TKCore:spi_init:936: spi_init setup SPI driver
<4>[    0.845812] [    5.280794]: <0>DBG TKCore:call_initcalls:58: service addr: 0xf00002b0
<4>[    0.845812] [    5.2
<6>[    0.847714] .(5)[1:swapper/0]loop: module loaded
<6>[    0.848125] .(5)[1:swapper/0]zram: Added device: zram0
<4>[    0.848141] .(5)[1:swapper/0][Power/gpufreq] @mt_gpufreq_init
<4>[    0.848965] .(5)[1:swapper/0][Power/gpufreq] @mt_gpufreq_pdrv_probe: I am 6763 (10)
<3>[    0.849073] .(5)[1:swapper/0][Power/spower] 8/66/33/26/18/9/12/
<4>[    0.849085] .(5)[1:swapper/0][Power/gpufreq] setup gpufreqs table
<4>[    0.849090] .(5)[1:swapper/0][Power/gpufreq] @mt_setup_gpufreqs_table: g_cur_gpu_freq = 950000, g_cur_gpu_volt = 90000
<4>[    0.849095] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_khz = 700000
<4>[    0.849099] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_volt = 80000
<4>[    0.849101] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_power = 575
<4>[    0.849104] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_khz = 530000
<4>[    0.849107] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_volt = 70000
<4>[    0.849110] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_power = 331
<2>[    0.849346] .(5)[1:swapper/0][PBM] feature_en: 1, pbm_drv_done: 0
<4>[    0.849351] .(5)[1:swapper/0][Power/gpufreq] GPU current frequency = 700000KHz
<4>[    0.849358] .(5)[1:swapper/0][Power/gpufreq] Current Vproc = 800mV
<4>[    0.849360] .(5)[1:swapper/0][Power/gpufreq] g_cur_gpu_freq = 700000, g_cur_gpu_volt = 80000
<4>[    0.849363] .(5)[1:swapper/0][Power/gpufreq] g_cur_gpu_idx = 0, g_cur_gpu_OPPidx = 0
<6>[    0.849454] .(5)[1:swapper/0][register_low_battery_notify] prio_val=2
<6>[    0.849458] .(5)[1:swapper/0][register_battery_percent_notify] prio_val=2
<6>[    0.849461] .(5)[1:swapper/0][register_battery_oc_notify] prio_val=2
<6>[    0.850835] .(5)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    0.850858] .(5)[1:swapper/0][register_dlpt_notify] prio_val=0
<2>[    0.850941] .(5)[1:swapper/0][PBM] pbm_module_init : Done
<4>[    0.850970] .(5)[1:swapper/0]Power_gs: pmic_manual_dump array malloc done
<4>[    0.850975] .(5)[1:swapper/0]Power_gs: golden setting base_remap table malloc done
<4>[    0.856893] -(5)[1:swapper/0]------------[ cut here ]------------
<4>[    0.856897] -(5)[1:swapper/0]WARNING: CPU: 5 PID: 1 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/events/core.c:3348 perf_event_read_local+0x180/0x190()
<4>[    0.856908] Modules linked in:-(5)[1:swapper/0]
<4>[    0.856920] -(5)[1:swapper/0]CPU: 5 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #2
<4>[    0.856925] -(5)[1:swapper/0]Hardware name: MT6763V/B (DT)
<4>[    0.856929] -(5)[1:swapper/0]Call trace:
<4>[    0.856931] -(5)[1:swapper/0][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    0.856940] -(5)[1:swapper/0][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    0.856945] -(5)[1:swapper/0][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    0.856952] -(5)[1:swapper/0][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    0.856960] -(5)[1:swapper/0][<ffffff80080a1d10>] warn_slowpath_null+0x18/0x20
<4>[    0.856965] -(5)[1:swapper/0][<ffffff8008187fb8>] perf_event_read_local+0x180/0x190
<4>[    0.856969] -(5)[1:swapper/0][<ffffff8008426884>] ppm_cpi_pmu_enable_locked+0x7c/0x140
<4>[    0.856976] -(5)[1:swapper/0][<ffffff8008426a14>] ppm_cpi_pmu_probe_cpu+0xcc/0x260
<4>[    0.856981] -(5)[1:swapper/0][<ffffff8008426f80>] ppm_cpi_pmu_probe+0x50/0xa0
<4>[    0.856986] -(5)[1:swapper/0][<ffffff80090f7140>] ppm_cpi_init+0x9c/0x108
<4>[    0.856990] -(5)[1:swapper/0][<ffffff8008081d48>] do_one_initcall+0xd8/0x208
<4>[    0.856994] -(5)[1:swapper/0][<ffffff80090c9bcc>] kernel_init_freeable+0x188/0x234
<4>[    0.857001] -(5)[1:swapper/0][<ffffff8008c21a68>] kernel_init+0x10/0x108
<4>[    0.857007] -(5)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.857012] -(5)[1:swapper/0]---[ end trace 911ba04329a1ff38 ]---
<6>[    0.861441] .(5)[1:swapper/0][cpu_ntf] <00>ffffff8008426c80 (ppm_cpi_notifier)
<5>[    0.861453] .(5)[1:swapper/0][Power/PPM] @ppm_cpi_init: CPI done! enable = 1
<5>[    0.861470] .(5)[1:swapper/0][Power/PPM] @ppm_dlpt_policy_init: register PPM_POLICY_DLPT done!
<5>[    0.861485] .(5)[1:swapper/0][Power/PPM] @ppm_sysboost_policy_init: register PPM_POLICY_SYS_BOOST done!
<5>[    0.861494] .(5)[1:swapper/0][Power/PPM] @ppm_ptpod_policy_init: register PPM_POLICY_PTPOD done!
<6>[    0.861501] .(5)[1:swapper/0][register_battery_percent_notify] prio_val=1
<6>[    0.861504] .(5)[1:swapper/0][register_battery_oc_notify] prio_val=1
<6>[    0.861507] .(5)[1:swapper/0][register_low_battery_notify] prio_val=1
<5>[    0.861510] .(5)[1:swapper/0][Power/PPM] @ppm_pwrthro_policy_init: register PPM_POLICY_PWR_THRO done!
<5>[    0.861525] .(5)[1:swapper/0][Power/PPM] @ppm_thermal_policy_init: register PPM_POLICY_THERMAL done!
<5>[    0.861542] .(5)[1:swapper/0][Power/PPM] @ppm_userlimit_policy_init: register PPM_POLICY_USER_LIMIT done!
<5>[    0.861552] .(5)[1:swapper/0][Power/PPM] @ppm_forcelimit_policy_init: register PPM_POLICY_FORCE_LIMIT done!
<5>[    0.861563] .(5)[1:swapper/0][Power/PPM] @ppm_ut_policy_init: register PPM_POLICY_UT done!
<1>[    0.861654] .(5)[1:swapper/0]MT_SCHED: Init complete, device major number = 246
<6>[    0.861667] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800844b660 (sched_cpu_notify)
<6>[    0.862660] .(5)[1:swapper/0]11002000.apuart0: ttyMT0 at MMIO 0x0 (irq = 6, base_baud = 1625000) is a MTK UART
<6>[    0.862847] .(5)[1:swapper/0]11003000.apuart1: ttyMT1 at MMIO 0x0 (irq = 9, base_baud = 1625000) is a MTK UART
<4>[    0.864949] .(5)[1:swapper/0]pn548_dev_init
<4>[    0.865419] .(5)[1:swapper/0]pn548_platform_probe: &pdev=ffffffc05f79b000
<4>[    0.865423] .(5)[1:swapper/0]pn548_platform_pinctrl_init
<4>[    0.865540] .(5)[1:swapper/0]pn548_platform_pinctrl_select
<4>[    0.866146] .(5)[1:swapper/0][bert] i2c_add_driver  ret = 0 
<4>[    0.866149] .(5)[1:swapper/0]pn548_dev_init success
<4>[    0.866959] .(5)[1:swapper/0][MT AUXADC_probe3] get device tree info : start !!
<4>[    0.867039] .(5)[1:swapper/0][AUXADC_AP] find node TEMPERATURE:0
<4>[    0.867042] .(5)[1:swapper/0][AUXADC_AP] find node TEMPERATURE1:1
<4>[    0.867046] .(5)[1:swapper/0][AUXADC_AP] find node ADC_FDD_RF_PARAMS_DYNAMIC_CUSTOM_CH:2
<4>[    0.867053] .(5)[1:swapper/0][AUXADC_AP] find node BOARD_ID:3
<4>[    0.867056] .(5)[1:swapper/0][AUXADC_AP] find node BOARD_ID_2:4
<4>[    0.867058] .(5)[1:swapper/0][MT AUXADC_AP] adc_channel_info_init : done !!
<3>[    0.867091] .(5)[1:swapper/0]proc_create auxadc_debug_proc_fops
<3>[    0.868349] .(5)[1:swapper/0][PWM] get PWM1-main clock, ffffffc05da13b00
<3>[    0.868361] .(5)[1:swapper/0][PWM] get PWM2-main clock, ffffffc05da13c00
<3>[    0.868372] .(5)[1:swapper/0][PWM] get PWM3-main clock, ffffffc05da13d00
<3>[    0.868383] .(5)[1:swapper/0][PWM] get PWM4-main clock, ffffffc05da13e00
<3>[    0.868397] .(5)[1:swapper/0][PWM] get PWM-HCLK-main clock, ffffffc05da13f00
<3>[    0.868411] .(5)[1:swapper/0][PWM] get PWM-main clock, ffffffc05da39680
<4>[    0.869123] stk3x1x_init Instk3x1x_init Out.(5)[1:swapper/0][Gsensor] bma2xx_init
<3>[    0.875134] .(5)[1:swapper/0][PMIC] [pmic_register_interrupt_callback] register callback conflict intNo=154
<4>[    0.875185] .(5)[1:swapper/0][Accdet]accdet_mod_init begin!
<6>[    0.875972] .(5)[1:swapper/0][mt_accdet_probe]probe start..
<6>[    0.876173] .(5)[1:swapper/0]input: ACCDET as /devices/virtual/input/input0
<6>[    0.876501] .(5)[1:swapper/0][mt_accdet_probe]CONFIG_ACCDET_SUPPORT_EINT1 opened!
<6>[    0.876505] [accdet_get_dts_data]Start..<6>[    0.877566] .(5)[1:swapper/0][accdet_get_dts_data]mid-Key = 80, up_key = 220, down_key = 400
<6>[    0.877572] .(5)[1:swapper/0][accdet_get_dts_data]pwm_width=0x500, pwm_thresh=0x500, mic_mode=2, mic_vol=6
<6>[    0.877575] .(5)[1:swapper/0][accdet_get_dts_data] deb0=0x800,deb1=0x800,deb3=0x20,deb4=0x44
<6>[    0.877581] .(5)[1:swapper/0][mt_accdet_probe]probe done!
<4>[    0.879005] .(5)[1:swapper/0][Accdet]platform_driver_register done!
<4>[    0.879009] .(5)[1:swapper/0][Accdet]accdet_mod_init done!
<6>[    0.879023] .(5)[1:swapper/0]usb_function_register name=via_gps
<6>[    0.879031] .(5)[1:swapper/0]usb_function_register name=via_pcv
<6>[    0.879037] .(5)[1:swapper/0]usb_function_register name=via_atc
<6>[    0.879043] .(5)[1:swapper/0]usb_function_register name=via_ets
<6>[    0.879050] .(5)[1:swapper/0]usb_function_register name=via_modem
<5>[    0.879056] .(5)[1:swapper/0]C2K_USB_NOTE,<init 701>, rawbulk functions init.
<5>[    0.879071] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.879141] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.879194] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.879244] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.879293] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.879344] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.879393] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.879443] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.879497] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_init 1249>, rawbulk_init
<5>[    0.883764] mtk_rtc_common: rtc_init<5>[    0.885965] .(5)[1:swapper/0]mtk_rtc_common: read al time = 2020/01/10 08:55:04 (0)
<6>[    0.887641] .(5)[1:swapper/0]mt-rtc mt-rtc: rtc core: registered mt-rtc as rtc0
<4>[    0.887689] [fg_27542_init] init start with i2c DTS.(5)[1:swapper/0][fg_27542_init] Success to register fg_27542 i2c driver.
<4>[    0.888076] .(5)[1:swapper/0]******** fg_27542_user_space_probe!! ********
<4>[    0.888159] .(5)[1:swapper/0]
<4>[    0.888159]  manufactureA_init,  Major: 243 Minor: 0
<4>[    0.888216] .(5)[1:swapper/0]
<4>[    0.888216]  manufactureB_init,  Major: 242 Minor: 0
<4>[    0.888225] [wlc_51025_init] init start with i2c DTS.(5)[1:swapper/0][wlc_51025_init] Success to register wlc_51025 i2c driver.
<4>[    0.888571] .(5)[1:swapper/0]******** wlc_51025_user_space_probe!! ********
<4>[    0.888951] .(5)[1:swapper/0]******** mcp_6442_user_space_probe!! ********
<4>[    0.888984] .(5)[1:swapper/0]****[pcb_version_init] begin to register driver
<4>[    0.889285] .(5)[1:swapper/0]******** pcb_version_user_space_probe!! ********
<3>[    0.889331] .(5)[1:swapper/0][MT6311] Kernel driver not support for SSPM
<5>[    0.889334] .(5)[1:swapper/0][MT6311] MT6311 not exist!, user space driver not probe
<3>[    0.889602] .(5)[1:swapper/0]mt6356_gauge_probe: starts
<3>[    0.889606] .(5)[1:swapper/0]mt6356_parse_dt: starts
<6>[    0.890372] .(5)[1:swapper/0]mtk_auxadc_intf_probe
<6>[    0.894103] .(5)[1:swapper/0]musb-hdrc: version 6.0, ?dma?, otg (peripheral+host)
<6>[    0.894688] .(5)[1:swapper/0]musb_probe mac=0xffffff800a3e0000, phy=0xffffff800b120000, irq=94
<5>[    0.894833] -(5)[1:swapper/0][MUSB]usb_6763_dpidle_request 120: USB_DPIDLE_FORBIDDEN, skip_cnt<0>
<5>[    0.894886] -(5)[1:swapper/0][MUSB]usb_6763_dpidle_request 113: USB_DPIDLE_ALLOWED, skip_cnt<0>
<4>[    0.895073] .(5)[1:swapper/0]usb_phy_generic.0.auto supply vcc not found, using dummy regulator
<5>[    0.895291] .(5)[1:swapper/0][MUSB]mt_usb_otg_init 784: host controlled by TYPEC
<5>[    0.895493] .(2)[69:kworker/u16:2][MUSB]do_register_otg_work 59: get type_c_port0 fail
<5>[    0.895528] .(5)[1:swapper/0][MUSB]mt_usb_enable 300: begin <0,0>,<1,0,0,0>
<5>[    0.906478] .(5)[1:swapper/0][MUSB]set_usb_phy_mode 425: force PHY to mode 1, 0x6c=3f2f
<5>[    0.906502] .(5)[1:swapper/0][MUSB]usb_phy_recover 685: apply efuse setting, RG_USB20_INTR_CAL=0x15
<5>[    0.907102] .(5)[1:swapper/0][MUSB]usb_phy_recover 695: usb recovery success
<5>[    0.907107] .(5)[1:swapper/0][MUSB]mt_usb_enable 324: end, <1,0,1,0>
<6>[    0.907579] .(5)[1:swapper/0]musb-hdrc musb-hdrc: MUSB HDRC host driver
<6>[    0.907600] .(5)[1:swapper/0]musb-hdrc musb-hdrc: new USB bus registered, assigned bus number 1
<6>[    0.907616] .(5)[1:swapper/0]usb usb1: usb_set_device_state 1->6
<6>[    0.907625] .(5)[1:swapper/0]usb usb1: usb_get_descriptor type=1 sz=18
<6>[    0.907669] .(5)[1:swapper/0]usb usb1: usb_get_descriptor type=2 sz=9
<6>[    0.907691] .(5)[1:swapper/0]usb usb1: usb_get_descriptor type=2 sz=25
<6>[    0.908013] .(5)[1:swapper/0]usb usb1: usb_set_device_state 6->7
<6>[    0.908084] .(5)[1:swapper/0]hub 1-0:1.0: USB hub found
<6>[    0.908110] .(5)[1:swapper/0]hub 1-0:1.0: 1 port detected
<5>[    0.908213] -(5)[1:swapper/0][MUSB]musb_hub_control 370: try to call musb_start in virthub
<5>[    0.908344] .(5)[1:swapper/0][MUSB]mt_usb_try_idle 285: b_idle inactive, for idle timer for 4 ms
<5>[    0.908350] .(5)[1:swapper/0][MUSB]musb_gadget_setup 2405: musb controller dma ops is non-null
<5>[    0.908462] .(5)[1:swapper/0][MUSB]mt_usb_disable 333: begin, <1,1>,<1,1,1,0>
<5>[    0.909294] .(5)[1:swapper/0][MUSB]set_usb_phy_mode 425: force PHY to mode 0, 0x6c=3f11
<5>[    0.909314] .(5)[1:swapper/0][MUSB]usb_phy_savecurrent 591: usb save current success
<5>[    0.909318] .(5)[1:swapper/0][MUSB]mt_usb_disable 339: end, <1,1,1,1>
<3>[    0.909404] .(5)[1:swapper/0]BOOTPROF:       909.403847:initcall: musb_init    15.289539ms
<3>[    0.910067] .(5)[1:swapper/0]can't find compatible node
<4>[    0.911067] .(5)[1:swapper/0][BOOT_COMMON] [create_sysfs] No atag,meta found !
<4>[    0.911192] .(5)[1:swapper/0]disp driver(1) disp_probe_1 begin
<5>[    0.912688] -(5)[1:swapper/0][MUSB]musb_do_idle 251: otg_state b_idle to b_idle, is_active<0>
<4>[    0.914167] .(5)[1:swapper/0]disp driver(1) disp_probe_1 end
<4>[    0.914758] .(5)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.915263] .(5)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<5>[    0.917993] .(5)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x4a, count: 92, Name: DELAY_THREAD
<5>[    0.918000] .(5)[1:swapper/0][CMDQ]overwrite delay function with cpr_offset = 74
<5>[    0.918004] .(5)[1:swapper/0][CMDQ]======REC 0xffffff800b3fa000 command buffer:
<3>[    0.918019] .(5)[1:swapper/0]ffffff800b3fa000: 80008001 200001e5 fffdb7ff 02000000
<3>[    0.918025] .(5)[1:swapper/0]ffffff800b3fa010: 102380d0 a0800000 00024800 91800000
<3>[    0.918030] .(5)[1:swapper/0]ffffff800b3fa020: ffffffff a0800002 ffffffff a080801c
<3>[    0.918035] .(5)[1:swapper/0]ffffff800b3fa030: 80410000 b1430050 00388040 a0e20001
<3>[    0.918041] .(5)[1:swapper/0]ffffff800b3fa040: 00018041 b1650028 80010000 200001e6
<3>[    0.918046] .(5)[1:swapper/0]ffffff800b3fa050: 00000000 a0808041 801c0000 a0c18042
<3>[    0.918055] .(5)[1:swapper/0]ffffff800b3fa060: 00010001 b1000020 80410001 a0e20000
<3>[    0.918060] .(5)[1:swapper/0]ffffff800b3fa070: 00000002 b1620010 00000000 a0c10002
<3>[    0.918064] .(5)[1:swapper/0]ffffff800b3fa080: 80440000 b1430050 00388043 a0e20001
<3>[    0.918069] .(5)[1:swapper/0]ffffff800b3fa090: 00018044 b1650028 80010000 200001e7
<3>[    0.918074] .(5)[1:swapper/0]ffffff800b3fa0a0: 00000000 a0808044 801c0000 a0c18045
<3>[    0.918079] .(5)[1:swapper/0]ffffff800b3fa0b0: 00010001 b1000020 80440001 a0e20000
<3>[    0.918084] .(5)[1:swapper/0]ffffff800b3fa0c0: 00000002 b1620010 00000000 a0c10002
<3>[    0.918089] .(5)[1:swapper/0]ffffff800b3fa0d0: 80470000 b1430050 00388046 a0e20001
<3>[    0.918093] .(5)[1:swapper/0]ffffff800b3fa0e0: 00018047 b1650028 80010000 200001e8
<3>[    0.918098] .(5)[1:swapper/0]ffffff800b3fa0f0: 00000000 a0808047 801c0000 a0c18048
<3>[    0.918103] .(5)[1:swapper/0]ffffff800b3fa100: 00010001 b1000020 80470001 a0e20000
<3>[    0.918108] .(5)[1:swapper/0]ffffff800b3fa110: 00000002 b1620010 00000000 a0c10002
<3>[    0.918113] .(5)[1:swapper/0]ffffff800b3fa120: 0002801c b1610030 fffdb7ff 02000000
<3>[    0.918117] .(5)[1:swapper/0]ffffff800b3fa130: 102380d0 a0800000 00000000 91800000
<3>[    0.918122] .(5)[1:swapper/0]ffffff800b3fa140: 200001e5 a080804b 00010001 b1000010
<3>[    0.918127] .(5)[1:swapper/0]ffffff800b3fa150: 200003cd a080804b 804b0000 a0c10003
<3>[    0.918132] .(5)[1:swapper/0]ffffff800b3fa160: 00000000 40000000 fffffe98 10000000
<5>[    0.918134] .(5)[1:swapper/0][CMDQ]======REC 0xffffff800b3fa000 command buffer END
<5>[    0.918137] .(5)[1:swapper/0][CMDQ]REC 0xffffff800b3fa000 command buffer TRANSLATED:
<5>[    0.918152] .(5)[1:swapper/0][CMDQ]Wait And Clear Event: CMDQ_SYNC_TOKEN_TIMER
<5>[    0.918155] .(5)[1:swapper/0][CMDQ]Set MASK: 0xfffdb7ff
<5>[    0.918160] .(5)[1:swapper/0][CMDQ]LOGIC: Reg0 = 0x102380d0
<5>[    0.918165] .(5)[1:swapper/0][CMDQ]WRITE_S with mask: 0x00024800, Reg0, use_mask=1
<5>[    0.918169] .(5)[1:swapper/0][CMDQ]LOGIC: Reg2 = 0xffffffff
<5>[    0.918173] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32796 = 0xffffffff
<5>[    0.918178] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg32833 <= 0) jump +80
<5>[    0.918183] .(5)[1:swapper/0][CMDQ]LOGIC: Reg1 = Reg56 - Reg32832
<5>[    0.918187] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg1 < Reg32833) jump +40
<5>[    0.918197] .(5)[1:swapper/0][CMDQ]Set Event: CMDQ_SYNC_TOKEN_DELAY_SET0
<5>[    0.918201] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32833 = 0x00000000
<5>[    0.918206] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32834 = Reg32796 + 0
<5>[    0.918210] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +32
<5>[    0.918214] .(5)[1:swapper/0][CMDQ]LOGIC: Reg0 = Reg32833 - Reg1
<5>[    0.918219] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg0 >= Reg2) jump +16
<5>[    0.918224] .(5)[1:swapper/0][CMDQ]LOGIC: Reg2 = Reg0 + 0
<5>[    0.918228] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg32836 <= 0) jump +80
<5>[    0.918232] .(5)[1:swapper/0][CMDQ]LOGIC: Reg1 = Reg56 - Reg32835
<5>[    0.918236] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg1 < Reg32836) jump +40
<5>[    0.918245] .(5)[1:swapper/0][CMDQ]Set Event: CMDQ_SYNC_TOKEN_DELAY_SET1
<5>[    0.918249] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32836 = 0x00000000
<5>[    0.918253] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32837 = Reg32796 + 0
<5>[    0.918257] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +32
<5>[    0.918261] .(5)[1:swapper/0][CMDQ]LOGIC: Reg0 = Reg32836 - Reg1
<5>[    0.918266] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg0 >= Reg2) jump +16
<5>[    0.918271] .(5)[1:swapper/0][CMDQ]LOGIC: Reg2 = Reg0 + 0
<5>[    0.918275] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg32839 <= 0) jump +80
<5>[    0.918280] .(5)[1:swapper/0][CMDQ]LOGIC: Reg1 = Reg56 - Reg32838
<5>[    0.918284] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg1 < Reg32839) jump +40
<5>[    0.918291] .(5)[1:swapper/0][CMDQ]Set Event: CMDQ_SYNC_TOKEN_DELAY_SET2
<5>[    0.918294] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32839 = 0x00000000
<5>[    0.918298] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32840 = Reg32796 + 0
<5>[    0.918302] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +32
<5>[    0.918307] .(5)[1:swapper/0][CMDQ]LOGIC: Reg0 = Reg32839 - Reg1
<5>[    0.918311] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg0 >= Reg2) jump +16
<5>[    0.918315] .(5)[1:swapper/0][CMDQ]LOGIC: Reg2 = Reg0 + 0
<5>[    0.918319] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (Reg2 != Reg32796) jump +48
<5>[    0.918322] .(5)[1:swapper/0][CMDQ]Set MASK: 0xfffdb7ff
<5>[    0.918325] .(5)[1:swapper/0][CMDQ]LOGIC: Reg0 = 0x102380d0
<5>[    0.918329] .(5)[1:swapper/0][CMDQ]WRITE_S with mask: 0x00000000, Reg0, use_mask=1
<5>[    0.918333] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32843 = 0x200001e5
<5>[    0.918338] .(5)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +16
<5>[    0.918341] .(5)[1:swapper/0][CMDQ]LOGIC: Reg32843 = 0x200003cd
<5>[    0.918346] .(5)[1:swapper/0][CMDQ]LOGIC: Reg3 = Reg32843 + 0
<5>[    0.918351] .(5)[1:swapper/0][CMDQ]MARKER: sync_no_suspnd=0no_suspnd=0, no_inc=0, m=0, m_en=0, prefetch=0, irq=0
<5>[    0.918355] .(5)[1:swapper/0][CMDQ]JUMP(relative): -360
<5>[    0.918359] .(5)[1:swapper/0][CMDQ]======REC 0xffffff800b3fa000 command END
<5>[    0.918378] .(5)[1:swapper/0][CMDQ][DelayThread]sram task size:368 free:1880
<5>[    0.918386] .(5)[1:swapper/0][CMDQ][DelayThread]create delay thread task in SRAM task size:368 sram size:1880
<4>[    0.919303] .(4)[170:init_decouple_b]init_decouple_buffers done
<3>[    0.920285] .(5)[1:swapper/0][GAMMA] disp_gamma_write_lut_reg: gamma table [0] not initialized
<3>[    0.920285] 
<5>[    1.004698] -(4)[6:kworker/u16:0][MUSB]musb_hub_control 352: port status 00000100
<6>[    1.004827] .(5)[85:kworker/5:1]usb usb1: usb_set_device_state 7->8
<4>[    1.074484] .(1)[1:swapper/0][TKCORE] 81679]: <0>MSG TKCore:start_devapc:210: DEVAPC already inited in ATF
<4>[    1.074484] [    5.282599]: <0>INF TKCore:init_teecore:109: teecore inits done
<4>[    1.074484] [    5.285938]: <0>INF TKCore:parse_cert:531: projectid: 1749
<4>[    1.074484] [    5.286722]: <0>MSG TKCore:htfat_early_init:1004: Veri
<3>[    1.074699] .(1)[1:swapper/0][ION]ion_drv_create_heap: create heap: ion_fb_heap
<3>[    1.074741] .(1)[1:swapper/0]BOOTPROF:      1074.740617:probe: probe=platform_drv_probe drv=mtkfb(ffffff800967b6d8)   160.202308ms
<3>[    1.075836] .(0)[1:swapper/0]BOOTPROF:      1075.836386:initcall: mtkfb_init   161.648231ms
<6>[    1.076826] .(1)[1:swapper/0][DFRC] start to initialize fps policy
<6>[    1.076830] .(1)[1:swapper/0][DFRC] register fps policy device
<6>[    1.076944] .(1)[1:swapper/0][DFRC] register fps policy driver
<6>[    1.077512] .(1)[1:swapper/0][DFRC] dfrc_init_kernel_policy
<6>[    1.077521] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[3]
<6>[    1.077529] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[2]
<6>[    1.077535] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[4]
<6>[    1.077542] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[5]
<1>[    1.081561] .(1)[1:swapper/0][MALI] Alloc mtk_config
<6>[    1.082135] .(1)[1:swapper/0]mali 13040000.mali: Continuing without Mali regulator control
<6>[    1.082147] .(1)[1:swapper/0]mali 13040000.mali: Continuing without Mali clock control
<6>[    1.082688] .(1)[1:swapper/0]mali 13040000.mali: GPU identified as 0x0 arch 6.0.10 r0p0 status 2
<6>[    1.084431] .(0)[1:swapper/0]mali 13040000.mali: Probed as mali0
<6>[    1.087902] [ISP][ISP_Init] - E.<6>[    1.089357] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.089378] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=1, devnode(imgsys), map_addr=0xffffff800bea6000
<6>[    1.089387] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=1, devnode(imgsys), irq=0
<6>[    1.089392] .(0)[1:swapper/0][ISP][ISP_RegCharDev] - E.
<6>[    1.089400] .(0)[1:swapper/0][ISP][ISP_RegCharDev] - X.
<6>[    1.090232] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.090275] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.090288] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=2, devnode(dip1), map_addr=0xffffff800bea8000
<6>[    1.090310] .(0)[1:swapper/0][ISP][ISP_probe] No corresponding ISR!!: nr_isp_devs=2, devnode(dip1), irq=129
<6>[    1.090315] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.090411] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.090462] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=3, devnode(camsys), map_addr=0xffffff800beac000
<6>[    1.090469] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=3, devnode(camsys), irq=0
<6>[    1.090473] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.090511] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.090521] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=4, devnode(cam1), map_addr=0xffffff800beae000
<6>[    1.090536] .(0)[1:swapper/0][ISP][ISP_probe] No corresponding ISR!!: nr_isp_devs=4, devnode(cam1), irq=132
<6>[    1.090541] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.090571] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.090582] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=5, devnode(cam2), map_addr=0xffffff800beb0000
<6>[    1.090633] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=5, devnode(cam2), irq=133, ISR: cam2
<6>[    1.090638] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.090675] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.090687] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=6, devnode(cam3), map_addr=0xffffff800beb2000
<6>[    1.090727] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=6, devnode(cam3), irq=134, ISR: cam3
<6>[    1.090732] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.090789] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.090800] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=7, devnode(camsv1), map_addr=0xffffff800beb4000
<6>[    1.090837] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=7, devnode(camsv1), irq=137, ISR: camsv1
<6>[    1.090842] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.090874] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.090884] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=8, devnode(camsv2), map_addr=0xffffff800beb6000
<6>[    1.090922] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=8, devnode(camsv2), irq=138, ISR: camsv2
<6>[    1.090927] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.090959] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.090969] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=9, devnode(camsv3), map_addr=0xffffff800beb8000
<6>[    1.091009] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=9, devnode(camsv3), irq=139, ISR: camsv3
<6>[    1.091015] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.091046] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.091057] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=10, devnode(camsv4), map_addr=0xffffff800beba000
<6>[    1.091095] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=10, devnode(camsv4), irq=140, ISR: camsv4
<6>[    1.091100] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.091131] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.091148] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=11, devnode(camsv5), map_addr=0xffffff800bebc000
<6>[    1.091154] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=11, devnode(camsv5), irq=0
<6>[    1.091159] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.091190] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.091200] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=12, devnode(camsv6), map_addr=0xffffff800bebe000
<6>[    1.091206] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=12, devnode(camsv6), irq=0
<6>[    1.091211] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.092773] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb0
<6>[    1.093054] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB0_BASE: ffffff800bec0000
<6>[    1.093060] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb1
<6>[    1.093266] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB1_BASE: ffffff800bec2000
<6>[    1.093272] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb2
<6>[    1.093467] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB2_BASE: ffffff800bec4000
<6>[    1.093472] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb3
<6>[    1.093654] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB3_BASE: ffffff800bec6000
<6>[    1.093660] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb4
<3>[    1.094127] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb4 node failed!!!
<6>[    1.094132] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb5
<3>[    1.094475] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb5 node failed!!!
<6>[    1.094480] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb6
<3>[    1.094804] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb6 node failed!!!
<6>[    1.094808] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb7
<3>[    1.095129] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb7 node failed!!!
<6>[    1.095330] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF0_BASE: ffffff800bec8000
<6>[    1.095529] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF1_BASE: ffffff800beca000
<6>[    1.095729] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF2_BASE: ffffff800becc000
<6>[    1.095929] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF3_BASE: ffffff800bece000
<6>[    1.096016] .(0)[1:swapper/0][ISP][ISP_Init] CLOCK_CELL_BASE: ffffff800bed0000
<6>[    1.096170] .(0)[1:swapper/0][ISP][ISP_Init] ISP_MMSYS_CONFIG_BASE: ffffff800bed2000
<6>[    1.096349] [ISP][ISP_Init] register isp callback for MDP[ISP][ISP_Init] register isp callback for GCE[ISP][ISP_Init] init m_LastMNum[ISP][ISP_Init] - X. Ret: 0.<6>[    1.098302] .(0)[1:swapper/0]FDVT [FDVT_probe] FDVT PROBE!!!
<6>[    1.098320] .(0)[1:swapper/0]FDVT [FDVT_probe] DT, i=0, map_addr=0xffffff800bed6000
<6>[    1.098381] .(0)[1:swapper/0]FDVT [FDVT_probe] DT, i=0, map_irq=130
<4>[    1.101259] .(0)[1:swapper/0]kd_camera_hw supply vcamd_sub not found, using dummy regulator
<4>[    1.101446] .(0)[1:swapper/0]kd_camera_hw supply vcamd_main2 not found, using dummy regulator
<4>[    1.101562] .(0)[1:swapper/0]kd_camera_hw supply vcama_sub2 not found, using dummy regulator
<4>[    1.101613] .(0)[1:swapper/0]kd_camera_hw supply vcamd_sub2 not found, using dummy regulator
<4>[    1.101662] .(0)[1:swapper/0]kd_camera_hw supply vcamio_sub2 not found, using dummy regulator
<3>[    1.102383] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcama_1
<3>[    1.102389] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcama_0
<3>[    1.102394] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamd_1
<3>[    1.102398] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamd_0
<3>[    1.102403] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamio_1
<3>[    1.102407] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamio_0
<3>[    1.102412] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamaf_1
<3>[    1.102416] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamaf_0
<3>[    1.102427] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_main2_vcamd_1
<3>[    1.102431] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_main2_vcamd_0
<3>[    1.102436] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_pnd1
<3>[    1.102440] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_pnd0
<3>[    1.102444] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_rst1
<3>[    1.102449] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_rst0
<3>[    1.102453] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_sub2_vcamd_1
<3>[    1.102457] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_sub2_vcamd_0
<3>[    1.102462] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_en_1
<3>[    1.102466] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_en_0
<3>[    1.102470] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_sel_1
<3>[    1.102475] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_sel_0
<3>[    1.102498] .(0)[1:swapper/0]mclk_init : pinctrl err, cam0_mclk_on
<3>[    1.102511] .(0)[1:swapper/0]mclk_init : pinctrl err, cam1_mclk_on
<3>[    1.102519] .(0)[1:swapper/0]mclk_init : pinctrl err, (null)
<3>[    1.102523] .(0)[1:swapper/0]mclk_init : pinctrl err, (null)
<6>[    1.106584] .(0)[1:swapper/0][register_low_battery_notify] prio_val=5
<6>[    1.106591] .(0)[1:swapper/0][register_battery_percent_notify] prio_val=5
<6>[    1.106595] .(0)[1:swapper/0][register_battery_oc_notify] prio_val=5
<6>[    1.107903] .(1)[1:swapper/0][ccu][ccu_probe] ccu probe cuccess...
<5>[    1.109027] .(1)[1:swapper/0][ccci1/mcd]gpio pinctrl is not ready yet, use workaround.
<6>[    1.120116] .(1)[1:swapper/0][ccci0/rpc]get_md_dtsi_val 1, mediatek,md_drdi_rf_set_idx -- 0xf0f0f0f
<5>[    1.120269] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.120317] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.120365] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.120412] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.120460] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.120507] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.120555] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.120602] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.120673] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<3>[    1.121396] .(1)[1:swapper/0][CONN-MD-DFT][W]conn_md_add_user:uid (0x00000005) is added to user list successfully
<5>[    1.122414] .(1)[1:swapper/0][ccci1/sys]swtp_init can't find compatible node
<3>[    1.124456] .(1)[1:swapper/0]BOOTPROF:      1124.455617:initcall: modem_cd_init    15.903538ms
<5>[    1.128817] .(0)[1:swapper/0][Thermal/TZ/BTS] mtkts_bts_prepare_table table_num=7
<5>[    1.128838] .(0)[1:swapper/0][Thermal/TZ/BTSMDPA] mtkts_btsmdpa_prepare_table table_num=7
<4>[    1.128865] .(0)[1:swapper/0][Thermal/TZ/CPU]tscpu_init
<4>[    1.129282] .(0)[1:swapper/0][Thermal/TZ/CPU]thermal_prob
<3>[    1.129855] .(0)[1:swapper/0][calibration] temp0=0xa5dea18a, temp1=0x31b855b, temp2=0xbfe1f000
<3>[    1.129863] .(0)[1:swapper/0][lvts_cal] 0: 0x0, 1: 0x0, 2: 0x0
<4>[    1.129868] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_ge_t      = 663
<4>[    1.129872] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_oe_t      = 490
<4>[    1.129875] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_degc_cali     = 45
<4>[    1.129879] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_cali_en_t = 1
<4>[    1.129882] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_slope       = 0
<4>[    1.129885] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_slope_sign  = 0
<4>[    1.129889] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_id            = 0
<4>[    1.129892] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu1     = 397
<4>[    1.129895] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu2     = 389
<4>[    1.129899] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu3     = 394
<4>[    1.129902] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu4     = 383
<4>[    1.129906] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu5     = 384
<4>[    1.129909] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsabb      = 391
<4>[    1.129913] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_count1_b30c=  0
<4>[    1.129916] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_count2_b30c=  0
<4>[    1.129920] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_count3_b30c=  0
<4>[    1.129923] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_golden_temp1= 0
<4>[    1.129926] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_golden_temp2= 0
<4>[    1.129930] .(0)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_golden_temp3= 0
<4>[    1.129934] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_ge         = 368
<4>[    1.129937] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_gain       = 10368
<4>[    1.129941] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt0   = 8874
<4>[    1.129945] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt1   = 8856
<4>[    1.129948] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt2   = 8867
<4>[    1.129952] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt3   = 8841
<4>[    1.129956] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt4   = 8843
<4>[    1.129959] .(0)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt5   = 8860
<4>[    1.130232] -(0)[1:swapper/0][Thermal/TZ/CPU]Driver is NOT ready to report valid temperatures
<6>[    1.131674] .(0)[1:swapper/0][Thermal/TZ/PMIC] [mtktspmic_init]
<6>[    1.131680] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    1.131719] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts        = 1601
<6>[    1.131723] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_2      = 1581
<6>[    1.131726] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_3      = 1584
<6>[    1.131730] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_degc_cali    = 48
<6>[    1.131734] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_adc_cali_en  = 1
<6>[    1.131737] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope      = 0
<6>[    1.131741] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope_sign = 0
<6>[    1.131744] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_id		   = 0
<6>[    1.131748] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    1.131751] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x641
<6>[    1.131754] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x62d
<6>[    1.131758] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x630
<6>[    1.131761] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x30
<6>[    1.131765] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    1.131768] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    1.131772] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    1.131775] .(0)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    1.131779] .(0)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=442203, Vbe = -703000
<6>[    1.131785] .(0)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=396517, Vbe = -694000
<6>[    1.131790] .(0)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=397590, Vbe = -696000
<6>[    1.133925] .(0)[1:swapper/0][W]mtk_wcn_cmb_stub_query_ctrl:Thermal query not registered
<3>[    1.133977] .(0)[1:swapper/0][Thermal/TZ/IMGS][mtk_imgs_init]
<4>[    1.136769] .(1)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 3
<4>[    1.137176] .(1)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 1
<4>[    1.137421] .(1)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 2
<4>[    1.139592] .(1)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 0
<3>[    1.139761] .(1)[1:swapper/0][Cooler_NR]mtk_cooler_NR_init 208
<3>[    1.139842] .(1)[1:swapper/0][Cooler_NR]mtk_cooler_NR_init 226
<6>[    1.139932] .(1)[1:swapper/0][Thermal/TZ/PMIC] [mt6356tsbuck1_init]
<6>[    1.139937] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    1.139971] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts        = 1601
<6>[    1.139975] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_2      = 1581
<6>[    1.139979] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_3      = 1584
<6>[    1.139982] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_degc_cali    = 48
<6>[    1.139986] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_adc_cali_en  = 1
<6>[    1.139990] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope      = 0
<6>[    1.139993] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope_sign = 0
<6>[    1.139997] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_id		   = 0
<6>[    1.140000] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    1.140003] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x641
<6>[    1.140007] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x62d
<6>[    1.140010] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x630
<6>[    1.140014] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x30
<6>[    1.140017] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    1.140021] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    1.140024] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    1.140028] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    1.140031] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=442203, Vbe = -703000
<6>[    1.140037] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=396517, Vbe = -694000
<6>[    1.140042] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=397590, Vbe = -696000
<6>[    1.141912] .(1)[1:swapper/0][Thermal/TZ/PMIC] [mt6356tsbuck2_init]
<6>[    1.141916] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    1.141953] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts        = 1601
<6>[    1.141956] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_2      = 1581
<6>[    1.141960] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_3      = 1584
<6>[    1.141963] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_degc_cali    = 48
<6>[    1.141967] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_adc_cali_en  = 1
<6>[    1.141970] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope      = 0
<6>[    1.141973] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope_sign = 0
<6>[    1.141977] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_id		   = 0
<6>[    1.141980] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    1.141983] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x641
<6>[    1.141986] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x62d
<6>[    1.141990] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x630
<6>[    1.141993] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x30
<6>[    1.141996] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    1.141999] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    1.142003] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    1.142006] .(1)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    1.142009] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=442203, Vbe = -703000
<6>[    1.142014] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=396517, Vbe = -694000
<6>[    1.142019] .(1)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=397590, Vbe = -696000
<5>[    1.145131] .(3)[1:swapper/0]mrdump_key_init:MRDUMP_KEY node mediatek, mrdump_ext_rst-eint is not exist
<5>[    1.145131] MRDUMP_KEY is disabled
<6>[    1.145176] .(3)[1:swapper/0]mrdump_sysfs_init: done.
<5>[    1.145385] atf_log: inited<5>[    1.145655] .(3)[1:swapper/0]ATF reserved memory: 0xeff00000 - 0xeff3ffff (0x40000)
<5>[    1.145674] .(3)[1:swapper/0]atf_buf_phy_ctl: 0xeff00000
<5>[    1.145678] .(3)[1:swapper/0]atf_buf_len: 262144
<5>[    1.145682] .(3)[1:swapper/0]atf_buf_vir_ctl: ffffff800bf0e000
<5>[    1.145685] .(3)[1:swapper/0]atf_log_vir_addr: ffffff800bf20100
<5>[    1.145689] .(3)[1:swapper/0]atf_log_len: 81664
<5>[    1.145722] .(3)[1:swapper/0]atf irq num 21.
<5>[    1.145865] atf_time_sync: inited<6>[    1.147225] .(3)[1:swapper/0]SSPM platform service is ready
<4>[    1.148205] .(3)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<-1>, loops:100000, spent 0 sec, 963 usec
<4>[    1.149366] .(3)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<0>, loops:100000, spent 0 sec, 1153 usec
<4>[    1.150643] .(3)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<1>, loops:100000, spent 0 sec, 1131 usec
<4>[    1.151878] .(3)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<2>, loops:100000, spent 0 sec, 1131 usec
<4>[    1.151979] .(3)[1:swapper/0]USB_BOOST, <create_sys_fs(), 514> 
<4>[    1.152251] .(3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.152257] .(3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.152262] .(3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.152266] .(3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.152270] .(3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.152274] .(3)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.152308] .(3)[1:swapper/0]SLhall_mod_init begin!
<4>[    1.152476] .(3)[1:swapper/0]register slhall device
<4>[    1.152479] .(3)[1:swapper/0]platform_device_slhall_register done!
<4>[    1.153033] .(3)[1:swapper/0]SLhall_probe begin!
<6>[    1.153198] .(3)[1:swapper/0]input: scan-keys as /devices/virtual/input/input1
<4>[    1.153209] .(3)[1:swapper/0][hall]kpd_hall_dev register : success!!
<4>[    1.153266] .(3)[1:swapper/0]SLhall switch_dev_register OK! 
<4>[    1.153291] .(3)[1:swapper/0]SLhall_probe : SLhall_INIT
<4>[    1.153588] .(3)[1:swapper/0]SLhall_probe done!
<4>[    1.153616] .(3)[1:swapper/0]SLhall platform_driver_register done!
<4>[    1.153620] .(3)[1:swapper/0]SLhall_mod_init done!
<3>[    1.154092] .(3)[1:swapper/0]sys_timer 10017000.sys_timer: invalid resource
<6>[    1.154099] .(3)[1:swapper/0]unable to ioremap sysram base, might be disabled
<6>[    1.154103] .(3)[1:swapper/0]mult=161319385, shift=21, maxsec=5000
<6>[    1.154111] .(3)[1:swapper/0]enabled: 1, support_sysram: 0
<4>[    1.155174] .(3)[1:swapper/0]===aw9523 driver version v1.0.0
<4>[    1.155216] .(3)[1:swapper/0]aw9523_i2c_init end 
<4>[    1.155868] .(3)[1:swapper/0]stm32 Initialization : DONE !!
<6>[    1.156313] factory_data_probe+++factory_data_probe---wakeup_management_probe+++wakeup_management_probe---config_data_probe+++<6>[    1.157784] .(3)[1:swapper/0][E][Factory Data](jprkernel_config_read_from_storage): filp_open fail, error code: -2
<6>[    1.157790] .(3)[1:swapper/0][E][Factory Data](read_config_partition): Error
<6>[    1.157795] [E][Factory Data](jprkernel_config_fatal_error_handler): CONFIG DATA FATAL ERROR!<6>[    1.157797] .(3)[1:swapper/0][E][Factory Data](_get_config_item): read_config_partition Error
<6>[    1.157801] .(3)[1:swapper/0][E][Factory Data](_get_config_item): Error
<6>[    1.157805] .(3)[1:swapper/0][E][Factory Data](_config_get_value): [id=21,index=0] Item is NULL
<6>[    1.157809] .(3)[1:swapper/0]config_data_probe--- value=-128 
<3>[    1.157813] [config_data_probe]cmdline=console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6763 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=orange bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=0 bootprof.pl_t=4682 bootprof.lk_t=7367 bootprof.logo_t=1226 boot_reason=4 androidboot.serialno=S19F00013 androidboot.secureboot=49 androidboot.specialid=0 dlconfig_tof_offset=0 dlconfig_tof_x_talk=0 config_data_tof_offset_cali_flag=0 config_data_tof_xtalk_cali_flag=0 config_data_cp_index=0 config_data_charge_current=0 config_data_charge_termination_current=0 config_data_charge_voltage=0 config_data_recharge_threshold=0 config_data_precharge_current=0 config_data_pid_target_temperature=0 config_data_battery_profile_id=0 cmdline_power_on_flag=1 power_key_flag=0 power_on_thre<3>[    1.157844] .(3)[1:swapper/0]cmdline_tof_offset=0
<3>[    1.157867] .(3)[1:swapper/0]cmdline_tof_x_talk=0
<4>[    1.157999] .(3)[1:swapper/0]cmdline_tof_offset_flag = 0 ,cmdline_tof_x_talk_flag = 0
<4>[    1.158035] .(3)[1:swapper/0][func_nv_uint2int] ret=0
<4>[    1.158039] .(3)[1:swapper/0]g_audio_check_test.value = 0 
<4>[    1.158079] .(3)[1:swapper/0]g_smart_reset = 0 
<4>[    1.158115] .(3)[1:swapper/0]cmdline_offset_cali_auxiliary = 0 
<4>[    1.158151] .(3)[1:swapper/0]cmdline_xtalk_cali_auxiliary = 0 
<4>[    1.158188] .(3)[1:swapper/0]cmdline_pos_or_neg_num = 0 
<4>[    1.158225] .(3)[1:swapper/0]proinfo_stress_test_enable.value = 0 
<4>[    1.158229] hehai xxx get_cali_val_from_partition_after_reboot cmdline_offset_cali_auxiliary = 0 ,cmdline_xtalk_cali_auxiliary = 0factory_ext_data_probe+++factory_ext_data_probe---<6>[    1.159512] -(2)[0:swapper/2][DEVAPC] INFRA VIO_STA 0:0x0 1:0x0 2:0x80000000 3:0x0 4:0x0 5:0x0 6:0x0 7:0x0 8:0x0 9:0x4100
<6>[    1.159523] -(2)[0:swapper/2][DEVAPC] VIO_SHIFT_STA: 0x20
<6>[    1.159530] -(2)[0:swapper/2][DEVAPC] Syncing INFRA DBG0 & DBG1 (5, 0)
<6>[    1.159534] -(2)[0:swapper/2][DEVAPC] Syncing INFRA DBG0 & DBG1 (5, 1)
<6>[    1.159539] -(2)[0:swapper/2][DEVAPC] Sync INFRA DBG0 & DBG1 (5) SUCCESS
<6>[    1.159544] -(2)[0:swapper/2][DEVAPC] Violation(Infra,R ) - Process:swapper/2, PID:0, Vio Addr:0x1100a018 (High:0x0), Bus ID:0xe3, Dom ID:0x0
<6>[    1.159585] -(2)[0:swapper/2][DEVAPC] Access Violation Slave: PERISYS_SPI0 (infra index=95)
<6>[    1.159669] .(3)[1:swapper/0]mt-spi 1100a000.spi: master is unqueued, this is deprecated
<6>[    1.159930] .(3)[1:swapper/0]mt-spi 11010000.spi: master is unqueued, this is deprecated
<6>[    1.160177] .(3)[1:swapper/0]mt-spi 11012000.spi: master is unqueued, this is deprecated
<6>[    1.160422] .(3)[1:swapper/0]mt-spi 11013000.spi: master is unqueued, this is deprecated
<6>[    1.160717] .(3)[1:swapper/0]mt-spi 11018000.spi: master is unqueued, this is deprecated
<6>[    1.160965] .(3)[1:swapper/0]mt-spi 11019000.spi: master is unqueued, this is deprecated
<6>[    1.163710] .(3)[1:swapper/0]tun: Universal TUN/TAP device driver, 1.6
<6>[    1.163715] .(3)[1:swapper/0]tun: (C) 1999-2004 Max Krasnyansky <maxk@qualcomm.com>
<6>[    1.163795] .(3)[1:swapper/0]PPP generic driver version 2.4.2
<6>[    1.163897] .(3)[1:swapper/0]PPP BSD Compression module registered
<6>[    1.163907] .(3)[1:swapper/0]PPP Deflate Compression module registered
<6>[    1.163930] .(3)[1:swapper/0]PPP MPPE Compression module registered
<6>[    1.163945] .(3)[1:swapper/0]NET: Registered protocol family 24
<6>[    1.164052] .(3)[1:swapper/0]usbcore: registered new interface driver rtl8150
<6>[    1.164101] .(3)[1:swapper/0]usbcore: registered new interface driver r8152
<6>[    1.164145] .(3)[1:swapper/0]usbcore: registered new interface driver lan78xx
<6>[    1.164220] .(3)[1:swapper/0]usbcore: registered new interface driver usb-storage
<6>[    1.164259] .(3)[1:swapper/0]usbcore: registered new interface driver ums-alauda
<6>[    1.164298] .(3)[1:swapper/0]usbcore: registered new interface driver ums-cypress
<6>[    1.164336] .(3)[1:swapper/0]usbcore: registered new interface driver ums-datafab
<6>[    1.164374] .(3)[1:swapper/0]usbcore: registered new interface driver ums-freecom
<6>[    1.164415] .(3)[1:swapper/0]usbcore: registered new interface driver ums-isd200
<6>[    1.164454] .(3)[1:swapper/0]usbcore: registered new interface driver ums-jumpshot
<6>[    1.164492] .(3)[1:swapper/0]usbcore: registered new interface driver ums-karma
<6>[    1.164530] .(3)[1:swapper/0]usbcore: registered new interface driver ums-onetouch
<6>[    1.164569] .(3)[1:swapper/0]usbcore: registered new interface driver ums-sddr09
<6>[    1.164608] .(3)[1:swapper/0]usbcore: registered new interface driver ums-sddr55
<6>[    1.164670] .(3)[1:swapper/0]usbcore: registered new interface driver ums-usbat
<6>[    1.164717] .(3)[1:swapper/0]usbcore: registered new interface driver trancevibrator
<6>[    1.164784] .(3)[1:swapper/0]usb_function_register name=acm
<6>[    1.164811] .(3)[1:swapper/0]usb_function_register name=gser
<6>[    1.165054] .(3)[1:swapper/0]usb_function_register name=rndis
<6>[    1.165067] .(3)[1:swapper/0]usb_function_register name=mass_storage
<6>[    1.165077] .(3)[1:swapper/0]usb_function_register name=ffs
<6>[    1.165087] .(3)[1:swapper/0]usb_function_register name=midi
<6>[    1.165096] .(3)[1:swapper/0]usb_function_register name=hid
<6>[    1.165105] .(3)[1:swapper/0]usb_function_register name=mtp
<6>[    1.165115] .(3)[1:swapper/0]usb_function_register name=ptp
<6>[    1.165125] .(3)[1:swapper/0]usb_function_register name=audio_source
<6>[    1.165134] .(3)[1:swapper/0]usb_function_register name=accessory
<6>[    1.166070] .(3)[1:swapper/0]input: mtk-kpd as /devices/platform/10010000.kp/input/input2
<4>[    1.169713] .(3)[1:swapper/0][tpd_em_log] :register device successfully
<4>[    1.169724] .(3)[1:swapper/0]<<GTP-INF>>[tpd_driver_init:1088]  Goodix touch panel driver init.
<6>[    1.171390] .(3)[1:swapper/0]mtk-tpd: [tpd]use-tpd-button = 1
<6>[    1.171403] .(3)[1:swapper/0]mtk-tpd: [tpd]tpd-filter-enable = 1, pixel_density = 146
<6>[    1.171411] .(3)[1:swapper/0]mtk-tpd: tpd-rst-ext-gpio-num not found
<3>[    1.171494] .(3)[1:swapper/0]stmvl53l0x_init: Enter
<3>[    1.171498] .(3)[1:swapper/0]stmvl53l0x_init_i2c: Enter
<3>[    1.171537] .(3)[1:swapper/0]stmvl53l0x_init_i2c: End with rc:0
<3>[    1.171541] .(3)[1:swapper/0]stmvl53l0x_init: End
<4>[    1.171698] .(3)[1:swapper/0]Mapp dma regs successfully.
<3>[    1.171702] .(3)[1:swapper/0] mt_i2c_init driver as platform device
<6>[    1.172524] .(3)[1:swapper/0][I2C] id : 0, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.172670] .(3)[1:swapper/0]mt-i2c 11007000.i2c: i2c0 clock source ffffffc05c299800,clock src frequency 13650000
<4>[    1.173086] .(3)[1:swapper/0]Map cg regs successfully.
<6>[    1.173149] .(3)[1:swapper/0][I2C] id : 1, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.173247] .(3)[1:swapper/0]mt-i2c 11014000.i2c: i2c1 clock source ffffffc05c29f700,clock src frequency 13650000
<3>[    1.173851] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/irq_nfc
<3>[    1.173858] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_3
<3>[    1.173865] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/mhall
<3>[    1.173871] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_2
<3>[    1.173876] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_1
<3>[    1.173882] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_4
<3>[    1.173887] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/low_g
<3>[    1.173893] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/wc_pmode
<3>[    1.173898] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/tx_wlc
<3>[    1.174058] .(5)[1:swapper/0]stmvl53l0x_probe: Enter
<3>[    1.174062] .(5)[1:swapper/0]stmvl53l0x_parse_vdd: Enter
<4>[    1.174099] .(5)[1:swapper/0]1-0029 supply vdd not found, using dummy regulator
<3>[    1.174159] .(5)[1:swapper/0]stmvl53l0x_parse_vdd: End
<3>[    1.174163] .(5)[1:swapper/0]stmvl53l0x_setup: Enter
<3>[    1.174281] .(5)[213:STM-VL53L0]stmvl53l0x_poll_thread(818) : Starting Polling thread
<6>[    1.174406] .(6)[1:swapper/0]input: STM VL53L0 proximity sensor as /devices/virtual/input/input3
<3>[    1.174518] .(6)[1:swapper/0]stmvl53l0x_setup: Misc device registration name:1-0029
<3>[    1.174569] .(6)[1:swapper/0]stmvl53l0x_setup: support ver. 1.0.5 enabled
<3>[    1.174572] stmvl53l0x_setup: End<3>[    1.174574] .(6)[1:swapper/0]stmvl53l0x_probe: End
<4>[    1.174980] .(6)[1:swapper/0]aw9523_i2c_probe~~~~~
<6>[    1.174995] .(6)[1:swapper/0]aw9523_led 1-0059: aw9523_parse_dt: reset gpio provided ok
<3>[    1.175003] .(6)[1:swapper/0]aw9523_led 1-0059: aw9523_i2c_probe: rst request failed
<6>[    1.175006] .(6)[1:swapper/0]aw9523_hw_reset enter
<6>[    1.189749] .(0)[1:swapper/0]aw9523_read_chipid aw9523 detected
<4>[    1.189756] .(0)[1:swapper/0][bswap_led_red_on] level=0
<6>[    1.191564] .(0)[1:swapper/0]aw9523_i2c_probe probe completed successfully!
<3>[    1.191585] .(0)[1:swapper/0]BOOTPROF:      1191.584771:probe: probe=i2c_device_probe drv=aw9523_led(ffffff80096a4758)    16.594385ms
<3>[    1.191628] .(0)[1:swapper/0]BOOTPROF:      1191.628540:probe: probe=platform_drv_probe drv=mt-i2c(ffffff80096c01d0)    18.481846ms
<6>[    1.191692] .(0)[1:swapper/0][I2C] id : 2, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.191790] .(0)[1:swapper/0]mt-i2c 11015000.i2c: i2c2 clock source ffffffc05c22f880,clock src frequency 13650000
<4>[    1.192060] .(0)[1:swapper/0][fg_27542_driver_probe] address=55
<4>[    1.193554] .(0)[1:swapper/0]fg_27542 is_sealed sealed = 1 
<4>[    1.249195] .(0)[1:swapper/0]factory info data: data[0]=d3 data[1]=2 
<4>[    1.249702] .(0)[1:swapper/0]factory info data: data[2]=12 data[3]=6 
<4>[    1.250202] .(0)[1:swapper/0]factory info data: data[4]=0 data[5]=0 
<4>[    1.250708] .(0)[1:swapper/0]factory info data: data[6]=1 data[7]=32 
<4>[    1.251594] .(0)[1:swapper/0]factory info data: data[8]=30 data[9]=31 
<4>[    1.252095] .(0)[1:swapper/0]factory info data: data[10]=38 data[11]=30 
<4>[    1.252602] .(0)[1:swapper/0]factory info data: data[12]=36 data[13]=32 
<4>[    1.253117] .(0)[1:swapper/0]factory info data: data[14]=31 data[15]=30 
<4>[    1.253622] .(0)[1:swapper/0]factory info data: data[16]=30 data[17]=38 
<4>[    1.254124] .(0)[1:swapper/0]factory info data: data[18]=33 data[19]=53 
<4>[    1.255153] .(0)[1:swapper/0]factory info data: data[20]=43 data[21]=55 
<4>[    1.255680] .(0)[1:swapper/0]factory info data: data[22]=49 data[23]=44 
<4>[    1.256193] .(0)[1:swapper/0]factory info data: data[24]=0 data[25]=0 
<4>[    1.256708] .(0)[1:swapper/0]factory info data: data[26]=0 data[27]=f 
<4>[    1.258018] .(0)[1:swapper/0]factory info data: data[28]=8c data[29]=0 
<4>[    1.258547] .(0)[1:swapper/0]factory info data: data[30]=0 data[31]=0 
<4>[    1.259282] .(0)[1:swapper/0]random message:f6 
<4>[    1.259664] .(0)[1:swapper/0]random message:65 
<4>[    1.259985] .(0)[1:swapper/0]random message:49 
<4>[    1.260304] .(0)[1:swapper/0]random message:8 
<4>[    1.261925] .(0)[1:swapper/0]random message:fb 
<4>[    1.262281] .(0)[1:swapper/0]random message:7e 
<4>[    1.262689] .(0)[1:swapper/0]random message:a5 
<4>[    1.263093] .(0)[1:swapper/0]random message:e3 
<4>[    1.263498] .(0)[1:swapper/0]random message:9e 
<4>[    1.263896] .(0)[1:swapper/0]random message:28 
<4>[    1.264218] .(0)[1:swapper/0]random message:55 
<4>[    1.264537] .(0)[1:swapper/0]random message:6f 
<4>[    1.264869] .(0)[1:swapper/0]random message:8f 
<4>[    1.265271] .(0)[1:swapper/0]random message:50 
<4>[    1.265679] .(0)[1:swapper/0]random message:74 
<4>[    1.266079] .(0)[1:swapper/0]random message:29 
<4>[    1.266480] .(0)[1:swapper/0]random message:b2 
<4>[    1.266800] .(0)[1:swapper/0]random message:57 
<4>[    1.267121] .(0)[1:swapper/0]random message:71 
<4>[    1.267694] .(0)[1:swapper/0]random message:67 
<4>[    1.296694] .(0)[202:krtatm][Thermal/TZ/CPU]krtatm_thread c 23800 p 0 cl 2147483647 gl 2147483647 s 0
<4>[    1.371032] .(0)[1:swapper/0]data[0]: 84 
<4>[    1.371037] .(0)[1:swapper/0]data[1]: 45 
<4>[    1.371041] .(0)[1:swapper/0]data[2]: 1f 
<4>[    1.371045] .(0)[1:swapper/0]data[3]: 3c 
<4>[    1.371048] .(0)[1:swapper/0]data[4]: 21 
<4>[    1.371051] .(0)[1:swapper/0]data[5]: de 
<4>[    1.371054] .(0)[1:swapper/0]data[6]: 60 
<4>[    1.371058] .(0)[1:swapper/0]data[7]: 20 
<4>[    1.371061] .(0)[1:swapper/0]data[8]: 8a 
<4>[    1.371064] .(0)[1:swapper/0]data[9]: d2 
<4>[    1.371068] .(0)[1:swapper/0]data[10]: 88 
<4>[    1.371071] .(0)[1:swapper/0]data[11]: c9 
<4>[    1.371075] .(0)[1:swapper/0]data[12]: d3 
<4>[    1.371078] .(0)[1:swapper/0]data[13]: 7 
<4>[    1.371082] .(0)[1:swapper/0]data[14]: 9c 
<4>[    1.371085] .(0)[1:swapper/0]data[15]: 9a 
<4>[    1.371096] .(0)[1:swapper/0]result: 553f4e09, 9a9c07d3, c988d28a, 2060de21, 3c1f4584 
<4>[    1.371102] .(0)[1:swapper/0]SHA-1 check passed
<4>[    1.371105] .(0)[1:swapper/0]fg_27542 fg_27542_driver_probe eeprom_rev:2 
<3>[    1.371285] .(2)[1:swapper/0]BOOTPROF:      1371.284695:probe: probe=i2c_device_probe drv=fg_27542(ffffff800965f240)   179.215770ms
<4>[    1.371413] .(2)[1:swapper/0][mcp_6442_driver_probe] address=2c
<4>[    1.371606] .(2)[1:swapper/0]mcp reg[0xcc] val = 0x00 0x00
<4>[    1.384677] .(2)[1:swapper/0]******** mcp_6442_user_space_probe!! version=0 ********
<4>[    1.384863] .(2)[1:swapper/0]mcp reg[0x8c] val = 0x00 0x25
<4>[    1.400854] .(2)[1:swapper/0]mcp reg[0x2c] val = 0x00 0x16
<4>[    1.417497] .(2)[1:swapper/0]mcp reg[0x3c] val = 0x00 0x17
<4>[    1.432857] .(2)[1:swapper/0]mcp reg[0x6c] val = 0x00 0x07
<4>[    1.448856] .(2)[1:swapper/0]mcp reg[0x7c] val = 0x00 0x08
<4>[    1.464857] .(2)[1:swapper/0]mcp reg[0x9c] val = 0x00 0x70
<4>[    1.480677] .(2)[1:swapper/0]mcp_6442 :  112  112  37  37  22  23  7  8 
<3>[    1.480693] .(2)[1:swapper/0]BOOTPROF:      1480.693464:probe: probe=i2c_device_probe drv=mcp_6442(ffffff800965fc88)   109.275923ms
<6>[    1.480920] .(2)[1:swapper/0]MAINAF [AF_i2c_probe] Start
<6>[    1.480925] .(2)[1:swapper/0]MAINAF [Register_AF_CharDrv] Start
<6>[    1.481014] .(2)[1:swapper/0]MAINAF [Register_AF_CharDrv] End
<6>[    1.481018] .(2)[1:swapper/0]MAINAF [AFRegulatorCtrl] AFIOC_S_SETPOWERCTRL regulator_put           (null)
<4>[    1.481337] .(2)[1:swapper/0]MAINAF supply vcamaf not found, using dummy regulator
<6>[    1.481414] .(2)[1:swapper/0]MAINAF [AFRegulatorCtrl] [Init] regulator_get ffffffc05c1d2880
<6>[    1.481420] .(2)[1:swapper/0]MAINAF [AF_i2c_probe] Attached!!
<4>[    1.481633] .(2)[1:swapper/0][wlc_51025_driver_probe] address=6c
<6>[    1.481883] .(2)[1:swapper/0]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    1.481891] .(2)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.481895] .(2)[1:swapper/0]I2C structure:
<3>[    1.481895] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=2,Total_len=1
<3>[    1.481895] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    1.481895] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.481905] .(2)[1:swapper/0]base address 0xffffff800bf46000
<6>[    1.481916] .(2)[1:swapper/0]I2C register:
<6>[    1.481916] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=1,CONTROL=28,TRANSFER_LEN=1
<6>[    1.481916] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.481916] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    1.481927] .(2)[1:swapper/0]before enable DMA register(0xffffff800bf48400):
<6>[    1.481927] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.481927] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.481927] [I2C]TX_LEN=0,RX_LEN=10,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.481927] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.481941] .(2)[1:swapper/0]DMA register(0xffffff800bf48400):
<6>[    1.481941] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    1.481941] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c231010
<6>[    1.481941] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=10101000
<6>[    1.481941] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.481951] .(2)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.481956] .(2)[1:swapper/0]i2c i2c-2: last transfer info:
<3>[    1.481962] .(2)[1:swapper/0]i2c i2c-2: [00] [    1.481879] SLAVE_ADDR=d8,INTR_STAT=2,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.481972] .(2)[1:swapper/0]i2c i2c-2: [01] [    1.464849] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.481981] .(2)[1:swapper/0]i2c i2c-2: [02] [    1.448849] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.481990] .(2)[1:swapper/0]i2c i2c-2: [03] [    1.432849] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.482000] .(2)[1:swapper/0]i2c i2c-2: [04] [    1.417490] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.482009] .(2)[1:swapper/0]i2c i2c-2: [05] [    1.400847] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.482018] .(2)[1:swapper/0]i2c i2c-2: [06] [    1.384856] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.482027] .(2)[1:swapper/0]i2c i2c-2: [07] [    1.371597] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.482037] .(2)[1:swapper/0]i2c i2c-2: [08] [    1.371025] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=1,DEBUGSTAT=300, tmo=500
<3>[    1.482046] .(2)[1:swapper/0]i2c i2c-2: [09] [    1.368870] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<4>[    1.482086] .(2)[1:swapper/0]wlc_51025 :  0  0  
<4>[    1.482788] .(2)[1:swapper/0][Hall]wlc_51025_driver_probe can't find compatible node
<3>[    1.482831] .(2)[1:swapper/0]BOOTPROF:      1482.830926:probe: probe=platform_drv_probe drv=mt-i2c(ffffff80096c01d0)   291.140616ms
<6>[    1.482906] .(2)[1:swapper/0][I2C] id : 5, freq : 3400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.483036] .(2)[1:swapper/0]mt-i2c 1100f000.i2c: i2c5 clock source ffffffc05c1da700,clock src frequency 13650000
<3>[    1.483735] .(2)[1:swapper/0]mt6370_pmu 5-0034: find mt6370_pmu_dts node
<6>[    1.483760] .(2)[1:swapper/0]regmap_device_register: name = mt6370_pmu
<6>[    1.483801] .(2)[1:swapper/0] rt_regmap_mt6370_pmu: rt register cache data init
<6>[    1.483827] .(2)[1:swapper/0] rt_regmap_mt6370_pmu: cache cata init successfully
<6>[    1.491920] .(2)[1:swapper/0]mt6370_pmu_core mt6370_pmu_core: mt6370_pmu_core_probe successfully
<6>[    1.492117] .(2)[1:swapper/0]mt6370_pmu_charger_probe: (1.1.24_MTK)
<6>[    1.492126] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt_parse_dt
<3>[    1.492134] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt_parse_dt: no chg alias name
<3>[    1.492141] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt_parse_dt: no ls alias name
<3>[    1.492161] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_pmu_charger_probe: get usb switch failed
<6>[    1.492171] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_chg_init_setting
<6>[    1.492177] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_select_input_current_limit: select input current limit = 2
<6>[    1.497348] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_ilim: en = 0
<6>[    1.498503] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_set_mivr: mivr = 4400000 (0x05)
<4>[    1.498669] .(2)[1:swapper/0]DLCP __mt6370_set_cv       = 4350000
<4>[    1.499224] .(2)[1:swapper/0]DLCP __mt6370_set_ieoc      = 150000
<6>[    1.499487] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_enable_te: en = 1
<6>[    1.499652] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_fast_charge_timer: timer = 12 (0x04)
<6>[    1.500220] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_dc_wdt: wdt = 4000ms(0x06)
<6>[    1.500401] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_enable_safety_timer: en = 1
<6>[    1.500574] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_wdt: en = 0
<6>[    1.500744] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_disable_warm_cool_jeita
<6>[    1.501304] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_hz: en = 0
<6>[    1.501482] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_ircmp_resistor: resistor = 25000 (0x01)
<6>[    1.501660] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_ircmp_vclamp: vclamp = 32000 (0x01)
<6>[    1.501828] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_enable_chgdet_flow: en = 0
<6>[    1.502377] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_chg_sw_workaround
<6>[    1.502860] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_chg_sw_workaround: zcv = (0x00, 0x00, 0mV)
<6>[    1.505205] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_pmu_charger_probe successfully
<6>[    1.505386] .(2)[1:swapper/0]mt6370_pmu_fled_probe (1.0.2_MTK) id = 0
<6>[    1.505392] .(2)[1:swapper/0]mt6370_fled_parse_dt start
<6>[    1.505396] .(2)[1:swapper/0]mt6370_fled_parse_dt use torch cur 300000
<6>[    1.505565] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe cur 1200000
<6>[    1.505734] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe timeout 2400
<6>[    1.507003] .(2)[1:swapper/0]mt6370_pmu_fled_probe flash name = mt-flash-led1
<6>[    1.507102] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-388: Richtek FlashLED Driver is probing
<4>[    1.507110] .(2)[1:swapper/0]rt-flash-led:rtfled_check_hal_implement() line-374: check_hal_implemented have NULL item.
<6>[    1.507201] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-406: Richtek FlashLED Driver initialized successfully
<6>[    1.507747] .(2)[1:swapper/0]mt6370_pmu_fled mt6370_pmu_fled.0: mt6370 fled inited
<6>[    1.507754] .(2)[1:swapper/0]mt6370_pmu_fled mt6370_pmu_fled.0: mt6370_pmu_fled_probe successfully
<6>[    1.507924] .(2)[1:swapper/0]mt6370_pmu_fled_probe (1.0.2_MTK) id = 1
<6>[    1.507929] .(2)[1:swapper/0]mt6370_fled_parse_dt start
<6>[    1.507933] .(2)[1:swapper/0]mt6370_fled_parse_dt use torch cur 200000
<6>[    1.508407] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe cur 1000000
<6>[    1.508587] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe timeout 1200
<6>[    1.508687] .(2)[1:swapper/0]mt6370_pmu_fled_probe flash name = mt-flash-led2
<6>[    1.508779] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-388: Richtek FlashLED Driver is probing
<4>[    1.508785] .(2)[1:swapper/0]rt-flash-led:rtfled_check_hal_implement() line-374: check_hal_implemented have NULL item.
<6>[    1.508875] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-406: Richtek FlashLED Driver initialized successfully
<6>[    1.508886] .(2)[1:swapper/0]mt6370_pmu_fled mt6370_pmu_fled.1: mt6370_pmu_fled_probe successfully
<6>[    1.509062] .(2)[1:swapper/0]mt6370_pmu_ldo mt6370_pmu_ldo: regulator_name = irtx_ldo, min_uV = 1600000, max_uV = 4000000
<6>[    1.509542] .(2)[1:swapper/0]mt6370_pmu_ldo mt6370_pmu_ldo: mt6370_pmu_ldo_probe successfully
<6>[    1.513817] .(2)[1:swapper/0]mt6370_pmu_rgbled mt6370_pmu_rgbled: mt6370_pmu_rgbled_probe successfully
<6>[    1.515583] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-388: Richtek FlashLED Driver is probing
<6>[    1.515679] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-406: Richtek FlashLED Driver initialized successfully
<6>[    1.515805] .(2)[1:swapper/0]mt6370_pmu_bled mt6370_pmu_bled: mt6370_pmu_bled_probe successfully
<6>[    1.516050] .(2)[1:swapper/0]mt6370_pmu 5-0034: mt6370_pmu_probe successfully
<3>[    1.516070] .(2)[1:swapper/0]BOOTPROF:      1516.070310:probe: probe=i2c_device_probe drv=mt6370_pmu(ffffff800966cb08)    32.695230ms
<6>[    1.516287] .(2)[1:swapper/0]mt6370_i2c_probe
<6>[    1.516292] .(2)[1:swapper/0]I2C functionality : OK...
<6>[    1.518911] .(0)[45:pd_dbg_info]///PD dbg info 110d
<4>[    1.518917] .(0)[45:pd_dbg_info]<    1.518>0
<4>[    1.518917] <    1.518>pd_dbg_info : t2-t1 = 14
<4>[    1.518917] <    1.518>1
<4>[    1.518917] <    1.518>pd_dbg_info : t2-t1 = 1
<4>[    1.518917] <    1.518>2
<6>[    1.518942] .(2)[1:swapper/0]0
<6>[    1.518947] .(2)[1:swapper/0]pr_info : t2-t1 = 4
<6>[    1.518950] .(2)[1:swapper/0]1
<6>[    1.518953] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.518957] .(2)[1:swapper/0]2
<6>[    1.518960] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.518963] .(2)[1:swapper/0]3
<6>[    1.518966] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.518969] .(2)[1:swapper/0]4
<6>[    1.518972] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.518975] .(2)[1:swapper/0]5
<6>[    1.518978] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.518981] .(2)[1:swapper/0]6
<6>[    1.518984] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.518988] .(2)[1:swapper/0]7
<6>[    1.518991] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.518994] .(2)[1:swapper/0]8
<6>[    1.518997] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.519000] .(2)[1:swapper/0]9
<6>[    1.519003] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.519008] .(2)[1:swapper/0]mt_parse_dt
<6>[    1.519365] .(2)[1:swapper/0]mt6370_chipID = 0x2486
<6>[    1.519373] .(2)[1:swapper/0]regmap_device_register: name = mt6370-4e
<6>[    1.519422] .(2)[1:swapper/0] rt_regmap_mt6370-4e: rt register cache data init
<6>[    1.519435] .(2)[1:swapper/0] rt_regmap_mt6370-4e: cache cata init successfully
<6>[    1.519701] .(2)[1:swapper/0]tcpc_device_register register tcpc device (type_c_port0)
<6>[    1.519808] .(2)[1:swapper/0]PD Timer number = 57
<6>[    1.519920] .(2)[1:swapper/0]tcpci_timer_init : init OK
<6>[    1.519925] .(2)[1:swapper/0]pd_parse_pdata
<6>[    1.520023] .(2)[1:swapper/0]pd_parse_pdata src pdo data =
<6>[    1.520027] .(2)[1:swapper/0]pd_parse_pdata 0: 0x00019032
<6>[    1.520033] .(2)[1:swapper/0]pd_parse_pdata snk pdo data =
<6>[    1.520037] .(2)[1:swapper/0]pd_parse_pdata 0: 0x000190c8
<6>[    1.520041] .(2)[1:swapper/0]pd_parse_pdata 1: 0xc0761e3c
<6>[    1.520047] .(2)[1:swapper/0]pd_parse_pdata id vdos data =
<6>[    1.520050] .(2)[1:swapper/0]pd_parse_pdata 0: 0xd10029cf
<6>[    1.520054] .(2)[1:swapper/0]pd_parse_pdata 1: 0x00000000
<6>[    1.520058] .(2)[1:swapper/0]pd_parse_pdata 2: 0x00010000
<6>[    1.520063] .(2)[1:swapper/0]pd_parse_pdata charging_policy = 33
<6>[    1.520067] .(2)[1:swapper/0]pd_parse_pdata_bats Battery NR = 1
<6>[    1.520079] .(2)[1:swapper/0]pd_parse_pdata_bats fix_bat_info[0].mfrs_info.vid = 0x29cf, 					    .mfrs_info.pid = 0x1711, 					    .mfrs_string = bat1, 					    .bat_design_cap = 3000
<6>[    1.520087] .(2)[1:swapper/0]pd_parse_pdata_countries Country NR = 0
<6>[    1.520092] .(2)[1:swapper/0]pd_parse_log_src_cap_ext vid = 0x29cf, pid = 0x1711, xid = 0x0, 		fw_ver = 0x2, hw_ver = 0x1
<6>[    1.520098] .(2)[1:swapper/0]pd_parse_log_src_cap_ext voltage_regulation = 0, hold_time_ms = 0, compliance = 0x0, 		touch_current = 0x0, peak_current = 0 0 0
<6>[    1.520105] .(2)[1:swapper/0]pd_parse_log_src_cap_ext touch_temp = 0, source_inputs = 0x0, 		batteries = 0x0, source_pdp = 0x2
<6>[    1.520111] .(2)[1:swapper/0]pd_parse_pdata_mfrs VID = 0x29cf, PID = 0x5081
<6>[    1.520117] .(2)[1:swapper/0]pd_parse_pdata_mfrs PD mfrs_string = RichtekTCPC
<6>[    1.520189] .(2)[1:swapper/0]dpm_caps: local_dr_power
<6>[    1.520193] .(2)[1:swapper/0]dpm_caps: local_dr_data
<6>[    1.520198] .(2)[1:swapper/0]dpm_caps: local_ext_power
<6>[    1.520201] .(2)[1:swapper/0]dpm_caps: local_usb_comm
<6>[    1.520205] .(2)[1:swapper/0]dpm_caps: local_usb_suspend
<6>[    1.520209] .(2)[1:swapper/0]dpm_caps: local_high_cap
<6>[    1.520213] .(2)[1:swapper/0]dpm_caps: local_give_back
<6>[    1.520216] .(2)[1:swapper/0]dpm_caps: local_no_suspend
<6>[    1.520220] .(2)[1:swapper/0]dpm_caps: local_vconn_supply
<6>[    1.520224] .(2)[1:swapper/0]dpm_caps: attemp_discover_cable_dfp
<6>[    1.520228] .(2)[1:swapper/0]dpm_caps: attemp_enter_dp_mode
<6>[    1.520231] .(2)[1:swapper/0]dpm_caps: attemp_discover_cable
<6>[    1.520235] .(2)[1:swapper/0]dpm_caps: attemp_discover_id
<6>[    1.520239] .(2)[1:swapper/0]dpm_caps: pr_reject_as_source
<6>[    1.520242] .(2)[1:swapper/0]dpm_caps: pr_reject_as_sink
<6>[    1.520246] .(2)[1:swapper/0]dpm_caps: pr_check_gp_source
<6>[    1.520250] .(2)[1:swapper/0]dpm_caps: pr_check_gp_sink
<6>[    1.520254] .(2)[1:swapper/0]dpm_caps: dr_reject_as_dfp
<6>[    1.520258] .(2)[1:swapper/0]dpm_caps: dr_reject_as_ufp
<6>[    1.520262] .(2)[1:swapper/0]dpm_caps = 0x0010e18b
<3>[    1.520336] .(2)[1:swapper/0]dp_parse_svid_data get displayport data fail
<6>[    1.520679] .(2)[1:swapper/0]usb_type_c 5-004e: PD_REV30
<6>[    1.520888] .(2)[1:swapper/0]mt6370_init_alert name = type_c_port0, gpio = 389
<6>[    1.520927] .(2)[1:swapper/0]mt6370_init_alert : IRQ number = 713
<6>[    1.521034] .(2)[1:swapper/0]IRQF_NO_THREAD Test
<6>[    1.521081] .(2)[1:swapper/0]mt6370_i2c_probe probe OK!
<3>[    1.521131] .(2)[1:swapper/0]BOOTPROF:      1521.130926:probe: probe=platform_drv_probe drv=mt-i2c(ffffff80096c01d0)    38.225077ms
<6>[    1.521209] .(2)[1:swapper/0][I2C] id : 3, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.521329] .(2)[1:swapper/0]mt-i2c 11011000.i2c: i2c3 clock source ffffffc05c335700,clock src frequency 13650000
<4>[    1.521661] .(2)[1:swapper/0]pn548_probe: start...
<4>[    1.521666] .(2)[1:swapper/0]pn548_probe: step02 is ok
<4>[    1.521670] .(2)[1:swapper/0]pn548_dev=ffffffc05c337300
<4>[    1.521674] .(2)[1:swapper/0]pn548_probe: step03 is ok
<4>[    1.521743] .(2)[1:swapper/0]pn548_probe: step04 is ok
<4>[    1.521747] .(2)[1:swapper/0]pn548_probe: step05 is ok
<4>[    1.522052] .(2)[1:swapper/0]pn548_dev->irq_gpio = 26
<4>[    1.522226] .(2)[1:swapper/0]pn548 client->irq = 699
<4>[    1.522257] .(2)[1:swapper/0]pn548_probe: set EINT finished, client->irq=699
<4>[    1.522262] .(2)[1:swapper/0]pn548_disable_irq
<4>[    1.522267] .(2)[1:swapper/0]pn548_platform_pinctrl_select
<4>[    1.522291] .(2)[1:swapper/0]pn548_probe: step06 success
<6>[    1.522366] .(2)[1:swapper/0][I2C] id : 4, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.522482] .(2)[1:swapper/0]mt-i2c 11017000.i2c: i2c4 clock source ffffffc05c33a480,clock src frequency 13650000
<6>[    1.522989] .(2)[1:swapper/0]MAINAF [AFRegulatorCtrl] AFIOC_S_SETPOWERCTRL regulator_put ffffffc05c1d2880
<4>[    1.523202] .(2)[1:swapper/0]fx16408 probe 
<4>[    1.523322] .(2)[1:swapper/0]STM32 Device is awake: 0x5c
<4>[    1.523407] .(2)[1:swapper/0]stm32_i2c: probe of 4-005c failed with error -1
<6>[    1.523473] .(2)[1:swapper/0][I2C] id : 6, freq : 3400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.523561] .(2)[1:swapper/0]mt-i2c 11005000.i2c: i2c6 clock source ffffffc05c35a000,clock src frequency 13650000
<6>[    1.523870] .(2)[1:swapper/0][I2C] id : 7, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.523957] .(2)[1:swapper/0]mt-i2c 11008000.i2c: i2c7 clock source ffffffc05c35ad00,clock src frequency 13650000
<6>[    1.524169] .(2)[1:swapper/0][I2C] id : 8, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.524257] .(2)[1:swapper/0]mt-i2c 11009000.i2c: i2c8 clock source ffffffc05c35da00,clock src frequency 13650000
<6>[    1.524691] .(2)[1:swapper/0][I2C] id : 9, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.524779] .(2)[1:swapper/0]mt-i2c 11016000.i2c: i2c9 clock source ffffffc05c362980,clock src frequency 13650000
<3>[    1.527410] .(2)[1:swapper/0]BOOTPROF:      1527.409234:initcall: mt_i2c_init   355.845308ms
<5>[    1.527575] .(2)[1:swapper/0]netlink_kernel_create protol= 26
<5>[    1.527580] .(2)[1:swapper/0]netlink_kernel_create ok
<5>[    1.529045] .(2)[1:swapper/0]******** battery_dts_probe!! ********
<5>[    1.529452] .(2)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    1.529462] -(2)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    1.529471] .(2)[1:swapper/0][fgauge_read_RTC_boot_status] rtc_invalid 0 plugout 0 plugout_time 0 spare3 0xe4 spare0 0x60 hw_id 0x5640
<5>[    1.529878] .(2)[1:swapper/0][fgauge_get_profile_id]Battery id=(0) en:0,0
<5>[    1.530294] .(2)[1:swapper/0][BAT_probe] power_supply_register Battery Success !!
<5>[    1.530881] .(2)[1:swapper/0] fg_swocv_v = 43121 len 5 fg_swocv_v_tmp 43121 ptim_lk_v[43121]
<5>[    1.530904] .(2)[1:swapper/0] fg_swocv_i = -612 len 2 fg_swocv_i_tmp -6 ptim_lk_i[-6]
<5>[    1.530926] .(2)[1:swapper/0] shutdown_time = 0612 len 1 shutdown_time_tmp 0 pl_shutdown_time[0]
<5>[    1.530947] .(2)[1:swapper/0] boot_voltage = 4303 len 4 boot_voltage_tmp 4303 pl_bat_vol[4303]
<4>[    1.531976] .(2)[1:swapper/0]=====FG===== AC   = 88
<5>[    1.531993] .(2)[1:swapper/0]read DISABLE_MTKBATTERY fail
<5>[    1.531997] .(2)[1:swapper/0][fgauge_get_profile_id]Battery id=(0) en:0,0
<5>[    1.532001] .(2)[1:swapper/0]fg_custom_init_from_dts
<5>[    1.532011] .(2)[1:swapper/0]Get MTK_CHR_EXIST failed
<5>[    1.532017] .(2)[1:swapper/0]Get PSEUDO1_IQ_OFFSET BAT0 failed
<5>[    1.532030] .(2)[1:swapper/0]Get PMIC_MIN_VOL failed
<5>[    1.532035] .(2)[1:swapper/0]Get POWERON_SYSTEM_IBOOT failed
<5>[    1.532039] .(2)[1:swapper/0]Get FGC_FGV_TH1 failed
<5>[    1.532043] .(2)[1:swapper/0]Get FGC_FGV_TH2 failed
<5>[    1.532047] .(2)[1:swapper/0]Get FGC_FGV_TH3 failed
<5>[    1.532052] .(2)[1:swapper/0]Get UISOC_UPDATE_T failed
<5>[    1.532056] .(2)[1:swapper/0]Get UIFULLLIMIT_EN failed
<5>[    1.532061] .(2)[1:swapper/0]Get MULTI_GAUGE0_EN failed
<5>[    1.532065] .(2)[1:swapper/0]Get SHUTDOWN_GAUGE0_VOLTAGE failed
<4>[    1.532704] .(0)[222:battery_thread]=====FG===== AC   = 88
<3>[    1.534208] [config_data_dump_to_cp]cmdline=console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6763 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=orange bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=0 bootprof.pl_t=4682 bootprof.lk_t=7367 bootprof.logo_t=1226 boot_reason=4 androidboot.serialno=S19F00013 androidboot.secureboot=49 androidboot.specialid=0 dlconfig_tof_offset=0 dlconfig_tof_x_talk=0 config_data_tof_offset_cali_flag=0 config_data_tof_xtalk_cali_flag=0 config_data_cp_index=0 config_data_charge_current=0 config_data_charge_termination_current=0 config_data_charge_voltage=0 config_data_recharge_threshold=0 config_data_precharge_current=0 config_data_pid_target_temperature=0 config_data_battery_profile_id=0 cmdline_power_on_flag=1 power_key_flag=0 power_on<3>[    1.534243] .(2)[1:swapper/0][config_data_get_value_by_name_from_cmdline]rt_value=0
<5>[    1.534248] .(2)[1:swapper/0][battery_init] Initialization : DONE
<4>[    1.534838] .(0)[222:battery_thread]temp_now=193, temp_last=250 
<4>[    1.534844] .(0)[222:battery_thread]=====FG===== TEMP = 193
<6>[    1.535819] .(2)[1:swapper/0]device-mapper: uevent: version 1.0.3
<4>[    1.535934] .(0)[222:battery_thread]=====FG===== VOLT = 4343
<4>[    1.535939] .(0)[222:battery_thread]=====FG===== actural VOLT = 4333
<6>[    1.536019] .(2)[1:swapper/0]device-mapper: ioctl: 4.34.0-ioctl (2015-10-28) initialised: dm-devel@redhat.com
<6>[    1.540967] .(2)[1:swapper/0][msdc]DT probe msdc0!
<6>[    1.541049] .(2)[1:swapper/0][msdc][msdc0] get irq # 16
<4>[    1.541332] .(2)[1:swapper/0]11230000.msdc supply vqmmc not found, using dummy regulator
<6>[    1.541951] .(2)[1:swapper/0][msdc][msdc0] hclk:371999833, clk_ctl:ffffffc05c38e200, hclk_ctl:ffffffc05c38e300
<6>[    1.542368] .(2)[1:swapper/0][msdc]DT probe msdc1!
<6>[    1.542423] .(2)[1:swapper/0]mtk-msdc 11240000.msdc: Got CD GPIO
<6>[    1.542484] .(2)[1:swapper/0][msdc][msdc1] get irq # 17
<6>[    1.542969] .(2)[1:swapper/0][msdc][msdc1] hclk:185999916, clk_ctl:ffffffc05c38ef80, hclk_ctl:ffffffc05f4a1d80
<6>[    1.543348] .(2)[1:swapper/0][msdc]DT probe msdc2!
<6>[    1.543403] .(2)[1:swapper/0][msdc][msdc2] get irq # 18
<4>[    1.543463] .(2)[1:swapper/0]11250000.msdc supply vmmc not found, using dummy regulator
<4>[    1.543514] .(2)[1:swapper/0]11250000.msdc supply vqmmc not found, using dummy regulator
<6>[    1.543545] .(0)[6:kworker/u16:0][msdc]msdc0: pin state init (0)
<6>[    1.543625] .(0)[6:kworker/u16:0][msdc]msdc0 power on
<6>[    1.543664] .(2)[1:swapper/0][msdc][msdc2] hclk:185999916, clk_ctl:ffffffc05c391a00, hclk_ctl:ffffffc05c391b00
<6>[    1.543955] .(2)[1:swapper/0][I]mtk_wcn_cmb_sdio_request_eirq:enter
<6>[    1.544511] .(2)[1:swapper/0][I]mtk_wcn_cmb_sdio_request_eirq:exit
<6>[    1.544697] .(1)[45:pd_dbg_info]///PD dbg info 404d
<4>[    1.544704] <    1.518>pd_dbg_info : t2-t1 = 1
<4>[    1.544704] <    1.518>3
<4>[    1.544704] <    1.518>pd_dbg_info : t2-t1 = 1
<4>[    1.544704] <    1.518>4
<4>[    1.544704] <    1.518>pd_dbg_info : t2-t1 = 1
<4>[    1.544707] <    1.518>5
<4>[    1.544707] <    1.518>pd_dbg_info : t2-t1 = 1
<4>[    1.544707] <    1.518>6
<4>[    1.544707] <    1.518>pd_dbg_info : t2-t1 = 1
<4>[    1.544707] <    1.518>7
<4>[    1.544707] <    1.518>pd_dbg_info : t2-t1 = 1
<4>[    1.544710] <    1.518>8
<4>[    1.544710] <    1.518>pd_dbg_info : t2-t1 = 1
<4>[    1.544710] <    1.518>9
<4>[    1.544710] <    1.518>pd_dbg_info : t2-t1 = 1
<4>[    1.544710] <    1.520>TC.(1)[45:pd_dbg_info]PC-PE:pd_core_init
<6>[    1.544731] .(1)[68:kworker/u16:1]power_supply battery: power_supply_changed
<4>[    1.545348] .(1)[70:kworker/1:1]temp_now=193, temp_last=193 
<4>[    1.545354] .(1)[70:kworker/1:1]=====FG===== TEMP = 193
<4>[    1.545978] .(1)[70:kworker/1:1]=====FG===== SOC  = 100
<6>[    1.546536] .(2)[1:swapper/0]hidraw: raw HID events driver (C) Jiri Kosina
<6>[    1.547617] .(2)[1:swapper/0]usbcore: registered new interface driver usbhid
<6>[    1.547622] .(2)[1:swapper/0]usbhid: USB HID core driver
<4>[    1.547654] .(1)[70:kworker/1:1]=====FG===== AC   = 88
<6>[    1.547822] .(2)[1:swapper/0]ashmem: initialized
<6>[    1.547895] .(2)[1:swapper/0]lowmemorykiller: lowmem_init: successful to register misc device!
<6>[    1.549476] .(2)[1:swapper/0]usbcore: registered new interface driver snd-usb-audio
<4>[    1.549569] .(1)[70:kworker/1:1]=====FG===== VOLT = 4343
<4>[    1.549575] .(1)[70:kworker/1:1]=====FG===== actural VOLT = 4333
<4>[    1.550741] .(1)[70:kworker/1:1]temp_now=193, temp_last=193 
<4>[    1.550747] .(1)[70:kworker/1:1]=====FG===== TEMP = 193
<6>[    1.550994] .(2)[1:swapper/0]rt5509_driver_init
<4>[    1.551337] .(1)[70:kworker/1:1]=====FG===== SOC  = 100
<4>[    1.552666] .(1)[70:kworker/1:1]bq27542_set_commands cmd = 0x12, val = 3813 
<4>[    1.553273] .(1)[70:kworker/1:1]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    1.554067] .(1)[70:kworker/1:1]bq27542_set_commands cmd = 0xc, val = 3952 
<4>[    1.555393] .(2)[1:swapper/0]mtk_btcvsd_tx_probe: dev name mt-soc-btcvsd-tx-pcm
<6>[    1.555644] .(2)[1:swapper/0]speaker_amp 1-0034: mtk_spk_i2c_probe()
<6>[    1.555650] .(2)[1:swapper/0]+rt5509_i2c_probe
<6>[    1.556884] .(2)[1:swapper/0]i2c i2c-1: addr: 34, transfer ACK error
<6>[    1.556892] .(2)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.556896] .(2)[1:swapper/0]I2C structure:
<3>[    1.556896] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=3,Total_len=1
<3>[    1.556896] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.556896] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.556906] .(2)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.556917] .(2)[1:swapper/0]I2C register:
<6>[    1.556917] [I2C]SLAVE_ADDR=68,INTR_MASK=0,INTR_STAT=0,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.556917] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.556917] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.556928] .(2)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.556928] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.556928] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.556928] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.556928] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.556942] .(2)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.556942] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.556942] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.556942] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.556942] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.556952] .(2)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.556957] .(2)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.556963] .(2)[1:swapper/0]i2c i2c-1: [00] [    1.556881] SLAVE_ADDR=68,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    1.556973] .(2)[1:swapper/0]i2c i2c-1: [01] [    1.191558] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.556982] .(2)[1:swapper/0]i2c i2c-1: [02] [    1.191437] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.556992] .(2)[1:swapper/0]i2c i2c-1: [03] [    1.190713] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.557001] .(2)[1:swapper/0]i2c i2c-1: [04] [    1.190595] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.557010] .(2)[1:swapper/0]i2c i2c-1: [05] [    1.190476] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1210,DEBUGSTAT=300, tmo=500
<3>[    1.557020] .(2)[1:swapper/0]i2c i2c-1: [06] [    1.190327] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.557029] .(2)[1:swapper/0]i2c i2c-1: [07] [    1.190204] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1210,DEBUGSTAT=300, tmo=500
<3>[    1.557038] .(2)[1:swapper/0]i2c i2c-1: [08] [    1.190042] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.557047] .(2)[1:swapper/0]i2c i2c-1: [09] [    1.189912] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1210,DEBUGSTAT=300, tmo=500
<3>[    1.557073] .(2)[1:swapper/0]speaker_amp 1-0034: power on fail 1
<3>[    1.557081] .(2)[1:swapper/0]speaker_amp 1-0034: error -121
<4>[    1.557096] .(2)[1:swapper/0]speaker_amp: probe of 1-0034 failed with error -121
<4>[    1.557193] .(2)[1:swapper/0]mtk_soc_capture_platform_init
<4>[    1.558127] .(2)[1:swapper/0]mtk_capture_probe
<4>[    1.558134] .(2)[1:swapper/0]mtk_capture_probe: dev name mt-soc-ul1-pcm
<4>[    1.559051] .(2)[1:swapper/0]mtk_soc_dl1_probe: dev name mt-soc-dl1-pcm
<4>[    1.562216] .(2)[1:swapper/0]AudDrv_GPIO_probe
<4>[    1.562573] .(2)[1:swapper/0]AudDrv_GPIO_probe(), extbuck_fan53526_exist = 0
<3>[    1.562579] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_off fail -19
<3>[    1.562584] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_on fail -19
<3>[    1.562590] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_miso2_off fail -19
<3>[    1.562595] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_miso2_on fail -19
<3>[    1.562600] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_mosi2_off fail -19
<3>[    1.562604] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_mosi2_on fail -19
<3>[    1.562609] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_dat_miso_off fail -19
<3>[    1.562613] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_dat_miso_on fail -19
<3>[    1.562617] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_clk_miso_off fail -19
<3>[    1.562622] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_clk_miso_on fail -19
<3>[    1.562626] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_reset fail -19
<3>[    1.562631] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_on fail -19
<3>[    1.562635] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_off fail -19
<3>[    1.562640] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_tdm_mode0 fail -19
<3>[    1.562644] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_tdm_mode1 fail -19
<3>[    1.562648] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audpmicclk-mode0 fail -19
<3>[    1.562653] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audpmicclk-mode1 fail -19
<3>[    1.562657] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audi2s1-mode0 fail -19
<3>[    1.562661] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audi2s1-mode1 fail -19
<3>[    1.562667] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state extamp2-pullhigh fail -19
<3>[    1.562671] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state extamp2-pulllow fail -19
<3>[    1.562675] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state rcvspk-pullhigh fail -19
<3>[    1.562679] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state rcvspk-pulllow fail -19
<3>[    1.562684] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state hpdepop-pullhigh fail -19
<3>[    1.562688] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state hpdepop-pulllow fail -19
<3>[    1.562692] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_pull_high fail -19
<3>[    1.562697] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_pull_low fail -19
<3>[    1.562919] .(2)[1:swapper/0]Auddrv_Reg_map
<3>[    1.563189] .(2)[1:swapper/0][mt_idle_ntf] <00>ffffff8008a44e00 (audio_idle_notify_call)
<4>[    1.563230] .(2)[1:swapper/0]InitSramManager mBlocknum = 12 mAud_Sram_Manager.mSramLength = 49152 mAud_Sram_Manager.mBlockSize = 4096
<4>[    1.563241] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 0
<4>[    1.563247] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 1
<4>[    1.563252] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 2
<4>[    1.563257] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 3
<4>[    1.563262] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 4
<4>[    1.563267] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 5
<4>[    1.563272] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 6
<4>[    1.563277] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 7
<4>[    1.563282] .(2)[1:swapper/0]init_afe_ops
<4>[    1.563304] .(2)[1:swapper/0][ge_mt_soc_pcm_dl1] afe_irq_number=95
<4>[    1.564243] .(2)[1:swapper/0]mtk_soc_dummy_platform_init
<4>[    1.565261] .(2)[1:swapper/0]mtk_dummy_probe
<4>[    1.565269] .(2)[1:swapper/0]mtk_dummy_probe: dev name mt-soc-dummy-pcm
<4>[    1.565414] .(2)[1:swapper/0]mtk_soc_routing_platform_init
<4>[    1.566268] .(2)[1:swapper/0]mtk_afe_routing_probe
<4>[    1.566274] .(2)[1:swapper/0]mtk_afe_routing_probe: dev name mt-soc-routing-pcm
<4>[    1.566406] .(2)[1:swapper/0]mtk_soc_capture2_platform_init
<4>[    1.567194] .(2)[1:swapper/0]mtk_capture2_probe
<4>[    1.567199] .(2)[1:swapper/0]mtk_capture2_probe: dev name mt-soc-ul2-pcm
<3>[    1.567892] .(2)[1:swapper/0]mtk_i2s2_adc2_probe: dev name mt-soc-i2s2_adc2-pcm
<4>[    1.567931] .(2)[1:swapper/0]mtk_soc_voice_platform_init()
<4>[    1.568690] .(2)[1:swapper/0]mtk_voice_probe(), dev name mt-soc-voicemd1
<6>[    1.568853] .(0)[6:kworker/u16:0][msdc]msdc0 -> !!! Set<400KHz> Source<371999KHz> -> sclk<399KHz> timing<0> mode<0> div<233> hs400_div_dis<0>
<4>[    1.568861] .(2)[1:swapper/0]mtk_soc_voice_md2_platform_init()
<4>[    1.569711] .(2)[1:swapper/0]mtk_voice_md2_probe(), dev name mt-soc-voicemd2
<4>[    1.574222] .(2)[1:swapper/0]mtk_I2S0dl1_soc_platform_init
<4>[    1.574944] .(2)[1:swapper/0]mtk_I2S0dl1_probe: dev name mt-soc-i2s0dl1-pcm
<4>[    1.575083] .(2)[1:swapper/0]mtk_soc_i2s0_awb_platform_init
<4>[    1.575809] .(2)[1:swapper/0]mtk_i2s0_awb_probe
<4>[    1.575814] .(2)[1:swapper/0]mtk_i2s0_awb_probe: dev name mt-soc-i2s0awb-pcm
<4>[    1.575935] .(2)[1:swapper/0]mtk_soc_uldlloopback_platform_init
<4>[    1.576640] .(2)[1:swapper/0]mtk_uldlloopback_probe
<4>[    1.576668] .(2)[1:swapper/0]mtk_uldlloopback_probe: dev name mt-soc-uldlloopback-pcm
<4>[    1.577671] .(2)[1:swapper/0]mtk_soc_dl2_probe: dev name mt-soc-dl2-pcm
<4>[    1.578685] .(2)[1:swapper/0]mtk_mrgrx_soc_platform_init
<4>[    1.579416] .(2)[1:swapper/0]mtk_mrgrx_probe
<4>[    1.579421] .(2)[1:swapper/0]mtk_mrgrx_probe: dev name mt-soc-mrgrx-pcm
<4>[    1.579560] .(2)[1:swapper/0]mtk_soc_mrgrx_awb_platform_init
<4>[    1.580281] .(2)[1:swapper/0]mtk_mrgrx_awb_probe
<4>[    1.580286] .(2)[1:swapper/0]mtk_mrgrx_awb_probe: dev name mt-soc-mrgrx-awb-pcm
<4>[    1.580423] .(2)[1:swapper/0]mtk_fm_i2s_soc_platform_init
<4>[    1.581173] .(2)[1:swapper/0]mtk_fm_i2s_probe
<4>[    1.581178] .(2)[1:swapper/0]mtk_fm_i2s_probe: dev name mt-soc-fm-i2s-pcm
<4>[    1.582053] .(2)[1:swapper/0]mtk_fm_i2s_awb_probe: dev name mt-soc-fm-i2s-awb-pcm
<4>[    1.583889] .(2)[1:swapper/0]mtk_soc_bt_dai_platform_init
<4>[    1.584607] .(2)[1:swapper/0]mtk_bt_dai_probe
<4>[    1.584613] .(2)[1:swapper/0]mtk_bt_dai_probe: dev name mt-soc-voip-bt-in
<4>[    1.584772] .(2)[1:swapper/0]mtk_dai_stub_init:
<5>[    1.585301] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<4>[    1.585746] .(2)[1:swapper/0]mtk_dai_stub_dev_probe  name mt_soc_dai_name
<4>[    1.585751] .(2)[1:swapper/0]mtk_dai_stub_dev_probe: dev name mt-soc-dai-driver
<4>[    1.585803] .(2)[1:swapper/0]mtk_dai_stub_dev_probe: rc  = 0
<5>[    1.585810] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<4>[    1.585926] .(2)[1:swapper/0]mtk_routing_init:
<4>[    1.586794] .(2)[1:swapper/0]mtk_routing_dev_probe  name mt_soc_routing_dai_name
<4>[    1.586800] .(2)[1:swapper/0]mtk_routing_dev_probe: dev name Routing-Control
<4>[    1.586916] .(2)[1:swapper/0]mtk_dummy_codec_init:
<4>[    1.587696] .(2)[1:swapper/0]mtk_dummy_codec_dev_probe: dev name mt-soc-dummy-codec
<5>[    1.589779] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    1.589846] .(0)[4:kworker/0:0][msdc]msdc0 -> XXX CMD<8><0x1aa> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:0><0x4>
<5>[    1.590289] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.590785] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.590900] .(2)[1:swapper/0]mtk-audio 11220000.audio: mtk_spk_update_dai_link(), mtk_spk_type 0
<6>[    1.590908] .(2)[1:swapper/0]mtk-audio 11220000.audio: mtk_spk_update_dai_link(), ext_Speaker_Multimedia, codec dai name = snd-soc-dummy-dai, codec name = snd-soc-dummy
<5>[    1.591281] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.591777] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.592279] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.592773] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.593271] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<4>[    1.593359] .(6)[1:swapper/0]mtk_voice_platform_probe()
<4>[    1.593382] .(6)[1:swapper/0]mtk_afe_uldlloopback_probe
<4>[    1.593438] .(6)[1:swapper/0]dummy_codec_probe()
<4>[    1.593490] .(6)[1:swapper/0]mtk_afe_mrgrx_probe
<4>[    1.593516] .(6)[1:swapper/0]mtk_afe_mrgrx_awb_probe
<5>[    1.593764] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<4>[    1.593858] .(6)[1:swapper/0]mtk_asoc_bt_dai_probe
<4>[    1.593923] .(6)[1:swapper/0]mtk_afe_capture2_probe
<4>[    1.593961] .(6)[1:swapper/0]mtk_i2s0_dl1_awb_probe
<4>[    1.593982] .(6)[1:swapper/0]mtk_voice_md2_platform_probe()
<4>[    1.593998] .(6)[1:swapper/0]mtk_afe_routing_platform_probe
<4>[    1.594121] .(6)[1:swapper/0]mtk_afe_fm_i2s_probe
<4>[    1.594235] .(6)[1:swapper/0]mtk_asoc_pcm_btcvsd_tx_platform_probe
<4>[    1.594270] .(6)[1:swapper/0]mtk_i2s2_adc2_data_probe
<6>[    1.594468] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-tx-dai <-> mt-soc-dl1dai-driver mapping ok
<6>[    1.594539] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-rx-dai <-> mt-soc-ul1dai-driver mapping ok
<6>[    1.594632] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd1-dai <-> mt-soc-voicemd1dai-driver mapping ok
<6>[    1.594724] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-uldlloopback-dai <-> mt-soc-uldlloopbackdai-driver mapping ok
<6>[    1.594792] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-i2s0-dummy-dai-codec <-> mt-soc-i2s0dai-driver mapping ok
<6>[    1.594892] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-mrgrx-dai-codec <-> mt-soc-mrgrxdai-driver mapping ok
<6>[    1.594987] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-mrgrx-dummy-dai-codec <-> mt-soc-mrgrxdai-driver mapping ok
<6>[    1.595053] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-I2s0tx-dai <-> mt-soc-i2s0dl1dai-driver mapping ok
<6>[    1.595119] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-deepbuffer-tx-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.595187] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-dl1awb-dai <-> mt-soc-dl1awbdai-driver mapping ok
<6>[    1.595255] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd1-bt-dai <-> mt-soc-voicemd1-btdai-driver mapping ok
<6>[    1.595320] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voipcall-btout-dai <-> mt-soc-voipcall-btdai-out-driver mapping ok
<6>[    1.595388] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voipcall-btin-dai <-> mt-soc-voipcall-btdai-in-driver mapping ok
<6>[    1.595455] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-tdmrx-dai-codec <-> mt-soc-tdmrxdai-driver mapping ok
<6>[    1.595525] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fmmrg2tx-dummy-dai-codec <-> mt-soc-fmmrgtxdai-driver mapping ok
<6>[    1.595595] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-rx-dai2 <-> mt-soc-ul2dai-driver mapping ok
<6>[    1.595664] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-i2s0awb-dai <-> mt-soc-i2s0awbdai-driver mapping ok
<6>[    1.595759] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd2-dai <-> mt-soc-voicemd2dai-driver mapping ok
<6>[    1.595852] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-dummy-dai-codec <-> snd-soc-dummy-dai mapping ok
<6>[    1.595924] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd2-bt-dai <-> mt-soc-voicemd2-btdai-driver mapping ok
<6>[    1.595990] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-hp-impedance-dai <-> mt-soc-hpimpedancedai-driver mapping ok
<6>[    1.596057] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fm-i2s-dai-codec <-> mt-soc-fmi2S-driver mapping ok
<6>[    1.596127] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fm-i2s-dummy-dai-codec <-> mt-soc-fmi2S-driver mapping ok
<6>[    1.596193] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-tx-dai2 <-> mt-soc-dl2dai-driver mapping ok
<6>[    1.596264] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-offload-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.596362] .(6)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.596458] .(6)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.596523] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-dummy-dai-codec <-> mt-soc-anc-record-dai-driver mapping ok
<6>[    1.596700] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voiceusb-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.596795] .(6)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voiceusb-echoref-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.596890] .(6)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.596991] .(6)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.597058] .(6)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> mt-soc-i2s2adc2dai-driver mapping ok
<4>[    1.597273] .(6)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create FM_I2S_Capture debugfs file
<4>[    1.597284] .(6)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create FM_I2S_Playback debugfs file
<4>[    1.597325] .(6)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create MRGRX_CAPTURE debugfs file
<4>[    1.597340] .(6)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    1.597353] .(6)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create SCPVoice_PLayback debugfs file
<4>[    1.597370] .(6)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create I2S0_PLayback debugfs file
<4>[    1.597379] .(6)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create ULDL_Loopback debugfs file
<4>[    1.597394] .(6)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    1.597403] .(6)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<4>[    1.597469] .(6)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    1.597485] .(6)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create ULDL_Loopback debugfs file
<4>[    1.597510] .(6)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_USB_EchoRef debugfs file
<4>[    1.597520] .(6)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_USB_PLayback debugfs file
<4>[    1.597530] .(6)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    1.597539] .(6)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<4>[    1.597593] .(6)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    1.597607] .(6)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MultiMedia_Routing debugfs file
<4>[    1.597640] .(6)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MultiMedia_Routing debugfs file
<4>[    1.597657] .(6)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    1.597667] .(6)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<6>[    1.601658] .(6)[1:swapper/0]Mirror/redirect action on
<6>[    1.601679] .(6)[1:swapper/0]u32 classifier
<6>[    1.601682] .(6)[1:swapper/0]    Performance counters on
<6>[    1.601684] .(6)[1:swapper/0]    input device check on
<6>[    1.601686] .(6)[1:swapper/0]    Actions configured
<6>[    1.601701] .(6)[1:swapper/0]Netfilter messages via NETLINK v0.30.
<6>[    1.601743] .(6)[1:swapper/0]nf_conntrack version 0.5.0 (16384 buckets, 65536 max)
<6>[    1.602103] .(6)[1:swapper/0]ctnetlink v0.93: registering with nfnetlink.
<6>[    1.602543] .(6)[1:swapper/0]xt_time: kernel timezone is -0000
<6>[    1.602638] .(6)[1:swapper/0]ipip: IPv4 over IPv4 tunneling driver
<6>[    1.603128] .(6)[1:swapper/0]ip_tables: (C) 2000-2006 Netfilter Core Team
<6>[    1.603276] .(6)[1:swapper/0]arp_tables: (C) 2002 David S. Miller
<6>[    1.603331] .(6)[1:swapper/0]Initializing XFRM netlink socket
<6>[    1.603702] .(6)[1:swapper/0]NET: Registered protocol family 10
<6>[    1.606043] .(6)[1:swapper/0]mip6: Mobile IPv6
<6>[    1.606068] .(6)[1:swapper/0]ip6_tables: (C) 2000-2006 Netfilter Core Team
<6>[    1.606220] .(6)[1:swapper/0]sit: IPv6 over IPv4 tunneling driver
<6>[    1.606626] .(6)[1:swapper/0]NET: Registered protocol family 17
<6>[    1.606651] .(6)[1:swapper/0]NET: Registered protocol family 15
<6>[    1.606680] .(6)[1:swapper/0]bridge: automatic filtering via arp/ip/ip6tables has been deprecated. Update your scripts to load br_netfilter if you need this.
<5>[    1.606705] .(6)[1:swapper/0]Bridge firewalling registered
<6>[    1.606711] .(6)[1:swapper/0]8021q: 802.1Q VLAN Support v1.8
<6>[    1.607836] .(6)[1:swapper/0][cpu_ntf] <00>ffffff80080850d8 (fpsimd_cpu_hotplug_notifier)
<5>[    1.608294] .(6)[1:swapper/0]Registered cp15_barrier emulation handler
<5>[    1.609162] .(6)[1:swapper/0]Registered setend emulation handler
<6>[    1.609169] .(6)[1:swapper/0][cpu_ntf] <00>ffffff8008097260 (insn_cpu_hotplug_notify)
<6>[    1.609229] .(6)[1:swapper/0][cpu_ntf] <00>ffffff80080fe980 (cpu_hotplug_handler)
<6>[    1.610043] .(6)[1:swapper/0][cpu_ntf] <00>ffffff8008109b18 (console_cpu_notify)
<6>[    1.610078] .(6)[1:swapper/0]registered taskstats version 1
<6>[    1.610124] cma: cma usage create success.<6>[    1.611688] .(6)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    1.611895] .(6)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    1.613185] .(6)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    1.613960] .(6)[1:swapper/0][cpu_ntf] <00>ffffff80089115b8 (cpufreq_cpu_callback)
<6>[    1.613973] .(6)[1:swapper/0][cpu_ntf] <00>ffffff800840db80 (_mt_cpufreq_cpu_CB)
<5>[    1.613977] .(6)[1:swapper/0][Power/PPM] DVFS table type = 0
<5>[    1.613979] .(6)[1:swapper/0][Power/PPM] DVFS table of cluster 0:
<5>[    1.613981] .(6)[1:swapper/0][Power/PPM] 0: 1508000 KHz
<5>[    1.613983] .(6)[1:swapper/0][Power/PPM] 1: 1482000 KHz
<5>[    1.613985] .(6)[1:swapper/0][Power/PPM] 2: 1430000 KHz
<5>[    1.613986] .(6)[1:swapper/0][Power/PPM] 3: 1404000 KHz
<5>[    1.613988] .(6)[1:swapper/0][Power/PPM] 4: 1365000 KHz
<5>[    1.613989] .(6)[1:swapper/0][Power/PPM] 5: 1300000 KHz
<5>[    1.613991] .(6)[1:swapper/0][Power/PPM] 6: 1235000 KHz
<5>[    1.613993] .(6)[1:swapper/0][Power/PPM] 7: 1183000 KHz
<5>[    1.613994] .(6)[1:swapper/0][Power/PPM] 8: 1105000 KHz
<5>[    1.613996] .(6)[1:swapper/0][Power/PPM] 9: 1001000 KHz
<5>[    1.613998] .(6)[1:swapper/0][Power/PPM] 10: 884000 KHz
<5>[    1.613999] .(6)[1:swapper/0][Power/PPM] 11: 793000 KHz
<5>[    1.614001] .(6)[1:swapper/0][Power/PPM] 12: 715000 KHz
<5>[    1.614003] .(6)[1:swapper/0][Power/PPM] 13: 624000 KHz
<5>[    1.614004] .(6)[1:swapper/0][Power/PPM] 14: 481000 KHz
<5>[    1.614006] .(6)[1:swapper/0][Power/PPM] 15: 338000 KHz
<5>[    1.614009] .(6)[1:swapper/0][Power/PPM] DVFS table type = 0
<5>[    1.614011] .(6)[1:swapper/0][Power/PPM] DVFS table of cluster 1:
<5>[    1.614012] .(6)[1:swapper/0][Power/PPM] 0: 2002000 KHz
<5>[    1.614014] .(6)[1:swapper/0][Power/PPM] 1: 1976000 KHz
<5>[    1.614015] .(6)[1:swapper/0][Power/PPM] 2: 1937000 KHz
<5>[    1.614017] .(6)[1:swapper/0][Power/PPM] 3: 1911000 KHz
<5>[    1.614019] .(6)[1:swapper/0][Power/PPM] 4: 1859000 KHz
<5>[    1.614020] .(6)[1:swapper/0][Power/PPM] 5: 1807000 KHz
<5>[    1.614022] .(6)[1:swapper/0][Power/PPM] 6: 1742000 KHz
<5>[    1.614024] .(6)[1:swapper/0][Power/PPM] 7: 1690000 KHz
<5>[    1.614025] .(6)[1:swapper/0][Power/PPM] 8: 1586000 KHz
<5>[    1.614027] .(6)[1:swapper/0][Power/PPM] 9: 1456000 KHz
<5>[    1.614029] .(6)[1:swapper/0][Power/PPM] 10: 1287000 KHz
<5>[    1.614030] .(6)[1:swapper/0][Power/PPM] 11: 1170000 KHz
<5>[    1.614032] .(6)[1:swapper/0][Power/PPM] 12: 1040000 KHz
<5>[    1.614033] .(6)[1:swapper/0][Power/PPM] 13: 910000 KHz
<5>[    1.614035] .(6)[1:swapper/0][Power/PPM] 14: 715000 KHz
<5>[    1.614037] .(6)[1:swapper/0][Power/PPM] 15: 520000 KHz
<4>[    1.614704] .(6)[1:swapper/0][Power/gpufreq] mt_gpufreq disabled by ptpod
<5>[    1.614852] .(6)[1:swapper/0][Power/PPM] (0x1)(-1)(0)(0-7)(10)(10)(4)(4) [(1)(10)(0)(-1)] (10)(10)(4)(4) [(1)(10)(0)(-1)] 
<4>[    1.617230] .(6)[1:swapper/0][Power/gpufreq] mt_gpufreq enabled by ptpod
<5>[    1.617241] .(6)[1:swapper/0][Power/PPM] (0x0)(-1)(0)(0-7)(15)(0)(4)(4) (15)(0)(4)(4) 
<6>[    1.619237] .(6)[1:swapper/0][HPS] hps_init
<6>[    1.619239] .(6)[1:swapper/0][HPS] hps_cpu_init
<6>[    1.619241] .(6)[1:swapper/0][HPS] [New algo.] hps_sys.cluster_num 2
<6>[    1.619246] .(6)[1:swapper/0][HPS] 0: func_id 3840, enabled 1
<6>[    1.619248] .(6)[1:swapper/0][HPS] 1: func_id 3841, enabled 1
<6>[    1.619250] .(6)[1:swapper/0][HPS] 2: func_id 3842, enabled 1
<6>[    1.619755] .(6)[1:swapper/0][HPS] hps_probe
<6>[    1.619773] .(6)[1:swapper/0][HPS] hps_core_init, setup_max_cpus ==> 8
<6>[    1.619844] .(6)[1:swapper/0][HPS] hps_task_start success, ptr: ffffffc05bfb6000, pid: 243
<6>[    1.619852] .(0)[243:hps_main][HPS] hps_ctxt.init_state: 1
<6>[    1.619857] .(0)[243:hps_main][HPS] hps_ctxt.state: 0
<6>[    1.619859] .(0)[243:hps_main][HPS] hps_ctxt.enabled: 1
<5>[    1.619859] .(6)[1:swapper/0][Power/PPM] @ppm_lcmoff_policy_init: register PPM_POLICY_LCM_OFF done!
<6>[    1.619863] .(0)[243:hps_main][HPS] hps_ctxt.suspend_enabled: 1
<6>[    1.619868] .(0)[243:hps_main][HPS] hps_ctxt.is_hmp: 0
<6>[    1.619870] .(0)[243:hps_main][HPS] hps_ctxt.little_cpu_id_min: 0
<6>[    1.619872] .(0)[243:hps_main][HPS] hps_ctxt.little_cpu_id_max: 3
<6>[    1.619874] .(0)[243:hps_main][HPS] hps_ctxt.big_cpu_id_min: 4
<6>[    1.619876] .(0)[243:hps_main][HPS] hps_ctxt.big_cpu_id_max: 7
<6>[    1.619880] .(0)[243:hps_main]CPU request is 0x0
<5>[    1.619903] .(6)[1:swapper/0][Power/PPM] COBRA init done!
<6>[    1.619910] .(6)[1:swapper/0][cpu_ntf] <00>ffffff800842c260 (ppm_cpu_hotplug_callback)
<5>[    1.619918] .(6)[1:swapper/0][Power/PPM] power data init done!
<6>[    1.620581] .(6)[1:swapper/0][SPM] spm_base = ffffff800d5fe000, sleep_reg_md_base = ffffff800d71c000, spm_irq_0 = 36
<6>[    1.620866] .(1)[6:kworker/u16:0][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<6>[    1.620937] .(6)[1:swapper/0][SPM] edge trigger irqs: 0, 25, 40, 149, 0, 44, 0
<6>[    1.620987] .(6)[1:swapper/0]#@# __spm_check_dram_type(538) __spmfw_idx 0x2
<6>[    1.622065] .(6)[1:swapper/0]#@# spm_module_init(663) is_ext_buck_exist() 0x0
<5>[    1.622173] .(6)[1:swapper/0][VcoreFS] spm_dvfsrc_register_init: dvfsrc_base = ffffff800d71e000
<5>[    1.622185] .(6)[1:swapper/0][VcoreFS] dram_issue: 0x0
<5>[    1.622197] .(6)[1:swapper/0][VcoreFS] curr_vcore_uv: 793750, curr_ddr_khz: 1866000
<5>[    1.622200] .(6)[1:swapper/0][VcoreFS] opp 0: vcore_uv: 793750, ddr_khz: 1866000
<5>[    1.622202] .(6)[1:swapper/0][VcoreFS] opp 1: vcore_uv: 793750, ddr_khz: 1600000
<5>[    1.622204] .(6)[1:swapper/0][VcoreFS] opp 2: vcore_uv: 725000, ddr_khz: 1600000
<5>[    1.622206] .(6)[1:swapper/0][VcoreFS] opp 3: vcore_uv: 725000, ddr_khz: 1200000
<5>[    1.622229] .(6)[1:swapper/0][VcoreFS] spm_vcorefs_pwarp_cmd: sspm
<5>[    1.622240] .(6)[1:swapper/0][VcoreFS] pcm_flag: 0x400
<5>[    1.623848] .(6)[1:swapper/0][VcoreFS] [spm_go_to_vcorefs] done
<6>[    1.623856] -(0)[230:dc_trim_thread][SPM] IRQ0 HANDLER SHOULD NOT BE EXECUTED (0x10)
<5>[    1.623871] .(6)[1:swapper/0][VcoreFS] opp: 3, vcore: 725000 <= 793750, fddr: 1200000 <= 1866000 [O][O]
<5>[    1.623886] -(6)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<5>[    1.623890] .(6)[1:swapper/0][VcoreFS] [vcorefs_late_init_dvfs] late_init_opp: 3, sw_opp: 3 (4)
<5>[    1.623893] .(6)[1:swapper/0][VcoreFS] [vcorefs_drv_init] done
<4>[    1.623896] .(6)[1:swapper/0][MMDVFS][pid=1]mmdvfs service is disabled for vcore calibration
<4>[    1.623898] .(6)[1:swapper/0][pid=1]mmdvfs_notify_prepare_action: 0
<6>[    1.629426] .(0)[4:kworker/0:0]mmc0: MAN_BKOPS_EN bit is not set
<3>[    1.629432] .(0)[4:kworker/0:0][CQ] card support CMDQ
<3>[    1.629434] .(0)[4:kworker/0:0][CQ] cmdq depth 16
<6>[    1.633794] .(0)[4:kworker/0:0][msdc]msdc0 -> !!! Set<200000KHz> Source<371999KHz> -> sclk<185999KHz> timing<9> mode<0> div<0> hs400_div_dis<0>
<6>[    1.634846] .(0)[4:kworker/0:0][AUTOK]eMMC HS200 Tune
<6>[    1.638679] .(0)[4:kworker/0:0][AUTOK]CMD 0 	 31 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOO
<5>[    1.641123] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<6>[    1.641241] .(0)[4:kworker/0:0][AUTOK]CMD 1 	 50 	 OXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXX
<6>[    1.641248] .(0)[4:kworker/0:0][AUTOK]Analysis Result: 1T = 60
<6>[    1.641289] .(0)[4:kworker/0:0][AUTOK]dev status 0x00000900
<5>[    1.641618] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<5>[    1.645571] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<5>[    1.646075] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.646138] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<6>[    1.646217] .(0)[4:kworker/0:0][AUTOK]DAT 0 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOO
<5>[    1.646578] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.646644] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.647081] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.647142] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.647597] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.647663] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.648103] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.648168] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.648606] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.648667] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.649106] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.649173] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.649612] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.649678] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.650118] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.650184] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<6>[    1.651017] .(0)[4:kworker/0:0][AUTOK]DAT 1 	 50 	 OOXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX
<6>[    1.651024] .(0)[4:kworker/0:0][AUTOK]Analysis Result: 1T = 60
<6>[    1.651065] .(0)[4:kworker/0:0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    1.651070] .(0)[4:kworker/0:0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.651074] .(0)[4:kworker/0:0][AUTOK]DAT [LATCH_CK:0 DLY1:6 DLY2:0]
<6>[    1.651079] .(0)[4:kworker/0:0][AUTOK]DS  [DLY1:0 DLY2:0 DLY3:0]
<6>[    1.651083] .(0)[4:kworker/0:0][AUTOK]CLK TX  [0]
<6>[    1.651086] .(0)[4:kworker/0:0][AUTOK]CMD TX  [0]
<6>[    1.651089] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.651094] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.651102] .(0)[4:kworker/0:0][AUTOK][HS200]======Cost:16 ms======
<6>[    1.652144] .(0)[4:kworker/0:0][msdc]msdc0 -> !!! Set<52000KHz> Source<371999KHz> -> sclk<46499KHz> timing<9> mode<0> div<2> hs400_div_dis<0>
<6>[    1.653113] .(0)[4:kworker/0:0][msdc]msdc0 -> !!! Set<200000KHz> Source<371999KHz> -> sclk<185999KHz> timing<10> mode<3> div<0> hs400_div_dis<1>
<6>[    1.654177] .(0)[4:kworker/0:0][AUTOK]eMMC HS400 Tune
<6>[    1.656821] .(0)[4:kworker/0:0][AUTOK]CMD 0 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.658219] .(0)[4:kworker/0:0][AUTOK]CMD 1 	 51 	 OOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX
<6>[    1.658223] .(0)[4:kworker/0:0][AUTOK]Analysis Result: 1T = 62
<6>[    1.658261] .(0)[4:kworker/0:0][AUTOK]device status 0x00000900
<6>[    1.658264] .(0)[4:kworker/0:0][AUTOK]CQ not enabled
<6>[    1.660027] .(0)[4:kworker/0:0][AUTOK]DLY1/2 0 	 24 	 XOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    1.660066] .(0)[4:kworker/0:0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    1.660069] .(0)[4:kworker/0:0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.660071] .(0)[4:kworker/0:0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    1.660074] .(0)[4:kworker/0:0][AUTOK]DS  [DLY1:12 DLY2:0 DLY3:20]
<6>[    1.660076] .(0)[4:kworker/0:0][AUTOK]CLK TX  [0]
<6>[    1.660078] .(0)[4:kworker/0:0][AUTOK]CMD TX  [0]
<6>[    1.660080] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.660083] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.660088] .(0)[4:kworker/0:0][AUTOK][HS400]======Cost:5 ms======
<5>[    1.660096] .(0)[4:kworker/0:0][msdc]msdc0:disable mmc retune
<6>[    1.660118] .(6)[1:swapper/0]emmc autok
<5>[    1.662891] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 0, dvfs_opp: 0, sw_opp: 3
<5>[    1.662906] .(1)[1:swapper/0][VcoreFS] opp: 0, vcore: 793750 <= 725000, fddr: 1866000 <= 1200000 [O][O]
<5>[    1.662923] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 0, vcore: 0x110000, emi: 0x200000, md: 0x0
<6>[    1.662966] .(0)[4:kworker/0:0]mmc0: new HS400 MMC card at address 0001
<6>[    1.663029] .(1)[1:swapper/0][AUTOK]eMMC HS400 Tune
<3>[    1.663223] .(0)[244:exe_cq][CQ] start cmdq thread
<6>[    1.663436] .(0)[4:kworker/0:0]mmcblk0: mmc0:0001 GD6BMB 29.1 GiB 
<6>[    1.665507] .(1)[1:swapper/0][AUTOK]CMD 0 	 37 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXOOOOOOOOOOOOOOO
<6>[    1.666916] .(1)[1:swapper/0][AUTOK]CMD 1 	 50 	 OOOXXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.666921] .(1)[1:swapper/0][AUTOK]Analysis Result: 1T = 68
<6>[    1.666960] .(1)[1:swapper/0][AUTOK]device status 0x00000900
<6>[    1.666963] .(1)[1:swapper/0][AUTOK]CQ not enabled
<6>[    1.667706] .(0)[4:kworker/0:0]mmcblk0boot0: mmc0:0001 GD6BMB partition 1 4.00 MiB
<6>[    1.667963] .(0)[4:kworker/0:0]mmcblk0boot1: mmc0:0001 GD6BMB partition 2 4.00 MiB
<6>[    1.668985] .(1)[1:swapper/0][AUTOK]DLY1/2 0 	 29 	 XOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    1.669024] .(1)[1:swapper/0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:8 DLY2:0]
<6>[    1.669027] .(1)[1:swapper/0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.669030] .(1)[1:swapper/0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    1.669032] .(1)[1:swapper/0][AUTOK]DS  [DLY1:15 DLY2:0 DLY3:20]
<6>[    1.669034] .(1)[1:swapper/0][AUTOK]CLK TX  [0]
<6>[    1.669036] .(1)[1:swapper/0][AUTOK]CMD TX  [0]
<6>[    1.669038] .(1)[1:swapper/0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.669041] .(1)[1:swapper/0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.669047] .(1)[1:swapper/0][AUTOK][HS400]======Cost:6 ms======
<5>[    1.669053] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 1, dvfs_opp: 1, sw_opp: 0
<5>[    1.669061] .(1)[1:swapper/0][VcoreFS] opp: 1, vcore: 793750 <= 793750, fddr: 1600000 <= 1866000 [O][O]
<5>[    1.669076] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 1, vcore: 0x110000, emi: 0x100000, md: 0x0
<6>[    1.669125] .(1)[1:swapper/0]skip duplicated vcore autok
<5>[    1.669127] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 2, dvfs_opp: 2, sw_opp: 1
<5>[    1.669135] .(1)[1:swapper/0][VcoreFS] opp: 2, vcore: 725000 <= 793750, fddr: 1600000 <= 1600000 [O][O]
<5>[    1.669149] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 2, vcore: 0x10000, emi: 0x100000, md: 0x0
<6>[    1.669177] .(1)[1:swapper/0][AUTOK]eMMC HS400 Tune
<6>[    1.671689] .(1)[1:swapper/0][AUTOK]CMD 0 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.672254] .(0)[4:kworker/0:0]mmcblk0rpmb: mmc0:0001 GD6BMB partition 3 4.00 MiB
<6>[    1.673104] .(1)[1:swapper/0][AUTOK]CMD 1 	 51 	 OOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX
<6>[    1.673110] .(1)[1:swapper/0][AUTOK]Analysis Result: 1T = 62
<6>[    1.673149] .(1)[1:swapper/0][AUTOK]device status 0x00000900
<6>[    1.673152] .(1)[1:swapper/0][AUTOK]CQ not enabled
<6>[    1.674914] .(1)[1:swapper/0][AUTOK]DLY1/2 0 	 24 	 XOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    1.674953] .(1)[1:swapper/0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    1.674956] .(1)[1:swapper/0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.674958] .(1)[1:swapper/0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    1.674960] .(1)[1:swapper/0][AUTOK]DS  [DLY1:12 DLY2:0 DLY3:20]
<6>[    1.674963] .(1)[1:swapper/0][AUTOK]CLK TX  [0]
<6>[    1.674965] .(1)[1:swapper/0][AUTOK]CMD TX  [0]
<6>[    1.674966] .(1)[1:swapper/0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.674969] .(1)[1:swapper/0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.674974] .(1)[1:swapper/0][AUTOK][HS400]======Cost:5 ms======
<5>[    1.674979] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 3, dvfs_opp: 3, sw_opp: 2
<5>[    1.674987] .(1)[1:swapper/0][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1600000 [O][O]
<5>[    1.675001] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 3, vcore: 0x10000, emi: 0x0, md: 0x0
<6>[    1.675049] .(1)[1:swapper/0]skip duplicated vcore autok
<6>[    1.675053] .(1)[1:swapper/0][AUTOK]CMD 0 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXOOOOOOOOOOOOOOO merge
<6>[    1.675058] .(1)[1:swapper/0][AUTOK]CMD 1 	 47 	 OOXXXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX merge
<6>[    1.675061] .(1)[1:swapper/0][AUTOK]cmd edge = 1 cmd dly = 37 max win = 46
<6>[    1.675076] .(1)[1:swapper/0][AUTOK]dat dly = 0
<6>[    1.675080] .(1)[1:swapper/0][AUTOK]DLY1/2 	 24 	 XOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX merge
<6>[    1.675089] .(1)[1:swapper/0][AUTOK]DS dly = 12
<6>[    1.675092] .(1)[1:swapper/0][AUTOK][merge]======Time Cost:0 ms======
<6>[    1.675095] .(1)[1:swapper/0][AUTOK]merge_value = 46
<6>[    1.675097] .(1)[1:swapper/0][AUTOK]merge_value = 23
<6>[    1.675134] .(1)[1:swapper/0][AUTOK]No need change para when dvfs
<5>[    1.675141] .(1)[1:swapper/0][VcoreFS] kicker: KIR_AUTOK_EMMC, opp: -1, dvfs_opp: 3, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[    1.675145] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_SYSFS, opp: 3, dvfs_opp: 3, sw_opp: 3
<5>[    1.675153] .(1)[1:swapper/0][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1200000 [O][O]
<5>[    1.675167] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<5>[    1.675181] .(1)[1:swapper/0][VcoreFS] EMMC autok done: Yes
<6>[    1.675184] .(1)[1:swapper/0]sd autok
<5>[    1.675186] .(1)[1:swapper/0][VcoreFS] SD autok done: Yes
<5>[    1.675188] .(1)[1:swapper/0][VcoreFS] SDIO autok done: Yes
<5>[    1.675191] .(1)[1:swapper/0][VcoreFS] [spm_vcorefs_init] DONE
<5>[    1.675195] .(1)[1:swapper/0][SPM] PWAKE_EN:1, PCMWDT_EN:1, BYPASS_SYSPWREQ:1
<3>[    1.675214] .(1)[1:swapper/0]BOOTPROF:      1675.213388:initcall: mt_spm_init    55.277538ms
<6>[    1.675416] .(1)[1:swapper/0][Power/dcm] weak function of dcm_pre_init
<6>[    1.675419] .(1)[1:swapper/0][Power/dcm] [dcm_set_default]type:0x00000b87, init_dcm_type=0xb87, INIT_DCM_TYPE_BY_K=0x0
<6>[    1.675424] .(1)[1:swapper/0][Power/dcm] [     ARMCORE_DCM 0x00000001] current state:1 (0)
<6>[    1.675427] .(1)[1:swapper/0][Power/dcm] [      MCUSYS_DCM 0x00000002] current state:1 (0)
<6>[    1.675430] .(1)[1:swapper/0][Power/dcm] [       INFRA_DCM 0x00000004] current state:1 (0)
<6>[    1.675434] .(1)[1:swapper/0][Power/dcm] [       STALL_DCM 0x00000080] current state:1 (0)
<6>[    1.675437] .(1)[1:swapper/0][Power/dcm] [    BIG_CORE_DCM 0x00000100] current state:1 (0)
<6>[    1.675440] .(1)[1:swapper/0][Power/dcm] [    GIC_SYNC_DCM 0x00000200] current state:1 (0)
<6>[    1.675443] .(1)[1:swapper/0][Power/dcm] [         RGU_DCM 0x00000800] current state:1 (0)
<6>[    1.675452] .(1)[1:swapper/0][Power/dcm] 
<6>[    1.675452] ******** dcm dump register *********
<6>[    1.675455] .(1)[1:swapper/0][Power/dcm] MP0_CPUCFG_MP0_RGU_DCM_CONFIG (0xffffff800d72c088): 0x00000001
<6>[    1.675458] .(1)[1:swapper/0][Power/dcm] MP1_CPUCFG_MP1_RGU_DCM_CONFIG (0xffffff800d72c288): 0x00000001
<6>[    1.675461] .(1)[1:swapper/0][Power/dcm] L2C_SRAM_CTRL                 (0xffffff800d72c648): 0x000c0081
<6>[    1.675464] .(1)[1:swapper/0][Power/dcm] CCI_CLK_CTRL                  (0xffffff800d72c660): 0x00000117
<6>[    1.675467] .(1)[1:swapper/0][Power/dcm] BUS_FABRIC_DCM_CTRL           (0xffffff800d72c668): 0x00cd1ff3
<6>[    1.675470] .(1)[1:swapper/0][Power/dcm] MCU_MISC_DCM_CTRL             (0xffffff800d72c66c): 0x00000003
<6>[    1.675473] .(1)[1:swapper/0][Power/dcm] CCI_ADB400_DCM_CONFIG         (0xffffff800d72c740): 0x00000067
<6>[    1.675477] .(1)[1:swapper/0][Power/dcm] SYNC_DCM_CONFIG               (0xffffff800d72c744): 0x02976643
<6>[    1.675480] .(1)[1:swapper/0][Power/dcm] SYNC_DCM_CLUSTER_CONFIG       (0xffffff800d72c74c): 0x063f8f8f
<6>[    1.675483] .(1)[1:swapper/0][Power/dcm] MP_GIC_RGU_SYNC_DCM           (0xffffff800d72c758): 0x00000003
<6>[    1.675486] .(1)[1:swapper/0][Power/dcm] MP0_PLL_DIVIDER_CFG           (0xffffff800d72c7a0): 0x03110aff
<6>[    1.675489] .(1)[1:swapper/0][Power/dcm] MP1_PLL_DIVIDER_CFG           (0xffffff800d72c7a4): 0x03110aff
<6>[    1.675492] .(1)[1:swapper/0][Power/dcm] BUS_PLL_DIVIDER_CFG           (0xffffff800d72c7c0): 0x03100aff
<6>[    1.675496] .(1)[1:swapper/0][Power/dcm] MCSIA_DCM_EN                  (0xffffff800d72cb60): 0xffff0000
<6>[    1.675499] .(1)[1:swapper/0][Power/dcm] INFRA_BUS_DCM_CTRL            (0xffffff800d72a070): 0x40ff0603
<6>[    1.675502] .(1)[1:swapper/0][Power/dcm] PERI_BUS_DCM_CTRL             (0xffffff800d72a074): 0x747f83e3
<6>[    1.675505] .(1)[1:swapper/0][Power/dcm] MEM_DCM_CTRL                  (0xffffff800d72a078): 0x09af07c0
<6>[    1.675508] .(1)[1:swapper/0][Power/dcm] P2P_RX_CLK_ON                 (0xffffff800d72a0a0): 0x00000000
<6>[    1.675511] .(1)[1:swapper/0][Power/dcm] EMI_CONM                      (0xffffff8009e18060): 0x000005ff
<6>[    1.675514] .(1)[1:swapper/0][Power/dcm] EMI_CONN                      (0xffffff8009e18068): 0x00000000
<6>[    1.675517] .(1)[1:swapper/0][Power/dcm] CHN0_EMI_CHN_EMI_CONB         (0xffffff8009e1c008): 0x00ff2048
<6>[    1.675520] .(1)[1:swapper/0][Power/dcm] CHN1_EMI_CHN_EMI_CONB         (0xffffff8009e1e008): 0x00ff2048
<6>[    1.675523] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP1_DRAMC_PD_CTRL  (0xffffff8009e28038): 0xc0000107
<6>[    1.675526] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP1_CLKAR          (0xffffff8009e2803c): 0x02040000
<6>[    1.675530] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP1_DRAMC_PD_CTRL  (0xffffff8009e2c038): 0xc0000007
<6>[    1.675533] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP1_CLKAR          (0xffffff8009e2c03c): 0x02040000
<6>[    1.675536] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_MISC_CG_CTRL0  (0xffffff8009e34284): 0x00000110
<6>[    1.675539] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_MISC_CG_CTRL2  (0xffffff8009e3428c): 0x806003be
<6>[    1.675542] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_MISC_CTRL3     (0xffffff8009e342a8): 0x11351135
<6>[    1.675545] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU1_B0_DQ8    (0xffffff8009e34c20): 0x00007fff
<6>[    1.675548] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU1_B1_DQ8    (0xffffff8009e34ca0): 0x00207fff
<6>[    1.675551] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU1_CA_CMD8   (0xffffff8009e34d20): 0x00007fff
<6>[    1.675554] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU2_B0_DQ8    (0xffffff8009e35120): 0x00007fff
<6>[    1.675558] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU2_B1_DQ8    (0xffffff8009e351a0): 0x00207fff
<6>[    1.675561] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU2_CA_CMD8   (0xffffff8009e35220): 0x00007fff
<6>[    1.675564] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU3_B0_DQ8    (0xffffff8009e35620): 0x00007fff
<6>[    1.675567] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU3_B1_DQ8    (0xffffff8009e356a0): 0x00207fff
<6>[    1.675570] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU3_CA_CMD8   (0xffffff8009e35720): 0x00007fff
<6>[    1.675573] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU4_B0_DQ8    (0xffffff8009e35b20): 0x00000000
<6>[    1.675576] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU4_B1_DQ8    (0xffffff8009e35ba0): 0x00000000
<6>[    1.675579] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU4_CA_CMD8   (0xffffff8009e35c20): 0x00000000
<6>[    1.675583] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_MISC_CG_CTRL0  (0xffffff8009e38284): 0x00100010
<6>[    1.675586] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_MISC_CG_CTRL2  (0xffffff8009e3828c): 0x806003be
<6>[    1.675589] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_MISC_CTRL3     (0xffffff8009e382a8): 0x11351135
<6>[    1.675592] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU1_B0_DQ8    (0xffffff8009e38c20): 0x00207fff
<6>[    1.675595] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU1_B1_DQ8    (0xffffff8009e38ca0): 0x00207fff
<6>[    1.675598] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU1_CA_CMD8   (0xffffff8009e38d20): 0x00207fff
<6>[    1.675601] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU2_B0_DQ8    (0xffffff8009e39120): 0x00207fff
<6>[    1.675604] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU2_B1_DQ8    (0xffffff8009e391a0): 0x00207fff
<6>[    1.675607] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU2_CA_CMD8   (0xffffff8009e39220): 0x00207fff
<6>[    1.675610] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU3_B0_DQ8    (0xffffff8009e39620): 0x00207fff
<6>[    1.675614] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU3_B1_DQ8    (0xffffff8009e396a0): 0x00207fff
<6>[    1.675617] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU3_CA_CMD8   (0xffffff8009e39720): 0x00207fff
<6>[    1.675620] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU4_B0_DQ8    (0xffffff8009e39b20): 0x00000000
<6>[    1.675623] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU4_B1_DQ8    (0xffffff8009e39ba0): 0x00000000
<6>[    1.675626] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU4_CA_CMD8   (0xffffff8009e39c20): 0x00000000
<6>[    1.675642] .(1)[1:swapper/0][cpu_ntf] <00>ffffff800843f9e8 (dcm_hotplug_nc)
<4>[    1.675661] .(1)[1:swapper/0]mcdi_init
<6>[    1.675665] .(1)[1:swapper/0][cpu_ntf] <00>ffffff8008443348 (mcdi_cpu_callback)
<6>[    1.675669] .(1)[1:swapper/0][cpu_ntf] <00>ffffff80084432d0 (mcdi_cpu_callback_leave_hotplug)
<3>[    1.675712] .(1)[1:swapper/0]set_mcdi_s_state = 5
<5>[    1.675765] .(1)[1:swapper/0][Power/cpufreq] is_lp3 = 1
<5>[    1.675794] .(2)[246:mmcqd/0]mmc0: set cmdq on
<6>[    1.675819] .(1)[1:swapper/0][cpu_ntf] <00>ffffff80084474d8 (cpu_hotplug_handler)
<6>[    1.675958] .(1)[1:swapper/0]sched_hint_init: failed to set sched_fifo
<3>[    1.676181] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: driver version: 3.9.2 20170630
<4>[    1.676196] .(1)[1:swapper/0]client->addr======48
<4>[    1.676198] .(1)[1:swapper/0]client->addr======48
<3>[    1.676316] .(0)[1:swapper/0][ALS/PS] stk3x1x_init_client: In
<3>[    1.676321] .(0)[1:swapper/0][ALS/PS] stk3x1x_write_sw_reset: In
<6>[    1.681161] .(0)[4:kworker/0:0] mmcblk0: p1 p2 p3 p4 p5 p6 p7 p8 p9 p10 p11 p12 p13 p14 p15 p16 p17 p18 p19 p20 p21 p22 p23 p24 p25 p26 p27 p28 p29 p30 p31 p32 p33 p34 p35 p36 p37 p38
<3>[    1.684300] .(0)[4:kworker/0:0]BOOTPROF:      1684.298926:probe: probe=mmc_bus_probe drv=mmcblk(ffffff80096ccf70)    21.158616ms
<6>[    1.688872] .(2)[228:kworker/2:2][msdc]msdc2 -> !!! Set<300KHz> Source<185999KHz> -> sclk<299KHz> timing<0> mode<0> div<155> hs400_div_dis<0>
<3>[    1.696890] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: PID=0x15, VID=0xca
<3>[    1.704741] .(1)[1:swapper/0][ALS/PS] stk3x1x_otp_read_byte_data: 0x25=0x0
<5>[    1.705241] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    1.705897] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<3>[    1.706050] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_wv_r_bd_with_co = 0x0
<3>[    1.706054] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_1x_r_bd_with_co = 0x0
<3>[    1.706057] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_19_r_bc = 0x0
<3>[    1.709302] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: state_val=0x0, psctrl_val=0x31, alsctrl_val=0x39, ledctrl_val=0xff, wait_val=0xf, int_val=0x1
<3>[    1.709308] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe() OK!
<3>[    1.709310] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: OK
<3>[    1.709326] .(1)[1:swapper/0]BOOTPROF:      1709.326003:probe: probe=i2c_device_probe drv=stk3x1x(ffffff800965ac98)    33.141539ms
<3>[    1.709446] .(1)[1:swapper/0]BOOTPROF:      1709.445926:initcall: alsps_init    33.437539ms
<4>[    1.709699] .(3)[1:swapper/0][Gsensor] gsensor_local_init
<4>[    1.709778] .(3)[1:swapper/0][Gsensor] bma2xx_i2c_probe
<4>[    1.709786] .(3)[1:swapper/0][Gsensor] bma2xx_init_client
<5>[    1.710167] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<5>[    1.710824] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.710901] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<6>[    1.710955] .(3)[1:swapper/0]i2c i2c-1: addr: 18, transfer ACK error
<6>[    1.710961] .(3)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.710964] .(3)[1:swapper/0]I2C structure:
<3>[    1.710964] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=3,Total_len=1
<3>[    1.710964] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.710964] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.710971] .(3)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.710980] .(3)[1:swapper/0]I2C register:
<6>[    1.710980] [I2C]SLAVE_ADDR=30,INTR_MASK=0,INTR_STAT=0,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.710980] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.710980] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.710987] .(3)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.710987] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.710987] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.710987] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.710987] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.710997] .(3)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.710997] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.710997] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.710997] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.710997] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.711003] .(3)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.711007] .(3)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.711010] .(3)[1:swapper/0]i2c i2c-1: [00] [    1.710951] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.711016] .(3)[1:swapper/0]i2c i2c-1: [01] [    1.708932] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711022] .(3)[1:swapper/0]i2c i2c-1: [02] [    1.708826] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711028] .(3)[1:swapper/0]i2c i2c-1: [03] [    1.708719] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<3>[    1.711033] .(3)[1:swapper/0]i2c i2c-1: [04] [    1.708606] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711039] .(3)[1:swapper/0]i2c i2c-1: [05] [    1.708499] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711044] .(3)[1:swapper/0]i2c i2c-1: [06] [    1.707295] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711050] .(3)[1:swapper/0]i2c i2c-1: [07] [    1.707187] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711055] .(3)[1:swapper/0]i2c i2c-1: [08] [    1.706165] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711061] .(3)[1:swapper/0]i2c i2c-1: [09] [    1.706047] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<4>[    1.711078] .(3)[1:swapper/0][Gsensor] bma_i2c_read_block 572 : i2c_transfer error: (0 ffffffc04015bab8 1) -121
<4>[    1.711083] [Gsensor] BMA2XX_CheckDeviceID 1139 : BMA2XX_CheckDeviceID -1 failt!
<4>[    1.711083]  .(3)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2680 : bma2xx_device init cilent fail time: 0
<4>[    1.711089] .(3)[1:swapper/0][Gsensor] bma2xx_init_client
<6>[    1.711144] .(3)[1:swapper/0]i2c i2c-1: addr: 18, transfer ACK error
<6>[    1.711147] .(3)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.711150] .(3)[1:swapper/0]I2C structure:
<3>[    1.711150] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=2,Total_len=1
<3>[    1.711150] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.711150] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.711155] .(3)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.711164] .(3)[1:swapper/0]I2C register:
<6>[    1.711164] [I2C]SLAVE_ADDR=30,INTR_MASK=0,INTR_STAT=1,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.711164] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.711164] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.711171] .(3)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.711171] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.711171] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.711171] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.711171] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.711188] .(3)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.711188] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.711188] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.711188] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.711188] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.711195] .(3)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.711198] .(3)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.711201] .(3)[1:swapper/0]i2c i2c-1: [00] [    1.711142] SLAVE_ADDR=30,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.711207] .(3)[1:swapper/0]i2c i2c-1: [01] [    1.710951] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.711212] .(3)[1:swapper/0]i2c i2c-1: [02] [    1.708932] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711218] .(3)[1:swapper/0]i2c i2c-1: [03] [    1.708826] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711223] .(3)[1:swapper/0]i2c i2c-1: [04] [    1.708719] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<3>[    1.711229] .(3)[1:swapper/0]i2c i2c-1: [05] [    1.708606] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711235] .(3)[1:swapper/0]i2c i2c-1: [06] [    1.708499] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711240] .(3)[1:swapper/0]i2c i2c-1: [07] [    1.707295] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711246] .(3)[1:swapper/0]i2c i2c-1: [08] [    1.707187] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.711251] .(3)[1:swapper/0]i2c i2c-1: [09] [    1.706165] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<4>[    1.711268] .(3)[1:swapper/0][Gsensor] bma_i2c_read_block 572 : i2c_transfer error: (0 ffffffc04015bab8 1) -121
<4>[    1.711272] [Gsensor] BMA2XX_CheckDeviceID 1139 : BMA2XX_CheckDeviceID -1 failt!
<4>[    1.711272]  .(3)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2680 : bma2xx_device init cilent fail time: 1
<4>[    1.711276] .(3)[1:swapper/0][Gsensor] bma2xx_init_client
<5>[    1.711474] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.711551] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<6>[    1.712037] .(3)[1:swapper/0]i2c i2c-1: addr: 18, transfer ACK error
<6>[    1.712041] .(3)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.712043] .(3)[1:swapper/0]I2C structure:
<3>[    1.712043] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=3,Total_len=1
<3>[    1.712043] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.712043] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.712049] .(3)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.712058] .(3)[1:swapper/0]I2C register:
<6>[    1.712058] [I2C]SLAVE_ADDR=30,INTR_MASK=0,INTR_STAT=0,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.712058] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.712058] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.712064] .(3)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.712064] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.712064] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.712064] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.712064] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.712073] .(3)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.712073] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.712073] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.712073] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.712073] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.712079] .(3)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.712082] .(3)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.712085] .(3)[1:swapper/0]i2c i2c-1: [00] [    1.712035] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.712091] .(3)[1:swapper/0]i2c i2c-1: [01] [    1.711142] SLAVE_ADDR=30,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.712096] .(3)[1:swapper/0]i2c i2c-1: [02] [    1.710951] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.712102] .(3)[1:swapper/0]i2c i2c-1: [03] [    1.708932] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.712107] .(3)[1:swapper/0]i2c i2c-1: [04] [    1.708826] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.712113] .(3)[1:swapper/0]i2c i2c-1: [05] [    1.708719] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<3>[    1.712118] .(3)[1:swapper/0]i2c i2c-1: [06] [    1.708606] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.712124] .(3)[1:swapper/0]i2c i2c-1: [07] [    1.708499] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<5>[    1.712124] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<3>[    1.712129] .(3)[1:swapper/0]i2c i2c-1: [08] [    1.707295] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.712136] .(3)[1:swapper/0]i2c i2c-1: [09] [    1.707187] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<4>[    1.712153] .(3)[1:swapper/0][Gsensor] bma_i2c_read_block 572 : i2c_transfer error: (0 ffffffc04015bab8 1) -121
<4>[    1.712156] [Gsensor] BMA2XX_CheckDeviceID 1139 : BMA2XX_CheckDeviceID -1 failt!
<4>[    1.712156]  .(3)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2680 : bma2xx_device init cilent fail time: 2
<4>[    1.712161] .(3)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2771 : bma2xx_i2c_probe: err = -1
<4>[    1.712173] .(3)[1:swapper/0]BMA2XX: probe of 1-0018 failed with error -1
<6>[    1.712211] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<6>[    1.712390] .(3)[1:swapper/0]input: low_g as /devices/virtual/input/input4
<4>[    1.712454] .(3)[1:swapper/0][hall]kpd_low_g_dev register : success!!
<3>[    1.712590] .(3)[1:swapper/0][Gsensor] bmi160_acc_i2c_probe: is begin.
<5>[    1.712784] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.712862] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.713448] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.713531] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.714104] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.714181] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.714754] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.714831] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.715404] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.715481] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.716057] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.716141] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<4>[    1.729589] -(0)[230:dc_trim_thread]mt6356_get_auxadc_value: 24 callbacks suppressed
<3>[    1.744667] .(3)[1:swapper/0][Gsensor] check chip id d3 successfully.
<6>[    1.752911] .(2)[228:kworker/2:2][msdc]msdc2 -> !!! Set<260KHz> Source<185999KHz> -> sclk<259KHz> timing<0> mode<0> div<179> hs400_div_dis<0>
<5>[    1.769320] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<3>[    1.769331] .(1)[6:kworker/u16:0][ALS/PS] stk_tune_zero_get_ps_data: ps #0=39
<5>[    1.770070] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<5>[    1.774524] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<5>[    1.775275] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.775360] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.776022] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.776111] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.776769] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.776861] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.777519] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.777612] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.778274] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.778363] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<3>[    1.778675] .(3)[1:swapper/0][Gsensor] set bandwidth = 9 ok.
<5>[    1.779021] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.779113] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.779771] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.779864] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.780526] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.780614] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<5>[    1.781276] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.781365] .(2)[228:kworker/2:2][msdc]msdc2 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/2:2><0xe4>
<3>[    1.798683] .(3)[1:swapper/0][Gsensor] [bmi160_acc_set_osr4] acc_bmp = 0, acc_us = 0 ok.
<3>[    1.818675] .(3)[1:swapper/0][Gsensor] bmi160_acc_set_data_range(0x5)
<3>[    1.824661] .(3)[1:swapper/0][Gsensor] bmi160_acc_set_resolution: 8192
<3>[    1.830176] .(1)[6:kworker/u16:0][ALS/PS] stk_tune_zero_get_ps_data: ps #1=40
<3>[    1.850673] .(3)[1:swapper/0][Gsensor] bmi160 set interrupt enable = 0 ok.
<3>[    1.886677] .(3)[1:swapper/0][Gsensor] set power mode enable = 0 ok!
<3>[    1.886681] .(3)[1:swapper/0][Gsensor] bmi160 acc init OK.
<3>[    1.890029] .(1)[6:kworker/u16:0][ALS/PS] stk_tune_zero_get_ps_data: ps #2=40
<5>[    1.892672] .(1)[6:kworker/u16:0][MUSB]do_register_otg_work 75: register OTG <ffffffc05c340018> ok
<3>[    1.952076] .(1)[6:kworker/u16:0][ALS/PS] stk_tune_zero_get_ps_data: ps #3=40
<4>[    1.988663] .(3)[1:swapper/0]0x51,reg_data[0]=8
<4>[    1.996667] .(3)[1:swapper/0]0x5c,reg_data[0]=129
<4>[    2.004664] .(3)[1:swapper/0]0x5a,reg_data[0]=7
<3>[    2.009337] .(1)[6:kworker/u16:0][ALS/PS] stk_tune_zero_get_ps_data: ps #4=40
<4>[    2.012663] .(3)[1:swapper/0]0x5b,reg_data[0]=48
<3>[    2.014650] .(1)[6:kworker/u16:0][ALS/PS] stk_ps_tune_zero_final: set HT=64,LT=54
<4>[    2.020662] .(3)[1:swapper/0]0x53,reg_data[0]=9
<4>[    2.028658] .(3)[1:swapper/0]0x55,reg_data[0]=1
<3>[    2.028661] .(3)[1:swapper/0][Gsensor] bmi160_acc_i2c_probe: is ok.
<3>[    2.028680] .(3)[1:swapper/0]BOOTPROF:      2028.680081:probe: probe=i2c_device_probe drv=bmi160_acc(ffffff800965bdf0)   316.397077ms
<3>[    2.028801] .(3)[1:swapper/0][Gsensor] bmi160 acc local init.
<3>[    2.028812] .(3)[1:swapper/0]BOOTPROF:      2028.812004:initcall: acc_init   319.307001ms
<4>[    2.029078] .(3)[1:swapper/0]guozhiliang BMG160 addr=68
<4>[    2.031007] .(3)[1:swapper/0]unknown gyroscope
<4>[    2.031011] .(3)[1:swapper/0]get chip type failed, err = -1
<4>[    2.031014] .(3)[1:swapper/0]err = -1
<4>[    2.031026] .(3)[1:swapper/0]bmg160: probe of 1-0068 failed with error -1
<6>[    2.174560] .(0)[230:dc_trim_thread][accdet_init]start --->
<6>[    2.177609] .(0)[230:dc_trim_thread][accdet_init_once]-0 ACCDET_INIT0_ONCE done--->
<6>[    2.177645] .(0)[230:dc_trim_thread][accdet_init_once] ACCDET_INIT1_ONCE done--->
<6>[    2.177651] .(0)[230:dc_trim_thread][accdet_efuse]efuse=0xf1fc,adc_offset=-2 mv
<3>[    2.188861] .(3)[1:swapper/0]BOOTPROF:      2188.861158:probe: probe=i2c_device_probe drv=bmi160_gyro(ffffff800965c280)   157.750462ms
<3>[    2.188930] .(3)[1:swapper/0]BOOTPROF:      2188.929927:initcall: gyro_init   160.104615ms
<4>[    2.189126] .(3)[1:swapper/0]<<-MMC3630X INFO->> mmc3630x_i2c_probe: enter probe,driver version=V80.97.01.10
<4>[    2.189126] 
<4>[    2.189133] .(3)[1:swapper/0]<<-MMC3630X INFO->> direction =4
<4>[    2.189133] 
<4>[    2.205907] .(3)[1:swapper/0]<<-MMC3630X INFO->> [mmc3630x] product_id[0] = 10
<4>[    2.205907] 
<4>[    2.212205] .(3)[1:swapper/0]<<-MMC3630X INFO->> memsic otp matrix = 1000 994 1244
<4>[    2.212205] 
<4>[    2.229378] .(3)[1:swapper/0]<<-MMC3630X INFO->> mmc3630X IIC probe successful !
<3>[    2.229389] .(3)[1:swapper/0]BOOTPROF:      2229.389004:probe: probe=i2c_device_probe drv=mmc3630x(ffffff800965c7b8)    40.260616ms
<3>[    2.229452] .(3)[1:swapper/0]BOOTPROF:      2229.452620:initcall: mag_init    40.509692ms
<5>[    2.229469] -(3)[1:swapper/0]mtk_rtc_hal_common: RTC_IRQ_EN = 0xc, RTC_PDN1 = 0x200
<5>[    2.229473] -(3)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[12] = {a38, 1, 6}
<5>[    2.229480] .(3)[1:swapper/0]mtk_rtc_common: There is no Crystal
<5>[    2.229671] .(3)[257:kworker/3:1][MUSB]usb20_check_vbus_on 136: vbus_on<0>
<4>[    2.229695] .(3)[257:kworker/3:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<3>[    2.229703] .(3)[257:kworker/3:1]do_charger_detect charger IN
<3>[    2.229744] .(3)[1:swapper/0]memory-lowpower: memory-lowpower cma is not inited
<3>[    2.231396] .(3)[1:swapper/0][DRAMC] calibration time optimized
<6>[    2.232642] .(3)[1:swapper/0]flashlights_mt6370: mt6370_parse_dt: Parse no dt, node.
<6>[    2.233587] .(3)[1:swapper/0]flashlight: flashlight_dev_register: flashlights-mt6370 0 0 0
<6>[    2.233593] .(3)[1:swapper/0]flashlight: flashlight_dev_register: flashlights-mt6370 0 1 0
<5>[    2.234225] .(3)[1:swapper/0]log store:sram_dram_buff addr 0x7ff80000, size 0x40000.
<1>[    2.234362] .(3)[1:swapper/0][PHY layout]log_store_mem   :   0x7ff80000 - 0x7ffbffff (0x40000)
<5>[    2.234368] .(3)[1:swapper/0]log_store: log buff 0xffffff800d780000, sig 0xcdab3412
<5>[    2.234371] .(3)[1:swapper/0]buff_size 0x40000
<5>[    2.234373] .(3)[1:swapper/0]pl off 0x20, sz 0x31a5
<5>[    2.234376] .(3)[1:swapper/0]lk off 0x31c5, sz 0x26fbb
<5>[    2.234378] .(3)[1:swapper/0]flag p 0xc, l 0xc
<3>[    2.234392] .(3)[1:swapper/0]memory-ssvp: [INIT FAIL]: cma is not inited
<3>[    2.234401] .(3)[1:swapper/0]memory-ssvp: SSVP sanity fail
<2>[    2.235706] .(3)[1:swapper/0][SOC FBC]Start to init FBC driver
<2>[    2.236858] .(3)[1:swapper/0][SOC FBC]init FBC driver done
<4>[    2.238137] .(3)[1:swapper/0][Thermal/TC/bcct]mtkcooler_bcct_late_init
<4>[    2.238744] .(3)[1:swapper/0][Thermal/TC/bcct]mtkcooler_bcct_pdrv_probe
<6>[    2.238901] .(0)[6:kworker/u16:0]mtk-tpd: MediaTek touch panel driver init
<6>[    2.239877] .(0)[6:kworker/u16:0]mtk-tpd: enter tpd_probe, 523
<3>[    2.239940] .(0)[6:kworker/u16:0]Lomen 0
<6>[    2.239943] .(0)[6:kworker/u16:0]mtk-tpd: [tpd -1] mt_tpd_pinctrl+++++++++++++++++
<3>[    2.239945] .(0)[6:kworker/u16:0]Lomen 0.1
<3>[    2.240029] .(0)[6:kworker/u16:0]Lomen 0.2
<3>[    2.240035] .(0)[6:kworker/u16:0]mtk-tpd touch: fwq Cannot find touch pinctrl default -19!
<6>[    2.240041] .(0)[6:kworker/u16:0]mtk-tpd: [tpd-1] mt_tpd_pinctrl----------
<3>[    2.240043] .(0)[6:kworker/u16:0]Lomen 1
<4>[    2.240056] .(0)[6:kworker/u16:0]<<GTP-INF>>[tpd_local_init:974]  Device Tree get regulator!
<4>[    2.240385] .(0)[6:kworker/u16:0] tpd_i2c_probe start.
<4>[    2.240417] .(0)[6:kworker/u16:0]glove_mode->0 
<4>[    2.240534] .(1)[6:kworker/u16:0]<<GTP-INF>>[tpd_i2c_probe:662] tpd_i2c_probe start.wait_event_interruptible
<6>[    2.240535] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 0
<6>[    2.240565] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<6>[    2.241233] .(3)[1:swapper/0]mt-rtc mt-rtc: setting system clock to 2020-01-10 08:57:10 UTC (1578646630)
<4>[    2.252677] .(0)[264:tpd_probe]<<GTP-INF>>[gt1x_reset_guitar:908] GTP RESET!
<6>[    2.252682] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 0
<6>[    2.252698] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<6>[    2.260663] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 1
<6>[    2.280668] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<6>[    2.336669] .(0)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_as_int
<4>[    2.337060] .(1)[6:kworker/u16:0]<<GTP-INF>>[tpd_i2c_probe:664] tpd_i2c_probe end.wait_event_interruptible
<4>[    2.349430] .(1)[6:kworker/u16:0]<<GTP-INF>>[gt1x_read_version:983] IC VERSION:GT5688_000204(Patch)_0100(Mask)_00(SensorID)
<4>[    2.349438] .(1)[6:kworker/u16:0] tpd_i2c_probe end.
<3>[    2.349453] .(1)[6:kworker/u16:0]BOOTPROF:      2349.453389:probe: probe=i2c_device_probe drv=gt1x(ffffff80096be420)   109.064539ms
<4>[    2.349599] .(1)[6:kworker/u16:0]<<GTP-INF>>[tpd_local_init:1033] end tpd_local_init, 1033
<4>[    2.349599] 
<6>[    2.349604] .(1)[6:kworker/u16:0]mtk-tpd: [mtk-tpd]tpd_probe, tpd_driver_name=gt1x
<6>[    2.349731] .(1)[6:kworker/u16:0]mtk-tpd: Cap touch panel driver
<6>[    2.349856] .(1)[6:kworker/u16:0]input: mtk-tpd as /devices/virtual/input/input5
<6>[    2.350020] .(1)[6:kworker/u16:0]input: tp-kpd as /devices/virtual/input/input6
<3>[    2.350084] .(1)[6:kworker/u16:0]BOOTPROF:      2350.084543:probe: probe=platform_drv_probe drv=mtk-tpd(ffffff80096bdc50)   110.200616ms
<5>[    2.350170] .(3)[1:swapper/0]mtk_charger_probe: starts
<5>[    2.350176] .(3)[1:swapper/0]mtk_charger_parse_dt: starts
<5>[    2.350182] .(3)[1:swapper/0]found SwitchCharging
<5>[    2.350189] .(3)[1:swapper/0]Found primary charger [mt6370_chg]
<5>[    2.350297] .(3)[1:swapper/0]use default PE_ICHG_LEAVE_THRESHOLD:1000
<5>[    2.350309] .(3)[1:swapper/0]use default pe40_single_charger_input_current:3000
<5>[    2.350313] .(3)[1:swapper/0]use default pe40_single_charger_current:3000
<5>[    2.350317] .(3)[1:swapper/0]use default pe40_dual_charger_input_current:3000
<5>[    2.350321] .(3)[1:swapper/0]use default pe40_dual_charger_chg1_current:2000
<5>[    2.350325] .(3)[1:swapper/0]use default pe40_dual_charger_chg2_current:2000
<5>[    2.350330] .(3)[1:swapper/0]use default pe40_stop_battery_soc:2000
<5>[    2.350353] .(3)[1:swapper/0]use default MAX_CHARGING_TIME:43200
<5>[    2.350356] .(3)[1:swapper/0]algorithm name:SwitchCharging
<5>[    2.350584] .(0)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    2.350604] .(0)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<3>[    2.350777] .(3)[1:swapper/0]BOOTPROF:      2350.777466:initcall: mtk_charger_init   109.520385ms
<6>[    2.350962] .(2)[233:kworker/u16:5][wdk] bind thread 268 to cpu 0
<6>[    2.355042] .(2)[233:kworker/u16:5][wdk] bind thread 269 to cpu 1
<6>[    2.355176] .(2)[233:kworker/u16:5][wdk] bind thread 270 to cpu 2
<6>[    2.355241] .(2)[233:kworker/u16:5][wdk] bind thread 271 to cpu 3
<6>[    2.355303] .(2)[233:kworker/u16:5][wdk] bind thread 272 to cpu 4
<6>[    2.355358] .(2)[233:kworker/u16:5][wdk] bind thread 273 to cpu 5
<6>[    2.355414] .(2)[233:kworker/u16:5][wdk] bind thread 274 to cpu 6
<6>[    2.355473] .(2)[233:kworker/u16:5][wdk] bind thread 275 to cpu 7
<6>[    2.355478] .(2)[233:kworker/u16:5][wdk] WDT start kicker done CPU_NR=8
<6>[    2.355515] .(2)[233:kworker/u16:5][cpu_ntf] <00>ffffff80088f3818 (wk_cpu_callback)
<6>[    2.355525] .(2)[233:kworker/u16:5][wdk]init_wk done late_initcall cpus_kick_bit=0xff -----
<6>[    2.360409] .(3)[1:swapper/0]schedtune: init normalization constants...
<6>[    2.360422] .(3)[1:swapper/0]schedtune: CLUSTER[0-3]      min_pwr:     0 max_pwr: 56129
<6>[    2.360427] .(3)[1:swapper/0]schedtune: CPU[0]            min_pwr:     0 max_pwr: 151946
<6>[    2.360430] .(3)[1:swapper/0]schedtune: CPU[1]            min_pwr:     0 max_pwr: 151946
<6>[    2.360433] .(3)[1:swapper/0]schedtune: CPU[2]            min_pwr:     0 max_pwr: 151946
<6>[    2.360436] .(3)[1:swapper/0]schedtune: CPU[3]            min_pwr:     0 max_pwr: 151946
<6>[    2.360440] .(3)[1:swapper/0]schedtune: CLUSTER[4-7]      min_pwr:     0 max_pwr: 197933
<6>[    2.360443] .(3)[1:swapper/0]schedtune: CPU[4]            min_pwr:     0 max_pwr: 388889
<6>[    2.360446] .(3)[1:swapper/0]schedtune: CPU[5]            min_pwr:     0 max_pwr: 388889
<6>[    2.360450] .(3)[1:swapper/0]schedtune: CPU[6]            min_pwr:     0 max_pwr: 388889
<6>[    2.360453] .(3)[1:swapper/0]schedtune: CPU[7]            min_pwr:     0 max_pwr: 349038
<6>[    2.360458] .(3)[1:swapper/0]schedtune: SYSTEM            min_pwr:     0 max_pwr: 2377551
<6>[    2.360461] .(3)[1:swapper/0]schedtune: using normalization constants mul: 3281904246 sh1: 1 sh2: 21
<6>[    2.360464] .(3)[1:swapper/0]schedtune: verify normalization constants...
<6>[    2.360466] .(3)[1:swapper/0]schedtune: max_pwr/2^0: 2377551 => norm_pwr:  1024
<6>[    2.360469] .(3)[1:swapper/0]schedtune: max_pwr/2^1: 1188775 => norm_pwr:   511
<6>[    2.360472] .(3)[1:swapper/0]schedtune: max_pwr/2^2: 594387 => norm_pwr:   255
<6>[    2.360474] .(3)[1:swapper/0]schedtune: max_pwr/2^3: 297193 => norm_pwr:   127
<6>[    2.360477] .(3)[1:swapper/0]schedtune: max_pwr/2^4: 148596 => norm_pwr:    63
<6>[    2.360479] .(3)[1:swapper/0]schedtune: max_pwr/2^5: 74298 => norm_pwr:    31
<6>[    2.360483] .(3)[1:swapper/0]schedtune: configured to support 5 boost groups
<6>[    2.360511] .(3)[1:swapper/0]vs1: disabling
<3>[    2.360515] .(3)[1:swapper/0]vs1: couldn't disable: -1
<6>[    2.360524] .(3)[1:swapper/0]vmodem: disabling
<3>[    2.360527] .(3)[1:swapper/0]vmodem: couldn't disable: -1
<6>[    2.360535] .(3)[1:swapper/0]vcore: disabling
<3>[    2.360539] .(3)[1:swapper/0]vcore: couldn't disable: -1
<6>[    2.360547] .(3)[1:swapper/0]vproc: disabling
<3>[    2.360549] .(3)[1:swapper/0]vproc: couldn't disable: -1
<6>[    2.360558] .(3)[1:swapper/0]vs2: disabling
<3>[    2.360560] .(3)[1:swapper/0]vs2: couldn't disable: -1
<6>[    2.360595] .(3)[1:swapper/0]vcamio: disabling
<3>[    2.360598] .(3)[1:swapper/0]vcamio: couldn't disable: -1
<6>[    2.360630] .(3)[1:swapper/0]vaux18: disabling
<3>[    2.360633] .(3)[1:swapper/0]vaux18: couldn't disable: -1
<6>[    2.360692] .(3)[1:swapper/0]vsram_others: disabling
<3>[    2.360697] .(3)[1:swapper/0]vsram_others: couldn't disable: -1
<6>[    2.360714] .(3)[1:swapper/0]vxo22: disabling
<3>[    2.360717] .(3)[1:swapper/0]vxo22: couldn't disable: -1
<6>[    2.360735] .(3)[1:swapper/0]vio28: disabling
<3>[    2.360739] .(3)[1:swapper/0]vio28: couldn't disable: -1
<6>[    2.360750] .(3)[1:swapper/0]vio18: disabling
<3>[    2.360753] .(3)[1:swapper/0]vio18: couldn't disable: -1
<6>[    2.360781] .(3)[1:swapper/0]vbif28: disabling
<3>[    2.360783] .(3)[1:swapper/0]vbif28: couldn't disable: -1
<6>[    2.360798] .(3)[1:swapper/0]vdram: disabling
<3>[    2.360801] .(3)[1:swapper/0]vdram: couldn't disable: -1
<6>[    2.360815] .(3)[1:swapper/0]vaud28: disabling
<3>[    2.360818] .(3)[1:swapper/0]vaud28: couldn't disable: -1
<4>[    2.360901] .(0)[264:tpd_probe]<<GTP-ERR>>[gt1x_init:2525] Check subsystem not pass[0xAA].
<6>[    2.362188] .(3)[1:swapper/0]rt_pd_manager_probe (1.0.5_MTK)
<6>[    2.362193] .(3)[1:swapper/0]rt_pd_manager_probe KPOC(0)
<6>[    2.362210] .(3)[1:swapper/0]rt_pd_manager_probe OK!!
<6>[    2.362353] .(3)[1:swapper/0]__tcpc_class_complete_work = type_c_port0
<6>[    2.362381] .(3)[1:swapper/0]ALSA device list:
<6>[    2.362384] .(3)[1:swapper/0]  #0: mt-snd-card
<4>[    2.372925] .(0)[264:tpd_probe]<<GTP-INF>>[gt1x_get_chip_type:1027] Chip Type: GT2X
<4>[    2.390558] .(0)[264:tpd_probe]<<GTP-INF>>[gt1x_read_version:983] IC VERSION:GT5688_000204(Patch)_0100(Mask)_00(SensorID)
<4>[    2.390565] .(0)[264:tpd_probe]<<GTP-INF>>[gt1x_init_panel:654] Config group0 used, length:239
<4>[    2.390569] .(0)[264:tpd_probe]<<GTP-INF>>[gt1x_init_panel:711] X_MAX=720,Y_MAX=1280,TRIGGER=0x01,WAKEUP_LEVEL=1
<6>[    2.403723] .(0)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    2.403729] .(0)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    2.404536] .(0)[266:charger_thread]=====FG===== AC   = 98
<4>[    2.405325] .(0)[266:charger_thread]=====FG===== AC   = 98
<3>[    2.432784] .(3)[257:kworker/3:1]CDP, block
<4>[    2.512717] .(0)[266:charger_thread]lifetime: data[0]=df 
<4>[    2.512733] .(0)[266:charger_thread]lifetime: data[1]=ff 
<4>[    2.512744] .(0)[266:charger_thread]lifetime: data[2]=40 
<4>[    2.512753] .(0)[266:charger_thread]lifetime: data[3]=11 
<4>[    2.512762] .(0)[266:charger_thread]lifetime: data[4]=45 
<4>[    2.512771] .(0)[266:charger_thread]lifetime: data[5]=a 
<4>[    2.512780] .(0)[266:charger_thread]lifetime: data[6]=fc 
<4>[    2.512790] .(0)[266:charger_thread]lifetime: data[7]=8 
<4>[    2.512799] .(0)[266:charger_thread]lifetime: data[8]=68 
<4>[    2.512808] .(0)[266:charger_thread]lifetime: data[9]=f7 
<4>[    2.512817] .(0)[266:charger_thread]lifetime: data[10]=18 
<4>[    2.512826] .(0)[266:charger_thread]lifetime: data[11]=0 
<4>[    2.514458] .(0)[266:charger_thread]=====FG-MTK===== bat_vol=4353
<5>[    2.517949] .(0)[266:charger_thread]Vbat=4353,Ibat=98,I=0,VChr=4730,T=25,Soc=0:0,CT:0:0 hv:1 pd:0:0
<5>[    2.517975] .(0)[266:charger_thread][mtk_is_charger_on]info->chr_type=0 
<6>[    2.518122] .(0)[266:charger_thread]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    2.518139] .(0)[266:charger_thread]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    2.518149] .(0)[266:charger_thread]I2C structure:
<3>[    2.518149] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=3,Total_len=1
<3>[    2.518149] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    2.518149] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    2.518175] .(0)[266:charger_thread]base address 0xffffff800bf46000
<6>[    2.518193] .(0)[266:charger_thread]I2C register:
<6>[    2.518193] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=0,CONTROL=28,TRANSFER_LEN=1
<6>[    2.518193] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    2.518193] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    2.518220] .(0)[266:charger_thread]before enable DMA register(0xffffff800bf48400):
<6>[    2.518220] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    2.518220] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    2.518220] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    2.518220] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    2.518251] .(0)[266:charger_thread]DMA register(0xffffff800bf48400):
<6>[    2.518251] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    2.518251] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c23100c
<6>[    2.518251] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    2.518251] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    2.518278] .(0)[266:charger_thread]i2c_dump_info ------------------------------------------
<3>[    2.518291] .(0)[266:charger_thread]i2c i2c-2: last transfer info:
<3>[    2.518306] .(0)[266:charger_thread]i2c i2c-2: [00] [    2.518114] SLAVE_ADDR=d8,INTR_STAT=3,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.518331] .(0)[266:charger_thread]i2c i2c-2: [01] [    2.480134] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=500
<3>[    2.518356] .(0)[266:charger_thread]i2c i2c-2: [02] [    2.477464] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.518381] .(0)[266:charger_thread]i2c i2c-2: [03] [    2.477126] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    2.518405] .(0)[266:charger_thread]i2c i2c-2: [04] [    2.443162] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=500
<3>[    2.518429] .(0)[266:charger_thread]i2c i2c-2: [05] [    2.441460] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.518453] .(0)[266:charger_thread]i2c i2c-2: [06] [    2.441119] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    2.518478] .(0)[266:charger_thread]i2c i2c-2: [07] [    2.408631] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=500
<3>[    2.518502] .(0)[266:charger_thread]i2c i2c-2: [08] [    2.407001] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.518527] .(0)[266:charger_thread]i2c i2c-2: [09] [    2.405662] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<4>[    2.518571] .(0)[266:charger_thread][wlc_do_10s_debounce]status=0
<4>[    2.518583] .(0)[266:charger_thread][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294892915 valley_jiffies=0 topeak_jiffies=0 
<4>[    2.522024] .(0)[266:charger_thread]temp_now=193, temp_last=193 
<4>[    2.522040] .(0)[266:charger_thread]=====FG===== TEMP = 193
<5>[    2.522050] .(0)[266:charger_thread]charger_check_status
<5>[    2.571168] .(0)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    2.571186] .(0)[266:charger_thread]charger_check_status tmp:19 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:0, charging:1
<5>[    2.571211] .(0)[266:charger_thread]_charger_manager_enable_charging: dev:charger idx:0 en:1
<5>[    2.571224] .(0)[266:charger_thread]_charger_manager_enable_charging: dev:charger idx:0 en:1 cnt:0
<5>[    2.575021] .(0)[266:charger_thread][mtk_battery_notify_OVP_check] OVP_VBUS value=0 chr_type=0 rg cc1=5 cc2=0
<5>[    2.576684] .(0)[266:charger_thread][mtk_battery_notify_OVP_check]charger_vol(4730 mV) 
<4>[    2.628845] .(3)[264:tpd_probe]<<GTP-INF>>[gt1x_init_debug_node:107] Created proc entry /proc/gt1x_debug.
<4>[    2.628852] .(3)[264:tpd_probe]<<GTP-INF>>[gt1x_init_tool_node:89] Alloc memory size:512.
<4>[    2.628866] .(3)[264:tpd_probe]<<GTP-INF>>[gt1x_init_tool_node:99] Created proc entry /proc/gmnode040495.
<6>[    2.628928] .(3)[264:tpd_probe]mtk-tpd: [tpd]tpd_gpio_as_int
<4>[    2.684670] .(3)[264:tpd_probe]<<GTP-INF>>[tpd_irq_registration:478] Device Tree Tpd_irq_registration!
<4>[    2.685790] .(3)[264:tpd_probe]gpiod_set_debounce: invalid GPIO
<4>[    2.685850] .(3)[264:tpd_probe]<<GTP-INF>>[tpd_irq_registration:486] Device gt1x_int_type = 1!
<4>[    2.685894] .(3)[264:tpd_probe]<<GTP-INF>>[tpd_irq_registration:507] irq:673, debounce:1-0:
<4>[    2.685900] -(3)[264:tpd_probe]------------[ cut here ]------------
<4>[    2.685902] -(3)[264:tpd_probe]WARNING: CPU: 3 PID: 264 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:513 __enable_irq+0x44/0x80()
<4>[    2.685917] -(3)[264:tpd_probe]Unbalanced enable for IRQ 673
<4>[    2.685919] Modules linked in:-(3)[264:tpd_probe]
<4>[    2.685926] -(3)[264:tpd_probe]CPU: 3 PID: 264 Comm: tpd_probe Tainted: G        W       4.4.95+ #2
<4>[    2.685931] -(3)[264:tpd_probe]Hardware name: MT6763V/B (DT)
<4>[    2.685935] -(3)[264:tpd_probe]Call trace:
<4>[    2.685937] -(3)[264:tpd_probe][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    2.685947] -(3)[264:tpd_probe][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    2.685951] -(3)[264:tpd_probe][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    2.685959] -(3)[264:tpd_probe][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    2.685966] -(3)[264:tpd_probe][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    2.685971] -(3)[264:tpd_probe][<ffffff800810c894>] __enable_irq+0x44/0x80
<4>[    2.685975] -(3)[264:tpd_probe][<ffffff800810c91c>] enable_irq+0x4c/0xa8
<4>[    2.685978] -(3)[264:tpd_probe][<ffffff80088ae2ac>] gt1x_irq_enable+0x3c/0x60
<4>[    2.685987] -(3)[264:tpd_probe][<ffffff80088ae478>] tpd_registration+0x1a8/0x2a0
<4>[    2.685992] -(3)[264:tpd_probe][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    2.685998] -(3)[264:tpd_probe][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    2.686002] -(3)[264:tpd_probe]---[ end trace 911ba04329a1ff3a ]---
<4>[    2.694611] .(2)[277:mtk-tpd]--lan-- ret = 0.
<4>[    2.706906] .(2)[277:mtk-tpd]--lan-- ret = 0.
<4>[    2.720752] .(2)[277:mtk-tpd]--lan-- ret = 0.
<6>[    2.760832] .(3)[21:kworker/3:0][msdc]cache(0x858000~0x930000, usrdata(0x930000~0x3A29FDF)
<4>[    2.787092] .(3)[1:swapper/0][TKCORE] fy partition-0
<4>[    2.787092] [    5.288041]: <0>MSG TKCore:htfat_early_init:1004: Verify partition-1
<4>[    2.787092] [    5.289347]: <0>MSG TKCore:htfat_early_init:1018: Initialize partition for the 3(+) times
<4>[    2.787092] [    5.290454]: <0>MSG TKCore:htfat_early_init:1032: HTFAT FS active_id = 0
<6>[    2.788973] .(3)[1:swapper/0]Freeing unused kernel memory: 5152K
<3>[    2.789045] .(3)[1:swapper/0]BOOTPROF:      2789.045237:Kernel_init_done
<4>[    2.791779] [TKCORE] 
<4>[    2.791779] [    5.291708]: <0>INF TKCore:htfat_init:163: HTFAT initialized Done
<4>[    2.791779] [    5.292541]: <0>INF TKCore:init_primary_helper:233: Primary CPU switching to normal world boot
<4>[    2.791779] [    5.293697]: <0>MSG TKCore:dump_tee_boot_params:135: tee_boot_params.magic: 0x545349.(1)[1:init][TKCORE] 58
<4>[    2.795488] [    5.294762]: <0>MSG TKCore:dump_tee_boot_params:136: tee_boot_params.length: 0xa8
<4>[    2.795488] [    5.295772]: <0>MSG TKCore:dump_tee_boot_params:137: tee_boot_params.version : 0x10003
<4>[    2.795488] [    5.296839]: <0>DBG TKCore:dump_tee_boot_params:140: tee_boot_params.uart_[TKCORE] base: 0x11002000
<4>[    2.795488] [    5.297960]: <0>DBG TKCore:dump_tee_boot_params:141: tee_boot_params.total_number_spi: 352
<4>[    2.795488] [    5.299080]: <0>DBG TKCore:dump_tee_boot_params:142: tee_boot_params.ssiq_number: 328
<4>[    2.795488] [    5.300136]: <0>DBG TKCore:dump_tee_boot_params:143:
<14>[    2.810414] .(1)[1:init]init: init first stage started!
<14>[    2.811186] .(1)[1:init]init: dlroot====before call DoFirstStageMount.
<14>[    2.813143] .(1)[1:init]init: Using Android DT directory /proc/device-tree/firmware/android/
<3>[    2.891353] .(1)[1:init]power_supply charger: driver failed to report `charge_type' property: -22
<4>[    2.930064] .(1)[1:init]=====FG===== SOC  = 100
<4>[    2.931436] .(1)[1:init]=====FG===== AC   = 98
<4>[    2.933106] .(0)[1:init]=====FG===== VOLT = 4342
<4>[    2.933704] .(0)[1:init]=====FG===== actural VOLT = 4331
<4>[    2.934941] .(0)[1:init]temp_now=193, temp_last=193 
<4>[    2.935581] .(0)[1:init]=====FG===== TEMP = 193
<4>[    2.936739] .(0)[1:init]=====FG===== SOC  = 100
<4>[    2.937868] .(0)[1:init]bq27542_set_commands cmd = 0x12, val = 3813 
<4>[    2.939224] .(0)[1:init]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    2.940578] .(0)[1:init]bq27542_set_commands cmd = 0xc, val = 3952 
<14>[    2.949438] .(0)[1:init]init: dlroot===is_device_secure ====, benableroot:0
<12>[    3.340782] .(0)[283:init]fec: <283> warning: __ecc_read: RS block 11603968: decoding failed
<14>[    3.350471] .(1)[1:init]init: [libfs_mgr]Enabling dm-verity for system (mode 2)
<14>[    3.351576] .(1)[1:init]init: [libfs_mgr]loading verity table: '1 /dev/block/platform/bootdevice/by-name/system /dev/block/platform/bootdevice/by-name/system 4096 4096 774155 774155 sha256 49dbfd96347034480a68d5af41b5b5e73807b833fc0dc001ac6e7959e8efadd2 aee087a5be3b982978c923f566a94613496b417f2af592639bc80d141e34dfe7 10 restart_on_corruption use_fec_from_device /dev/block/platform/bootdevice/by-name/system fec_start 780261 fec_blocks 780261 fec_roots 2 ignore_zero_blocks'
<6>[    3.360767] .(3)[278:kworker/3:2]tcpc_init_work force start
<6>[    3.365361] .(1)[45:pd_dbg_info]///PD dbg info 42d
<4>[    3.366055] .(1)[45:pd_dbg_info]<    3.365>TCPC-TYPEC:typec_init: TrySNK
<6>[    3.368901] .(3)[278:kworker/3:2]tcpc_device_irq_enable : tcpc irq enable OK!
<6>[    3.370553] .(3)[220:type_c_port0]pd_tcp_notifier_call attach wait sink
<4>[    3.371528] .(3)[220:type_c_port0]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<5>[    3.372889] .(3)[220:type_c_port0]tcpc_check_ovp_out_of_charger
<5>[    3.373673] .(3)[220:type_c_port0]wake_up_charger
<6>[    3.374640] .(2)[1:init]EXT4-fs (dm-0): mounted filesystem with ordered data mode. Opts: (null)
<14>[    3.375948] .(2)[1:init]init: [libfs_mgr]__mount(source=/dev/block/dm-0,target=/system,type=ext4)=0: Success
<14>[    3.377900] .(2)[1:init]init: dlroot===is_device_secure ====, benableroot:0
<6>[    3.388739] .(3)[45:pd_dbg_info]///PD dbg info 198d
<4>[    3.389413] .(3)[45:pd_dbg_info]<    3.366>TCPC-TYPEC:PowerOffCharge
<4>[    3.389413] <    3.366>TCPC-TYPEC:** Unattached.SNK
<4>[    3.389413] <    3.370>TCPC-TYPEC:[CC_Alert] 5/0
<4>[    3.389413] <    3.371>TCPC-TYPEC:** AttachWait.SNK
<4>[    3.389413] <    3.371>TCPC-TYPEC:[CC_Status2] 5/0
<6>[    3.491562] .(2)[45:pd_dbg_info]///PD dbg info 78d
<4>[    3.492222] .(2)[45:pd_dbg_info]<    3.491>TCPC-TYPEC:[CC_Change] 5/0
<4>[    3.492222] <    3.491>TCPC-TYPEC:** Attached.SNK
<6>[    3.493817] .(3)[218:tcpc_timer_type]pd_tcp_notifier_call sink vbus 5000mv 150ma type(1)
<5>[    3.494973] .(3)[218:tcpc_timer_type]charger_manager_enable_power_path: power path is already en = 1
<5>[    3.496198] .(3)[218:tcpc_timer_type]PD charger event:14 5
<6>[    3.496968] .(3)[218:tcpc_timer_type]pd_tcp_notifier_call USB Plug in, pol = 0
<6>[    3.516699] .(2)[45:pd_dbg_info]///PD dbg info 118d
<4>[    3.517364] .(2)[45:pd_dbg_info]<    3.496>TCPC-TYPEC:[CC_Status] 5/0
<4>[    3.517364] <    3.496>TCPC-TYPEC:Attached-> SINK
<4>[    3.517364] <    3.497>TCPC-TCPC:usb_port_attached
<12>[    3.560810] .(1)[293:init]fec: <293> warning: __ecc_read: RS block 2215936: decoding failed
<14>[    3.565741] .(0)[1:init]init: [libfs_mgr]Enabling dm-verity for vendor (mode 2)
<14>[    3.566756] .(0)[1:init]init: [libfs_mgr]loading verity table: '1 /dev/block/platform/bootdevice/by-name/vendor /dev/block/platform/bootdevice/by-name/vendor 4096 4096 165305 165305 sha256 fc8be3b2b1f80d5066d28c5bd5f4f01782524d312dcfbe2c51f7b0f974648613 aee087a5be3b982978c923f566a94613496b417f2af592639bc80d141e34dfe7 10 restart_on_corruption use_fec_from_device /dev/block/platform/bootdevice/by-name/vendor fec_start 166617 fec_blocks 166617 fec_roots 2 ignore_zero_blocks'
<4>[    3.576750] .(5)[266:charger_thread]TempToCurrent no charge on
<5>[    3.577533] .(5)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    3.578399] .(5)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<6>[    3.581368] .(0)[1:init]EXT4-fs (dm-1): mounted filesystem with ordered data mode. Opts: (null)
<14>[    3.582584] .(0)[1:init]init: [libfs_mgr]__mount(source=/dev/block/dm-1,target=/vendor,type=ext4)=0: Success
<14>[    3.584035] .(0)[1:init]init: Skipped setting INIT_AVB_VERSION (not in recovery mode)
<14>[    3.585092] .(0)[1:init]init: Loading SELinux policy
<7>[    3.609047] .(2)[1:init]SELinux: 8192 avtab hash slots, 24948 rules.
<7>[    3.627225] .(2)[1:init]SELinux: 8192 avtab hash slots, 24948 rules.
<7>[    3.627252] .(2)[1:init]SELinux:  1 users, 4 roles, 2069 types, 0 bools, 1 sens, 1024 cats
<7>[    3.627260] .(2)[1:init]SELinux:  92 classes, 24948 rules
<7>[    3.631905] .(2)[1:init]SELinux:  Completing initialization.
<7>[    3.631917] .(2)[1:init]SELinux:  Setting up existing superblocks.
<6>[    3.658336] .(1)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    3.659608] .(1)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    3.661367] .(1)[266:charger_thread]=====FG===== AC   = 41
<4>[    3.662826] .(1)[266:charger_thread]=====FG===== AC   = 41
<5>[    3.699164] .(2)[1:init]audit: type=1403 audit(1578646632.134:2): policy loaded auid=4294967295 ses=4294967295
<14>[    3.700789] .(2)[1:init]selinux: SELinux: Loaded policy from /vendor/etc/selinux/precompiled_sepolicy
<14>[    3.700789] 
<14>[    3.702636] .(2)[1:init]init: dlroot===selinux_is_enforcing, secureboot_status_from_cmdline, bEnableroot:0
<5>[    3.703932] .(2)[1:init]audit: type=1404 audit(1578646632.138:3): enforcing=1 old_enforcing=0 auid=4294967295 ses=4294967295
<4>[    3.705376] .(1)[266:charger_thread]lifetime: data[0]=1 
<4>[    3.705379] .(1)[266:charger_thread]lifetime: data[1]=df 
<4>[    3.705382] .(1)[266:charger_thread]lifetime: data[2]=ff 
<4>[    3.705387] .(1)[266:charger_thread]lifetime: data[3]=40 
<4>[    3.705389] .(1)[266:charger_thread]lifetime: data[4]=11 
<4>[    3.705391] .(1)[266:charger_thread]lifetime: data[5]=45 
<4>[    3.705393] .(1)[266:charger_thread]lifetime: data[6]=a 
<4>[    3.705395] .(1)[266:charger_thread]lifetime: data[7]=fc 
<4>[    3.705398] .(1)[266:charger_thread]lifetime: data[8]=8 
<4>[    3.705400] .(1)[266:charger_thread]lifetime: data[9]=68 
<4>[    3.705402] .(1)[266:charger_thread]lifetime: data[10]=f7 
<4>[    3.705404] .(1)[266:charger_thread]lifetime: data[11]=18 
<4>[    3.706977] -(1)[266:charger_thread]mt6356_get_auxadc_value: 82 callbacks suppressed
<4>[    3.706983] .(1)[266:charger_thread]=====FG-MTK===== bat_vol=4340
<4>[    3.711697] .(1)[266:charger_thread]=====FG===== AC   = 41
<5>[    3.711913] .(1)[266:charger_thread]Vbat=4340,Ibat=41,I=0,VChr=4730,T=25,Soc=0:0,CT:0:0 hv:1 pd:0:0
<5>[    3.711918] .(1)[266:charger_thread][mtk_is_charger_on]info->chr_type=0 
<6>[    3.712401] .(1)[266:charger_thread]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    3.712407] .(1)[266:charger_thread]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    3.712410] .(1)[266:charger_thread]I2C structure:
<3>[    3.712410] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=3,Total_len=1
<3>[    3.712410] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    3.712410] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    3.712417] .(1)[266:charger_thread]base address 0xffffff800bf46000
<6>[    3.712426] .(1)[266:charger_thread]I2C register:
<6>[    3.712426] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=0,CONTROL=28,TRANSFER_LEN=1
<6>[    3.712426] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    3.712426] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    3.712433] .(1)[266:charger_thread]before enable DMA register(0xffffff800bf48400):
<6>[    3.712433] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    3.712433] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    3.712433] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    3.712433] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    3.712444] .(1)[266:charger_thread]DMA register(0xffffff800bf48400):
<6>[    3.712444] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    3.712444] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c23100c
<6>[    3.712444] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    3.712444] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    3.712450] .(1)[266:charger_thread]i2c_dump_info ------------------------------------------
<3>[    3.712453] .(1)[266:charger_thread]i2c i2c-2: last transfer info:
<3>[    3.712457] .(1)[266:charger_thread]i2c i2c-2: [00] [    3.712396] SLAVE_ADDR=d8,INTR_STAT=3,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    3.712463] .(1)[266:charger_thread]i2c i2c-2: [01] [    3.711691] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    3.712468] .(1)[266:charger_thread]i2c i2c-2: [02] [    3.710998] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    3.712474] .(1)[266:charger_thread]i2c i2c-2: [03] [    3.705372] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=499
<3>[    3.712479] .(1)[266:charger_thread]i2c i2c-2: [04] [    3.702390] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    3.712485] .(1)[266:charger_thread]i2c i2c-2: [05] [    3.702200] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    3.712490] .(1)[266:charger_thread]i2c i2c-2: [06] [    3.665819] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=499
<3>[    3.712496] .(1)[266:charger_thread]i2c i2c-2: [07] [    3.664201] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    3.712501] .(1)[266:charger_thread]i2c i2c-2: [08] [    3.663863] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    3.712507] .(1)[266:charger_thread]i2c i2c-2: [09] [    3.662822] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<4>[    3.712523] .(1)[266:charger_thread][wlc_do_10s_debounce]status=0
<4>[    3.712527] .(1)[266:charger_thread][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294893213 valley_jiffies=0 topeak_jiffies=0 
<4>[    3.715624] .(1)[266:charger_thread]=====FG===== AC   = 41
<4>[    3.716703] .(1)[266:charger_thread]temp_now=193, temp_last=193 
<4>[    3.716707] .(1)[266:charger_thread]=====FG===== TEMP = 193
<5>[    3.716709] .(1)[266:charger_thread]charger_check_status
<5>[    3.761102] .(0)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    3.762134] .(0)[266:charger_thread]charger_check_status tmp:19 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    3.766123] .(0)[266:charger_thread][mtk_battery_notify_OVP_check] OVP_VBUS value=0 chr_type=0 rg cc1=5 cc2=0
<5>[    3.768947] .(0)[266:charger_thread][mtk_battery_notify_OVP_check]charger_vol(4721 mV) 
<14>[    3.784088] .(4)[1:init]selinux: SELinux: Loaded file_contexts
<14>[    3.784088] 
<5>[    3.787902] .(5)[1:init]random: init: uninitialized urandom read (40 bytes read, 44 bits of entropy available)
<14>[    3.791245] .(5)[1:init]init: init second stage started!
<14>[    3.802989] .(1)[1:init]init: Using Android DT directory /proc/device-tree/firmware/android/
<11>[    3.805082] .(1)[1:init]init: property_set("ro.boot.hardware", "mt6763") failed: property already set
<14>[    3.806274] .(1)[1:init]init: dlroo=== import_kernel_nv=== property_set key [hardware , mt6763]
<14>[    3.807408] .(1)[1:init]init: dlroo=== import_kernel_nv=== property_set key [verifiedbootstate , orange]
<14>[    3.808635] .(1)[1:init]init: dlroo=== import_kernel_nv=== property_set key [veritymode , enforcing]
<14>[    3.809838] .(1)[1:init]init: dlroo=== import_kernel_nv=== property_set key [atm , disabled]
<14>[    3.810935] .(1)[1:init]init: dlroo=== import_kernel_nv=== property_set key [meta_log_disable , 0]
<11>[    3.812091] .(1)[1:init]init: property_set("ro.boot.serialno", "S19F00013") failed: property already set
<14>[    3.813315] .(1)[1:init]init: dlroo=== import_kernel_nv=== property_set key [serialno , S19F00013]
<14>[    3.814477] .(1)[1:init]init: dlroo=== import_kernel_nv=== property_set key [secureboot , 49]
<14>[    3.815583] .(1)[1:init]init: dlroo=== import_kernel_nv=== property_set key [specialid , 0]
<14>[    3.816731] .(1)[1:init]init: dlroo=== import_kernel_nv=== property_set key [bootreason , wdt_by_pass_pwk]
<14>[    3.817997] .(1)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.serialno , S19F00013]   default:
<14>[    3.819346] .(1)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.bootmode , normal]   default:unknown
<14>[    3.820752] .(1)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.baseband , ]   default:unknown
<14>[    3.822079] .(1)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.bootloader , ]   default:unknown
<14>[    3.823427] .(1)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.hardware , mt6763]   default:unknown
<14>[    3.824851] .(1)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.revision , ]   default:0
<14>[    3.826114] .(1)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.secureboot , 49]   default:0
<14>[    3.827419] .(1)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.specialid , 0]   default:0
<14>[    3.828722] .(1)[1:init]init: dlroo===export_kernel_boot_props=== property_set [gsm.serial , S19F00013]   default:
<14>[    3.837921] .(5)[1:init]selinux: SELinux: Loaded file_contexts
<14>[    3.837921] 
<14>[    3.843975] .(5)[1:init]selinux: SELinux: Loaded property_contexts from /system/etc/selinux/plat_property_contexts & /vendor/etc/selinux/nonplat_property_contexts.
<14>[    3.843975] 
<14>[    3.846142] .(5)[1:init]init: Running restorecon...
<11>[    3.875187] .(5)[1:init]init: waitid failed: No child processes
<14>[    3.876030] .(5)[1:init]init: dlroot == [ro.secureboot]: 49
<14>[    3.876817] .(5)[1:init]init: dlroot=== secure boot is enabled or unknown, load standard deault prop .
<14>[    3.879047] .(5)[1:init]init: PropSet [security.perf_harden]=[1] Done
<14>[    3.880003] .(5)[1:init]init: PropSet [persist.sys.usb.config]=[none] Done
<12>[    3.880948] .(5)[1:init]init: Couldn't load property file: Unable to open '/odm/default.prop': No such file or directory: No such file or directory
<14>[    3.883429] .(5)[1:init]init: PropSet [dalvik.vm.image-dex2oat-Xms]=[64m] Done
<14>[    3.884373] .(5)[1:init]init: PropSet [dalvik.vm.image-dex2oat-Xmx]=[64m] Done
<14>[    3.885343] .(5)[1:init]init: PropSet [dalvik.vm.dex2oat-Xms]=[64m] Done
<14>[    3.886216] .(5)[1:init]init: PropSet [dalvik.vm.dex2oat-Xmx]=[512m] Done
<14>[    3.887109] .(5)[1:init]init: PropSet [dalvik.vm.usejit]=[true] Done
<14>[    3.887940] .(5)[1:init]init: PropSet [dalvik.vm.usejitprofiles]=[true] Done
<14>[    3.888881] .(5)[1:init]init: PropSet [dalvik.vm.dexopt.secondary]=[true] Done
<14>[    3.889821] .(5)[1:init]init: PropSet [dalvik.vm.appimageformat]=[lz4] Done
<14>[    3.890728] .(5)[1:init]init: PropSet [pm.dexopt.first-boot]=[quicken] Done
<14>[    3.891657] .(5)[1:init]init: PropSet [pm.dexopt.boot]=[verify] Done
<14>[    3.892488] .(5)[1:init]init: PropSet [pm.dexopt.install]=[quicken] Done
<14>[    3.893378] .(5)[1:init]init: PropSet [pm.dexopt.bg-dexopt]=[speed-profile] Done
<14>[    3.894340] .(5)[1:init]init: PropSet [pm.dexopt.ab-ota]=[speed-profile] Done
<14>[    3.895268] .(5)[1:init]init: PropSet [pm.dexopt.inactive]=[verify] Done
<14>[    3.896141] .(5)[1:init]init: PropSet [pm.dexopt.shared]=[speed] Done
<14>[    3.896998] .(5)[1:init]init: PropSet [debug.atrace.tags.enableflags]=[0] Done
<14>[    3.897936] .(5)[1:init]init: PropSet [persist.service.acm.enable]=[0] Done
<14>[    3.898863] .(5)[1:init]init: PropSet [persist.sys.usb.config]=[mtp] Done
<14>[    3.899761] .(5)[1:init]init: PropSet [camera.disable_zsl_mode]=[1] Done
<14>[    3.901296] .(5)[1:init]init: Created socket '/dev/socket/property_service', mode 666, user 0, group 0
<14>[    3.902555] .(5)[1:init]init: PropSet [sys.usb.controller]=[musb-hdrc] Done
<14>[    3.903500] .(5)[1:init]init: dlroot === ParseConfig init.rc 
<14>[    3.904271] .(5)[1:init]init: Parsing file /init.rc...
<14>[    3.905186] .(5)[1:init]init: Added '/init.environ.rc' to import list
<14>[    3.906020] .(5)[1:init]init: Added '/init.usb.rc' to import list
<14>[    3.906824] .(5)[1:init]init: Added '/init.mt6763.rc' to import list
<14>[    3.907652] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.mt6763.rc' to import list
<14>[    3.908701] .(5)[1:init]init: Added '/init.usb.configfs.rc' to import list
<14>[    3.909597] .(5)[1:init]init: Added '/init.zygote64_32.rc' to import list
<14>[    3.911640] .(5)[1:init]init: Parsing file /init.environ.rc...
<14>[    3.912493] .(5)[1:init]init: Parsing file /init.usb.rc...
<14>[    3.913568] .(5)[1:init]init: Parsing file /init.mt6763.rc...
<11>[    3.914326] .(5)[1:init]init: Unable to open '/init.mt6763.rc': No such file or directory
<11>[    3.915383] .(5)[1:init]init: /init.rc: 9: Could not import file '/init.mt6763.rc': No such file or directory
<14>[    3.917926] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.mt6763.rc...
<14>[    3.920440] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.connectivity.rc' to import list
<14>[    3.921591] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.mt6763.usb.rc' to import list
<14>[    3.922663] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.project.rc' to import list
<14>[    3.923702] .(5)[1:init]init: Added '/FWUpgradeInit.rc' to import list
<14>[    3.924548] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.aee.rc' to import list
<14>[    3.925585] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.volte.rc' to import list
<14>[    3.926608] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.mal.rc' to import list
<14>[    3.927607] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.sensor_1_0.rc' to import list
<14>[    3.928703] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.modem.rc' to import list
<11>[    3.929910] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 104: invalid keyword 'makedir'
<11>[    3.931038] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 105: invalid keyword 'makedir'
<11>[    3.932166] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 109: invalid keyword 'makedir'
<11>[    3.933537] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 316: invalid keyword 'mknod'
<11>[    3.934836] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 453: invalid keyword 'mknod'
<11>[    3.935943] .(5)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 460: invalid keyword 'mknod'
<14>[    3.938373] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.connectivity.rc...
<14>[    3.940336] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.mt6763.usb.rc...
<14>[    3.945674] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.project.rc...
<14>[    3.947387] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.datalogic.rc' to import list
<14>[    3.948768] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.datalogic.rc...
<14>[    3.950454] .(5)[1:init]init: Parsing file /FWUpgradeInit.rc...
<11>[    3.951234] .(5)[1:init]init: Unable to open '/FWUpgradeInit.rc': No such file or directory
<11>[    3.952312] .(5)[1:init]init: /init.rc: 6: Could not import file '/FWUpgradeInit.rc': No such file or directory
<14>[    3.953645] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.aee.rc...
<14>[    3.955244] .(5)[1:init]init: Added '/init.preload.rc' to import list
<14>[    3.956094] .(5)[1:init]init: Parsing file /init.preload.rc...
<11>[    3.956878] .(5)[1:init]init: Unable to open '/init.preload.rc': No such file or directory
<11>[    3.957940] .(5)[1:init]init: /init.rc: 51: Could not import file '/init.preload.rc': No such file or directory
<14>[    3.959237] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.volte.rc...
<11>[    3.960181] .(5)[1:init]init: Unable to open '/vendor/etc/init/hw/init.volte.rc': No such file or directory
<11>[    3.961438] .(5)[1:init]init: /init.rc: 8: Could not import file '/vendor/etc/init/hw/init.volte.rc': No such file or directory
<14>[    3.962905] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.mal.rc...
<11>[    3.963830] .(5)[1:init]init: Unable to open '/vendor/etc/init/hw/init.mal.rc': No such file or directory
<11>[    3.965066] .(5)[1:init]init: /init.rc: 9: Could not import file '/vendor/etc/init/hw/init.mal.rc': No such file or directory
<14>[    3.966527] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.sensor_1_0.rc...
<14>[    3.968565] .(5)[1:init]init: Parsing file /vendor/etc/init/hw/init.modem.rc...
<14>[    3.970212] .(5)[1:init]init: Parsing file /init.usb.configfs.rc...
<14>[    3.971455] .(5)[1:init]init: Parsing file /init.zygote64_32.rc...
<14>[    3.972436] .(5)[1:init]init: Parsing directory /system/etc/init...
<14>[    3.973974] .(5)[1:init]init: Parsing file /system/etc/init/aal.rc...
<14>[    3.975398] .(5)[1:init]init: Parsing file /system/etc/init/aee_aed.rc...
<14>[    3.976947] .(5)[1:init]init: Parsing file /system/etc/init/aee_aed64.rc...
<14>[    3.978455] .(5)[1:init]init: Parsing file /system/etc/init/android.hidl.allocator@1.0-service.rc...
<14>[    3.980182] .(5)[1:init]init: Parsing file /system/etc/init/atcid.rc...
<14>[    3.981765] .(5)[1:init]init: Parsing file /system/etc/init/atrace.rc...
<14>[    3.983694] .(5)[1:init]init: Parsing file /system/etc/init/audiocmdservice_atci.rc...
<14>[    3.985344] .(5)[1:init]init: Parsing file /system/etc/init/audioserver.rc...
<14>[    3.986910] .(5)[1:init]init: Parsing file /system/etc/init/batterywarning.rc...
<14>[    3.988424] .(5)[1:init]init: Parsing file /system/etc/init/bootanim.rc...
<14>[    3.989961] .(5)[1:init]init: Parsing file /system/etc/init/bootlogoupdater.rc...
<14>[    3.991477] .(5)[1:init]init: Parsing file /system/etc/init/bootstat.rc...
<14>[    3.993141] .(5)[1:init]init: Parsing file /system/etc/init/cameraserver.rc...
<14>[    3.994655] .(5)[1:init]init: Parsing file /system/etc/init/drmserver.rc...
<14>[    3.996180] .(5)[1:init]init: Parsing file /system/etc/init/dumpstate.rc...
<14>[    3.997740] .(5)[1:init]init: Parsing file /system/etc/init/emdlogger1.rc...
<14>[    3.999246] .(5)[1:init]init: Parsing file /system/etc/init/emdlogger3.rc...
<14>[    4.000786] .(5)[1:init]init: Parsing file /system/etc/init/gatekeeperd.rc...
<14>[    4.002293] .(5)[1:init]init: Parsing file /system/etc/init/ged_srv.rc...
<14>[    4.003858] .(5)[1:init]init: Parsing file /system/etc/init/hwservicemanager.rc...
<14>[    4.005449] .(5)[1:init]init: Parsing file /system/etc/init/init.thermald.rc...
<14>[    4.006955] .(5)[1:init]init: Parsing file /system/etc/init/init.vtservice.rc...
<14>[    4.008563] .(5)[1:init]init: Parsing file /system/etc/init/installd.rc...
<14>[    4.010244] .(5)[1:init]init: Parsing file /system/etc/init/keystore.rc...
<14>[    4.011702] .(5)[1:init]init: Parsing file /system/etc/init/kpoc_charger.rc...
<14>[    4.013222] .(5)[1:init]init: Parsing file /system/etc/init/lmkd.rc...
<14>[    4.014333] .(5)[1:init]init: Parsing file /system/etc/init/logd.rc...
<14>[    4.015477] .(5)[1:init]init: Parsing file /system/etc/init/md_monitor.rc...
<14>[    4.016982] .(5)[1:init]init: Parsing file /system/etc/init/mdlogger.rc...
<14>[    4.018502] .(5)[1:init]init: Parsing file /system/etc/init/mdnsd.rc...
<14>[    4.019638] .(5)[1:init]init: Parsing file /system/etc/init/mediadrmserver.rc...
<14>[    4.021196] .(5)[1:init]init: Parsing file /system/etc/init/mediaextractor.rc...
<14>[    4.022713] .(5)[1:init]init: Parsing file /system/etc/init/mediametrics.rc...
<14>[    4.024241] .(5)[1:init]init: Parsing file /system/etc/init/mediaserver.rc...
<14>[    4.025794] .(5)[1:init]init: Parsing file /system/etc/init/met_log_d.rc...
<14>[    4.027293] .(5)[1:init]init: Parsing file /system/etc/init/mobile_log_d.rc...
<14>[    4.028897] .(5)[1:init]init: Parsing file /system/etc/init/mtk_advcamserver.rc...
<14>[    4.030446] .(5)[1:init]init: Parsing file /system/etc/init/mtpd.rc...
<14>[    4.031602] .(5)[1:init]init: Parsing file /system/etc/init/netd.rc...
<14>[    4.033131] .(5)[1:init]init: Parsing file /system/etc/init/netdiag.rc...
<14>[    4.034669] .(5)[1:init]init: Parsing file /system/etc/init/ppl_agent.rc...
<14>[    4.036172] .(5)[1:init]init: Parsing file /system/etc/init/program_binary_service.rc...
<14>[    4.037784] .(5)[1:init]init: Parsing file /system/etc/init/racoon.rc...
<14>[    4.038942] .(5)[1:init]init: Parsing file /system/etc/init/servicemanager.rc...
<14>[    4.040480] .(5)[1:init]init: Parsing file /system/etc/init/sn.rc...
<14>[    4.041628] .(5)[1:init]init: Parsing file /system/etc/init/storaged.rc...
<14>[    4.043140] .(5)[1:init]init: Parsing file /system/etc/init/storagemanagerd.rc...
<14>[    4.044741] .(5)[1:init]init: Parsing file /system/etc/init/surfaceflinger.rc...
<14>[    4.046282] .(5)[1:init]init: Parsing file /system/etc/init/terserver.rc...
<14>[    4.047784] .(5)[1:init]init: Parsing file /system/etc/init/thermalindicator.rc...
<14>[    4.049368] .(5)[1:init]init: Parsing file /system/etc/init/thermalservice.rc...
<14>[    4.050867] .(5)[1:init]init: Parsing file /system/etc/init/tombstoned.rc...
<14>[    4.052427] .(5)[1:init]init: Parsing file /system/etc/init/uncrypt.rc...
<14>[    4.053972] .(5)[1:init]init: Parsing file /system/etc/init/vdc.rc...
<14>[    4.055090] .(5)[1:init]init: Parsing file /system/etc/init/vold.rc...
<14>[    4.056205] .(5)[1:init]init: Parsing file /system/etc/init/webview_zygote32.rc...
<14>[    4.057772] .(5)[1:init]init: Parsing file /system/etc/init/webview_zygote64.rc...
<14>[    4.059308] .(5)[1:init]init: Parsing file /system/etc/init/wifi-events.rc...
<14>[    4.060907] .(5)[1:init]init: Parsing file /system/etc/init/wificond.rc...
<14>[    4.062413] .(5)[1:init]init: Parsing directory /vendor/etc/init...
<14>[    4.063367] .(5)[1:init]init: Parsing file /vendor/etc/init/aee_aedv.rc...
<14>[    4.064863] .(5)[1:init]init: Parsing file /vendor/etc/init/aee_aedv64.rc...
<14>[    4.066374] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc...
<14>[    4.068241] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.bluetooth@1.0-service-mediatek.rc...
<14>[    4.070208] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.broadcastradio@1.1-service.rc...
<14>[    4.072041] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.cas@1.0-service.rc...
<14>[    4.073772] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.configstore@1.0-service.rc...
<14>[    4.075562] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.drm@1.0-service.rc...
<14>[    4.077295] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.drm@1.0-service.widevine.rc...
<14>[    4.079103] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.gatekeeper@1.0-service.rc...
<14>[    4.080908] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.graphics.allocator@2.0-service.rc...
<14>[    4.082793] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.graphics.composer@2.1-service.rc...
<14>[    4.084674] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.keymaster@3.0-service.rc...
<14>[    4.086443] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.light@2.0-service-mediatek.rc...
<14>[    4.088261] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.media.omx@1.0-service.rc...
<14>[    4.090122] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.memtrack@1.0-service.rc...
<14>[    4.091885] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.sensors@1.0-service-mediatek.rc...
<14>[    4.093749] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.thermal@1.0-service.rc...
<14>[    4.095496] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.vibrator@1.0-service.rc...
<14>[    4.097264] .(5)[1:init]init: Parsing file /vendor/etc/init/android.hardware.wifi@1.0-service.rc...
<14>[    4.098993] .(5)[1:init]init: Parsing file /vendor/etc/init/camerahalserver.rc...
<14>[    4.100556] .(5)[1:init]init: Parsing file /vendor/etc/init/fuelgauged_init.rc...
<14>[    4.102099] .(5)[1:init]init: Parsing file /vendor/etc/init/fuelgauged_nvram_init.rc...
<14>[    4.103686] .(5)[1:init]init: Parsing file /vendor/etc/init/gsm0710muxd.rc...
<14>[    4.105230] .(5)[1:init]init: Parsing file /vendor/etc/init/hostapd.android.rc...
<14>[    4.106801] .(5)[1:init]init: Parsing file /vendor/etc/init/init.bip.rc...
<14>[    4.108343] .(5)[1:init]init: Parsing file /vendor/etc/init/init.bt_drv.rc...
<14>[    4.109849] .(5)[1:init]init: Parsing file /vendor/etc/init/init.cccifsd.rc...
<14>[    4.111413] .(5)[1:init]init: Parsing file /vendor/etc/init/init.cccimdinit.rc...
<14>[    4.113105] .(5)[1:init]init: Parsing file /vendor/etc/init/init.cccirpcd.rc...
<14>[    4.114828] .(5)[1:init]init: Parsing file /vendor/etc/init/init.gps_drv.rc...
<14>[    4.116509] .(5)[1:init]init: Parsing file /vendor/etc/init/init.md_apps.rc...
<14>[    4.118221] .(5)[1:init]init: Parsing file /vendor/etc/init/init.thermal.rc...
<14>[    4.119917] .(5)[1:init]init: Parsing file /vendor/etc/init/init.thermal_manager.rc...
<14>[    4.121723] .(5)[1:init]init: Parsing file /vendor/etc/init/init.thermalloadalgod.rc...
<14>[    4.123514] .(5)[1:init]init: Parsing file /vendor/etc/init/init.volte_imcb.rc...
<14>[    4.125279] .(5)[1:init]init: Parsing file /vendor/etc/init/init.volte_imsm_93.rc...
<14>[    4.127124] .(5)[1:init]init: Parsing file /vendor/etc/init/init.volte_stack.rc...
<14>[    4.128906] .(5)[1:init]init: Parsing file /vendor/etc/init/init.volte_ua.rc...
<14>[    4.130637] .(5)[1:init]init: Parsing file /vendor/etc/init/init.vtservice.rc...
<11>[    4.132344] .(5)[1:init]init: /vendor/etc/init/init.vtservice.rc: 3: ignored duplicate definition of service 'vtservice'
<11>[    4.133767] .(5)[1:init]init: /vendor/etc/init/init.vtservice.rc: 9: ignored duplicate definition of service 'vtservice_hidl'
<14>[    4.135208] .(5)[1:init]init: Parsing file /vendor/etc/init/init.wfca.rc...
<14>[    4.136913] .(5)[1:init]init: Parsing file /vendor/etc/init/init.wlan_drv.rc...
<14>[    4.138621] .(5)[1:init]init: Parsing file /vendor/etc/init/init.wmt_drv.rc...
<14>[    4.140303] .(5)[1:init]init: Parsing file /vendor/etc/init/init.wod.rc...
<14>[    4.142068] .(5)[1:init]init: Parsing file /vendor/etc/init/init_connectivity.rc...
<14>[    4.143874] .(5)[1:init]init: Parsing file /vendor/etc/init/ipsec_mon.rc...
<14>[    4.145584] .(5)[1:init]init: Parsing file /vendor/etc/init/lbs_hidl_service.rc...
<14>[    4.147328] .(5)[1:init]init: Parsing file /vendor/etc/init/md_ctrl.rc...
<14>[    4.149006] .(5)[1:init]init: Parsing file /vendor/etc/init/mtk_agpsd.rc...
<14>[    4.150706] .(5)[1:init]init: Parsing file /vendor/etc/init/muxreport.rc...
<14>[    4.152385] .(5)[1:init]init: Parsing file /vendor/etc/init/netdagent.rc...
<14>[    4.154078] .(5)[1:init]init: Parsing file /vendor/etc/init/nvram_agent_binder.rc...
<14>[    4.155844] .(5)[1:init]init: Parsing file /vendor/etc/init/nvram_daemon.rc...
<14>[    4.157561] .(5)[1:init]init: Parsing file /vendor/etc/init/rild.rc...
<14>[    4.159273] .(5)[1:init]init: Parsing file /vendor/etc/init/statusd.rc...
<14>[    4.160994] .(5)[1:init]init: Parsing file /vendor/etc/init/sysenv_daemon.rc...
<14>[    4.162719] .(5)[1:init]init: Parsing file /vendor/etc/init/trustkernel.rc...
<14>[    4.164461] .(5)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.dfps@1.0-service.rc...
<14>[    4.166519] .(5)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.gnss@1.1-service.rc...
<14>[    4.168535] .(5)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.keymaster_attestation@1.1-service.rc...
<14>[    4.170777] .(5)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.mtkcodecservice@1.1-service.rc...
<14>[    4.172925] .(5)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc...
<14>[    4.175225] .(5)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.pq@2.0-service.rc...
<14>[    4.177244] .(5)[1:init]init: Parsing file /vendor/etc/init/vendor.nxp.nxpnfc@1.0-service.rc...
<14>[    4.179130] .(5)[1:init]init: Parsing file /vendor/etc/init/vndservicemanager.rc...
<14>[    4.180903] .(5)[1:init]init: Parsing file /vendor/etc/init/wifi2agps.rc...
<14>[    4.182617] .(5)[1:init]init: Parsing file /odm/etc/init...
<11>[    4.183347] .(5)[1:init]init: Unable to open '/odm/etc/init': No such file or directory
<14>[    4.184530] .(5)[1:init]init: processing action (early-init) from (/init.rc:14)
<14>[    4.189955] .(5)[1:init]init: starting service 'ueventd'...
<14>[    4.191853] .(5)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.mt6763.rc:16)
<3>[    4.193220] .(5)[1:init]BOOTPROF:      4193.219778:INIT:early-init
<5>[    4.194116] .(5)[1:init][Power/PPM] (0x40)(-1)(0)(0-7)(15)(0)(4)(4) (0)(0)(4)(4) 
<6>[    4.195131] .(0)[243:hps_main]CPU request is 0xff
<5>[    4.195139] .(5)[1:init][Power/PPM] (0x40)(-1)(0)(0-7)(0)(0)(4)(4) (0)(0)(4)(4) 
<5>[    4.195226] .(1)[304:ueventd]random: ueventd: uninitialized urandom read (40 bytes read, 46 bits of entropy available)
<5>[    4.195235] .(5)[1:init][VcoreFS] vcore_debug: cmd: KIR_BOOTUP, val: 0
<5>[    4.195249] .(5)[1:init][VcoreFS] vcore_debug: cmd: KIR_BOOTUP, val: 0
<5>[    4.195255] .(5)[1:init][VcoreFS] MSDC AUTOK NOT FINISH
<14>[    4.195449] .(5)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.mt6763.usb.rc:1)
<14>[    4.195526] .(5)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.modem.rc:7)
<14>[    4.195777] .(5)[1:init]init: PropSet [net.perf.rps.default]=[0f] Done
<14>[    4.195810] .(5)[1:init]init: PropSet [net.perf.tether.rps]=[0f] Done
<14>[    4.195834] .(5)[1:init]init: PropSet [net.perf.tether.cpu.core]=[4,4,0,0] Done
<14>[    4.195859] .(5)[1:init]init: PropSet [net.perf.tether.cpu.freq]=[1183000,1638000,0,0] Done
<14>[    4.195880] .(5)[1:init]init: PropSet [net.perf.internal.rps]=[0f] Done
<14>[    4.195904] .(5)[1:init]init: PropSet [net.perf.internal.cpu.core]=[4,4,0,0] Done
<14>[    4.195928] .(5)[1:init]init: PropSet [net.perf.internal.cpu.freq]=[-1,-1,-1,-1] Done
<14>[    4.195961] .(5)[1:init]init: processing action (wait_for_coldboot_done) from (<Builtin Action>:0)
<14>[    4.197693] .(1)[304:ueventd]ueventd: ueventd started!
<14>[    4.197745] .(1)[304:ueventd]ueventd: Parsing file /ueventd.rc...
<14>[    4.201347] .(2)[304:ueventd]ueventd: Parsing file /vendor/ueventd.rc...
<14>[    4.203646] .(3)[304:ueventd]ueventd: Parsing file /odm/ueventd.rc...
<11>[    4.203677] .(3)[304:ueventd]ueventd: Unable to open '/odm/ueventd.rc': No such file or directory
<14>[    4.203840] .(3)[304:ueventd]ueventd: Parsing file /ueventd.mt6763.rc...
<11>[    4.203862] .(3)[304:ueventd]ueventd: Unable to open '/ueventd.mt6763.rc': No such file or directory
<14>[    4.208406] .(3)[304:ueventd]selinux: SELinux: Loaded file_contexts
<14>[    4.208406] 
<3>[    4.261716] .(5)[304:ueventd]power_supply charger: driver failed to report `charge_type' property: -22
<4>[    4.290278] .(5)[304:ueventd]=====FG===== SOC  = 100
<4>[    4.291697] .(5)[304:ueventd]=====FG===== AC   = 17
<4>[    4.293413] .(5)[304:ueventd]=====FG===== VOLT = 4319
<4>[    4.294064] .(5)[304:ueventd]=====FG===== actural VOLT = 4317
<4>[    4.295350] .(5)[304:ueventd]temp_now=193, temp_last=193 
<4>[    4.296042] .(5)[304:ueventd]=====FG===== TEMP = 193
<4>[    4.297474] .(5)[304:ueventd]=====FG===== SOC  = 100
<4>[    4.298650] .(5)[304:ueventd]bq27542_set_commands cmd = 0x12, val = 3813 
<4>[    4.300053] .(5)[304:ueventd]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    4.301470] .(5)[304:ueventd]bq27542_set_commands cmd = 0xc, val = 3952 
<14>[    4.326080] .(5)[304:ueventd]selinux: SELinux: Loaded file_contexts
<14>[    4.326080] 
<3>[    4.512683] .(3)[257:kworker/3:1]CDP, timeout
<4>[    4.568670] -(3)[257:kworker/3:1]usb_6763_dpidle_request: 5 callbacks suppressed
<5>[    4.568677] -(3)[257:kworker/3:1][MUSB]usb_6763_dpidle_request 120: USB_DPIDLE_FORBIDDEN, skip_cnt<5>
<4>[    4.570909] -(3)[257:kworker/3:1]usb_6763_dpidle_request: 5 callbacks suppressed
<5>[    4.570912] -(3)[257:kworker/3:1][MUSB]usb_6763_dpidle_request 113: USB_DPIDLE_ALLOWED, skip_cnt<5>
<5>[    4.573048] .(3)[257:kworker/3:1][MUSB]Charger_Detect_Init 729: Charger_Detect_Init
<4>[    4.770031] .(4)[266:charger_thread]TempToCurrent no charge on
<14>[    4.791556] .(5)[304:ueventd]ueventd: Coldboot took 0.582 seconds
<14>[    4.794809] .(0)[1:init]init: Command 'wait_for_coldboot_done' action=wait_for_coldboot_done (<Builtin Action>:0) returned 0 took 598ms.
<14>[    4.796481] .(0)[1:init]init: processing action (mix_hwrng_into_linux_rng) from (<Builtin Action>:0)
<11>[    4.797701] .(0)[1:init]init: /dev/hw_random not found
<14>[    4.798398] .(0)[1:init]init: processing action (set_mmap_rnd_bits) from (<Builtin Action>:0)
<14>[    4.800168] .(0)[1:init]init: processing action (set_kptr_restrict) from (<Builtin Action>:0)
<14>[    4.801439] .(0)[1:init]init: processing action (keychord_init) from (<Builtin Action>:0)
<11>[    4.802549] .(0)[1:init]init: could not open /dev/keychord: No such file or directory
<14>[    4.803576] .(0)[1:init]init: processing action (console_init) from (<Builtin Action>:0)
<14>[    4.804753] .(0)[1:init]init: processing action (init) from (/init.rc:44)
<11>[    4.805888] .(0)[1:init]init: Unable to open '/default.prop': Too many symbolic links encountered
<11>[    4.818219] .(0)[1:init]init: Unable to open '/proc/sys/kernel/hung_task_timeout_secs': No such file or directory
<11>[    4.819567] .(0)[1:init]init: Unable to open '/proc/cpu/alignment': No such file or directory
<5>[    4.824932] .(3)[257:kworker/3:1][MUSB]Charger_Detect_Release 762: Charger_Detect_Release
<3>[    4.825988] .(3)[257:kworker/3:1]charger type: 2, Charging USB Host
<3>[    4.826799] .(3)[257:kworker/3:1]chrdet_inform_psy_changed: online = 1, charger type = 2
<3>[    4.827841] .(3)[257:kworker/3:1]chrdet_inform_psy_changed g_factory_ext_is_usb_charge_lock is 0 !!!
<3>[    4.827841] 
<6>[    4.828781] .(3)[257:kworker/3:1]mt_charger_set_property
<6>[    4.829488] .(3)[257:kworker/3:1]mt_charger_set_property
<3>[    4.830182] .(3)[257:kworker/3:1]dump_charger_name: charger type: 2, Charging USB Host
<5>[    4.831202] .(3)[257:kworker/3:1][MUSB]mt_usb_connect 517: issue work
<5>[    4.832057] .(3)[257:kworker/3:1][MUSB]mt_usb_connect 519: [MUSB] USB connect
<5>[    4.832076] .(2)[233:kworker/u16:5][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<5>[    4.834134] .(0)[1:init]Registered swp emulation handler
<11>[    4.834312] .(0)[1:init]init: Unable to open '/sys/class/leds/vibrator/trigger': No such file or directory
<14>[    4.834872] .(0)[1:init]init: processing action (init) from (/init.environ.rc:2)
<14>[    4.834975] .(0)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.mt6763.rc:25)
<11>[    4.838419] .(0)[1:init]init: Unable to open '/dev/cpuctl/bg_non_interactive/cpu.rt_runtime_us': No such file or directory
<14>[    4.838459] .(0)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.mt6763.rc:1148)
<14>[    4.838977] .(0)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.project.rc:5)
<14>[    4.840121] .(0)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.datalogic.rc:3)
<6>[    4.841051] .(0)[1:init][D][Factory Data](property_reload): id = 0 
<6>[    4.841062] .(0)[1:init][D][Factory Data](jprkernel_read_from_storage): +
<6>[    4.842395] .(1)[1:init][D][Factory Data](_factory_update_revision): +
<6>[    4.842402] .(1)[1:init][I][Factory Data](_factory_update_revision): Factory Data is REV3 - wrapper size 37 - data_size 304
<6>[    4.842406] .(1)[1:init][D][Factory Data](check_valid_data): +
<6>[    4.842408] .(1)[1:init][D][Factory Data](factory_data_check_crc32): +
<6>[    4.842417] .(1)[1:init][D][Factory Data](factory_data_check_crc32): factory_data: computed crc = 9270c0a5
<6>[    4.842420] .(1)[1:init][I][Factory Data](factory_data_check_crc32): CRC32 check passed!
<6>[    4.842423] .(1)[1:init][D][Factory Data](check_valid_data): OK
<6>[    4.842425] .(1)[1:init][D][Factory Data](check_valid_data): +
<6>[    4.842428] .(1)[1:init][D][Factory Data](factory_data_check_crc32): +
<6>[    4.842431] .(1)[1:init][D][Factory Data](factory_data_check_crc32): factory_data: computed crc = 9270c0a5
<6>[    4.842434] .(1)[1:init][I][Factory Data](factory_data_check_crc32): CRC32 check passed!
<6>[    4.842436] .(1)[1:init][D][Factory Data](check_valid_data): OK
<6>[    4.842438] .(1)[1:init][I][Factory Data](_factory_read_partition): OK
<6>[    4.843618] .(1)[1:init][D][Factory Ext Data](property_reload): id = 0 
<6>[    4.843624] .(1)[1:init][D][Factory Ext Data](kernel_read_from_storage): +
<6>[    4.844367] .(1)[1:init][D][Factory Ext Data](_factory_ext_update_revision): +
<6>[    4.844371] .(1)[1:init][I][Factory Ext Data](_factory_ext_update_revision): Factory Data is REV0 - wrapper size 7 - data_size 16
<6>[    4.844375] .(1)[1:init][D][Factory Ext Data](check_valid_data): +
<6>[    4.844377] .(1)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): +
<6>[    4.844382] .(1)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): factory_ext_data: computed crc = ecbb4b55
<6>[    4.844385] .(1)[1:init][I][Factory Ext Data](factory_ext_data_check_crc32): CRC32 check passed!
<6>[    4.844387] .(1)[1:init][D][Factory Ext Data](check_valid_data): OK
<6>[    4.844391] .(1)[1:init][D][Factory Ext Data](check_valid_data): +
<6>[    4.844392] .(1)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): +
<6>[    4.844395] .(1)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): factory_ext_data: computed crc = ecbb4b55
<6>[    4.844397] .(1)[1:init][I][Factory Ext Data](factory_ext_data_check_crc32): CRC32 check passed!
<6>[    4.844399] .(1)[1:init][D][Factory Ext Data](check_valid_data): OK
<6>[    4.844401] .(1)[1:init][I][Factory Ext Data](_factory_ext_read_partition): OK
<6>[    4.844404] .(1)[1:init][D][Factory Ext Data](_factory_ext_trigger_callbacks): 
<5>[    4.844408] .(1)[1:init][MUSB]factory_ext_callback_usb_data_lock 643: factory_ext_callback_usb_data_lock (id=4d, gn_boot_reason=4)
<6>[    4.844413] .(1)[1:init][D][Factory Ext Data](dl_factory_ext_callback_parse_int): -
<5>[    4.844415] .(1)[1:init][MUSB]factory_ext_callback_usb_data_lock 651: factory_ext_callback_usb_data_lock (g_factory_ext_is_usb_data_lock=0)
<5>[    4.844420] .(1)[1:init][MUSB]factory_ext_callback_usb_charge_lock 673: factory_ext_callback_usb_charge_lock (id=5d, gn_boot_reason=4)
<6>[    4.844423] .(1)[1:init][D][Factory Ext Data](dl_factory_ext_callback_parse_int): -
<5>[    4.844425] .(1)[1:init][MUSB]factory_ext_callback_usb_charge_lock 691: factory_ext_callback_usb_charge_lock (g_factory_ext_is_usb_charge_lock=0)
<5>[    4.844429] .(1)[1:init][MUSB]factory_ext_callback 636: factory_ext_callback (id=6d)
<14>[    4.844776] .(1)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.aee.rc:42)
<14>[    4.844957] .(1)[1:init]init: processing action (mix_hwrng_into_linux_rng) from (<Builtin Action>:0)
<11>[    4.844985] .(1)[1:init]init: /dev/hw_random not found
<14>[    4.845070] .(1)[1:init]init: processing action (late-init) from (/init.rc:301)
<14>[    4.845128] .(1)[1:init]init: processing action (late-init) from (/vendor/etc/init/hw/init.mt6763.rc:66)
<3>[    4.845214] .(1)[1:init]BOOTPROF:      4845.212934:INIT:late-init
<14>[    4.845451] .(1)[1:init]init: processing action (queue_property_triggers) from (<Builtin Action>:0)
<14>[    4.845545] .(1)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.mt6763.rc:101)
<3>[    4.845584] .(1)[1:init]BOOTPROF:      4845.584241:INIT:Mount_START
<14>[    4.849313] .(4)[313:init]init: [libfs_mgr]Invalid ext4 magic:0xed23 on '/dev/block/platform/bootdevice/by-name/userdata'
<11>[    4.849396] .(4)[313:init]init: [libfs_mgr]mount_with_alternatives(): skipping mount, invalid ext4, mountpoint=/data rec[2].fs_type=ext4
<11>[    4.850489] .(4)[313:init]init: [libfs_mgr]fs_mgr_mount_all(): possibly an encryptable blkdev /dev/block/platform/bootdevice/by-name/userdata for mount /data type ext4
<14>[    4.851526] .(4)[313:init]init: [libfs_mgr]superblock s_max_mnt_count:10,/dev/block/platform/bootdevice/by-name/cache
<4>[    4.852306] .(4)[313:init]EXT4-fs (mmcblk0p35): Ignoring removed nomblk_io_submit option
<6>[    4.857995] .(4)[313:init]EXT4-fs (mmcblk0p35): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.858243] .(4)[313:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/cache,/cache,ext4)=0: Success
<14>[    4.860712] .(4)[313:init]init: [libfs_mgr]check_fs(): unmount(/cache) succeeded
<14>[    4.863105] .(4)[313:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/cache
<5>[    4.878522] .(6)[316:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 54 bits of entropy available)
<5>[    4.884681] .(4)[6:kworker/u16:0][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<5>[    4.908246] .(3)[257:kworker/3:1]mtk_charger_int_handler
<5>[    4.908954] .(3)[257:kworker/3:1]wake_up_charger
<5>[    4.909588] .(3)[257:kworker/3:1]battery_callback:1
<5>[    4.909606] .(4)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    4.909638] .(4)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    4.913994] -(3)[257:kworker/3:1]mt6356_get_auxadc_value: 2 callbacks suppressed
<4>[    4.914777] .(3)[257:kworker/3:1]=====FG===== AC   = 17
<4>[    4.918530] .(3)[257:kworker/3:1]temp_now=193, temp_last=193 
<4>[    4.919287] .(3)[257:kworker/3:1]=====FG===== TEMP = 193
<4>[    4.921067] .(3)[257:kworker/3:1]=====FG===== VOLT = 4319
<4>[    4.921782] .(3)[257:kworker/3:1]=====FG===== actural VOLT = 4317
<6>[    4.922566] .(3)[257:kworker/3:1]power_supply battery: power_supply_changed
<6>[    4.923488] .(3)[257:kworker/3:1]power_supply ac: power_supply_changed
<6>[    4.924326] .(3)[257:kworker/3:1]power_supply usb: power_supply_changed
<4>[    4.925786] .(3)[257:kworker/3:1]temp_now=193, temp_last=193 
<4>[    4.926544] .(3)[257:kworker/3:1]=====FG===== TEMP = 193
<4>[    4.927784] .(3)[257:kworker/3:1]temp_now=193, temp_last=193 
<4>[    4.928539] .(3)[257:kworker/3:1]=====FG===== TEMP = 193
<4>[    4.929814] .(3)[257:kworker/3:1]=====FG===== SOC  = 100
<4>[    4.931306] .(3)[257:kworker/3:1]=====FG===== AC   = 17
<5>[    4.932700] .(2)[233:kworker/u16:5][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<4>[    4.934605] .(3)[257:kworker/3:1]=====FG===== VOLT = 4319
<4>[    4.935298] .(3)[257:kworker/3:1]=====FG===== actural VOLT = 4317
<4>[    4.936668] .(3)[257:kworker/3:1]temp_now=193, temp_last=193 
<4>[    4.937405] .(3)[257:kworker/3:1]=====FG===== TEMP = 193
<4>[    4.938691] .(3)[257:kworker/3:1]=====FG===== SOC  = 100
<4>[    4.939950] .(3)[257:kworker/3:1]bq27542_set_commands cmd = 0x12, val = 3813 
<4>[    4.941451] .(3)[257:kworker/3:1]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    4.942933] .(3)[257:kworker/3:1]bq27542_set_commands cmd = 0xc, val = 3952 
<6>[    4.950446] .(5)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    4.951715] .(5)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    4.953455] .(5)[266:charger_thread]=====FG===== AC   = 17
<4>[    4.954951] .(4)[266:charger_thread]=====FG===== AC   = 17
<5>[    4.965173] .(6)[316:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 56 bits of entropy available)
<14>[    4.992410] .(5)[313:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    4.992410] 
<14>[    4.993469] .(5)[313:init]e2fsck: cache has been mounted 10 times without being checked, check forced.
<14>[    4.993469] 
<14>[    4.994885] .(5)[313:init]e2fsck: Pass 1: Checking inodes, blocks, and sizes
<14>[    4.994885] 
<14>[    4.996004] .(5)[313:init]e2fsck: Pass 2: Checking directory structure
<14>[    4.996004] 
<4>[    4.997086] .(4)[266:charger_thread]lifetime: data[0]=1 
<4>[    4.997090] .(4)[266:charger_thread]lifetime: data[1]=df 
<4>[    4.997093] .(4)[266:charger_thread]lifetime: data[2]=ff 
<4>[    4.997098] .(4)[266:charger_thread]lifetime: data[3]=40 
<4>[    4.997100] .(4)[266:charger_thread]lifetime: data[4]=11 
<4>[    4.997102] .(4)[266:charger_thread]lifetime: data[5]=45 
<4>[    4.997104] .(4)[266:charger_thread]lifetime: data[6]=a 
<4>[    4.997106] .(4)[266:charger_thread]lifetime: data[7]=fc 
<4>[    4.997107] .(4)[266:charger_thread]lifetime: data[8]=8 
<4>[    4.997109] .(4)[266:charger_thread]lifetime: data[9]=68 
<4>[    4.997111] .(4)[266:charger_thread]lifetime: data[10]=f7 
<4>[    4.997112] .(4)[266:charger_thread]lifetime: data[11]=18 
<4>[    4.998685] .(4)[266:charger_thread]=====FG-MTK===== bat_vol=4336
<4>[    5.003409] .(4)[266:charger_thread]=====FG===== AC   = 17
<5>[    5.003627] .(4)[266:charger_thread]Vbat=4336,Ibat=17,I=0,VChr=4730,T=25,Soc=0:0,CT:2:0 hv:1 pd:0:0
<5>[    5.003631] .(4)[266:charger_thread][mtk_is_charger_on]info->chr_type=0 
<5>[    5.003634] .(4)[266:charger_thread]mtk_charger_plug_in plug in, type:2
<5>[    5.003640] .(4)[266:charger_thread]battery_callback:1
<4>[    5.008226] .(4)[266:charger_thread]temp_now=193, temp_last=193 
<4>[    5.008229] .(4)[266:charger_thread]=====FG===== TEMP = 193
<4>[    5.011443] .(4)[266:charger_thread]=====FG===== VOLT = 4319
<4>[    5.011445] .(4)[266:charger_thread]=====FG===== actural VOLT = 4317
<6>[    5.011452] .(4)[266:charger_thread]power_supply battery: power_supply_changed
<6>[    5.011471] .(4)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_plug_in
<6>[    5.011476] .(4)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_wdt: en = 1
<4>[    5.012068] .(4)[71:kworker/4:1]temp_now=193, temp_last=193 
<4>[    5.012071] .(4)[71:kworker/4:1]=====FG===== TEMP = 193
<4>[    5.012618] .(4)[71:kworker/4:1]temp_now=193, temp_last=193 
<4>[    5.012620] .(4)[71:kworker/4:1]=====FG===== TEMP = 193
<4>[    5.012927] .(4)[266:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    5.013321] .(4)[71:kworker/4:1]=====FG===== SOC  = 100
<4>[    5.014081] .(4)[71:kworker/4:1]=====FG===== AC   = 17
<4>[    5.016901] .(4)[71:kworker/4:1]=====FG===== VOLT = 4319
<4>[    5.016903] .(4)[71:kworker/4:1]=====FG===== actural VOLT = 4317
<4>[    5.018324] .(6)[266:charger_thread]temp_now=193, temp_last=193 
<4>[    5.018327] .(6)[266:charger_thread]=====FG===== TEMP = 193
<5>[    5.018329] .(6)[266:charger_thread]charger_check_status
<4>[    5.018874] .(4)[71:kworker/4:1]temp_now=193, temp_last=193 
<4>[    5.018877] .(4)[71:kworker/4:1]=====FG===== TEMP = 193
<4>[    5.019414] .(4)[71:kworker/4:1]=====FG===== SOC  = 100
<4>[    5.019961] .(4)[71:kworker/4:1]bq27542_set_commands cmd = 0x12, val = 3813 
<4>[    5.020516] .(4)[71:kworker/4:1]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    5.021062] .(4)[71:kworker/4:1]bq27542_set_commands cmd = 0xc, val = 3952 
<14>[    5.030430] .(5)[313:init]e2fsck: Pass 3: Checking directory connectivity
<14>[    5.030430] 
<14>[    5.031519] .(5)[313:init]e2fsck: Pass 4: Checking reference counts
<14>[    5.031519] 
<14>[    5.032549] .(5)[313:init]e2fsck: Pass 5: Checking group summary information
<14>[    5.032549] 
<14>[    5.033707] .(5)[313:init]e2fsck: cache: 14/27648 files (0.0% non-contiguous), 3570/110592 blocks
<14>[    5.033707] 
<6>[    5.037741] .(4)[313:init]EXT4-fs (mmcblk0p35): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<14>[    5.039408] .(4)[313:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/cache,target=/cache,type=ext4)=0: Success
<14>[    5.042053] .(4)[313:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/protect1
<4>[    5.044203] .(4)[313:init]EXT4-fs (mmcblk0p13): Ignoring removed nomblk_io_submit option
<6>[    5.047397] .(4)[313:init]EXT4-fs (mmcblk0p13): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    5.049679] .(4)[313:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/protect1,/vendor/protect_f,ext4)=0: Success
<14>[    5.052239] .(4)[313:init]init: [libfs_mgr]check_fs(): unmount(/vendor/protect_f) succeeded
<14>[    5.053404] .(4)[313:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/protect1
<5>[    5.056975] .(6)[323:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 58 bits of entropy available)
<5>[    5.063964] .(5)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    5.066614] .(5)[266:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[    5.067477] .(5)[266:charger_thread]charger_check_status tmp:19 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    5.068546] .(6)[323:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 58 bits of entropy available)
<4>[    5.073224] .(5)[266:charger_thread]random message:10 
<4>[    5.074254] .(5)[266:charger_thread]random message:b7 
<4>[    5.075297] .(4)[266:charger_thread]random message:d8 
<14>[    5.076180] .(6)[313:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    5.076180] 
<4>[    5.077174] .(4)[266:charger_thread]random message:e 
<4>[    5.077876] .(4)[266:charger_thread]random message:92 
<14>[    5.077897] .(6)[313:init]e2fsck: /dev/block/platform/bootdevice/by-name/protect1: clean, 165/2048 files, 1268/2048 blocks
<14>[    5.077897] 
<4>[    5.080530] .(4)[266:charger_thread]random message:9b 
<4>[    5.081590] .(5)[266:charger_thread]random message:2b 
<4>[    5.082621] .(4)[266:charger_thread]random message:b 
<6>[    5.083430] .(4)[313:init]EXT4-fs (mmcblk0p13): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<4>[    5.084966] .(5)[266:charger_thread]random message:be 
<4>[    5.085661] .(5)[266:charger_thread]random message:16 
<14>[    5.086526] .(6)[313:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/protect1,target=/vendor/protect_f,type=ext4)=0: Success
<4>[    5.088282] .(5)[266:charger_thread]random message:37 
<14>[    5.089238] .(4)[313:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/protect2
<4>[    5.090678] .(5)[266:charger_thread]random message:94 
<4>[    5.091684] .(5)[266:charger_thread]random message:56 
<4>[    5.092399] .(4)[313:init]EXT4-fs (mmcblk0p14): Ignoring removed nomblk_io_submit option
<4>[    5.092701] .(5)[266:charger_thread]random message:88 
<4>[    5.093030] .(5)[266:charger_thread]random message:77 
<4>[    5.093357] .(5)[266:charger_thread]random message:44 
<4>[    5.094161] .(5)[266:charger_thread]random message:2d 
<4>[    5.094828] .(5)[266:charger_thread]random message:7e 
<4>[    5.095497] .(5)[266:charger_thread]random message:82 
<4>[    5.096170] .(5)[266:charger_thread]random message:ce 
<6>[    5.100131] .(5)[313:init]EXT4-fs (mmcblk0p14): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    5.102461] .(5)[313:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/protect2,/vendor/protect_s,ext4)=0: Success
<14>[    5.105030] .(5)[313:init]init: [libfs_mgr]check_fs(): unmount(/vendor/protect_s) succeeded
<14>[    5.106133] .(5)[313:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/protect2
<5>[    5.109619] .(6)[328:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 59 bits of entropy available)
<5>[    5.121021] .(6)[328:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 59 bits of entropy available)
<14>[    5.129066] .(6)[313:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    5.129066] 
<14>[    5.130057] .(6)[313:init]e2fsck: /dev/block/platform/bootdevice/by-name/protect2: clean, 16/3200 files, 1147/3191 blocks
<14>[    5.130057] 
<6>[    5.134308] .(5)[313:init]EXT4-fs (mmcblk0p14): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    5.136522] .(5)[313:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/protect2,target=/vendor/protect_s,type=ext4)=0: Success
<14>[    5.139262] .(5)[313:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/nvdata
<4>[    5.141414] .(5)[313:init]EXT4-fs (mmcblk0p11): Ignoring removed nomblk_io_submit option
<6>[    5.145350] .(5)[313:init]EXT4-fs (mmcblk0p11): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    5.147595] .(5)[313:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/nvdata,/vendor/nvdata,ext4)=0: Success
<14>[    5.150176] .(5)[313:init]init: [libfs_mgr]check_fs(): unmount(/vendor/nvdata) succeeded
<14>[    5.151245] .(5)[313:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/nvdata
<5>[    5.154718] .(6)[333:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 60 bits of entropy available)
<4>[    5.160699] .(3)[257:kworker/3:1][SLhall]SLhall_setup_eint
<4>[    5.161417] .(3)[257:kworker/3:1]****Close******** 
<4>[    5.163381] .(3)[257:kworker/3:1]****mt_gpio_set_debounce,gpiopin=5, debounce=0*** 
<4>[    5.164451] .(3)[257:kworker/3:1][Hall]Hall set EINT finished, hall_irq=677, halldebounce=0 
<4>[    5.165602] -(3)[257:kworker/3:1]hall for switching 10W of WLC ===****far away******** 
<5>[    5.166033] .(6)[333:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 60 bits of entropy available)
<4>[    5.167967] -(3)[257:kworker/3:1] ~~~kpd_send_wlcoff_msg slid=1!!
<4>[    5.168766] -(3)[257:kworker/3:1] ~~~kpd_send_wlcoff_msg slid=0!!
<4>[    5.169562] -(3)[257:kworker/3:1][EINT]Warn!EINT:5 run too long,s:5165550935,e:5169561165,total:4010230
<4>[    5.169574] .(4)[231:kworker/u16:3]****Open******** 
<4>[    5.169579] .(4)[231:kworker/u16:3][wc_rect_en] state=1
<4>[    5.172109] -(3)[257:kworker/3:1]------------[ cut here ]------------
<14>[    5.172781] .(4)[313:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    5.172781] 
<14>[    5.172813] .(4)[313:init]e2fsck: /dev/block/platform/bootdevice/by-name/nvdata: clean, 422/16384 files, 2126/16384 blocks
<14>[    5.172813] 
<4>[    5.175524] -(3)[257:kworker/3:1]WARNING: CPU: 3 PID: 257 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:605 irq_set_irq_wake+0x100/0x140()
<4>[    5.177349] -(3)[257:kworker/3:1]Unbalanced IRQ 677 wake disable
<4>[    5.178131] -(3)[257:kworker/3:1]Modules linked in: fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    5.179065] -(3)[257:kworker/3:1]CPU: 3 PID: 257 Comm: kworker/3:1 Tainted: G        W  O    4.4.95+ #2
<4>[    5.180267] -(3)[257:kworker/3:1]Hardware name: MT6763V/B (DT)
<4>[    5.181038] -(3)[257:kworker/3:1]Workqueue: hall_delay hall_delay_func
<4>[    5.181613] -(3)[257:kworker/3:1]Call trace:
<4>[    5.182175] -(3)[257:kworker/3:1][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    5.183109] -(3)[257:kworker/3:1][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    5.183997] -(3)[257:kworker/3:1][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    5.184887] -(3)[257:kworker/3:1][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    5.185885] -(3)[257:kworker/3:1][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    5.186850] -(3)[257:kworker/3:1][<ffffff800810b5b0>] irq_set_irq_wake+0x100/0x140
<4>[    5.187826] -(3)[257:kworker/3:1][<ffffff80087eccdc>] hall_delay_func+0x18c/0xa58
<4>[    5.188791] -(3)[257:kworker/3:1][<ffffff80080bda10>] process_one_work+0x1d0/0x468
<4>[    5.189767] -(3)[257:kworker/3:1][<ffffff80080bddd8>] worker_thread+0x130/0x4e0
<4>[    5.190711] -(3)[257:kworker/3:1][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    5.191579] -(3)[257:kworker/3:1][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    5.192501] -(3)[257:kworker/3:1]---[ end trace 911ba04329a1ff3b ]---
<4>[    5.193382] .(3)[257:kworker/3:1]Scanner_setup_eint
<4>[    5.194027] .(3)[257:kworker/3:1]Scanner_Close******** 
<4>[    5.194712] .(3)[257:kworker/3:1] @@@kpd_send_Scanner_key_msg slid=1!!
<6>[    5.196631] .(4)[313:init]EXT4-fs (mmcblk0p11): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<4>[    5.196715] .(3)[257:kworker/3:1]****mt_gpio_set_debounce,gpiopin=12, debounce=10000*** 
<4>[    5.196746] -(3)[257:kworker/3:1]Scanner_cur_gpio_state = 0 
<4>[    5.196751] -(3)[257:kworker/3:1]Scanner left key release up******** 
<4>[    5.196753] -(3)[257:kworker/3:1] @@@kpd_send_Scanner_key_msg slid=0!!
<4>[    5.196783] .(3)[257:kworker/3:1][Scanner]Scanner set EINT finished, Scanner_irq=684, Scannerdebounce=10000 
<4>[    5.196789] .(3)[257:kworker/3:1]Buttonup_setup_eint
<4>[    5.196793] .(3)[257:kworker/3:1]****Close******** 
<4>[    5.196795] .(3)[257:kworker/3:1] $$$kpd_send_old_slid_msg slid=0!!
<4>[    5.196885] .(3)[257:kworker/3:1]****mt_gpio_set_debounce,gpiopin=71, debounce=0*** 
<4>[    5.196917] .(3)[257:kworker/3:1][Buttonup]Buttonup set EINT finished, Buttonup_irq=743, Buttonupdebounce=0 
<4>[    5.196927] .(3)[257:kworker/3:1][SLhall]SLhall_setup_eint
<4>[    5.196931] .(3)[257:kworker/3:1]****Close******** 
<4>[    5.196933] .(3)[257:kworker/3:1] ===kpd_send_old_slid_msg slid=1!!
<4>[    5.198008] .(3)[257:kworker/3:1]****mt_gpio_set_debounce,gpiopin=2, debounce=0*** 
<4>[    5.198040] .(3)[257:kworker/3:1][Hall]Hall set EINT finished, hall_irq=677, halldebounce=0 
<4>[    5.198045] .(3)[257:kworker/3:1]Scanner_right_setup_eint
<4>[    5.198047] .(3)[257:kworker/3:1]Scanner_right_Close******** 
<4>[    5.198050] .(3)[257:kworker/3:1] @@@kpd_send_Scanner_right_key_msg slid=1!!
<4>[    5.198053] -(4)[313:init]hall for pistol ===****far away******** 
<4>[    5.198057] -(4)[313:init] ===kpd_send_old_slid_msg slid=0!!
<4>[    5.199132] .(3)[257:kworker/3:1]****mt_gpio_set_debounce,gpiopin=6, debounce=10000*** 
<4>[    5.199154] -(3)[257:kworker/3:1]Scanner_right_cur_gpio_state = 0 
<4>[    5.199159] -(3)[257:kworker/3:1]Scanner right key release up******** 
<4>[    5.199161] -(3)[257:kworker/3:1] @@@kpd_send_Scanner_right_key_msg slid=0!!
<4>[    5.199184] .(3)[257:kworker/3:1][Scanner]Scanner set EINT finished, Scanner_right_irq=678, Scannerrightdebounce=10000 
<4>[    5.199188] .(3)[257:kworker/3:1][wc_pmode]wc_pmode_setup_eint
<4>[    5.199193] .(3)[257:kworker/3:1]****Close******** 
<4>[    5.200267] .(3)[257:kworker/3:1]****mt_gpio_set_debounce,gpiopin=9, debounce=0*** 
<4>[    5.200298] .(3)[257:kworker/3:1][wc_pmode]wc_pmode set EINT finished, hall_irq=681, halldebounce=0 
<4>[    5.200307] -(3)[257:kworker/3:1]appear eint for closing otg when WLC ****High******** 
<4>[    5.200314] -(3)[257:kworker/3:1]------------[ cut here ]------------
<4>[    5.200316] -(3)[257:kworker/3:1]WARNING: CPU: 3 PID: 257 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:605 irq_set_irq_wake+0x100/0x140()
<4>[    5.200324] -(3)[257:kworker/3:1]Unbalanced IRQ 681 wake disable
<4>[    5.200332] -(3)[257:kworker/3:1]Modules linked in: fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    5.200334] -(3)[257:kworker/3:1]CPU: 3 PID: 257 Comm: kworker/3:1 Tainted: G        W  O    4.4.95+ #2
<4>[    5.200337] -(3)[257:kworker/3:1]Hardware name: MT6763V/B (DT)
<4>[    5.200347] -(3)[257:kworker/3:1]Workqueue: hall_delay hall_delay_func
<4>[    5.200348] -(3)[257:kworker/3:1]Call trace:
<4>[    5.200350] -(3)[257:kworker/3:1][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    5.200355] -(3)[257:kworker/3:1][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    5.200360] -(3)[257:kworker/3:1][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    5.200366] -(3)[257:kworker/3:1][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    5.200372] -(3)[257:kworker/3:1][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    5.200377] -(3)[257:kworker/3:1][<ffffff800810b5b0>] irq_set_irq_wake+0x100/0x140
<4>[    5.200380] -(3)[257:kworker/3:1][<ffffff80087ed2ec>] hall_delay_func+0x79c/0xa58
<4>[    5.200385] -(3)[257:kworker/3:1][<ffffff80080bda10>] process_one_work+0x1d0/0x468
<4>[    5.200390] -(3)[257:kworker/3:1][<ffffff80080bddd8>] worker_thread+0x130/0x4e0
<4>[    5.200394] -(3)[257:kworker/3:1][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    5.200399] -(3)[257:kworker/3:1][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    5.200404] -(3)[257:kworker/3:1]---[ end trace 911ba04329a1ff3c ]---
<4>[    5.200662] -(3)[0:swapper/3]Latch****Close******** 
<4>[    5.200665] -(3)[0:swapper/3] $$$kpd_send_old_slid_msg slid=0!!
<4>[    5.208572] .(5)[266:charger_thread]data[0]: 99 
<4>[    5.208576] .(5)[266:charger_thread]data[1]: 90 
<4>[    5.208578] .(5)[266:charger_thread]data[2]: 5a 
<4>[    5.208579] .(5)[266:charger_thread]data[3]: 48 
<4>[    5.208581] .(5)[266:charger_thread]data[4]: 60 
<4>[    5.208583] .(5)[266:charger_thread]data[5]: 1f 
<4>[    5.208584] .(5)[266:charger_thread]data[6]: c3 
<4>[    5.208586] .(5)[266:charger_thread]data[7]: 52 
<4>[    5.208587] .(5)[266:charger_thread]data[8]: ff 
<4>[    5.208589] .(5)[266:charger_thread]data[9]: 40 
<4>[    5.208591] .(5)[266:charger_thread]data[10]: 56 
<4>[    5.208592] .(5)[266:charger_thread]data[11]: 96 
<4>[    5.208594] .(5)[266:charger_thread]data[12]: 4d 
<4>[    5.208596] .(5)[266:charger_thread]data[13]: 48 
<4>[    5.208598] .(5)[266:charger_thread]data[14]: 9a 
<4>[    5.208599] .(5)[266:charger_thread]data[15]: 49 
<4>[    5.208605] .(5)[266:charger_thread]result: c8ee2a15, 499a484d, 965640ff, 52c31f60, 485a9099 
<4>[    5.208608] .(5)[266:charger_thread]SHA-1 check passed
<5>[    5.208612] .(5)[266:charger_thread]mtk_switch_charging_run [1 0], timer=0
<5>[    5.258425] .(6)[266:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:25,39,16 pps:0 en:0 ibus:0 80
<5>[    5.259631] .(6)[266:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<14>[    5.259822] .(5)[313:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/nvdata,target=/vendor/nvdata,type=ext4)=0: Success
<5>[    5.262398] .(6)[266:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<14>[    5.262461] .(4)[313:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/nvcfg
<4>[    5.263462] .(5)[313:init]EXT4-fs (mmcblk0p10): Ignoring removed nomblk_io_submit option
<6>[    5.267198] .(5)[313:init]EXT4-fs (mmcblk0p10): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<5>[    5.267461] .(6)[266:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<4>[    5.267589] .(6)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.267596] .(6)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.267602] .(6)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.267775] .(6)[266:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=1 mtk_charger_hall_1_eint=0
<4>[    5.268105] .(6)[266:charger_thread]cc1=5 cc2=0
<6>[    5.268112] .(6)[266:charger_thread]power_supply ac: power_supply_changed
<6>[    5.268128] .(6)[266:charger_thread]power_supply usb: power_supply_changed
<4>[    5.268774] .(6)[266:charger_thread]temp_now=193, temp_last=193 
<4>[    5.268778] .(6)[266:charger_thread]=====FG===== TEMP = 193
<4>[    5.274018] .(6)[266:charger_thread]=====FG===== VOLT = 4323
<4>[    5.274021] .(6)[266:charger_thread]=====FG===== actural VOLT = 4326
<4>[    5.276075] .(6)[266:charger_thread]=====FG===== AC   = -26
<4>[    5.277847] .(6)[266:charger_thread]=====FG===== SOC  = 100
<4>[    5.279355] .(6)[266:charger_thread]=====FG===== SOH  = 100
<4>[    5.279357] .(6)[266:charger_thread]DLCP bat_vol=4326,  temperature=193  
<4>[    5.279360] .(6)[266:charger_thread] ===CC_value from battery temprature=700000
<4>[    5.279365] .(6)[266:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<4>[    5.281649] .(6)[266:charger_thread]DLCP mt6370_set_vrech       = 300
<4>[    5.285806] .(6)[266:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[    5.285809] .(6)[266:charger_thread]DLCP read cv              = 4350000
<4>[    5.285811] .(6)[266:charger_thread]DLCP read eoc             = 150000
<4>[    5.285812] .(6)[266:charger_thread]DLCP read recharge        = 300
<4>[    5.285814] .(6)[266:charger_thread]DLCP Target Temp          = 410
<4>[    5.285816] .(6)[266:charger_thread]DLCP Charge Current       = 2000
<4>[    5.285818] .(6)[266:charger_thread]DLPID 
<4>[    5.285819] .(6)[266:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    5.285821] .(6)[266:charger_thread]DLPID PID Target Temp = 410 
<4>[    5.285823] .(6)[266:charger_thread]DLPID Battery Temp    = 193 
<4>[    5.285825] .(6)[266:charger_thread]DLPID TEMP DIFF       = 108 
<4>[    5.285826] .(6)[266:charger_thread]DLPID PID KI          = 5000 
<4>[    5.285828] .(6)[266:charger_thread]DLPID CC MAX          = 700000 
<4>[    5.285830] .(6)[266:charger_thread]DLPID PID Current     = 540000 
<4>[    5.285831] .(6)[266:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[    5.285833] .(6)[266:charger_thread]DLCP ccurrent from battery temprature = 700000
<4>[    5.285835] .(6)[266:charger_thread]DLCP ccurrent from PID algorithm      = 540000
<4>[    5.285837] .(6)[266:charger_thread]DLCP ccurrent from DLPL               = 2000000
<4>[    5.285840] .(6)[266:charger_thread]DLCP set input current:500000 
<4>[    5.286707] .(6)[266:charger_thread]DLCP set charge current: 500000 
<4>[    5.290003] .(6)[266:charger_thread]DLCP __mt6370_set_ieoc      = 250000
<4>[    5.292182] .(6)[266:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    5.294067] .(6)[266:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[    5.294071] .(6)[266:charger_thread]DLCP __mt6370_set_cv       = 4350000
<4>[    5.295623] .(6)[266:charger_thread]DLCP mt6370_enable_charging :1 
<14>[    5.308937] .(4)[313:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/nvcfg,/vendor/nvcfg,ext4)=0: Success
<14>[    5.311497] .(4)[313:init]init: [libfs_mgr]check_fs(): unmount(/vendor/nvcfg) succeeded
<14>[    5.312559] .(4)[313:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/nvcfg
<14>[    5.332524] .(5)[313:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    5.332524] 
<14>[    5.333571] .(5)[313:init]e2fsck: /dev/block/platform/bootdevice/by-name/nvcfg: clean, 18/8192 files, 1300/8192 blocks
<14>[    5.333571] 
<6>[    5.337735] .(4)[313:init]EXT4-fs (mmcblk0p10): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    5.339943] .(4)[313:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/nvcfg,target=/vendor/nvcfg,type=ext4)=0: Success
<14>[    5.342539] .(4)[313:init]init: [libfs_mgr]superblock s_max_mnt_count:10,/dev/block/platform/bootdevice/by-name/enterprise
<4>[    5.344672] .(4)[313:init]EXT4-fs (mmcblk0p7): Ignoring removed nomblk_io_submit option
<4>[    5.348530] .(5)[313:init]EXT4-fs (mmcblk0p7): warning: maximal mount count reached, running e2fsck is recommended
<6>[    5.350648] .(4)[313:init]EXT4-fs (mmcblk0p7): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    5.352466] .(4)[313:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/enterprise,/enterprise,ext4)=0: Success
<14>[    5.355025] .(5)[313:init]init: [libfs_mgr]check_fs(): unmount(/enterprise) succeeded
<14>[    5.356065] .(5)[313:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/enterprise
<5>[    5.372951] .(6)[343:e2fsck]audit: type=1400 audit(1578646633.810:4): avc:  denied  { read } for  pid=343 comm="e2fsck" name="mmcblk0p7" dev="tmpfs" ino=9517 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
<5>[    5.375763] .(6)[343:e2fsck]audit: type=1400 audit(1578646633.810:5): avc:  denied  { read write } for  pid=343 comm="e2fsck" name="mmcblk0p7" dev="tmpfs" ino=9517 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
<14>[    5.379715] .(4)[313:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    5.379715] 
<14>[    5.380755] .(4)[313:init]e2fsck: /system/bin/e2fsck: Permission denied while trying to open /dev/block/platform/bootdevice/by-name/enterprise
<14>[    5.380755] 
<14>[    5.382598] .(4)[313:init]e2fsck: 
<14>[    5.382598] 
<14>[    5.383264] .(4)[313:init]e2fsck: You must have r/w access to the filesystem or be root
<14>[    5.383264] 
<14>[    5.384516] .(4)[313:init]e2fsck: e2fsck terminated by exit(8)
<14>[    5.384516] 
<14>[    5.385710] .(4)[313:init]init: [libfs_mgr]e2fsck returned status 0x800
<4>[    5.389919] .(5)[313:init]EXT4-fs (mmcblk0p7): warning: maximal mount count reached, running e2fsck is recommended
<6>[    5.391940] .(4)[313:init]EXT4-fs (mmcblk0p7): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<14>[    5.393527] .(4)[313:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/enterprise,target=/enterprise,type=ext4)=0: Success
<14>[    5.396376] .(5)[1:init]init: Parsing file /odm/etc/init...
<11>[    5.397181] .(5)[1:init]init: Unable to open '/odm/etc/init': No such file or directory
<14>[    5.398277] .(5)[1:init]init: Command 'mount_all /vendor/etc/fstab.mt6763' action=fs (/vendor/etc/init/hw/init.mt6763.rc:113) returned 2 took 552ms.
<14>[    5.402031] .(4)[1:init]init: starting service 'exec 1 (/system/bin/tune2fs -O has_journal -u 10010 -r 4096 /dev/block/platform/bootdevice/by-name/userdata)'...
<14>[    5.404899] .(4)[1:init]init: SVC_EXEC pid 346 (uid 0 gid 0+0 context default) started; waiting...
<14>[    5.426302] .(4)[1:init]init: Service 'exec 1 (/system/bin/tune2fs -O has_journal -u 10010 -r 4096 /dev/block/platform/bootdevice/by-name/userdata)' (pid 346) killed by signal 1 waiting took 0.026000 seconds
<3>[    5.429112] .(4)[1:init]BOOTPROF:      5429.111397:INIT:Mount_END
<6>[    5.431417] .(4)[1:init]zram0: detected capacity change from 0 to 1073741824
<14>[    5.460710] .(6)[1:init]mkswap: Swapspace size: 1048572k, UUID=80dd91c4-abde-4be6-b49b-9799be093c67
<6>[    5.462537] .(6)[1:init]Adding 1048572k swap on /dev/block/zram0.  Priority:-1 extents:1 across:1048572k SS
<14>[    5.463952] .(6)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.mt6763.rc:121)
<7>[    5.467379] .(4)[1:init]ISO 9660 Extensions: RRIP_1991A
<14>[    5.467760] .(4)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.project.rc:10)
<14>[    5.469834] .(4)[1:init]init: processing action (fs) from (/system/etc/init/logd.rc:18)
<14>[    5.471502] .(4)[1:init]init: processing action (fs) from (/system/etc/init/wifi-events.rc:17)
<14>[    5.472731] .(4)[1:init]init: PropSet [sys.wifitracing.started]=[0] Done
<14>[    5.473686] .(4)[1:init]init: processing action (post-fs) from (/init.rc:334)
<14>[    5.475933] .(4)[1:init]init: PropSet [rild.libpath]=[mtk-ril.so] Done
<14>[    5.476833] .(4)[1:init]init: PropSet [rild.libargs]=[-d /dev/ttyC0] Done
<14>[    5.477713] .(4)[1:init]init: PropSet [wifi.interface]=[wlan0] Done
<14>[    5.478545] .(4)[1:init]init: PropSet [mediatek.wlan.ctia]=[0] Done
<14>[    5.479362] .(4)[1:init]init: PropSet [wifi.tethering.interface]=[ap0] Done
<14>[    5.480271] .(4)[1:init]init: PropSet [wifi.direct.interface]=[p2p0] Done
<14>[    5.481251] .(4)[1:init]init: PropSet [sys.ipo.pwrdncap]=[2] Done
<14>[    5.482102] .(4)[1:init]init: PropSet [qemu.hw.mainkeys]=[1] Done
<14>[    5.482940] .(4)[1:init]init: PropSet [sys.ipo.disable]=[1] Done
<14>[    5.483722] .(4)[1:init]init: PropSet [net.hostname]=[MEMOR10] Done
<14>[    5.484546] .(4)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[    5.485583] .(4)[1:init]init: PropSet [dalvik.vm.isa.arm64.variant]=[cortex-a53] Done
<14>[    5.486595] .(4)[1:init]init: PropSet [dalvik.vm.isa.arm64.features]=[default] Done
<14>[    5.487583] .(4)[1:init]init: PropSet [dalvik.vm.isa.arm.variant]=[cortex-a53] Done
<14>[    5.488573] .(4)[1:init]init: PropSet [dalvik.vm.isa.arm.features]=[default] Done
<4>[    5.488689] .(2)[228:kworker/2:2]tx_close_wlc_setup_eint
<4>[    5.488701] .(2)[228:kworker/2:2]****High******** 
<4>[    5.488788] .(2)[228:kworker/2:2]****mt_gpio_set_debounce,gpiopin=86, debounce=128000*** 
<4>[    5.488835] .(2)[228:kworker/2:2][tx_close_wlc]tx_close_wlc set EINT finished, tx_close_wlc_irq=758, tx_close_wlcdebounce=128000 
<14>[    5.493431] .(4)[1:init]init: PropSet [net.bt.name]=[Android] Done
<14>[    5.494253] .(4)[1:init]init: PropSet [dalvik.vm.stack-trace-dir]=[/data/anr] Done
<12>[    5.495287] .(4)[1:init]init: Couldn't load property file: Unable to open '/odm/build.prop': No such file or directory: No such file or directory
<14>[    5.498198] .(4)[1:init]init: PropSet [persist.sys.timezone]=[Asia/Shanghai] Done
<14>[    5.499219] .(4)[1:init]init: PropSet [persist.radio.default.sim]=[0] Done
<14>[    5.500112] .(4)[1:init]init: PropSet [persist.radio.erlvt.on]=[1] Done
<14>[    5.501004] .(4)[1:init]init: PropSet [camera.mdp.cz.enable]=[1] Done
<14>[    5.501842] .(4)[1:init]init: PropSet [ril.specific.sm_cause]=[0] Done
<14>[    5.502687] .(4)[1:init]init: PropSet [bgw.current3gband]=[0] Done
<14>[    5.503491] .(4)[1:init]init: PropSet [ril.external.md]=[0] Done
<11>[    5.504290] .(4)[1:init]init: property_set("ro.opengles.version", "196610") failed: property already set
<14>[    5.505543] .(4)[1:init]init: PropSet [persist.radio.fd.counter]=[150] Done
<14>[    5.506446] .(4)[1:init]init: PropSet [persist.radio.fd.off.counter]=[50] Done
<14>[    5.507380] .(4)[1:init]init: PropSet [persist.radio.fd.r8.counter]=[150] Done
<14>[    5.508315] .(4)[1:init]init: PropSet [persist.radio.fd.off.r8.counter]=[50] Done
<14>[    5.509298] .(4)[1:init]init: PropSet [drm.service.enabled]=[true] Done
<14>[    5.510155] .(4)[1:init]init: PropSet [fmradio.driver.enable]=[0] Done
<14>[    5.511012] .(4)[1:init]init: PropSet [mtk.eccci.c2k]=[enabled] Done
<14>[    5.511838] .(4)[1:init]init: PropSet [ril.first.md]=[1] Done
<14>[    5.512588] .(4)[1:init]init: PropSet [ril.flightmode.poweroffMD]=[1] Done
<14>[    5.513527] .(4)[1:init]init: PropSet [ril.telephony.mode]=[0] Done
<14>[    5.514366] .(4)[1:init]init: PropSet [dalvik.vm.mtk-stack-trace-file]=[/data/anr/mtk_traces.txt] Done
<14>[    5.515574] .(4)[1:init]init: PropSet [mediatek.wlan.chip]=[CONSYS_MT6763] Done
<14>[    5.516533] .(4)[1:init]init: PropSet [mediatek.wlan.module.postfix]=[_consys_mt6763] Done
<14>[    5.517625] .(4)[1:init]init: PropSet [ril.read.imsi]=[1] Done
<14>[    5.518401] .(4)[1:init]init: PropSet [ril.radiooff.poweroffMD]=[0] Done
<14>[    5.519308] .(4)[1:init]init: PropSet [media.settings.xml]=[/vendor/etc/media_profiles.xml] Done
<14>[    5.520490] .(4)[1:init]init: PropSet [camera.mdp.dre.enable]=[0] Done
<14>[    5.521419] .(4)[1:init]init: PropSet [bt.profiles.avrcp.multiPlayer.enable]=[0] Done
<6>[    5.522437] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<14>[    5.522455] .(4)[1:init]init: PropSet [persist.radio.multisim.config]=[ss] Done
<14>[    5.522722] .(4)[1:init]init: PropSet [persist.radio.flashless.fsm]=[0] Done
<14>[    5.522739] .(4)[1:init]init: PropSet [persist.radio.flashless.fsm_cst]=[0] Done
<14>[    5.522756] .(4)[1:init]init: PropSet [persist.radio.flashless.fsm_rw]=[0] Done
<14>[    5.522877] .(4)[1:init]init: PropSet [telephony.lteOnCdmaDevice]=[1] Done
<14>[    5.523039] .(4)[1:init]init: PropSet [persist.sys.pms_sys_removable]=[1] Done
<14>[    5.523248] .(4)[1:init]init: PropSet [persist.service.acm.enable]=[0] Done
<14>[    5.523261] .(4)[1:init]init: PropSet [persist.vzw_device_type]=[0] Done
<14>[    5.523282] .(4)[1:init]init: PropSet [persist.mtk_ims_support]=[1] Done
<14>[    5.523302] .(4)[1:init]init: PropSet [persist.mtk_dynamic_ims_switch]=[1] Done
<14>[    5.523321] .(4)[1:init]init: PropSet [persist.mtk_mims_support]=[1] Done
<14>[    5.523334] .(4)[1:init]init: PropSet [persist.mtk_wfc_support]=[1] Done
<14>[    5.523345] .(4)[1:init]init: PropSet [persist.mtk_volte_support]=[1] Done
<14>[    5.523357] .(4)[1:init]init: PropSet [persist.mtk.volte.enable]=[1] Done
<14>[    5.523368] .(4)[1:init]init: PropSet [persist.mtk_vilte_support]=[0] Done
<14>[    5.523379] .(4)[1:init]init: PropSet [persist.mtk_viwifi_support]=[1] Done
<14>[    5.523390] .(4)[1:init]init: PropSet [persist.mtk_ussi_support]=[1] Done
<14>[    5.523406] .(4)[1:init]init: PropSet [wfd.dummy.enable]=[1] Done
<14>[    5.523421] .(4)[1:init]init: PropSet [wfd.iframesize.level]=[0] Done
<14>[    5.523438] .(4)[1:init]init: PropSet [persist.mtk.wcn.coredump.mode]=[0] Done
<14>[    5.523454] .(4)[1:init]init: PropSet [persist.mtk.wcn.combo.chipid]=[-1] Done
<14>[    5.523470] .(4)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[-1] Done
<14>[    5.523485] .(4)[1:init]init: PropSet [persist.mtk.wcn.dynamic.dump]=[0] Done
<14>[    5.523501] .(4)[1:init]init: PropSet [service.wcn.driver.ready]=[no] Done
<14>[    5.523522] .(4)[1:init]init: PropSet [persist.mtk.connsys.poweron.ctl]=[0] Done
<14>[    5.523542] .(4)[1:init]init: PropSet [persist.mtk_epdg_support]=[1] Done
<14>[    5.523568] .(4)[1:init]init: PropSet [persist.radio.mobile.data]=[0,0] Done
<14>[    5.523590] .(4)[1:init]init: PropSet [persist.meta.dumpdata]=[0] Done
<14>[    5.523618] .(4)[1:init]init: PropSet [dalvik.vm.heapgrowthlimit]=[128m] Done
<14>[    5.523633] .(4)[1:init]init: PropSet [dalvik.vm.heapsize]=[256m] Done
<14>[    5.523645] .(4)[1:init]init: PropSet [persist.radio.mtk_dsbp_support]=[1] Done
<14>[    5.523664] .(4)[1:init]init: PropSet [persist.mtk_ct_volte_support]=[1] Done
<14>[    5.523680] .(4)[1:init]init: PropSet [persist.radio.mtk_ps2_rat]=[L/W/G] Done
<14>[    5.523696] .(4)[1:init]init: PropSet [persist.radio.mtk_ps3_rat]=[G] Done
<11>[    5.524798] .(4)[1:init]init: property_set("persist,log.tag.SuppServHelper", "I") failed: bad name
<14>[    5.525507] .(4)[1:init]init: PropSet [mtk.vdec.waitkeyframeforplay]=[1] Done
<14>[    5.525537] .(4)[1:init]init: PropSet [persist.mtk.datashaping.support]=[1] Done
<14>[    5.525557] .(4)[1:init]init: PropSet [persist.datashaping.alarmgroup]=[1] Done
<14>[    5.525583] .(4)[1:init]init: PropSet [persist.duraspeed.support]=[1] Done
<14>[    5.525634] .(4)[1:init]init: PropSet [debug.sf.disable_backpressure]=[1] Done
<14>[    5.525766] .(4)[1:init]init: PropSet [Build.BRAND]=[MTK] Done
<14>[    5.525785] .(4)[1:init]init: PropSet [persist.radio.lte.chip]=[0] Done
<12>[    5.525897] .(4)[1:init]init: Couldn't load property file: Unable to open '/factory/factory.prop': No such file or directory: No such file or directory
<14>[    5.528346] .(5)[1:init]init: Command 'load_system_props' action=post-fs (/init.rc:340) returned 0 took 53ms.
<14>[    5.528938] .(5)[1:init]init: starting service 'logd'...
<14>[    5.530456] .(5)[1:init]init: starting service 'servicemanager'...
<14>[    5.530564] .(4)[349:init]init: Created socket '/dev/socket/logd', mode 666, user 1036, group 1036
<14>[    5.531077] .(4)[349:init]init: Created socket '/dev/socket/logdr', mode 666, user 1036, group 1036
<14>[    5.531685] .(4)[349:init]init: Created socket '/dev/socket/logdw', mode 222, user 1036, group 1036
<14>[    5.532094] .(5)[1:init]init: starting service 'hwservicemanager'...
<14>[    5.532135] .(4)[349:init]init: Opened file '/proc/kmsg', flags 0
<14>[    5.532179] .(4)[349:init]init: Opened file '/dev/kmsg', flags 1
<14>[    5.534672] .(7)[1:init]init: starting service 'vndservicemanager'...
<14>[    5.568073] .(7)[1:init]selinux: SELinux: Skipping restorecon_recursive(/cache)
<14>[    5.568073] 
<6>[    5.574964] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4335mV, VBAT = 4330mV, IBAT = 26mA, IBUS = 400mA, VBUS = 4975mV
<6>[    5.576896] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<14>[    5.577034] .(7)[1:init]selinux: SELinux: Skipping restorecon_recursive(/enterprise)
<14>[    5.577034] 
<14>[    5.578346] .(7)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.mt6763.rc:125)
<3>[    5.578472] .(7)[1:init]BOOTPROF:      5578.472243:INIT:post-fs
<14>[    5.579444] .(7)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.mt6763.usb.rc:4)
<14>[    5.579537] .(7)[1:init]init: PropSet [sys.usb.vid]=[0x0E8D] Done
<6>[    5.582599] .(7)[1:init]gadgets_make name=g1
<6>[    5.584256] .(7)[1:init]function_make name=accessory.gs2
<6>[    5.585010] .(7)[1:init]function_make name=audio_source.gs3
<6>[    5.585718] .(7)[1:init]function_make name=ffs.adb
<6>[    5.585748] .(7)[1:init]file system registered
<6>[    5.586224] .(7)[1:init]function_make name=mtp.gs0
<6>[    5.587672] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<5>[    5.589249] .(6)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    5.590126] .(6)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<6>[    5.590856] .(4)[1:init]interf_grp_compatible_id_store ext_compat_id=MTP
<6>[    5.591336] .(4)[1:init]function_make name=ptp.gs1
<6>[    5.591887] .(4)[1:init]function_make name=rndis.gs4
<4>[    5.591937] .(4)[1:init]using random self ethernet address
<4>[    5.591941] .(4)[1:init]using random host ethernet address
<6>[    5.592389] .(4)[1:init]function_make name=midi.gs5
<6>[    5.592977] .(4)[1:init]function_make name=acm.gs0
<6>[    5.593098] .(4)[1:init]acm_alloc_instance opts->port_num=0
<6>[    5.593560] .(4)[1:init]function_make name=acm.gs1
<6>[    5.593661] .(4)[1:init]acm_alloc_instance opts->port_num=1
<6>[    5.594082] .(4)[1:init]function_make name=acm.gs2
<6>[    5.594192] .(4)[1:init]acm_alloc_instance opts->port_num=2
<6>[    5.594627] .(4)[1:init]function_make name=acm.gs3
<6>[    5.594726] .(4)[1:init]acm_alloc_instance opts->port_num=3
<6>[    5.595183] .(4)[1:init]function_make name=mass_storage.usb0
<6>[    5.595200] .(4)[1:init]Mass Storage Function, version: 2009/09/11
<6>[    5.595206] .(4)[1:init]LUN: removable file: (no medium)
<6>[    5.595675] .(4)[1:init]function_make name=hid.gs0
<6>[    5.596179] .(4)[1:init]function_make name=via_modem.gs0
<6>[    5.596515] .(4)[1:init]function_make name=via_ets.gs0
<6>[    5.596909] .(4)[1:init]function_make name=via_atc.gs0
<6>[    5.597242] .(4)[1:init]config_desc_make name=b.1
<6>[    5.597921] .(4)[1:init]os_desc_b_vendor_code_store Vendor Code=1
<14>[    5.598513] .(4)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.datalogic.rc:42)
<14>[    5.598713] .(4)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.aee.rc:12)
<14>[    5.599165] .(4)[1:init]init: starting service 'aee_aed'...
<14>[    5.600835] .(4)[1:init]init: starting service 'aee_aed64'...
<14>[    5.602630] .(4)[1:init]init: starting service 'aee_aedv'...
<14>[    5.604533] .(4)[1:init]init: starting service 'aee_aedv64'...
<14>[    5.606037] .(4)[1:init]init: processing action (post-fs) from (/system/etc/init/atrace.rc:3)
<38>[    5.607995] .(7)[349:logd]logd.auditd: start
<7>[    5.608820] .(4)[1:init][ftrace]tracing_on is toggled to 0
<11>[    5.609779] .(4)[1:init]init: Unable to open '/sys/kernel/tracing/tracing_on': No such file or directory
<14>[    5.609938] .(4)[1:init]init: processing action (post-fs) from (/vendor/etc/init/trustkernel.rc:1)
<3>[    5.610041] .(4)[1:init]BOOTPROF:      5610.040859:tkcore: prep SYSTA
<14>[    5.616455] .(4)[1:init]init: starting service 'teed'...
<14>[    5.617963] .(4)[1:init]init: processing action (late-fs) from (/init.rc:412)
<14>[    5.620729] .(4)[1:init]init: starting service 'keymaster-3-0'...
<14>[    5.623485] .(4)[1:init]init: processing action (post-fs-data) from (/init.rc:420)
<14>[    5.626469] .(4)[1:init]init: starting service 'vold'...
<14>[    5.629503] .(5)[366:init]init: Created socket '/dev/socket/vold', mode 660, user 0, group 1009
<11>[    5.630737] .(4)[1:init]init: Unable to open '/data/system/entropy.dat': No such file or directory
<14>[    5.632619] .(5)[366:init]init: Created socket '/dev/socket/cryptd', mode 660, user 0, group 1009
<11>[    5.637628] .(4)[1:init]init: Unable to open '/data/misc/recovery/ro.build.fingerprint': No such file or directory
<11>[    5.640965] .(4)[1:init]init: Unable to open '/data/misc/recovery/proc/version': No such file or directory
<6>[    5.662692] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    5.663977] .(6)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    5.665820] .(6)[266:charger_thread]=====FG===== AC   = -26
<4>[    5.667558] .(6)[266:charger_thread]=====FG===== AC   = -26
<14>[    5.677274] .(4)[1:init]init: PropSet [persist.mtk.aee.mode]=[4] Done
<14>[    5.679854] .(4)[1:init]init: PropSet [persist.aee.core.dump]=[disable] Done
<36>[    5.681597] .(5)[367:logd.auditd]type=1400 audit(1578646634.118:6): avc: denied { write } for pid=364 comm="teed" name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<14>[    5.685294] .(3)[1:init]init: PropSet [persist.aee.core.direct]=[disable] Done
<14>[    5.687712] .(7)[1:init]init: PropSet [persist.aee.fatal_db.count]=[4] Done
<6>[    5.689669] .(0)[351:hwservicemanage]binder: 351:351 ioctl 620a 7ffaf60fc0 returned -22
<14>[    5.689894] .(7)[1:init]init: PropSet [persist.aee.db.count]=[4] Done
<14>[    5.691315] .(7)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[    5.693826] .(7)[1:init]init: PropSet [hwservicemanager.ready]=[true] Done
<36>[    5.699015] .(4)[367:logd.auditd]type=1400 audit(1578646634.118:11): avc: denied { write } for pid=364 comm="teed" name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0 duplicate messages suppressed
<14>[    5.700295] .(7)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<36>[    5.703813] .(4)[367:logd.auditd]type=1400 audit(1578646634.134:12): avc: denied { write } for pid=364 comm="tkearlyinit" name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<14>[    5.715197] .(7)[1:init]init: starting service 'exec 2 (/system/bin/vdc --wait cryptfs init_user0)'...
<14>[    5.717781] .(7)[1:init]init: SVC_EXEC pid 368 (uid 0 gid 0+0 context default) started; waiting...
<4>[    5.720699] .(3)[257:kworker/3:1][low_g]low_g_setup_eint
<4>[    5.721448] .(3)[257:kworker/3:1]111111  cur_gpio_state_low_g= 1
<36>[    5.721776] .(4)[367:logd.auditd]type=1400 audit(1578646634.154:13): avc: denied { write } for pid=364 comm="tkearlyinit" name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.721789] .(4)[367:logd.auditd]type=1400 audit(1578646634.158:14): avc: denied { write } for pid=364 comm="teed" name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.722889] .(5)[367:logd.auditd]type=1400 audit(1578646634.158:19): avc: denied { write } for pid=364 comm="teed" name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0 duplicate messages suppressed
<36>[    5.722899] .(5)[367:logd.auditd]type=1400 audit(1578646634.158:20): avc: denied { write } for pid=364 comm="tkuinit" name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<4>[    5.733118] .(3)[257:kworker/3:1]****Open******** 
<4>[    5.733743] .(3)[257:kworker/3:1]hehai ~~~kpd_send_old_slid_msg_low_g slid=0!!
<4>[    5.735011] .(3)[257:kworker/3:1]****mt_gpio_set_debounce,gpiopin=4, debounce=0*** 
<4>[    5.736097] .(3)[257:kworker/3:1][Hall]Hall set EINT finished, hall_irq=0, halldebounce=0 
<4>[    5.780717] .(7)[266:charger_thread]lifetime: data[0]=df 
<4>[    5.781446] .(7)[266:charger_thread]lifetime: data[1]=ff 
<4>[    5.782146] .(7)[266:charger_thread]lifetime: data[2]=40 
<4>[    5.782848] .(7)[266:charger_thread]lifetime: data[3]=11 
<4>[    5.783553] .(7)[266:charger_thread]lifetime: data[4]=45 
<4>[    5.784258] .(7)[266:charger_thread]lifetime: data[5]=a 
<4>[    5.784996] .(7)[266:charger_thread]lifetime: data[6]=fc 
<36>[    5.785225] .(6)[367:logd.auditd]type=1400 audit(1578646634.158:21): avc: denied { write } for pid=364 comm="tkuinit" name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.785235] .(6)[367:logd.auditd]type=1400 audit(1578646634.222:22): avc: denied { write } for pid=364 comm="teed" name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<4>[    5.791294] .(7)[266:charger_thread]lifetime: data[7]=8 
<4>[    5.791997] .(7)[266:charger_thread]lifetime: data[8]=68 
<4>[    5.792769] .(7)[266:charger_thread]lifetime: data[9]=f7 
<4>[    5.793482] .(7)[266:charger_thread]lifetime: data[10]=18 
<4>[    5.794567] .(7)[266:charger_thread]lifetime: data[11]=0 
<4>[    5.796884] .(6)[266:charger_thread]=====FG-MTK===== bat_vol=4307
<5>[    5.800908] .(5)[266:charger_thread]Vbat=4307,Ibat=26,I=0,VChr=4721,T=25,Soc=0:0,CT:2:2 hv:1 pd:0:0
<5>[    5.802085] .(5)[266:charger_thread][mtk_is_charger_on]info->chr_type=2 
<14>[    5.803857] .(7)[1:init]init: PropSet [vold.has_adoptable]=[1] Done
<14>[    5.805188] .(7)[1:init]init: PropSet [vold.has_quota]=[1] Done
<14>[    5.810097] .(5)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<4>[    5.810996] .(2)[266:charger_thread]temp_now=193, temp_last=193 
<4>[    5.811010] .(2)[266:charger_thread]=====FG===== TEMP = 193
<5>[    5.811016] .(2)[266:charger_thread]charger_check_status
<14>[    5.814764] .(5)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<14>[    5.818084] .(7)[1:init]init: Service 'exec 2 (/system/bin/vdc --wait cryptfs init_user0)' (pid 368) exited with status 0 waiting took 0.103000 seconds
<14>[    5.836616] .(7)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[    5.838209] .(7)[1:init]init: starting service 'exec 3 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)'...
<14>[    5.840909] .(7)[1:init]init: SVC_EXEC pid 375 (uid 1000 gid 1000+0 context default) started; waiting...
<14>[    5.842469] .(7)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    5.843879] .(4)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    5.845594] .(4)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[dumping] Done
<4>[    5.848139] .(1)[376:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<4>[    5.852163] .(1)[376:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<14>[    5.855817] .(4)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    5.857064] .(4)[1:init]init: Service 'exec 3 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)' (pid 375) exited with status 0 waiting took 0.019000 seconds
<14>[    5.859387] .(4)[1:init]init: processing action (post-fs-data) from (/init.usb.rc:6)
<5>[    5.862195] .(5)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4721000 mV) 
<14>[    5.862499] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.mt6763.rc:157)
<3>[    5.862597] .(4)[1:init]BOOTPROF:      5862.596321:INIT:post-fs-data
<11>[    5.862866] .(4)[1:init]init: Unable to open '/sys/block/sdc/queue/iostats': No such file or directory
<11>[    5.862891] .(4)[1:init]init: Unable to open '/sys/block/sdc/queue/read_ahead_kb': No such file or directory
<11>[    5.862914] .(4)[1:init]init: Unable to open '/sys/block/sdc/queue/nr_requests': No such file or directory
<14>[    5.863252] .(4)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvcfg)
<14>[    5.863252] 
<5>[    5.872032] .(4)[266:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<14>[    5.872071] .(5)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvdata)
<14>[    5.872071] 
<5>[    5.874173] .(4)[266:charger_thread]charger_check_status tmp:19 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<4>[    5.876717] -(7)[6:kworker/u16:0]do_connection_work: 17 callbacks suppressed
<5>[    5.876733] .(7)[6:kworker/u16:0][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<17>
<5>[    5.877832] .(4)[266:charger_thread]mtk_switch_charging_run [1 0], timer=0
<14>[    5.891519] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.connectivity.rc:3)
<14>[    5.896247] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.project.rc:15)
<14>[    5.899111] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.aee.rc:1)
<14>[    5.903677] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.sensor_1_0.rc:2)
<14>[    5.908475] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.modem.rc:19)
<3>[    5.909937] .(5)[1:init]BOOTPROF:      5909.935475:post-fs-data: on modem start
<14>[    5.911035] .(5)[1:init]init: PropSet [vold.post_fs_data_done]=[1] Done
<14>[    5.911938] .(5)[1:init]init: processing action (post-fs-data) from (/system/etc/init/bootstat.rc:3)
<14>[    5.914476] .(5)[1:init]init: processing action (post-fs-data) from (/system/etc/init/mobile_log_d.rc:1)
<14>[    5.916687] .(5)[1:init]init: processing action (post-fs-data) from (/system/etc/init/sn.rc:1)
<14>[    5.918263] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc:1)
<5>[    5.920253] .(4)[266:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:25,39,16 pps:0 en:0 ibus:0 80
<14>[    5.920533] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hostapd.android.rc:9)
<14>[    5.921026] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccifsd.rc:5)
<14>[    5.921118] .(5)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_f)
<14>[    5.921118] 
<14>[    5.921173] .(5)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_s)
<14>[    5.921173] 
<14>[    5.921190] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccimdinit.rc:4)
<14>[    5.923443] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.wod.rc:1)
<14>[    5.925842] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/mtk_agpsd.rc:1)
<14>[    5.926381] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/statusd.rc:1)
<14>[    5.926788] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/trustkernel.rc:7)
<3>[    5.926873] .(5)[1:init]BOOTPROF:      5926.872244:tkcore: prep SFS
<3>[    5.927450] .(5)[1:init]BOOTPROF:      5927.449090:tkcore: prep PP
<3>[    5.929673] .(7)[1:init]BOOTPROF:      5929.671706:tkcore: prep SPTA
<14>[    5.930444] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc:1)
<5>[    5.932709] .(5)[6:kworker/u16:0][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<14>[    5.934064] .(7)[1:init]init: processing action (load_persist_props_action) from (/init.rc:291)
<14>[    5.934534] .(7)[1:init]init: starting service 'logd-reinit'...
<14>[    5.935861] .(7)[1:init]init: processing action (firmware_mounts_complete) from (/init.rc:297)
<14>[    5.936047] .(7)[1:init]init: processing action (early-boot) from (/system/etc/init/installd.rc:5)
<5>[    5.942317] .(4)[266:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[    5.943387] .(4)[266:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<4>[    5.946028] -(4)[266:charger_thread]mt6356_get_auxadc_value: 16 callbacks suppressed
<5>[    5.946044] .(4)[266:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<4>[    5.948490] .(4)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.949887] .(4)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.951224] .(4)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.952778] .(4)[266:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<30>[    5.953920] .(5)[355:logd.daemon]logd.daemon: reinit
<14>[    5.954939] .(7)[1:init]init: PropSet [log.tag]=[I] Done
<4>[    5.955571] .(5)[266:charger_thread]temp_now=193, temp_last=193 
<4>[    5.955584] .(5)[266:charger_thread]=====FG===== TEMP = 193
<31>[    5.957331] .(5)[355:logd.daemon]logd: logd no log reader, set log level to INFO!
<4>[    5.957363] .(4)[266:charger_thread]=====FG===== VOLT = 4323
<4>[    5.958096] .(4)[266:charger_thread]=====FG===== actural VOLT = 4326
<14>[    5.958106] .(7)[1:init]init: Service 'logd-reinit' (pid 377) exited with status 0
<14>[    5.959393] .(7)[1:init]init: processing action (boot) from (/init.rc:603)
<11>[    5.960209] .(7)[1:init]init: Unable to open '/proc/sys/vm/min_free_order_shift': No such file or directory
<14>[    5.962633] .(7)[1:init]init: PropSet [net.tcp.default_init_rwnd]=[60] Done
<4>[    5.963605] .(4)[266:charger_thread]=====FG===== AC   = -26
<4>[    5.964985] .(4)[266:charger_thread]=====FG===== SOC  = 100
<14>[    5.965149] .(5)[1:init]init: starting service 'hidl_memory'...
<14>[    5.966785] .(5)[1:init]init: starting service 'vtservice_hidl'...
<4>[    5.967676] .(7)[266:charger_thread]=====FG===== SOH  = 100
<4>[    5.968418] .(7)[266:charger_thread]DLCP bat_vol=4326,  temperature=193  
<14>[    5.969311] .(5)[1:init]init: starting service 'audio-hal-2-0'...
<4>[    5.970129] .(7)[266:charger_thread] ===CC_value from battery temprature=700000
<4>[    5.971080] .(7)[266:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<14>[    5.971105] .(5)[1:init]init: starting service 'bluetooth-1-0'...
<14>[    5.973159] .(5)[1:init]init: starting service 'broadcastradio-hal'...
<14>[    5.974429] .(4)[379:init]init: Created socket '/dev/socket/volte_vt', mode 660, user 0, group 1000
<14>[    5.976022] .(5)[1:init]init: starting service 'cas-hal-1-0'...
<4>[    5.977141] .(4)[266:charger_thread]DLCP mt6370_set_vrech       = 300
<14>[    5.978809] .(5)[1:init]init: starting service 'configstore-hal-1-0'...
<5>[    5.980832] .(7)[6:kworker/u16:0][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<14>[    5.981574] .(5)[1:init]init: starting service 'drm-hal-1-0'...
<14>[    5.983506] .(5)[1:init]init: starting service 'drm-widevine-hal-1-0'...
<4>[    5.984233] .(7)[266:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[    5.984245] .(7)[266:charger_thread]DLCP read cv              = 4350000
<4>[    5.984248] .(7)[266:charger_thread]DLCP read eoc             = 250000
<4>[    5.984250] .(7)[266:charger_thread]DLCP read recharge        = 300
<4>[    5.984252] .(7)[266:charger_thread]DLCP Target Temp          = 410
<4>[    5.984254] .(7)[266:charger_thread]DLCP Charge Current       = 2000
<4>[    5.984256] .(7)[266:charger_thread]DLPID 
<4>[    5.984257] .(7)[266:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    5.984259] .(7)[266:charger_thread]DLPID PID Target Temp = 410 
<4>[    5.984261] .(7)[266:charger_thread]DLPID Battery Temp    = 193 
<4>[    5.984263] .(7)[266:charger_thread]DLPID TEMP DIFF       = 162 
<4>[    5.984264] .(7)[266:charger_thread]DLPID PID KI          = 5000 
<4>[    5.984266] .(7)[266:charger_thread]DLPID CC MAX          = 700000 
<4>[    5.984268] .(7)[266:charger_thread]DLPID PID Current     = 700000 
<4>[    5.984269] .(7)[266:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[    5.984271] .(7)[266:charger_thread]DLCP ccurrent from battery temprature = 700000
<4>[    5.984273] .(7)[266:charger_thread]DLCP ccurrent from PID algorithm      = 700000
<4>[    5.984275] .(7)[266:charger_thread]DLCP ccurrent from DLPL               = 2000000
<4>[    5.984278] .(7)[266:charger_thread]DLCP set input current:500000 
<4>[    5.988758] .(4)[266:charger_thread]DLCP set charge current: 500000 
<4>[    5.990330] .(7)[266:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    5.990480] .(7)[266:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[    5.990484] .(7)[266:charger_thread]DLCP __mt6370_set_cv       = 4350000
<4>[    5.990623] .(7)[266:charger_thread]DLCP mt6370_enable_charging :1 
<14>[    6.007059] .(5)[1:init]init: starting service 'gatekeeper-1-0'...
<14>[    6.010125] .(5)[1:init]init: starting service 'gralloc-2-0'...
<14>[    6.012936] .(5)[1:init]init: starting service 'hwcomposer-2-1'...
<14>[    6.015683] .(5)[1:init]init: starting service 'light-hal-2-0'...
<14>[    6.018429] .(5)[1:init]init: starting service 'memtrack-hal-1-0'...
<14>[    6.021263] .(5)[1:init]init: starting service 'thermal-hal-1-0'...
<14>[    6.024418] .(5)[1:init]init: starting service 'vibrator-1-0'...
<14>[    6.027625] .(5)[1:init]init: starting service 'wifi_hal_legacy'...
<14>[    6.030340] .(5)[1:init]init: starting service 'dfps-1-0'...
<14>[    6.033012] .(5)[1:init]init: starting service 'mtkcodecservice-1-1'...
<14>[    6.036003] .(5)[1:init]init: starting service 'power-hal-1-1'...
<14>[    6.038948] .(5)[1:init]init: starting service 'nxpnfc_hal_svc'...
<14>[    6.041326] .(5)[1:init]init: Command 'class_start hal' action=boot (/init.rc:705) returned 0 took 77ms.
<14>[    6.043136] .(5)[1:init]init: starting service 'healthd'...
<11>[    6.046483] .(5)[1:init]init: cannot find '/vendor/bin/spm_loader', disabling 'spm_script': No such file or directory
<11>[    6.047950] .(5)[1:init]init: cannot find '/system/bin/datalogic_hw', disabling 'datalogic-hw': No such file or directory
<14>[    6.050109] .(5)[1:init]init: starting service 'lmkd'...
<14>[    6.052491] .(5)[1:init]init: starting service 'surfaceflinger'...
<14>[    6.052784] .(3)[400:init]init: Created socket '/dev/socket/lmkd', mode 660, user 1000, group 1000
<11>[    6.056183] .(5)[1:init]init: service terservice does not have a SELinux domain defined
<11>[    6.056224] .(4)[401:init]init: Failed to bind socket 'pdx/system/vr/display/client': No such file or directory
<11>[    6.056736] .(4)[401:init]init: Failed to bind socket 'pdx/system/vr/display/manager': No such file or directory
<11>[    6.057147] .(4)[401:init]init: Failed to bind socket 'pdx/system/vr/display/vsync': No such file or directory
<14>[    6.062215] .(5)[1:init]init: starting service 'thermalservice'...
<14>[    6.065823] .(5)[1:init]init: starting service 'fuelgauged'...
<14>[    6.070134] .(5)[1:init]init: starting service 'ccci_fsd'...
<14>[    6.074928] .(5)[1:init]init: starting service 'ccci3_fsd'...
<14>[    6.077958] .(5)[1:init]init: starting service 'ccci_mdinit'...
<14>[    6.080780] .(5)[1:init]init: starting service 'ccci3_mdinit'...
<14>[    6.084497] .(5)[1:init]init: starting service 'ccci_rpcd'...
<14>[    6.087362] .(5)[1:init]init: starting service 'wfca'...
<14>[    6.098523] .(5)[1:init]init: starting service 'wmt_loader'...
<14>[    6.120025] .(4)[409:init]init: Created socket '/dev/socket/wfca', mode 660, user 0, group 1000
<14>[    6.121847] .(5)[1:init]init: starting service 'wmt_launcher'...
<14>[    6.131109] .(5)[1:init]init: starting service 'statusd'...
<14>[    6.131675] .(4)[409:init]init: Created socket '/dev/socket/wfca_rds', mode 660, user 0, group 1000
<14>[    6.153157] .(5)[1:init]init: Command 'class_start core' action=boot (/init.rc:707) returned 0 took 110ms.
<14>[    6.154562] .(5)[1:init]init: processing action (boot) from (/init.usb.rc:25)
<14>[    6.155620] .(5)[1:init]init: PropSet [sys.usb.configfs]=[0] Done
<14>[    6.156434] .(4)[415:init]init: Created socket '/dev/socket/rild-via', mode 660, user 1001, group 1001
<14>[    6.156489] .(5)[1:init]init: processing action (persist.sys.usb.config=* && boot) from (/init.usb.rc:106)
<14>[    6.156616] .(5)[1:init]init: PropSet [sys.usb.config]=[mtp] Done
<6>[    6.160469] .(2)[404:ccci_fsd][ccci1/chr]port ccci_fs open with flag 20002 by ccci_fsd
<3>[    6.165641] .(5)[406:ccci_mdinit]BOOTPROF:      6165.639322:ccci_md1: md_init srv start
<3>[    6.169167] .(5)[406:ccci_mdinit]BOOTPROF:      6169.166091:ccci_md1: init
<14>[    6.171432] .(5)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6763.rc:616)
<3>[    6.172856] .(5)[1:init]BOOTPROF:      6172.853475:INIT:boot
<14>[    6.178385] .(5)[1:init]init: PropSet [mtk.md1.status]=[init] Done
<6>[    6.178930] .(0)[408:ccci_rpcd][ccci1/chr]port ccci_rpc open with flag 20002 by ccci_rpcd
<14>[    6.185412] .(4)[415:init]init: Created socket '/dev/socket/msap_c2k_socket1', mode 660, user 1001, group 1001
<14>[    6.185826] .(5)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6763.rc:1102)
<14>[    6.186277] .(5)[1:init]init: PropSet [persist.radio.reset_on_switch]=[false] Done
<14>[    6.186359] .(5)[1:init]init: PropSet [rild.mark_switchuser]=[0] Done
<14>[    6.186386] .(5)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6763.usb.rc:41)
<14>[    6.186405] .(5)[1:init]init: PropSet [sys.usb.configfs]=[1] Done
<14>[    6.186426] .(5)[1:init]init: PropSet [sys.usb.controller]=[musb-hdrc] Done
<14>[    6.186447] .(5)[1:init]init: PropSet [sys.usb.acm_cnt]=[0] Done
<14>[    6.186467] .(5)[1:init]init: PropSet [sys.usb.acm_port0]=[] Done
<14>[    6.186488] .(5)[1:init]init: PropSet [sys.usb.acm_port1]=[] Done
<14>[    6.186538] .(5)[1:init]init: PropSet [sys.usb.temp]=[] Done
<14>[    6.186560] .(5)[1:init]init: PropSet [sys.usb.acm_enable]=[0] Done
<14>[    6.186580] .(5)[1:init]init: PropSet [sys.usb.clear]=[boot] Done
<6>[    6.186702] .(5)[1:init]Store => 0xf0
<6>[    6.186707] .(5)[1:init]Set CPU[4] On
<6>[    6.186708] .(5)[1:init]Set CPU[5] On
<6>[    6.186710] .(5)[1:init]Set CPU[6] On
<6>[    6.186712] .(5)[1:init]Set CPU[7] On
<14>[    6.189375] .(5)[1:init]init: processing action (boot) from (/system/etc/init/bootstat.rc:57)
<14>[    6.189472] .(5)[1:init]init: PropSet [sys.logbootcomplete]=[1] Done
<14>[    6.189489] .(5)[1:init]init: processing action (boot) from (/system/etc/init/dumpstate.rc:1)
<14>[    6.189603] .(5)[1:init]init: processing action (boot) from (/system/etc/init/ged_srv.rc:12)
<14>[    6.189883] .(5)[1:init]init: processing action (boot) from (/system/etc/init/netdiag.rc:5)
<14>[    6.190709] .(5)[1:init]init: processing action (boot) from (/vendor/etc/init/init.md_apps.rc:1)
<14>[    6.190857] .(5)[1:init]init: processing action (boot) from (/vendor/etc/init/init.wmt_drv.rc:1)
<5>[    6.191608] .(5)[403:fuelgauged][fg_res] FG_DAEMON_CMD_SET_DAEMON_PID = 403 (first launch)
<4>[    6.194741] .(5)[403:fuelgauged]=====FG===== AC   = -91
<6>[    6.195800] .(7)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<6>[    6.195816] .(7)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4280mV, VBAT = 4265mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<6>[    6.195820] .(7)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<6>[    6.195825] .(7)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<4>[    6.197636] .(5)[403:fuelgauged]=====FG===== AC   = -91
<12>[    6.200204] .(7)[399:healthd]healthd: unable to get HAL interface, using defaults
<4>[    6.200567] .(1)[403:fuelgauged]=====FG===== AC   = -91
<5>[    6.201107] .(5)[403:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low] h_percent=[9904,9795],high=91,fg_volt_withIR=34353 > ori_voltage=34000
<5>[    6.201164] .(5)[403:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low]fg_volt=35204,91,IR=-1196,orig_v:34000,+IR=34008,percent=9864,
<6>[    6.203400] .(2)[409:wfca][ccci1/chr]port ccci_imsa open with flag 20002 by wfca
<5>[    6.203673] -(2)[399:healthd]alarmtimer_enqueue, 66159028769
<4>[    6.203905] .(7)[403:fuelgauged]=====FG===== AC   = -91
<5>[    6.204406] .(7)[403:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low] h_percent=[9855,9747],high=92,fg_volt_withIR=34050 > ori_voltage=34000
<5>[    6.204455] .(7)[403:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low]fg_volt=35119,92,IR=-1117,orig_v:34000,+IR=34002,percent=9765,
<12>[    6.205085] .(2)[399:healthd]healthd: BatteryCycleCountPath not found
<3>[    6.205469] .(6)[407:ccci_mdinit]BOOTPROF:      6205.467245:ccci_md3: md_init srv start
<4>[    6.212875] .(0)[399:healthd]=====FG===== SOC  = 100
<4>[    6.216105] .(7)[399:healthd]=====FG===== VOLT = 4331
<4>[    6.216114] .(7)[399:healthd]=====FG===== actural VOLT = 4341
<4>[    6.217193] .(5)[399:healthd]=====FG===== AC   = -91
<4>[    6.217907] .(5)[399:healthd]bq27542_set_commands cmd = 0x12, val = 3813 
<4>[    6.220953] .(6)[399:healthd]temp_now=193, temp_last=193 
<4>[    6.220964] .(6)[399:healthd]=====FG===== TEMP = 193
<6>[    6.222384] .(0)[399:healthd]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    6.222402] .(0)[399:healthd]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    6.222406] .(0)[399:healthd]I2C structure:
<3>[    6.222406] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=3,Total_len=1
<3>[    6.222406] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    6.222406] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    6.222413] .(0)[399:healthd]base address 0xffffff800bf46000
<6>[    6.222423] .(0)[399:healthd]I2C register:
<6>[    6.222423] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=0,CONTROL=28,TRANSFER_LEN=1
<6>[    6.222423] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    6.222423] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    6.222431] .(0)[399:healthd]before enable DMA register(0xffffff800bf48400):
<6>[    6.222431] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    6.222431] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    6.222431] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    6.222431] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    6.222442] .(0)[399:healthd]DMA register(0xffffff800bf48400):
<6>[    6.222442] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    6.222442] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c23100c
<6>[    6.222442] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    6.222442] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    6.222449] .(0)[399:healthd]i2c_dump_info ------------------------------------------
<3>[    6.222454] .(0)[399:healthd]i2c i2c-2: last transfer info:
<3>[    6.222457] .(0)[399:healthd]i2c i2c-2: [00] [    6.222376] SLAVE_ADDR=d8,INTR_STAT=3,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    6.222464] .(0)[399:healthd]i2c i2c-2: [01] [    6.220926] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=499
<3>[    6.222470] .(0)[399:healthd]i2c i2c-2: [02] [    6.218274] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    6.222476] .(0)[399:healthd]i2c i2c-2: [03] [    6.217897] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    6.222482] .(0)[399:healthd]i2c i2c-2: [04] [    6.217533] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    6.222487] .(0)[399:healthd]i2c i2c-2: [05] [    6.217182] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    6.222494] .(0)[399:healthd]i2c i2c-2: [06] [    6.216810] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    6.222499] .(0)[399:healthd]i2c i2c-2: [07] [    6.216094] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    6.222505] .(0)[399:healthd]i2c i2c-2: [08] [    6.215735] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    6.222511] .(0)[399:healthd]i2c i2c-2: [09] [    6.215460] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<4>[    6.222556] .(0)[399:healthd][wlc_do_10s_debounce]status=0
<4>[    6.222561] .(0)[399:healthd][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294893841 valley_jiffies=0 topeak_jiffies=0 
<12>[    6.223008] .(0)[399:healthd]healthd: battery l=100 v=4341 t=19.3 h=2 st=2 c=-91 fc=3813000 chg=u
<3>[    6.233365] .(7)[385:android.hardwar]Dump cpuinfo
<6>[    6.234564] .(0)[395:vendor.mediatek][DFRC] dfrc_reset_state
<6>[    6.234625] .(3)[182:dfrc_make_polic][DFRC] adjust vsync: [0|0|0] -> [-1|0|0]
<3>[    6.266724] .(6)[1:init][SDIO-DETECT][I]sdio_detect_init:sdio_register_driver() ret=0
<3>[    6.268620] .(6)[1:init][WMT-DETECT][E]wmt_detect_probe(235):platform name: odm:mediatek,connectivity-combo
<3>[    6.269703] .(6)[1:init]wmt_gpio: gpio init start!
<3>[    6.269712] .(6)[1:init]wmt_gpio:set GPIO_COMBO_URXD_PIN to GPIO_PULL_DIS fail, is NULL!
<3>[    6.269715] .(6)[1:init]wmt_gpio:set GPIO_COMBO_UTXD_PIN to GPIO_PULL_DIS fail, is NULL!
<3>[    6.269740] .(6)[1:init]wmt_gpio:set GPIO_COMBO_PMU_EN_PIN to GPIO_PULL_DIS done!
<3>[    6.269759] .(6)[1:init]wmt_gpio:set GPIO_COMBO_PMU_EN_PIN out to 0: 0!
<3>[    6.269768] .(6)[1:init]wmt_gpio:set GPIO_COMBO_RST_PIN to GPIO_PULL_DIS done!
<3>[    6.269772] .(6)[1:init]wmt_gpio:set GPIO_COMBO_RST_PIN out to 0: 0!
<3>[    6.269780] .(6)[1:init]wmt_gpio:set GPIO_WIFI_EINT_PIN to GPIO_IN_PULLUP done!
<3>[    6.269787] .(6)[1:init]wmt_gpio:set GPIO_PCM_DAICLK_PIN to GPIO_PULL_DIS done!
<3>[    6.269794] .(6)[1:init]wmt_gpio:set GPIO_PCM_DAIPCMIN_PIN to GPIO_PULL_DIS done!
<3>[    6.269801] .(6)[1:init]wmt_gpio:set GPIO_PCM_DAIPCMOUT_PIN to GPIO_PULL_DIS done!
<3>[    6.269809] .(6)[1:init]wmt_gpio:set GPIO_PCM_DAISYNC_PIN to GPIO_PULL_DIS done!
<4>[    6.269811] .(6)[1:init]wmt_gpio:it may not be 6632 project, GPIO_CHIP_DEEP_SLEEP_PIN no need config!
<4>[    6.269813] .(6)[1:init]wmt_gpio:it may not be 6632 project, GPIO_CHIP_WAKE_UP_PIN no need config!
<3>[    6.269816] .(6)[1:init]wmt_gpio: gpio init done!
<3>[    6.270293] .(6)[1:init][WMT-DETECT][I]wmt_detect_driver_init:driver(major 154) installed success
<14>[    6.270514] .(6)[1:init]init: Command 'insmod /vendor/lib/modules/wmt_drv.ko' action=boot (/vendor/etc/init/init.wmt_drv.rc:2) returned 0 took 79ms.
<14>[    6.271073] .(6)[1:init]init: PropSet [debug.sf.hwc_pid]=[389] Done
<14>[    6.271234] .(6)[1:init]init: processing action (enable_property_trigger) from (<Builtin Action>:0)
<14>[    6.272065] .(6)[1:init]init: Service 'ccci3_mdinit' (pid 407) exited with status 0
<14>[    6.273743] .(6)[1:init]init: processing action (security.perf_harden=1) from (/init.rc:761)
<14>[    6.274030] .(6)[1:init]init: processing action (ro.debuggable=0) from (/init.rc:796)
<5>[    6.286153] .(3)[403:fuelgauged]MTK_FG: [GM3_data] soc:10000 fg_c_soc:10000 fg_v_soc:10000 ui_soc:10000 vc_diff:0 vc_mode 1 VBAT 43290 T:[25 V 25 C 25] D0_C 10000 D0_V 10000 CAR[c:0 v:0] Q:[27966 27966 27966 27966] aging 10000 bat_cycle 1 Trk[0(224):0:0] UI[1:1] Chr[1:10000:9888] pseudo1 -91  DC_ratio 100 dodinit[9][0] Iavg:-14,dis[0 0 0]
<5>[    6.286317] .(3)[403:fuelgauged][fg_res] FG_DAEMON_CMD_GET_NVRAM_FAIL_STATUS = 0
<5>[    6.288487] .(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    6.288504] -(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    6.288510] .(5)[403:fuelgauged][fgauge_read_RTC_boot_status] rtc_invalid 0 plugout 0 plugout_time 0 spare3 0xe4 spare0 0x60 hw_id 0x5640
<5>[    6.288514] .(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    6.288524] .(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    6.289614] .(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    6.289706] .(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    6.289712] -(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    6.289721] -(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    6.289799] -(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    6.289804] .(5)[403:fuelgauged][fgauge_read_RTC_boot_status] spare0 0x60 0x20, spare3 0xe4 0xe4
<5>[    6.291720] .(5)[403:fuelgauged][read_hw_ocv_6356_power_on_rdy] pwron_SWCHR_rdy 0
<6>[    6.291756] .(5)[403:fuelgauged]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_zcv: zcv = 0mV
<5>[    6.291763] .(5)[403:fuelgauged]charger_manager_get_zcv zcv:0 ret:0
<5>[    6.291805] .(5)[403:fuelgauged][read_hw_ocv] g_fg_is_charger_exist 1 _hw_ocv_chgin_rdy 0 pl:1 1
<5>[    6.291808] .(5)[403:fuelgauged][read_hw_ocv] _hw_ocv 35966 _sw_ocv 43128 now_thr 300
<5>[    6.291811] .(5)[403:fuelgauged][read_hw_ocv] _hw_ocv 43128 _hw_ocv_src 1 _prev_hw_ocv 35966 _prev_hw_ocv_src 3 _flag_unreliable 0
<5>[    6.291921] .(5)[403:fuelgauged][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 0 bat_plug_out_time 0 sp0:0x60 sp3:0xe4 1 1
<5>[    6.292145] .(5)[403:fuelgauged][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 0 bat_plug_out_time 0 sp0:0x60 sp3:0xe4 1 1
<5>[    6.292191] -(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<4>[    6.293929] .(5)[403:fuelgauged]=====FG-MTK===== bat_vol=4296
<5>[    6.295901] .(5)[403:fuelgauged]MTK_FG: [dod_init_result]ocv[boot:43122 final:43376 diff:254] thr[10000 10000 10000] tmp[now 25 5] v[lk_v:43121 cur:42960] lk_i:-6 lk_r:1700,i*r:1,old_soc:10000
<4>[    6.300733] [TKCORE]  tee_boot_params.flags: 0
<4>[    6.300733] [    5.301101]: <0>MSG TKCore:dump_tee_boot_params:147: rpmb_key_programmed: 1
<4>[    6.300733] [   18.631195]: <4>DBG TKCore:tee_ta_init_static_ta_session:1852:  Run tee_user_init.ta : 4dd88ba0-4c11-5669-dd-c3-26-24-bf-84-a4-e0
<4>[    6.300733] [   18.635730]: <[TKCORE] 4>DBG TKCore:tee_ta_open_session:1988: [TA 4dd88ba0: 0] init session
<4>[    6.300733] [   18.640645]: <4>DBG TKCore:invoke_command:398: cmd_id=2820 nParamTypes=0x2
<4>[    6.300733] [   18.645335]: <4>DBG TKCore:invoke_command:398: cmd_id=2821 nParamTypes=0x2
<4>[    6.300733] [   18.665900]: <4>DBG TKCore:[TKCORE] invoke_command:398: cmd_id=2822 nParamTypes=0x0
<4>[    6.300733] [   18.668340]: <4>DBG TKCore:invoke_command:398: cmd_id=2820 nParamTypes=0x2
<4>[    6.300733] [   18.671739]: <4>DBG TKCore:tee_ta_init_static_ta_session:1852:  Run tee_user_init.ta : 4dd88ba0-4c11-5669-dd-c3-26-24-bf-84-a4[TKCORE] -e0
<4>[    6.300729] [   18.687199]: <4>DBG TKCore:tee_ta_open_session:1988: [TA 4dd88ba0: 0] init session
<4>[    6.300729] [   18.688371]: <4>DBG TKCore:invoke_command:398: cmd_id=0 nParamTypes=0x555
<4>[    6.300729] [   18.689418]: <4>ERR TKCore:tee_rpmb_get_dev_info:1035: send rpmb command failed with [TKCORE] 0xffff0009
<4>[    6.300744] [   18.691187]: <4>ERR TKCore:tee_rpmb_init:1165: Failed to retrieve rpmb device info with 0xffff0009
<4>[    6.300744] [   18.692502]: <4>ERR TKCore:init_truststore:132: Init rpmb device failed with 0xffff0009
<4>[    6.300744] [   18.693629]: <4>INF TKCore:init_truststore:239: [TKCORE] Candidate truststore: PROTECT
<4>[    6.300744] [   18.694607]: <4>MSG TKCore:truststore_source_init_with_type:124: Init truststore with type=3
<4>[    6.300744] [   18.697163]: <4>INF TKCore:sdrpmb_reserved_region_init:2954: SDRPMB Reserved region Prepared
<4>[    6.300744] [   18.698481]: <4>INF TKCore:ini[TKCORE] t_truststore:251: PROTECT Setup ... Done
<4>[    6.300744] [   18.700012]: <4>INF TKCore:license_init:1948: Check secondary external certificate
<4>[    6.300744] [   18.702383]: <4>INF TKCore:get_pubk:652: KeyID = 0
<4>[    6.300744] [   18.705350]: <4>INF TKCore:license_init:1950: Load Secondary cert succe[TKCORE] ss
<4>[    6.300742] [   18.706330]: <4>INF TKCore:license_init:1983: VERIFY_STATE: 1 TRIAL_STATE: 1
<4>[    6.300742] [   18.707633]: <4>DBG TKCore:tee_ta_init_static_ta_session:1852:  Run tee_user_init.ta : 4dd88ba0-4c11-5669-dd-c3-26-24-bf-84-a4-e0
<4>[    6.300742] [   18.709179]: <4>DBG TKCore:tee_ta_op[TKCORE] en_session:1988: [TA 4dd88ba0: 0] init session
<4>[    6.300758] [   18.710454]: <4>DBG TKCore:invoke_command:398: cmd_id=2561 nParamTypes=0x67
<4>[    6.300758] [   18.747343]: <4>DBG TKCore:elf_load_body:450: Set TLS offset for TA: 0x24b9f4
<4>[    6.300758] [   18.748857]: <4>DBG TKCore:tee_ta_load:1170: [TKCORE] Loaded TA at 0xf0200000
<4>[    6.300758] [   18.751884]: <4>DBG TKCore:tee_ta_load:1171: ELF load address 0x200000
<4>[    6.300758] [   18.752772]: <4>DBG TKCore:tee_ta_init_session_with_signed_ta:1882:       dyn TA : 9ef77781-7bd5-4e39-96-5f-20-f6-f2-11-f4-6b
<4>[    6.300758] [   18.757801]: <4>DBG TKCor[TKCORE] e:tee_ta_open_session:1988: [TA 9ef77781: 0] init session
<4>[    6.300758] [   18.758920]: <4>ERR KEYMASTER:judge_rpmb:93: TEE_RPMB_MakeFileSystem return 0xf0100003
<4>[    6.300758] [   18.763170]: <4>INF KEYMASTER:key_store_init:147: no RPMB for ksk
<4>[    6.300758] [   18.765642]: <4>INF KEYMASTER:TA_In[TKCORE] vokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x19 pSessionContext 0x0 nParamTypes 0x53
<4>[    6.300756] [   18.769077]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1378: configure
<4>[    6.300756] [   19.041824]: <4>DBG TKCore:elf_load_body:450: Set TLS offset for TA:-(5)[403:fuelgauged][TKCORE]  0x2130b4
<4>[    6.309280] [   19.042916]: <4>DBG TKCore:tee_ta_load:1170: Loaded TA at 0xf0291000
<4>[    6.309280] [   19.043820]: <4>DBG TKCore:tee_ta_load:1171: ELF load address 0x200000
<4>[    6.309280] [   19.044700]: <4>DBG TKCore:tee_ta_init_session_with_signed_ta:1882:       dyn TA : 02662e8e-e126
<5>[    6.309272] -(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    6.309291] -(5)[403:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    6.309779] .(5)[403:fuelgauged][fg_res] FG_DAEMON_CMD_SET_BATTERY_CYCLE_THRESHOLD = 27803
<5>[    6.312994] .(5)[403:fuelgauged][fg_res] FG_DAEMON_CMD_SET_FG_BAT_INT1_GAP = 139 car:0
<5>[    6.314823] .(5)[403:fuelgauged][fg_res][fg_bat_int2] FG_DAEMON_CMD_SET_FG_BAT_INT2_HT_GAP = 278
<5>[    6.316641] .(5)[403:fuelgauged][fg_res][fg_bat_int2] FG_DAEMON_CMD_SET_FG_BAT_INT2_LT_GAP = 139
<5>[    6.323737] .(7)[403:fuelgauged][FGADC_intr_end][FG_INTR_INIT][read_fg_hw_info] curr_1 -612 curr_2 -603 Iavg 70 sign 0 car 0 ncar -14792 time 186
<5>[    6.323825] .(7)[403:fuelgauged][fg_res] FG_DAEMON_CMD_SET_KERNEL_SOC = 10000 100 10000 10000 10000 10000, type:4
<4>[    6.325932] .(7)[403:fuelgauged]=====FG===== SOC  = 100
<5>[    6.325944] .(7)[403:fuelgauged][bmd_ctrl_cmd_from_user]FG_status.ui_soc=100,fg_soc=100 
<4>[    6.329733] .(1)[403:fuelgauged]temp_now=193, temp_last=193 
<4>[    6.329745] .(1)[403:fuelgauged]=====FG===== TEMP = 193
<4>[    6.341280] .(1)[403:fuelgauged]=====FG===== VOLT = 4331
<4>[    6.341291] .(1)[403:fuelgauged]=====FG===== actural VOLT = 4341
<6>[    6.341300] .(1)[403:fuelgauged]power_supply battery: power_supply_changed
<5>[    6.341514] .(1)[403:fuelgauged][fg_res] FG_DAEMON_CMD_SET_CON0_SOC = 10050
<5>[    6.341644] .(1)[403:fuelgauged]MTK_FG: [FGADC_intr_end][INTR_Initialize]soc:10000 fg_c_soc:10000 fg_v_soc:10000 ui_soc:10000 vc_diff:0 vc_mode 1 VBAT 43121 T:[25 V 24 C 25] D0_C 10000 D0_V 10000 Q:[27803 27803 27966 27966] aging 10000 bat_cycle 1 Trk[0:0:0] UI[1:0] Chr[1:10000:0] pseudo1 0 DC_ratio 100
<4>[    6.341918] .(1)[70:kworker/1:1]temp_now=193, temp_last=193 
<4>[    6.341922] .(1)[70:kworker/1:1]=====FG===== TEMP = 193
<4>[    6.342467] .(1)[70:kworker/1:1]temp_now=193, temp_last=193 
<4>[    6.342470] .(1)[70:kworker/1:1]=====FG===== TEMP = 193
<4>[    6.343022] .(1)[70:kworker/1:1]=====FG===== SOC  = 100
<4>[    6.343795] .(1)[70:kworker/1:1]=====FG===== AC   = -91
<4>[    6.354872] .(1)[70:kworker/1:1]=====FG===== VOLT = 4331
<4>[    6.354885] .(1)[70:kworker/1:1]=====FG===== actural VOLT = 4341
<4>[    6.355419] .(1)[70:kworker/1:1]temp_now=193, temp_last=193 
<4>[    6.355423] .(1)[70:kworker/1:1]=====FG===== TEMP = 193
<4>[    6.355971] .(1)[70:kworker/1:1]=====FG===== SOC  = 100
<4>[    6.356520] .(1)[70:kworker/1:1]bq27542_set_commands cmd = 0x12, val = 3813 
<4>[    6.357072] .(1)[70:kworker/1:1]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    6.357621] .(1)[70:kworker/1:1]bq27542_set_commands cmd = 0xc, val = 3952 
<4>[    6.368708] .(2)[399:healthd]=====FG===== SOC  = 100
<4>[    6.369997] .(2)[399:healthd]=====FG===== VOLT = 4331
<4>[    6.370003] .(2)[399:healthd]=====FG===== actural VOLT = 4341
<4>[    6.370866] .(2)[399:healthd]=====FG===== AC   = -91
<4>[    6.371504] .(2)[399:healthd]bq27542_set_commands cmd = 0x12, val = 3813 
<4>[    6.375851] .(0)[399:healthd]temp_now=193, temp_last=193 
<4>[    6.375864] .(0)[399:healthd]=====FG===== TEMP = 193
<6>[    6.376396] .(0)[399:healthd]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    6.376405] .(0)[399:healthd]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    6.376413] .(0)[399:healthd]I2C structure:
<3>[    6.376413] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=3,Total_len=1
<3>[    6.376413] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    6.376413] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    6.376419] .(0)[399:healthd]base address 0xffffff800bf46000
<6>[    6.376429] .(0)[399:healthd]I2C register:
<6>[    6.376429] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=0,CONTROL=28,TRANSFER_LEN=1
<6>[    6.376429] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    6.376429] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    6.376436] .(0)[399:healthd]before enable DMA register(0xffffff800bf48400):
<6>[    6.376436] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    6.376436] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    6.376436] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    6.376436] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    6.376447] .(0)[399:healthd]DMA register(0xffffff800bf48400):
<6>[    6.376447] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    6.376447] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    6.376447] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    6.376447] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    6.376454] .(0)[399:healthd]i2c_dump_info ------------------------------------------
<3>[    6.376457] .(0)[399:healthd]i2c i2c-2: last transfer info:
<3>[    6.376460] .(0)[399:healthd]i2c i2c-2: [00] [    6.376391] SLAVE_ADDR=d8,INTR_STAT=3,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    6.376466] .(0)[399:healthd]i2c i2c-2: [01] [    6.375829] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    6.376472] .(0)[399:healthd]i2c i2c-2: [02] [    6.375391] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    6.376477] .(0)[399:healthd]i2c i2c-2: [03] [    6.371499] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    6.376483] .(0)[399:healthd]i2c i2c-2: [04] [    6.371143] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    6.376488] .(0)[399:healthd]i2c i2c-2: [05] [    6.370860] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    6.376494] .(0)[399:healthd]i2c i2c-2: [06] [    6.370506] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    6.376500] .(0)[399:healthd]i2c i2c-2: [07] [    6.369991] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    6.376505] .(0)[399:healthd]i2c i2c-2: [08] [    6.369636] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    6.376511] .(0)[399:healthd]i2c i2c-2: [09] [    6.369442] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<4>[    6.376530] .(0)[399:healthd][wlc_do_10s_debounce]status=0
<4>[    6.376534] .(0)[399:healthd][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294893879 valley_jiffies=0 topeak_jiffies=0 
<12>[    6.376745] .(0)[399:healthd]healthd: battery l=100 v=4341 t=19.3 h=2 st=2 c=-91 fc=3813000 chg=u
<14>[    6.449136] .(5)[415:init]init: Created socket '/dev/socket/msap_c2k_socket2', mode 660, user 1001, group 1001
<14>[    6.449136] .(1)[1:init]init: starting service 'console'...
<14>[    6.450590] .(1)[1:init]init: Command 'start console' action=ro.debuggable=0 (/init.rc:800) returned 0 took 176ms.
<14>[    6.450680] .(1)[1:init]init: processing action (ro.mtk_emmc_support=1) from (/vendor/etc/init/hw/init.mt6763.rc:889)
<14>[    6.450902] .(1)[1:init]init: processing action (sys.usb.acm_cnt=0 && sys.usb.config=mtp && sys.usb.configfs=1) from (/vendor/etc/init/hw/init.mt6763.usb.rc:169)
<14>[    6.450947] .(1)[1:init]init: PropSet [sys.usb.pid]=[0x2008] Done
<14>[    6.450972] .(1)[1:init]init: processing action (sys.usb.acm_enable=0 && sys.usb.config=mtp && sys.usb.configfs=1) from (/vendor/etc/init/hw/init.mt6763.usb.rc:192)
<6>[    6.451163] .(1)[1:init]os_desc_use_store Use OS DESC
<6>[    6.451233] .(1)[1:init]config_usb_cfg_link b.1<-->mtp.gs0
<6>[    6.451239] .(1)[1:init]usb_get_function usb_function_driver name=mtp
<6>[    6.451243] .(1)[1:init]usb_get_function usb_function name=mtp
<6>[    6.451290] .(1)[1:init]gadget_dev_desc_UDC_store write musb-hdrc
<6>[    6.451296] .(1)[1:init]usb_udc_attach_driver musb-hdrc musb-hdrc
<6>[    6.451305] .(1)[1:init]udc musb-hdrc: registering UDC driver [g1]
<6>[    6.451310] .(1)[1:init]configfs_composite_bind
<6>[    6.451316] .(1)[1:init]composite_dev_prepare ffffffc05880e500
<6>[    6.451345] .(1)[1:init]configfs-gadget gadget: adding 'mtp'/ffffffc057930000 to config 'b'/ffffffc05786c500
<6>[    6.451379] .(1)[1:init]allocate RX=49152 Tx=49152
<6>[    6.451384] .(1)[1:init]composite_os_desc_req_prepare ffffffc0588ad480
<5>[    6.451390] .(1)[1:init][MUSB]musb_gadget_start 2445: musb_gadget_start
<5>[    6.451412] .(1)[1:init][MUSB]musb_gadget_pullup 2230: is_on=1, softconnect=0 ++
<5>[    6.451417] -(1)[1:init][MUSB]musb_gadget_pullup 2243: is_on=1, softconnect=0 ++
<5>[    6.451421] -(1)[1:init][MUSB]set_usb_rdy 2204: set usb_rdy, wake up bat
<5>[    6.451424] -(1)[1:init][MUSB]musb_gadget_pullup 2259: issue connect_rescue_work on is_ready begin, delay_time:8000 ms
<5>[    6.451433] -(1)[1:init][MUSB]musb_gadget_pullup 2261: issue connect_rescue_work on is_ready end, delay_time:8000 ms
<5>[    6.451436] -(1)[1:init][MUSB]musb_pullup 2152: MUSB: gadget pull up 1 start, musb->power:0
<5>[    6.451440] -(1)[1:init][MUSB]musb_pullup 2174: MUSB: gadget pull up 1 end
<3>[    6.451559] .(1)[1:init]BOOTPROF:      6451.558861:USB ready
<14>[    6.451624] .(1)[1:init]init: PropSet [sys.usb.state]=[mtp] Done
<14>[    6.451772] .(1)[1:init]init: processing action (defaultcrypto) from (/system/etc/init/vdc.rc:2)
<14>[    6.452269] .(1)[1:init]init: starting service 'exec 4 (/system/bin/vdc --wait cryptfs mountdefaultencrypted)'...
<5>[    6.452727] .(2)[6:kworker/u16:0][MUSB]do_connection_work 459: is_host<0>, power<0>
<5>[    6.452747] .(2)[6:kworker/u16:0][MUSB]usb_cable_connected 747: usb_cable_connected vbus_exist=1 type=2
<5>[    6.452753] .(2)[6:kworker/u16:0][MUSB]usb_cable_connected 768: usb_cable_connected, connected:1, cable_mode:1, usb_data_lock:0
<5>[    6.452763] -(2)[6:kworker/u16:0][MUSB]do_connection_work 484: lock
<5>[    6.452767] -(2)[6:kworker/u16:0][MUSB]musb_start 1295: start, is_host=0 is_active=0
<5>[    6.452772] -(2)[6:kworker/u16:0][MUSB]mt_usb_enable 300: begin <0,0>,<2,1,1,1>
<4>[    6.452781] -(2)[6:kworker/u16:0]usb_6763_dpidle_request: 1 callbacks suppressed
<5>[    6.452786] -(2)[6:kworker/u16:0][MUSB]usb_6763_dpidle_request 120: USB_DPIDLE_FORBIDDEN, skip_cnt<1>
<4>[    6.452847] -(2)[6:kworker/u16:0]usb_6763_dpidle_request: 1 callbacks suppressed
<5>[    6.452850] -(2)[6:kworker/u16:0][MUSB]usb_6763_dpidle_request 113: USB_DPIDLE_ALLOWED, skip_cnt<1>
<14>[    6.453634] .(1)[1:init]init: SVC_EXEC pid 426 (uid 0 gid 0+0 context default) started; waiting...
<5>[    6.463761] -(2)[6:kworker/u16:0][MUSB]set_usb_phy_mode 425: force PHY to mode 1, 0x6c=3f2f
<5>[    6.463787] -(2)[6:kworker/u16:0][MUSB]usb_phy_recover 685: apply efuse setting, RG_USB20_INTR_CAL=0x15
<5>[    6.463794] -(2)[6:kworker/u16:0][MUSB]usb_phy_recover 695: usb recovery success
<5>[    6.463797] -(2)[6:kworker/u16:0][MUSB]mt_usb_enable 324: end, <2,1,2,1>
<5>[    6.463805] -(2)[6:kworker/u16:0][MUSB]musb_start 1335: set ignore babble MUSB_ULPI_REG_DATA=81
<5>[    6.463809] -(2)[6:kworker/u16:0][MUSB]musb_start 1343: add softconn
<14>[    6.468235] .(1)[1:init]init: Service 'exec 4 (/system/bin/vdc --wait cryptfs mountdefaultencrypted)' (pid 426) exited with status 0 waiting took 0.016000 seconds
<3>[    6.476622] .(1)[427:vold]BOOTPROF:      6476.621091:vold:decrypt_master_key:START
<3>[    6.476825] .(1)[427:vold]BOOTPROF:      6476.825091:vold:scrypt_keymaster:START
<3>[    6.477334] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_open:open major 154 minor 0 (pid 410)
<3>[    6.477549] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191034),arg(92)
<3>[    6.477555] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_pwr_on:++
<3>[    6.477559] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_dump_pin_conf:LDO(GPIO-1), PMU(GPIO370), PMUV28(GPIO-1)
<4>[    6.477565] .(1)[410:wmt_loader]------------[ cut here ]------------
<4>[    6.477567] .(1)[410:wmt_loader]WARNING: CPU: 1 PID: 410 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/drivers/gpio/gpiolib.c:85 gpio_to_desc+0xdc/0xf0()
<4>[    6.477583] .(1)[410:wmt_loader]invalid GPIO -1
<4>[    6.477597] .(1)[410:wmt_loader]Modules linked in: wmt_drv ffffff8000c33000           (null) 1162215 0 (O) fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    6.477601] -(1)[410:wmt_loader]CPU: 1 PID: 410 Comm: wmt_loader Tainted: G        W  O    4.4.95+ #2
<4>[    6.477605] -(1)[410:wmt_loader]Hardware name: MT6763V/B (DT)
<4>[    6.477609] -(1)[410:wmt_loader]Call trace:
<4>[    6.477611] -(1)[410:wmt_loader][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    6.477622] -(1)[410:wmt_loader][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    6.477626] -(1)[410:wmt_loader][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    6.477637] -(1)[410:wmt_loader][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    6.477647] -(1)[410:wmt_loader][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    6.477651] -(1)[410:wmt_loader][<ffffff80083a039c>] gpio_to_desc+0xdc/0xf0
<4>[    6.477655] -(1)[410:wmt_loader][<ffffff8000c33564>] wmt_detect_chip_pwr_ctrl+0x2ac/0x398 [wmt_drv]
<4>[    6.477902] -(1)[410:wmt_loader][<ffffff8000c33920>] wmt_detect_ext_chip_pwr_on+0x20/0x78 [wmt_drv]
<4>[    6.478088] -(1)[410:wmt_loader][<ffffff8000c33d34>] wmt_detect_ext_chip_detect+0x35c/0x500 [wmt_drv]
<4>[    6.478266] -(1)[410:wmt_loader][<ffffff80081f5184>] do_vfs_ioctl+0x384/0x688
<4>[    6.478275] -(1)[410:wmt_loader][<ffffff80081f5514>] SyS_ioctl+0x8c/0xa0
<4>[    6.478279] -(1)[410:wmt_loader][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[    6.478287] .(1)[410:wmt_loader]---[ end trace 911ba04329a1ff3d ]---
<3>[    6.478291] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_dump_pin_conf:RST(GPIO369), BGF_EINT(GPIO-1), BGF_EINT_NUM(-22)
<3>[    6.478306] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_dump_pin_conf:WIFI_EINT(GPIO371), WIFI_EINT_NUM(695)
<3>[    6.478310] .(1)[410:wmt_loader]wmt_gpio:set GPIO_COMBO_URXD_PIN to GPIO_PULL_DIS fail, is NULL!
<3>[    6.478336] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_chip_pwr_on:wmt_gpio:set GPIO_COMBO_PMU_EN_PIN to GPIO_PULL_DIS done!
<3>[    6.478355] .(1)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO90 to output 0
<3>[    6.478365] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_chip_pwr_on:wmt_gpio:set GPIO_COMBO_RST_PIN to GPIO_PULL_DIS done!
<3>[    6.478371] .(1)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO89 to output 0
<11>[    6.535761] .(0)[425:init]init: setpgid failed for console: Operation not permitted
<14>[    6.537452] .(5)[415:init]init: Created socket '/dev/socket/msap_c2k_socket3', mode 660, user 1001, group 1001
<14>[    6.539946] .(5)[415:init]init: Created socket '/dev/socket/msap_c2k_socket4', mode 660, user 1001, group 1001
<4>[    6.541129] -(1)[0:swapper/1]Power/swap DP: No enter --- SODI3: No enter --- SODI: No enter --- 
<4>[    6.541149] -(1)[0:swapper/1]mcdi cpu: 0, 0, 0, 0, 0, 0, 0, 0, cluster : 0, 0, pause = 0, multi core = 0, residency = 0, last core = 0, avail cpu = 00ff, cluster = 0003, enabled = 1, max_s_state = 5 (buck_off = 0), system_idle_hint = 00000000
<4>[    6.541149] 
<14>[    6.546198] .(5)[415:init]init: Created socket '/dev/socket/rpc', mode 660, user 1001, group 1001
<14>[    6.548590] .(5)[415:init]init: Created socket '/dev/socket/rildc-debug', mode 660, user 1001, group 1000
<14>[    6.551271] .(5)[415:init]init: Created socket '/dev/socket/rild-atci-c2k', mode 660, user 1001, group 1000
<14>[    6.553311] .(5)[415:init]init: Created socket '/dev/socket/statusd', mode 660, user 1001, group 1001
<6>[    6.554627] .(0)[6:kworker/u16:0][msdc]msdc1 power on
<5>[    6.580706] .(0)[410:wmt_loader]mtk_rtc_common: rtc_gpio_enable_32k, user = 9
<6>[    6.581026] .(1)[6:kworker/u16:0][msdc]msdc1 -> !!! Set<260KHz> Source<185999KHz> -> sclk<259KHz> timing<0> mode<0> div<179> hs400_div_dis<0>
<6>[    6.582193] .(1)[6:kworker/u16:0][msdc]msdc1 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<5>[    6.585062] -(0)[410:wmt_loader]mtk_rtc_hal: RTC_GPIO user 9 enable = 1 32k (0x200), RTC_CON = 487
<4>[    6.596966] -(1)[6:kworker/u16:0]------------[ cut here ]------------
<4>[    6.597791] -(1)[6:kworker/u16:0]WARNING: CPU: 1 PID: 6 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:513 __enable_irq+0x44/0x80()
<4>[    6.599530] -(1)[6:kworker/u16:0]Unbalanced enable for IRQ 675
<4>[    6.600290] -(1)[6:kworker/u16:0]Modules linked in: wmt_drv ffffff8000c33000           (null) 1162215 0 (O) fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    6.601831] -(1)[6:kworker/u16:0]CPU: 1 PID: 6 Comm: kworker/u16:0 Tainted: G        W  O    4.4.95+ #2
<4>[    6.603033] -(1)[6:kworker/u16:0]Hardware name: MT6763V/B (DT)
<4>[    6.603807] -(1)[6:kworker/u16:0]Workqueue: msdc-init msdc_add_host
<4>[    6.604347] -(1)[6:kworker/u16:0]Call trace:
<4>[    6.604911] -(1)[6:kworker/u16:0][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    6.605852] -(1)[6:kworker/u16:0][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    6.606740] -(1)[6:kworker/u16:0][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    6.607629] -(1)[6:kworker/u16:0][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    6.608627] -(1)[6:kworker/u16:0][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    6.609592] -(1)[6:kworker/u16:0][<ffffff800810c894>] __enable_irq+0x44/0x80
<4>[    6.610503] -(1)[6:kworker/u16:0][<ffffff800810c91c>] enable_irq+0x4c/0xa8
<4>[    6.611393] -(1)[6:kworker/u16:0][<ffffff800892f208>] mmc_gpiod_request_cd_irq+0x98/0xc0
<4>[    6.612433] -(1)[6:kworker/u16:0][<ffffff8008922fa4>] mmc_start_host+0x5c/0xb8
<4>[    6.613367] -(1)[6:kworker/u16:0][<ffffff8008924484>] mmc_add_host+0x64/0xc0
<4>[    6.614278] -(1)[6:kworker/u16:0][<ffffff800893c1e0>] msdc_add_host+0x20/0x48
<4>[    6.615208] -(1)[6:kworker/u16:0][<ffffff80080bda10>] process_one_work+0x1d0/0x468
<4>[    6.616198] -(1)[6:kworker/u16:0][<ffffff80080bddd8>] worker_thread+0x130/0x4e0
<4>[    6.617141] -(1)[6:kworker/u16:0][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    6.618009] -(1)[6:kworker/u16:0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    6.618933] -(1)[6:kworker/u16:0]---[ end trace 911ba04329a1ff3e ]---
<5>[    6.619561] -(7)[427:vold][MUSB]musb_stage0_irq 1166: musb_stage0_irq:1166 MUSB_INTR_RESET (b_idle)
<5>[    6.619582] -(7)[427:vold]QMU_WARN,<musb_disable_q_all 308>, disable_q_all
<5>[    6.619594] -(7)[427:vold][BATTERY] BAT_SetUSBState Success! Set 1
<11>[    6.620938] .(4)[1:init]init: property_set("ro.sf.lcd_density", "300") failed: property already set
<6>[    6.623946] .(4)[71:kworker/4:1][msdc]msdc1 -> Card insert<0> Block bad card<0>, mrq<          (null)> claimed<0> pwrcnt<0> <- msdc_ops_get_cd() : L<4522> PID<kworker/4:1><0x47>
<6>[    6.626143] .(4)[71:kworker/4:1][msdc]msdc1 power off
<3>[    6.704756] .(2)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_high:WMT-DETECT: set GPIO90 to output 1
<5>[    6.708073] .(5)[85:kworker/5:1][MUSB]usb_cable_connected 747: usb_cable_connected vbus_exist=1 type=2
<5>[    6.709315] .(5)[85:kworker/5:1][MUSB]usb_cable_connected 768: usb_cable_connected, connected:1, cable_mode:1, usb_data_lock:0
<6>[    6.710852] .(5)[85:kworker/5:1]android_work: sent uevent USB_STATE=CONNECTED
<6>[    6.727775] -(7)[427:vold]configfs-gadget gadget: [ratelimit]non-core control reqc0.01 v0000 i0004 l16
<6>[    6.729168] -(1)[6:kworker/u16:0]configfs-gadget gadget: [ratelimit]non-core control reqc0.01 v0000 i0004 l40
<3>[    6.744765] .(2)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_high:WMT-DETECT: set GPIO89 to output 1
<4>[    6.780690] .(2)[410:wmt_loader]mtk_wcn_cmb_sdio_off (1)
<6>[    6.782000] .(2)[410:wmt_loader][msdc]msdc2 -> MSDC Device Request Suspend
<4>[    6.782635] .(2)[410:wmt_loader]mtk_wcn_cmb_sdio_on (1)
<6>[    6.808926] .(2)[410:wmt_loader][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<5>[    6.825201] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    6.827019] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<6>[    6.827334] .(1)[410:wmt_loader][msdc]msdc2 -> MSDC Device Request Resume
<3>[    6.827329] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191038),arg(0)
<3>[    6.827338] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:++
<5>[    6.835246] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    6.838548] .(2)[228:kworker/2:2][msdc]msdc2: card is busy!
<3>[    6.848731] .(1)[410:wmt_loader][WMT-DETECT][E]wmt_detect_read_ext_cmb_status(216):WMT-DETECT: WIFI_EINT input status:1
<3>[    6.850128] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:external combo chip detected
<6>[    6.864890] .(2)[228:kworker/2:2][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<6>[    6.883009] .(2)[228:kworker/2:2][msdc]msdc2 -> !!! Set<200000KHz> Source<185999KHz> -> sclk<185999KHz> timing<6> mode<1> div<0> hs400_div_dis<0>
<6>[    6.885738] .(2)[228:kworker/2:2][AUTOK]SDIO SDR104 Tune
<6>[    6.886442] .(2)[228:kworker/2:2]DVFS ready
<5>[    6.886995] .(2)[228:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 0, dvfs_opp: 0, sw_opp: 3
<5>[    6.888229] .(2)[228:kworker/2:2][VcoreFS] opp: 0, vcore: 793750 <= 725000, fddr: 1866000 <= 1200000 [O][O]
<5>[    6.889495] -(2)[228:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 0, vcore: 0x110000, emi: 0x200000, md: 0x0
<6>[    6.894300] .(2)[228:kworker/2:2][AUTOK]CMD 0 	 54 	 OOOOOOOOOXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.898047] .(2)[228:kworker/2:2][AUTOK]CMD 1 	 41 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXOOOOOOOOOOOOOOOOOOOOO
<6>[    6.899418] .(2)[228:kworker/2:2][AUTOK]Analysis Result: 1T = 64
<6>[    6.903326] .(2)[228:kworker/2:2][AUTOK]DAT 0 	 52 	 OOOOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.907782] .(2)[228:kworker/2:2][AUTOK]DAT 1 	 37 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXOOOOOOOOOOOOOOOOOOO
<6>[    6.909174] .(2)[228:kworker/2:2][AUTOK]Analysis Result: 1T = 66
<6>[    6.909981] .(2)[228:kworker/2:2][AUTOK]CMD [EDGE:1 CMD_FIFO_EDGE:0 DLY1:9 DLY2:0]
<6>[    6.910957] .(2)[228:kworker/2:2][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:1 WD_FIFO_EDGE:1]
<6>[    6.911998] .(2)[228:kworker/2:2][AUTOK]DAT [LATCH_CK:0 DLY1:7 DLY2:0]
<6>[    6.912867] .(2)[228:kworker/2:2][AUTOK]DS  [DLY1:0 DLY2:0 DLY3:0]
<6>[    6.913676] .(2)[228:kworker/2:2][AUTOK]CLK TX  [0]
<6>[    6.914325] .(2)[228:kworker/2:2][AUTOK]CMD TX  [0]
<6>[    6.914976] .(2)[228:kworker/2:2][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    6.915827] .(2)[228:kworker/2:2][AUTOK]======Cost:24 ms======
<5>[    6.916596] .(2)[228:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 1, dvfs_opp: 1, sw_opp: 0
<5>[    6.917870] .(2)[228:kworker/2:2][VcoreFS] opp: 1, vcore: 793750 <= 793750, fddr: 1600000 <= 1866000 [O][O]
<5>[    6.919140] -(2)[228:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 1, vcore: 0x110000, emi: 0x100000, md: 0x0
<6>[    6.920510] .(2)[228:kworker/2:2]skip duplicated vcore autok
<5>[    6.921264] .(2)[228:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 2, dvfs_opp: 2, sw_opp: 1
<5>[    6.922494] .(2)[228:kworker/2:2][VcoreFS] opp: 2, vcore: 725000 <= 793750, fddr: 1600000 <= 1600000 [O][O]
<5>[    6.923747] -(2)[228:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 2, vcore: 0x10000, emi: 0x100000, md: 0x0
<6>[    6.928406] .(2)[228:kworker/2:2][AUTOK]CMD 0 	 56 	 OOOOOXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXX
<6>[    6.932096] .(2)[228:kworker/2:2][AUTOK]CMD 1 	 34 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.933479] .(2)[228:kworker/2:2][AUTOK]Analysis Result: 1T = 57
<6>[    6.937198] .(2)[228:kworker/2:2][AUTOK]DAT 0 	 51 	 OOXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXX
<6>[    6.941734] .(2)[228:kworker/2:2][AUTOK]DAT 1 	 31 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.943090] .(2)[228:kworker/2:2][AUTOK]Analysis Result: 1T = 57
<6>[    6.943893] .(2)[228:kworker/2:2][AUTOK]CMD [EDGE:1 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    6.944894] .(2)[228:kworker/2:2][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:1 WD_FIFO_EDGE:1]
<6>[    6.945941] .(2)[228:kworker/2:2][AUTOK]DAT [LATCH_CK:0 DLY1:4 DLY2:0]
<6>[    6.946789] .(2)[228:kworker/2:2][AUTOK]DS  [DLY1:0 DLY2:0 DLY3:0]
<6>[    6.947602] .(2)[228:kworker/2:2][AUTOK]CLK TX  [0]
<6>[    6.948253] .(2)[228:kworker/2:2][AUTOK]CMD TX  [0]
<6>[    6.948915] .(2)[228:kworker/2:2][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    6.949754] .(2)[228:kworker/2:2][AUTOK]======Cost:24 ms======
<5>[    6.950523] .(2)[228:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 3, dvfs_opp: 3, sw_opp: 2
<5>[    6.951754] .(2)[228:kworker/2:2][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1600000 [O][O]
<5>[    6.953019] -(2)[228:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 3, vcore: 0x10000, emi: 0x0, md: 0x0
<6>[    6.954312] .(2)[228:kworker/2:2]skip duplicated vcore autok
<6>[    6.955047] .(2)[228:kworker/2:2][AUTOK]CMD 0 	 52 	 OOOOOXOOOXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXX merge
<6>[    6.956478] .(2)[228:kworker/2:2][AUTOK]CMD 1 	 34 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXOOOOOOXXOOOOOOOOOOOOOOOOOOOOO merge
<6>[    6.957921] .(2)[228:kworker/2:2][AUTOK]cmd edge = 0 cmd dly = 35 max win = 51
<6>[    6.958866] .(2)[228:kworker/2:2][AUTOK]DAT 0 	 47 	 OOXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXX merge
<6>[    6.960296] .(2)[228:kworker/2:2][AUTOK]DAT 1 	 31 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXOOOOOOOOOOOOOOOOOOO merge
<6>[    6.961739] .(2)[228:kworker/2:2][AUTOK]dat edge = 0 dat dly = 35 max win = 46
<6>[    6.962684] .(2)[228:kworker/2:2][AUTOK][merge]======Time Cost:7 ms======
<6>[    6.963571] .(2)[228:kworker/2:2][AUTOK]merge_window = 51
<6>[    6.964275] .(2)[228:kworker/2:2][AUTOK]merge_window = 46
<6>[    6.965016] .(2)[228:kworker/2:2][AUTOK]No need change para when dvfs
<5>[    6.965855] .(2)[228:kworker/2:2][VcoreFS] kicker: KIR_AUTOK_SDIO, opp: -1, dvfs_opp: 3, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[    6.967845] .(2)[228:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_SYSFS, opp: 3, dvfs_opp: 3, sw_opp: 3
<5>[    6.969032] .(2)[228:kworker/2:2][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1200000 [O][O]
<5>[    6.970286] -(2)[228:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<5>[    6.971610] .(2)[228:kworker/2:2][VcoreFS] [spm_msdc_dvfs_setting] MSDC AUTOK FINISH
<4>[    6.972608] .(2)[228:kworker/2:2][MMDVFS][pid=228]mmdvfs service has been enabled
<4>[    6.973584] .(2)[228:kworker/2:2][pid=228]mmdvfs_notify_prepare_action: 1
<6>[    6.974910] .(2)[228:kworker/2:2]mmc2: new ultra high speed SDR104 SDIO card at address 0001
<3>[    6.976446] .(2)[228:kworker/2:2][SDIO-DETECT][I]sdio_detect_probe:vendor(0x37a) device(0x6630) num(0x1)
<3>[    6.977692] .(2)[228:kworker/2:2][SDIO-DETECT][I]hif_sdio_match_chipid_by_dev_id:valid chipId found, index(4), vendor id(0x37a), device id(0x6630), chip id(0x6630)
<4>[    6.979542] .(2)[228:kworker/2:2]set current consys chipid (0x6630)
<3>[    6.980355] .(2)[228:kworker/2:2][SDIO-DETECT][I]sdio_detect_probe:autok function detected, func:0xffffffc05732f000
<3>[    6.981885] .(2)[228:kworker/2:2][SDIO-DETECT][I]sdio_detect_probe:vendor(0x37a) device(0x6630) num(0x2)
<3>[    6.983101] .(2)[228:kworker/2:2][SDIO-DETECT][I]hif_sdio_match_chipid_by_dev_id:valid chipId found, index(4), vendor id(0x37a), device id(0x6630), chip id(0x6630)
<4>[    6.985009] .(2)[228:kworker/2:2]set current consys chipid (0x6630)
<3>[    7.052702] .(1)[410:wmt_loader][SDIO-DETECT][I]hif_sdio_is_chipid_valid:index:4, chipId:0x6630
<3>[    7.053840] .(1)[410:wmt_loader][SDIO-DETECT][I]hif_sdio_is_chipid_valid:index:4, chipId:0x6630
<3>[    7.054949] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:valid external combo chip id (0x6630)
<3>[    7.056240] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:--
<3>[    7.057355] .(1)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191040),arg(0)
<4>[    7.058519] .(1)[410:wmt_loader]query current consys chipid (0x6630)
<14>[    7.061650] .(3)[1:init]init: PropSet [persist.mtk.wcn.combo.chipid]=[0x6630] Done
<3>[    7.064881] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191032),arg(26160)
<3>[    7.066102] .(3)[410:wmt_loader][SDIO-DETECT][I]sdio_detect_do_autok:autok was move to sdio driver
<3>[    7.067380] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191033),arg(4)
<3>[    7.068537] .(3)[410:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_pwr_off:--
<4>[    7.069489] .(3)[410:wmt_loader]mtk_wcn_cmb_sdio_off (1)
<3>[    7.070324] .(3)[410:wmt_loader][SDIO-DETECT][I]sdio_detect_remove:do sdio remove
<3>[    7.071560] .(3)[410:wmt_loader][SDIO-DETECT][I]sdio_detect_remove:do sdio remove
<6>[    7.072741] .(3)[410:wmt_loader]mmc2: card 0001 removed
<14>[    7.073577] .(2)[1:init]init: PropSet [service.sf.present_timestamp]=[1] Done
<6>[    7.074545] .(5)[389:composer@2.1-se]mtk-tpd: tpd_fb_notifier_callback
<5>[    7.074612] .(5)[389:composer@2.1-se][Power/PPM] @ppm_lcmoff_switch: onoff = 1
<6>[    7.074617] .(5)[389:composer@2.1-se]#@# cm_mgr_fb_notifier_callback(176) SCREEN ON
<6>[    7.074621] .(5)[389:composer@2.1-se]mtk-tpd: tpd_fb_notifier_callback
<6>[    7.074623] .(5)[389:composer@2.1-se]mtk-tpd: fb_notify(blank=0)
<6>[    7.074624] .(5)[389:composer@2.1-se]mtk-tpd: LCD ON Notify
<14>[    7.077256] .(0)[1:init]init: PropSet [service.bootanim.exit]=[0] Done
<14>[    7.079670] .(1)[1:init]init: [PropSet]: pid:401 uid:1000 gid:1003 ctl.start, bootanim
<14>[    7.080126] .(1)[1:init]init: starting service 'bootanim'...
<3>[    7.081921] .(0)[478:SurfaceFlinger:]BOOTPROF:      7081.919785:BOOT_Animation:START
<6>[    7.084976] .(6)[410:wmt_loader][msdc]msdc2 -> MSDC Device Request Suspend
<3>[    7.085646] .(6)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO89 to output 0
<3>[    7.086880] .(6)[410:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO90 to output 0
<3>[    7.088288] .(6)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (1074034433),arg(26160)
<3>[    7.089484] .(6)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:chipid(26160)
<4>[    7.090506] .(6)[410:wmt_loader]set current consys chipid (0x6630)
<3>[    7.091299] .(6)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191035),arg(26160)
<3>[    7.092682] .(6)[410:wmt_loader][SDIO-DETECT][I]sdio_detect_exit:sdio_unregister_driver
<3>[    7.093707] .(6)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191036),arg(26160)
<3>[    7.094903] .(6)[410:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:kernel object mode
<4>[    7.095967] .(6)[410:wmt_loader][HIF-SDIO][I]hif_sdio_init:start!
<4>[    7.098258] .(0)[410:wmt_loader][STPDbg]stp_dbg_init: stp-dbg init
<4>[    7.100106] .(5)[410:wmt_loader][STPDbg]stp_dbg_core_dump_init: create coredump object OK!
<4>[    7.101244] .(5)[410:wmt_loader][HIF-SDIO][I]WMT_init:driver(major 190) installed
<3>[    7.102698] .(1)[410:wmt_loader][HIF-SDIO][E]wmt_lib_init(282):no pwr on seq and clk par found
<6>[    7.103810] .(1)[410:wmt_loader][I]wmt_export_platform_bridge_register:
<4>[    7.104722] .(1)[410:wmt_loader][WMT-CMB-HW][I]mtk_wcn_cmb_hw_dmp_seq:combo chip power on sequence time, RTC (100), LDO (100), RST(30), OFF(10), ON(30)
<4>[    7.106550] .(1)[484:mtk_wmtd][HIF-SDIO][I]wmtd_thread:wmtd thread starts
<3>[    7.106549] .(6)[410:wmt_loader][CONN-MD-DFT][W]conn_md_add_user:uid (0x80000003) is added to user list successfully
<3>[    7.106774] .(6)[410:wmt_loader][WMT-DETECT][I]wmt_detect_close:close major 154 minor 0 (pid 410)
<14>[    7.107674] .(5)[1:init]init: PropSet [service.wcn.driver.ready]=[yes] Done
<14>[    7.109130] .(5)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.bt_drv.rc:2)
<6>[    7.112211] .(5)[1:init][MTK-BT] BT_init: mtk_stp_bt_chrdev driver(major 192) installed
<14>[    7.113178] .(5)[1:init]init: Service 'wmt_loader' (pid 410) exited with status 0
<14>[    7.113624] .(5)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.gps_drv.rc:3)
<4>[    7.119425] .(3)[1:init]mtk_stp_GPS_chrdev driver(major 191) installed.
<14>[    7.120709] .(3)[1:init]init: PropSet [gps_drv.ko]=[1] Done
<4>[    7.121228] .(0)[411:wmt_launcher][HIF-SDIO][I]WMT_open:major 190 minor 0 (pid 411)
<4>[    7.121239] .(0)[411:wmt_launcher][HIF-SDIO][I]WMT_open:1st call
<4>[    7.121357] .(0)[411:wmt_launcher][WMT-PLAT][I]wmt_plat_merge_if_flag_ctrl:set gWmtMergeIfSupport to 1
<14>[    7.124549] .(3)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.wlan_drv.rc:3)
<3>[    7.126540] .(1)[411:wmt_launcher][WMT-CONF][E]wmt_conf_set_cfg_file(445):WMT config file is set to (mt6630_ant_m1.cfg)
<4>[    7.127976] .(1)[411:wmt_launcher][HIF-SDIO][I]WMT_unlocked_ioctl:luncher set STP mode success!
<4>[    7.127990] .(2)[484:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000cdd260):0-1-1,0,0,2
<3>[    7.127999] .(2)[484:mtk_wmtd][WMT-CORE][E]opfunc_hif_conf(1042):WMT-CORE: WMT HIF info added
<6>[    7.129231] .(3)[1:init][MTK-WIFI] WIFI_init: mtk_wmt_wifi_chrdev driver(major 153) installed
<4>[    7.132562] .(1)[411:wmt_launcher][STP] mtk_wcn_stp_set_wmt_last_close:[I] set wmt_last_close flag (0)
<6>[    7.134421] -(4)[427:vold]configfs-gadget gadget: high-speed config #1: b
<5>[    7.135357] -(4)[427:vold][MUSB]fifo_setup 1238: musb type=BULK
<5>[    7.136117] -(4)[427:vold][MUSB]check_musb_dbuffer_avail 1196: <check_musb_dbuffer_avail, 1196>, got bulk ep:81 in function :mtp
<5>[    7.137591] -(4)[427:vold][MUSB]is_saving_mode 1012: 0
<5>[    7.138263] -(4)[427:vold][MUSB]fifo_setup 1267: EP1 supports DBBUF
<5>[    7.139076] -(4)[427:vold][MUSB]fifo_setup 1279: fifo size is 22 after 512, fifo address is 512, epnum 1,hwepnum 1
<5>[    7.140401] -(4)[427:vold]QMU_WARN,<mtk_qmu_enable 636>, enable TQ(1)
<5>[    7.141240] -(4)[427:vold][MUSB]musb_gadget_enable 1477: musb-hdrc periph: enabled ep1in for bulk IN, maxpacket 512
<5>[    7.142572] -(4)[427:vold][MUSB]fifo_setup 1238: musb type=BULK
<5>[    7.143338] -(4)[427:vold][MUSB]check_musb_dbuffer_avail 1196: <check_musb_dbuffer_avail, 1196>, got bulk ep:1 in function :mtp
<5>[    7.144803] -(4)[427:vold][MUSB]is_saving_mode 1012: 0
<5>[    7.145475] -(4)[427:vold][MUSB]fifo_setup 1267: EP1 supports DBBUF
<5>[    7.146288] -(4)[427:vold][MUSB]fifo_setup 1279: fifo size is 22 after 512, fifo address is 1536, epnum 1,hwepnum 1
<5>[    7.147624] -(4)[427:vold]QMU_WARN,<mtk_qmu_enable 567>, enable RQ(1)
<5>[    7.148462] -(4)[427:vold][MUSB]musb_gadget_enable 1477: musb-hdrc periph: enabled ep1out for bulk OUT, maxpacket 512
<5>[    7.149815] -(4)[427:vold][MUSB]fifo_setup 1238: musb type=INT
<5>[    7.150573] -(4)[427:vold][MUSB]fifo_setup 1279: fifo size is 6 after 512, fifo address is 2560, epnum 2,hwepnum 2
<5>[    7.151897] -(4)[427:vold]QMU_WARN,<mtk_qmu_enable 636>, enable TQ(2)
<5>[    7.152736] -(4)[427:vold][MUSB]musb_gadget_enable 1477: musb-hdrc periph: enabled ep2in for int IN, maxpacket 28
<6>[    7.154046] -(4)[427:vold]configfs-gadget gadget: [COM]USB_REQ_SET_CONFIGURATION: value=0
<5>[    7.155104] -(4)[427:vold][BATTERY] BAT_SetUSBState Success! Set 2
<5>[    7.156034] .(4)[71:kworker/4:1][MUSB]usb_cable_connected 747: usb_cable_connected vbus_exist=1 type=2
<5>[    7.157237] .(4)[71:kworker/4:1][MUSB]usb_cable_connected 768: usb_cable_connected, connected:1, cable_mode:1, usb_data_lock:0
<6>[    7.158812] .(4)[71:kworker/4:1]android_work: sent uevent USB_STATE=CONFIGURED
<3>[    7.159747] .(4)[71:kworker/4:1]BOOTPROF:      7159.747478:USB configured
<6>[    7.221247] .(5)[1:init][wlan]Reset ALL DBG module log level to DEFAULT!
<6>[    7.222393] .(5)[1:init][wlan]createWirelessDevice:(INIT INFO) Create wireless device success
<6>[    7.223754] .(5)[1:init][wlan]glRegisterBus:(INIT INFO) mtk_sdio: MediaTek SDIO WLAN driver
<6>[    7.224856] .(5)[1:init][wlan]glRegisterBus:(INIT INFO) mtk_sdio: Copyright MediaTek Inc.
<14>[    7.226093] .(5)[1:init]init: Command 'insmod /vendor/lib/modules/wlan_drv_${ro.wlan.gen}.ko' action=service.wcn.driver.ready=yes (/vendor/etc/init/init.wlan_drv.rc:5) returned 0 took 96ms.
<14>[    7.229019] .(5)[1:init]init: PropSet [service.wcn.formeta.ready]=[yes] Done
<14>[    7.230046] .(5)[1:init]init: processing action (persist.mtk.wcn.coredump.mode=* && service.wcn.driver.ready=yes) from (/vendor/etc/init/init_connectivity.rc:26)
<4>[    7.232092] .(5)[1:init][WMT-DEV][I]wmt_dbg_write:write parameter len = 6
<4>[    7.232092] 
<4>[    7.232853] [WMT-DEV][I]wmt_dbg_write:write parameter data = 0x15 0
<4>[    7.232853] 
.(5)[1:init][WMT-DEV][I]wmt_dbg_write:y = 0x00000000
<4>[    7.233887] 
<4>[    7.234349] [WMT-DEV][I]wmt_dbg_write:x(0x00000015), y(0x00000000), z(0x0000000a)
<4>[    7.234349] 
<4>[    7.235559] .(5)[1:init][STP] mtk_wcn_stp_coredump_flag_ctrl:[I] disable coredump function.
<3>[    7.464493] .(7)[427:vold]BOOTPROF:      7464.490863:vold:scrypt_keymaster:END
<3>[    7.465584] .(7)[427:vold]BOOTPROF:      7465.584555:vold:decrypt_master_key:END
<6>[    7.468061] .(4)[427:vold][dm-crypt] dev path: /dev/block/platform/bootdevice/by-name/userdata, type: 0
<6>[    7.469312] .(4)[427:vold][dm-crypt] dev path: /dev/block/platform/bootdevice/by-name/userdata, type: 0
<4>[    7.800693] .(4)[427:vold][TKCORE] -11e5-b8-6d-9a-79-f0-6e-94-78
<4>[    7.800693] [   19.057664]: <4>DBG TKCore:tee_ta_open_session:1988: [TA 02662e8e: 0] init session
<4>[    7.800693] [   19.869468]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x10 pSessionContext 0x0 nParamType[TKCORE] s 0x653
<4>[    7.800693] [   19.875736]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1369: begin
<4>[    7.800693] [   19.877508]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x11 pSessionContext 0x0 nParamTypes 0x653
<4>[    7.800693] [   19.889650]: <4>INF KEYMA[TKCORE] STER:TA_InvokeCommandEntryPoint:1370: update
<4>[    7.800693] [   19.890940]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x11 pSessionContext 0x0 nParamTypes 0x653
<4>[    7.800693] [   19.935229]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:137
<3>[    7.886669] .(4)[427:vold]BOOTPROF:      7886.667941:vold:cryptfs_restart_internal:START
<4>[    7.890919] .(5)[427:vold]EXT4-fs (dm-2): Ignoring removed nomblk_io_submit option
<6>[    7.898814] .(6)[427:vold]EXT4-fs (dm-2): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<5>[    8.156988] -(4)[497:BootAnimation]random: nonblocking pool is initialized
<14>[    8.516061] .(5)[427:vold]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    8.516061] 
<14>[    8.517131] .(5)[427:vold]e2fsck: data has been mounted 10 times without being checked, check forced.
<14>[    8.517131] 
<14>[    8.518565] .(5)[427:vold]e2fsck: Pass 1: Checking inodes, blocks, and sizes
<14>[    8.518565] 
<14>[    8.519712] .(5)[427:vold]e2fsck: Pass 2: Checking directory structure
<14>[    8.519712] 
<14>[    8.520868] .(5)[427:vold]e2fsck: Pass 3: Checking directory connectivity
<14>[    8.520868] 
<14>[    8.521991] .(5)[427:vold]e2fsck: Pass 4: Checking reference counts
<14>[    8.521991] 
<14>[    8.523039] .(5)[427:vold]e2fsck: Pass 5: Checking group summary information
<14>[    8.523039] 
<14>[    8.524178] .(5)[427:vold]e2fsck: data: 4583/1605632 files (4.0% non-contiguous), 197817/6419451 blocks
<14>[    8.524178] 
<6>[    8.531911] .(0)[427:vold]EXT4-fs (dm-2): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,errors=panic
<14>[    8.534434] .(1)[1:init]init: PropSet [vold.post_fs_data_done]=[0] Done
<14>[    8.537077] .(1)[1:init]init: PropSet [vold.decrypt]=[trigger_post_fs_data] Done
<14>[    8.539614] .(1)[1:init]init: processing action (vold.decrypt=trigger_post_fs_data) from (/init.rc:727)
<14>[    8.541031] .(1)[1:init]init: processing action (vold.decrypt=trigger_post_fs_data) from (/vendor/etc/init/hw/init.mt6763.rc:910)
<3>[    8.542587] .(1)[1:init]BOOTPROF:      8542.586558:INIT:vold.decrypt=trigger_post_fs_data
<14>[    8.543771] .(1)[1:init]init: processing action (post-fs-data) from (/init.rc:420)
<14>[    8.657773] .(2)[1:init]init: starting service 'exec 5 (/system/bin/vdc --wait cryptfs init_user0)'...
<14>[    8.660132] .(2)[1:init]init: SVC_EXEC pid 515 (uid 0 gid 0+0 context default) started; waiting...
<14>[    8.679574] .(2)[1:init]init: Service 'exec 5 (/system/bin/vdc --wait cryptfs init_user0)' (pid 515) exited with status 0 waiting took 0.022000 seconds
<14>[    8.682700] .(2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/data)
<14>[    8.682700] 
<14>[    8.684459] .(2)[1:init]init: starting service 'exec 6 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)'...
<14>[    8.687120] .(2)[1:init]init: SVC_EXEC pid 516 (uid 1000 gid 1000+0 context default) started; waiting...
<14>[    8.702803] .(2)[1:init]init: Service 'exec 6 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)' (pid 516) exited with status 0 waiting took 0.018000 seconds
<14>[    8.705135] .(2)[1:init]init: processing action (post-fs-data) from (/init.usb.rc:6)
<14>[    8.710002] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.mt6763.rc:157)
<3>[    8.711334] .(0)[1:init]BOOTPROF:      8711.333174:INIT:post-fs-data
<11>[    8.712412] .(0)[1:init]init: Unable to open '/sys/block/sdc/queue/iostats': No such file or directory
<11>[    8.713691] .(0)[1:init]init: Unable to open '/sys/block/sdc/queue/read_ahead_kb': No such file or directory
<11>[    8.714966] .(0)[1:init]init: Unable to open '/sys/block/sdc/queue/nr_requests': No such file or directory
<14>[    8.716567] .(0)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvcfg)
<14>[    8.716567] 
<14>[    8.720400] .(0)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvdata)
<14>[    8.720400] 
<14>[    8.758184] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.connectivity.rc:3)
<14>[    8.765504] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.project.rc:15)
<14>[    8.768611] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.aee.rc:1)
<14>[    8.778745] .(1)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.sensor_1_0.rc:2)
<14>[    8.784842] .(1)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.modem.rc:19)
<3>[    8.786150] .(1)[1:init]BOOTPROF:      8786.149559:post-fs-data: on modem start
<14>[    8.787225] .(1)[1:init]init: PropSet [vold.post_fs_data_done]=[1] Done
<14>[    8.788335] .(1)[1:init]init: PropSet [vold.decrypt]=[trigger_load_persist_props] Done
<14>[    8.789608] .(5)[1:init]init: processing action (post-fs-data) from (/system/etc/init/bootstat.rc:3)
<14>[    8.792130] .(5)[1:init]init: PropSet [vold.decrypt]=[trigger_restart_framework] Done
<14>[    8.795001] .(5)[1:init]init: processing action (init.svc.bootanim=running && ro.crypto.type=block && post-fs-data) from (/system/etc/init/bootstat.rc:44)
<14>[    8.797646] .(5)[1:init]init: starting service 'exec 7 (/system/bin/bootstat -r post_decrypt_time_elapsed)'...
<14>[    8.800218] .(5)[1:init]init: SVC_EXEC pid 517 (uid 1000 gid 1007+0 context default) started; waiting...
<14>[    8.819335] .(5)[1:init]init: Service 'exec 7 (/system/bin/bootstat -r post_decrypt_time_elapsed)' (pid 517) exited with status 0 waiting took 0.022000 seconds
<14>[    8.821435] .(5)[1:init]init: processing action (post-fs-data) from (/system/etc/init/mobile_log_d.rc:1)
<14>[    8.825048] .(0)[1:init]init: processing action (post-fs-data) from (/system/etc/init/sn.rc:1)
<14>[    8.826435] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc:1)
<14>[    8.828548] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hostapd.android.rc:9)
<14>[    8.830671] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccifsd.rc:5)
<14>[    8.832063] .(0)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_f)
<14>[    8.832063] 
<14>[    8.833538] .(0)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_s)
<14>[    8.833538] 
<14>[    8.834875] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccimdinit.rc:4)
<14>[    8.843266] .(6)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.wod.rc:1)
<14>[    8.849236] .(6)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/mtk_agpsd.rc:1)
<14>[    8.852128] .(6)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/statusd.rc:1)
<14>[    8.855294] .(6)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/trustkernel.rc:7)
<3>[    8.856624] .(6)[1:init]BOOTPROF:      8856.622251:tkcore: prep SFS
<3>[    8.859714] .(6)[1:init]BOOTPROF:      8859.711866:tkcore: prep PP
<3>[    8.861394] .(6)[1:init]BOOTPROF:      8861.393097:tkcore: prep SPTA
<14>[    8.864218] .(6)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc:1)
<14>[    8.872806] .(6)[1:init]init: processing action (vold.decrypt=trigger_load_persist_props) from (/init.rc:722)
<14>[    8.882119] .(6)[1:init]init: PropSet [persist.atm.mdmode]=[normal] Done
<14>[    8.886862] .(6)[1:init]init: PropSet [persist.sys.pq.mdp.color.idx]=[0] Done
<14>[    8.891553] .(6)[1:init]init: PropSet [persist.sys.pq.adl.idx]=[0] Done
<14>[    8.896491] .(6)[1:init]init: PropSet [persist.sys.pq.iso.shp.en]=[2] Done
<14>[    8.901867] .(6)[1:init]init: PropSet [persist.sys.pq.ultrares.en]=[2] Done
<14>[    8.906029] .(5)[1:init]init: PropSet [persist.sys.pq.mdp.color.dbg]=[1] Done
<14>[    8.910346] .(4)[1:init]init: PropSet [persist.sys.pq.log.en]=[0] Done
<14>[    8.920179] .(6)[1:init]init: PropSet [persist.sys.pq.hdr.en]=[1] Done
<14>[    8.924548] .(6)[1:init]init: PropSet [persist.sys.pq.mdp.ccorr.en]=[2] Done
<14>[    8.929137] .(0)[1:init]init: PropSet [persist.sys.pq.mdp.dre.en]=[2] Done
<14>[    8.933323] .(0)[1:init]init: PropSet [persist.sys.bluelight.default]=[128] Done
<14>[    8.937767] .(0)[1:init]init: PropSet [persist.sys.pq.shp.idx]=[2] Done
<14>[    8.942355] .(1)[1:init]init: PropSet [persist.radio.sim.opid]=[0] Done
<14>[    8.947096] .(0)[1:init]init: PropSet [persist.radio.simswitch]=[1] Done
<14>[    8.951773] .(2)[1:init]init: PropSet [persist.radio.lastsim1_iccid]=[null] Done
<14>[    8.960629] .(2)[1:init]init: PropSet [persist.radio.c_capability_slot]=[1] Done
<14>[    8.965183] .(2)[1:init]init: PropSet [persist.radio.raf1]=[94714] Done
<14>[    8.969571] .(2)[1:init]init: PropSet [persist.radio.last_iccid_sim1]=[N/A] Done
<14>[    8.974278] .(1)[1:init]init: PropSet [persist.radio.rilj_nw_type1]=[-1] Done
<14>[    8.978636] .(1)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[    8.983965] .(1)[1:init]init: PropSet [persist.sys.usb.config]=[adb] Done
<14>[    8.988731] .(1)[1:init]init: PropSet [persist.sys.webview.vmsize]=[125701040] Done
<14>[    8.994083] .(2)[1:init]init: PropSet [persist.radio.airplane.mode.on]=[false] Done
<14>[    8.998639] .(0)[1:init]init: PropSet [persist.radio.cellular_ps_reg]=[0] Done
<14>[    9.003021] .(0)[1:init]init: PropSet [persist.radio.volte_state]=[1] Done
<14>[    9.007312] .(2)[1:init]init: PropSet [persist.radio.sim.mode]=[1] Done
<14>[    9.011769] .(2)[1:init]init: PropSet [persist.radio.data.iccid]=[89860119933700000608] Done
<14>[    9.016481] .(2)[1:init]init: PropSet [persist.sys.mtk.disable.moms]=[0] Done
<14>[    9.020719] .(2)[1:init]init: PropSet [persist.service.stk.shutdown]=[0] Done
<14>[    9.025579] .(0)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[20181019b001011] Done
<14>[    9.030567] .(3)[1:init]init: PropSet [persist.dlwifi.wifi_band_selection]=[2] Done
<14>[    9.035258] .(3)[1:init]init: PropSet [persist.netd.stable_secret]=[5afd:1aff:dea:7718:933c:b393:876:5bb8] Done
<14>[    9.040206] .(1)[1:init]init: PropSet [persist.radio.airplane_mode_on]=[0] Done
<14>[    9.048498] .(1)[1:init]init: PropSet [persist.sys.nlp.enabled]=[0] Done
<14>[    9.052820] .(0)[1:init]init: PropSet [persist.radio.simswitchstate]=[0] Done
<14>[    9.057398] .(0)[1:init]init: PropSet [persist.radio.unlock]=[false] Done
<14>[    9.061004] .(0)[1:init]init: PropSet [persist.radio.sim.status]=[] Done
<14>[    9.065302] .(0)[1:init]init: PropSet [persist.radio.cfu.iccid.0]=[89860119933700000608] Done
<14>[    9.070033] .(1)[1:init]init: PropSet [persist.radio.cfu.change.0]=[1] Done
<14>[    9.076011] .(3)[1:init]init: PropSet [persist.radio.terminal-based.cw]=[disabled_tbcw] Done
<14>[    9.079467] .(3)[1:init]init: PropSet [persist.radio.cfu.timeslot.0]=[] Done
<14>[    9.083884] .(3)[1:init]init: PropSet [persist.radio.cfu.mode]=[disabled_cfu_mode] Done
<14>[    9.088962] .(3)[1:init]init: PropSet [persist.radio.cfu_over_ims]=[0] Done
<14>[    9.092738] .(3)[1:init]init: PropSet [persist.radio.new.sim.slot]=[] Done
<14>[    9.097051] .(3)[1:init]init: PropSet [persist.radio.simswitch.iccid]=[89860119933700000608] Done
<14>[    9.101053] .(3)[1:init]init: PropSet [persist.sys.gps.lpp]=[] Done
<14>[    9.105085] .(3)[1:init]init: PropSet [persist.mtk.volte.enable]=[1] Done
<14>[    9.110705] .(3)[1:init]init: PropSet [persist.mtk.wfc.enable]=[0] Done
<14>[    9.115097] .(3)[1:init]init: PropSet [persist.mtk.vilte.enable]=[0] Done
<14>[    9.119593] .(3)[1:init]init: PropSet [persist.mtk.viwifi.enable]=[0] Done
<14>[    9.124125] .(3)[1:init]init: PropSet [persist.sys.locale]=[zh-Hans-CN] Done
<14>[    9.128775] .(3)[1:init]init: PropSet [persist.dlwifi.periodic_scan_interval_ms]=[1000] Done
<14>[    9.133323] .(1)[1:init]init: PropSet [persist.dlwifi.max_periodic_scan_interval_ms]=[16000] Done
<14>[    9.137985] .(0)[1:init]init: PropSet [persist.dlwifi.cpsinterval_ms]=[2000] Done
<14>[    9.142055] .(0)[1:init]init: PropSet [persist.dlwifi.mcpsinterval_ms]=[16000] Done
<14>[    9.146566] .(0)[1:init]init: PropSet [persist.dlwifi.disconnected_pno_scan_interval_ms]=[2000] Done
<14>[    9.152424] .(3)[1:init]init: PropSet [persist.dlwifi.connected_pno_scan_interval_ms]=[16000] Done
<14>[    9.157030] .(3)[1:init]init: PropSet [persist.dlwifi.low_rssi_network_retry_start_delay_ms]=[2000] Done
<14>[    9.161816] .(0)[1:init]init: PropSet [persist.dlwifi.low_rssi_network_retry_max_delay_ms]=[8000] Done
<14>[    9.169228] .(1)[1:init]init: PropSet [persist.mtklog.log2sd.path]=[internal_sd] Done
<11>[    9.170434] .(1)[1:init]init: property_set("ro.persistent_properties.ready", "true") failed: property already set
<14>[    9.171837] .(1)[1:init]init: Command 'load_persist_props' action=vold.decrypt=trigger_load_persist_props (/init.rc:723) returned 0 took 297ms.
<14>[    9.174179] .(1)[1:init]init: starting service 'logd-reinit'...
<14>[    9.176297] .(1)[1:init]init: processing action (vold.decrypt=trigger_load_persist_props) from (/vendor/etc/init/hw/init.aee.rc:18)
<14>[    9.177975] .(1)[1:init]init: Sending signal 9 to service 'aee_aedv' (pid 362) process group...
<14>[    9.184800] .(1)[1:init]init: Successfully killed process cgroup uid 0 pid 362 in 5ms
<14>[    9.186312] .(1)[1:init]init: Service 'aee_aedv' (pid 362) killed by signal 9
<14>[    9.187542] .(1)[1:init]init: Sending signal 9 to service 'aee_aedv64' (pid 363) process group...
<14>[    9.194219] .(1)[1:init]init: Successfully killed process cgroup uid 0 pid 363 in 5ms
<14>[    9.195610] .(1)[1:init]init: Service 'aee_aedv64' (pid 363) killed by signal 9
<30>[    9.195892] .(5)[355:logd.daemon]logd.daemon: reinit
<14>[    9.197702] .(1)[1:init]init: Service 'logd-reinit' (pid 518) exited with status 0
<14>[    9.199034] .(1)[1:init]init: Sending signal 9 to service 'aee_aed' (pid 356) process group...
<14>[    9.205648] .(1)[1:init]init: Successfully killed process cgroup uid 0 pid 356 in 5ms
<14>[    9.207026] .(1)[1:init]init: Service 'aee_aed' (pid 356) killed by signal 9
<14>[    9.208254] .(1)[1:init]init: Sending signal 9 to service 'aee_aed64' (pid 361) process group...
<14>[    9.215042] .(1)[1:init]init: Successfully killed process cgroup uid 0 pid 361 in 5ms
<14>[    9.216573] .(1)[1:init]init: PropSet [log.tag]=[I] Done
<31>[    9.217581] .(3)[355:logd.daemon]logd: logd no log reader, set log level to INFO!
<14>[    9.219047] .(1)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/init.rc:735)
<11>[    9.220372] .(1)[1:init]init: ExecStart(update_verifier): Service not found
<14>[    9.221402] .(1)[1:init]init: Service 'aee_aed64' (pid 361) killed by signal 9
<14>[    9.223337] .(1)[1:init]init: starting service 'flash_recovery'...
<11>[    9.225543] .(1)[1:init]init: cannot find '/system/bin/cmmbsp', disabling 'cmmb': No such file or directory
<14>[    9.227845] .(1)[1:init]init: starting service 'mnld'...
<14>[    9.231297] .(1)[1:init]init: starting service 'zygote'...
<14>[    9.231536] .(0)[520:init]init: Created socket '/dev/socket/mnld', mode 660, user 1021, group 1000
<14>[    9.235108] .(1)[1:init]init: starting service 'zygote_secondary'...
<14>[    9.236915] .(0)[521:init]init: Created socket '/dev/socket/zygote', mode 660, user 0, group 1000
<14>[    9.238014] .(1)[1:init]init: starting service 'aal'...
<14>[    9.240259] .(1)[1:init]init: starting service 'audioserver'...
<14>[    9.244747] .(1)[1:init]init: starting service 'batterywarning'...
<14>[    9.246578] .(0)[522:init]init: Created socket '/dev/socket/zygote_secondary', mode 660, user 0, group 1000
<14>[    9.248297] .(1)[1:init]init: starting service 'cameraserver'...
<14>[    9.252249] .(1)[1:init]init: starting service 'drm'...
<11>[    9.254460] .(1)[527:init]init: couldn't write 527 to /dev/cpuset/camera-daemon/tasks: No such file or directory
<14>[    9.256112] .(4)[1:init]init: starting service 'thermald'...
<14>[    9.258918] .(4)[1:init]init: starting service 'vtservice'...
<14>[    9.262140] .(4)[1:init]init: starting service 'installd'...
<14>[    9.266351] .(4)[1:init]init: starting service 'keystore'...
<14>[    9.270075] .(4)[1:init]init: starting service 'mediadrm'...
<14>[    9.273284] .(4)[1:init]init: starting service 'mediaextractor'...
<14>[    9.277034] .(4)[1:init]init: starting service 'mediametrics'...
<14>[    9.281145] .(4)[1:init]init: starting service 'media'...
<14>[    9.283918] .(4)[1:init]init: starting service 'met_log_d'...
<14>[    9.286737] .(4)[1:init]init: starting service 'mobile_log_d'...
<14>[    9.289923] .(4)[1:init]init: starting service 'mtk_advcamserver'...
<14>[    9.293630] .(4)[1:init]init: starting service 'netd'...
<14>[    9.296982] .(4)[1:init]init: starting service 'netdiag'...
<14>[    9.298614] .(7)[541:init]init: Created socket '/dev/socket/netd', mode 660, user 0, group 1000
<14>[    9.299786] .(4)[1:init]init: starting service 'PPLAgent'...
<14>[    9.300487] .(7)[541:init]init: Created socket '/dev/socket/dnsproxyd', mode 660, user 0, group 3003
<14>[    9.301461] .(7)[541:init]init: Created socket '/dev/socket/mdns', mode 660, user 0, group 1000
<14>[    9.302239] .(7)[541:init]init: Created socket '/dev/socket/fwmarkd', mode 660, user 0, group 3003
<14>[    9.306633] .(4)[1:init]init: starting service 'storaged'...
<14>[    9.311368] .(4)[1:init]init: starting service 'wificond'...
<14>[    9.315830] .(4)[1:init]init: starting service 'mediacodec'...
<14>[    9.316504] .(6)[544:init]init: Opened file '/d/mmc0/mmc0:0001/ext_csd', flags 0
<14>[    9.320485] .(4)[1:init]init: starting service 'sensors-hal-1-0'...
<14>[    9.324065] .(4)[1:init]init: starting service 'camerahalserver'...
<14>[    9.328409] .(4)[1:init]init: starting service 'fuelgauged_nvram'...
<11>[    9.331064] .(6)[548:init]init: couldn't write 548 to /dev/cpuset/camera-daemon/tasks: No such file or directory
<14>[    9.336748] .(6)[1:init]init: starting service 'thermal'...
<14>[    9.340353] .(6)[1:init]init: starting service 'thermal_manager'...
<14>[    9.343554] .(6)[1:init]init: starting service 'thermalloadalgod'...
<14>[    9.347347] .(6)[1:init]init: starting service 'ipsec_mon'...
<14>[    9.351242] .(6)[1:init]init: starting service 'lbs_hidl_service'...
<36>[    9.360032] .(7)[367:logd.auditd]type=1400 audit(1578646634.526:29): avc: denied { write } for pid=364 comm="teed" name="/" dev="tmpfs" ino=2088 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0 duplicate messages suppressed
<36>[    9.363228] .(7)[367:logd.auditd]type=1400 audit(1578646637.794:30): avc: denied { read } for pid=544 comm="storaged" path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=97 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
<14>[    9.365151] .(6)[1:init]init: starting service 'agpsd'...
<14>[    9.367353] .(6)[1:init]init: starting service 'NvRAMAgent'...
<14>[    9.370341] .(6)[1:init]init: starting service 'nvram_daemon'...
<14>[    9.374506] .(6)[557:init]init: Created socket '/dev/socket/agpsd', mode 660, user 1021, group 1000
<6>[    9.375024] .(3)[542:netdiag]capability: warning: `netdiag' uses 32-bit capabilities (legacy support in use)
<14>[    9.382908] .(6)[1:init]init: starting service 'sysenv_daemon'...
<14>[    9.385768] .(6)[557:init]init: Created socket '/dev/socket/agpsd2', mode 660, user 1021, group 3003
<14>[    9.387804] .(6)[557:init]init: Created socket '/dev/socket/agpsd3', mode 660, user 1021, group 3003
<14>[    9.394963] .(6)[1:init]init: starting service 'gnss_service'...
<14>[    9.402662] .(6)[1:init]init: starting service 'pq-2-0'...
<14>[    9.408510] .(6)[1:init]init: starting service 'wifi2agps'...
<14>[    9.411569] .(6)[1:init]init: Command 'class_start main' action=vold.decrypt=trigger_restart_framework (/init.rc:738) returned 0 took 188ms.
<11>[    9.419124] .(6)[550:fuelgauged_nvra]NVRAM: fgauge_nvram: service.nvram_init=
<14>[    9.421845] .(6)[1:init]init: PropSet [debug.met.running]=[0] Done
<11>[    9.422853] .(6)[1:init]init: cannot find '/vendor/bin/STFlashTool', disabling 'stflashtool': No such file or directory
<14>[    9.426788] .(6)[1:init]init: starting service 'gatekeeperd'...
<14>[    9.442816] .(6)[1:init]init: starting service 'program_binary'...
<14>[    9.450470] .(6)[1:init]init: starting service 'sn'...
<14>[    9.466367] .(3)[1:init]init: starting service 'tombstoned'...
<14>[    9.474434] .(6)[1:init]init: starting service 'netdagent'...
<14>[    9.476430] .(6)[1:init]init: Command 'class_start late_start' action=vold.decrypt=trigger_restart_framework (/init.rc:739) returned 0 took 53ms.
<14>[    9.480169] .(6)[574:init]init: Created socket '/dev/socket/tombstoned_crash', mode 666, user 1000, group 1000
<14>[    9.482375] .(6)[574:init]init: Created socket '/dev/socket/tombstoned_intercept', mode 666, user 1000, group 1000
<14>[    9.483097] .(0)[1:init]init: PropSet [debug.mtklog.netlog.Running]=[0] Done
<14>[    9.483192] .(0)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/hw/init.mt6763.rc:919)
<3>[    9.483312] .(0)[1:init]BOOTPROF:      9483.311868:INIT:vold.decrypt=trigger_restart_framework
<14>[    9.484159] .(0)[1:init]init: PropSet [debug.met_log_d.version]=[V6.0.0] Done
<14>[    9.493904] .(3)[1:init]init: PropSet [net.ims.ipsec.version]=[2.0] Done
<11>[    9.495587] .(3)[1:init]init: do_start: Service msensord not found
<14>[    9.497303] .(3)[1:init]init: [PropSet]: pid:545 uid:1010 gid:1010 ctl.stop, wpa_supplicant
<11>[    9.498745] .(3)[1:init]init: do_start: Service permission_check not found
<14>[    9.500188] .(3)[1:init]init: PropSet [debug.met_log_d.user]=[shell] Done
<14>[    9.501851] .(3)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/md_ctrl.rc:7)
<14>[    9.503818] .(6)[574:init]init: Created socket '/dev/socket/tombstoned_java_trace', mode 666, user 1000, group 1000
<14>[    9.504231] .(3)[1:init]init: starting service 'start_modem'...
<14>[    9.506312] .(3)[1:init]init: [PropSet]: pid:545 uid:1010 gid:1010 ctl.stop, hostapd
<14>[    9.507684] .(3)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/sysenv_daemon.rc:4)
<3>[    9.546253] .(4)[562:sysenv_daemon]ENV_USER_INIT!
<3>[    9.546935] .(4)[562:sysenv_daemon]ENV_USER_INIT!
<5>[    9.547001] .(2)[553:thermal_manager][Thermal/TZ/BTS] mtkts_bts_prepare_table table_num=7
<5>[    9.547098] .(2)[553:thermal_manager][Thermal/TZ/BTSMDPA] mtkts_btsmdpa_prepare_table table_num=7
<4>[    9.547222] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_write_atm_setting input 0 2000 10 15 1 685 0 280 0
<4>[    9.547237] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_write_dtm_setting applied 0 2000 10 15 1 685 1582 332 576
<4>[    9.547296] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_write_atm_setting input 1 1000 10 15 1 400 0 220 0
<4>[    9.547302] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_write_dtm_setting applied 1 1000 10 15 1 400 1582 332 576
<4>[    9.547452] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_write_ctm input 2 85000 59000 43000 46000 75000 52000 457636 8666 404682 7667 500 500 13500 -1
<4>[    9.548223] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    9.548300] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    9.548314] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    9.548332] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    9.559067] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 0
<4>[    9.559142] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 2
<4>[    9.559165] .(2)[553:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 1
<4>[    9.564795] -(2)[553:thermal_manager]mt6356_get_auxadc_value: 10 callbacks suppressed
<3>[    9.571808] .(4)[557:mtk_agpsd]Dump cpuinfo
<4>[    9.586432] .(4)[553:thermal_manager]=====FG===== AC   = -39
<4>[    9.589738] .(4)[553:thermal_manager][HIF-SDIO][I]wmt_lib_is_therm_ctrl_support:thermal command can`t send: STP is not enable(0) or ready(0)
<4>[    9.591372] .(4)[553:thermal_manager][HIF-SDIO][I]wmt_dev_tm_temp_query:[Thermal] current_temp = 0x0
<4>[    9.641467] .(4)[553:thermal_manager]=====   BTS BB Mainboard output output mV = 414
<4>[    9.642473] .(4)[553:thermal_manager]======  BTS BB Mainboard output temperature = 21
<4>[    9.643659] .(4)[553:thermal_manager][Thermal/TC/bcct]chrlmt_set_limit ffffff8009a77350 -1 -1 5000
<4>[    9.643684] .(0)[187:kworker/u17:1][Thermal/TC/bcct]chrlmt_set_limit_handler -1 -1
<5>[    9.643694] .(0)[187:kworker/u17:1]charger_manager_set_input_current_limit: dev:mtk-cooler-bcct idx:0 en:-1
<4>[    9.643878] .(1)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.643889] .(1)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.643896] .(1)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.644082] .(3)[187:kworker/u17:1][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    9.644740] .(3)[187:kworker/u17:1]temp_now=193, temp_last=193 
<4>[    9.644751] .(3)[187:kworker/u17:1]=====FG===== TEMP = 193
<4>[    9.646453] .(0)[187:kworker/u17:1]=====FG===== VOLT = 4307
<4>[    9.646465] .(0)[187:kworker/u17:1]=====FG===== actural VOLT = 4311
<4>[    9.647018] .(3)[187:kworker/u17:1]=====FG===== AC   = -39
<4>[    9.648456] .(0)[187:kworker/u17:1]=====FG===== SOC  = 100
<4>[    9.649139] .(1)[187:kworker/u17:1]=====FG===== SOH  = 100
<4>[    9.649160] .(1)[187:kworker/u17:1]DLCP bat_vol=4311,  temperature=193  
<4>[    9.649164] .(1)[187:kworker/u17:1] ===CC_value from battery temprature=700000
<4>[    9.649170] .(1)[187:kworker/u17:1]DLCP __mt6370_set_ieoc      = 150000
<4>[    9.649458] .(1)[187:kworker/u17:1]DLCP mt6370_set_vrech       = 300
<4>[    9.649904] .(1)[187:kworker/u17:1]DLCP mt6370_get_vrech       = 300
<4>[    9.649910] .(1)[187:kworker/u17:1]DLCP read cv              = 4350000
<4>[    9.649913] .(1)[187:kworker/u17:1]DLCP read eoc             = 250000
<4>[    9.649915] .(1)[187:kworker/u17:1]DLCP read recharge        = 300
<4>[    9.649919] .(1)[187:kworker/u17:1]DLCP Target Temp          = 410
<4>[    9.649921] .(1)[187:kworker/u17:1]DLCP Charge Current       = 2000
<4>[    9.649923] .(1)[187:kworker/u17:1]DLPID 
<4>[    9.649925] .(1)[187:kworker/u17:1]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    9.649927] .(1)[187:kworker/u17:1]DLPID PID Target Temp = 410 
<4>[    9.649929] .(1)[187:kworker/u17:1]DLPID Battery Temp    = 193 
<4>[    9.649932] .(1)[187:kworker/u17:1]DLPID TEMP DIFF       = 189 
<4>[    9.649934] .(1)[187:kworker/u17:1]DLPID PID KI          = 5000 
<4>[    9.649937] .(1)[187:kworker/u17:1]DLPID CC MAX          = 700000 
<4>[    9.649939] .(1)[187:kworker/u17:1]DLPID PID Current     = 700000 
<4>[    9.649942] .(1)[187:kworker/u17:1]DLCP ccurrent from charge type        = 500000
<4>[    9.649944] .(1)[187:kworker/u17:1]DLCP ccurrent from battery temprature = 700000
<4>[    9.649946] .(1)[187:kworker/u17:1]DLCP ccurrent from PID algorithm      = 700000
<4>[    9.649949] .(1)[187:kworker/u17:1]DLCP ccurrent from DLPL               = 2000000
<4>[    9.649955] .(1)[187:kworker/u17:1]DLCP set input current:500000 
<4>[    9.651375] .(3)[187:kworker/u17:1]DLCP set charge current: 500000 
<4>[    9.652986] .(1)[187:kworker/u17:1]DLCP mt6370_enable_charging :1 
<5>[    9.653188] .(1)[187:kworker/u17:1]charger_manager_set_charging_current_limit: dev:mtk-cooler-bcct idx:0 en:-1
<5>[    9.653209] .(5)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[    9.653248] .(5)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.653327] .(1)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.653336] .(1)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.653344] .(1)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.653861] .(0)[187:kworker/u17:1][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    9.654438] .(1)[187:kworker/u17:1]temp_now=193, temp_last=193 
<4>[    9.654445] .(1)[187:kworker/u17:1]=====FG===== TEMP = 193
<4>[    9.655668] .(0)[187:kworker/u17:1]=====FG===== VOLT = 4307
<4>[    9.655685] .(0)[187:kworker/u17:1]=====FG===== actural VOLT = 4311
<4>[    9.656223] .(3)[187:kworker/u17:1]=====FG===== AC   = -39
<4>[    9.656767] .(1)[187:kworker/u17:1]=====FG===== SOC  = 100
<4>[    9.657311] .(3)[187:kworker/u17:1]=====FG===== SOH  = 100
<4>[    9.657325] .(3)[187:kworker/u17:1]DLCP bat_vol=4311,  temperature=193  
<4>[    9.657329] .(3)[187:kworker/u17:1] ===CC_value from battery temprature=700000
<4>[    9.657335] .(3)[187:kworker/u17:1]DLCP __mt6370_set_ieoc      = 150000
<4>[    9.657976] .(1)[187:kworker/u17:1]DLCP mt6370_set_vrech       = 300
<4>[    9.658401] .(1)[187:kworker/u17:1]DLCP mt6370_get_vrech       = 300
<4>[    9.658411] .(1)[187:kworker/u17:1]DLCP read cv              = 4350000
<4>[    9.658415] .(1)[187:kworker/u17:1]DLCP read eoc             = 250000
<4>[    9.658417] .(1)[187:kworker/u17:1]DLCP read recharge        = 300
<4>[    9.658421] .(1)[187:kworker/u17:1]DLCP Target Temp          = 410
<4>[    9.658423] .(1)[187:kworker/u17:1]DLCP Charge Current       = 2000
<4>[    9.658425] .(1)[187:kworker/u17:1]DLPID 
<4>[    9.658427] .(1)[187:kworker/u17:1]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    9.658429] .(1)[187:kworker/u17:1]DLPID PID Target Temp = 410 
<4>[    9.658431] .(1)[187:kworker/u17:1]DLPID Battery Temp    = 193 
<4>[    9.658433] .(1)[187:kworker/u17:1]DLPID TEMP DIFF       = 203 
<4>[    9.658435] .(1)[187:kworker/u17:1]DLPID PID KI          = 5000 
<4>[    9.658438] .(1)[187:kworker/u17:1]DLPID CC MAX          = 700000 
<4>[    9.658440] .(1)[187:kworker/u17:1]DLPID PID Current     = 700000 
<4>[    9.658442] .(1)[187:kworker/u17:1]DLCP ccurrent from charge type        = 500000
<4>[    9.658444] .(1)[187:kworker/u17:1]DLCP ccurrent from battery temprature = 700000
<4>[    9.658446] .(1)[187:kworker/u17:1]DLCP ccurrent from PID algorithm      = 700000
<4>[    9.658449] .(1)[187:kworker/u17:1]DLCP ccurrent from DLPL               = 2000000
<4>[    9.658452] .(1)[187:kworker/u17:1]DLCP set input current:500000 
<4>[    9.658822] .(0)[187:kworker/u17:1]DLCP set charge current: 500000 
<4>[    9.659088] .(0)[187:kworker/u17:1]DLCP mt6370_enable_charging :1 
<6>[    9.659275] .(3)[187:kworker/u17:1][charger_manager_enable_high_voltage_charging] already set: 0 1
<6>[    9.695361] .(5)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    9.695376] .(5)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    9.696150] .(5)[266:charger_thread]=====FG===== AC   = -39
<4>[    9.696928] .(6)[266:charger_thread]=====FG===== AC   = -39
<4>[    9.723228] .(7)[553:thermal_manager]===== APtery output mV = 453
<4>[    9.725123] .(7)[553:thermal_manager]===== BTSMDPA output temperature = 19
<6>[    9.730121] .(2)[585:mtk_agpsd][ccci1/chr]port ttyC2 open with flag 20802 by mtk_agpsd
<6>[    9.733282] .(2)[585:mtk_agpsd][ccci1/chr]write error done on ttyC2, l=16 r=-19
<3>[    9.733677] .(6)[520:mnld]Dump cpuinfo
<3>[    9.764339] .(7)[547:android.hardwar]<ACCELEROMETER> acc_store_cali 480 : ACC DRIVER OLD ARCHITECTURE DON'T SUPPORT ACC COMMON VERSION FLUSH
<6>[    9.766997] .(7)[547:android.hardwar]<MAGNETIC> mag_store_cali: MAG DRIVER OLD ARCHITECTURE DON'T SUPPORT MAG COMMON VERSION FLUSH
<6>[    9.772545] .(7)[547:android.hardwar]<GYROSCOPE> GYRO DRIVER OLD ARCHITECTURE DON'T SUPPORT GYRO COMMON VERSION FLUSH
<3>[    9.793625] .(3)[427:vold]BOOTPROF:      9793.623330:vold:cryptfs_restart_internal:END
<4>[    9.804886] .(4)[266:charger_thread]lifetime: data[0]=df 
<4>[    9.805617] .(4)[266:charger_thread]lifetime: data[1]=ff 
<4>[    9.806332] .(4)[266:charger_thread]lifetime: data[2]=40 
<4>[    9.807038] .(4)[266:charger_thread]lifetime: data[3]=11 
<4>[    9.807743] .(4)[266:charger_thread]lifetime: data[4]=45 
<4>[    9.808447] .(4)[266:charger_thread]lifetime: data[5]=a 
<4>[    9.809985] .(4)[266:charger_thread]lifetime: data[6]=fc 
<4>[    9.824704] .(4)[266:charger_thread]lifetime: data[7]=8 
<4>[    9.825416] .(4)[266:charger_thread]lifetime: data[8]=68 
<4>[    9.826159] .(4)[266:charger_thread]lifetime: data[9]=f7 
<4>[    9.826857] .(4)[266:charger_thread]lifetime: data[10]=18 
<4>[    9.827577] .(4)[266:charger_thread]lifetime: data[11]=0 
<4>[    9.829877] .(0)[266:charger_thread]=====FG-MTK===== bat_vol=4250
<4>[    9.835041] .(0)[266:charger_thread]=====FG===== AC   = -39
<5>[    9.844980] .(7)[266:charger_thread]Vbat=4250,Ibat=39,I=0,VChr=4730,T=25,Soc=100:100,CT:2:2 hv:1 pd:0:0
<5>[    9.846351] .(7)[266:charger_thread][mtk_is_charger_on]info->chr_type=2 
<4>[    9.850145] .(7)[266:charger_thread]temp_now=193, temp_last=193 
<4>[    9.850949] .(7)[266:charger_thread]=====FG===== TEMP = 193
<5>[    9.851684] .(7)[266:charger_thread]charger_check_status
<5>[    9.896248] .(1)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    9.898970] .(1)[266:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[    9.899847] .(1)[266:charger_thread]charger_check_status tmp:19 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    9.903559] .(0)[266:charger_thread]mtk_switch_charging_run [1 0], timer=0
<3>[    9.919437] .(0)[528:drmserver]Dump cpuinfo
<5>[    9.954637] .(1)[266:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:25,39,16 pps:0 en:0 ibus:0 80
<5>[    9.955878] .(1)[266:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[    9.957043] .(1)[266:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<5>[    9.959720] .(3)[266:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4721, delta = -279
<4>[    9.961450] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.962874] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.965093] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.966771] .(3)[266:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    9.968935] .(3)[266:charger_thread]temp_now=193, temp_last=193 
<4>[    9.969749] .(3)[266:charger_thread]=====FG===== TEMP = 193
<4>[    9.971672] .(3)[266:charger_thread]=====FG===== VOLT = 4307
<4>[    9.972427] .(3)[266:charger_thread]=====FG===== actural VOLT = 4311
<4>[    9.973876] .(1)[266:charger_thread]=====FG===== AC   = -39
<4>[    9.975160] .(1)[266:charger_thread]=====FG===== SOC  = 100
<4>[    9.976457] .(1)[266:charger_thread]=====FG===== SOH  = 100
<4>[    9.977261] .(1)[266:charger_thread]DLCP bat_vol=4311,  temperature=193  
<4>[    9.978151] .(1)[266:charger_thread] ===CC_value from battery temprature=700000
<4>[    9.979102] .(1)[266:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<4>[    9.980285] .(1)[266:charger_thread]DLCP mt6370_set_vrech       = 300
<4>[    9.981599] .(1)[266:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[    9.982471] .(1)[266:charger_thread]DLCP read cv              = 4350000
<4>[    9.983330] .(1)[266:charger_thread]DLCP read eoc             = 250000
<4>[    9.984173] .(1)[266:charger_thread]DLCP read recharge        = 300
<4>[    9.985121] .(1)[266:charger_thread]DLCP Target Temp          = 410
<4>[    9.985940] .(1)[266:charger_thread]DLCP Charge Current       = 2000
<4>[    9.986760] .(1)[266:charger_thread]DLPID 
<4>[    9.987310] .(1)[266:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    9.988400] .(1)[266:charger_thread]DLPID PID Target Temp = 410 
<4>[    9.992768] .(4)[266:charger_thread]DLPID Battery Temp    = 193 
<4>[    9.993571] .(4)[266:charger_thread]DLPID TEMP DIFF       = 210 
<4>[    9.994347] .(4)[266:charger_thread]DLPID PID KI          = 5000 
<4>[    9.995141] .(4)[266:charger_thread]DLPID CC MAX          = 700000 
<4>[    9.995955] .(4)[266:charger_thread]DLPID PID Current     = 700000 
<4>[   10.000553] .(4)[266:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[   10.001612] .(4)[266:charger_thread]DLCP ccurrent from battery temprature = 700000
<4>[   10.002590] .(4)[266:charger_thread]DLCP ccurrent from PID algorithm      = 700000
<4>[   10.003564] .(4)[266:charger_thread]DLCP ccurrent from DLPL               = 2000000
<4>[   10.004552] .(4)[266:charger_thread]DLCP set input current:500000 
<4>[   10.009172] .(1)[266:charger_thread]DLCP set charge current: 500000 
<4>[   10.011263] .(1)[266:charger_thread]DLCP mt6370_enable_charging :1 
<4>[   10.012330] .(1)[266:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[   10.013465] .(1)[266:charger_thread]DLCP __mt6370_set_cv       = 4350000
<4>[   10.014604] .(7)[266:charger_thread]DLCP mt6370_enable_charging :1 
<3>[   10.025536] .(0)[521:zygote64]BOOTPROF:     10025.534177:boot_progress_start
<14>[   10.070435] .(4)[1:init]init: PropSet [debug.MB.running]=[0] Done
<14>[   10.074444] .(4)[1:init]init: Service 'flash_recovery' (pid 519) exited with status 0
<14>[   10.076483] .(4)[1:init]init: Service 'thermal_manager' (pid 553) exited with status 0
<14>[   10.081852] .(4)[1:init]init: PropSet [debug.pq.shp.en]=[2] Done
<14>[   10.087036] .(4)[1:init]init: PropSet [vold.encryption.type]=[default] Done
<14>[   10.093713] .(4)[1:init]init: PropSet [service.nvram_init]=[Ready] Done
<14>[   10.115925] .(4)[1:init]init: PropSet [debug.MB.realpath]=[/data/log_temp/boot/] Done
<14>[   10.126700] .(4)[1:init]init: PropSet [debug.pq.dshp.en]=[2] Done
<14>[   10.158984] .(6)[1:init]init: PropSet [persist.sys.pq.mdp.color.idx]=[0] Done
<14>[   10.162178] .(6)[1:init]init: PropSet [ftrace.buffer.log]=[bsp] Done
<14>[   10.164447] .(6)[1:init]init: processing action (ftrace.buffer.log=bsp) from (/system/etc/init/mobile_log_d.rc:24)
<3>[   10.166603] .(1)[537:mediaserver]Dump cpuinfo
<14>[   10.173461] .(6)[1:init]init: starting service 'bsplogstart'...
<14>[   10.192931] .(6)[1:init]init: PropSet [persist.sys.pq.adl.idx]=[0] Done
<14>[   10.216017] .(5)[1:init]init: PropSet [persist.sys.pq.iso.shp.en]=[2] Done
<6>[   10.218750] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<6>[   10.220752] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4225mV, VBAT = 4240mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<6>[   10.222933] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<6>[   10.224957] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<5>[   10.226496] .(6)[266:charger_thread][charger_routine_thread]flags=0,1 
<4>[   10.227518] .(6)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<14>[   10.258969] .(4)[1:init]init: PropSet [persist.sys.pq.ultrares.en]=[2] Done
<14>[   10.267334] .(4)[1:init]init: PropSet [persist.sys.pq.mdp.color.dbg]=[1] Done
<14>[   10.284917] .(5)[1:init]init: PropSet [persist.sys.pq.log.en]=[0] Done
<6>[   10.294455] .(4)[585:mtk_agpsd][ccci1/chr]write error done on ttyC2, l=44 r=-19
<14>[   10.301277] .(5)[1:init]init: PropSet [persist.sys.pq.hdr.en]=[1] Done
<14>[   10.304192] .(5)[1:init]init: PropSet [debug.pq.adl.dbg]=[0] Done
<6>[   10.306656] .(6)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<14>[   10.306816] .(5)[1:init]init: PropSet [debug.pq.hdr.dbg]=[0] Done
<4>[   10.308761] .(6)[266:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[   10.311284] .(2)[266:charger_thread]=====FG===== AC   = -313
<14>[   10.315084] .(6)[1:init]init: PropSet [persist.sys.pq.mdp.ccorr.en]=[2] Done
<4>[   10.317163] .(0)[266:charger_thread]=====FG===== AC   = -313
<7>[   10.322074] .(5)[677:sh][ftrace]event 'signal_deliver' is enabled
<7>[   10.322161] .(5)[677:sh][ftrace]event 'signal_generate' is enabled
<14>[   10.328480] .(5)[1:init]init: PropSet [persist.sys.pq.mdp.dre.en]=[2] Done
<14>[   10.331309] .(5)[1:init]init: PropSet [debug.pq.dre.dbg]=[0] Done
<14>[   10.341706] .(1)[1:init]init: PropSet [debug.pq.acaltm.dbg]=[0] Done
<14>[   10.344610] .(1)[1:init]init: PropSet [debug.pq.dredriver.dbg]=[0] Done
<14>[   10.350861] .(1)[1:init]init: PropSet [debug.pq.dre.demowin.x]=[536805376] Done
<7>[   10.354812] .(7)[696:sh][ftrace]event 'sched_fork_time' is enabled
<14>[   10.355487] .(1)[1:init]init: PropSet [debug.pq.dredriver.blk]=[0] Done
<14>[   10.358939] .(0)[1:init]init: PropSet [debug.pq.dre.isp.tuning]=[0] Done
<14>[   10.362110] .(0)[1:init]init: PropSet [debug.pq.cz.isp.tuning]=[0] Done
<3>[   10.388447] .(1)[406:ccci_mdinit]BOOTPROF:     10388.445024:ccci_md1: decpyt ready
<6>[   10.389690] .(1)[406:ccci_mdinit][ccci1/fsm]monitor node open by ccci_mdinit
<6>[   10.391147] .(1)[406:ccci_mdinit][ccci1/chr]port ccci_ipc_5 open with flag 20002 by ccci_mdinit
<7>[   10.396306] .(7)[702:sh][ftrace]event 'sched_process_exit' is enabled
<6>[   10.405504] .(0)[406:ccci_mdinit][ccci1/fsm]CCCI_IOC_RELOAD_MD_TYPE: 0x5a00003d
<14>[   10.405596] .(7)[1:init]init: PropSet [persist.sys.bluelight.default]=[128] Done
<3>[   10.411208] .(0)[406:ccci_mdinit]BOOTPROF:     10411.206562:ccci_md1: reset
<6>[   10.417461] .(2)[707:ccci_mdinit][ccci1/ipc]Update fail
<14>[   10.417515] .(0)[1:init]init: PropSet [persist.sys.pq.shp.idx]=[2] Done
<14>[   10.419585] .(0)[1:init]init: PropSet [mtk.md1.status]=[reset] Done
<6>[   10.420534] .(3)[406:ccci_mdinit][ccci1/fsm]CCCI_IOC_GET_MD_TYPE: 11!
<14>[   10.422367] .(7)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/hw/init.mt6763.rc:1138)
<4>[   10.428741] .(3)[266:charger_thread]lifetime: data[0]=df 
<4>[   10.429465] .(3)[266:charger_thread]lifetime: data[1]=ff 
<4>[   10.430163] .(3)[266:charger_thread]lifetime: data[2]=40 
<4>[   10.430868] .(3)[266:charger_thread]lifetime: data[3]=11 
<4>[   10.431573] .(3)[266:charger_thread]lifetime: data[4]=45 
<4>[   10.432278] .(3)[266:charger_thread]lifetime: data[5]=a 
<4>[   10.433371] .(3)[266:charger_thread]lifetime: data[6]=fc 
<4>[   10.435549] .(3)[266:charger_thread]lifetime: data[7]=8 
<4>[   10.437841] .(3)[266:charger_thread]lifetime: data[8]=68 
<4>[   10.438610] .(3)[266:charger_thread]lifetime: data[9]=f7 
<4>[   10.440642] .(3)[266:charger_thread]lifetime: data[10]=18 
<4>[   10.441905] .(3)[266:charger_thread]lifetime: data[11]=0 
<4>[   10.444825] .(0)[266:charger_thread]=====FG-MTK===== bat_vol=4228
<14>[   10.450398] .(1)[1:init]init: PropSet [persist.atm.mdmode]=[normal] Done
<5>[   10.450590] .(0)[266:charger_thread]Vbat=4228,Ibat=313,I=0,VChr=4721,T=25,Soc=100:100,CT:2:2 hv:1 pd:0:0
<5>[   10.450598] .(0)[266:charger_thread][mtk_is_charger_on]info->chr_type=2 
<4>[   10.453271] .(3)[266:charger_thread]temp_now=193, temp_last=193 
<4>[   10.453289] .(3)[266:charger_thread]=====FG===== TEMP = 193
<5>[   10.453292] .(3)[266:charger_thread]charger_check_status
<3>[   10.454311] .(5)[522:app_process32]Dump cpuinfo
<14>[   10.458115] .(5)[1:init]init: PropSet [debug.MB.realpath]=[/data/log_temp/boot/] Done
<14>[   10.459324] .(5)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.bip.rc:7)
<14>[   10.464215] .(5)[1:init]init: Service 'bsplogstart' (pid 672) exited with status 0
<14>[   10.465895] .(5)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.volte_imsm_93.rc:12)
<14>[   10.468130] .(5)[1:init]init: PropSet [ril.active.md]=[11] Done
<14>[   10.469805] .(5)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.wod.rc:20)
<5>[   10.496607] .(2)[266:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[   10.499442] .(2)[266:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[   10.500331] .(2)[266:charger_thread]charger_check_status tmp:19 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[   10.504803] .(1)[266:charger_thread]mtk_switch_charging_run [1 0], timer=4
<14>[   10.510317] .(3)[1:init]init: [PropSet]: pid:406 uid:1000 gid:1001 ctl.start, ccci_fsd
<3>[   10.511693] .(1)[406:ccci_mdinit]BOOTPROF:     10511.692024:ccci_md1: bootup
<14>[   10.513528] .(3)[1:init]init: PropSet [mtk.md1.status]=[bootup] Done
<4>[   10.514357] .(7)[699:HwBinder:380_1]mtk_pcm_dl1_hardware.buffer_bytes_max = 49152 mPlaybackDramState = 0
<4>[   10.514544] .(7)[699:HwBinder:380_1]mtk_soc_pcm_dl1_close
<4>[   10.514780] .(7)[699:HwBinder:380_1]mtk_capture_pcm_close
<4>[   10.517127] .(7)[699:HwBinder:380_1]mtk_voice_pcm_open(), stream(0)
<4>[   10.518150] .(7)[699:HwBinder:380_1]mtk_voice_close(), stream(0)
<4>[   10.519650] .(7)[699:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[   10.520506] .(7)[699:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<6>[   10.520979] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[   10.521003] .(2)[406:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[   10.521206] .(2)[406:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_dhl for user1!
<6>[   10.521247] .(2)[406:ccci_mdinit][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[   10.521257] .(2)[406:ccci_mdinit][ccci1/chr]remap succeed 80018, 0x80018000 -> 0xf54d6000
<6>[   10.521680] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   10.521699] .(2)[406:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[   10.521741] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[   10.521755] .(2)[406:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[   10.521795] .(2)[406:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_md_monitor for user2!
<6>[   10.521821] .(2)[406:ccci_mdinit][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[   10.521830] .(2)[406:ccci_mdinit][ccci1/chr]remap succeed 80018, 0x80018000 -> 0xf54d6000
<6>[   10.521881] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   10.521893] .(2)[406:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[   10.521923] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[   10.521932] .(2)[406:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[   10.521966] .(2)[406:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_meta for user3!
<6>[   10.521989] .(2)[406:ccci_mdinit][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[   10.521997] .(2)[406:ccci_mdinit][ccci1/chr]remap succeed 80018, 0x80018000 -> 0xf54d6000
<6>[   10.522047] .(2)[406:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   10.522060] .(2)[406:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[   10.522087] .(2)[406:ccci_mdinit][ccci1/fsm]MD start ioctl called by ccci_mdinit
<6>[   10.522108] .(2)[406:ccci_mdinit][ccci1/fsm]command 1 is appended 1 from ccci_fsm_ioctl
<6>[   10.522161] .(3)[189:ccci_fsm1][ccci1/fsm]command 1 process
<6>[   10.522173] .(3)[189:ccci_fsm1][ccci1/pot]ready to reset MD in normal mode
<5>[   10.522189] .(3)[189:ccci_fsm1][VcoreFS] kicker: KIR_APCCCI, opp: 0, dvfs_opp: 0, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, 
<5>[   10.522210] .(3)[189:ccci_fsm1][VcoreFS] opp: 0, vcore: 793750 <= 725000, fddr: 1866000 <= 1200000 [O][O]
<5>[   10.522228] -(3)[189:ccci_fsm1][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 0, vcore: 0x110000, emi: 0x290299, md: 0x0
<6>[   10.522333] .(3)[189:ccci_fsm1][ccci1/fsm]md_state change from 0 to 2
<3>[   10.546369] .(5)[527:cameraserver]Dump cpuinfo
<3>[   10.553224] .(7)[699:HwBinder:380_1][AudioError] , user count < 0
<3>[   10.554032] .(7)[699:HwBinder:380_1][AudioError] , user count < 0
<5>[   10.555127] .(3)[266:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:25,39,16 pps:0 en:0 ibus:0 80
<4>[   10.555395] .(6)[699:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[   10.555405] .(6)[699:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[   10.555735] .(6)[699:HwBinder:380_1]mtk_voice_pcm_open(), stream(1)
<4>[   10.555781] .(6)[699:HwBinder:380_1]mtk_voice_close(), stream(1)
<4>[   10.557544] .(5)[699:HwBinder:380_1]mtk_uldlloopback_open runtime rate = 0 channels = 0
<4>[   10.557617] .(5)[699:HwBinder:380_1]mtk_uldlloopbackpcm_close
<3>[   10.557626] .(5)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.561022] .(6)[699:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[   10.561033] .(6)[699:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[   10.561037] .(6)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.561048] .(6)[699:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[   10.561050] .(6)[699:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[   10.561396] .(6)[699:HwBinder:380_1]mtk_uldlloopback_open runtime rate = 0 channels = 0
<4>[   10.561446] .(6)[699:HwBinder:380_1]mtk_uldlloopbackpcm_close
<3>[   10.561450] .(6)[699:HwBinder:380_1]mtk_uldlloopbackpcm_close  with SNDRV_PCM_STREAM_CAPTURE
<3>[   10.562339] .(6)[699:HwBinder:380_1]ASoC: mt-soc-i2s0-dummy-dai-codec <-> mt-soc-i2s0dai-driver No matching formats
<4>[   10.562643] .(6)[699:HwBinder:380_1]mtk_pcm_mrgrx_open
<4>[   10.562651] .(6)[699:HwBinder:380_1]mtk_pcm_mrgrx_open runtime rate = 0 channels = 0 substream->pcm->device = 5
<4>[   10.562653] .(6)[699:HwBinder:380_1]mtk_pcm_mrgrx_open return
<4>[   10.562692] .(6)[699:HwBinder:380_1]mtk_pcm_mrgrx_close
<3>[   10.562695] .(6)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.562698] .(6)[699:HwBinder:380_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[   10.562700] .(6)[699:HwBinder:380_1]SetMrgI2SEnable bEnable = 0
<3>[   10.562703] .(6)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.562710] .(6)[699:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[   10.562712] .(6)[699:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[   10.562895] .(6)[699:HwBinder:380_1]mtk_pcm_mrgrx_open
<4>[   10.562897] .(6)[699:HwBinder:380_1]mtk_pcm_mrgrx_open runtime rate = 0 channels = 0 substream->pcm->device = 5
<4>[   10.562899] .(6)[699:HwBinder:380_1]mtk_pcm_mrgrx_open return
<4>[   10.562919] .(6)[699:HwBinder:380_1]mtk_pcm_mrgrx_close
<3>[   10.562921] .(6)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.562923] .(6)[699:HwBinder:380_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[   10.562925] .(6)[699:HwBinder:380_1]SetMrgI2SEnable bEnable = 0
<3>[   10.562927] .(6)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.562931] .(6)[699:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[   10.562933] .(6)[699:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[   10.568745] .(5)[699:HwBinder:380_1]mtk_mrgrx_awb_pcm_open
<4>[   10.568756] .(5)[699:HwBinder:380_1]mtk_mrgrx_awb_pcm_open runtime rate = 0 channels = 0
<3>[   10.568764] .(5)[699:HwBinder:380_1]mt-soc-mrgrx-awb-pcm mt-soc-mrgrx-awb-pcm: ASoC: can't open platform mt-soc-mrgrx-awb-pcm: -1
<4>[   10.568844] .(5)[699:HwBinder:380_1]mtk_mrgrx_awb_pcm_open
<4>[   10.568847] .(5)[699:HwBinder:380_1]mtk_mrgrx_awb_pcm_open runtime rate = 0 channels = 0
<4>[   10.568849] .(5)[699:HwBinder:380_1]SNDRV_PCM_STREAM_CAPTURE
<4>[   10.568990] .(5)[699:HwBinder:380_1]mtk_mrgrx_awb_pcm_open return
<4>[   10.569452] .(7)[699:HwBinder:380_1]mtk_pcm_I2S0dl1_open: mtk_I2S0dl1_hardware.buffer_bytes_max = 196608 mPlaybackDramState = 0
<4>[   10.569621] .(7)[699:HwBinder:380_1]mtk_pcm_I2S0dl1_close
<4>[   10.570442] .(7)[699:HwBinder:380_1]mtk_voice_bt_pcm_open(), stream(0)
<4>[   10.570486] .(7)[699:HwBinder:380_1]mtk_voice_bt_close(), stream(0)
<3>[   10.570492] .(7)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.570870] .(7)[699:HwBinder:380_1]mtk_bt_dai_pcm_open, stream 1
<4>[   10.570967] .(7)[699:HwBinder:380_1]mtk_bt_dai_pcm_open return
<4>[   10.572103] .(7)[699:HwBinder:380_1]mtk_I2S0dl1_hardware.buffer_bytes_max = 49152 mPlaybackDramState = 0
<4>[   10.572441] .(7)[699:HwBinder:380_1]mtk_capture2_pcm_open
<4>[   10.572459] .(7)[699:HwBinder:380_1]runtime->hw->rates = 0x40001ffe
<4>[   10.572459]  
<4>[   10.572455] .(7)[699:HwBinder:380_1]mtk_capture2_pcm_open runtime rate = 0 channels = 0
<4>[   10.572462] .(7)[699:HwBinder:380_1]SNDRV_PCM_STREAM_CAPTURE mtkalsa_capture_constraints
<4>[   10.572465] .(7)[699:HwBinder:380_1]mtk_capture2_pcm_open return
<4>[   10.572499] .(7)[699:HwBinder:380_1]mtk_capture2_pcm_close
<4>[   10.573069] .(7)[699:HwBinder:380_1]mtk_i2s0_awb_pcm_open
<4>[   10.573195] .(7)[699:HwBinder:380_1]mtk_i2s0_awb_pcm_open runtime rate = 0 channels = 0
<4>[   10.573198] .(7)[699:HwBinder:380_1]SNDRV_PCM_STREAM_CAPTURE
<4>[   10.573199] .(7)[699:HwBinder:380_1]mtk_i2s0_awb_pcm_open return
<4>[   10.579056] .(7)[699:HwBinder:380_1]mtk_voice_md2_pcm_open(), stream(0)
<4>[   10.579106] .(7)[699:HwBinder:380_1]mtk_voice_md2_close(), stream(0)
<4>[   10.579117] .(7)[699:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[   10.579120] .(7)[699:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[   10.579125] .(7)[699:HwBinder:380_1][AudioError] , user count < 0
<3>[   10.579127] .(7)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.579307] .(7)[699:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[   10.579309] .(7)[699:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[   10.579571] .(7)[699:HwBinder:380_1]mtk_voice_md2_pcm_open(), stream(1)
<4>[   10.579602] .(7)[699:HwBinder:380_1]mtk_voice_md2_close(), stream(1)
<4>[   10.579974] .(7)[699:HwBinder:380_1]mtk_routing_pcm_open
<4>[   10.579979] .(7)[699:HwBinder:380_1]mtk_routing_pcm_open runtime rate = 0 channels = 0
<4>[   10.579981] .(7)[699:HwBinder:380_1]mtk_routing_pcm_open return
<4>[   10.580068] .(7)[699:HwBinder:380_1]mtk_routing_pcm_open
<4>[   10.580070] .(7)[699:HwBinder:380_1]mtk_routing_pcm_open runtime rate = 0 channels = 0
<4>[   10.580072] .(7)[699:HwBinder:380_1]mtk_routing_pcm_open return
<4>[   10.580432] .(7)[699:HwBinder:380_1]mtk_voice_md2_bt_pcm_open(), stream(0)
<4>[   10.580466] .(7)[699:HwBinder:380_1]mtk_voice_md2_bt_close(), stream(0)
<3>[   10.580471] .(7)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.580985] .(7)[699:HwBinder:380_1]mtk_pcm_fm_i2s_open
<4>[   10.580995] .(7)[699:HwBinder:380_1]mtk_pcm_fm_i2s_open return
<4>[   10.581016] .(7)[699:HwBinder:380_1]mtk_pcm_fm_i2s_close rate = 0
<3>[   10.581020] .(7)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.581024] .(7)[699:HwBinder:380_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[   10.581033] .(7)[699:HwBinder:380_1]setConnsysI2SInEnable(), enable = 0
<3>[   10.581031] .(7)[699:HwBinder:380_1][AudioError] , user count < 0
<4>[   10.581038] .(7)[699:HwBinder:380_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[   10.581041] .(7)[699:HwBinder:380_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[   10.581164] .(7)[699:HwBinder:380_1]mtk_fm_i2s_awb_pcm_open
<4>[   10.581258] .(7)[699:HwBinder:380_1]mtk_fm_i2s_awb_pcm_open return
<4>[   10.582277] .(7)[699:HwBinder:380_1]+Set_BTCVSD_State, state=16
<4>[   10.582336] .(7)[699:HwBinder:380_1]+Set_BTCVSD_State, state=16
<4>[   10.582613] .(7)[699:HwBinder:380_1]mtk_pcm_btcvsd_tx_open
<4>[   10.582645] .(7)[699:HwBinder:380_1]mtk_pcm_btcvsd_tx_close
<4>[   10.582648] .(7)[699:HwBinder:380_1]+Set_BTCVSD_State, state=0
<4>[   10.582677] .(7)[699:HwBinder:380_1]mtk_pcm_btcvsd_tx_open
<4>[   10.582695] .(7)[699:HwBinder:380_1]mtk_pcm_btcvsd_tx_close
<4>[   10.582697] .(7)[699:HwBinder:380_1]+Set_BTCVSD_State, state=0
<4>[   10.583708] .(7)[699:HwBinder:380_1]mtk_i2s2_adc2_pcm_open
<4>[   10.584295] .(7)[699:HwBinder:380_1]mtk_voice_usb_open()
<4>[   10.584304] .(7)[699:HwBinder:380_1]mtk_voice_usb_open(), return
<4>[   10.584335] .(7)[699:HwBinder:380_1]mtk_voice_usb_close(), stream 0, prepare 0
<4>[   10.584504] .(7)[699:HwBinder:380_1]mtk_voice_usb_open()
<4>[   10.584507] .(7)[699:HwBinder:380_1]mtk_voice_usb_open(), return
<4>[   10.584523] .(7)[699:HwBinder:380_1]mtk_voice_usb_close(), stream 1, prepare 0
<6>[   10.584698] .(7)[258:kworker/7:1]usb_state<CONFIGURED>
<4>[   10.585309] .(7)[699:HwBinder:380_1]mtk_usb_echoref_open()
<4>[   10.585315] .(7)[699:HwBinder:380_1]mtk_usb_echoref_open(), return
<4>[   10.585355] .(7)[699:HwBinder:380_1]mtk_usb_echoref_close(), stream 0, prepare 0
<4>[   10.592968] .(7)[699:HwBinder:380_1]mtk_i2s2_adc2_pcm_open
<14>[   10.601639] .(1)[1:init]init: starting service 'aee_aed'...
<14>[   10.606417] .(1)[1:init]init: starting service 'aee_aed64'...
<14>[   10.609797] .(1)[1:init]init: starting service 'aee_aedv'...
<14>[   10.614190] .(1)[1:init]init: starting service 'aee_aedv64'...
<6>[   10.646896] .(6)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d628000, buf_size=213032,buflen=213032,rx_size=81920,tx_size=131072,ctr_len=40
<6>[   10.647072] .(6)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d628000)=0xee0000ee ee0000ee
<6>[   10.647077] .(6)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d65c024)=0xff0000ff ff0000ff
<6>[   10.647083] .(6)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d628008
<6>[   10.652735] .(6)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d65c028, buf_size=122920,buflen=122920,rx_size=81920,tx_size=40960,ctr_len=40
<6>[   10.652830] .(6)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d65c028)=0xee0000ee ee0000ee
<6>[   10.652836] .(6)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d67a04c)=0xff0000ff ff0000ff
<6>[   10.652841] .(6)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d65c030
<6>[   10.664456] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d67a050, buf_size=49192,buflen=49192,rx_size=40960,tx_size=8192,ctr_len=40
<6>[   10.664529] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d67a050)=0xee0000ee ee0000ee
<6>[   10.664537] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d686074)=0xff0000ff ff0000ff
<6>[   10.664543] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d67a058
<6>[   10.669047] .(2)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d686078, buf_size=122920,buflen=122920,rx_size=81920,tx_size=40960,ctr_len=40
<6>[   10.669178] .(2)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d686078)=0xee0000ee ee0000ee
<6>[   10.669185] .(2)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6a409c)=0xff0000ff ff0000ff
<6>[   10.669191] .(2)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d686080
<14>[   10.672637] .(5)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[   10.674768] .(4)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[   10.676364] .(4)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<6>[   10.677811] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6a40a0, buf_size=41000,buflen=41000,rx_size=20480,tx_size=20480,ctr_len=40
<6>[   10.677865] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6a40a0)=0xee0000ee ee0000ee
<6>[   10.677872] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6ae0c4)=0xff0000ff ff0000ff
<6>[   10.677878] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6a40a8
<14>[   10.677972] .(4)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[dumping] Done
<4>[   10.679658] .(0)[749:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<4>[   10.684184] .(2)[749:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<5>[   10.685456] .(3)[266:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[   10.686696] .(3)[266:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<14>[   10.688074] .(2)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[   10.691808] .(2)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<4>[   10.692553] -(0)[266:charger_thread]mt6356_get_auxadc_value: 14 callbacks suppressed
<5>[   10.692568] .(0)[266:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<4>[   10.696839] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<6>[   10.696864] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6ae0c8, buf_size=41000,buflen=41000,rx_size=20480,tx_size=20480,ctr_len=40
<6>[   10.696927] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6ae0c8)=0xee0000ee ee0000ee
<6>[   10.696935] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6b80ec)=0xff0000ff ff0000ff
<6>[   10.696942] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6ae0d0
<14>[   10.697397] .(2)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<14>[   10.700292] .(2)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<6>[   10.701193] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6b80f0, buf_size=131112,buflen=131112,rx_size=65536,tx_size=65536,ctr_len=40
<6>[   10.701332] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6b80f0)=0xee0000ee ee0000ee
<6>[   10.701339] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6d8114)=0xff0000ff ff0000ff
<6>[   10.701346] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6b80f8
<6>[   10.701549] .(3)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6d8118, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[   10.701558] .(3)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6d8118)=0xee0000ee ee0000ee
<6>[   10.701565] .(3)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6d813c)=0xff0000ff ff0000ff
<6>[   10.701571] .(3)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6d8120
<6>[   10.701667] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6d8400, buf_size=24616,buflen=24616,rx_size=12288,tx_size=12288,ctr_len=40
<6>[   10.701697] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6d8400)=0xee0000ee ee0000ee
<6>[   10.701704] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6de424)=0xff0000ff ff0000ff
<6>[   10.701710] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6d8408
<6>[   10.701717] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6de428, buf_size=65576,buflen=65576,rx_size=32768,tx_size=32768,ctr_len=40
<6>[   10.701788] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6de428)=0xee0000ee ee0000ee
<6>[   10.701795] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6ee44c)=0xff0000ff ff0000ff
<6>[   10.701801] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6de430
<6>[   10.701808] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6ee450, buf_size=16424,buflen=16424,rx_size=8192,tx_size=8192,ctr_len=40
<6>[   10.701832] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6ee450)=0xee0000ee ee0000ee
<6>[   10.701838] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f2474)=0xff0000ff ff0000ff
<6>[   10.701844] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6ee458
<6>[   10.701851] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f2478, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[   10.701858] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f2478)=0xee0000ee ee0000ee
<6>[   10.701865] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f249c)=0xff0000ff ff0000ff
<6>[   10.701871] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f2480
<6>[   10.701878] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f24a0, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[   10.701885] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f24a0)=0xee0000ee ee0000ee
<6>[   10.701892] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f24c4)=0xff0000ff ff0000ff
<6>[   10.701898] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f24a8
<6>[   10.701905] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f24c8, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[   10.701912] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f24c8)=0xee0000ee ee0000ee
<6>[   10.701919] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f24ec)=0xff0000ff ff0000ff
<6>[   10.701925] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f24d0
<6>[   10.701932] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f24f0, buf_size=16424,buflen=16424,rx_size=8192,tx_size=8192,ctr_len=40
<6>[   10.701954] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f24f0)=0xee0000ee ee0000ee
<6>[   10.701961] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f6514)=0xff0000ff ff0000ff
<6>[   10.701967] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f24f8
<6>[   10.701974] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f6518, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[   10.701983] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f6518)=0xee0000ee ee0000ee
<6>[   10.701990] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f653c)=0xff0000ff ff0000ff
<6>[   10.701996] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f6520
<6>[   10.702537] .(0)[189:ccci_fsm1][ccci1/mcd]ccci_set_clk_cg: on=1
<6>[   10.703344] .(0)[189:ccci_fsm1][ccci1/cif]md_ccif_sram_reset
<6>[   10.703386] .(0)[189:ccci_fsm1][ccci1/cif]md_ccif_switch_ringbuf
<6>[   10.703396] .(0)[189:ccci_fsm1][ccci1/cif]md_ccif_reset_queue
<6>[   10.703406] .(0)[189:ccci_fsm1][ccci1/cif]md_ccif_switch_ringbuf
<6>[   10.703411] .(0)[189:ccci_fsm1][ccci1/cif]md_ccif_reset_queue
<4>[   10.704716] -(7)[0:swapper/7]MCDI bootup check: PASS
<6>[   10.748826] .(3)[189:ccci_fsm1][ccci1/cldma]cldma_reset from md_cd_start
<6>[   10.748841] .(3)[189:ccci_fsm1][ccci1/cldma]cldma_start from md_cd_start
<4>[   10.760765] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[   10.762110] .(1)[266:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[   10.764426] .(1)[266:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[   10.766535] .(1)[266:charger_thread]temp_now=193, temp_last=193 
<4>[   10.767338] .(1)[266:charger_thread]=====FG===== TEMP = 193
<4>[   10.769302] .(2)[266:charger_thread]=====FG===== VOLT = 4304
<4>[   10.770061] .(2)[266:charger_thread]=====FG===== actural VOLT = 4341
<4>[   10.771544] .(0)[266:charger_thread]=====FG===== AC   = -313
<4>[   10.773206] .(0)[266:charger_thread]=====FG===== SOC  = 100
<4>[   10.781251] .(4)[266:charger_thread]=====FG===== SOH  = 100
<4>[   10.782113] .(4)[266:charger_thread]DLCP bat_vol=4341,  temperature=193  
<4>[   10.783006] .(4)[266:charger_thread] ===CC_value from battery temprature=700000
<4>[   10.783949] .(4)[266:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<4>[   10.785287] .(0)[266:charger_thread]DLCP mt6370_set_vrech       = 300
<4>[   10.786719] .(0)[266:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[   10.787599] .(0)[266:charger_thread]DLCP read cv              = 4350000
<4>[   10.788452] .(0)[266:charger_thread]DLCP read eoc             = 250000
<4>[   10.789360] .(0)[266:charger_thread]DLCP read recharge        = 300
<4>[   10.790189] .(0)[266:charger_thread]DLCP Target Temp          = 410
<4>[   10.790997] .(0)[266:charger_thread]DLCP Charge Current       = 2000
<4>[   10.791824] .(0)[266:charger_thread]DLPID 
<4>[   10.792393] .(0)[266:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[   10.794768] .(3)[266:charger_thread]DLPID PID Target Temp = 410 
<4>[   10.795640] .(3)[266:charger_thread]DLPID Battery Temp    = 193 
<4>[   10.796450] .(3)[266:charger_thread]DLPID TEMP DIFF       = 213 
<4>[   10.797337] .(3)[266:charger_thread]DLPID PID KI          = 5000 
<4>[   10.798170] .(3)[266:charger_thread]DLPID CC MAX          = 700000 
<4>[   10.799023] .(3)[266:charger_thread]DLPID PID Current     = 700000 
<4>[   10.799846] .(3)[266:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[   10.800849] .(3)[266:charger_thread]DLCP ccurrent from battery temprature = 700000
<4>[   10.801863] .(3)[266:charger_thread]DLCP ccurrent from PID algorithm      = 700000
<4>[   10.802854] .(3)[266:charger_thread]DLCP ccurrent from DLPL               = 2000000
<4>[   10.803839] .(3)[266:charger_thread]DLCP set input current:500000 
<4>[   10.804880] .(0)[266:charger_thread]DLCP set charge current: 500000 
<4>[   10.806378] .(0)[266:charger_thread]DLCP mt6370_enable_charging :1 
<4>[   10.807438] .(0)[266:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[   10.808501] .(0)[266:charger_thread]DLCP __mt6370_set_cv       = 4350000
<6>[   10.809052] .(2)[228:kworker/2:2][ccci1/cif]md_ccif_sram_rx_work:dk_pkg=ffffff800bef4100, md_featrue=ffffff800bef4110
<6>[   10.809109] .(2)[228:kworker/2:2][ccci1/cif]md_ccif_sram_rx_work:ccci_port_recv_skb ret=0
<6>[   10.809123] .(1)[197:ccci_ctrl][ccci1/fsm]control message 0x0,0x5555FFFF
<6>[   10.809144] .(1)[197:ccci_ctrl][ccci1/fsm]event 1 is appended from ccci_fsm_recv_control_packet
<4>[   10.815647] .(3)[266:charger_thread]DLCP mt6370_enable_charging :1 
<6>[   10.820968] -(2)[189:ccci_fsm1][ccci1/fsm]md_state change from 2 to 3
<5>[   10.821850] -(2)[189:ccci_fsm1]mtk_rtc_hal_common: rtc_spare_reg[12] = {a38, 1, 6}
<6>[   10.823029] -(2)[189:ccci_fsm1][ccci1/mcd]md_boot_stats len 0
<6>[   10.823776] -(2)[189:ccci_fsm1][ccci1/mcd]md_boot_stats0:0x54430007
<6>[   10.824587] -(2)[189:ccci_fsm1][ccci1/mcd]md_boot_stats1:0x53320000
<6>[   10.825413] -(2)[189:ccci_fsm1][ccci1/fsm]event 1 is completed by fsm_main_thread
<2>[   10.826675] .(2)[189:ccci_fsm1][PBM] AP2MD1 section level, 2G: 0xb9e7bf(0xb9e7bf), 3G: 0xb84696(0xb84696), 
<2>[   10.827719] .(2)[189:ccci_fsm1][PBM] 4G_upL1: 0xb84675(0xb84675), 4G_upL2: 0xb84675(0xb84675), TDD: 0xd84a75(0xd84a75), addr: 0xffffff800d60ff58
<2>[   10.829617] .(2)[189:ccci_fsm1][PBM] C2K section level, C2K: 0x108d2d7(0x108d2d7), addr: 0xffffff800d60ff58
<2>[   10.831155] .(2)[189:ccci_fsm1][PBM] MD section level init, MD1: 1
<6>[   10.832148] .(2)[189:ccci_fsm1][ccci1/fsm]send runtime data 0
<31>[   10.991206] .(1)[357:logd.reader]logd: logdr: UID=1000 GID=1000 PID=539 b tail=0 logMask=1f pid=0 start=0ns timeout=0ns
<14>[   10.992229] .(1)[1:init]init: PropSet [debug.MB.running]=[1] Done
<14>[   10.995235] .(1)[1:init]init: PropSet [log.tag]=[M] Done
<31>[   10.996888] .(0)[768:logd.reader.per]logd: logd first log reader, set log level to M!
<31>[   10.996932] .(0)[768:logd.reader.per]logd: logd.reader.per thread start.
<14>[   10.998199] .(1)[1:init]init: PropSet [debug.MB.prdebug]=[1] Done
<14>[   11.000952] .(1)[1:init]init: processing action (debug.MB.prdebug=1) from (/system/etc/init/mobile_log_d.rc:31)
<7>[   11.009511] .(2)[509:mali-cmar-backe]mali 13040000.mali: kbase_jd_submit:Enter
<7>[   11.009562] .(2)[509:mali-cmar-backe]mali 13040000.mali: event dequeuing ffffff801168d4a8
<7>[   11.009776] .(2)[509:mali-cmar-backe]mali 13040000.mali: kbase_jd_submit:Enter
<7>[   11.010166] -(3)[548:camerahalserver]mali 13040000.mali: kbase_gpu_irq_handler: irq 99 irqstatus 0x100
<7>[   11.010315] -(4)[772:program_binary_]mali 13040000.mali: kbase_gpu_irq_handler: irq 99 irqstatus 0x400
<7>[   11.010343] -(4)[772:program_binary_]mali 13040000.mali: JS: Submitting atom ffffff801168d6e0 from ctx ffffff801166d000 to js[1] with head=0x7816e830c0, affinity=0x3
<7>[   11.010359] .(2)[509:mali-cmar-backe]mali 13040000.mali: kbase_jd_submit:Enter
<7>[   11.010363] -(5)[649:program_binary_]mali 13040000.mali: kbase_gpu_irq_handler: irq 99 irqstatus 0x400
<7>[   11.010370] -(6)[530:vtservice]mali 13040000.mali: kbase_job_irq_handler: irq 97 irqstatus 0x2
<7>[   11.010379] -(6)[530:vtservice]mali 13040000.mali: Job ended with status 0x00000001
<7>[   11.010420] -(6)[530:vtservice]mali 13040000.mali: JS: Submitting atom ffffff801168d918 from ctx ffffff801166d000 to js[0] with head=0x7816e837c0, affinity=0x3
<7>[   11.010556] .(2)[509:mali-cmar-backe]mali 13040000.mali: event dequeuing ffffff801168d6e0
<7>[   11.011080] -(7)[497:BootAnimation]mali 13040000.mali: kbase_gpu_irq_handler: irq 99 irqstatus 0x400
<7>[   11.011943] -(0)[767:iptables]mali 13040000.mali: kbase_job_irq_handler: irq 97 irqstatus 0x1
<7>[   11.011965] -(0)[767:iptables]mali 13040000.mali: Job ended with status 0x00000001
<7>[   11.012021] .(2)[187:kworker/u17:1]mali 13040000.mali: kbase_mmu_teardown_pages:kctx ffffff801166d000 vpfn 7780e00 nr 900
<7>[   11.012141] .(2)[509:mali-cmar-backe]mali 13040000.mali: event dequeuing ffffff801168d918
<7>[   11.012151] .(2)[509:mali-cmar-backe]mali 13040000.mali: event dequeuing ffffff801168db50
<7>[   11.012772] -(2)[350:servicemanager]mali 13040000.mali: kbase_gpu_irq_handler: irq 99 irqstatus 0x400
<7>[   11.012809] -(3)[548:camerahalserver]mali 13040000.mali: kbase_gpu_irq_handler: irq 99 irqstatus 0x400
<6>[   11.034931] .(1)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<6>[   11.036922] .(1)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4200mV, VBAT = 4220mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<6>[   11.038841] .(1)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<6>[   11.040531] .(1)[266:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<36>[   11.070136] .(0)[367:logd.auditd]type=1400 audit(1578646637.794:30): avc: denied { read } for pid=544 comm="storaged" path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=97 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
<14>[   11.071278] .(2)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<14>[   11.077920] .(2)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<6>[   11.078220] .(0)[191:ccci_rpc_k][ccci0/rpc]get_md_dtsi_val 1, mediatek,md_product_name_model_id -- 0xf0f0f0f
<36>[   11.078868] .(0)[367:logd.auditd]type=1400 audit(1578646639.506:31): avc: denied { getattr } for pid=771 comm="aee" path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=5378 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
<3>[   11.087876] .(6)[530:vtservice]Dump cpuinfo
<7>[   11.116643] .(4)[699:HwBinder:380_1]Speaker_Amp_Set() value = 0
<7>[   11.116643]  
<7>[   11.116715] Headset_Speaker_Amp_Set() gain = 0
<7>[   11.116715]  <7>[   11.116739] .(4)[699:HwBinder:380_1]Ext_Speaker_Amp_Change OFF+  udio_mode_flags = 0, audio_mode_value = 2
<7>[   11.117289] .(4)[699:HwBinder:380_1]Ext_Speaker_Amp_Change OFF-
<7>[   11.117333] .(4)[699:HwBinder:380_1]Receiver_Speaker_Switch_Set()
<7>[   11.117352] .(4)[699:HwBinder:380_1]TurnOnADcPowerACC ADCType = 13 enable = 0
<4>[   11.117425] .(4)[699:HwBinder:380_1]TopCkCount <0 =-1
<4>[   11.117425]  
<4>[   11.117796] .(4)[699:HwBinder:380_1]ClsqEnable count <0
<4>[   11.118532] .(4)[699:HwBinder:380_1]NvRegCount <0 =-1
<4>[   11.118532]  
<4>[   11.118898] .(4)[699:HwBinder:380_1]audck_buf_Count count < 0
<7>[   11.119727] .(4)[699:HwBinder:380_1]TurnOnADcPowerACC ADCType = 14 enable = 0
<4>[   11.119812] .(4)[699:HwBinder:380_1]TopCkCount <0 =-1
<4>[   11.119812]  
<4>[   11.120182] .(4)[699:HwBinder:380_1]ClsqEnable count <0
<4>[   11.120976] .(4)[699:HwBinder:380_1]NvRegCount <0 =-1
<4>[   11.120976]  
<4>[   11.121348] .(4)[699:HwBinder:380_1]audck_buf_Count count < 0
<7>[   11.122489] .(4)[699:HwBinder:380_1]pmic_dctrim_control_get(), dctrim_calibrated = 2
<6>[   11.191797] .(5)[699:HwBinder:380_1][ccci1/chr]port ccci_aud open with flag 20002 by HwBinder:380_1
<6>[   11.200319] .(1)[197:ccci_ctrl][ccci1/fsm]control message 0x0,0x0
<6>[   11.201045] .(3)[699:HwBinder:380_1][ccci1/chr]port ccci_raw_audio open with flag 20002 by HwBinder:380_1
<6>[   11.201076] .(3)[699:HwBinder:380_1][ccci1/shm]smem_port->addr_phy=8001b000
<6>[   11.201257] .(3)[699:HwBinder:380_1][ccci1/chr]remap addr:0x8001b000 len:53248  map-len:53248
<6>[   11.204486] .(1)[197:ccci_ctrl][ccci1/fsm]event 4 is appended from ccci_fsm_recv_control_packet
<14>[   11.218962] .(1)[1:init]init: PropSet [af.modem_1.epof]=[0] Done
<6>[   11.220719] -(7)[189:ccci_fsm1][ccci1/fsm]md_state change from 3 to 4
<6>[   11.221613] -(7)[189:ccci_fsm1][ccci1/fsm]event 4 is completed by fsm_main_thread
<5>[   11.222585] .(7)[189:ccci_fsm1][VcoreFS] kicker: KIR_APCCCI, opp: -1, dvfs_opp: 3, sw_opp: 0, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[   11.224584] .(7)[189:ccci_fsm1][VcoreFS] opp: 3, vcore: 725000 <= 793750, fddr: 1200000 <= 1866000 [O][O]
<5>[   11.225903] -(7)[189:ccci_fsm1][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<6>[   11.227273] .(7)[189:ccci_fsm1][ccci1/fsm]command 1 is completed 1 by fsm_main_thread
<3>[   11.228471] .(1)[406:ccci_mdinit]BOOTPROF:     11228.469949:ccci_md1: ready
<14>[   11.230631] .(2)[1:init]init: PropSet [mtk.md1.status]=[ready] Done
<14>[   11.234235] .(2)[1:init]init: processing action (mtk.md1.status=ready) from (/vendor/etc/init/init.bip.rc:4)
<14>[   11.237418] .(2)[1:init]init: starting service 'bip'...
<14>[   11.240920] .(2)[1:init]init: [PropSet]: pid:406 uid:1000 gid:1001 ctl.start, emdlogger1
<14>[   11.241433] .(7)[787:init]init: Created socket '/dev/socket/bip', mode 660, user 0, group 1000
<14>[   11.244282] .(2)[1:init]init: starting service 'emdlogger1'...
<14>[   11.246989] .(2)[1:init]init: processing action (mtk.md1.status=ready) from (/vendor/etc/init/init.volte_imsm_93.rc:5)
<14>[   11.253868] .(5)[1:init]init: starting service 'volte_imsm_93'...
<14>[   11.258722] .(5)[1:init]init: [PropSet]: pid:406 uid:1000 gid:1001 ctl.start, gsm0710muxd
<14>[   11.261565] .(5)[1:init]init: starting service 'gsm0710muxd'...
<14>[   11.265505] .(5)[1:init]init: starting service 'volte_stack'...
<14>[   11.269954] .(5)[1:init]init: starting service 'volte_ua'...
<14>[   11.273631] .(5)[1:init]init: starting service 'volte_imcb'...
<14>[   11.274535] .(4)[792:init]init: Created socket '/dev/socket/volte_stack', mode 660, user 0, group 1000
<14>[   11.277755] .(5)[794:init]init: Created socket '/dev/socket/volte_ua', mode 660, user 0, group 1000
<14>[   11.278188] .(7)[795:init]init: Created socket '/dev/socket/volte_imsa1', mode 660, user 0, group 1001
<14>[   11.280066] .(7)[795:init]init: Created socket '/dev/socket/volte_imsa2', mode 660, user 0, group 1001
<6>[   11.281441] .(2)[787:bip][ccci1/chr]port ccci_bip open with flag 20002 by bip
<14>[   11.282432] .(7)[795:init]init: Created socket '/dev/socket/volte_ut', mode 660, user 0, group 1001
<36>[   11.288369] .(0)[367:logd.auditd]type=1400 audit(1578646639.506:31): avc: denied { getattr } for pid=771 comm="aee" path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=5378 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
<36>[   11.291635] .(0)[367:logd.auditd]type=1400 audit(1578646639.722:32): avc: denied { read } for pid=787 comm="bip" name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=1189 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
<5>[   11.341961] -(5)[795:volte_imcb]alarmtimer_enqueue, 111297313846
<5>[   11.342951] -(5)[795:volte_imcb]alarmtimer_enqueue, 11298305846
<3>[   11.361763] .(0)[792:volte_stack]Dump cpuinfo
<6>[   11.398208] .(4)[548:camerahalserver][ISP][ISP_open] - E. UserCount: 0.
<6>[   11.399079] .(4)[548:camerahalserver][ISP][ISP_open] Curr UserCount(1), (process, pid, tgid)=(camerahalserver, 548, 548), log_limit_line(150), first user
<6>[   11.401567] .(4)[548:camerahalserver][ISP][ISP_open] - X. Ret: 0. UserCount: 1. G_u4EnableClockCount:1
<7>[   11.403154] .(4)[548:camerahalserver][imgsensor]imgsensor_open 1
<7>[   11.404917] .(4)[548:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 1, freq= 3, TG= 0
<7>[   11.405926] .(4)[548:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 1, freq= 3, TG= 1
<7>[   11.406244] .(4)[548:camerahalserver][imgsensor]imgsensor_open 2
<7>[   11.406386] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.406397] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   11.406433] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.406458] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.406469] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.406486] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.407010] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.408548] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.409203] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.409267] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   11.409281] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.410128] .(4)[548:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<7>[   11.416059] .(4)[548:camerahalserver]IMX258_camera_sensor[feature_control] feature_id = 3041
<6>[   11.418468] .(4)[548:camerahalserver]i2c i2c-2: addr: 1a, transfer ACK error
<3>[   11.419447] .(4)[548:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   11.420337] .(4)[548:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x34, id: 0x0
<6>[   11.420449] .(4)[548:camerahalserver]i2c i2c-2: addr: 10, transfer ACK error
<3>[   11.421481] .(4)[548:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   11.422376] .(4)[548:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x20, id: 0x0
<7>[   11.422388] .(4)[548:camerahalserver][imgsensor]Fail to get sensor ID ffffffff
<7>[   11.422393] .(4)[548:camerahalserver][imgsensor]ERROR:imgsensor_check_is_alive(), No imgsensor alive
<7>[   11.423470] .(4)[548:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   11.423526] .(4)[548:camerahalserver][imgsensor][regulator]4 is enabled
<7>[   11.423579] .(4)[548:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   11.423605] .(4)[548:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   11.423698] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   11.423710] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.424553] .(4)[548:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<7>[   11.425541] .(4)[548:camerahalserver][imgsensor][CheckIsAlive]Profile = 19156 us
<7>[   11.425567] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.425574] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   11.425605] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.425624] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.425636] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.432713] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.433200] .(6)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.434668] .(6)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.435152] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.435264] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   11.435278] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.436122] .(4)[548:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   11.442136] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3041
<7>[   11.442848] .(4)[548:camerahalserver]S5K3L8[get_imgsensor_id] i2c write id: 0x5a, ReadOut sensor id: 0x30c8, imgsensor_info.sensor_id:0x30c8.
<7>[   11.442880] .(4)[548:camerahalserver][imgsensor] Sensor found ID = 0x30c8
<7>[   11.443942] .(4)[548:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   11.443993] .(4)[548:camerahalserver][imgsensor][regulator]4 is enabled
<7>[   11.444022] .(4)[548:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   11.444067] .(4)[548:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   11.444114] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   11.444126] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.445040] .(4)[548:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   11.449707] .(0)[548:camerahalserver][imgsensor][CheckIsAlive]Profile = 24142 us
<7>[   11.449728] .(0)[548:camerahalserver][imgsensor][imgsensor_set_driver] :[0][1][s5k3l8_mipi_raw]
<7>[   11.449739] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3107
<7>[   11.449947] .(0)[548:camerahalserver][imgsensor][CAMERA SENSOR] CAOMPAT_KDIMGSENSORIOC_X_GETINFO2
<7>[   11.449972] .(0)[548:camerahalserver][imgsensor][adopt_CAMERA_HW_GetInfo2]Entry0
<7>[   11.449987] .(0)[548:camerahalserver]S5K3L8[get_info] scenario_id = 0
<7>[   11.449995] .(0)[548:camerahalserver]S5K3L8[get_info] scenario_id = 1
<7>[   11.450001] .(0)[548:camerahalserver]S5K3L8[get_info] scenario_id = 2
<7>[   11.450007] .(0)[548:camerahalserver]S5K3L8[get_info] scenario_id = 3
<7>[   11.450013] .(0)[548:camerahalserver]S5K3L8[get_info] scenario_id = 4
<7>[   11.450021] .(0)[548:camerahalserver]S5K3L8[get_info] scenario_id = 5
<7>[   11.450026] .(0)[548:camerahalserver]S5K3L8[get_info] scenario_id = 6
<7>[   11.450032] .(0)[548:camerahalserver]S5K3L8[get_info] scenario_id = 7
<7>[   11.450038] .(0)[548:camerahalserver]S5K3L8[get_info] scenario_id = 8
<7>[   11.450043] .(0)[548:camerahalserver]S5K3L8[get_info] scenario_id = 9
<7>[   11.450050] .(0)[548:camerahalserver]S5K3L8[get_resolution] E
<7>[   11.450056] .(0)[548:camerahalserver][imgsensor][CAMERA_HW][Pre]w=0x838, h = 0x618
<7>[   11.450062] .(0)[548:camerahalserver][imgsensor][CAMERA_HW][Full]w=0x1070, h = 0xc30
<7>[   11.450068] .(0)[548:camerahalserver][imgsensor][CAMERA_HW][VD]w=0x1070, h = 0xc30
<7>[   11.450201] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   11.450212] .(0)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 0
<7>[   11.450232] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   11.450238] .(0)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 1
<7>[   11.450248] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   11.450254] .(0)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 2
<7>[   11.450263] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   11.450269] .(0)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 3
<7>[   11.450278] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   11.450284] .(0)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 4
<7>[   11.450297] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   11.450303] .(0)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 5
<7>[   11.450312] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   11.450318] .(0)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 6
<7>[   11.450327] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   11.450333] .(0)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 7
<7>[   11.450344] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   11.450353] .(0)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 8
<7>[   11.450363] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   11.450369] .(0)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 9
<7>[   11.482910] .(6)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3081
<7>[   11.482934] .(6)[548:camerahalserver]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:1
<7>[   11.483144] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.483155] .(6)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 0
<7>[   11.484063] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=8, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.484073] .(6)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 10
<4>[   11.485010] .(6)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.485881] .(6)[548:camerahalserver]it is not ov7251 it is 1 
<7>[   11.491658] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.491693] .(6)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   11.491731] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.491754] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.491766] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.492232] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.492267] .(6)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:3 powerId:2800000
<6>[   11.497877] .(3)[795:volte_imcb][ccci1/chr]port ccci_imsc open with flag 20002 by volte_imcb
<6>[   11.515547] .(2)[790:volte_imsm_93][ccci1/chr]port ccci_imsm open with flag 20102 by volte_imsm_93
<7>[   11.516748] .(7)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.518222] .(7)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.518252] .(7)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   11.519502] .(7)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.519560] .(7)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   11.519578] .(7)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.520858] .(7)[548:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<7>[   11.526801] .(7)[548:camerahalserver]IMX258_camera_sensor[feature_control] feature_id = 3041
<6>[   11.526970] .(3)[548:camerahalserver]i2c i2c-4: addr: 1a, transfer ACK error
<3>[   11.527952] .(3)[548:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   11.528910] .(3)[548:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x34, id: 0x0
<6>[   11.529027] .(3)[548:camerahalserver]i2c i2c-4: addr: 10, transfer ACK error
<3>[   11.529984] .(3)[548:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   11.530871] .(3)[548:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x20, id: 0x0
<7>[   11.530889] .(3)[548:camerahalserver][imgsensor]Fail to get sensor ID ffffffff
<7>[   11.530897] .(3)[548:camerahalserver][imgsensor]ERROR:imgsensor_check_is_alive(), No imgsensor alive
<3>[   11.530910] .(3)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 0
<3>[   11.531956] .(3)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 10
<4>[   11.532834] .(2)[222:battery_thread]=====FG===== SOC  = 100
<5>[   11.532852] .(2)[222:battery_thread][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 0 bat_plug_out_time 0 sp0:0x60 sp3:0xe4 1 1
<4>[   11.533722] .(1)[222:battery_thread]=====FG===== AC   = -356
<7>[   11.535670] .(7)[222:battery_thread][mt6356_get_auxadc_value]222 ch_idx = 10, channel = 1, reg_val = 0x6449, adc_result = 4230
<4>[   11.535974] .(3)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.536851] .(3)[548:camerahalserver]it is not ov7251 it is 1 
<7>[   11.537306] .(0)[222:battery_thread][mt6356_get_auxadc_value]222 ch_idx = 1, channel = 2, reg_val = 0x472, adc_result = 500
<7>[   11.538683] .(3)[548:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   11.538738] .(3)[548:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   11.538748] .(3)[548:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   11.538813] .(3)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   11.538825] .(3)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.539669] .(3)[548:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<4>[   11.539713] .(1)[222:battery_thread]=====FG===== AC   = -356
<7>[   11.539719] .(1)[222:battery_thread][mt6356_get_auxadc_value]111 ch_idx = 2, channel = 3, bat_cur = 356, reg_val = 0x39e, adc_result = 813
<5>[   11.539935] .(1)[222:battery_thread]car[-1,139,-139,278,-139] c:0 -356 vbat:4230 vbus:4730 soc:100 100 gm3:0 0 0 0
<5>[   11.540155] .(1)[222:battery_thread]tmp:25 65535 65535 hcar2:278 lcar2:139 time:11 sw_iavg:88 42 1 nafg_m:0 0 0
<5>[   11.540977] .(1)[403:fuelgauged]MTK_FG: get_kernel_cmd:1 0
<4>[   11.542171] .(0)[0:swapper/0]Power/swap DP: No enter --- SODI3: No enter --- SODI: No enter --- 
<4>[   11.542193] .(0)[0:swapper/0]mcdi cpu: 0, 0, 0, 0, 2, 7, 0, 6, cluster : 0, 0, pause = 0, multi core = 0, residency = 0, last core = 0, avail cpu = 00ff, cluster = 0003, enabled = 1, max_s_state = 5 (buck_off = 0), system_idle_hint = 00000000
<4>[   11.542193] 
<7>[   11.542646] .(1)[403:fuelgauged][mt6356_get_auxadc_value]222 ch_idx = 10, channel = 1, reg_val = 0x648f, adc_result = 4242
<4>[   11.542654] .(1)[403:fuelgauged]=====FG-MTK===== bat_vol=4242
<5>[   11.544863] MTK_FG: [dod_init_result]HW(43128, 9845) SW(43128, 9845) OLD(43376, 10000) VBAT(43121, 9840) OldCAR(c:0 v:0) con0(10000)
<5>[   11.544863] [dod_init_result]NVRAM_ready 1 Embedded 0 plug_out 0 is_hwocv_unreliable 0 rtc_invalid 0 rtc_ui_soc 10000 two_sec_reboot 0 old_data.ui_soc 10000, nv_fail(0)
<5>[   11.544863] [dod_init_result]T_new 25 T_old 25 T_d0 25 shutdown_time 0 pmic_shutdown_time 1800 plugout_time 0 plugout_time_th 32 swocv_oldocv_diff_emb 1000
<5>[   11.544863] [dod_init_result]ocv[boot:43122 final:43376 diff:254] thr[10000 10000 10000] tmp[now 25 5] v[lk_v:43121 cur:42960] lk_i:-6 lk_r:1700,i*r:1,old_soc:10000
<5>[   11.544863] [dod_init_result] <9> 43370 43376 10000 0 0 1 0
<5>[   11.544863] [dod_init_result] fg_c_d0(43370, 10000) fg_v_d0(43376, 10000) ui_d0_soc 10000 ui_soc_opt 0 car_v:0 _car:0
<5>[   11.544863] [dod_init_result] force_vc_mode 0 vc_mode 1 d0_sel 0
<5>[   11.544949] .(1)[403:fuelgauged]MTK_FG: {FGADC}soc:10000 fg_c_soc:10000 fg_v_soc:10000 ui_soc:10000 vc_diff:0 vc_mode 1 VBAT 42420 T:[25 V 24 C 25] D0_C 10000 D0_V 10000 CAR[c:0 v:0]Q:[27803 27803 27966 27966] aging 10000 bat_cycle 1 Trk[0:0:0] UI[1:0] Chr[1:10000:0] pseudo1 0 DC_ratio 100 vboot:35204 35119 dod_init[9]
<6>[   11.545669] .(1)[222:battery_thread][I][Factory Data](read_config_partition): OK
<7>[   11.564625] .(5)[548:camerahalserver][imgsensor][CheckIsAlive]Profile = 81479 us
<7>[   11.565416] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.565447] .(5)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 0
<7>[   11.566356] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=8, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.566366] .(5)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 10
<4>[   11.567298] .(5)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.568171] .(5)[548:camerahalserver]it is not ov7251 it is 1 
<3>[   11.568408] .(3)[521:main]BOOTPROF:     11568.407181:Zygote:Preload Start
<7>[   11.575085] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.575109] .(5)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   11.575142] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.575160] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.575171] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.576075] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.576097] .(5)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:3 powerId:2800000
<7>[   11.577405] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.578478] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.578499] .(5)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   11.579779] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.579844] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   11.579862] .(5)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.580753] .(5)[548:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   11.586684] .(5)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3041
<6>[   11.586867] .(5)[548:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   11.587822] .(5)[548:camerahalserver]I2C read failed (0x0)! speed(0=400)
<6>[   11.588916] .(5)[548:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   11.589881] .(5)[548:camerahalserver]I2C read failed (0x0)! speed(0=400)
<7>[   11.590755] .(5)[548:camerahalserver]S5K3L8[get_imgsensor_id] Read sensor id fail, i2c write id: 0x5a, ReadOut sensor id: 0x0, imgsensor_info.sensor_id:0x30c8.
<6>[   11.590899] .(4)[548:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   11.591894] .(4)[548:camerahalserver]I2C read failed (0x0)! speed(0=400)
<6>[   11.593014] .(4)[548:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   11.594035] .(4)[548:camerahalserver]I2C read failed (0x0)! speed(0=400)
<7>[   11.594924] .(4)[548:camerahalserver]S5K3L8[get_imgsensor_id] Read sensor id fail, i2c write id: 0x5a, ReadOut sensor id: 0x0, imgsensor_info.sensor_id:0x30c8.
<7>[   11.594942] .(4)[548:camerahalserver][imgsensor]Fail to get sensor ID ffffffff
<7>[   11.594948] .(4)[548:camerahalserver][imgsensor]ERROR:imgsensor_check_is_alive(), No imgsensor alive
<3>[   11.594958] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 0
<3>[   11.595923] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 10
<4>[   11.596953] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.597815] .(4)[548:camerahalserver]it is not ov7251 it is 1 
<7>[   11.599658] .(4)[548:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   11.599708] .(4)[548:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   11.599717] .(4)[548:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   11.599761] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   11.599772] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.600612] .(4)[548:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   11.601610] .(4)[548:camerahalserver][imgsensor][CheckIsAlive]Profile = 36197 us
<7>[   11.601643] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.601664] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 0
<7>[   11.602574] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=8, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.602584] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 10
<4>[   11.603952] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.604983] .(4)[548:camerahalserver]it is not ov7251 it is 1 
<6>[   11.610755] .(2)[530:vtservice][ccci1/chr]port ccci_imsdc open with flag 20002 by vtservice
<7>[   11.611029] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.611041] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   11.611065] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=8, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.611073] .(4)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:3 powerId:2500000
<7>[   11.613034] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.613051] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=2, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.613083] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   11.613089] .(6)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   11.613092] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.613105] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.613114] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.614123] .(6)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   11.614138] .(6)[548:camerahalserver]it is ov7251 is_sub_camera=1 
<4>[   11.614143] .(6)[548:camerahalserver]OV7251_power_on 1
<4>[   11.614144] .(6)[548:camerahalserver]scanner 3v3 enable:1
<6>[   11.627405] .(5)[584:mtk_agpsd][ccci1/chr]port ccci_c2k_agps open with flag 20902 by mtk_agpsd
<6>[   11.671756] .(4)[548:camerahalserver][D][Factory Data](property_get): (offset = 7)
<6>[   11.672798] .(4)[548:camerahalserver][D][Factory Data](dl_factory_get_element_type): (id=6)+
<6>[   11.673909] .(4)[548:camerahalserver][D][Factory Data](_factory_get_element_type): (id=6)+
<6>[   11.674966] .(4)[548:camerahalserver][D][Factory Data](_get_factory_item): (id=6)+
<6>[   11.675942] .(4)[548:camerahalserver][D][Factory Data](_factory_get_element_type): (id=6): type = 3
<6>[   11.677153] .(4)[548:camerahalserver][D][Factory Data](dl_factory_get_element_num): (id=6)+
<6>[   11.678230] .(4)[548:camerahalserver][D][Factory Data](_factory_get_element_num): (id=6)+
<6>[   11.679278] .(4)[548:camerahalserver][D][Factory Data](_get_factory_item): (id=6)+
<6>[   11.680252] .(4)[548:camerahalserver][D][Factory Data](_factory_get_element_num): (id=6): elements = 1
<6>[   11.681543] .(4)[548:camerahalserver][D][Factory Data](dl_factory_get_value): +
<6>[   11.682495] .(4)[548:camerahalserver][D][Factory Data](_factory_get_value): [id=6,index=0] +
<6>[   11.683598] .(4)[548:camerahalserver][D][Factory Data](_get_factory_item): (id=6)+
<6>[   11.684576] .(4)[548:camerahalserver][D][Factory Data](_factory_get_value_from_memory): [id=6,index=0] +
<6>[   11.685846] .(4)[548:camerahalserver][D][Factory Data](_factory_get_value_from_memory): -
<6>[   11.686976] .(4)[548:camerahalserver][D][Factory Data](_factory_get_value): [id=6,index=0] value=16 -
<6>[   11.688193] .(4)[548:camerahalserver][D][Factory Data](property_get): els: 1, i 1, written 3
<4>[   11.689329] .(4)[548:camerahalserver][stm32]This is an EL engine!!! 
<6>[   11.690196] .(4)[548:camerahalserver]OV72512LANE[ov7251_init] E
<4>[   11.690971] .(4)[548:camerahalserver]hehai ov7251 id = 7750 
<7>[   11.691710] .(4)[548:camerahalserver][imgsensor] Sensor found ID = 0x7750
<3>[   11.691732] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 0
<3>[   11.692642] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 10
<4>[   11.693651] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   11.694490] .(4)[548:camerahalserver]it is not ov7251 it is 1 
<7>[   11.696318] .(4)[548:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   11.696352] .(4)[548:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   11.696361] .(4)[548:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   11.696394] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   11.696405] .(4)[548:camerahalserver]it is ov7251 is_sub_camera=1 
<4>[   11.697265] .(4)[548:camerahalserver]OV7251_power_off 1
<4>[   11.698013] .(4)[548:camerahalserver]scanner 3v3 enable:0
<7>[   11.701382] .(4)[548:camerahalserver][imgsensor][CheckIsAlive]Profile = 99737 us
<7>[   11.701410] .(4)[548:camerahalserver][imgsensor][imgsensor_set_driver] :[1][2][ov7251]
<7>[   11.701581] .(4)[548:camerahalserver][imgsensor][CAMERA SENSOR] CAOMPAT_KDIMGSENSORIOC_X_GETINFO2
<7>[   11.701598] .(4)[548:camerahalserver][imgsensor][adopt_CAMERA_HW_GetInfo2]Entry1
<6>[   11.701615] .(4)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 0
<6>[   11.702533] .(4)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 1
<6>[   11.703431] .(4)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 2
<6>[   11.704320] .(4)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 3
<6>[   11.705287] .(4)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 4
<6>[   11.706239] .(4)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 5
<6>[   11.707137] .(4)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 6
<6>[   11.708029] .(4)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 7
<6>[   11.708957] .(4)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 8
<6>[   11.709852] .(4)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 9
<6>[   11.710751] .(4)[548:camerahalserver]OV72512LANE[get_resolution] E
<7>[   11.711569] .(4)[548:camerahalserver][imgsensor][CAMERA_HW][Pre]w=0x280, h = 0x1e0
<7>[   11.711579] .(4)[548:camerahalserver][imgsensor][CAMERA_HW][Full]w=0x280, h = 0x1e0
<7>[   11.711584] .(4)[548:camerahalserver][imgsensor][CAMERA_HW][VD]w=0x280, h = 0x1e0
<6>[   11.711867] .(4)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 0
<6>[   11.713146] .(4)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 1
<6>[   11.714422] .(4)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 2
<6>[   11.715635] .(4)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 3
<6>[   11.716858] .(4)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 4
<6>[   11.718055] .(4)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 5
<6>[   11.719265] .(4)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 6
<6>[   11.720487] .(4)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 7
<6>[   11.721794] .(4)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 8
<6>[   11.722995] .(4)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 9
<6>[   11.757546] .(4)[548:camerahalserver]OV72512LANE[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:1
<7>[   11.759034] .(4)[548:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 0, freq= 3, TG= 0
<7>[   11.759591] .(4)[548:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 0, freq= 3, TG= 1
<6>[   11.760087] .(4)[548:camerahalserver][ISP][ISP_release] - E. UserCount: 1.
<6>[   11.761108] .(4)[548:camerahalserver][ISP][ISP_release] Curr UserCount(0), (process, pid, tgid)=(camerahalserver, 548, 548), log_limit_line(0),	last user
<6>[   11.762904] [ISP][ISP_release] - X. UserCount: 0. G_u4EnableClockCount:0<7>[   11.763815] .(4)[548:camerahalserver][imgsensor]imgsensor_release 1
<7>[   11.764108] .(4)[548:camerahalserver][imgsensor]imgsensor_release 0
<3>[   12.043358] .(5)[522:main]BOOTPROF:     12043.356566:Zygote:Preload End
<6>[   12.076277] .(5)[878:initCamdevice][ISP][ISP_open] - E. UserCount: 0.
<6>[   12.077200] .(5)[878:initCamdevice][ISP][ISP_open] Curr UserCount(1), (process, pid, tgid)=(initCamdevice, 878, 548), log_limit_line(150), first user
<6>[   12.079577] .(5)[878:initCamdevice][ISP][ISP_open] - X. Ret: 0. UserCount: 1. G_u4EnableClockCount:1
<7>[   12.080878] .(5)[878:initCamdevice][imgsensor]imgsensor_open 1
<7>[   12.081573] .(5)[878:initCamdevice][imgsensor]imgsensor_open 2
<7>[   12.081682] .(5)[878:initCamdevice][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 1, freq= 3, TG= 0
<7>[   12.082143] .(1)[878:initCamdevice][imgsensor]sensor_idx = 0, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   12.082174] .(1)[878:initCamdevice][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   12.082223] .(1)[878:initCamdevice][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   12.082255] .(1)[878:initCamdevice][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   12.082272] .(1)[878:initCamdevice][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   12.082726] .(7)[878:initCamdevice][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   12.083171] .(4)[878:initCamdevice][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   12.084611] .(4)[878:initCamdevice][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   12.085497] .(7)[878:initCamdevice][imgsensor]sensor_idx = 0, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   12.085575] .(7)[878:initCamdevice][imgsensor]sensor_idx = 0, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   12.085588] .(7)[878:initCamdevice]it is not ov7251 is_sub_camera=0 
<4>[   12.086415] .(7)[878:initCamdevice]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   12.097322] .(7)[878:initCamdevice][imgsensor][kdCISModulePowerOn]Profile = 15185 us
<7>[   12.097352] .(7)[878:initCamdevice]S5K3L8[open] S5K3L8,MIPI 4LANE
<7>[   12.097777] .(7)[878:initCamdevice]S5K3L8[open] i2c write id: 0x5a, sensor id: 0x30c8
<7>[   12.097809] .(7)[878:initCamdevice]S5K3L8[sensor_init] E
<7>[   12.168725] .(5)[878:initCamdevice][ccu][ccu_set_sensor_info] ccu catch Main sensor i2c slave address : 0x5a
<7>[   12.168750] .(5)[878:initCamdevice][ccu][ccu_set_sensor_info] ccu catch Main sensor name : s5k3l8_mipi_raw
<7>[   12.168758] .(5)[878:initCamdevice][imgsensor][SensorOpen]Profile = 86623 us
<7>[   12.180831] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_open] EEPROM_drv_open start
<7>[   12.182944] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] CAM_CALIOC_G_READ start! offset=4, length=1
<7>[   12.182981] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_set_i2c_bus] EEPROM_set_i2c_bus end! deviceID=1 g_curBusIdx=0 g_Current_Client=ffffffc05c1d4c00
<7>[   12.182990] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] SensorID=30c8 DeviceID=1
<7>[   12.182998] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info_ex] g_camCalDrvInfo[0].sensorID == 0, start get_cmd_info!
<7>[   12.183005] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info] pCamCalList!=NULL && pCamCalFunc!= NULL
<7>[   12.183012] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info] pCamCalList[4].sensorID==30c8
<7>[   12.183019] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info] g_Current_Client->addr =50
<7>[   12.183025] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info] 20 client=ffffffc05c1d4c00 client2=ffffffc05c352800 client3=          (null) Cur=ffffffc05c1d4c00
<7>[   12.183366] .(0)[875:HwBinder:548_2]cam_cal_list[cam_cal_check_mtk_cid] calibrationID = 23
<7>[   12.183380] .(0)[875:HwBinder:548_2]cam_cal_list[cam_cal_check_mtk_cid] mtkCidList[0] == 23
<7>[   12.183387] .(0)[875:HwBinder:548_2]cam_cal_list[cam_cal_check_mtk_cid] ret =1
<7>[   12.183393] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info] pCamCalList[4].checkFunc ok!
<7>[   12.183399] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info_ex] deviceID=1, SensorID=30c8
<7>[   12.183776] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_open] EEPROM_drv_open start
<7>[   12.185825] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] CAM_CALIOC_G_READ start! offset=32, length=2
<7>[   12.185876] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_set_i2c_bus] EEPROM_set_i2c_bus end! deviceID=1 g_curBusIdx=0 g_Current_Client=ffffffc05c1d4c00
<7>[   12.185885] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] SensorID=30c8 DeviceID=1
<7>[   12.186308] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] CAM_CALIOC_G_READ start! offset=34, length=1868
<7>[   12.186325] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_set_i2c_bus] EEPROM_set_i2c_bus end! deviceID=1 g_curBusIdx=0 g_Current_Client=ffffffc05c1d4c00
<7>[   12.186333] .(0)[875:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] SensorID=30c8 DeviceID=1
<6>[   12.207061] .(1)[409:wfca][ccci1/chr]port ccci_imsa close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   12.208330] .(1)[409:wfca][ccci1/pot]critical user check: 0x1
<6>[   12.209251] .(1)[409:wfca][ccci1/chr]port ccci_imsa open with flag 20002 by wfca
<14>[   12.284816] .(1)[1:init]init: Command 'wait /only_for_timeout 1' action=mtk.md1.status=ready (/vendor/etc/init/init.volte_imsm_93.rc:10) returned -1 took 1008ms.
<14>[   12.287531] .(1)[1:init]init: PropSet [ril.muxreport.run]=[0] Done
<14>[   12.288565] .(1)[1:init]init: processing action (mtk.md1.status=ready && persist.mtk_epdg_support=1) from (/vendor/etc/init/init.wod.rc:16)
<36>[   12.290095] .(2)[367:logd.auditd]type=1400 audit(1578646639.734:33): avc: denied { read } for pid=787 comm="bip" name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=1189 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
<36>[   12.290106] .(2)[367:logd.auditd]type=1400 audit(1578646640.726:34): avc: denied { add_name } for pid=548 comm="HwBinder:548_2" name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<3>[   12.290200] .(6)[875:HwBinder:548_2][Cooler_NR]clNR_status_open 153
<3>[   12.290239] .(6)[875:HwBinder:548_2][Cooler_NR]clNR_status_mmap 94
<3>[   12.290242] .(6)[875:HwBinder:548_2][Cooler_NR]clNR_status_mmap 99
<7>[   12.292448] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3081
<7>[   12.292465] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:0
<7>[   12.292480] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3081
<7>[   12.292482] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:1
<7>[   12.292488] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3081
<7>[   12.292490] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:2
<7>[   12.292496] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3081
<7>[   12.292498] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:3
<7>[   12.292503] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3081
<7>[   12.292506] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:4
<14>[   12.298402] .(1)[1:init]init: PropSet [ril.epdg.interface.ctrl]=[1] Done
<14>[   12.299599] .(1)[1:init]init: PropSet [af.speech.shm_init]=[1] Done
<14>[   12.301861] .(1)[1:init]init: starting service 'epdg_wod'...
<14>[   12.305814] .(1)[1:init]init: PropSet [debug.mdlogger.Running]=[0] Done
<14>[   12.306760] .(0)[885:init]init: Created socket '/dev/socket/wod_action', mode 660, user 0, group 1000
<7>[   12.311880] .(6)[875:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3059
<7>[   12.311913] .(6)[875:HwBinder:548_2]S5K3L8[get_default_framerate_by_scenario] scenario_id = 0
<14>[   12.311917] .(0)[885:init]init: Created socket '/dev/socket/wod_sim', mode 660, user 0, group 1000
<7>[   12.313389] .(6)[875:HwBinder:548_2]flashlight: flashlight_open: Open(0,0,0)
<7>[   12.313415] .(6)[875:HwBinder:548_2]flashlight: flashlight_open: Open(0,1,0)
<7>[   12.313437] .(6)[875:HwBinder:548_2]flashlight: _flashlight_ioctl: FLASH_IOC_GET_PART_ID(0,0,0): 1
<7>[   12.313455] .(6)[875:HwBinder:548_2]flashlight: flashlight_release: Release(0,0,0)
<7>[   12.313460] .(6)[875:HwBinder:548_2]flashlight: flashlight_release: Release(0,1,0)
<7>[   12.314101] .(6)[875:HwBinder:548_2]flashlight: flashlight_open: Open(0,0,0)
<7>[   12.314123] .(6)[875:HwBinder:548_2]flashlight: flashlight_open: Open(0,1,0)
<7>[   12.314142] .(6)[875:HwBinder:548_2]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,0,0): 1
<6>[   12.314149] .(6)[875:HwBinder:548_2]flashlights_mt6370: mt6370_set_driver: Set driver: 1
<7>[   12.315195] .(6)[875:HwBinder:548_2]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,1,0): 1
<6>[   12.315206] .(6)[875:HwBinder:548_2]flashlights_mt6370: mt6370_set_driver: Set driver: 2
<14>[   12.340761] .(1)[1:init]init: PropSet [trustkernel.log.state]=[ready] Done
<14>[   12.343621] .(1)[1:init]init: processing action (trustkernel.log.state=ready) from (/vendor/etc/init/trustkernel.rc:23)
<3>[   12.345264] .(1)[1:init]BOOTPROF:     12345.261029:tkcore: prep log
<14>[   12.349768] .(7)[1:init]init: PropSet [ril.mux.ee.md1]=[0] Done
<14>[   12.350814] .(7)[1:init]init: PropSet [trustkernel.log.state]=[enable] Done
<7>[   12.351372] .(1)[874:HwBinder:548_1]flashlight: _flashlight_ioctl: FLASH_IOC_SET_ONOFF(0,0,0): 0
<7>[   12.351395] .(1)[874:HwBinder:548_1]flashlights_mt6370: mt6370_ioctl: FLASH_IOC_SET_ONOFF(0): 0
<7>[   12.351404] .(1)[874:HwBinder:548_1]flashlight: _flashlight_ioctl: FLASH_IOC_SET_ONOFF(0,1,0): 0
<7>[   12.351408] .(1)[874:HwBinder:548_1]flashlights_mt6370: mt6370_ioctl: FLASH_IOC_SET_ONOFF(1): 0
<6>[   12.351623] .(1)[874:HwBinder:548_1]mt6370_pmu_fled mt6370_pmu_fled.0: set to off mode
<6>[   12.351642] .(1)[874:HwBinder:548_1]mt6370_pmu_fled mt6370_pmu_fled.1: set to off mode
<7>[   12.351758] .(1)[874:HwBinder:548_1]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,0,0): 0
<6>[   12.351769] .(1)[874:HwBinder:548_1]flashlights_mt6370: mt6370_set_driver: Unset driver: 1
<7>[   12.351778] .(1)[874:HwBinder:548_1]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,1,0): 0
<6>[   12.351789] .(1)[874:HwBinder:548_1]mt6370_pmu_fled mt6370_pmu_fled.0: set to off mode
<6>[   12.351795] .(1)[874:HwBinder:548_1]mt6370_pmu_fled mt6370_pmu_fled.1: set to off mode
<6>[   12.351798] .(1)[874:HwBinder:548_1]flashlights_mt6370: mt6370_set_driver: Unset driver: 0
<7>[   12.351807] .(1)[874:HwBinder:548_1]flashlight: flashlight_release: Release(0,0,0)
<7>[   12.351811] .(1)[874:HwBinder:548_1]flashlight: flashlight_release: Release(0,1,0)
<5>[   12.352325] .(5)[413:vendor.mediatek][Power/PPM] (0x0)(-1)(0)(0-7)(15)(0)(4)(4) (15)(0)(4)(4) 
<6>[   12.352498] .(2)[791:gsm0710muxd][ccci1/chr]port ttyC0 open with flag 20902 by gsm0710muxd
<14>[   12.361012] .(7)[1:init]init: PropSet [debug.mdl.run.folder]=[] Done
<14>[   12.367226] .(7)[1:init]init: PropSet [debug.mdl.EE.folder]=[] Done
<14>[   12.369708] .(7)[1:init]init: PropSet [debug.pullmdlog]=[] Done
<14>[   12.372125] .(7)[1:init]init: PropSet [debug.mdl.EE.done]=[] Done
<6>[   12.374012] .(2)[789:emdlogger1][ccci1/chr]port ccci_ccb_dhl open with flag 20002 by emdlogger1
<6>[   12.375152] .(2)[789:emdlogger1][ccci1/shm]smem_port->addr_phy=7c000000
<6>[   12.376129] .(2)[789:emdlogger1][ccci1/chr]remap addr:0x7c000000 len:2097152  map-len:2097152
<6>[   12.377427] .(2)[789:emdlogger1][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by emdlogger1
<6>[   12.378583] .(2)[789:emdlogger1][ccci1/shm]ccb_configs_len: 20
<6>[   12.379463] .(2)[789:emdlogger1][ccci1/shm]find ccb port ccci_ccb_dhl for user1!
<6>[   12.380490] .(2)[789:emdlogger1][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[   12.381650] .(2)[789:emdlogger1][ccci1/chr]remap succeed 80018, 0x80018000 -> 0x7486f8f000
<6>[   12.383639] .(2)[789:emdlogger1][ccci1/chr]port ccci_raw_dhl open with flag 20002 by emdlogger1
<6>[   12.384822] .(2)[789:emdlogger1][ccci1/shm]smem_port->addr_phy=7c200000
<6>[   12.385820] .(2)[789:emdlogger1][ccci1/chr]remap addr:0x7c200000 len:20971520  map-len:20971520
<14>[   12.393229] .(6)[1:init]init: PropSet [debug.mdlogger.log2sd.path]=[internal_sd] Done
<14>[   12.396279] .(5)[1:init]init: PropSet [debug.mdl.sdswap.path]=[/mnt/sdcard] Done
<7>[   12.397088] .(7)[874:HwBinder:548_1][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 0, freq= 3, TG= 0
<7>[   12.397441] .(0)[874:HwBinder:548_1]S5K3L8[close] E
<7>[   12.398557] .(0)[874:HwBinder:548_1][imgsensor][regulator]6 is enabled
<7>[   12.398639] .(0)[874:HwBinder:548_1][imgsensor][regulator]4 is enabled
<7>[   12.398673] .(0)[874:HwBinder:548_1][imgsensor][regulator]3 is enabled
<7>[   12.398707] .(0)[874:HwBinder:548_1][imgsensor][regulator]5 is enabled
<7>[   12.398787] .(0)[874:HwBinder:548_1][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   12.398803] .(0)[874:HwBinder:548_1]it is not ov7251 is_sub_camera=0 
<4>[   12.400101] .(0)[874:HwBinder:548_1]it is not ov7251 it is s5k3l8_mipi_raw 
<14>[   12.400213] .(5)[1:init]init: PropSet [debug.mdlogger.log2sd.path]=[internal_sd] Done
<14>[   12.401844] .(5)[1:init]init: PropSet [debug.mdl.sdswap.path]=[/mnt/sdcard] Done
<7>[   12.404106] .(0)[874:HwBinder:548_1][imgsensor]imgsensor_release 1
<6>[   12.404486] .(0)[874:HwBinder:548_1][ISP][ISP_release] - E. UserCount: 1.
<6>[   12.406113] .(5)[1:init][ISP][ISP_release] Curr UserCount(0), (process, pid, tgid)=(HwBinder:548_1, 874, 548), log_limit_line(0),	last user
<14>[   12.407153] .(5)[1:init]init: PropSet [debug.mdl.run.folder]=[/data/mdlog/bootupLog/mdlog1] Done
<6>[   12.409208] [ISP][ISP_release] - X. UserCount: 0. G_u4EnableClockCount:0.(3)[1:init]init: PropSet [debug.mdl.EE.folder]=[] Done
<7>[   12.410742] .(0)[874:HwBinder:548_1][imgsensor]imgsensor_release 0
<14>[   12.411968] .(3)[1:init]init: [PropSet]: pid:791 uid:0 gid:1001 ctl.stop, ril-daemon
<11>[   12.413190] .(3)[1:init]init: no such service 'ril-daemon'
<14>[   12.415319] .(6)[1:init]init: PropSet [ril.mtk]=[1] Done
<14>[   12.417594] .(6)[1:init]init: processing action (ril.mtk=1) from (/vendor/etc/init/rild.rc:12)
<14>[   12.420056] .(6)[1:init]init: starting service 'ril-daemon-mtk'...
<14>[   12.422902] .(6)[1:init]init: PropSet [debug.mdlogger.log2sd.path]=[internal_sd] Done
<14>[   12.424881] .(7)[930:init]init: Created socket '/dev/socket/sap_uim_socket1', mode 660, user 1002, group 1002
<14>[   12.428042] .(7)[930:init]init: Created socket '/dev/socket/rild-oem', mode 660, user 1001, group 1000
<14>[   12.428438] .(6)[1:init]init: PropSet [debug.mdl.sdswap.path]=[/mnt/sdcard] Done
<14>[   12.432916] .(7)[930:init]init: Created socket '/dev/socket/volte_imsvt1', mode 660, user 0, group 1001
<3>[   12.728632] .(4)[521:main]BOOTPROF:     12728.630722:Zygote:Preload 4715 classes in 1043ms
<6>[   12.730482] .(1)[885:epdg_wod][ccci1/chr]port ccci_woa open with flag 20002 by epdg_wod
<7>[   12.744886] .(2)[512:disp_queue_P0][DISP]layer_cnt total:100.layers:100,0,0,0,0,0,0,0,0,0,0,0,
<7>[   12.744913] .(2)[512:disp_queue_P0][DISP]layer_cnt .ext:100,0,0,0,0,0,.arm_ext:100,0,0,0,0,0,
<3>[   12.965456] .(1)[521:main]BOOTPROF:     12965.454107:Zygote:Preload 64 obtain resources in 46ms
<3>[   12.972040] .(1)[521:main]BOOTPROF:     12972.037953:Zygote:Preload 41 resources in 5ms
<14>[   13.061189] .(1)[1:init]init: PropSet [ril.cdma.card.omh]=[-1] Done
<14>[   13.063978] .(1)[1:init]init: PropSet [ril.ecclist]=[] Done
<14>[   13.066330] .(7)[1:init]init: PropSet [ril.cdma.ecclist]=[] Done
<14>[   13.078614] .(1)[1:init]init: PropSet [persist.radio.sim.opid]=[0] Done
<14>[   13.108756] .(3)[1:init]init: PropSet [persist.radio.simswitch]=[1] Done
<14>[   13.114445] .(3)[1:init]init: PropSet [ril.simswitch.no_reset_support]=[1] Done
<14>[   13.124298] .(0)[1:init]init: PropSet [ril.simswitch.tpluswsupport]=[1] Done
<6>[   13.141788] .(2)[961:RfxSender_3][ccci1/chr]port ccci_ioctl1 open with flag 20802 by RfxSender_3
<6>[   13.143089] .(2)[961:RfxSender_3][ccci1/fsm]CCCI_IOC_GET_MD_TYPE: 11!
<14>[   13.143792] .(7)[1:init]init: PropSet [ril.nw.worldmode.keep_3g_mode]=[0] Done
<3>[   13.144003] .(4)[521:main]BOOTPROF:     13144.001646:Zygote:Preload End
<6>[   13.146007] .(2)[961:RfxSender_3][ccci1/chr]port ccci_ioctl1 close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   13.147290] .(2)[961:RfxSender_3][ccci1/pot]critical user check: 0x7
<14>[   13.150515] .(0)[1:init]init: PropSet [ril.active.md]=[11] Done
<14>[   13.153270] .(0)[1:init]init: PropSet [ril.nw.signalstrength.lte.1]=[2147483647,214748364] Done
<14>[   13.158789] .(0)[1:init]init: PropSet [ril.nw.worldmode.activemode]=[1] Done
<6>[   13.159185] .(7)[985:RfxSender_5][ccci1/chr]port ccci_ss_xcap open with flag 20002 by RfxSender_5
<14>[   13.164880] .(0)[1:init]init: PropSet [ril.apc.support]=[1] Done
<14>[   13.168141] .(7)[1:init]init: PropSet [ril.fd.mode]=[1] Done
<36>[   13.346995] .(2)[367:logd.auditd]type=1400 audit(1578646641.726:35): avc: denied { add_name } for pid=548 comm="HwBinder:548_2" name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[   13.349827] .(2)[367:logd.auditd]type=1400 audit(1578646641.782:36): avc: denied { write } for pid=364 comm="teed" name="/" dev="dm-2" ino=2 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<6>[   13.385022] .(3)[257:kworker/3:1]tcpc_event_init_work typec attache new = 1
<6>[   13.386132] .(3)[45:pd_dbg_info]///PD dbg info 68d
<4>[   13.386768] .(3)[45:pd_dbg_info]<   13.386>TCPC-DC> dc_dfp_none
<4>[   13.386768] <   13.386>TCPC-PE:PD-> SNK_START
<6>[   13.412704] .(3)[45:pd_dbg_info]///PD dbg info 145d
<4>[   13.413376] .(3)[45:pd_dbg_info]<   13.386>TCPC-PE-EVT:reset_prl_done
<4>[   13.413376] <   13.386>TCPC-PE:PD-> SNK_DISC
<4>[   13.413376] <   13.386>TCPC-PE-EVT:vbus_high
<4>[   13.413376] <   13.386>TCPC-PE:PD-> SNK_WAIT_CAP
<3>[   13.424044] .(5)[987:system_server]BOOTPROF:     13424.042031:Android:SysServerInit_START
<14>[   13.430649] .(0)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<4>[   13.542466] .(3)[399:healthd]=====FG===== SOC  = 100
<4>[   13.544778] .(3)[399:healthd]=====FG===== VOLT = 4284
<4>[   13.545507] .(3)[399:healthd]=====FG===== actural VOLT = 4298
<4>[   13.547383] .(3)[399:healthd]=====FG===== AC   = -123
<4>[   13.548955] .(3)[399:healthd]bq27542_set_commands cmd = 0x12, val = 3813 
<4>[   13.550934] .(3)[399:healthd]temp_now=194, temp_last=193 
<4>[   13.551657] .(3)[399:healthd]=====FG===== TEMP = 194
<6>[   13.553751] .(3)[399:healthd]i2c i2c-2: addr: 6c, transfer ACK error
<6>[   13.554608] .(3)[399:healthd]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[   13.555626] .(3)[399:healthd]I2C structure:
<3>[   13.555626] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=3,Total_len=1
<3>[   13.555626] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[   13.555626] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[   13.558869] .(3)[399:healthd]base address 0xffffff800bf46000
<6>[   13.559632] .(3)[399:healthd]I2C register:
<6>[   13.559632] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=0,CONTROL=28,TRANSFER_LEN=1
<6>[   13.559632] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[   13.559632] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[   13.563326] .(3)[399:healthd]before enable DMA register(0xffffff800bf48400):
<6>[   13.563326] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[   13.563326] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[   13.563326] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[   13.563326] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[   13.567244] .(3)[399:healthd]DMA register(0xffffff800bf48400):
<6>[   13.567244] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[   13.567244] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[   13.567244] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[   13.567244] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[   13.570910] .(3)[399:healthd]i2c_dump_info ------------------------------------------
<3>[   13.571940] .(3)[399:healthd]i2c i2c-2: last transfer info:
<3>[   13.572701] .(3)[399:healthd]i2c i2c-2: [00] [   13.553739] SLAVE_ADDR=d8,INTR_STAT=3,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[   13.574243] .(3)[399:healthd]i2c i2c-2: [01] [   13.550919] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[   13.575767] .(3)[399:healthd]i2c i2c-2: [02] [   13.550491] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[   13.577340] .(3)[399:healthd]i2c i2c-2: [03] [   13.548936] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=499
<3>[   13.578869] .(3)[399:healthd]i2c i2c-2: [04] [   13.548514] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[   13.580408] .(3)[399:healthd]i2c i2c-2: [05] [   13.547368] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[   13.581962] .(3)[399:healthd]i2c i2c-2: [06] [   13.546936] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[   13.583551] .(3)[399:healthd]i2c i2c-2: [07] [   13.544762] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=499
<3>[   13.585088] .(3)[399:healthd]i2c i2c-2: [08] [   13.544297] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[   13.586630] .(3)[399:healthd]i2c i2c-2: [09] [   13.544027] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<4>[   13.588190] .(3)[399:healthd][wlc_do_10s_debounce]status=0
<4>[   13.588919] .(3)[399:healthd][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294895683 valley_jiffies=0 topeak_jiffies=0 
<12>[   13.590824] .(3)[399:healthd]healthd: battery l=100 v=4298 t=19.4 h=2 st=2 c=-123 fc=3813000 chg=u
<14>[   13.674234] .(0)[1:init]init: PropSet [ril.ipo.radiooff]=[0] Done
<14>[   13.679309] .(2)[1:init]init: PropSet [ril.mux.report.case]=[0] Done
<6>[   13.717024] .(1)[973:RfxSender_8][ccci1/chr]port ccci_ioctl1 open with flag 20802 by RfxSender_8
<6>[   13.718193] .(1)[973:RfxSender_8][ccci1/fsm]EFUN set to 0
<6>[   13.718984] .(1)[973:RfxSender_8][ccci1/chr]port ccci_ioctl1 close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   13.720233] .(1)[973:RfxSender_8][ccci1/pot]critical user check: 0x7
<14>[   13.726338] .(2)[1:init]init: PropSet [ril.ecclist]=[] Done
<14>[   13.730367] .(2)[1:init]init: PropSet [ril.cdma.ecclist]=[] Done
<14>[   13.733941] .(2)[1:init]init: PropSet [ril.iccid.sim1]=[N/A] Done
<14>[   13.737424] .(2)[1:init]init: PropSet [ril.ecc.service.category.list]=[] Done
<14>[   13.741318] .(2)[1:init]init: PropSet [ril.cdma.card.type.1]=[255] Done
<14>[   13.748090] .(2)[1:init]init: PropSet [persist.radio.lastsim1_iccid]=[null] Done
<14>[   13.754246] .(0)[1:init]init: PropSet [persist.radio.c_capability_slot]=[1] Done
