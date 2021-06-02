
solution {
    puzzle = "w2501728107"
    name = "B IG 1-24T"
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
        position = -1 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -1
        rotation = -6
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -2 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = -2
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
        rotation = -23
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -2
        rotation = -3
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
        position = 0 to -1
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
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
        position = -3 to 2
        rotation = 1
    }
    conduit {
        id = 102
        position = -6 to 3
        rotation = -1
    }
    conduit {
        id = 102
        position = -3 to 0
        rotation = -41
    }
    tape {
        parallel(
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
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                wait(2)
                forward()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                wait(3)
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
