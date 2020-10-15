
solution {
    puzzle = "P085"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 3 to -2
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 2 to -2
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to 0
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 2 to -2, 3 to -3, 2 to -3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
