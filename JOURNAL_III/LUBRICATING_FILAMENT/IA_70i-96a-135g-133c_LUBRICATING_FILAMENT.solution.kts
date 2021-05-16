
solution {
    puzzle = "P065"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = -5 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -7 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -7 to 2
        rotation = 5
        size = 3
    }
    glyph(BONDER) {
        position = -6 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -7 to 0
        rotation = 0
    }
    track {
        position = -7 to 2
        positions = listOf(1 to 1, 0 to 1, 0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                pivotClockwise()
                forward()
                forward()
                reset()
                wait(5)
                grab()
                pivotClockwise()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
