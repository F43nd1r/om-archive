
solution {
    puzzle = "P042"
    name = "H5"
    arm(ARM1) {
        number = 1
        position = -3 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 0 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to -1
        rotation = -4
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 4 to -1
        rotation = -4
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = 1 to 3
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 0 to 3
        rotation = -9
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 11 to -1
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = 4 to 3
        rotation = -6
    }
    glyph(BONDER) {
        position = 4 to 1
        rotation = -6
    }
    glyph(BONDER) {
        position = 6 to -1
        rotation = -6
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = -5
    }
    glyph(BONDER) {
        position = 4 to 2
        rotation = -4
    }
    glyph(MULTI_BONDER) {
        position = 2 to 1
        rotation = -7
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 3
        rotation = 0
    }
    track {
        position = 12 to -1
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 1 to -1
        positions = listOf(-1 to 0, 0 to 0, 1 to 0, 2 to 0, 3 to 0)
    }
    track {
        position = 4 to 2
        positions = listOf(-1 to 0, -2 to 1, -3 to 1, -4 to 1)
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -3 to 1, -4 to 1)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(41)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                back()
                wait(2)
                forward()
                wait(1)
                back()
                back()
                rotateCounterClockwise()
                grab()
                retract()
                rotateClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                forward()
                forward()
                wait(3)
                retract()
                back()
                forward()
                extend()
                retract()
                extend()
                extend()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                retract()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                forward()
                back()
                extend()
                extend()
                drop()
                back()
                retract()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                back()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                back()
                back()
                back()
                rotateCounterClockwise()
                wait(1)
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                wait(1)
                reset()
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                wait(1)
                back()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
                wait(4)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                back()
                reset()
                wait(4)
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
