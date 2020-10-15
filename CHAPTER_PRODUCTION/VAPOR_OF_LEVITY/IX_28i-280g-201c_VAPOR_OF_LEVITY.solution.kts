
solution {
    puzzle = "P078"
    name = "B II 1-2T"
    arm(ARM1) {
        number = 1
        position = -4 to 2
        rotation = 6
        size = 2
    }
    arm(ARM3) {
        number = 2
        position = -1 to 1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to 0
        rotation = 5
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 4 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 6 to 1
        rotation = 1
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 4 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 2
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = 5 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 1
    }
    track {
        position = 2 to 3
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -4 to 2
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    conduit {
        id = 100
        position = 3 to 3
        rotation = -1
    }
    conduit {
        id = 100
        position = 0 to 1
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(5)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                wait(2)
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(53)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(57)
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(53)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(56)
                grab()
                wait(2)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                back()
                pivotClockwise()
                drop()
                wait(6)
                extendTape()
            }
        }
        )
    }
}
