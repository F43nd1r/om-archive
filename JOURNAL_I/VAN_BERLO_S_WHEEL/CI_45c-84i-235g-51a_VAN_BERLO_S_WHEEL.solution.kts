
solution {
    puzzle = "P054"
    name = "B CI84 2T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -3
        rotation = 4
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = 3 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 2 to 0
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 1 to 0, 0 to 1, -1 to 1, -1 to 2)
    }
    track {
        position = 1 to -4
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, -1 to 1)
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
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
            }
        }
        )
    }
}
