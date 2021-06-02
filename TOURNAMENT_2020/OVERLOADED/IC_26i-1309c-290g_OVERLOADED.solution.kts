
solution {
    puzzle = "w2501728107"
    name = "B ICX 1-24T"
    arm(ARM1) {
        number = 1
        position = -8 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -5 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 2 to 1
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -2 to -1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = -6 to -3
        rotation = -5
    }
    glyph(PURIFICATION) {
        position = -5 to 1
        rotation = -4
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = -21
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -2
        rotation = 1
    }
    track {
        position = -8 to 3
        positions = listOf(0 to 0, 0 to -1, 1 to -2, 0 to -2, -1 to -1, -1 to 0)
    }
    track {
        position = -3 to -1
        positions = listOf(-2 to 0, -1 to 0, -1 to -1, 0 to -2, -1 to -2, -2 to -1)
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, -1 to 1)
    }
    conduit {
        id = 100
        position = -6 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = -7 to 2
        rotation = 0
    }
    conduit {
        id = 101
        position = 4 to 2
        rotation = 0
    }
    conduit {
        id = 101
        position = 1 to 2
        rotation = 2
    }
    conduit {
        id = 102
        position = -6 to 3
        rotation = -1
    }
    conduit {
        id = 102
        position = 0 to -1
        rotation = -36
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateCounterClockwise()
                wait(2)
                retract()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                back()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(10)
                grab()
                forward()
                drop()
                back()
                back()
            }
        }
        , 
        {
            sequence(1) {
                wait(7)
                grab()
                forward()
                drop()
                back()
                back()
            }
        }
        )
    }
}
