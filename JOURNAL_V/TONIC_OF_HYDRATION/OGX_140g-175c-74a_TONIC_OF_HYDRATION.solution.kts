
solution {
    puzzle = "P089"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = -7 to 3
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to -3
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -7 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -2 to -2
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 7
    }
    glyph(BONDER) {
        position = -6 to 2
        rotation = 5
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 5
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -5 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = 8
    }
    io(INPUT) {
        index = 1
        position = -7 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -1 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(8)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                repeat()
            }
        }
        )
    }
}
