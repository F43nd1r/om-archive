
solution {
    puzzle = "P031b"
    name = "OCG"
    arm(ARM1) {
        number = 1
        position = -2 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to -3
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -3 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to -6
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 4
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    track {
        position = -1 to 3
        positions = listOf(0 to 0, 0 to 1, 0 to 2)
    }
    track {
        position = -4 to 2
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0)
    }
    track {
        position = 1 to -3
        positions = listOf(-3 to 1, -3 to 0, -2 to 0, -1 to 0, 0 to 0, 1 to 0, 2 to -1, 3 to -2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                pivotClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
            }
        }
        )
    }
}
