
solution {
    puzzle = "P034"
    name = "OVERLAP"
    arm(PISTON) {
        number = 1
        position = 5 to -2
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 0 to -2
        rotation = -6
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -7
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -8
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = -5
    }
    glyph(BONDER) {
        position = 4 to -2
        rotation = -4
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = -3
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = -3
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 5 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 0 to -1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -2
        rotation = 0
    }
    track {
        position = 6 to -1
        positions = listOf(-2 to 1, -2 to 0, -1 to -1)
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                back()
                drop()
                back()
                retract()
                grab()
                extend()
                extend()
                drop()
                retract()
                forward()
                grab()
                back()
                forward()
                extend()
                drop()
                retract()
                forward()
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
                back()
                extend()
                grab()
                retract()
                back()
                drop()
                forward()
                retract()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(38)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
