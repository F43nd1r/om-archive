
solution {
    puzzle = "P089"
    name = "B S"
    arm(ARM6) {
        number = 1
        position = -7 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -5 to -6
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -5 to -5
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = -4 to -6
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -8 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -6 to 0
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -4 to 1
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = -8 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to -4
        rotation = 5
    }
    glyph(BONDER) {
        position = -4 to -3
        rotation = 5
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 5
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -7 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -3 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -10 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -8 to -3
        rotation = 0
    }
    track {
        position = -4 to 1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(10)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
