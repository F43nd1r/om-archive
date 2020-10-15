
solution {
    puzzle = "P054"
    name = "B GX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -3 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 2
        rotation = 6
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 5
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                back()
                reset()
                wait(1)
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                rotateCounterClockwise()
                wait(15)
                rotateClockwise()
                wait(8)
                rotateClockwise()
                wait(10)
                rotateClockwise()
                wait(3)
                rotateClockwise()
                wait(9)
                reset()
            }
        }
        )
    }
}
