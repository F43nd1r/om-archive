
solution {
    puzzle = "w2501727808"
    name = "NEW SOLUTION 1 (Copy)"
    arm(ARM6) {
        number = 1
        position = -4 to 0
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to 2
        rotation = -2
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = -2 to 2
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to 3
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 1 to -2
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -5
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -5
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = -8
    }
    glyph(PURIFICATION) {
        position = -3 to 0
        rotation = -2
    }
    glyph(DISPOSAL) {
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 1
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -3 to 4
        rotation = -7
    }
    track {
        position = 3 to -3
        positions = listOf(-1 to 0, -2 to 1)
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
                wait(2)
                repeat()
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
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                back()
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
            }
        }
        )
    }
}
