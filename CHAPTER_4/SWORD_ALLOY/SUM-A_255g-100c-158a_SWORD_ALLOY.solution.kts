
solution {
    puzzle = "P033"
    name = "B CGX 6T"
    arm(ARM1) {
        number = 1
        position = -4 to 6
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 6
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -4 to 4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -3 to 3
        rotation = 0
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to 3
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -2 to 5
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = 1 to -1
        rotation = -6
    }
    io(INFINITE) {
        index = 0
        position = -14 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 6
        rotation = 0
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(5)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                reset()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        )
    }
}
