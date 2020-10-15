
solution {
    puzzle = "P054"
    name = "B CA 2T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 3
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 1 to -1
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 0 to -1
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -4 to 3
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -4 to 1
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -2 to 0
        rotation = -4
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = -1 to -1
        rotation = -11
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    track {
        position = -3 to 4
        positions = listOf(0 to -1, 1 to -1, 2 to -1)
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                back()
                grab()
                retract()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                drop()
                wait(2)
                forward()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
