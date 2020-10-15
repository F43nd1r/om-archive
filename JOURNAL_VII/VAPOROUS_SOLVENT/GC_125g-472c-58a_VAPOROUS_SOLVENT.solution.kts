
solution {
    puzzle = "P098"
    name = "B GC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -5 to 2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = 9
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 3
        rotation = 6
    }
    glyph(UNBONDER) {
        position = -3 to 2
        rotation = 12
    }
    glyph(DUPLICATION) {
        position = -4 to 2
        rotation = 5
    }
    glyph(PURIFICATION) {
        position = 1 to -1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 11
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 3
        rotation = 15
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(1 to -1, 2 to -1, 3 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(8)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(32)
                rotateCounterClockwise()
                wait(19)
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                wait(10)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
