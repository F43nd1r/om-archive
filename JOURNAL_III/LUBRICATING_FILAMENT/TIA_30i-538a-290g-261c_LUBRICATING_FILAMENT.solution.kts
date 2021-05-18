
solution {
    puzzle = "P065"
    name = "TI"
    arm(ARM6) {
        number = 1
        position = -3 to -2
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -4 to 0
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to -2
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = 3 to 0
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = 2 to -1
        rotation = 6
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = 1 to 2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 1 to 5
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 6
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -5 to 8
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
