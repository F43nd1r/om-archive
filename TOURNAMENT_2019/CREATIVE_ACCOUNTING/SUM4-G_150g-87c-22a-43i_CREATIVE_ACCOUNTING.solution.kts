
solution {
    puzzle = "w1698785633"
    name = "B F 3T"
    arm(ARM1) {
        number = 1
        position = -3 to -1
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 0
        rotation = 5
        size = 1
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to 1
        rotation = 3
    }
    glyph(PROJECTION) {
        position = 1 to -3
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -3 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -2 to -3
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
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
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
