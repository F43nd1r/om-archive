
solution {
    puzzle = "w2501727808"
    name = "B F 1-2T"
    arm(ARM6) {
        number = 1
        position = 0 to -2
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -3
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = -2
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = 3 to 0
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 1
        rotation = -6
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 7 to -2
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = -5
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = -6
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = -8
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -4
    }
    glyph(PROJECTION) {
        position = 2 to -1
        rotation = -8
    }
    glyph(PURIFICATION) {
        position = 1 to -2
        rotation = -2
    }
    glyph(DISPOSAL) {
        position = -1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 2
        rotation = -7
    }
    io(INPUT) {
        index = 1
        position = 2 to 2
        rotation = -8
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                pivotClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        )
    }
}
