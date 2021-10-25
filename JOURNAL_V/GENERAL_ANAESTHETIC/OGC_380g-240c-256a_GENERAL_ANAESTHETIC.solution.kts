
solution {
    puzzle = "P086"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = 19 to -3
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 22 to -5
        rotation = 3
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 20 to -6
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 14 to 0
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 7 to 6
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 6
        position = 11 to -2
        rotation = -2
        size = 3
    }
    arm(ARM3) {
        number = 7
        position = 10 to -1
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 8
        position = 4 to -1
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 4 to 6
        rotation = -1
        size = 3
    }
    glyph(BONDER) {
        position = 9 to 4
        rotation = -1
    }
    glyph(BONDER) {
        position = 8 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 7 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 9 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to 3
        rotation = -2
    }
    glyph(BONDER) {
        position = 7 to -6
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 17 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 11 to 3
        rotation = -1
    }
    glyph(ANIMISMUS) {
        position = 21 to -4
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 19 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = -7
    }
    io(INPUT) {
        index = 1
        position = 22 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 9 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 14 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(12)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(9)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
