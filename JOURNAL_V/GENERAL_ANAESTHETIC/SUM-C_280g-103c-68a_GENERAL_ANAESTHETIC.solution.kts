
solution {
    puzzle = "P086"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -5 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -7 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -5 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -6 to 1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to -5
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to -4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -3 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 0 to -4
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -6 to -1
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -3 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -6 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -2 to -4
        rotation = 0
    }
    track {
        position = 0 to -4
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 1)
    }
    track {
        position = -3 to 1
        positions = listOf(-1 to 2, -1 to 1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                pivotClockwise()
                wait(5)
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(14)
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(10)
                grab()
                back()
                back()
                rotateCounterClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                wait(1)
                pivotClockwise()
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        )
    }
}
