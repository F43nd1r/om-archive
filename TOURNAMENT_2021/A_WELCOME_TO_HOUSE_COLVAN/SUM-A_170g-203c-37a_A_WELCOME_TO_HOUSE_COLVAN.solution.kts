
solution {
    puzzle = "w2450560971"
    name = "B X S F BIGGIE 410"
    arm(ARM1) {
        number = 1
        position = -3 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = 2 to 0
        rotation = 1
        size = 1
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 3 to -1
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 2 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                grab()
                rotateCounterClockwise()
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
                wait(10)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
