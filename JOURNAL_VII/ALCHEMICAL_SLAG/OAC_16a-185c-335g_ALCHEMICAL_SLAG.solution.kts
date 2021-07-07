
solution {
    puzzle = "P099"
    name = "OVERLAP ACX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 4 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -1
        rotation = -5
        size = 1
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 3 to 0
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to -2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 3 to -2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 2 to 0
        rotation = 3
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = 4
    }
    glyph(PROJECTION) {
        position = 2 to -2
        rotation = 3
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 1 to -1
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 3
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                drop()
                back()
                grab()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(6)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(11)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(16)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(4)
                rotateCounterClockwise()
                wait(10)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(16)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(10)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(10)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(17)
                reset()
            }
        }
        )
    }
}
