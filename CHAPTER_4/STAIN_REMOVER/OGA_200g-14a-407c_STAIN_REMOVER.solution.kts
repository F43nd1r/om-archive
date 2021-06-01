
solution {
    puzzle = "P034"
    name = "NEW SOLUTION 1"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 5
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 7
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -4 to 0
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to 0
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, -1 to 1, -2 to 1, -3 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                back()
                drop()
                retract()
                grab()
                extend()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                retract()
                forward()
                forward()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                reset()
            }
        }
        )
    }
}
