
solution {
    puzzle = "P040"
    name = "H5 6T"
    arm(PISTON) {
        number = 1
        position = -1 to -1
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 0 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -4 to 1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = 0 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -3 to 1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = -2 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -2 to 1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, -1 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -2 to -2
        positions = listOf(-2 to 3, -1 to 2, 0 to 1, 0 to 0, -1 to 1)
    }
    track {
        position = 2 to -3
        positions = listOf(-3 to 0, -2 to 0, -1 to 0, -2 to 1, -3 to 2)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                reset()
                wait(18)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(14)
                grab()
                forward()
                wait(10)
                forward()
                reset()
                wait(11)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                wait(2)
                back()
                grab()
                back()
                back()
                drop()
                back()
                wait(3)
                reset()
                wait(7)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(13)
                back()
                back()
                wait(2)
                back()
                grab()
                back()
                back()
                drop()
                back()
                wait(2)
                back()
                wait(3)
                reset()
                wait(8)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(13)
                back()
                wait(2)
                grab()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                extend()
                forward()
                drop()
                back()
                reset()
                wait(7)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                back()
                retract()
                rotateClockwise()
                wait(6)
                forward()
                extend()
                wait(4)
                forward()
                extend()
                drop()
                reset()
                wait(5)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                retract()
                wait(5)
                grab()
                back()
                pivotCounterClockwise()
                extend()
                pivotClockwise()
                forward()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                retract()
                retract()
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                extend()
                pivotClockwise()
                forward()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                retract()
                retract()
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                extend()
                pivotClockwise()
                forward()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                retract()
                retract()
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                extend()
                pivotClockwise()
                forward()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                retract()
                retract()
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                extend()
                pivotClockwise()
                forward()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                retract()
                retract()
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                extend()
                pivotClockwise()
                forward()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                wait(2)
                forward()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                wait(2)
                back()
                wait(2)
                reset()
                wait(3)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
                wait(24)
                repeat()
            }
        }
        )
    }
}
