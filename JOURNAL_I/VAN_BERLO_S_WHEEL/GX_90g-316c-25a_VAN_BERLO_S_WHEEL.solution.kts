
solution {
    puzzle = "P054"
    name = "B GC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -3
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = 5
    }
    track {
        position = 2 to -3
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
                wait(9)
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
