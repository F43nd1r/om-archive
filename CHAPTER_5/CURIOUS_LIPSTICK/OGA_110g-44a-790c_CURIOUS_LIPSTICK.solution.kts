
solution {
    puzzle = "P041"
    name = "OGC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -4 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to -2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to -2
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = -3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(58)
                rotateCounterClockwise()
                wait(27)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(27)
                rotateClockwise()
                wait(4)
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
