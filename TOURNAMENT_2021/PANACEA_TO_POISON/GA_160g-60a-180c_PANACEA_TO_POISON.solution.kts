
solution {
    puzzle = "w2450511665"
    name = "B S F PANIC"
    arm(ARM1) {
        number = 1
        position = 4 to -3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 2 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 6 to 1
        rotation = -3
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = 2 to -2
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = 2 to 0
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 4 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 6 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -4
        rotation = 2
    }
    track {
        position = 4 to -3
        positions = listOf(-2 to 1, -1 to 0, 0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                drop()
                forward()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
