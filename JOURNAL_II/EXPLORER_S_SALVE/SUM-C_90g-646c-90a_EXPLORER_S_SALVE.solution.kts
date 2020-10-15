
solution {
    puzzle = "P059"
    name = "B GC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 0 to 5
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 4
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -3 to 3
        rotation = 4
    }
    io(INPUT) {
        index = 2
        position = -2 to 1
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(10)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(94)
                reset()
            }
        }
        )
    }
}
