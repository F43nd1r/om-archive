
solution {
    puzzle = "P076"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = 3 to 3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 5
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 1 to 5
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 5 to 3
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    track {
        position = 4 to 3
        positions = listOf(-1 to 0, 0 to 0, 0 to 1)
    }
    conduit {
        id = 100
        position = 2 to 3
        rotation = 0
    }
    conduit {
        id = 100
        position = 0 to 0
        rotation = 0
    }
    conduit {
        id = 101
        position = 8 to 0
        rotation = 0
    }
    conduit {
        id = 101
        position = 1 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                wait(4)
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                wait(1)
                grab()
                drop()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                drop()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                wait(13)
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                wait(1)
                grab()
                drop()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                reset()
            }
        }
        )
    }
}
