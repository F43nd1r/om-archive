
solution {
    puzzle = "P028"
    name = "H3 3T"
    arm(PISTON) {
        number = 1
        position = -1 to 1
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -1 to -1
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -2 to 1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -1
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -3 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -11 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -12 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -12 to -1
        rotation = 0
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -4 to 0
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = -9 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -5 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -10 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 1
        rotation = 0
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 0 to 1, 0 to 2, -1 to 2, -1 to 1)
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -12 to 0
        positions = listOf(1 to -1, 0 to -1, 0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                reset()
                wait(4)
                repeat()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                back()
                drop()
                retract()
                retract()
                back()
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                back()
                wait(1)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                extend()
                drop()
                back()
                wait(1)
                grab()
                extend()
                back()
                drop()
                retract()
                retract()
                back()
                grab()
                extend()
                extend()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                extend()
                extend()
                back()
                drop()
                retract()
                retract()
                back()
                wait(1)
                grab()
                extend()
                drop()
                back()
                wait(1)
                grab()
                extend()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                extend()
                extend()
                reset()
                wait(3)
                repeat()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                back()
                reset()
                wait(4)
                repeat()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                forward()
                drop()
                wait(1)
                grab()
                back()
                back()
                forward()
                repeat()
                wait(6)
                repeat()
            }
        }
        )
    }
}
