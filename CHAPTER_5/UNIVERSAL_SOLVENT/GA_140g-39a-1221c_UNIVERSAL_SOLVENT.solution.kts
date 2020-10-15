
solution {
    puzzle = "P043"
    name = "B GA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 4 to -2
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = 0 to 2
        rotation = -7
    }
    glyph(PURIFICATION) {
        position = 5 to -2
        rotation = -7
    }
    glyph(ANIMISMUS) {
        position = 1 to 0
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 1
        rotation = -6
    }
    io(INPUT) {
        index = 3
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = 5 to -3
        rotation = 0
    }
    track {
        position = 3 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(102)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(40)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(52)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                forward()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                forward()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                forward()
                drop()
                forward()
                reset()
            }
        }
        )
    }
}
